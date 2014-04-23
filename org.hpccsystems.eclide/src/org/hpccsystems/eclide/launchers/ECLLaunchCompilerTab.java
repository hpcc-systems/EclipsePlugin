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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.hpccsystems.eclide.resources.Messages;
import org.hpccsystems.internal.ECLLaunchConfigurationTab;
import org.hpccsystems.internal.data.ClientTools;

@SuppressWarnings("restriction")
public class ECLLaunchCompilerTab extends ECLLaunchConfigurationTab {
	public static final String P_OVERRIDEDEFAULTS = "overrideDefaultsPreference"; //$NON-NLS-1$
	public static final boolean P_OVERRIDEDEFAULTS_DEFAULT = false;

	private class WidgetListener extends SelectionAdapter implements ModifyListener {
		@Override
		public void modifyText(ModifyEvent e) {
			scheduleUpdateJob();
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			scheduleUpdateJob();
		}
	}

	private WidgetListener fListener;

	private Group compilerGroup;
	private Button overrideGlobalFieldEditor;
	private DirectoryFieldEditor clientToolsPathFieldEditor;
	
	private Text commonArgsFieldEditor;
	private Text syntaxArgsFieldEditor;
	private Text compileArgsFieldEditor;
	private Text remoteCompileArgsFieldEditor;
	
	private Text workunitArgsFieldEditor;	

	Group miscGroup;
	private IntegerFieldEditor inlineResultSetLimitFieldEditor;
	private Button monitorDependeesFieldEditor;
	private Button supressSubsequentErrorsFieldEditor;

	ECLLaunchCompilerTab() {
		super();
		fListener = new WidgetListener();
	}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		boolean retVal = super.isValid(launchConfig);

		boolean enableOverrides = overrideGlobalFieldEditor.getSelection();
		clientToolsPathFieldEditor.setEnabled(enableOverrides, compilerGroup);
		
		commonArgsFieldEditor.setEnabled(enableOverrides);
		syntaxArgsFieldEditor.setEnabled(enableOverrides);
		compileArgsFieldEditor.setEnabled(enableOverrides);
		remoteCompileArgsFieldEditor.setEnabled(enableOverrides);
		
		workunitArgsFieldEditor.setEnabled(enableOverrides);

		inlineResultSetLimitFieldEditor.setEnabled(enableOverrides, miscGroup);
		monitorDependeesFieldEditor.setEnabled(enableOverrides);
		supressSubsequentErrorsFieldEditor.setEnabled(enableOverrides);
		
