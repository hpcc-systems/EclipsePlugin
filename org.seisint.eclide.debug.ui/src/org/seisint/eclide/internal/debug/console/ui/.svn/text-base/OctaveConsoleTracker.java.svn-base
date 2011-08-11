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

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.IPatternMatchListenerDelegate;
import org.eclipse.ui.console.PatternMatchEvent;
import org.eclipse.ui.console.TextConsole;

public class OctaveConsoleTracker implements IPatternMatchListenerDelegate {
	private TextConsole console;
	
	public void connect(TextConsole console) {
		this.console = console;
	}

	public void disconnect() {
		console = null;
	}
	
	protected TextConsole getConsole() {
		return console;
	}

	public void matchFound(PatternMatchEvent event) {
		try {
			int offset = event.getOffset();
			int length = event.getLength();
			IHyperlink link = new OctaveFileHyperlink(console);
			console.addHyperlink(link, offset + 1, length - 2);
		} catch (BadLocationException e) {
		}
	}

}
