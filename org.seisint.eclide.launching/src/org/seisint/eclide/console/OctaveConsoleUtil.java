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
package org.seisint.eclide.console;

import java.io.IOException;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.dltk.core.environment.EnvironmentManager;
import org.eclipse.dltk.core.environment.IDeployment;
import org.eclipse.dltk.core.environment.IExecutionEnvironment;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.launching.ScriptLaunchUtil;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.console.OctaveScriptConsoleServer;
import org.seisint.eclide.launching.OctclipseLaunchingPlugin;

public class OctaveConsoleUtil {
	public static void runDefaultOctaveInterpreter(OctaveInterpreter interpreter)
	throws CoreException, IOException {
		OctaveScriptConsoleServer server = OctaveScriptConsoleServer.getInstance();
		String id = server.register(interpreter);
		String port = Integer.toString(server.getPort());
		String[] args = new String[] { "127.0.0.1", port, id };
		String[] octaveArgs = new String[] { "-q" };
		IExecutionEnvironment exeEnv = (IExecutionEnvironment) EnvironmentManager
			.getLocalEnvironment().getAdapter(IExecutionEnvironment.class);
		IDeployment deployment = exeEnv.createDeployment();
		IPath path = deployment.add(
				OctclipseLaunchingPlugin.getDefault().getBundle(), OctclipseLaunchingPlugin
						.getDefault().getConsoleProxy());
		IFileHandle scriptFile = deployment.getFile(path);
		final ILaunch launch = ScriptLaunchUtil.runScript(
				OctaveNature.NATURE_ID, scriptFile, null, octaveArgs, args, null);
		if (launch != null) {
			interpreter.addCloseOperation(new Runnable() {
				public void run() {
					IProcess[] processes = launch.getProcesses();
					if (processes != null) {
						for (int i = 0; i < processes.length; i++) {
							try {
								processes[i].terminate();
							} catch (DebugException e) {
								e.printStackTrace();								
							}
						}
					}
				}
			});
		}
	}
}
