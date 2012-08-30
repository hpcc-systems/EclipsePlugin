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
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.CmdArgs;
import org.hpccsystems.internal.CmdProcess;
import org.hpccsystems.internal.CmdProcess.IProcessOutput;
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

	String QUOTE = "";

	String version = null;
	public class Version implements Comparable<Version> {
		String versionString = ""; 
		String prefix = ""; 
		int major = 0; 
		int minor = 0; 
		int point = 0; 
		String postfix = "";
		
		Version(String versionString) {
			//3.6.1
			//community_3.10.0-7rc
			this.versionString = versionString;
			String[] parts = versionString.split("(_|-)");
			if (parts.length == 1) {
				calcVersion(parts[0]);
			} else if (parts.length == 3) {
				prefix = parts[0];
				calcVersion(parts[1]);
				postfix = parts[2];
			}
		}
		
		void calcVersion(String version) {
			major = 0;
			minor = 0;
			point = 0;
			try {
				String[] parts = version.split("\\.");
				if (parts.length >= 1) {
					major = Integer.parseInt(parts[0]);
				}
				if (parts.length >= 2) {
					minor = Integer.parseInt(parts[1]);
				}
				if (parts.length >= 3) {
					point = Integer.parseInt(parts[2]);
				}
			} catch (Exception e) {
			}
		}

		@Override
		public String toString() {
			return versionString;
		}
		
		@Override
		public int compareTo(Version other) {
			if (other.major < major) 
				return -1;
			else if (other.major > major)
				return 1;
			
			if (other.minor < minor) 
				return -1;
			else if (other.minor > minor)
				return 1;
			
			if (other.point < point) 
				return -1;
			else if (other.point > point)
				return 1;
			
			int retVal = other.postfix.compareTo(postfix);
			if (retVal != 0)
				return retVal;

			retVal = other.prefix.compareTo(prefix);
			if (retVal != 0)
				return retVal;

			return 0;
		}
	}
	private Version langVersion = null; 
	private Version buildVersion = null; 

	IPreferenceStore preferences;
	IPath binPath;
	File eclccFile;
	File eclplusFile;

	//  Project Info ---
	IProject project;
	IProject[] referencedProjects;
	IPath projectPath;
	IPath workingPath;
	IPath rootFolder;	

	//  Prefs Info ---
	String argsCommon;
	String argsSyntaxCheck;
	String argsCompile;
	String argsCompileRemote;

	String argsWULocal;

	boolean monitorDependees = false;
	boolean supressSubsequentErrors = false;
	boolean enableMetaProcessing = true;

	//  Consoles
	MessageConsole eclccConsole;
	MessageConsoleStream eclccConsoleWriter;

	MessageConsole resultsConsole;
	MessageConsoleStream resultsConsoleWriter;

	public String wuid;
	public Set<IFile> ancestors;
	boolean hasError;	//TODO Has Error notification is all wrong.

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
					if (lastSpace != -1) {
						wuid = stdIn.substring(lastSpace + 1, stdIn.length());
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public ECLCompiler(Path rootPath) {
		QUOTE = OS.getOSQuote();
		binPath = rootPath.append("bin");
		eclccFile = binPath.append("eclcc").toFile();
		eclplusFile = binPath.append("eclplus").toFile();

		resultsConsole = Eclipse.findConsole("Results");
		resultsConsoleWriter = resultsConsole.newMessageStream();
		resultsConsoleWriter.setActivateOnWrite(true);

		eclccConsole = Eclipse.findConsole("eclcc");
		eclccConsoleWriter = eclccConsole.newMessageStream();
		//eclccConsoleWriter.setActivateOnWrite(true);
		
		setPreferences(Activator.getDefault().getPreferenceStore());
	}

	public void setPreferences(IPreferenceStore preferences) {
		this.preferences = preferences;
		loadPreferences();
	}
	
	void loadPreferences() {
		if (preferences != null) {
			argsCommon = preferences.getString(ClientTools.P_ARGSCOMMON);
			argsSyntaxCheck = preferences.getString(ClientTools.P_ARGSSYNTAX);
			argsCompile = preferences.getString(ClientTools.P_ARGSCOMPILE);
			argsCompileRemote = preferences.getString(ClientTools.P_ARGSCOMPILEREMOTE);
			int inlineResultLimit = preferences.getInt(ClientTools.P_INLINERESULTLIMIT);
			if (inlineResultLimit > 0) {
				argsCompile += " -fapplyInstantEclTransformations=1 -fapplyInstantEclTransformationsLimit=" + inlineResultLimit;
				argsCompileRemote += " -fapplyInstantEclTransformations=1 -fapplyInstantEclTransformationsLimit=" + inlineResultLimit;
			}
	
			argsWULocal = preferences.getString(ClientTools.P_ARGSWULOCAL);
	
			monitorDependees = preferences.getBoolean(ClientTools.P_MONITORDEPENDEES);
			supressSubsequentErrors = preferences.getBoolean(ClientTools.P_SUPRESSSECONDERROR);
			enableMetaProcessing = preferences.getBoolean(ClientTools.P_ENABLEMETAPROCESSING);
		}
	}

	public void setProject(IProject project) {
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

	protected void calcVersion() {
		if (langVersion == null && buildVersion == null) {
			langVersion = new Version("0.0.0");
			buildVersion = new Version("0.0.0");

			//3.6.1 community_3.10.0-7rc
			String[] parts = getVersion().split(" ");
			if (parts.length >= 1) {
				langVersion = new Version(parts[0]);
			}
			if (parts.length >= 2) {
				buildVersion = new Version(parts[1]);
			}
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

	public Version getBuildVersion() {
		calcVersion();
		return buildVersion;
	}

	public Version getLanguageVersion() {
		calcVersion();
		return langVersion;
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

		if (monitorDependees) {
			cmdArgs.Append("E");
		}
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
			if (manifestPath.toFile().exists()) {
				cmdArgs.Append("manifest=", manifestPath.toOSString());
			}
		}

		hasError = false;
		BasicHandler handler = new SyntaxHandler();
		CmdProcess process = new CmdProcess(workingPath, binPath, handler, eclccConsoleWriter);
		process.exec(cmdArgs, file, false);
		return handler.sbOut.toString();
	}

	public String getMeta(IFile file) {
		if (!enableMetaProcessing) {
			return "";
		}

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
				if (OS.isWindowsPlatform()) {
					retVal.createLink(binPath.append("ecllibrary"), IResource.HIDDEN, null);
				} else {
					retVal.createLink(binPath.append("../share/ecllibrary"), IResource.HIDDEN, null);
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return retVal;
	}
}
