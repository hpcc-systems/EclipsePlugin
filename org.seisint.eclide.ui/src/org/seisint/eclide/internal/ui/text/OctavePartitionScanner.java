<<<<<<< HEAD
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
package org.seisint.eclide.internal.ui.text;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.seisint.eclide.internal.ui.rules.OctaveCommentRule;
import org.seisint.eclide.ui.text.OctavePartitions;

public class OctavePartitionScanner extends RuleBasedPartitionScanner {

	public OctavePartitionScanner()
	{
		super();
		IToken string = new Token(OctavePartitions.ECL_STRING);
		IToken singleLineComment = new Token(OctavePartitions.ECL_COMMENT);
		IToken blockComment = new Token(OctavePartitions.ECL_COMMENT);
		List<IRule> rules = new ArrayList<IRule>();
		rules.add(new OctaveCommentRule("/*", "*/", blockComment, (char) 0, false)); //$NON-NLS-1$
		//rules.add(new OctaveCommentRule("%{", "%}", blockComment, (char) 0, false)); //$NON-NLS-1$
		rules.add(new OctaveCommentRule("//", null, singleLineComment, (char) 0, true)); //$NON-NLS-1$	
		//rules.add(new OctaveCommentRule("#", null, singleLineComment, (char) 0, true)); //$NON-NLS-1$
		rules.add(new SingleLineRule("\"", "\"", string, '\\')); //$NON-NLS-1$ //$NON-NLS-2$
		rules.add(new SingleLineRule("'", "'", string, '\\')); //$NON-NLS-1$ //$NON-NLS-2$
		IPredicateRule[] result = new IPredicateRule[rules.size()];
		rules.toArray(result);
		setPredicateRules(result);
	}
	
}
=======
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
package org.seisint.eclide.internal.ui.text;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.seisint.eclide.internal.ui.rules.OctaveCommentRule;
import org.seisint.eclide.ui.text.OctavePartitions;

public class OctavePartitionScanner extends RuleBasedPartitionScanner {

	public OctavePartitionScanner()
	{
		super();
		IToken string = new Token(OctavePartitions.ECL_STRING);
		IToken singleLineComment = new Token(OctavePartitions.ECL_COMMENT);
		IToken blockComment = new Token(OctavePartitions.ECL_COMMENT);
		List<IRule> rules = new ArrayList<IRule>();
		rules.add(new OctaveCommentRule("/*", "*/", blockComment, (char) 0, false)); //$NON-NLS-1$
		//rules.add(new OctaveCommentRule("%{", "%}", blockComment, (char) 0, false)); //$NON-NLS-1$
		rules.add(new OctaveCommentRule("//", null, singleLineComment, (char) 0, true)); //$NON-NLS-1$	
		//rules.add(new OctaveCommentRule("#", null, singleLineComment, (char) 0, true)); //$NON-NLS-1$
		rules.add(new SingleLineRule("\"", "\"", string, '\\')); //$NON-NLS-1$ //$NON-NLS-2$
		rules.add(new SingleLineRule("'", "'", string, '\\')); //$NON-NLS-1$ //$NON-NLS-2$
		IPredicateRule[] result = new IPredicateRule[rules.size()];
		rules.toArray(result);
		setPredicateRules(result);
	}
	
}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
