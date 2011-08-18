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
package org.seisint.eclide.internal.ui.rules;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/**
 * An implementation of <code>IRule</code> detecting a numerical value.
 */
public class OctaveFloatNumberRule implements IRule {
	protected static final int UNDEFINED = -1;
	protected IToken fToken;
	protected int fColumn = UNDEFINED;

	public OctaveFloatNumberRule(IToken token) {
		Assert.isNotNull(token);
		fToken = token;
	}

	public void setColumnConstraint(int column) {
		if (column < 0)
			column = UNDEFINED;
		fColumn = column;
	}

	public IToken evaluate(ICharacterScanner scanner) {
		int c = scanner.read();
		int p = c;
		if (Character.isDigit((char) c) || c == '.') {
			if (fColumn == UNDEFINED || (fColumn == scanner.getColumn() - 1)) {
				do {
					p = c;
					c = scanner.read();
				} while (Character.isDigit((char) c));
				if ((c != 'e' && c != 'E')) {
					scanner.unread();
				}				
				if (p == '.') {
					scanner.unread();
					return Token.UNDEFINED;
				}
				return fToken;
			}
		}
		scanner.unread();
		return Token.UNDEFINED;
	}
}
