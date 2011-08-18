/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.launching;

import java.io.File;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.dltk.launching.AbstractScriptLaunchConfigurationDelegate;
import org.eclipse.dltk.launching.InterpreterConfig;
import org.seisint.eclide.core.OctaveNature;

public class OctaveLaunchConfigurationDelegate extends
		AbstractScriptLaunchConfigurationDelegate {

	private static final String OCTAVEPATH_ENV_VAR = "HPCCWORKINGFOLDER";

	public String getLanguageId() {
		return OctaveNature.NATURE_ID;
	}

	protected void addLibpathEnvVar(InterpreterConfig config,
			ILaunchConfiguration configuration) throws CoreException {
		config.removeEnvVar(OCTAVEPATH_ENV_VAR);
		IPath[] paths = createBuildPath(configuration);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < paths.length; ++i) {
			sb.append(paths[i].toOSString());
			if (i < paths.length - 1) {
				sb.append(File.pathSeparator);
			}
		}
		config.addEnvVar(OCTAVEPATH_ENV_VAR, sb.toString());
	}

	protected void checkEnvVars(InterpreterConfig config,
			ILaunchConfiguration configuration) {
	}

	protected InterpreterConfig createInterpreterConfig(
			ILaunchConfiguration configuration, ILaunch launch)
			throws CoreException {
		InterpreterConfig config = super.createInterpreterConfig(
				configuration, launch);

		addLibpathEnvVar(config, configuration);
		checkEnvVars(config, configuration);

		return config;
	}


}
