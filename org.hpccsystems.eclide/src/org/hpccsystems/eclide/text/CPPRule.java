/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.eclide.text;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;

public class CPPRule extends MultiLineRule {

	public CPPRule(IToken token) {
		super("beginc++", "endc++", token);
	}

	@Override
	protected boolean sequenceDetected(ICharacterScanner scanner, char[] sequence, boolean eofAllowed) {
		return super.sequenceDetected(scanner, sequence, eofAllowed);
	}
}
