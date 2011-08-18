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
package org.seisint.eclide.internal.debug.ui.preferences;


import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.seisint.eclide.console.OctaveConsoleConstants;
import org.seisint.eclide.internal.debug.ui.OctclipseDebugUIPlugin;

public class OctaveConsolePreferenceInitializer extends
		AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		IPreferenceStore store = OctclipseDebugUIPlugin.getDefault().getPreferenceStore();
		store.setDefault(OctaveConsoleConstants.PREF_NEW_PROMPT, 
				OctaveConsoleConstants.DEFAULT_NEW_PROMPT);
		store.setDefault(OctaveConsoleConstants.PREF_CONTINUE_PROMPT,
				OctaveConsoleConstants.DEFAULT_CONTINUE_PROMPT);
	}

}
