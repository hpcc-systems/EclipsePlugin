/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.runtime.symbols;

import org.eclipse.core.runtime.Plugin;

/**
 * The activator class controls the plug-in life cycle
 */
public class OctclipseRuntimeSymbolsPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.seisint.eclide.runtime.symbols";

	// The shared instance
	private static OctclipseRuntimeSymbolsPlugin plugin;
	
	/**
	 * The constructor
	 */
	public OctclipseRuntimeSymbolsPlugin() {
		plugin = this;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static OctclipseRuntimeSymbolsPlugin getDefault() {
		return plugin;
	}

}
