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

import org.eclipse.jface.text.*;
import org.eclipse.jface.text.rules.*;
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
