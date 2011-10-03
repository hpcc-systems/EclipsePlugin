package org.hpccsystems.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

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
	
	public void exec(String command, String args) {
		CmdArgs cmdArgs = new CmdArgs(command, args);
		exec(cmdArgs, null, false);
	}
	
	public void exec(CmdArgs args, final IFile target, boolean eclplusArgs) {
		args.Print(consoleOut, eclplusArgs);
		List<String> argList = args.Get(eclplusArgs);

		if (target != null) {
			consoleOut.print(" " + "../" + target.getProjectRelativePath().toOSString());
			argList.add("../" + target.getProjectRelativePath().toOSString());
		}
		consoleOut.println();

		try {
			ProcessBuilder pb = new ProcessBuilder(argList);
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
