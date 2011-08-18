package org.seisint.eclide.internal.core;


import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.dltk.compiler.task.TaskTagUtils;
import org.seisint.eclide.core.OctclipsePlugin;


public class OctclipseCorePreferenceInitializer extends
		AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		Preferences store = OctclipsePlugin.getDefault().getPluginPreferences();		
		TaskTagUtils.initializeDefaultValues(store);
	}

}
