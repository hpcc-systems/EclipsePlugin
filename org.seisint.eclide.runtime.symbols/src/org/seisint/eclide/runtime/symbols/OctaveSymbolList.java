/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.runtime.symbols;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OctaveSymbolList implements ISymbolList {
	private HashSet<ISymbolListener> changeListeners = new HashSet<ISymbolListener>();
	private HashMap<String, Symbol> savedSymbols = new HashMap<String, Symbol>();
	
	public OctaveSymbolList() {
		savedSymbols.clear();
		savedSymbols.putAll(SymbolSerializer.deserializeFromFile());
		clearSymbols(Symbol.USER_VARIABLE);
		updateListeners();	
	}

	public void updateSymbolsFromRuntime(List<Symbol> symbols, long types) {
		synchronized(this) {
			for (Iterator<Symbol> i = symbols.iterator(); i.hasNext();)
			{
				Object o = i.next();
				if (o instanceof Symbol){
					Symbol s = (Symbol)o;
					savedSymbols.put(s.getName(), s);
				}
			}
			SymbolSerializer.serializeToFile(savedSymbols);
			updateListeners();
		}
	}
	
	public Vector<Symbol> getSymbols(long symbolType) {
		synchronized(this) {
			Vector<Symbol> rv = new Vector<Symbol>();
			for (Iterator<Symbol> i = savedSymbols.values().iterator(); i.hasNext();)
			{
				Symbol s = i.next();
				if ((s.getFlags() & symbolType) != 0) {
					rv.add(s);
				}
			}
			return rv;
		}
	}
	
	public void clearSymbolsNoUpdate(long symbolType) {
		synchronized(this) {
			Vector<Symbol> rv = new Vector<Symbol>();
			for (Iterator<Symbol> i = savedSymbols.values().iterator(); i.hasNext();)
			{
				Symbol s = i.next();
				if ((s.getFlags() & symbolType) != 0) {
					rv.add(s);
				}
			}
			for(Iterator<Symbol> i = rv.iterator(); i.hasNext();) 
			{
				Symbol s = i.next();
				savedSymbols.remove(s.getName());
			}
		}
	}
	
	public void clearSymbols(long symbolType) {
		clearSymbolsNoUpdate(symbolType);
		updateListeners();
	}
	
	/* (non-Javadoc)
	 * @see org.seisint.eclide.runtime.symbols.ISymbolList#updateListeners()
	 */
	public void updateListeners() {
		Iterator<ISymbolListener> iterator = changeListeners.iterator();
		while (iterator.hasNext())  {
			iterator.next().update();
		}
	}
	
	/* (non-Javadoc)
	 * @see org.seisint.eclide.runtime.symbols.ISymbolList#removeChangeListener(org.seisint.eclide.runtime.symbols.ISymbolListener)
	 */
	public void removeChangeListener(ISymbolListener viewer) {
		changeListeners.remove(viewer);
	}

	/* (non-Javadoc)
	 * @see org.seisint.eclide.runtime.symbols.ISymbolList#addChangeListener(org.seisint.eclide.runtime.symbols.ISymbolListener)
	 */
	public void addChangeListener(ISymbolListener viewer) {
		viewer.update();
		changeListeners.add(viewer);
	}
	
}
