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
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.handlers.ShowPerspectiveHandler;
import org.eclipse.core.runtime.*;
import org.eclipse.jface.operation.*;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.CoreException;
import org.hpccsystems.eclide.builder.ECLNature;
import org.hpccsystems.eclide.perspectives.ECLPerspective;

public class ECLNewProjectWizard extends Wizard implements INewWizard {
	private ECLNewProjectWizardPage page;
	private ISelection selection;
	
	public ECLNewProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	public void addPages() {
		page = new ECLNewProjectWizardPage(selection);
		addPage(page);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	public boolean performFinish() {
		final String projectName = page.getProjectName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		IWorkbench workbench = PlatformUI.getWorkbench();
        try {
			workbench.showPerspective(ECLPerspective.PERSPECTIVE_ID, workbench.getActiveWorkbenchWindow());
		} catch (WorkbenchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	private void doFinish(String projectName, IProgressMonitor monitor)
			throws CoreException {

		// create a sample project
		monitor.beginTask("Creating " + projectName, 1);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject newProject = root.getProject(projectName);
		if (!newProject.exists()) {
			IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());		
			desc.setLocationURI(null);
			try {
				newProject.create(desc, monitor);
				if (!newProject.isOpen()) {
					newProject.open(monitor);
				}
			} catch (CoreException e) {
				e.printStackTrace();				
			}
		}

		IProjectDescription desc = newProject.getDescription();		
		String[] prevNatures = desc.getNatureIds();
        String[] newNatures = new String[prevNatures.length + 1];
        System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
        newNatures[prevNatures.length] = ECLNature.NATURE_ID;
        desc.setNatureIds(newNatures);	
        newProject.setDescription(desc, monitor);
        
		monitor.worked(1);
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "org.hpccsystems.eclide", IStatus.OK, message, null);
		throw new CoreException(status);
	}
}
