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
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.preferences.ECLPreferenceConstants;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;
import org.hpccsystems.internal.CmdArgs;
import org.hpccsystems.internal.CmdProcess;
import org.hpccsystems.internal.ECLArchiveParser;
import org.hpccsystems.internal.EclCCParser;
import org.hpccsystems.internal.OS;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.CmdProcess.IProcessOutput;

public class ECLCompiler {

	final static String noCompiler = "Error:  Unable to locate eclcc.";
	IProject project;
	IProject[] referencedProjects;
	
	IPath binPath;
	File eclccFile;
	File eclplusFile;
	String libraryPath;
	IPath projectPath;
	IPath workingPath;
	IPath rootFolder;	

	String argsCommon;
	String argsSyntaxCheck;
	String argsCompile;
	String argsCompileRemote;

	String argsWULocal;

	boolean monitorDependees = false;
	boolean supressSubsequentErrors = false;
	
	boolean executeRemotely = false;
	String serverIP;
	String serverCluster;

	MessageConsole eclccConsole;
	MessageConsoleStream eclccConsoleWriter;

	MessageConsole resultsConsole;
	MessageConsoleStream resultsConsoleWriter;

	HtmlViewer htmlViewer;

	public String wuid;
	public Set<IFile> ancestors;
	boolean hasError;

	String QUOTE = "";

	class SyntaxHandler implements IProcessOutput {
		IFile file;

		public SyntaxHandler(IFile file) {
			QUOTE = OS.isWindowsPlatform() ? "\"" : "";
			this.file = file;
		}

		@Override
		public void ProcessOut(BufferedReader reader) {
			ancestors = new HashSet<IFile>();
			if (monitorDependees) {
				ECLArchiveParser parser = new ECLArchiveParser(file, reader);
				assert(parser != null);
				ancestors = parser.ancestors;
			}
		}

