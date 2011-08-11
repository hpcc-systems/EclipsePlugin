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


import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.debug.core.DLTKDebugPreferenceConstants;
import org.eclipse.dltk.debug.ui.launchConfigurations.MainLaunchConfigurationTab;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.debug.OctclipseDebugPlugin;

public class OctaveMainLaunchConfigurationTab extends MainLaunchConfigurationTab {

	public OctaveMainLaunchConfigurationTab(String mode) {
		super(mode);
		if (ILaunchManager.RUN_MODE.equals(mode)) {
			enableInteractiveConsoleGroup();
		}
	}

	/*
	 * @see org.eclipse.dltk.debug.ui.launchConfigurations.ScriptLaunchConfigurationTab#getNatureID()
	 */
	public String getNatureID() {
		return OctaveNature.NATURE_ID;
	}

	/*
	 * @see org.eclipse.dltk.debug.ui.launchConfigurations.ScriptLaunchConfigurationTab#breakOnFirstLinePrefEnabled(org.eclipse.dltk.core.PreferencesLookupDelegate)
	 */
	protected boolean breakOnFirstLinePrefEnabled(
			PreferencesLookupDelegate delegate) {
		return delegate.getBoolean(OctclipseDebugPlugin.PLUGIN_ID,
				DLTKDebugPreferenceConstants.PREF_DBGP_BREAK_ON_FIRST_LINE);
	}

	/*
	 * @see org.eclipse.dltk.debug.ui.launchConfigurations.ScriptLaunchConfigurationTab#dbpgLoggingPrefEnabled(org.eclipse.dltk.core.PreferencesLookupDelegate)
	 */
	protected boolean dbpgLoggingPrefEnabled(PreferencesLookupDelegate delegate) {
		return delegate.getBoolean(OctclipseDebugPlugin.PLUGIN_ID,
				DLTKDebugPreferenceConstants.PREF_DBGP_ENABLE_LOGGING);
	}

}
