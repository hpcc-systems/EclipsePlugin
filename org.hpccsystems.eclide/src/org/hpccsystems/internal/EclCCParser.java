package org.hpccsystems.internal;

import org.eclipse.core.resources.IMarker;

public class EclCCParser {

	public int severity = IMarker.SEVERITY_INFO;
	public String code;
	public String message;
	public String errorPath;
	public int lineNumber = 0;
	public int colNumber = 0;
	public boolean hasError = false;
	
	public boolean ParseError(String errorLine) {
		String[] parts = errorLine.split(":\\p{Blank}");
		if (parts.length >= 3) {
			String filePathAndLoc = parts[0];
			String code = parts[1];
			message = parts[2];
			String[] fileParts = filePathAndLoc.split("[\\(,\\)]");
			if (fileParts.length >= 3) {
				errorPath = fileParts[0];
				String line = fileParts[1];
				String col = fileParts[2];

				try {
					lineNumber = Integer.parseInt(line);
				} catch (NumberFormatException e) {
				}
				try {
					colNumber = Integer.parseInt(col);
				} catch (NumberFormatException e) {
				}

				if (code.startsWith("error")) {
					severity = IMarker.SEVERITY_ERROR;
					hasError = true;
				}
				else if (code.startsWith("warning"))
					severity = IMarker.SEVERITY_WARNING;			

				return true;
			}
		}
		return false;
	}
}
