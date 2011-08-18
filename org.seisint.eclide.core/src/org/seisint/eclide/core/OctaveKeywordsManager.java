/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class OctaveKeywordsManager {

	private static final String PRIORITY = "priority";
	private static final String EXTENSION_POINT = "org.seisint.eclide.core.octavekeywords";
	private static final String CLASS = "class";
	private static IOctaveKeywords sKeywords = null;
	private static int sPriority = -1;
	
	private OctaveKeywordsManager(){
	}
	
	private static void initialize() {
		if( sKeywords != null ) {
			return;
		}
		IConfigurationElement[] cfg = Platform.getExtensionRegistry()
			.getConfigurationElementsFor(EXTENSION_POINT);
		for (int i = 0; i < cfg.length; i++) {
			if ("keywords".equals(cfg[i].getName())) {
				int priority = getPriority(cfg[i]);
				if( sPriority ==  -1 || sPriority < priority ) {
					try {
						sKeywords = (IOctaveKeywords) cfg[i].createExecutableExtension(CLASS);
						sPriority = priority;
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
		if( sKeywords == null ) {
			sKeywords = new OctaveKeywords();
		}
	}
	private static int getPriority(IConfigurationElement config) {
		String priority = config.getAttribute(PRIORITY);
		if (priority == null) {
			return 0;
		}
		try {
			int parseInt = Integer.parseInt(priority);
			return parseInt;
		} catch (NumberFormatException ex) {
			return 0;
		}
	}
	
	public static String[] getKeywords(int i) {
		initialize();
		return sKeywords.getKeywords(i);
	}
	
}
