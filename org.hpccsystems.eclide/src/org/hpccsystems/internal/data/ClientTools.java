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
package org.hpccsystems.internal.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.eclide.builder.Version;
import org.hpccsystems.eclide.launchers.ECLLaunchCompilerTab;
import org.hpccsystems.internal.ConfigurationPreferenceStore;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.OS;

public class ClientTools extends DataSingleton implements Comparable<ClientTools>{
	public static DataSingletonCollection All = new DataSingletonCollection();	
	public static ClientTools Recent = null;	
	public static ClientTools get() {
		if (Recent == null) {
			Recent = (ClientTools)All.get(new ClientTools(findNewest()));
		}
		return Recent;
	}
	public static ClientTools getNoCreate() {
		return (ClientTools)All.getNoCreate(new ClientTools());
	}
	public static ClientTools get(Platform p, ILaunchConfiguration launchConfiguration) {
		return get(p, new ConfigurationPreferenceStore(launchConfiguration));
	}
	public static ClientTools get(Platform p, ConfigurationPreferenceStore preferences) {
		ClientTools ct = null;
		if (preferences.getAttribute(ECLLaunchCompilerTab.P_OVERRIDEDEFAULTS, "false").equals("true")) {
			ct = new ClientTools(preferences);
		} else {
			ct = ClientTools.findBestMatch(p.getBuildVersion());
		}
		if (ct == null) {
			return null;
		}
		return (ClientTools)All.get(ct);
	}

	public static final String P_KNOWNTOOLSPATH = "knownToolsPathPreference";
	public static final String P_TOOLSPATH = "toolsPathPreference";
	public static final String P_TOOLSPATH_DEFAULT = "";

	public static final String P_ARGSCOMMON = "argsCommonPreference";
	public static final String P_ARGSCOMMON_DEFAULT = "";
	public static final String P_ARGSSYNTAX = "argsSyntaxPreference";
	public static final String P_ARGSSYNTAX_DEFAULT = "-fsyntaxcheck=1";
	public static final String P_ARGSCOMPILE = "argsCompilePreference";
	public static final String P_ARGSCOMPILE_DEFAULT = "";
	public static final String P_ARGSCOMPILEREMOTE = "argsCompileRemotePreference";
	public static final String P_ARGSCOMPILEREMOTE_DEFAULT = "-E";

	//  Local command line options
	public static final String P_ARGSWULOCAL = "argsWorkunitLocalPreference";
	public static final String P_ARGSWULOCAL_DEFAULT = "";

	public static final String P_INLINERESULTLIMIT = "inlineResultLimit";
	public static final int P_INLINERESULTLIMIT_DEFAULT = 0;
	public static final String P_MONITORDEPENDEES = "monitorDependeesPreference";
	public static final boolean P_MONITORDEPENDEES_DEFAULT = true;
	public static final String P_SUPRESSSECONDERROR = "supressSecondErrorPreference";
	public static final boolean P_SUPRESSSECONDERROR_DEFAULT = false;
	public static final String P_ENABLEMETAPROCESSING = "enableMetaProcessing";
	public static final boolean P_ENABLEMETAPROCESSING_DEFAULT = true;

	private IPreferenceStore preferences;	
	private Path rootPath;
	
	ClientTools() {
		preferences = Activator.getDefault().getPreferenceStore();
		rootPath = new Path(preferences.getString(ClientTools.P_TOOLSPATH));
	}

	protected ClientTools(String path) {
		rootPath = new Path(path);
	}

	ClientTools(ConfigurationPreferenceStore _preferences) {
		init(_preferences);
	}

	ClientTools(ILaunchConfiguration _launchConfiguration) {
		init(new ConfigurationPreferenceStore(_launchConfiguration));
	}
	
	void init(ConfigurationPreferenceStore _preferences) {
		if (!_preferences.getAttribute(ECLLaunchCompilerTab.P_OVERRIDEDEFAULTS,  "false").equals("true")) {
			preferences = Activator.getDefault().getPreferenceStore();
		} else {
			preferences = _preferences;
		}
		rootPath = new Path(preferences.getString(ClientTools.P_TOOLSPATH));
	}

	public String getRootPath() {
		return rootPath.toOSString();
	}

	public IPath getEclLibraryPath() {
		return getCompiler().getPath(ECLCompiler.ECLLIBRARY_PATH);
	}

	public IPath getEclExamplesPath() {
		return rootPath.append("examples");
	}
	
	public IPath getEclBundlesPath() {
		return getCompiler().getPath(ECLCompiler.ECLBUNDLE_PATH);
	}

	public ECLCompiler getCompiler() {
		Recent = this;
		ECLCompiler retVal = new ECLCompiler(rootPath);
		retVal.setPreferences(preferences);
		return retVal;
	}

	public Version getBuildVersion() {
		ECLCompiler compiler = getCompiler();
		return compiler.getBuildVersion();
	}

	public Version getLanguageVersion() {
		ECLCompiler compiler = getCompiler();
		return compiler.getLanguageVersion();
	}

	@Override
	boolean isComplete() {
		return true;
	}

