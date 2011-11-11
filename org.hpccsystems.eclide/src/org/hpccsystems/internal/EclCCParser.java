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

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class EclCCParser {

	public int severity = IMarker.SEVERITY_INFO;
	public String code;
	public String message;
	public IPath errorPath;
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
				errorPath = new Path(fileParts[0]);
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
