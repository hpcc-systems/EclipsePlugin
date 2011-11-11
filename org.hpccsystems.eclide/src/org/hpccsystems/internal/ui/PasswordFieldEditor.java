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

