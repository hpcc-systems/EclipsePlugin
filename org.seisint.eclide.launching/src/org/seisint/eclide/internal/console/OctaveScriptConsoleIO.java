/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.console;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.dltk.console.ScriptConsoleIO;

public class OctaveScriptConsoleIO extends ScriptConsoleIO implements IOctaveScriptConsoleIO {

	private static final String SYMBOLS = "symbols";
	
	private static final String SHELL = "shell";
	
	private final OutputStream _output;
	private final InputStream _input;
	
	public OctaveScriptConsoleIO(InputStream input, OutputStream output)
			throws IOException {
		super(input,output);
		_output = output;
		_input = input;
	}

	public SymbolsResponse execSymbols(long type) throws IOException {
		_output.write((SHELL + "\n").getBytes());
		_output.write((SYMBOLS + "\n").getBytes());
		_output.write((Long.toString(type) + "\n").getBytes());
		_output.flush();

		final String response = readResponse(_input);
		return OctaveConsoleXmlHelper.parseSymbolsXml(response);
	}

}
