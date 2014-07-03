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

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.Path;

public class PluginError extends CError {
	PluginError(String errorLine) {
		severity = IMarker.SEVERITY_INFO;
		errorPath = null;
		lineNumber = 0;
		colNumber = 0;
		String[] parts = errorLine.split(":(?!\\\\)");
		if (parts.length >= 3) {
			String filePath = parts[0];
			errorPath = new Path(parts[0]);
			String[] posParts = parts[1].split("[\\(,\\)]");
			if (posParts.length >= 2) {
				String line = posParts[posParts.length - 2];
				String col = posParts[posParts.length - 1];

				try {
					lineNumber = Integer.parseInt(line);
				} catch (NumberFormatException e) {
				}
				try {
					colNumber = Integer.parseInt(col);
				} catch (NumberFormatException e) {
				}
			}
			String[] errMsgParts = parts[2].split("\\p{Blank}-\\p{Blank}");
			if (errMsgParts.length >= 1) {
				String[] codeErrParts = errMsgParts[0].split(" ");
				if (codeErrParts.length >= 1) {
					if (codeErrParts[0].equalsIgnoreCase("error")) {
						severity = IMarker.SEVERITY_ERROR;
					} else if (codeErrParts[0].equalsIgnoreCase("warning")) {
						severity = IMarker.SEVERITY_WARNING;
					} else {
						severity = IMarker.SEVERITY_INFO;
					}
				}
				if (codeErrParts.length >= 2) {
					code = codeErrParts[1];
				}
			}
			if (errMsgParts.length >= 2) {
				message = errMsgParts[1];
			}
			message = parts[2];
			valid = true;
		}
	}
}
