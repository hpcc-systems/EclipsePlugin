/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.seisint.eclide.internal.launching.debug.preferences;

import org.eclipse.osgi.util.NLS;

public class PreferenceMessages {
	private static final String BUNDLE_NAME = "org.seisint.eclide.internal.launching.debug.preferences.PreferenceMessages"; //$NON-NLS-1$

	static {
		NLS.initializeMessages(BUNDLE_NAME, PreferenceMessages.class);
	}
	public static String OctclipseEngineDescription;
	public static String OctclipseEngineDownloadPage;
	public static String OctclipseEngineDownloadPageLink;
	
}
