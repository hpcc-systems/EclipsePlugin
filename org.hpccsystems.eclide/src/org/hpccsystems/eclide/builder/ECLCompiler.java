package org.hpccsystems.eclide.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.preference.IPreferenceStore;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.preferences.PreferenceConstants;

public class ECLCompiler {

	String compilerPath;
	String libraryPath;

	ECLCompiler() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		compilerPath = store.getString(PreferenceConstants.P_COMPILERPATH);
		libraryPath = store.getString(PreferenceConstants.P_COMPILERPATH);
	}

	void CheckSyntax(IFile file) {
		String command = compilerPath;
		command += " -f\"syntaxcheck=1\" ";
		command += " ";
		command += file.getLocation().toOSString();

		try {
			Process p = Runtime.getRuntime().exec(command);

			BufferedReader stdInput = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(
					p.getErrorStream()));

			// read the output from the command
			String out = null;
			System.out.println("Here is the standard output of the command:\n");
			while ((out = stdInput.readLine()) != null) {
				System.out.println(out);
			}

			// read any errors from the attempted command
			String err = null;
			System.out.println("Here is the standard error of the command (if any):\n");
			while ((err = stdError.readLine()) != null) {
				System.out.println(err);
				String[] parts = err.split(":\\p{Blank}");
				if (parts.length >= 3) {
					String filePathAndLoc = parts[0];
					String[] fileParts = filePathAndLoc.split("[\\(,\\)]");
					if (fileParts.length >= 3) {
						String filePath = fileParts[0];
						String line = fileParts[1];
						String col = fileParts[2];
					}
					String code = parts[1];
					String message = parts[2];
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
