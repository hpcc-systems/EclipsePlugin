/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
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

public class OctaveNewFunctionWizard extends NewSourceModuleWizard {
	public static final String ID_WIZARD = "org.seisint.eclide.ui.wizards.OctaveNewFunctionWizard"; //$NON-NLS-1$
	
	public OctaveNewFunctionWizard() {
		setDefaultPageImageDescriptor(OctaveImages.DESC_WIZBAN_FILE_CREATION);
		setDialogSettings(DLTKUIPlugin.getDefault().getDialogSettings());
		setWindowTitle(OctaveWizardMessages.OctaveNewFunctionWizard_title);
	}
	
	protected NewSourceModulePage createNewSourceModulePage() {
		return new OctaveNewFilePage() {
			protected String getPageTitle() {
				return OctaveWizardMessages.OctaveNewFunctionPage_title;
			}

			protected String getPageDescription() {
				return OctaveWizardMessages.OctaveNewFunctionPage_desc;
			}
			protected String getFileName() {
				final String fileText = getFileText();

				String[] extensions = new String[] {"ecl"};
				for (int i = 0; i < extensions.length; ++i) {
					String extension = extensions[i];
					if (extension.length() > 0 && fileText.endsWith("." + extension)) {
						return fileText;
					}
				}

				return fileText + "." + extensions[0];
			}
			protected String getFileContent() {
				String text = getFileText();
				return "export " + text + " := 'TODO';";
			}
		};
	}

}
