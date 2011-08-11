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
package org.seisint.eclide.internal.console;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import org.eclipse.dltk.console.IScriptConsoleIO;
import org.eclipse.dltk.console.InterpreterResponse;
import org.eclipse.dltk.console.ShellResponse;

public class OctaveSocketScriptConsoleIO implements IScriptConsoleIO, IOctaveScriptConsoleIO {
	private final Socket socket;

	private final OctaveScriptConsoleIO io;

	public OctaveSocketScriptConsoleIO(Socket socket) throws IOException {
		this.socket = socket;

		socket.setSoTimeout(1000);
		
		BufferedInputStream input = new BufferedInputStream(socket
				.getInputStream());

		BufferedOutputStream output = new BufferedOutputStream(socket
				.getOutputStream());

		io = new OctaveScriptConsoleIO(input, output);
	}

	public String getId() {
		return io.getId();
	}

	public InterpreterResponse execInterpreter(String command)
			throws IOException {
		return io.execInterpreter(command);
	}

	public ShellResponse execShell(String command, String[] args)
			throws IOException {
		return io.execShell(command, args);
	}

	public void close() throws IOException {
		io.close();
		socket.close();
	}

	public SymbolsResponse execSymbols(long type) 
			throws IOException {
		return io.execSymbols(type);
	}

	public InputStream getInitialResponseStream() {
		return io.getInitialResponseStream();
	}
}
