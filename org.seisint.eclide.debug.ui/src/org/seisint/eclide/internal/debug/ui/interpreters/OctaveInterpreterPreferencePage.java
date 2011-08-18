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
package org.seisint.eclide.internal.debug.ui.interpreters;

import org.eclipse.dltk.internal.debug.ui.interpreters.InterpretersBlock;
import org.eclipse.dltk.internal.debug.ui.interpreters.ScriptInterpreterPreferencePage;

public class OctaveInterpreterPreferencePage extends ScriptInterpreterPreferencePage {

	public static final String PAGE_ID = "org.seisint.eclide.preferences.interpreters"; //$NON-NLS-1$

	public InterpretersBlock createInterpretersBlock() {
		return new OctaveInterpretersBlock();
	}
}
