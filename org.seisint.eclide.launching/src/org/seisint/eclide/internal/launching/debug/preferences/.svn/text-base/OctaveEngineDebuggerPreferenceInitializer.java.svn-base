/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.seisint.eclide.internal.launching.debug.preferences;


import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.seisint.eclide.internal.launching.debug.OctaveEngineDebuggerConstants;
import org.seisint.eclide.launching.OctclipseLaunchingPlugin;

/**
 */
public class OctaveEngineDebuggerPreferenceInitializer extends
		AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		IPreferenceStore store = OctclipseLaunchingPlugin.getDefault()
				.getPreferenceStore();

		OctaveEngineDebuggerConstants.initalizeDefaults(store);
	}

}
