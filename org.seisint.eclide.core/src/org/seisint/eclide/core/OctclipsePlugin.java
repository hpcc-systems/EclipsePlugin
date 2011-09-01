<<<<<<< HEAD
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
package org.seisint.eclide.core;


import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;
import org.seisint.eclide.runtime.symbols.OctaveSymbolList;

/**
 * The activator class controls the plug-in life cycle
 */
public class OctclipsePlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.seisint.eclide.core";

	// The shared instance
	private static OctclipsePlugin plugin;
	
	private static OctaveSymbolList list = null;  
	
	/**
	 * The constructor
	 */
	public OctclipsePlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static OctclipsePlugin getDefault() {
		return plugin;
	}
	
	public static OctaveSymbolList getSymbolList() {
		if (list == null)
			list = new OctaveSymbolList();
		return list;
	}

}
=======
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
package org.seisint.eclide.core;


import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;
import org.seisint.eclide.runtime.symbols.OctaveSymbolList;

/**
 * The activator class controls the plug-in life cycle
 */
public class OctclipsePlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.seisint.eclide.core";

	// The shared instance
	private static OctclipsePlugin plugin;
	
	private static OctaveSymbolList list = null;  
	
	/**
	 * The constructor
	 */
	public OctclipsePlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static OctclipsePlugin getDefault() {
		return plugin;
	}
	
	public static OctaveSymbolList getSymbolList() {
		if (list == null)
			list = new OctaveSymbolList();
		return list;
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
