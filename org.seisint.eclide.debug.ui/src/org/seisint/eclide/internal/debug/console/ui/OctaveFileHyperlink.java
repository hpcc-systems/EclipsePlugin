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

import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.TextConsole;

public class OctaveFileHyperlink implements IHyperlink {

	private TextConsole fConsole;
	
	public OctaveFileHyperlink(TextConsole console) {
		fConsole = console;
	}
	
	protected TextConsole getConsole() {
		return fConsole;
	}
	
	public void linkActivated() {
	}

	public void linkEntered() {
	}

	public void linkExited() {
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

import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.TextConsole;

public class OctaveFileHyperlink implements IHyperlink {

	private TextConsole fConsole;
	
	public OctaveFileHyperlink(TextConsole console) {
		fConsole = console;
	}
	
	protected TextConsole getConsole() {
		return fConsole;
	}
	
	public void linkActivated() {
	}

	public void linkEntered() {
	}

	public void linkExited() {
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
