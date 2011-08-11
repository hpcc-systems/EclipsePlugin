/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.seisint.eclide.internal.launching.debug.preferences;


import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.debug.ui.preferences.ExternalDebuggingEngineOptionsBlock;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.seisint.eclide.internal.launching.debug.OctaveEngineDebuggerConstants;
import org.seisint.eclide.launching.OctclipseLaunchingPlugin;

/**
 * Octave DBGP debugging engine preference page
 */
public class OctaveEngineDebuggerPreferencePage extends
		AbstractConfigurationBlockPropertyAndPreferencePage {

	static PreferenceKey ENGINE_PATH = new PreferenceKey(
			OctclipseLaunchingPlugin.PLUGIN_ID,
			OctaveEngineDebuggerConstants.DEBUGGING_ENGINE_PATH_KEY);

	static PreferenceKey ENABLE_LOGGING = new PreferenceKey(
			OctclipseLaunchingPlugin.PLUGIN_ID,
			OctaveEngineDebuggerConstants.ENABLE_LOGGING);

	static PreferenceKey LOG_FILE_PATH = new PreferenceKey(
			OctclipseLaunchingPlugin.PLUGIN_ID,
			OctaveEngineDebuggerConstants.LOG_FILE_PATH);

	static PreferenceKey LOG_FILE_NAME = new PreferenceKey(
			OctclipseLaunchingPlugin.PLUGIN_ID,
			OctaveEngineDebuggerConstants.LOG_FILE_NAME);

	private static String PREFERENCE_PAGE_ID = "org.seisint.eclide.launching.debug.preferences.octave.debugger";
	private static String PROPERTY_PAGE_ID = "org.seisint.eclide.launching.debug.propertyPage.octave.debugger";

	protected AbstractOptionsBlock createOptionsBlock(
			IStatusChangeListener newStatusChangedListener, IProject project,
			IWorkbenchPreferenceContainer container) {

		return new ExternalDebuggingEngineOptionsBlock(
				newStatusChangedListener, project,
				new PreferenceKey[] { ENGINE_PATH, ENABLE_LOGGING, LOG_FILE_PATH,
						LOG_FILE_NAME }, container) {
			
			protected void createOtherBlock(Composite parent) {
				addDownloadLink(parent,
						PreferenceMessages.OctclipseEngineDownloadPage,
						PreferenceMessages.OctclipseEngineDownloadPageLink);
			}
			
			protected PreferenceKey getDebuggingEnginePathKey() {
				return ENGINE_PATH;
			}

			protected PreferenceKey getEnableLoggingPreferenceKey() {
				return ENABLE_LOGGING;
			}

			protected PreferenceKey getLogFileNamePreferenceKey() {
				return LOG_FILE_NAME;
			}

			protected PreferenceKey getLogFilePathPreferenceKey() {
				return LOG_FILE_PATH;
			}
		};
	}

	protected String getHelpId() {
		return null;
	}

	protected String getPreferencePageId() {
		return PREFERENCE_PAGE_ID;
	}

	protected String getProjectHelpId() {
		return null;
	}

	protected String getPropertyPageId() {
		return PROPERTY_PAGE_ID;
	}

	protected void setDescription() {
		setDescription(PreferenceMessages.OctclipseEngineDescription);
	}

	protected void setPreferenceStore() {
		setPreferenceStore(OctclipseLaunchingPlugin.getDefault()
				.getPreferenceStore());
	}
}
