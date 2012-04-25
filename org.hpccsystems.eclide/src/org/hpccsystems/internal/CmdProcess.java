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
package org.hpccsystems.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class CmdProcess {
	public interface IProcessOutput {
		void ProcessOut(BufferedReader outReader);
		void ProcessErr(BufferedReader errReader);
	}

	IPath workingPath;
	IPath additionalPath;
	private IProcessOutput handler;

	MessageConsoleStream consoleOut;	

	String QUOTE = "";

	public CmdProcess(IPath workingPath, IPath additionalPath, IProcessOutput handler, MessageConsoleStream consoleOut) {
		if (workingPath == null)
			workingPath = additionalPath;
		this.workingPath = workingPath;
		this.additionalPath = additionalPath;
		this.handler = handler;
		this.consoleOut = consoleOut;
		QUOTE = OS.isWindowsPlatform() ? "\"" : "";
	}

	private MessageConsole FindConsole(final String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}

	public void exec(String command, String commonArgs, String baseArgs) {
		CmdArgs cmdArgs = new CmdArgs(command, commonArgs, baseArgs);
		exec(cmdArgs);
	}

	public void exec(CmdArgs args) {
		exec(args, null, false);
	}

	public void exec(CmdArgs args, final IFile target, boolean eclplusArgs) {
		args.Print(consoleOut, eclplusArgs);
		List<String> argList = args.Get(eclplusArgs);

		if (target != null) {
			consoleOut.print(" " + QUOTE + target.getLocation().toOSString() + QUOTE);
			argList.add(QUOTE + target.getLocation().toOSString() + QUOTE);
		}
		consoleOut.println();

		try {
			ProcessBuilder pb = new ProcessBuilder(argList);
			Map<String, String> env = pb.environment();
			if (!additionalPath.isEmpty() && env.containsKey("Path")) {
				env.put("Path", additionalPath.toOSString() + ";" + env.get("Path"));
			}
			pb.directory(workingPath.toFile());
			Process p = pb.start();

			final BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
			final BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

			Runnable readStdIn = new Runnable() {
				@Override
				public void run() {
					handler.ProcessOut(stdInput);
				}
			};
			Thread threadStdIn = new Thread(readStdIn, "read stdin");
			threadStdIn.start();

			Runnable readStdErr = new Runnable() {
				@Override
				public void run() {
					handler.ProcessErr(stdError);
				}
			};
			Thread threadStdErr = new Thread(readStdErr, "read stderr");
			threadStdErr.start();

			threadStdIn.join();
			threadStdErr.join();
		} catch (InterruptedException e) {
			consoleOut.println(e.getMessage());
		} catch (IOException e) {
			consoleOut.println(e.getMessage());
		}	
	}
};
