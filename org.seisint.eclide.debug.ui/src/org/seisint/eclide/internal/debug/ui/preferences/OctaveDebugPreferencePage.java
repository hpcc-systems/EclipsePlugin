<<<<<<< HEAD
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
import org.eclipse.dltk.internal.ui.text.PreferencesAdapter;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.seisint.eclide.debug.OctclipseDebugPlugin;

@SuppressWarnings("restriction")
public class OctaveDebugPreferencePage extends
	AbstractConfigurationBlockPropertyAndPreferencePage {
	
	private static final String PREFERENCE_PAGE_ID = "org.seisint.eclide.preferences.debug";
	private static final String PROPERTY_PAGE_ID = "org.seisint.eclide.propertyPage.debug";
	
	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		setDescription(OctaveDebugPreferencesMessages.PreferencesDescription);
	}

	protected void setPreferenceStore() {
		setPreferenceStore(new PreferencesAdapter(OctclipseDebugPlugin.getDefault()
				.getPluginPreferences()));
	}

	protected AbstractOptionsBlock createOptionsBlock(
			IStatusChangeListener newStatusChangedListener, IProject project,
			IWorkbenchPreferenceContainer container) {
		return new AbstractOptionsBlock(newStatusChangedListener, project,
				new PreferenceKey[0], container) {

			protected Control createOptionsBlock(Composite parent) {
				return parent;
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
	
}
=======
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
import org.eclipse.dltk.internal.ui.text.PreferencesAdapter;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.seisint.eclide.debug.OctclipseDebugPlugin;

@SuppressWarnings("restriction")
public class OctaveDebugPreferencePage extends
	AbstractConfigurationBlockPropertyAndPreferencePage {
	
	private static final String PREFERENCE_PAGE_ID = "org.seisint.eclide.preferences.debug";
	private static final String PROPERTY_PAGE_ID = "org.seisint.eclide.propertyPage.debug";
	
	protected String getHelpId() {
		return null;
	}

	protected void setDescription() {
		setDescription(OctaveDebugPreferencesMessages.PreferencesDescription);
	}

	protected void setPreferenceStore() {
		setPreferenceStore(new PreferencesAdapter(OctclipseDebugPlugin.getDefault()
				.getPluginPreferences()));
	}

	protected AbstractOptionsBlock createOptionsBlock(
			IStatusChangeListener newStatusChangedListener, IProject project,
			IWorkbenchPreferenceContainer container) {
		return new AbstractOptionsBlock(newStatusChangedListener, project,
				new PreferenceKey[0], container) {

			protected Control createOptionsBlock(Composite parent) {
				return parent;
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
	
}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
