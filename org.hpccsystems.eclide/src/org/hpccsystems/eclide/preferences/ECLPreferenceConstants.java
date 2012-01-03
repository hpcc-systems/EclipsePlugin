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
package org.hpccsystems.eclide.preferences;

/**
 * Constant definitions for plug-in preferences
 */
public class ECLPreferenceConstants {

	public static final String P_TOOLSPATH = "toolsPathPreference";

	//  eclcc command line options  ---
	public static final String P_ARGSCOMMON = "argsCommonPreference";
	public static final String P_ARGSSYNTAX = "argsSyntaxPreference";
	public static final String P_ARGSCOMPILE = "argsCompilePreference";
	public static final String P_ARGSCOMPILEREMOTE = "argsCompileRemotePreference";
	
	//  Local command line options
	public static final String P_ARGSWULOCAL = "argsWorkunitLocalPreference";

	public static final String P_INLINERESULTLIMIT = "inlineResultLimit";
	public static final String P_MONITORDEPENDEES = "monitorDependeesPreference";
	public static final String P_SUPRESSSECONDERROR = "supressSecondErrorPreference";
	
	//  Should not be global  ---
	//public static final String P_REMOTEEXECUTE = "remoteExecutePreference";
	//public static final String P_SERVERIP = "serverIPPreference";
	//public static final String P_SERVERCLUSTER = "serverClusterPreference";

}
