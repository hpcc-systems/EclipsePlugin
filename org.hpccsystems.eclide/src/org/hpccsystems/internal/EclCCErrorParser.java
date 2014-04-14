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
import java.util.ArrayList;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.console.MessageConsoleStream;
import org.hpccsystems.eclide.resources.Messages;

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
					eclccConsoleWriter.print(Messages.EclCCErrorParser_0);
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
