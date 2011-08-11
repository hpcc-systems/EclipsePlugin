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


import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.debug.ui.preferences.AbstractDebuggingEngineOptionsBlock;
import org.eclipse.dltk.internal.ui.text.PreferencesAdapter;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.debug.OctaveDebugConstants;
import org.seisint.eclide.debug.OctclipseDebugPlugin;

@SuppressWarnings("restriction")
public class OctaveDebugEnginePreferencePage extends
	AbstractConfigurationBlockPropertyAndPreferencePage {

	static PreferenceKey DEBUGGING_ENGINE = new PreferenceKey(
			OctclipseDebugPlugin.PLUGIN_ID, OctaveDebugConstants.DEBUGGING_ENGINE_ID_KEY);
	
	private static final String PREFERENCE_PAGE_ID = "org.seisint.eclide.preferences.debug.engine";
	private static final String PROPERTY_PAGE_ID = "org.seisint.eclide.propertyPage.debug.engine";
	
	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		setDescription(OctaveDebugEnginePreferencesMessages.PreferencesDescription);
	}

	protected void setPreferenceStore() {
		setPreferenceStore(new PreferencesAdapter(OctclipseDebugPlugin.getDefault()
				.getPluginPreferences()));
	}

	protected AbstractOptionsBlock createOptionsBlock(
			IStatusChangeListener newStatusChangedListener, IProject project,
			IWorkbenchPreferenceContainer container) {
		return new AbstractDebuggingEngineOptionsBlock(
				newStatusChangedListener, project, getKeys(), container) {

			protected String getNatureId() {
				return OctaveNature.NATURE_ID;
			}

			protected PreferenceKey getSavedContributionKey() {
				return DEBUGGING_ENGINE;
			}
		};
	}

	protected String getProjectHelpId() {
		return null;
	}

	protected String getPreferencePageId() {
		return PREFERENCE_PAGE_ID;
	}

	protected String getPropertyPageId() {
		return PROPERTY_PAGE_ID;
	}
	
	private PreferenceKey[] getKeys() {
		return new PreferenceKey[] { DEBUGGING_ENGINE };
	}

}
