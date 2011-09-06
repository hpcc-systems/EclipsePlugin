package org.hpccsystems.eclide.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

public class ECLCompiler {

	private static final String MARKER_TYPE = "org.hpccsystems.eclide.eclProblem";

	IProject project;
	String compilerPath;
	String libraryPath;
	String projectPath;

	MessageConsole console;
	MessageConsoleStream consoleOut;
	
	public ECLCompiler(IProject project) {
		this.project = project;
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		compilerPath = store.getString(PreferenceConstants.P_COMPILERPATH);
		libraryPath = store.getString(PreferenceConstants.P_LIBRARYPATH);
		projectPath = project.getLocation().toOSString();
		
		console = findConsole("eclcc");
		consoleOut = console.newMessageStream();
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

	public void CheckSyntax(IFile file) {
		deleteMarkers(file);

		String command = compilerPath;
		command += " -f\"syntaxcheck=1\"";
		command += " -L\"" + libraryPath + "\"";
		command += " -I\"" + projectPath + "\"";
		command += " \"" + file.getLocation().toOSString() + "\"";

		consoleOut.println(command);

		try {
			Process p = Runtime.getRuntime().exec(command);

			final BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			final BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

			Runnable readStdIn = new Runnable() {
				public void run() {
					String out = null;
					try {
						while ((out = stdInput.readLine()) != null) {
							ProcessOutline(out);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			Thread threadStdIn = new Thread(readStdIn, "read stdin");
			threadStdIn.start();

			Runnable readStdErr = new Runnable() {
				public void run() {
					String err = null;
					try {
						while ((err = stdError.readLine()) != null) {
							ProcessErrline(err);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
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

	public void BuildAndRun(IFile file) {
		deleteMarkers(file);

		IPath exePath = file.getLocation().removeFileExtension();
		exePath = exePath.addFileExtension("exe");
		String command = compilerPath;
		//command += " -o\"" + exePath.toOSString() + "\"";
		command += " -L\"" + libraryPath + "\"";
		command += " -I\"" + projectPath + "\"";
		command += " \"" + file.getLocation().toOSString() + "\"";

		try {
			Process p = Runtime.getRuntime().exec(command);

			BufferedReader stdInput = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(
					p.getErrorStream()));

			// read the output from the command
			String out = null;
			while ((out = stdInput.readLine()) != null) {
				ProcessOutline(out);
			}

			// read any errors from the attempted command
			String err = null;
			while ((err = stdError.readLine()) != null) {
				ProcessErrline(err);
			}

			p = Runtime.getRuntime().exec("a.out.exe");
			stdInput = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			stdError = new BufferedReader(new InputStreamReader(
					p.getErrorStream()));

			// read the output from the command
			while ((out = stdInput.readLine()) != null) {
				ProcessOutline(out);
			}

			// read any errors from the attempted command
			while ((err = stdError.readLine()) != null) {
				ProcessErrline(err);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	void ProcessOutline(String outLine)
	{
		consoleOut.print("Out: ");
		consoleOut.println(outLine);
	}

	void ProcessErrline(String errLine)
	{
		consoleOut.print("Err: ");
		consoleOut.println(errLine);
		String[] parts = errLine.split(":\\p{Blank}");
		if (parts.length >= 3) {
			String filePathAndLoc = parts[0];
			String code = parts[1];
			String message = parts[2];
			String[] fileParts = filePathAndLoc.split("[\\(,\\)]");
			if (fileParts.length >= 3) {
				String filePath = fileParts[0];
				String line = fileParts[1];
				String col = fileParts[2];

				int lineNumber = Integer.parseInt(line);
				int colNumber = Integer.parseInt(col);

				AddMarker(filePath, code, message, lineNumber, colNumber);
			}
		}
	}

	void AddMarker(String filePath, String code, String message, int lineNumber, int colNumber)
	{
		IFile resolvedFile = project.getFile(filePath);
		if (resolvedFile != null)
		{
			if (lineNumber <= 0) {
				lineNumber = 1;
			}
			int severity = IMarker.SEVERITY_INFO;
			if (code.startsWith("error"))
				severity = IMarker.SEVERITY_ERROR;
			else if (code.startsWith("warning"))
				severity = IMarker.SEVERITY_WARNING;

			try {
				if (resolvedFile.exists()) {
					IMarker[] markers = resolvedFile.findMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
					for (int i = 0; i < markers.length; ++i) {
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
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}	

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}
}
