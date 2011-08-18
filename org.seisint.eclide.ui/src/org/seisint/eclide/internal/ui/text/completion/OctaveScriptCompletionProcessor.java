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


import org.eclipse.dltk.ui.text.completion.CompletionProposalLabelProvider;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProcessor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.ui.IEditorPart;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.ui.OctclipseUIPlugin;

public class OctaveScriptCompletionProcessor extends ScriptCompletionProcessor {
	
	public OctaveScriptCompletionProcessor(IEditorPart editor,
			ContentAssistant assistant, String partition) {
		super(editor, assistant, partition);
	}
	
	/*
	 * @see org.eclipse.dltk.ui.text.completion.ScriptCompletionProcessor#getNatureId()
	 */
	protected String getNatureId() {
		return OctaveNature.NATURE_ID;
	}

}