	@Override
	void fastRefresh() {
	}

	@Override
	void fullRefresh() {
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( this == aThat ) {
			return true;
		}

		if ( !(aThat instanceof ClientTools) ) {
			return false;
		}
		ClientTools that = (ClientTools)aThat;

		//now a proper field-by-field evaluation can be made
		return EqualsUtil.areEqual(rootPath, that.rootPath);
	}

	@Override
	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, rootPath);
		return result;
	}
	
	public String getFolderName(boolean includeVersion) {
		return "Client Tools" + (includeVersion ? " (" + getBuildVersion().toString() + ")" : "");
	}

	public String getLibraryFolderName(boolean includeVersion) {
		return "ECL Library" + (includeVersion ? " (" + getBuildVersion().toString() + ")" : "");
	}

	public String getBundlesFolderName(boolean includeVersion) {
		return "Bundles" + (includeVersion ? " (" + getBuildVersion().toString() + ")" : "");
	}

	public String getExamplesFolderName(boolean includeVersion) {
		return "Examples" + (includeVersion ? " (" + getBuildVersion().toString() + ")" : "");
	}

	public static List<ClientTools> findClientTools() {
		List<ClientTools> retVal = new ArrayList<ClientTools>();
		
		String rootFolder = "";
		if (OS.isWindowsPlatform()) {
			rootFolder = System.getenv("ProgramFiles(x86)");
			if (rootFolder == null || rootFolder.isEmpty()) {
				rootFolder = System.getenv("ProgramFiles");
			}
			if (rootFolder == null || rootFolder.isEmpty()) {
				rootFolder = "c:\\Program Files (x86)";
			}
		} else {
			rootFolder = "/opt";
		}
		
		if (!rootFolder.isEmpty()) {
			File hpccSystemsFolder = new Path(rootFolder).append("HPCCSystems").toFile();
			if (hpccSystemsFolder.exists() && hpccSystemsFolder.isDirectory()) {
				if (!OS.isWindowsPlatform()) {
					//  Check for server installation  ---
					retVal.add(new ClientTools(hpccSystemsFolder.toString()));					
				}
				File[] versionFolders = hpccSystemsFolder.listFiles();
				for (File versionFolder : versionFolders) {
					File clientToolsPath = new Path(hpccSystemsFolder.toString()).append(versionFolder.getName()).append("clienttools").toFile();
					if (clientToolsPath.exists() && clientToolsPath.isDirectory()) {
						String name = versionFolder.getName();
						String[] parts = name.split("\\.");
						if (parts.length == 3) {
							retVal.add(new ClientTools(clientToolsPath.toString()));
						}
					}
				}
			}
		}
		
		Collections.sort(retVal);
		
		return retVal;
	}

	public static String findNewest() {
		List<ClientTools> knownClientTools = findClientTools();
		if (knownClientTools.isEmpty())
			return "";
		return knownClientTools.get(0).getRootPath();
	}
	
	public static ClientTools findBestMatch(Version version) {
		ClientTools matched = null;
		ClientTools bestMatched_before = null;
		ClientTools bestMatched_after = null;
		List<ClientTools> knownClientTools = findClientTools();
		for(int i = knownClientTools.size() - 1; i >= 0; --i) {
			ClientTools ct = knownClientTools.get(i);
			if (ct.compareTo(version) == 0) {
				matched = ct;
				break;
			} else if (ct.compareTo(version) < 0) {
				bestMatched_after = ct;
				break;
			}
			bestMatched_before = ct;
		}

		if (matched != null)
			return matched;
		
		if (bestMatched_after != null && Version.distance(version, bestMatched_after.getBuildVersion()) < Version.DISTANCE_POINT)
			matched = bestMatched_after;

		if (bestMatched_before != null && Version.distance(version, bestMatched_before.getBuildVersion()) < Version.DISTANCE_POINT)
			matched = bestMatched_before;

		MessageConsole eclccConsole = Eclipse.findConsole("eclcc");
		MessageConsoleStream eclccConsoleWriter = eclccConsole.newMessageStream();

		if (matched != null)
		{
			try {
				eclccConsoleWriter.write("Compiler/Server mismatch:\nCompiler:\t" + matched.getBuildVersion().toString() + "\nServer:\t" + version.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
			return matched;
		}

		if (knownClientTools.isEmpty()) {
			try {
				eclccConsoleWriter.write("Unable to locate local eclcc.  Please download and install suitable ClientTools from hpccsystems.com.\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			//  No good match, just return latest  ---
			matched = knownClientTools.get(0);
			try {
				eclccConsoleWriter.write("Compiler/Server mismatch:\nCompiler:\t" + matched.getBuildVersion().toString() + "\nServer:\t" + version.toString() + 
						"\n(To prevent this message from showing, either download and install the matching client tools package or override the default compiler settings in the preferences window)\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return matched;
	}

	@Override
	public int compareTo(ClientTools other) {
		return compareTo(other.getBuildVersion());
	}

	public int compareTo(Version other) {
		return getBuildVersion().compareTo(other);
	}
}
