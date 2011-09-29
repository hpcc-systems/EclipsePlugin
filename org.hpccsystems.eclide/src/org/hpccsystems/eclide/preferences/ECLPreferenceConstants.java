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
	
	public static final String P_MONITORDEPENDEES = "monitorDependees";
	public static final String P_SUPRESSSECONDERROR = "supressSecondError";
	
	//  Should not be global  ---
	//public static final String P_REMOTEEXECUTE = "remoteExecutePreference";
	//public static final String P_SERVERIP = "serverIPPreference";
	//public static final String P_SERVERCLUSTER = "serverClusterPreference";

}
