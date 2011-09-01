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

public class ECLPartitionScanner extends RuleBasedPartitionScanner {
	public final static String ECL_COMMENT = "__ecl_comment";
	public final static String ECL_JAVADOC = "__ecl_javadoc";
	public final static String ECL_BODY = "__ecl_body";

	public ECLPartitionScanner() {

		IToken eclComment = new Token(ECL_COMMENT);
		IToken eclJavaDoc = new Token(ECL_JAVADOC);
		IToken eclBody = new Token(ECL_BODY);

		ArrayList<IRule> rules= new ArrayList<IRule>();

		//  Javadoc
		rules.add(new MultiLineRule("/**", "*/", eclJavaDoc));

		//  Comments
		rules.add(new EndOfLineRule("//", eclComment));
		rules.add(new MultiLineRule("/*", "*/", eclComment));
		
		//  Actual ECL
		rules.add(new ECLRule(eclBody));

		IPredicateRule[] result= new IPredicateRule[rules.size()];
		rules.toArray(result);
		setPredicateRules(result);
	}
}
