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
package org.hpccsystems.eclide.wizards;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.hpccsystems.eclide.project.ECLProjectSupport;

public class ECLNewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {
	private static final String WIZARD_NAME = "New ECL Plug-in Project"; //$NON-NLS-1$
	private static final String PAGE_NAME = "ECL Plug-in Project Wizard"; //$NON-NLS-1$
	private WizardNewProjectCreationPage _pageOne;
	private IConfigurationElement _configurationElement;
	
	public ECLNewProjectWizard() {
		super();
	    setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void addPages() {
		super.addPages();
	    _pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
	    _pageOne.setTitle(WIZARD_NAME);
	    _pageOne.setDescription(PAGE_NAME);
		addPage(_pageOne);
	}

	@Override
	public boolean performFinish() {
        String name = _pageOne.getProjectName();
        URI location = null;
        if (!_pageOne.useDefaults()) {
            location = _pageOne.getLocationURI();
        } // else location == null

        ECLProjectSupport.createProject(name, location);
        BasicNewProjectResourceWizard.updatePerspective(_configurationElement);

        return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
    public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
        _configurationElement = config;
	}
}
