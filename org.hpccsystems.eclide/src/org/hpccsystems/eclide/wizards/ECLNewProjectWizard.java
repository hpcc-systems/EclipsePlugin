/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

package org.hpccsystems.eclide.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.core.runtime.*;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;

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

	public void addPages() {
		super.addPages();
	    _pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
	    _pageOne.setTitle(WIZARD_NAME);
	    _pageOne.setDescription(PAGE_NAME);
		addPage(_pageOne);
	}

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
