package org.hpccsystems.eclide.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

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
	private IProcessOutput handler;

	MessageConsoleStream consoleOut;	
	
	public CmdProcess(IPath workingPath, IProcessOutput handler, MessageConsoleStream consoleOut) {
		this.workingPath = workingPath;
		this.handler = handler;
		this.consoleOut = consoleOut;
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
	
	public void exec(String command) {
		Map<String, String> args = new TreeMap<String, String>();
		exec(command, args, null, false);
	}
	
	public void exec(String command, Map<String, String> args, final IFile target, boolean eclplusArgs) {
		List<String> argList = new Vector<String>();
		consoleOut.print(command);
		argList.add(command);
		for(Map.Entry<String, String> entry : args.entrySet()) {
			String arg;
			if (eclplusArgs)
				arg = entry.getKey() + "=" + entry.getValue();
			else 
				arg = "-" + entry.getKey() + entry.getValue();
			consoleOut.print(" " + arg);
			argList.add(arg);
		}
		if (target != null) {
			consoleOut.print(" " + "..\\" + target.getProjectRelativePath().toOSString());
			argList.add("..\\" + target.getProjectRelativePath().toOSString());
		}
		consoleOut.println();

		try {
			ProcessBuilder pb = new ProcessBuilder(argList);
			//Map<String, String> env = pb.environment();
			//env.put("VAR1", "myValue");
			//env.remove("OTHERVAR");
			//env.put("VAR2", env.get("VAR1") + "suffix");
			pb.directory(workingPath.toFile());
			Process p = pb.start();
			//Process p = Runtime.getRuntime().exec(command);

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
