/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.console;

import java.util.ArrayList;
import java.util.List;

import org.seisint.eclide.runtime.symbols.Symbol;
import org.seisint.eclide.runtime.symbols.SymbolSerializer;


public final class OctaveConsoleXmlHelper {
	
	/* Old hand-generated XML */
	private static String XML_HEADER_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\" ?>";
	
	/* Auto-generated XML from POCO Document */
	private static String XML_HEADER_2 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
	
	private static String CONSOLE_SHELL_START = "<console><shell>";
	private static String CONSOLE_SHELL_END = "</shell></console>";
	
	public static SymbolsResponse parseSymbolsXml(String xml) {
		List<Symbol> completions = new ArrayList<Symbol>();
		boolean goodDecl = false;
		if (xml != null)
		{ 
			if (xml.startsWith(XML_HEADER_1)) { 
				xml = xml.substring(XML_HEADER_1.length());
				goodDecl = true;
			} else if (xml.startsWith(XML_HEADER_2)) { 
				xml = xml.substring(XML_HEADER_2.length());
				goodDecl = true;
			}
			if (goodDecl && xml.startsWith(CONSOLE_SHELL_START) && 
					xml.endsWith(CONSOLE_SHELL_END)) 
			{
				xml = xml.substring(CONSOLE_SHELL_START.length(), 
						xml.length() - CONSOLE_SHELL_END.length());			
				completions.addAll(SymbolSerializer.deserializeFromString(xml));
			}
		}
		return new SymbolsResponse(completions);
	}
	
}
