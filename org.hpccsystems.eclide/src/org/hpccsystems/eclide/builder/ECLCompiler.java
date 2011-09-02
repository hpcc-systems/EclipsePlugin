package org.hpccsystems.eclide.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.preferences.PreferenceConstants;

public class ECLCompiler {

	private static final String MARKER_TYPE = "org.hpccsystems.eclide.eclProblem";

	String compilerPath;
	String libraryPath;

	ECLCompiler() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		compilerPath = store.getString(PreferenceConstants.P_COMPILERPATH);
		libraryPath = store.getString(PreferenceConstants.P_COMPILERPATH);
	}

	void CheckSyntax(IFile file) {
		String command = compilerPath;
		command += " -f\"syntaxcheck=1\"";
		command += " -I\"" + libraryPath + "\"";
		command += " \"" + file.getLocation().toOSString() + "\"";

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
					String code = parts[1];
					String message = parts[2];
					String[] fileParts = filePathAndLoc.split("[\\(,\\)]");
					if (fileParts.length >= 3) {
						String filePath = fileParts[0];
						String line = fileParts[1];
						String col = fileParts[2];

						int lineNumber = Integer.parseInt(line);
						int colNumber = Integer.parseInt(col);

						IMarker marker = file.createMarker(MARKER_TYPE);
						marker.setAttribute(IMarker.MESSAGE, message);
						if (code.startsWith("error"))
							marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						else if (code.startsWith("warning"))
							marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						else
							marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
						if (lineNumber <= 0) {
							lineNumber = 1;
						}
						marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
					}
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
