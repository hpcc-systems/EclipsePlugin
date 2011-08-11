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


import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.dltk.launching.AbstractInterpreterRunner;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.InterpreterConfig;
import org.seisint.eclide.launching.OctclipseLaunchingPlugin;

public class OctaveInterpreterRunner extends AbstractInterpreterRunner {
	
	protected OctaveInterpreterRunner(IInterpreterInstall install) {
		super(install);
	}

	protected String getPluginId() {
		return OctclipseLaunchingPlugin.PLUGIN_ID;
	}
	
	protected void alterConfig(ILaunch launch, InterpreterConfig config) {
		OctaveLaunchingHelper.addProjectRuntimePaths(launch, config);
	}

	@Override
	protected String renderCommandLineLabel(InterpreterConfig config) {
		// TODO Auto-generated method stub
		return super.renderCommandLineLabel(config);
	}

	@Override
	protected IProcess newProcess(ILaunch launch, Process p, String label,
			Map<String, String> attributes) throws CoreException {
		// TODO Auto-generated method stub
		return super.newProcess(launch, p, label, attributes);
	}

	@Override
	protected String[] renderCommandLine(InterpreterConfig config) {
		// TODO Auto-generated method stub
		return super.renderCommandLine(config);
	}

	@Override
	protected IProcess rawRun(ILaunch launch, InterpreterConfig config)
			throws CoreException {
		// TODO Auto-generated method stub
		return super.rawRun(launch, config);
	}

	@Override
	public void run(InterpreterConfig config, ILaunch launch,
			IProgressMonitor monitor) throws CoreException {
		// TODO Auto-generated method stub
		super.run(config, launch, monitor);
	}

}
