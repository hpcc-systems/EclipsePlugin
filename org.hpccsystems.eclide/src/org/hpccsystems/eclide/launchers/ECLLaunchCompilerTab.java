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

import java.util.HashMap;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.ConfigurationPreferenceStore;
import org.hpccsystems.internal.ECLLaunchConfigurationTab;
import org.hpccsystems.internal.data.ClientTools;

public class ECLLaunchCompilerTab extends ECLLaunchConfigurationTab {
	public static final String P_OVERRIDEDEFAULTS = "overrideDefaultsPreference";
	public static final boolean P_OVERRIDEDEFAULTS_DEFAULT = false;

	private class WidgetListener implements IPropertyChangeListener {
		@Override
		public void propertyChange(PropertyChangeEvent event) {
			scheduleUpdateJob();
		}
	}
	WidgetListener fListener;

	BooleanFieldEditor overrideGlobalFieldEditor;

	ECLLaunchCompilerTab() {
		super();
		fListener = new WidgetListener();
		store = new ConfigurationPreferenceStore(fListener);
	}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		for (String field: fieldMap.keySet()) {
			refreshEnabled(field, overrideGlobalFieldEditor.getBooleanValue());
		}
		return super.isValid(launchConfig);
	}
	
	public void createCompilerEditor(Composite _parent) {
		Group parent = SWTFactory.createGroup(_parent, "Location:", 1, 1, GridData.FILL_HORIZONTAL);

		addField(parent, new DirectoryFieldEditor(ClientTools.P_TOOLSPATH, "&HPCC Client Tools:", parent));
	}

	public void createCompilerArgumentsEditor(Composite _parent) {
		Group parent = SWTFactory.createGroup(_parent, "Compiler Arguments:", 1, 1, GridData.FILL_HORIZONTAL);

		addField(parent, new StringFieldEditor(ClientTools.P_ARGSCOMMON, "&Common:", parent));
		addField(parent, new StringFieldEditor(ClientTools.P_ARGSSYNTAX, "&Syntax Check:", parent));
		addField(parent, new StringFieldEditor(ClientTools.P_ARGSCOMPILE, "&Local Compile:", parent));
		addField(parent, new StringFieldEditor(ClientTools.P_ARGSCOMPILEREMOTE, "&Remote Compile:", parent));
	}

	public void createWorkunitArgumentsEditor(Composite _parent) {
		Group parent = SWTFactory.createGroup(_parent, "Workunit Arguments:", 1, 1, GridData.FILL_HORIZONTAL);

		addField(parent, new StringFieldEditor(ClientTools.P_ARGSWULOCAL, "&Local:", parent));
	}

	public void createMiscellaneousEditor(Composite _parent) {
		Group parent = SWTFactory.createGroup(_parent, "Workunit Arguments:", 1, 1, GridData.FILL_HORIZONTAL);

		addField(parent, new IntegerFieldEditor(ClientTools.P_INLINERESULTLIMIT, "&Inline Result Limit:", parent));
		addField(parent, new BooleanFieldEditor(ClientTools.P_MONITORDEPENDEES, "&Monitor Dependees (requires manual \"Project/Clean...\")", parent));
		addField(parent, new BooleanFieldEditor(ClientTools.P_SUPRESSSECONDERROR, "&Supress Subsequent Errors", parent));
	}

	@Override
	public void createControl(Composite parent) {
		Composite projComp = SWTFactory.createComposite(parent, parent.getFont(), 1, 1, GridData.FILL_BOTH);
		// ((GridLayout)projComp.getLayout()).verticalSpacing = 0;

		createVerticalSpacer(projComp, 1);
		overrideGlobalFieldEditor = new BooleanFieldEditor(P_OVERRIDEDEFAULTS, "&Override Defaults", projComp); 
		store.addField(overrideGlobalFieldEditor);
		createVerticalSpacer(projComp, 1);
		createCompilerEditor(projComp);
		createVerticalSpacer(projComp, 1);
		createCompilerArgumentsEditor(projComp);
		createVerticalSpacer(projComp, 1);
		createWorkunitArgumentsEditor(projComp);
		createVerticalSpacer(projComp, 1);
		createMiscellaneousEditor(projComp);

		setControl(projComp);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		store.setDefault(P_OVERRIDEDEFAULTS, P_OVERRIDEDEFAULTS_DEFAULT);

		IPreferenceStore globalPreferences = Activator.getDefault().getPreferenceStore();
		store.setDefault(ClientTools.P_TOOLSPATH, globalPreferences.getString(ClientTools.P_TOOLSPATH));

		store.setDefault(ClientTools.P_ARGSCOMMON, globalPreferences.getString(ClientTools.P_ARGSCOMMON));
		store.setDefault(ClientTools.P_ARGSSYNTAX, globalPreferences.getString(ClientTools.P_ARGSSYNTAX));
		store.setDefault(ClientTools.P_ARGSCOMPILE, globalPreferences.getString(ClientTools.P_ARGSCOMPILE));
		store.setDefault(ClientTools.P_ARGSCOMPILEREMOTE, globalPreferences.getString(ClientTools.P_ARGSCOMPILEREMOTE));

		store.setDefault(ClientTools.P_ARGSWULOCAL, globalPreferences.getString(ClientTools.P_ARGSWULOCAL));

		store.setDefault(ClientTools.P_INLINERESULTLIMIT, globalPreferences.getInt(ClientTools.P_INLINERESULTLIMIT));
		store.setDefault(ClientTools.P_MONITORDEPENDEES, globalPreferences.getBoolean(ClientTools.P_MONITORDEPENDEES));
		store.setDefault(ClientTools.P_SUPRESSSECONDERROR, globalPreferences.getBoolean(ClientTools.P_SUPRESSSECONDERROR));
		store.setDefault(ClientTools.P_ENABLEMETAPROCESSING, globalPreferences.getBoolean(ClientTools.P_ENABLEMETAPROCESSING));
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		store.loadFields(configuration);
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		store.saveFields(configuration);
	}

	@Override
	public String getName() {
		return "ECLCC Compiler";
	}
}
