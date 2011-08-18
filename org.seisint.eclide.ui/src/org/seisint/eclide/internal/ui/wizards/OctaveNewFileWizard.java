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


import org.eclipse.dltk.ui.DLTKUIPlugin;
import org.eclipse.dltk.ui.wizards.NewSourceModulePage;
import org.eclipse.dltk.ui.wizards.NewSourceModuleWizard;
import org.seisint.eclide.internal.ui.OctaveImages;

public class OctaveNewFileWizard extends NewSourceModuleWizard {
	public static final String ID_WIZARD = "org.seisint.eclide.ui.wizards.OctaveNewFileWizard"; //$NON-NLS-1$
	
	public OctaveNewFileWizard() {
		setDefaultPageImageDescriptor(OctaveImages.DESC_WIZBAN_FILE_CREATION);
		setDialogSettings(DLTKUIPlugin.getDefault().getDialogSettings());
		setWindowTitle(OctaveWizardMessages.OctaveNewFileWizard_title);
	}

	protected NewSourceModulePage createNewSourceModulePage() {
		return new OctaveNewFilePage();
	}
}