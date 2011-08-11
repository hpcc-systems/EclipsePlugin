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
package org.seisint.eclide.internal.debug.console.ui;

import org.eclipse.dltk.console.ui.ScriptConsole;
import org.seisint.eclide.console.OctaveInterpreter;

public class OctaveConsole extends ScriptConsole {
	public static final String CONSOLE_TYPE = "octave_console";
	public static final String CONSOLE_NAME = "ECL Console";

	private OctaveInterpreter octaveInterpreter;
	
	public OctaveConsole(OctaveInterpreter interpreter, String id) {
		super(CONSOLE_NAME + " [" + id + "]", CONSOLE_TYPE);
		setInterpreter(interpreter);
		octaveInterpreter = interpreter;
		setTextHover(new OctaveConsoleTextHover(interpreter));
		setContentAssistProcessor(new OctaveConsoleCompletionProcessor(interpreter));
	}
	
	OctaveInterpreter getInterpreter() {
		return octaveInterpreter;
	}

}
