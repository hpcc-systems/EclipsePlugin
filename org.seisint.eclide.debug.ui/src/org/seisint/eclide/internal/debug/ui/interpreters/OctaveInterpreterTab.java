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
package org.seisint.eclide.internal.debug.ui.interpreters;


import org.eclipse.dltk.debug.ui.launchConfigurations.IMainLaunchConfigurationTab;
import org.eclipse.dltk.debug.ui.launchConfigurations.InterpreterTab;
import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterComboBlock;
import org.eclipse.dltk.internal.debug.ui.interpreters.IInterpreterComboBlockContext;
import org.seisint.eclide.core.OctaveNature;

public class OctaveInterpreterTab extends InterpreterTab {
	
	public OctaveInterpreterTab(IMainLaunchConfigurationTab tab) {
		super(tab);
	}
	
	@Override
	protected AbstractInterpreterComboBlock createInterpreterBlock(
			IInterpreterComboBlockContext context) {
		return new OctaveInterpreterComboBlock(context);
	}

}
