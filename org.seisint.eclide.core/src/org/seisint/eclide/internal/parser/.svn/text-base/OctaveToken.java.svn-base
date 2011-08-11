/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.parser;

import org.eclipse.dltk.ast.DLTKToken;

@SuppressWarnings("deprecation")
public class OctaveToken extends DLTKToken {

	private int character;
	
	public OctaveToken(int line, int column, int character) {
		super();
		setLine(line);
		setColumn(column);
		setCharacter(character);
	}
	
	public OctaveToken(int value, String text, int line, int column, int character) {
		super(value, text);
		setLine(line);
		setColumn(column);	
		setCharacter(character);
	}

	public int getCharacter() {
		return character;
	}

	public void setCharacter(int character) {
		this.character = character;
	}
	
	public String toString() {
		return getText();
	}
	
}
