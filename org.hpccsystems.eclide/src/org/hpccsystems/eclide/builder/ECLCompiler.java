/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.eclide.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.CmdArgs;
import org.hpccsystems.internal.CmdProcess;
import org.hpccsystems.internal.CmdProcess.IProcessOutput;
import org.hpccsystems.internal.ConfigurationPreferenceStore;
import org.hpccsystems.internal.ECLArchiveParser;
import org.hpccsystems.internal.EclCCError;
import org.hpccsystems.internal.EclCCErrorParser;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.OS;
import org.hpccsystems.internal.data.ClientTools;

public class ECLCompiler {
	final static String noCompiler = "Error:  Unable to locate eclcc.";
	final static String badConfigurationCode = "1004";
	final static String badConfiguration = "Error:  Invalid compiler configuration (eclcc)";

	IProject project;
	IProject[] referencedProjects;
	
	String version = null;
	
	ConfigurationPreferenceStore launchConfiguration;
	IPath binPath;
	File eclccFile;
	File eclplusFile;
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
	boolean enableMetaProcessing = true;
	
	boolean executeRemotely = false;
	String serverIP;
	String serverCluster;

	MessageConsole eclccConsole;
	MessageConsoleStream eclccConsoleWriter;

	MessageConsole resultsConsole;
	MessageConsoleStream resultsConsoleWriter;

	public String wuid;
	public Set<IFile> ancestors;
	boolean hasError;	//TODO Has Error notification is all wrong.

	String QUOTE = "";
	
	class BasicHandler implements IProcessOutput {
		protected StringBuilder sbOut;
		protected StringBuilder sbErr;
		
		BasicHandler() {
			sbOut = new StringBuilder();
			sbErr = new StringBuilder();
		}

