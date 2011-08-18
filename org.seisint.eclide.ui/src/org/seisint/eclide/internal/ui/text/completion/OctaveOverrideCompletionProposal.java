/*******************************************************************************
 * Copyright (c) 2007, 2008 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.ui.text.completion;

import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.ui.text.completion.ScriptOverrideCompletionProposal;

public class OctaveOverrideCompletionProposal extends ScriptOverrideCompletionProposal {

	public OctaveOverrideCompletionProposal(IScriptProject jproject,
			ISourceModule cu, String methodName, String[] paramTypes,
			int start, int length, String displayName, String completionProposal) {
		super(jproject, cu, methodName, paramTypes, start, length, displayName,
				completionProposal);
	}
	
}
