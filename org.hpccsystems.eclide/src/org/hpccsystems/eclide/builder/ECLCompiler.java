/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */
package org.hpccsystems.eclide.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.preferences.PreferenceConstants;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;

public class ECLCompiler {

	private static final String MARKER_TYPE = "org.hpccsystems.eclide.eclProblem";

	IProject project;
	String compilerPath;
	String libraryPath;
	IPath projectPath;
	IPath workingPath;
	IPath rootFolder;	
	
	boolean executeRemotely;
	String serverIP;
	String serverCluster;

	MessageConsole console;
	MessageConsoleStream consoleOut;
	
	HtmlViewer htmlViewer;
	
	public String wuid;
	public Set<IFile> ancestors;
	boolean hasError;

	interface IProcessOutput {
		void ProcessOut(BufferedReader outReader);
		void ProcessErr(IFile file, BufferedReader errReader);
	}

	class CmdProcess {
		private IProcessOutput handler;
		
		CmdProcess(IProcessOutput handler) {
			this.handler = handler;
		}
		
		void exec(String command) {
			Map<String, String> args = new TreeMap<String, String>();
			exec(command, args, null, false);
		}
		
		void exec(String command, Map<String, String> args, final IFile target, boolean eclplusArgs) {
			List<String> argList = new Vector<String>();
			consoleOut.print(command);
			argList.add(command);
			for(Map.Entry<String, String> entry : args.entrySet()) {
				String arg;
				if (eclplusArgs)
					arg = entry.getKey() + "=" + entry.getValue();
				else 
					arg = "-" + entry.getKey() + entry.getValue();
				consoleOut.print(" " + arg);
				argList.add(arg);
			}
			if (target != null) {
				consoleOut.print(" " + "..\\" + target.getProjectRelativePath().toOSString());
				argList.add("..\\" + target.getProjectRelativePath().toOSString());
			}
			consoleOut.println();

			try {
				ProcessBuilder pb = new ProcessBuilder(argList);
				Map<String, String> env = pb.environment();
				//env.put("VAR1", "myValue");
				//env.remove("OTHERVAR");
				//env.put("VAR2", env.get("VAR1") + "suffix");
				pb.directory(workingPath.toFile());
				Process p = pb.start();
				//Process p = Runtime.getRuntime().exec(command);

				final BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
				final BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
				
				Runnable readStdIn = new Runnable() {
					public void run() {
						handler.ProcessOut(stdInput);
					}
				};
				Thread threadStdIn = new Thread(readStdIn, "read stdin");
				threadStdIn.start();

				Runnable readStdErr = new Runnable() {
					public void run() {
						handler.ProcessErr(target, stdError);
					}
				};
				Thread threadStdErr = new Thread(readStdErr, "read stderr");
				threadStdErr.start();

				threadStdIn.join();
				threadStdErr.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	};
	
	class SyntaxHandler implements IProcessOutput {
		IFile file;

		public SyntaxHandler(IFile file) {
			this.file = file;
		}

		@Override
		public void ProcessOut(BufferedReader reader) {
			String stdIn = null;
			if (true) {
				ECLArchiveParser parser = new ECLArchiveParser(file, reader);
				assert(parser != null);
				ancestors = parser.ancestors;
			} else {
				try {
					while ((stdIn = reader.readLine()) != null) {
						consoleOut.print("Out: ");
						consoleOut.println(stdIn);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		@Override
		public void ProcessErr(IFile file, BufferedReader errReader) {
			String stdErr = null;
			try {
				while ((stdErr = errReader.readLine()) != null) {
					consoleOut.print("Err: ");
					consoleOut.println(stdErr);
					String[] parts = stdErr.split(":\\p{Blank}");
					if (parts.length >= 3) {
						String filePathAndLoc = parts[0];
						String code = parts[1];
						String message = parts[2];
						String[] fileParts = filePathAndLoc.split("[\\(,\\)]");
						if (fileParts.length >= 3) {
							String errorPath = fileParts[0];
							String line = fileParts[1];
							String col = fileParts[2];

							int lineNumber = 0;
							try {
								lineNumber = Integer.parseInt(line);
							} catch (NumberFormatException e) {
							}
							int colNumber = 0;
							try {
								colNumber = Integer.parseInt(col);
							} catch (NumberFormatException e) {
							}

							IResource resolvedFile = null;
							if (file != null && file.getName().equalsIgnoreCase(errorPath)) {	//  Error is in the actual file being syntax checked.
								resolvedFile = file;
							} else { 
								resolvedFile = project.findMember(errorPath);
							}
							addMarker(resolvedFile, code, message, lineNumber, colNumber, true);
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		void addMarker(IResource resolvedFile, String code, String message, int lineNumber, int colNumber, boolean oneErrorOnly)
		{
			if (resolvedFile != null)
			{
				if (lineNumber <= 0) {
					lineNumber = 1;
				}
				if (colNumber <= 0) {
					colNumber = 1;
				}
				int severity = IMarker.SEVERITY_INFO;
				if (code.startsWith("error")) {
					hasError = true;
					severity = IMarker.SEVERITY_ERROR;
				}
				else if (code.startsWith("warning"))
					severity = IMarker.SEVERITY_WARNING;

				if (resolvedFile.exists()) {
					try {
						IMarker[] markers = resolvedFile.findMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
						for (int i = 0; i < markers.length; ++i) {
							if (oneErrorOnly && markers[i].getAttribute(IMarker.SEVERITY).equals(IMarker.SEVERITY_ERROR))
								return;
							
							if (markers[i].getAttribute(IMarker.SEVERITY).equals(severity) && 
									markers[i].getAttribute(IMarker.MESSAGE).equals(message) && 
									markers[i].getAttribute(IMarker.LINE_NUMBER).equals(lineNumber)) {
								return;
							}
						}
			
						IMarker marker = resolvedFile.createMarker(MARKER_TYPE);
						marker.setAttribute(IMarker.SEVERITY, severity);
						marker.setAttribute(IMarker.MESSAGE, message);
						marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
						//marker.setAttribute(IMarker.CHAR_START, colNumber);
						//marker.setAttribute(IMarker.CHAR_END, colNumber);

					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
	
	}
	
	class EclPlusHandler extends SyntaxHandler {
		EclPlusHandler(IFile file) {
			super(file);
		}
		
		@Override
		public void ProcessOut(BufferedReader reader) {
			String stdIn = null;
			try {
				while ((stdIn = reader.readLine()) != null) {
					consoleOut.print("Out: ");
					consoleOut.println(stdIn);
					int lastSpace = stdIn.lastIndexOf(' ');
					if (lastSpace != -1)
						wuid = stdIn.substring(lastSpace + 1, stdIn.length());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public ECLCompiler(IProject project) {
		this.project = project;
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		compilerPath = store.getString(PreferenceConstants.P_TOOLSPATH) + "eclcc.exe";
		libraryPath = store.getString(PreferenceConstants.P_TOOLSPATH) + "plugins";
		projectPath = project.getLocation();
		workingPath = projectPath.append("tmp");
		if (!workingPath.toFile().exists())
			workingPath.toFile().mkdir();
		rootFolder = project.getWorkspace().getRoot().getFullPath();
		rootFolder = project.getWorkspace().getRoot().getFullPath();
		
		executeRemotely = store.getBoolean(PreferenceConstants.P_REMOTEEXECUTE);
		serverIP = store.getString(PreferenceConstants.P_SERVERIP);
		serverCluster = store.getString(PreferenceConstants.P_SERVERCLUSTER);
		
		console = findConsole("eclcc");
		consoleOut = console.newMessageStream();

		htmlViewer = findHtmlViewer();
}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}

	private HtmlViewer findHtmlViewer() {
		return HtmlViewer.getDefault();
	}
	
	public void checkSyntax(IFile file) {
		deleteMarkers(file);
		
		Map<String, String> args = new TreeMap<String, String>();
		args.put("f", "syntaxcheck=1");
		//args.put("L", libraryPath);
		//args.put("P", workingPath.toOSString());
		args.put("E", "");
		
		CmdProcess process = new CmdProcess(new SyntaxHandler(file));
		process.exec(compilerPath, args, file, false);
	}

	public void buildAndRun(IFile file) {
		if (executeRemotely)
			buildAndRunRemote(file);
		else
			buildAndRunLocal(file);
	}

	protected void buildAndRunRemote(IFile file) {
		deleteMarkers(file);

		IPath xmlPath = file.getLocation().removeFileExtension();
		xmlPath = xmlPath.addFileExtension("xml");
		
		Map<String, String> args = new TreeMap<String, String>();
		//args.put("L", libraryPath);
		//args.put("I", projectPath);
		args.put("E", "");
		args.put("o", xmlPath.toOSString());
		
		hasError = false;
		CmdProcess process = new CmdProcess(new EclPlusHandler(file));
		process.exec(compilerPath, args, file, false);
		if (!hasError) {
			args.clear();
			//eclplus action=query server=192.168.241.131 cluster=thor @test.xml			
			args.put("action", "query");
			args.put("server", serverIP);
			args.put("cluster", serverCluster);
			args.put("timeout", "0");
			//TODO process.exec("eclplus", args, "@" + xmlPath.toOSString(), true);
			if (!wuid.isEmpty())
				htmlViewer.showWuid(wuid);
		}
	}
	
	protected void buildAndRunLocal(IFile file) {
		deleteMarkers(file);

		IPath exePath = workingPath.append("a.out.exe");
		
		Map<String, String> args = new TreeMap<String, String>();
		//args.put("L", libraryPath);
		//args.put("I", projectPath);
		//args.put("P", workingPath.toOSString());
		
		hasError = false;
		CmdProcess process = new CmdProcess(new SyntaxHandler(file));
		process.exec(compilerPath, args, file, false);
		if (!hasError)
			process.exec(exePath.toOSString());
	}

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}
}
