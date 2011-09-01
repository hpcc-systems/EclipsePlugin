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
package org.seisint.eclide.console;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.eclipse.dltk.console.ConsoleRequest;
import org.eclipse.dltk.console.IScriptConsoleIO;
import org.eclipse.dltk.console.IScriptConsoleInterpreter;
import org.eclipse.dltk.console.IScriptExecResult;
import org.eclipse.dltk.console.IScriptInterpreter;
import org.eclipse.dltk.console.InterpreterResponse;
import org.eclipse.dltk.console.ScriptExecResult;
import org.eclipse.dltk.console.ShellResponse;
import org.seisint.eclide.core.OctclipsePlugin;
import org.seisint.eclide.internal.console.IOctaveScriptConsoleIO;
import org.seisint.eclide.internal.console.SymbolsResponse;
import org.seisint.eclide.runtime.symbols.OctaveSymbolList;
import org.seisint.eclide.runtime.symbols.Symbol;
import org.seisint.eclide.ui.documentation.OctaveDocumentationUtils;

@SuppressWarnings("rawtypes")
public class OctaveInterpreter implements ConsoleRequest, IScriptInterpreter {
	private static final String COMPLETE_COMMAND = "complete";
	private static final String DESCRIBE_COMMAND = "describe";
	private static final String CLOSE_COMMAND = "close";
	private IScriptConsoleIO protocol;
	private String content;
	private int state;
	private List<Runnable> closeRunnables = new ArrayList<Runnable>();
	private List<Runnable> initialListeners = new ArrayList<Runnable>();
	
