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
package org.seisint.eclide.internal.ui.text.completion;


import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.dltk.ui.text.completion.ContentAssistPreference;
import org.seisint.eclide.internal.ui.OctclipseUIPlugin;

public class OctaveContentAssistPreference extends ContentAssistPreference {
	static OctaveContentAssistPreference sDefault;
	
	protected ScriptTextTools getTextTools() {
		return OctclipseUIPlugin.getDefault().getTextTools();
	}

	public static ContentAssistPreference getDefault() {
		if( sDefault == null ) {
			sDefault = new OctaveContentAssistPreference();
		}
		return sDefault;
	}
}
