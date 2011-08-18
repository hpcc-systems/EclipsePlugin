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
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateVariableResolver;

public class OctaveTemplateVariables {
	public static final String SELECTION= "selection"; //$NON-NLS-1$

	/**
	 * The file_as_function variable.
	 */
	public static class FileAsFunction extends TemplateVariableResolver {

		/** Name of the variable, value= {@value} */
		public static final String NAME= "file_as_function"; //$NON-NLS-1$

		public FileAsFunction() {
			super(NAME, TemplateMessages.FileAsFunctionDescription);
		}
		
		protected String resolve(TemplateContext context) {
			ISourceModule module = getSourceModule(context);
			String x = (module == null) ? null : module.getElementName();
			if (x != null && x.endsWith(".m")) {
				x = x.substring(0, x.length()-2);
			}
			return x;
		}
		
		protected boolean isUnambiguous(TemplateContext context) {
			return resolve(context) != null;
		}
		
	}
	
	private static ISourceModule getSourceModule(TemplateContext context) {
		return ((ScriptTemplateContext) context).getSourceModule();
	}
	
}
