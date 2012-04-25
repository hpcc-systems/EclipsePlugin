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

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

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
