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
package org.seisint.eclide.internal.ui.search;


import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.ui.search.ScriptSearchPage;
import org.seisint.eclide.core.OctaveLanguageToolkit;

public class OctaveSearchPage extends ScriptSearchPage {
	protected IDLTKLanguageToolkit getLanguageToolkit() {
		return OctaveLanguageToolkit.getDefault();
	}
}