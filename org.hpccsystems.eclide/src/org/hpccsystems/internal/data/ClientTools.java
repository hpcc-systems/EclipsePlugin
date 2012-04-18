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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.internal.ConfigurationPreferenceStore;
import org.hpccsystems.internal.OS;

public class ClientTools extends DataSingleton {
	public static DataSingletonCollection All = new DataSingletonCollection();	
	public static ClientTools get(String path) {
		return (ClientTools)All.get(new ClientTools(path));
	}
	public static ClientTools getNoCreate(String path) {
		return (ClientTools)All.getNoCreate(new ClientTools(path));
	}
	
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
	
	private ConfigurationPreferenceStore launchConfiguration;	
	private Path path;
	private String version; 
	private int version_major = 0; 
	private int version_minor = 0; 
	private int version_point = 0; 
	
	ClientTools(String path) {
		this.path = new Path(path);
	}
	
	public void update(ILaunchConfiguration _launchConfiguration) {
		this.launchConfiguration = new ConfigurationPreferenceStore(_launchConfiguration);
	}
	
	public String getPath() {
		return path.toOSString();
	}
	
	public IPath getEclLibraryPath() {
		if (OS.isWindowsPlatform())
			return path.append("ecllibrary");
		else
			return path.append("../share/ecllibrary");
	}

	public ECLCompiler getCompiler(IProject project) {
		return new ECLCompiler(launchConfiguration, project);
	}
	
	public void calcVersion() {
		if (version == null) {
			version = new String();
			ECLCompiler compiler = new ECLCompiler(launchConfiguration);
			version = compiler.getLanguageVersion();
			String[] parts = version.split(".");
			if (parts.length >= 1)
				version_major = Integer.parseInt(parts[0]);
			if (parts.length >= 2)
				version_minor = Integer.parseInt(parts[1]);
			if (parts.length >= 3)
				version_point = Integer.parseInt(parts[3]);
		}
	}

	public String getVersion() {
		calcVersion();
		return version;
	}

	public int getMajor() {
		calcVersion();
		return version_major;
	}
	
	public int getMinor() {
		calcVersion();
		return version_minor;
	}

	public int getPoint() {
		calcVersion();
		return version_point;
	}
	
	public boolean isNewerThan(ClientTools other) {
		if (other.getMajor() > getMajor()) {
			return false;
		}else if (other.getMinor() > getMinor()) {
			return false;
		} else if (other.getMinor() > getMinor()) {
			return false;
		}
		return true;
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
		if ( this == aThat ) 
			return true;

		if ( !(aThat instanceof ClientTools) ) 
			return false;
		ClientTools that = (ClientTools)aThat;

		//now a proper field-by-field evaluation can be made
		return 	EqualsUtil.areEqual(this.path, that.path);
	}

	@Override
	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, path);
		return result;
	}
}
