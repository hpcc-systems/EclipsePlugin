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
package org.seisint.eclide.internal.ui.templates;

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.ui.templates.ScriptTemplateContext;
import org.eclipse.dltk.ui.templates.ScriptTemplateContextType;
import org.eclipse.jface.text.IDocument;

public class OctaveUniversalTemplateContextType extends ScriptTemplateContextType {
	
	public static final String CONTEXT_TYPE_ID = "octaveUniversalTemplateContextType";
		
	public OctaveUniversalTemplateContextType() {
		// empty constructor
	}
	
	public OctaveUniversalTemplateContextType(String id) {
		super(id);
	}
	
	public OctaveUniversalTemplateContextType(String id, String name) {
		super(id, name);
	}
	
	public ScriptTemplateContext createContext(IDocument document, int offset,
			int length, ISourceModule sourceModule) {
		return new OctaveTemplateContext(this, document, offset, length, sourceModule);
	}		
	
	protected void addScriptResolvers() {
		super.addScriptResolvers();
		addResolver(new OctaveTemplateVariables.FileAsFunction());
	}
}
