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

public class OS {
	public static final String WIN_ID = "Windows";

	public static boolean isWindowsPlatform()
	{
		String os = System.getProperty("os.name");
		if ( os != null && os.startsWith(WIN_ID)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String getOSQuote()
	{
		return isWindowsPlatform() ? "\"" : "";
	}
}
