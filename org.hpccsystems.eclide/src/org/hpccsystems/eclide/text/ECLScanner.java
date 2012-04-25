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
import org.eclipse.jface.text.rules.NumberRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.swt.SWT;
import org.hpccsystems.eclide.editors.ECLColorManager;

public class ECLScanner extends RuleBasedScanner {

	IToken variable;
	IToken constant;
	IToken comment;
	IToken string;
	IToken other;
	IToken[] keyword;
	IToken mcomment;

	public ECLScanner(ECLColorManager colorManager) {

		//		variable = getToken(ECLColorConstants.ECL_VARIABLE);
		//		constant = getToken(ECLColorConstants.ECL_CONSTANT);
		//		function = getToken(ECLColorConstants.ECL_FUNCTION);
		string = new Token( new TextAttribute(colorManager.getColor(IECLColorConstants.ECL_STRING)));
		keyword = new IToken[6];
		keyword[0] = new Token(new TextAttribute(colorManager.getColor(IECLColorConstants.ECL_KEYWORD1)));;
		keyword[1] = new Token(new TextAttribute(colorManager.getColor(IECLColorConstants.ECL_KEYWORD2), null, SWT.BOLD));;
		keyword[2] = new Token(new TextAttribute(colorManager.getColor(IECLColorConstants.ECL_KEYWORD3)));;
		keyword[3] = new Token(new TextAttribute(colorManager.getColor(IECLColorConstants.ECL_KEYWORD4)));;
		keyword[4] = new Token(new TextAttribute(colorManager.getColor(IECLColorConstants.ECL_KEYWORD5)));;
		keyword[5] = new Token(new TextAttribute(colorManager.getColor(IECLColorConstants.ECL_KEYWORD6)));;
		other = new Token(new TextAttribute(colorManager.getColor(IECLColorConstants.DEFAULT)));

		ArrayList<IRule> rules= new ArrayList<IRule>();
		rules.add(new SingleLineRule("'", "'", string, '\\'));

		IToken number = new Token(new TextAttribute(colorManager.getColor(IECLColorConstants.ECL_NUMBER)));

		ECLWordRule wordRule = new ECLWordRule(new ECLWordDetector(), other, true);
		for (int i = 0 ; i < 6; i++){
			for (int j = 0; j < ECLKeywords.getKeywords(i).length; j++) {
				wordRule.addWord(ECLKeywords.getKeywords(i)[j], keyword[i]);
			}
		}
		rules.add(wordRule);

		rules.add(new NumberRule(number));
		rules.add(new WhitespaceRule(new ECLWhitespaceDetector()));

		IRule[] result= new IRule[rules.size()];
		rules.toArray(result);
		setRules(result);
	}
}
