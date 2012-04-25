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

import java.util.ArrayList;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.hpccsystems.eclide.editors.ECLColorManager;

public class ECLTagScanner extends RuleBasedScanner {

	public ECLTagScanner(ECLColorManager manager) {
		IToken string =
				new Token(
						new TextAttribute(manager.getColor(IECLColorConstants.ECL_STRING)));

		//IRule[] rules = new IRule[3];
		ArrayList<IRule> rules= new ArrayList<IRule>();

		// Add rule for double quotes
		rules.add(new SingleLineRule("\"", "\"", string, '\\'));
		// Add a rule for single quotes
		rules.add(new SingleLineRule("'", "'", string, '\\'));
		// Add generic whitespace rule.
		rules.add(new WhitespaceRule(new ECLWhitespaceDetector()));

		IRule[] result= new IRule[rules.size()];
		rules.toArray(result);
		setRules(result);
	}
}
