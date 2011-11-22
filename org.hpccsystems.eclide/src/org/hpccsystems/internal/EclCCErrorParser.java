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
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.console.MessageConsoleStream;

public class EclCCErrorParser {
	public int errorCount = 0;
	public int warningCount = 0;
	public ArrayList<EclCCError> items;
	
	public EclCCErrorParser(BufferedReader reader, MessageConsoleStream eclccConsoleWriter) {
		items = new ArrayList<EclCCError>();
		String errorLine = null;
		try {
			while ((errorLine = reader.readLine()) != null) {
				if (eclccConsoleWriter != null) {
					eclccConsoleWriter.print("Err: ");
					eclccConsoleWriter.println(errorLine);
				}
				
				EclCCError error = new EclCCError(errorLine);
				switch (error.severity) {
				case IMarker.SEVERITY_ERROR:
					items.add(error);
					++errorCount;
					break;
				case IMarker.SEVERITY_WARNING:
					items.add(error);
					++warningCount;
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
