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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


import org.eclipse.core.runtime.IPath;
import org.seisint.eclide.internal.runtime.symbols.OctclipseRuntimeSymbolsPlugin;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class SymbolSerializer {

	public static final String SYMBOL_FILENAME = "/exported_symbols.xml";
	public static final String SYMBOL = "symbol";
	public static final String SYMBOLS = "symbols";
	
	static {
		/* TODO: place default xml file in state location ? */
	}	
	
	public static List<Symbol> deserializeFromString(String xml) {
		List<Symbol> completions = new ArrayList<Symbol>();
		XStream xstream = new XStream(new DomDriver());
		xstream.setMode(XStream.NO_REFERENCES);
		xstream.alias(SYMBOLS, ArrayList.class);
		xstream.alias(SYMBOL, Symbol.class);
		try
		{
			completions.addAll((ArrayList)xstream.fromXML(xml));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return completions;
	}
	
	public static HashMap<String, Symbol> deserializeFromFile() {
		IPath directory = OctclipseRuntimeSymbolsPlugin.getDefault().getStateLocation();
		File symFile = new File(directory.toFile().getAbsolutePath(), SymbolSerializer.SYMBOL_FILENAME);
		HashMap<String, Symbol> hash = new HashMap<String, Symbol>();
		if (!symFile.exists())
			return hash;
		FileInputStream io = null; 
		try {
			io = new FileInputStream(symFile);
			XStream xstream = new XStream(new DomDriver());
			xstream.alias(SYMBOLS, ArrayList.class);
			xstream.alias(SYMBOL, Symbol.class);
			Object o = xstream.fromXML(io);
			if (o instanceof ArrayList<?>) {
				ArrayList<Symbol> list = (ArrayList)o;
				for (Iterator<Symbol> it = list.iterator(); it.hasNext(); ) {
					Symbol s = it.next();
					hash.put(s.getName(), s);
				}
			}
			io.close();
		} catch (Exception e) {
			/* The symbol file is corrupted or unreadable... */
			if (symFile.exists())
				symFile.delete();
		}
		return hash;
	}
	
	public static void serializeToFile(HashMap<String, Symbol> symbols) {
		IPath directory = OctclipseRuntimeSymbolsPlugin.getDefault().getStateLocation();
		File symFile = new File(directory.toFile().getAbsolutePath(), SymbolSerializer.SYMBOL_FILENAME);
		FileOutputStream io = null;
		try {
			List<Symbol> values = new ArrayList<Symbol>(symbols.values());
			XStream xstream = new XStream(new DomDriver());
			xstream.alias(SYMBOLS, List.class);
			xstream.alias(SYMBOL, Symbol.class);
			io = new FileOutputStream(symFile);
			xstream.toXML(values, io);
			io.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
