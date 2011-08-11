/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.seisint.eclide.internal.debug;


import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.dltk.debug.core.DLTKDebugPreferenceConstants;
import org.seisint.eclide.debug.OctaveDebugConstants;
import org.seisint.eclide.debug.OctclipseDebugPlugin;

public class OctaveDebugPreferenceInitializer extends
		AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		Preferences store = OctclipseDebugPlugin.getDefault().getPluginPreferences();

		store.setDefault(OctaveDebugConstants.DEBUGGING_ENGINE_ID_KEY, "");

		store.setDefault(
				DLTKDebugPreferenceConstants.PREF_DBGP_BREAK_ON_FIRST_LINE,
				false);
		store.setDefault(DLTKDebugPreferenceConstants.PREF_DBGP_ENABLE_LOGGING,
				false);

		store.setDefault(
				DLTKDebugPreferenceConstants.PREF_DBGP_SHOW_SCOPE_GLOBAL, true);
		/* TODO: Once full classdef support is added to octave I'll need to add this */
		store.setDefault(
				DLTKDebugPreferenceConstants.PREF_DBGP_SHOW_SCOPE_CLASS, false);
		store.setDefault(
				DLTKDebugPreferenceConstants.PREF_DBGP_SHOW_SCOPE_LOCAL, true);
	}

}
