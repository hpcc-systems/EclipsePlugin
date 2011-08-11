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
import org.eclipse.dltk.ui.templates.ScriptTemplateCompletionProcessor;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;

public class OctaveTemplateCompletionProcessor extends
		ScriptTemplateCompletionProcessor {

	private static char[] IGNORE = new char[] { '.' };
	
	public OctaveTemplateCompletionProcessor(
			ScriptContentAssistInvocationContext context) {
		super(context);
	}

	protected String getContextTypeId() {
		return OctaveUniversalTemplateContextType.CONTEXT_TYPE_ID;
	}

	protected char[] getIgnore() {
		return IGNORE;
	}

	protected ScriptTemplateAccess getTemplateAccess() {
		return OctaveTemplateAccess.getInstance();
	}
	
}
