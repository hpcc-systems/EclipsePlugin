/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.seisint.eclide.internal.ui.infoviews;


import org.eclipse.dltk.ui.infoviews.AbstractDocumentationView;
import org.eclipse.jface.preference.IPreferenceStore;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.ui.OctclipseUIPlugin;

public class OctaveDocumentationView extends AbstractDocumentationView {
	protected IPreferenceStore getPreferenceStore() {
		return OctclipseUIPlugin.getDefault().getPreferenceStore();
	}

	protected String getNature() {
		return OctaveNature.NATURE_ID;
	}
}
