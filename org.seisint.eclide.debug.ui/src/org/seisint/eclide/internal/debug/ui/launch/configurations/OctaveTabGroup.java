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
package org.seisint.eclide.internal.debug.ui.launch.configurations;


import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.dltk.debug.ui.launchConfigurations.ScriptArgumentsTab;
import org.eclipse.dltk.debug.ui.launchConfigurations.ScriptCommonTab;
import org.seisint.eclide.internal.debug.ui.interpreters.OctaveInterpreterTab;


public class OctaveTabGroup extends AbstractLaunchConfigurationTabGroup {

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		OctaveMainLaunchConfigurationTab main = new OctaveMainLaunchConfigurationTab(mode);
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				main,
				new ScriptArgumentsTab(),
				new OctaveInterpreterTab(main),
				new EnvironmentTab(),
				new ScriptCommonTab()
		};
		setTabs(tabs);
	}

}