		return retVal;
	}
	
	public void createCompilerEditor(Composite _parent) {
		compilerGroup = SWTFactory.createGroup(_parent, Messages.ECLLaunchCompilerTab_1, 1, 1, GridData.FILL_HORIZONTAL);

		clientToolsPathFieldEditor = new DirectoryFieldEditor(ClientTools.P_TOOLSPATH, Messages.ECLLaunchCompilerTab_2, compilerGroup);
		clientToolsPathFieldEditor.getTextControl(compilerGroup).addModifyListener(fListener);
	}

	public void createCompilerArgumentsEditor(Composite _parent) {
		Group compilerArgsGroup = SWTFactory.createGroup(_parent, Messages.ECLLaunchCompilerTab_3, 1, 1, GridData.FILL_HORIZONTAL);

		SWTFactory.createLabel(compilerArgsGroup, Messages.ECLLaunchCompilerTab_4, 1);
		commonArgsFieldEditor = SWTFactory.createSingleText(compilerArgsGroup, 1);
		commonArgsFieldEditor.addModifyListener(fListener);

		SWTFactory.createLabel(compilerArgsGroup, Messages.ECLLaunchCompilerTab_5, 1);
		syntaxArgsFieldEditor = SWTFactory.createSingleText(compilerArgsGroup, 1);
		syntaxArgsFieldEditor.addModifyListener(fListener);

		SWTFactory.createLabel(compilerArgsGroup, Messages.ECLLaunchCompilerTab_6, 1);
		compileArgsFieldEditor = SWTFactory.createSingleText(compilerArgsGroup, 1);
		compileArgsFieldEditor.addModifyListener(fListener);

		SWTFactory.createLabel(compilerArgsGroup, Messages.ECLLaunchCompilerTab_7, 1);
		remoteCompileArgsFieldEditor = SWTFactory.createSingleText(compilerArgsGroup, 1);
		remoteCompileArgsFieldEditor.addModifyListener(fListener);
	}

	public void createWorkunitArgumentsEditor(Composite _parent) {
		Group workunitArgsGroup = SWTFactory.createGroup(_parent, Messages.ECLLaunchCompilerTab_8, 1, 1, GridData.FILL_HORIZONTAL);

		SWTFactory.createLabel(workunitArgsGroup, Messages.ECLLaunchCompilerTab_9, 1);
		workunitArgsFieldEditor = SWTFactory.createSingleText(workunitArgsGroup, 1);
		workunitArgsFieldEditor.addModifyListener(fListener);
	}

	public void createMiscellaneousEditor(Composite _parent) {
		miscGroup = SWTFactory.createGroup(_parent, Messages.ECLLaunchCompilerTab_10, 1, 1, GridData.FILL_HORIZONTAL);

		SWTFactory.createLabel(miscGroup, Messages.ECLLaunchCompilerTab_11, 1);
		inlineResultSetLimitFieldEditor = new IntegerFieldEditor(ClientTools.P_INLINERESULTLIMIT, Messages.ECLLaunchCompilerTab_12, miscGroup);
		inlineResultSetLimitFieldEditor.getTextControl(miscGroup).addModifyListener(fListener);

		monitorDependeesFieldEditor = SWTFactory.createCheckButton(miscGroup, Messages.ECLLaunchCompilerTab_13, null, false, 1);
		monitorDependeesFieldEditor.addSelectionListener(fListener);
		supressSubsequentErrorsFieldEditor = SWTFactory.createCheckButton(miscGroup, Messages.ECLLaunchCompilerTab_14, null, false, 1);
		supressSubsequentErrorsFieldEditor.addSelectionListener(fListener);
	}

	@Override
	public void createControl(Composite parent) {
		Composite projComp = SWTFactory.createComposite(parent, parent.getFont(), 1, 1, GridData.FILL_BOTH);

		createVerticalSpacer(projComp, 1);
		overrideGlobalFieldEditor = SWTFactory.createCheckButton(projComp, Messages.ECLLaunchCompilerTab_15, null, false, 1);
		overrideGlobalFieldEditor.addSelectionListener(fListener);

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
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			overrideGlobalFieldEditor.setSelection(configuration.getAttribute(P_OVERRIDEDEFAULTS, P_OVERRIDEDEFAULTS_DEFAULT));
			
			clientToolsPathFieldEditor.setStringValue(configuration.getAttribute(ClientTools.P_TOOLSPATH, ClientTools.P_TOOLSPATH_DEFAULT));
			commonArgsFieldEditor.setText(configuration.getAttribute(ClientTools.P_ARGSCOMMON, ClientTools.P_ARGSCOMMON_DEFAULT));
			syntaxArgsFieldEditor.setText(configuration.getAttribute(ClientTools.P_ARGSSYNTAX, ClientTools.P_ARGSSYNTAX_DEFAULT));
			compileArgsFieldEditor.setText(configuration.getAttribute(ClientTools.P_ARGSCOMPILE, ClientTools.P_ARGSCOMPILE_DEFAULT));
			remoteCompileArgsFieldEditor.setText(configuration.getAttribute(ClientTools.P_ARGSCOMPILEREMOTE, ClientTools.P_ARGSCOMPILEREMOTE_DEFAULT));
			
			workunitArgsFieldEditor.setText(configuration.getAttribute(ClientTools.P_ARGSWULOCAL, ClientTools.P_ARGSWULOCAL_DEFAULT));

			inlineResultSetLimitFieldEditor.setStringValue(Integer.toString(configuration.getAttribute(ClientTools.P_INLINERESULTLIMIT, ClientTools.P_INLINERESULTLIMIT_DEFAULT)));
			monitorDependeesFieldEditor.setSelection(configuration.getAttribute(ClientTools.P_MONITORDEPENDEES, ClientTools.P_MONITORDEPENDEES_DEFAULT));
			supressSubsequentErrorsFieldEditor.setSelection(configuration.getAttribute(ClientTools.P_SUPRESSSECONDERROR, ClientTools.P_SUPRESSSECONDERROR_DEFAULT));
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(P_OVERRIDEDEFAULTS, overrideGlobalFieldEditor.getSelection());
		
		configuration.setAttribute(ClientTools.P_TOOLSPATH, clientToolsPathFieldEditor.getStringValue());
		
		configuration.setAttribute(ClientTools.P_ARGSCOMMON, commonArgsFieldEditor.getText());
		configuration.setAttribute(ClientTools.P_ARGSSYNTAX, syntaxArgsFieldEditor.getText());
		configuration.setAttribute(ClientTools.P_ARGSCOMPILE, compileArgsFieldEditor.getText());
		configuration.setAttribute(ClientTools.P_ARGSCOMPILEREMOTE, remoteCompileArgsFieldEditor.getText());
		
		configuration.setAttribute(ClientTools.P_ARGSWULOCAL, workunitArgsFieldEditor.getText());
		
		configuration.setAttribute(ClientTools.P_INLINERESULTLIMIT, inlineResultSetLimitFieldEditor.getIntValue());
		configuration.setAttribute(ClientTools.P_MONITORDEPENDEES, monitorDependeesFieldEditor.getSelection());
		configuration.setAttribute(ClientTools.P_SUPRESSSECONDERROR, supressSubsequentErrorsFieldEditor.getSelection());
	}

	@Override
	public String getName() {
		return Messages.ECLLaunchCompilerTab_16;
	}
}
