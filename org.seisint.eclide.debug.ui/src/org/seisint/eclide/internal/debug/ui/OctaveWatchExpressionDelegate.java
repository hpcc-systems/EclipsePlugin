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

import org.eclipse.dltk.internal.debug.core.model.ScriptWatchExpressionDelegate;

public class OctaveWatchExpressionDelegate extends ScriptWatchExpressionDelegate {
	private static final String DUMMY_VAR = "dummy_octave_var"
			+ Long.toString(System.currentTimeMillis());

	protected String prepareExpression(String expression) {
		return DUMMY_VAR + " = " + "\"" + expression + "\"";
	}
}
