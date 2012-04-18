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

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.hpccsystems.internal.ConfigurationPreferenceStore;
import org.hpccsystems.internal.ECLLaunchConfigurationTab;
import org.hpccsystems.internal.data.ClientTools;

public class ECLLaunchCompilerTab extends ECLLaunchConfigurationTab {

	private class WidgetListener implements IPropertyChangeListener {
		@Override
		public void propertyChange(PropertyChangeEvent event) {
			scheduleUpdateJob();
		}
	}

	private WidgetListener fListener = new WidgetListener();

	ConfigurationPreferenceStore store;

	ECLLaunchCompilerTab() {
		store = new ConfigurationPreferenceStore(fListener);
	}

	public void createCompilerEditor(Composite _parent) {
		Group parent = SWTFactory.createGroup(_parent, "Location:", 1, 1, GridData.FILL_HORIZONTAL);

		store.addField(new DirectoryFieldEditor(ClientTools.P_TOOLSPATH, "&HPCC Client Tools:", parent));
	}

	public void createCompilerArgumentsEditor(Composite _parent) {
		Group parent = SWTFactory.createGroup(_parent, "Compiler Arguments:", 1, 1, GridData.FILL_HORIZONTAL);

		store.addField(new StringFieldEditor(ClientTools.P_ARGSCOMMON, "&Common:", parent));
		store.addField(new StringFieldEditor(ClientTools.P_ARGSSYNTAX, "&Syntax Check:", parent));
		store.addField(new StringFieldEditor(ClientTools.P_ARGSCOMPILE, "&Local Compile:", parent));
		store.addField(new StringFieldEditor(ClientTools.P_ARGSCOMPILEREMOTE, "&Remote Compile:", parent));
	}

	public void createWorkunitArgumentsEditor(Composite _parent) {
		Group parent = SWTFactory.createGroup(_parent, "Workunit Arguments:", 1, 1, GridData.FILL_HORIZONTAL);

		store.addField(new StringFieldEditor(ClientTools.P_ARGSWULOCAL, "&Local:", parent));
	}

	public void createMiscellaneousEditor(Composite _parent) {
		Group parent = SWTFactory.createGroup(_parent, "Workunit Arguments:", 1, 1, GridData.FILL_HORIZONTAL);

		store.addField(new IntegerFieldEditor(ClientTools.P_INLINERESULTLIMIT, "&Inline Result Limit:", parent));
		store.addField(new BooleanFieldEditor(ClientTools.P_MONITORDEPENDEES, "&Monitor Dependees (requires manual \"Project/Clean...\")", parent));
		store.addField(new BooleanFieldEditor(ClientTools.P_SUPRESSSECONDERROR, "&Supress Subsequent Errors", parent));
	}

	@Override
	public void createControl(Composite parent) {
		Composite projComp = SWTFactory.createComposite(parent, parent.getFont(), 1, 1, GridData.FILL_BOTH);
		// ((GridLayout)projComp.getLayout()).verticalSpacing = 0;

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
		try {
			String hpccBinFolder = System.getenv("HPCCBIN");
			store.setDefault(ClientTools.P_TOOLSPATH, hpccBinFolder);
		} catch (Exception e) {
			store.setDefault(ClientTools.P_TOOLSPATH, ClientTools.P_TOOLSPATH);
		}

		store.setDefault(ClientTools.P_ARGSCOMMON, ClientTools.P_ARGSCOMMON_DEFAULT);
		store.setDefault(ClientTools.P_ARGSSYNTAX, ClientTools.P_ARGSSYNTAX_DEFAULT);
		store.setDefault(ClientTools.P_ARGSCOMPILE, ClientTools.P_ARGSCOMPILE_DEFAULT);
		store.setDefault(ClientTools.P_ARGSCOMPILEREMOTE, ClientTools.P_ARGSCOMPILEREMOTE_DEFAULT);

		store.setDefault(ClientTools.P_ARGSWULOCAL, ClientTools.P_ARGSWULOCAL_DEFAULT);

		store.setDefault(ClientTools.P_INLINERESULTLIMIT, ClientTools.P_INLINERESULTLIMIT_DEFAULT);
		store.setDefault(ClientTools.P_MONITORDEPENDEES, ClientTools.P_MONITORDEPENDEES_DEFAULT);
		store.setDefault(ClientTools.P_SUPRESSSECONDERROR, ClientTools.P_SUPRESSSECONDERROR_DEFAULT);
		store.setDefault(ClientTools.P_ENABLEMETAPROCESSING, ClientTools.P_ENABLEMETAPROCESSING_DEFAULT);
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
