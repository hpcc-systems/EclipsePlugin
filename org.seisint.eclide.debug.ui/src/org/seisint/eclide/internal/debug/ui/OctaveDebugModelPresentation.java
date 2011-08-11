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
package org.seisint.eclide.internal.debug.ui;

import org.eclipse.dltk.debug.core.model.IScriptValue;
import org.eclipse.dltk.debug.ui.ScriptDebugModelPresentation;
import org.eclipse.dltk.internal.debug.core.model.ScriptValue;
import org.eclipse.ui.IEditorInput;

public class OctaveDebugModelPresentation extends ScriptDebugModelPresentation {
	
	private static final String OCTAVE_EDITOR_ID = "org.seisint.eclide.ui.editor.OctaveEditor";

	public String getEditorId(IEditorInput input, Object element) {
		return OCTAVE_EDITOR_ID;
	}
	
	public String getDetailPaneText(IScriptValue value) {
		if (value instanceof ScriptValue) {
			return ((ScriptValue) value).getRawValue();
		}
		return super.getDetailPaneText(value);
	}
}
