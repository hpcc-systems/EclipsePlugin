/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/

package org.seisint.eclide.internal.launching;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.dltk.core.IScriptFolder;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.internal.core.ExternalScriptFolder;
import org.eclipse.dltk.launching.InterpreterConfig;
import org.eclipse.dltk.launching.ScriptRuntime;

@SuppressWarnings("restriction")
public class OctaveLaunchingHelper {

	private static final String PATH = "-I";
	
	static public void addProjectRuntimePaths(ILaunch launch, InterpreterConfig config) {
		/* add all the source folders in its project to the 
		 * runtime path of octave */
		try {
			IScriptProject sProject = ScriptRuntime.getScriptProject(launch
					.getLaunchConfiguration());

			IScriptFolder[] folders = sProject.getScriptFolders();
			for (int i = 0; i < folders.length; ++i) {
				if (folders[i] instanceof ExternalScriptFolder)
					continue;
				String absPath = folders[i].getResource().getLocation().toFile().getAbsolutePath();
				if (absPath.isEmpty())
					continue;
				config.addInterpreterArg(PATH);
				config.addInterpreterArg(absPath);
				break;
			}
		} catch (Exception e) {
		}
	}
	
}
