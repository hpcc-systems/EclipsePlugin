/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

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
		void ProcessErr(IFile file, BufferedReader errReader);
	}
	
	IPath workingPath;
	IPath additionalPath;
	private IProcessOutput handler;

	MessageConsoleStream consoleOut;	

	String QUOTE = "";
	
	public CmdProcess(IPath workingPath, IPath additionalPath, IProcessOutput handler, MessageConsoleStream consoleOut) {
		this.workingPath = workingPath;
		this.additionalPath = additionalPath;
		this.handler = handler;
		this.consoleOut = consoleOut;
		QUOTE = OS.isWindowsPlatform() ? "\"" : "";
	}
	
	@SuppressWarnings("unused")
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
	
	public void exec(String command, String args) {
		CmdArgs cmdArgs = new CmdArgs(command, args);
		exec(cmdArgs, null, false);
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
				public void run() {
					handler.ProcessOut(stdInput);
				}
			};
			Thread threadStdIn = new Thread(readStdIn, "read stdin");
			threadStdIn.start();

			Runnable readStdErr = new Runnable() {
				public void run() {
					handler.ProcessErr(target, stdError);
				}
			};
			Thread threadStdErr = new Thread(readStdErr, "read stderr");
			threadStdErr.start();

			threadStdIn.join();
			threadStdErr.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
};
