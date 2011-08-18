/*******************************************************************************
 * Copyright (c) 2009 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.ui.text.completion;

import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension4;
import org.eclipse.swt.graphics.Image;

public class OctaveScriptCompletionProposal extends ScriptCompletionProposal 
	implements ICompletionProposalExtension4 {
	
	public OctaveScriptCompletionProposal(String replacementString,
			int replacementOffset, int replacementLength, Image image,
			String displayString, int relevance) {
		super(replacementString, replacementOffset, replacementLength, image,
				displayString, relevance);
	}
	
	public OctaveScriptCompletionProposal(String replacementString,
			int replacementOffset, int replacementLength, Image image,
			String displayString, int relevance, boolean indoc) {
		super(replacementString, replacementOffset, replacementLength, image,
				displayString, relevance, indoc);
	}

	protected boolean isSmartTrigger(char trigger) {
		return false;
	}
	
	public boolean isAutoInsertable() {
		return true;
	}

}
