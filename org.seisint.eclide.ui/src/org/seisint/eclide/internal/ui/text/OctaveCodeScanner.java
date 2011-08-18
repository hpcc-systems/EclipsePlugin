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
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


import org.eclipse.dltk.ui.text.AbstractScriptScanner;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.seisint.eclide.core.OctaveKeywordsManager;
import org.seisint.eclide.core.OctclipsePlugin;
import org.seisint.eclide.internal.ui.rules.OctaveCommentRule;
import org.seisint.eclide.internal.ui.rules.OctaveFloatNumberRule;
import org.seisint.eclide.internal.ui.rules.EclWordRule;
import org.seisint.eclide.runtime.symbols.ISymbolListener;
import org.seisint.eclide.runtime.symbols.Symbol;

public class OctaveCodeScanner extends AbstractScriptScanner implements ISymbolListener {
	
	IToken variable;
	IToken constant;
	IToken comment;
	IToken function;
	IToken other;
	IToken[] keyword;
	IToken mcomment;
	
	private static String fgTokenProperties[] = new String[] {
		OctaveColorConstants.ECL_COMMENT,
		OctaveColorConstants.ECL_DEFAULT,
		OctaveColorConstants.ECL_KEYWORD1,
		OctaveColorConstants.ECL_KEYWORD2,
		OctaveColorConstants.ECL_KEYWORD3,
		OctaveColorConstants.ECL_KEYWORD4,
		OctaveColorConstants.ECL_KEYWORD5,
		OctaveColorConstants.ECL_KEYWORD6,
		OctaveColorConstants.ECL_FUNCTION,
		OctaveColorConstants.ECL_CONSTANT,
		OctaveColorConstants.ECL_VARIABLE,
	};
	
	public OctaveCodeScanner(IColorManager manager, IPreferenceStore store)
	{
		super(manager, store);
		initialize();
	}
	
	void dispose() {
		OctclipsePlugin.getSymbolList().removeChangeListener(this);
	}

	public void update() {
		List<IRule> rules= createRules();
		if (rules != null) {
			IRule[] result= new IRule[rules.size()];
			rules.toArray(result);
			setRules(result);
		}
	}

	protected List<IRule> createRules() {
		comment = getToken(OctaveColorConstants.ECL_COMMENT);
		variable = getToken(OctaveColorConstants.ECL_VARIABLE);
		constant = getToken(OctaveColorConstants.ECL_CONSTANT);
		function = getToken(OctaveColorConstants.ECL_FUNCTION);
		keyword = new IToken[6];
		keyword[0] = getToken(OctaveColorConstants.ECL_KEYWORD1);
		keyword[1] = getToken(OctaveColorConstants.ECL_KEYWORD2);
		keyword[2] = getToken(OctaveColorConstants.ECL_KEYWORD3);
		keyword[3] = getToken(OctaveColorConstants.ECL_KEYWORD4);
		keyword[4] = getToken(OctaveColorConstants.ECL_KEYWORD5);
		keyword[5] = getToken(OctaveColorConstants.ECL_KEYWORD6);
		other = getToken(OctaveColorConstants.ECL_DEFAULT);
		List<IRule> rules = new ArrayList<IRule>();
		rules.add(new OctaveCommentRule("/*", "*/", comment, (char) 0, false)); //$NON-NLS-1$
		//rules.add(new OctaveCommentRule("%{", "%}", comment, (char) 0, false)); //$NON-NLS-1$
		rules.add(new OctaveCommentRule("//", null, comment, (char) 0, true)); //$NON-NLS-1$	
		//rules.add(new OctaveCommentRule("#", null, comment, (char) 0, true)); //$NON-NLS-1$
		rules.add(new WhitespaceRule(new OctaveWhitespaceDetector()));
		rules.add(new OctaveFloatNumberRule( constant ));
		EclWordRule wordRule = new EclWordRule(new OctaveWordDetector(), other, true);
		Vector<Symbol> syms = OctclipsePlugin.getSymbolList().getSymbols(Symbol.BUILTIN_FUNCTION);
		for (Iterator<Symbol> i = syms.iterator(); i.hasNext(); )
			wordRule.addWord(((Symbol)i.next()).getName(), function);
		for (int i = 0 ; i < 6; i++){
			for (int j = 0; j < OctaveKeywordsManager.getKeywords(i).length; j++) {
				wordRule.addWord(OctaveKeywordsManager.getKeywords(i)[j], keyword[i]);
			}
		}
		rules.add(wordRule);
		setDefaultReturnToken(other);
		return rules;
	}

	protected String[] getTokenProperties() {
		return fgTokenProperties;
	}
	
}
