/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.launching.debug;

import java.io.File;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.launching.ExternalDebuggingEngineRunner;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.InterpreterConfig;
import org.eclipse.dltk.launching.debug.DbgpConnectionConfig;
import org.seisint.eclide.debug.OctclipseDebugPlugin;
import org.seisint.eclide.internal.launching.OctaveLaunchingHelper;
import org.seisint.eclide.launching.OctclipseLaunchingPlugin;

public class OctaveEngineDebuggerRunner extends ExternalDebuggingEngineRunner {

	private static final String DBGP_FILE = "--dbgp_file";

	private static final String DBGP_ID = "--dbgp_id";

	private static final String DBGP_PORT = "--dbgp_port";

	private static final String DBGP_HOST = "--dbgp_host";
	
	private static final String DBGP_LOG = "--dbgp_log";

	public static final String ENGINE_ID = "org.seisint.eclide.launching.debug.OctaveDebuggerRunner";
	
	private static final String ARGS_SEPARATOR = "--";
	
	public OctaveEngineDebuggerRunner(IInterpreterInstall install) {
		super(install);
	}
	
	protected void initializeLaunch(ILaunch launch, InterpreterConfig config,
			PreferencesLookupDelegate delegate)
			throws CoreException {
		super.initializeLaunch(launch, config, delegate);
		OctaveLaunchingHelper.addProjectRuntimePaths(launch, config);
	}

	protected InterpreterConfig alterConfig(InterpreterConfig config,
			PreferencesLookupDelegate delegate) throws CoreException {			
		DbgpConnectionConfig dbgpConfig = DbgpConnectionConfig.load(config);		
		IFileHandle enginePath = getDebuggingEnginePath(delegate);		
		InterpreterConfig newConfig = (InterpreterConfig) config.clone();	
		/* octave [args] octave_dbgp.m --dbgp_file add_three_numbers.m -- 1 2 3 */
		newConfig.setScriptFile(enginePath.getPath());
		newConfig.clearScriptArgs();			
		newConfig.addScriptArg(DBGP_FILE);
		newConfig.addScriptArg(config.getScriptFilePath().toOSString());		
		newConfig.addScriptArg(DBGP_HOST);
		newConfig.addScriptArg(dbgpConfig.getHost());
		newConfig.addScriptArg(DBGP_PORT);
		newConfig.addScriptArg(Integer.toString(dbgpConfig.getPort()));
		newConfig.addScriptArg(DBGP_ID);
		newConfig.addScriptArg(dbgpConfig.getSessionId());		
		String logFile = getLogFileName(delegate, dbgpConfig.getSessionId());
        if (logFile != null)
        {
        	newConfig.addScriptArg(DBGP_LOG);
        	newConfig.addScriptArg(logFile);
        }        
		if (config.getScriptArgs().size() > 0)
		{
			/* fix the script args so that the first one is "--"
			 * so that the debug engine knows where to delimit
			 */
			newConfig.addScriptArg(ARGS_SEPARATOR);
			newConfig.addScriptArgs(config.getScriptArgs());
		}
		return newConfig;
	}
	
	
	protected File getDebuggingEnginePath() {
		final String path = OctclipseLaunchingPlugin
				.getDefault()
				.getPreferenceStore()
				.getString(
						OctaveEngineDebuggerConstants.DEBUGGING_ENGINE_PATH_KEY);

		if (path != null) {
			return new File(path);
		}

		return null;
	}
	
	protected String getDebuggingEngineId() {
		return ENGINE_ID;
	}

	protected String getDebuggingEnginePreferenceKey() {
		return OctaveEngineDebuggerConstants.DEBUGGING_ENGINE_PATH_KEY;
	}

	protected String getDebuggingEnginePreferenceQualifier() {
		return OctclipseLaunchingPlugin.PLUGIN_ID;
	}

	protected String getDebugPreferenceQualifier() {
		return OctclipseDebugPlugin.PLUGIN_ID;
	}

	protected String getLogFileNamePreferenceKey() {
		return OctaveEngineDebuggerConstants.LOG_FILE_NAME;
	}

	protected String getLogFilePathPreferenceKey() {
		return OctaveEngineDebuggerConstants.LOG_FILE_PATH;
	}

	protected String getLoggingEnabledPreferenceKey() {
		return OctaveEngineDebuggerConstants.ENABLE_LOGGING;
	}

}
