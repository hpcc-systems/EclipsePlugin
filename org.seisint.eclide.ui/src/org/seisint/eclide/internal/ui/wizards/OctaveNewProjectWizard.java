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
package org.seisint.eclide.internal.ui.wizards;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.ui.DLTKUIPlugin;
import org.eclipse.dltk.ui.util.BusyIndicatorRunnableContext;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.dltk.ui.wizards.BuildpathsBlock;
import org.eclipse.dltk.ui.wizards.ProjectWizard;
import org.eclipse.dltk.ui.wizards.ProjectWizardFirstPage;
import org.eclipse.dltk.ui.wizards.ProjectWizardSecondPage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.ui.OctclipseUIPlugin;
import org.seisint.eclide.internal.ui.preferences.OctaveBuildPathsBlock;

public class OctaveNewProjectWizard extends ProjectWizard implements
		INewWizard, IExecutableExtension {

	public static final String ID_WIZARD = "org.seisint.eclide.ui.wizards.OctaveNewProjectWizard"; //$NON-NLS-1$
	
	private ProjectWizardFirstPage fFirstPage;
	private ProjectWizardSecondPage fSecondPage;

	private IConfigurationElement fConfigElement;

	public OctaveNewProjectWizard() {
		//setDefaultPageImageDescriptor(OctaveImages.DESC_WIZBAN_PROJECT_CREATION);
		setDialogSettings(DLTKUIPlugin.getDefault().getDialogSettings());
		setWindowTitle(OctaveWizardMessages.OctaveNewProjectWizard_title);
	}

	public void addPages() {
		super.addPages();
		fFirstPage = new ProjectWizardFirstPage() {

			final class OctaveInterpreterGroup extends AbstractInterpreterGroup {

				public OctaveInterpreterGroup(Composite composite) {
					super(composite);
				}

				protected String getIntereprtersPreferencePageId() {
					return "org.seisint.eclide.internal.ui.wizards.OctaveProjectWizard";
				}

			};

			protected IInterpreterGroup createInterpreterGroup(Composite parent) {
				return new OctaveInterpreterGroup(parent);
			}
			
			protected boolean interpeterRequired() {
				return false;
			}

		};
		fFirstPage
				.setTitle(OctaveWizardMessages.OctaveNewProjectWizardFirstPage_title);
		fFirstPage
				.setDescription(OctaveWizardMessages.OctaveNewProjectWizardFirstPage_desc);
		addPage(fFirstPage);
		fSecondPage = new ProjectWizardSecondPage(fFirstPage) {
			protected BuildpathsBlock createBuildpathBlock(
					IStatusChangeListener listener) {
				return new OctaveBuildPathsBlock(
						new BusyIndicatorRunnableContext(), listener, 0,
						useNewSourcePage(), null);
			}
		};
		addPage(fSecondPage);
	}

	public boolean performFinish() {
		boolean res = super.performFinish();
		if (res) {
			BasicNewProjectResourceWizard.updatePerspective(fConfigElement);
			selectAndReveal(fSecondPage.getScriptProject().getProject());
		}
		return res;
	}
	
	/*
	 * Stores the configuration element for the wizard. The config element will
	 * be used in <code>performFinish</code> to set the result perspective.
	 */
	public void setInitializationData(IConfigurationElement cfig,
			String propertyName, Object data) {
		fConfigElement = cfig;
	}

	public String getScriptNature() {
		return OctaveNature.NATURE_ID;
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
package org.seisint.eclide.internal.ui.wizards;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.ui.DLTKUIPlugin;
import org.eclipse.dltk.ui.util.BusyIndicatorRunnableContext;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.dltk.ui.wizards.BuildpathsBlock;
import org.eclipse.dltk.ui.wizards.ProjectWizard;
import org.eclipse.dltk.ui.wizards.ProjectWizardFirstPage;
import org.eclipse.dltk.ui.wizards.ProjectWizardSecondPage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.ui.OctclipseUIPlugin;
import org.seisint.eclide.internal.ui.preferences.OctaveBuildPathsBlock;

public class OctaveNewProjectWizard extends ProjectWizard implements
		INewWizard, IExecutableExtension {

	public static final String ID_WIZARD = "org.seisint.eclide.ui.wizards.OctaveNewProjectWizard"; //$NON-NLS-1$
	
	private ProjectWizardFirstPage fFirstPage;
	private ProjectWizardSecondPage fSecondPage;

	private IConfigurationElement fConfigElement;

	public OctaveNewProjectWizard() {
		//setDefaultPageImageDescriptor(OctaveImages.DESC_WIZBAN_PROJECT_CREATION);
		setDialogSettings(DLTKUIPlugin.getDefault().getDialogSettings());
		setWindowTitle(OctaveWizardMessages.OctaveNewProjectWizard_title);
	}

	public void addPages() {
		super.addPages();
		fFirstPage = new ProjectWizardFirstPage() {

			final class OctaveInterpreterGroup extends AbstractInterpreterGroup {

				public OctaveInterpreterGroup(Composite composite) {
					super(composite);
				}

				protected String getIntereprtersPreferencePageId() {
					return "org.seisint.eclide.internal.ui.wizards.OctaveProjectWizard";
				}

			};

			protected IInterpreterGroup createInterpreterGroup(Composite parent) {
				return new OctaveInterpreterGroup(parent);
			}
			
			protected boolean interpeterRequired() {
				return false;
			}

		};
		fFirstPage
				.setTitle(OctaveWizardMessages.OctaveNewProjectWizardFirstPage_title);
		fFirstPage
				.setDescription(OctaveWizardMessages.OctaveNewProjectWizardFirstPage_desc);
		addPage(fFirstPage);
		fSecondPage = new ProjectWizardSecondPage(fFirstPage) {
			protected BuildpathsBlock createBuildpathBlock(
					IStatusChangeListener listener) {
				return new OctaveBuildPathsBlock(
						new BusyIndicatorRunnableContext(), listener, 0,
						useNewSourcePage(), null);
			}
		};
		addPage(fSecondPage);
	}

	public boolean performFinish() {
		boolean res = super.performFinish();
		if (res) {
			BasicNewProjectResourceWizard.updatePerspective(fConfigElement);
			selectAndReveal(fSecondPage.getScriptProject().getProject());
		}
		return res;
	}
	
	/*
	 * Stores the configuration element for the wizard. The config element will
	 * be used in <code>performFinish</code> to set the result perspective.
	 */
	public void setInitializationData(IConfigurationElement cfig,
			String propertyName, Object data) {
		fConfigElement = cfig;
	}

	public String getScriptNature() {
		return OctaveNature.NATURE_ID;
	}
	
}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