		@Override
		public void ProcessOut(BufferedReader reader) {
			final char[] buffer = new char[0x10000]; 
			try {
				int read; 
				do { 
					read = reader.read(buffer, 0, buffer.length);
					if (read>0) { 
						sbOut.append(buffer, 0, read); 
					} 
				} while (read>=0); 
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

		@Override
		public void ProcessErr(BufferedReader reader) {
			String strLine = null;
			try {
				while ((strLine = reader.readLine()) != null) {
					sbErr.append(strLine);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	class SyntaxHandler extends BasicHandler {
		EclCCErrorParser errorParser;		

		public SyntaxHandler() {
			super();
		}

		@Override
		public void ProcessErr(BufferedReader errReader) {
			errorParser = new EclCCErrorParser(errReader, eclccConsoleWriter);
			hasError = errorParser.errorCount > 0;
			for(EclCCError e : errorParser.items) {
				IResource resolvedFile = Eclipse.getWorkspaceRoot().getFileForLocation(e.errorPath);
				if (resolvedFile != null) {
					Eclipse.addMarker(resolvedFile, e.severity, e.code, e.message, e.lineNumber, e.colNumber, supressSubsequentErrors);
				}
			}
		}
	}

	class ECLArchiveHandler extends SyntaxHandler {

		public ECLArchiveHandler() {
			super();
		}
		
		Set<IFile> getAncestors(IFile file) {
			ECLArchiveParser parser = new ECLArchiveParser(file, sbOut.toString());
			assert(parser != null);
			return parser.ancestors;
		}
		
		@Override
		public void ProcessOut(BufferedReader reader) {
			super.ProcessOut(reader);
		}
	}

	class LocalRunHandler extends ECLArchiveHandler {
		LocalRunHandler() {
			super();
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

	class EclPlusHandler extends ECLArchiveHandler {
		EclPlusHandler() {
			super();
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

	public ECLCompiler(ConfigurationPreferenceStore launchConfiguration) {
		this.launchConfiguration = launchConfiguration;
		QUOTE = OS.isWindowsPlatform() ? "\"" : "";
		binPath = new Path(launchConfiguration.getAttribute(ClientTools.P_TOOLSPATH, ClientTools.P_TOOLSPATH_DEFAULT));
		eclccFile = binPath.append("eclcc").toFile();
		eclplusFile = binPath.append("eclplus").toFile();
		
		argsCommon = launchConfiguration.getAttribute(ClientTools.P_ARGSCOMMON, ClientTools.P_ARGSCOMMON_DEFAULT);
		argsSyntaxCheck = launchConfiguration.getAttribute(ClientTools.P_ARGSSYNTAX, ClientTools.P_ARGSSYNTAX_DEFAULT);
		argsCompile = launchConfiguration.getAttribute(ClientTools.P_ARGSCOMPILE, ClientTools.P_ARGSCOMPILE_DEFAULT);
		argsCompileRemote = launchConfiguration.getAttribute(ClientTools.P_ARGSCOMPILEREMOTE, ClientTools.P_ARGSCOMPILEREMOTE_DEFAULT);
		int inlineResultLimit = launchConfiguration.getAttribute(ClientTools.P_INLINERESULTLIMIT, ClientTools.P_INLINERESULTLIMIT_DEFAULT);
		if (inlineResultLimit > 0) {
			argsCompile += " -fapplyInstantEclTransformations=1 -fapplyInstantEclTransformationsLimit=" + inlineResultLimit;
			argsCompileRemote += " -fapplyInstantEclTransformations=1 -fapplyInstantEclTransformationsLimit=" + inlineResultLimit;
		}

		argsWULocal = launchConfiguration.getAttribute(ClientTools.P_ARGSWULOCAL, ClientTools.P_ARGSWULOCAL_DEFAULT);

		monitorDependees = launchConfiguration.getAttribute(ClientTools.P_MONITORDEPENDEES, ClientTools.P_MONITORDEPENDEES_DEFAULT);
		supressSubsequentErrors = launchConfiguration.getAttribute(ClientTools.P_SUPRESSSECONDERROR, ClientTools.P_SUPRESSSECONDERROR_DEFAULT);
		enableMetaProcessing = launchConfiguration.getAttribute(ClientTools.P_ENABLEMETAPROCESSING, ClientTools.P_ENABLEMETAPROCESSING_DEFAULT);

		resultsConsole = Eclipse.findConsole("Results");
		resultsConsoleWriter = resultsConsole.newMessageStream();
		resultsConsoleWriter.setActivateOnWrite(true);

		eclccConsole = Eclipse.findConsole("eclcc");
		eclccConsoleWriter = eclccConsole.newMessageStream();
		//eclccConsoleWriter.setActivateOnWrite(true);
	}
	
	public ECLCompiler(ConfigurationPreferenceStore launchConfiguration, IProject project) {
		this(launchConfiguration);
		
		this.project = project;
		try {
			referencedProjects = project.getReferencedProjects();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		projectPath = project.getLocation();
		workingPath = project.getWorkingLocation(Activator.PLUGIN_ID);

		rootFolder = project.getWorkspace().getRoot().getFullPath();
	}
	
	boolean HasCompiler() {
		return !getVersion().isEmpty();
	}
	
	void GetIncludeArgs(CmdArgs cmdArgs) {
		cmdArgs.Append("I",  projectPath.toOSString());
		for (int i = 0; i < referencedProjects.length; ++i) {
			cmdArgs.Append("I",  referencedProjects[i].getLocation().toOSString());
		}
	}
	
	public String getVersion() {
		if (version == null) {
			version = new String();
			CmdArgs cmdArgs = new CmdArgs(eclccFile.getPath(), "--version", "");
			BasicHandler handler = new BasicHandler();
			CmdProcess process = new CmdProcess(workingPath, binPath, handler, eclccConsoleWriter);
			process.exec(cmdArgs);
			version = handler.sbOut.toString();
			version = version.replaceAll("\r", "");
			version = version.replaceAll("\n", "");
		}
		return version;
	}
	
	public String getBuildVersion() {
		String version = getVersion();
		String[] versions = version.split(" ");
		if (versions.length >= 2)
			return versions[1];
		return "";
	}
	
	public String getLanguageVersion() {
		String version = getVersion();
		String[] versions = version.split(" ");
		if (versions.length >= 1)
			return versions[0];
		return "";
	}
	
	public void checkSyntax(IFile file) {
		Eclipse.deleteMarkers(file);
		
		if (!HasCompiler()) {
			Eclipse.addMarker(file, IMarker.SEVERITY_ERROR, badConfigurationCode, badConfiguration, 0, 0, true);
			eclccConsoleWriter.println(noCompiler);
			return;
		}

		CmdArgs cmdArgs = new CmdArgs(eclccFile.getPath(), argsCommon, argsSyntaxCheck);
		GetIncludeArgs(cmdArgs);

		if (monitorDependees) 
			cmdArgs.Append("E");
		ECLArchiveHandler handler = new ECLArchiveHandler();
		CmdProcess process = new CmdProcess(workingPath, binPath, handler, eclccConsoleWriter);
		process.exec(cmdArgs, file, false);
		if (monitorDependees) {
			ancestors = handler.getAncestors(file);
		}
	}

	public String getArchive(IFile file) {
		Eclipse.deleteMarkers(file);
		
		if (!HasCompiler()) {
			Eclipse.addMarker(file, IMarker.SEVERITY_ERROR, badConfigurationCode, badConfiguration, 0, 0, true);
			eclccConsoleWriter.println(noCompiler);
			return "";
		}

		CmdArgs cmdArgs = new CmdArgs(eclccFile.getPath(), argsCommon, argsCompileRemote);
		GetIncludeArgs(cmdArgs);

		if (!argsCompileRemote.contains("manifest=")) {
			IPath manifestPath = file.getLocation().removeLastSegments(1);
			manifestPath = manifestPath.append("files");
			manifestPath = manifestPath.append("manifest.xml");
			if (manifestPath.toFile().exists())
				cmdArgs.Append("manifest=", manifestPath.toOSString());
		}

		hasError = false;
		BasicHandler handler = new SyntaxHandler();
		CmdProcess process = new CmdProcess(workingPath, binPath, handler, eclccConsoleWriter);
		process.exec(cmdArgs, file, false);
		return handler.sbOut.toString();
	}

	public String getMeta(IFile file) {
		if (!enableMetaProcessing)
			return "";
		
		if (!HasCompiler()) {
			eclccConsoleWriter.println(noCompiler);
			return "";
		}

		CmdArgs cmdArgs = new CmdArgs(eclccFile.getPath(), argsCommon, "-M");
		GetIncludeArgs(cmdArgs);

		BasicHandler handler = new BasicHandler();
		CmdProcess process = new CmdProcess(workingPath, binPath, handler, eclccConsoleWriter);
		process.exec(cmdArgs, file, false);
		return handler.sbOut.toString();
	}

	public String buildAndRun(IFile file) {
		Eclipse.deleteMarkers(file);

		if (!HasCompiler()) {
			Eclipse.addMarker(file, IMarker.SEVERITY_ERROR, badConfigurationCode, badConfiguration, 0, 0, true);
			eclccConsoleWriter.println(noCompiler);
			return "";
		}

		CmdArgs cmdArgs = new CmdArgs(eclccFile.getPath(), argsCommon, argsCompile);
		GetIncludeArgs(cmdArgs);

		hasError = false;
		CmdProcess process = new CmdProcess(workingPath, binPath, new LocalRunHandler(), eclccConsoleWriter);
		process.exec(cmdArgs, file, false);
		if (!hasError) {
			resultsConsole.clearConsole();
			IPath exePath = workingPath.append("a.out");
			process.exec(exePath.toOSString(), "", argsWULocal);
		}
		return "";
	}

	public IFolder getLibraryFolder() {
		IFolder retVal = project.getFolder("ECL Library (" + getLanguageVersion() + ")");
		if (!retVal.exists()) {
			try {
				if (OS.isWindowsPlatform())
					retVal.createLink(binPath.append("ecllibrary"), IResource.HIDDEN, null);
				else
					retVal.createLink(binPath.append("../share/ecllibrary"), IResource.HIDDEN, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return retVal;
	}
}
