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
package org.seisint.eclide.internal.ui.templates;


import org.eclipse.dltk.ui.templates.ScriptTemplateAccess;
import org.eclipse.jface.preference.IPreferenceStore;
import org.seisint.eclide.internal.ui.OctclipseUIPlugin;

public class OctaveTemplateAccess extends ScriptTemplateAccess {
	
	private static final String CUSTOM_TEMPLATES_KEY = "org.seisint.eclide.templates";
	
	private static OctaveTemplateAccess instance;
	
	public static OctaveTemplateAccess getInstance() {
		if (instance == null) {
			instance = new OctaveTemplateAccess();
		}
		return instance;
	}
	
	/*
	 * @see org.eclipse.dltk.ui.templates.ScriptTemplateAccess#getContextTypeId()
	 */
	protected String getContextTypeId() {
		return OctaveUniversalTemplateContextType.CONTEXT_TYPE_ID;
	}

	/*
	 * @see org.eclipse.dltk.ui.templates.ScriptTemplateAccess#getCustomTemplatesKey()
	 */
	protected String getCustomTemplatesKey() {
		return CUSTOM_TEMPLATES_KEY;
	}

	/*
	 * @see org.eclipse.dltk.ui.templates.ScriptTemplateAccess#getPreferenceStore()
	 */
	protected IPreferenceStore getPreferenceStore() { 
		return OctclipseUIPlugin.getDefault().getPreferenceStore();
	}
}
