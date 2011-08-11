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


import org.eclipse.dltk.ui.wizards.NewSourceModulePage;
import org.seisint.eclide.core.OctaveNature;

public class OctaveNewFilePage extends NewSourceModulePage {
	
	protected String getRequiredNature() {
		return OctaveNature.NATURE_ID;
	}

	protected String getPageDescription() {
		return OctaveWizardMessages.OctaveNewFilePage_desc;
	}

	protected String getPageTitle() {		
		return OctaveWizardMessages.OctaveNewFilePage_title;
	}
}