		@Override
		public void ProcessErr(IFile file, BufferedReader errReader) {
			String stdErr = null;
			try {
				while ((stdErr = errReader.readLine()) != null) {
					eclccConsoleWriter.print("Err: ");
					eclccConsoleWriter.println(stdErr);
					EclCCParser parser = new EclCCParser();
					if (parser.ParseError(stdErr)) {
						IResource resolvedFile = null;
						//parser.errorPath
						resolvedFile = Eclipse.getWorkspaceRoot().getFileForLocation(parser.errorPath);
/*						if (file != null && parser.errorPath.equals(file.getFullPath())) {	//  Error is in the actual file being syntax checked.
							resolvedFile = file;
						} else { 
							resolvedFile = project.findMember(parser.errorPath);
						}
*/
						Eclipse.addMarker(resolvedFile, parser.severity, parser.code, parser.message, parser.lineNumber, parser.colNumber, supressSubsequentErrors);
					}
					hasError = parser.hasError;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	class LocalRunHandler extends SyntaxHandler {
		LocalRunHandler(IFile file) {
			super(file);
		}

		@Override
		public void ProcessOut(BufferedReader reader) {
			String stdIn = null;
			try {
				while ((stdIn = reader.readLine()) != null) {
					resultsConsoleWriter.println(stdIn);
				}
			} catch (IOException e) {
				e.printStackTrace();
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
					eclccConsoleWriter.print("Out: ");
					eclccConsoleWriter.println(stdIn);
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
		try {
			referencedProjects = project.getReferencedProjects();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		binPath = new Path(store.getString(ECLPreferenceConstants.P_TOOLSPATH));
		eclccFile = binPath.append("eclcc").toFile();
		eclplusFile = binPath.append("eclplus").toFile();
		
		libraryPath = store.getString(ECLPreferenceConstants.P_TOOLSPATH) + "plugins";
		projectPath = project.getLocation();
		workingPath = project.getWorkingLocation(Activator.PLUGIN_ID);
		//workingPath = projectPath.append("tmp");
		//if (!workingPath.toFile().exists())
		//	workingPath.toFile().mkdir();
		rootFolder = project.getWorkspace().getRoot().getFullPath();
		rootFolder = project.getWorkspace().getRoot().getFullPath();
		
		argsCommon = store.getString(ECLPreferenceConstants.P_ARGSCOMMON);
		argsSyntaxCheck = store.getString(ECLPreferenceConstants.P_ARGSSYNTAX);
		argsCompile = store.getString(ECLPreferenceConstants.P_ARGSCOMPILE);
		argsCompileRemote = store.getString(ECLPreferenceConstants.P_ARGSCOMPILEREMOTE);

		argsWULocal = store.getString(ECLPreferenceConstants.P_ARGSWULOCAL);

		monitorDependees = store.getBoolean(ECLPreferenceConstants.P_MONITORDEPENDEES);
		supressSubsequentErrors = store.getBoolean(ECLPreferenceConstants.P_SUPRESSSECONDERROR);
		
//		executeRemotely = store.getBoolean(ECLPreferenceConstants.P_REMOTEEXECUTE);
//		serverIP = store.getString(ECLPreferenceConstants.P_SERVERIP);
//		serverCluster = store.getString(ECLPreferenceConstants.P_SERVERCLUSTER);

		resultsConsole = Eclipse.findConsole("Results");
		resultsConsoleWriter = resultsConsole.newMessageStream();
		resultsConsoleWriter.setActivateOnWrite(true);

		eclccConsole = Eclipse.findConsole("eclcc");
		eclccConsoleWriter = eclccConsole.newMessageStream();
		//eclccConsoleWriter.setActivateOnWrite(true);
		
		htmlViewer = Eclipse.findHtmlViewer();
		assert(htmlViewer != null);
	}
	
	boolean HasCompiler() {
		return true;  //TODO:  compilerFile.canExecute();
	}
	
	void GetIncludeArgs(CmdArgs cmdArgs) {
		for (int i = 0; i < referencedProjects.length; ++i) {
			cmdArgs.Append("I",  referencedProjects[i].getLocation().toOSString());
		}
	}
	
	public void checkSyntax(IFile file) {
		Eclipse.deleteMarkers(file);
		
		if (!HasCompiler()) {
			eclccConsoleWriter.println(noCompiler);
			return;
		}

		CmdArgs cmdArgs = new CmdArgs(eclccFile.getPath(), argsSyntaxCheck);
		GetIncludeArgs(cmdArgs);

		if (monitorDependees)
			cmdArgs.Append("E");

		CmdProcess process = new CmdProcess(workingPath, binPath, new SyntaxHandler(file), eclccConsoleWriter);
		process.exec(cmdArgs, file, false);
	}

//	public void buildAndRun(IFile file) {
//		if (executeRemotely)
//			buildAndRunRemote(file);
//		else
//			buildAndRunLocal(file);
//	}
//
	public void buildAndRunRemote(IFile file, String ip, String cluster, String user, String password) {
		Eclipse.deleteMarkers(file);
		
		if (!HasCompiler()) {
			eclccConsoleWriter.println(noCompiler);
			return;
		}

		CmdArgs cmdArgs = new CmdArgs(eclccFile.getPath(), argsCompileRemote);
		GetIncludeArgs(cmdArgs);

		IPath xmlPath = file.getLocation().removeFileExtension();
		xmlPath = xmlPath.addFileExtension("xml");
		cmdArgs.Append("o", QUOTE + xmlPath.toOSString() + QUOTE);

		hasError = false;
		CmdProcess process = new CmdProcess(workingPath, binPath, new EclPlusHandler(file), eclccConsoleWriter);
		process.exec(cmdArgs, file, false);
		if (!hasError) {
			CmdArgs remoteArgs = new CmdArgs(eclplusFile.getPath(), "");
			GetIncludeArgs(cmdArgs);
//			args.clear();
			//eclplus action=query server=192.168.241.131 cluster=thor @test.xml			
			remoteArgs.Append("action", "query");
			remoteArgs.Append("server", ip);
			remoteArgs.Append("cluster", cluster);
			if (!user.isEmpty())
				remoteArgs.Append("owner", user);
			if (!password.isEmpty())
				remoteArgs.Append("password", password);
			remoteArgs.Append("timeout", "0");
			remoteArgs.Append(QUOTE + "@" + xmlPath.toOSString() + QUOTE);
			wuid = "";
			process.exec(remoteArgs, null, true);
//			args.put("action", "query");
//			args.put("server", serverIP);
//			args.put("cluster", serverCluster);
//			args.put("timeout", "0");
			//TODO process.exec("eclplus", args, "@" + xmlPath.toOSString(), true);
			if (!wuid.isEmpty()) {
				
				htmlViewer.showWuid(ip, wuid, user, password);
				Display.getDefault().asyncExec(new Runnable() {   
					public void run() {
						htmlViewer.getSite().getPage().activate(htmlViewer);
					}
				});
			}
		}
	}

	public void buildAndRunLocal(IFile file) {
		Eclipse.deleteMarkers(file);

		if (!HasCompiler()) {
			eclccConsoleWriter.println(noCompiler);
			return;
		}

		CmdArgs cmdArgs = new CmdArgs(eclccFile.getPath(), argsCompile);
		GetIncludeArgs(cmdArgs);

		hasError = false;
		CmdProcess process = new CmdProcess(workingPath, binPath, new LocalRunHandler(file), eclccConsoleWriter);
		process.exec(cmdArgs, file, false);
		if (!hasError) {
			resultsConsole.clearConsole();
			IPath exePath = workingPath.append("a.out");
			process.exec(exePath.toOSString(), argsWULocal);
		}
	}

	public void buildAndRun(IFile file, String ip, String cluster, String user, String password) {
		if (ip.isEmpty()) {
			buildAndRunLocal(file);
		}
		else {
			buildAndRunRemote(file, ip, cluster, user, password);
		}
	}
}
