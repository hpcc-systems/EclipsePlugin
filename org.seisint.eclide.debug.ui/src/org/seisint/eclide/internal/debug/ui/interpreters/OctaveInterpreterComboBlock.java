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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterComboBlock;
import org.eclipse.dltk.internal.debug.ui.interpreters.IInterpreterComboBlockContext;
import org.eclipse.dltk.launching.InterpreterContainerHelper;


public class OctaveInterpreterComboBlock extends AbstractInterpreterComboBlock {
	
	protected OctaveInterpreterComboBlock(IInterpreterComboBlockContext tab) {
		super(tab);
	}
	
	protected void showInterpreterPreferencePage()  { 
		showPrefPage(OctaveInterpreterPreferencePage.PAGE_ID); //$NON-NLS-1$
	}

}
