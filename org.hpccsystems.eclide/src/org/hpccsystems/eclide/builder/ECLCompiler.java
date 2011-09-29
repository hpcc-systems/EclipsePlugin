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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.preferences.ECLPreferenceConstants;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;
import org.hpccsystems.internal.CmdProcess;
import org.hpccsystems.internal.EclCCParser;
import org.hpccsystems.internal.Workspace;
import org.hpccsystems.internal.CmdProcess.IProcessOutput;

public class ECLCompiler {

	IProject project;
	String compilerPath;
	String libraryPath;
	IPath projectPath;
	IPath workingPath;
	IPath rootFolder;	

	String argsCommon;
	String argsSyntaxCheck;
	String argsCompile;
	String argsCompileRemote;

	boolean monitorDependees = false;
	boolean supressSubsequentErrors = false;
	
	boolean executeRemotely = false;
	String serverIP;
	String serverCluster;

	MessageConsole console;
	MessageConsoleStream consoleOut;

	HtmlViewer htmlViewer;

	public String wuid;
	public Set<IFile> ancestors;
	boolean hasError;

	class SyntaxHandler implements IProcessOutput {
		IFile file;

		public SyntaxHandler(IFile file) {
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
					consoleOut.print("Err: ");
					consoleOut.println(stdErr);
					EclCCParser parser = new EclCCParser();
					if (parser.ParseError(stdErr)) {
						IResource resolvedFile = null;
						if (file != null && file.getName().equalsIgnoreCase(parser.errorPath)) {	//  Error is in the actual file being syntax checked.
							resolvedFile = file;
						} else { 
							resolvedFile = project.findMember(parser.errorPath);
						}

						Workspace.addMarker(resolvedFile, parser.severity, parser.code, parser.message, parser.lineNumber, parser.colNumber, supressSubsequentErrors);
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
					consoleOut.print("Out: ");
					consoleOut.println(stdIn);
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
		compilerPath = store.getString(ECLPreferenceConstants.P_TOOLSPATH) + "eclcc";
		libraryPath = store.getString(ECLPreferenceConstants.P_TOOLSPATH) + "plugins";
		projectPath = project.getLocation();
		workingPath = projectPath.append("tmp");
		if (!workingPath.toFile().exists())
			workingPath.toFile().mkdir();
		rootFolder = project.getWorkspace().getRoot().getFullPath();
		rootFolder = project.getWorkspace().getRoot().getFullPath();

		argsCommon = store.getString(ECLPreferenceConstants.P_ARGSCOMMON);
		argsSyntaxCheck = store.getString(ECLPreferenceConstants.P_ARGSSYNTAX);
		argsCompile = store.getString(ECLPreferenceConstants.P_ARGSCOMPILE);
		argsCompileRemote = store.getString(ECLPreferenceConstants.P_ARGSCOMPILEREMOTE);

		monitorDependees = store.getBoolean(ECLPreferenceConstants.P_MONITORDEPENDEES);
		supressSubsequentErrors = store.getBoolean(ECLPreferenceConstants.P_SUPRESSSECONDERROR);
		
//		executeRemotely = store.getBoolean(ECLPreferenceConstants.P_REMOTEEXECUTE);
//		serverIP = store.getString(ECLPreferenceConstants.P_SERVERIP);
//		serverCluster = store.getString(ECLPreferenceConstants.P_SERVERCLUSTER);

		console = Workspace.FindConsole("eclcc");
		consoleOut = console.newMessageStream();

		htmlViewer = Workspace.FindHtmlViewer();
	}

	public void checkSyntax(IFile file) {
		Workspace.deleteMarkers(file);

		Map<String, String> args = new TreeMap<String, String>();
		if (monitorDependees)
			args.put("E", "");

		CmdProcess process = new CmdProcess(workingPath, new SyntaxHandler(file), consoleOut);
		process.exec(compilerPath, argsSyntaxCheck, args, file, false);
	}

	public void buildAndRun(IFile file) {
		if (executeRemotely)
			buildAndRunRemote(file);
		else
			buildAndRunLocal(file);
	}

	protected void buildAndRunRemote(IFile file) {
		Workspace.deleteMarkers(file);

		IPath xmlPath = file.getLocation().removeFileExtension();
		xmlPath = xmlPath.addFileExtension("xml");

		Map<String, String> args = new TreeMap<String, String>();
		args.put("o", xmlPath.toOSString());

		hasError = false;
		CmdProcess process = new CmdProcess(workingPath, new EclPlusHandler(file), consoleOut);
		process.exec(compilerPath, argsCompileRemote, args, file, false);
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
		Workspace.deleteMarkers(file);

		IPath exePath = workingPath.append("a.out");

		Map<String, String> args = new TreeMap<String, String>();

		hasError = false;
		CmdProcess process = new CmdProcess(workingPath, new LocalRunHandler(file), consoleOut);
		process.exec(compilerPath, argsCompile, args, file, false);
		if (!hasError)
			process.exec(exePath.toOSString(), "");
	}
}
