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
package org.hpccsystems.eclide.launchers;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class ECLLaunchTabGroup extends AbstractLaunchConfigurationTabGroup {
	
	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
//		ECLMainLaunchConfigurationTab main = new ECLMainLaunchConfigurationTab(mode);
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
//				main,
				//new OctaveInterpreterTab(main),
				new ECLLaunchServerTab(),
//				new AppletMainTab()
//				new AppletParametersTab(),
//				new JavaArgumentsTab(),
//				new JavaJRETab(),
//				new JavaClasspathTab(), 
//				new CommonTab()
				//new WorkingDirectoryBlock()
		};
		setTabs(tabs);
	}

}
