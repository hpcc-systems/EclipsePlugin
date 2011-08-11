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
package org.seisint.eclide.internal.ui.text;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.ui.text.AbstractScriptScanner;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.WhitespaceRule;

public class OctaveStringScanner extends AbstractScriptScanner {

	private static final String[] fgTokenProperties = new String[] {
		OctaveColorConstants.ECL_STRING, 
		OctaveColorConstants.ECL_CONSTANT,
		OctaveColorConstants.ECL_VARIABLE
	};

	public OctaveStringScanner(IColorManager manager, IPreferenceStore store) {
		super(manager, store);
		initialize();
	}

	
	protected String[] getTokenProperties() {
		return fgTokenProperties;
	}

	
	protected List<IRule> createRules() {
		List<IRule> rules = new ArrayList<IRule>();
		rules.add(new WhitespaceRule(new OctaveWhitespaceDetector()));
		setDefaultReturnToken(getToken(OctaveColorConstants.ECL_STRING));
		return rules;
	}

}
