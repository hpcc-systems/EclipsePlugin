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
package org.hpccsystems.internal.ui;

import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;

public class PasswordFieldEditor extends StringFieldEditor { 

	public PasswordFieldEditor(String name, String label, Composite parent) { 
		super(name, label, parent); 
	} 

	protected void doFillIntoGrid(Composite parent, int numColumns) 
	{ 
		// Creates the text control 
		super.doFillIntoGrid(parent, numColumns); 

		// Now we can set the echo character 
		getTextControl().setEchoChar('*'); 
	} 
} 

