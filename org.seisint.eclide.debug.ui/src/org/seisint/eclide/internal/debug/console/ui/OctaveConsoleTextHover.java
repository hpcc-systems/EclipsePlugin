<<<<<<< HEAD
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

import java.io.IOException;

import org.eclipse.dltk.console.IScriptConsoleShell;
import org.eclipse.dltk.console.ui.IScriptConsoleViewer;
import org.eclipse.dltk.console.ui.ScriptConsoleTextHover;
import org.eclipse.jface.text.IRegion;

public class OctaveConsoleTextHover extends ScriptConsoleTextHover {

	private IScriptConsoleShell interpreterShell;
	
	public OctaveConsoleTextHover(IScriptConsoleShell interpreter) {
		interpreterShell = interpreter;
	}

	protected String getHoverInfoImpl(IScriptConsoleViewer viewer,
			IRegion hoverRegion) {
		try {
			int cursorPosition = hoverRegion.getOffset()
					- viewer.getCommandLineOffset();
			String commandLine = viewer.getCommandLine();
			return interpreterShell.getDescription(commandLine, cursorPosition);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
=======
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

import java.io.IOException;

import org.eclipse.dltk.console.IScriptConsoleShell;
import org.eclipse.dltk.console.ui.IScriptConsoleViewer;
import org.eclipse.dltk.console.ui.ScriptConsoleTextHover;
import org.eclipse.jface.text.IRegion;

public class OctaveConsoleTextHover extends ScriptConsoleTextHover {

	private IScriptConsoleShell interpreterShell;
	
	public OctaveConsoleTextHover(IScriptConsoleShell interpreter) {
		interpreterShell = interpreter;
	}

	protected String getHoverInfoImpl(IScriptConsoleViewer viewer,
			IRegion hoverRegion) {
		try {
			int cursorPosition = hoverRegion.getOffset()
					- viewer.getCommandLineOffset();
			String commandLine = viewer.getCommandLine();
			return interpreterShell.getDescription(commandLine, cursorPosition);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
