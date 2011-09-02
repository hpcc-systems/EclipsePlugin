/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

package org.hpccsystems.eclide.text;

import java.util.ArrayList;

import org.eclipse.jface.text.rules.*;
import org.eclipse.jface.text.*;
import org.eclipse.swt.SWT;
import org.hpccsystems.eclide.editors.ColorManager;

public class ECLScanner extends RuleBasedScanner {
	
	IToken variable;
	IToken constant;
	IToken comment;
	IToken string;
	IToken other;
	IToken[] keyword;
	IToken mcomment;

	public ECLScanner(ColorManager colorManager) {
		
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