	public void consoleConnected(IScriptConsoleIO protocol) {
		this.protocol = protocol;
		try {
			for (Iterator<Runnable> iterator = this.initialListeners.iterator(); iterator.hasNext();) {
				Runnable op = iterator.next();
				op.run();
			}
			Thread.sleep(1000);
			refreshSymbols(Symbol.USER_FUNCTION |
					   Symbol.USER_VARIABLE | 
					   Symbol.BUILTIN_FUNCTION);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void close() throws IOException {
		if (protocol != null) {
			protocol.execShell(CLOSE_COMMAND, new String[] {});
			protocol.close();
		}
		// run all close runnables.
		for (Iterator<Runnable> iterator = this.closeRunnables.iterator(); iterator
				.hasNext();) {
			Runnable op = iterator.next();
			op.run();
		}
		OctclipsePlugin.getSymbolList().clearSymbols(Symbol.USER_VARIABLE);
	}

	public void refreshSymbols(long type)
		throws IOException {
		if (protocol instanceof IOctaveScriptConsoleIO)
		{
			IOctaveScriptConsoleIO protocol2 = (IOctaveScriptConsoleIO)protocol;
			SymbolsResponse response = protocol2.execSymbols(type);
			OctaveSymbolList list = OctclipsePlugin.getSymbolList();
			list.clearSymbols(type);
			list.updateSymbolsFromRuntime(response.getSymbols(), type);
		}
	}
	
	public List getCompletions(String commandLine, int position)
			throws IOException {
		String[] args = new String[] { commandLine, Integer.toString(position) };
		ShellResponse response = protocol.execShell(COMPLETE_COMMAND, args);
		return response.getCompletions();
	}

	public String getDescription(String commandLine, int position)
			throws IOException {
		String[] args = new String[] { commandLine, Integer.toString(position) };
		ShellResponse response = protocol.execShell(DESCRIBE_COMMAND, args);
		String desc = response.getDescription();
		if (desc.startsWith("-*- texinfo -*-")) {
			return OctaveDocumentationUtils.convertTexInfoToText(desc);
		} else {
			return desc;	
		}
	}

	public String[] getNames(String type) throws IOException {
		return null;
	}

	public IScriptExecResult exec(String command) throws IOException {
		InterpreterResponse response = protocol.execInterpreter(command);
		content = response.getContent();
		state = response.getState();
		if (state == IScriptConsoleInterpreter.WAIT_NEW_COMMAND)
		{			
			try {
				refreshSymbols(Symbol.USER_FUNCTION |
					   Symbol.USER_VARIABLE);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return new ScriptExecResult(content, true);
	}

	public String getOutput() {
		return content;
	}

	public int getState() {
		return state;
	}

	public void addCloseOperation(Runnable runnable) {
		closeRunnables.add(runnable);
	}
	
	public void addInitialListenerOperation(Runnable runnable) {
		initialListeners.add(runnable);	
	}

	public InputStream getInitialOutputStream() {
		return protocol.getInitialResponseStream();
	}

	public boolean isValid() {
		return protocol != null;
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
package org.seisint.eclide.console;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.eclipse.dltk.console.ConsoleRequest;
import org.eclipse.dltk.console.IScriptConsoleIO;
import org.eclipse.dltk.console.IScriptConsoleInterpreter;
import org.eclipse.dltk.console.IScriptExecResult;
import org.eclipse.dltk.console.IScriptInterpreter;
import org.eclipse.dltk.console.InterpreterResponse;
import org.eclipse.dltk.console.ScriptExecResult;
import org.eclipse.dltk.console.ShellResponse;
import org.seisint.eclide.core.OctclipsePlugin;
import org.seisint.eclide.internal.console.IOctaveScriptConsoleIO;
import org.seisint.eclide.internal.console.SymbolsResponse;
import org.seisint.eclide.runtime.symbols.OctaveSymbolList;
import org.seisint.eclide.runtime.symbols.Symbol;
import org.seisint.eclide.ui.documentation.OctaveDocumentationUtils;

@SuppressWarnings("rawtypes")
public class OctaveInterpreter implements ConsoleRequest, IScriptInterpreter {
	private static final String COMPLETE_COMMAND = "complete";
	private static final String DESCRIBE_COMMAND = "describe";
	private static final String CLOSE_COMMAND = "close";
	private IScriptConsoleIO protocol;
	private String content;
	private int state;
	private List<Runnable> closeRunnables = new ArrayList<Runnable>();
	private List<Runnable> initialListeners = new ArrayList<Runnable>();
	
	public void consoleConnected(IScriptConsoleIO protocol) {
		this.protocol = protocol;
		try {
			for (Iterator<Runnable> iterator = this.initialListeners.iterator(); iterator.hasNext();) {
				Runnable op = iterator.next();
				op.run();
			}
			Thread.sleep(1000);
			refreshSymbols(Symbol.USER_FUNCTION |
					   Symbol.USER_VARIABLE | 
					   Symbol.BUILTIN_FUNCTION);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void close() throws IOException {
		if (protocol != null) {
			protocol.execShell(CLOSE_COMMAND, new String[] {});
			protocol.close();
		}
		// run all close runnables.
		for (Iterator<Runnable> iterator = this.closeRunnables.iterator(); iterator
				.hasNext();) {
			Runnable op = iterator.next();
			op.run();
		}
		OctclipsePlugin.getSymbolList().clearSymbols(Symbol.USER_VARIABLE);
	}

	public void refreshSymbols(long type)
		throws IOException {
		if (protocol instanceof IOctaveScriptConsoleIO)
		{
			IOctaveScriptConsoleIO protocol2 = (IOctaveScriptConsoleIO)protocol;
			SymbolsResponse response = protocol2.execSymbols(type);
			OctaveSymbolList list = OctclipsePlugin.getSymbolList();
			list.clearSymbols(type);
			list.updateSymbolsFromRuntime(response.getSymbols(), type);
		}
	}
	
	public List getCompletions(String commandLine, int position)
			throws IOException {
		String[] args = new String[] { commandLine, Integer.toString(position) };
		ShellResponse response = protocol.execShell(COMPLETE_COMMAND, args);
		return response.getCompletions();
	}

	public String getDescription(String commandLine, int position)
			throws IOException {
		String[] args = new String[] { commandLine, Integer.toString(position) };
		ShellResponse response = protocol.execShell(DESCRIBE_COMMAND, args);
		String desc = response.getDescription();
		if (desc.startsWith("-*- texinfo -*-")) {
			return OctaveDocumentationUtils.convertTexInfoToText(desc);
		} else {
			return desc;	
		}
	}

	public String[] getNames(String type) throws IOException {
		return null;
	}

	public IScriptExecResult exec(String command) throws IOException {
		InterpreterResponse response = protocol.execInterpreter(command);
		content = response.getContent();
		state = response.getState();
		if (state == IScriptConsoleInterpreter.WAIT_NEW_COMMAND)
		{			
			try {
				refreshSymbols(Symbol.USER_FUNCTION |
					   Symbol.USER_VARIABLE);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return new ScriptExecResult(content, true);
	}

	public String getOutput() {
		return content;
	}

	public int getState() {
		return state;
	}

	public void addCloseOperation(Runnable runnable) {
		closeRunnables.add(runnable);
	}
	
	public void addInitialListenerOperation(Runnable runnable) {
		initialListeners.add(runnable);	
	}

	public InputStream getInitialOutputStream() {
		return protocol.getInitialResponseStream();
	}

	public boolean isValid() {
		return protocol != null;
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
