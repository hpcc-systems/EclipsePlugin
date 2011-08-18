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

import org.eclipse.dltk.core.AbstractLanguageToolkit;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;

public class OctaveLanguageToolkit extends AbstractLanguageToolkit {
	
	private static final String OCTAVE_CONTENT_TYPE = "org.seisint.eclide.core.octaveContentType";

	protected static IDLTKLanguageToolkit sInstance = new OctaveLanguageToolkit();

	public OctaveLanguageToolkit() {
	}

	public String getNatureId() {
		return OctaveNature.NATURE_ID;
	}

	public static IDLTKLanguageToolkit getDefault() {
		return sInstance;
	}

	protected String getCorePluginID() {
		return OctclipsePlugin.PLUGIN_ID;
	}

	public String getLanguageName() {
		return "ECL";
	}
	
	public String getLanguageContentType() {
		return OCTAVE_CONTENT_TYPE;
	}

}
