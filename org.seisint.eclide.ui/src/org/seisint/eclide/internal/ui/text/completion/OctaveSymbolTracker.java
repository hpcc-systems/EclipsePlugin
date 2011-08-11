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
package org.seisint.eclide.internal.ui.text.completion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.seisint.eclide.core.OctaveKeywordsManager;
import org.seisint.eclide.core.OctclipsePlugin;
import org.seisint.eclide.runtime.symbols.ISymbolListener;
import org.seisint.eclide.runtime.symbols.Symbol;


public class OctaveSymbolTracker implements ISymbolListener {
	/**
	 * 
	 */
	Vector<Symbol> mysyms = new Vector<Symbol>(75);
	
	public OctaveSymbolTracker() {
		OctclipsePlugin.getSymbolList().addChangeListener(this);
		update();
	}
	
	protected void finalize() {
		OctclipsePlugin.getSymbolList().removeChangeListener(this);
	}
	
	public void update() {
		mysyms.clear();
		mysyms.addAll(OctclipsePlugin.getSymbolList().getSymbols(Symbol.BUILTIN_FUNCTION));
	}
	
	public HashMap<String, Symbol> suggestSymbols(String currentWord) {
		HashMap<String, Symbol> suggestions = new HashMap<String, Symbol>();				
		for (Iterator<Symbol> i = mysyms.iterator(); i.hasNext(); )
		{
			Symbol s = i.next();
			String name = s.getName();
			if (name.startsWith(currentWord)) {
				suggestions.put(name, s);
			} 
		}
		return suggestions;
	}
	
	public List<String> suggestKeywords(String currentWord) {
		List<String> suggestions = new ArrayList<String>();				
		for (int i = 0; i < 6; ++i)
		{
			for (int j = 0; j < OctaveKeywordsManager.getKeywords(i).length; j++)
			{
				String name = OctaveKeywordsManager.getKeywords(i)[j];
				if (name.startsWith(currentWord)) {
					suggestions.add(name);
				}				
			}
		}
		return suggestions;
	}
	
}