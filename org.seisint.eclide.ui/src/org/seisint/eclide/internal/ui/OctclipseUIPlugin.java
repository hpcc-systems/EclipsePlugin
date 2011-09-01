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
package org.seisint.eclide.internal.ui;

import java.net.ServerSocket;


import org.eclipse.dltk.console.ui.ScriptConsoleUIPlugin;
import org.eclipse.dltk.ui.DLTKUILanguageManager;
import org.eclipse.dltk.ui.IDLTKUILanguageToolkit;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.ui.text.OctaveTextTools;

/**
 * The activator class controls the plug-in life cycle
 */
public class OctclipseUIPlugin extends AbstractUIPlugin implements IStartup {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.seisint.eclide.ui";
	
	public static final String ID_ACTION_SET = "org.seisint.eclide.ui.OctaveActionSet";

	// The shared instance
	private static OctclipseUIPlugin plugin;

	private OctaveTextTools fOctaveTextTools;
	
	private static ServerSocket socket;
	
	private static OctaveSymbolsThread serverThread;
	
	/**
	 * The constructor
	 */
	public OctclipseUIPlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		ScriptConsoleUIPlugin.getDefault();
		try {
			socket = new ServerSocket(56645);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		serverThread = new OctaveSymbolsThread(socket);
		serverThread.start();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static OctclipseUIPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.seisint.eclide.internal.ui", path);
	}
	
	public synchronized OctaveTextTools getTextTools() {
		IDLTKUILanguageToolkit languageToolkit = DLTKUILanguageManager.getLanguageToolkit(OctaveNature.NATURE_ID);
		return (OctaveTextTools) languageToolkit.getTextTools();
	}	
	
	public synchronized OctaveTextTools internalgetTextTools() {
		if (fOctaveTextTools == null)
			fOctaveTextTools= new OctaveTextTools(true);
		return fOctaveTextTools;
	}

	public void earlyStartup() {

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
package org.seisint.eclide.internal.ui;

import java.net.ServerSocket;


import org.eclipse.dltk.console.ui.ScriptConsoleUIPlugin;
import org.eclipse.dltk.ui.DLTKUILanguageManager;
import org.eclipse.dltk.ui.IDLTKUILanguageToolkit;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.ui.text.OctaveTextTools;

/**
 * The activator class controls the plug-in life cycle
 */
public class OctclipseUIPlugin extends AbstractUIPlugin implements IStartup {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.seisint.eclide.ui";
	
	public static final String ID_ACTION_SET = "org.seisint.eclide.ui.OctaveActionSet";

	// The shared instance
	private static OctclipseUIPlugin plugin;

	private OctaveTextTools fOctaveTextTools;
	
	private static ServerSocket socket;
	
	private static OctaveSymbolsThread serverThread;
	
	/**
	 * The constructor
	 */
	public OctclipseUIPlugin() {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		ScriptConsoleUIPlugin.getDefault();
		try {
			socket = new ServerSocket(56645);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		serverThread = new OctaveSymbolsThread(socket);
		serverThread.start();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static OctclipseUIPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.seisint.eclide.internal.ui", path);
	}
	
	public synchronized OctaveTextTools getTextTools() {
		IDLTKUILanguageToolkit languageToolkit = DLTKUILanguageManager.getLanguageToolkit(OctaveNature.NATURE_ID);
		return (OctaveTextTools) languageToolkit.getTextTools();
	}	
	
	public synchronized OctaveTextTools internalgetTextTools() {
		if (fOctaveTextTools == null)
			fOctaveTextTools= new OctaveTextTools(true);
		return fOctaveTextTools;
	}

	public void earlyStartup() {

	}
	
}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
