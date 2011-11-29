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
package org.hpccsystems.eclide.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.ui.*;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class ECLCompilerPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public ECLCompilerPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Compiler preferences.");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		addField(new SpacerFieldEditor(getFieldEditorParent()));
		addField(new LabelFieldEditor("Location:", getFieldEditorParent()));
		addField(new DirectoryFieldEditor(ECLPreferenceConstants.P_TOOLSPATH, "&HPCC Client Tools:", getFieldEditorParent()));

		addField(new SpacerFieldEditor(getFieldEditorParent()));
		addField(new LabelFieldEditor("Compiler Arguments:", getFieldEditorParent()));
		addField(new StringFieldEditor(ECLPreferenceConstants.P_ARGSCOMMON, "&Common:", getFieldEditorParent()));
		addField(new StringFieldEditor(ECLPreferenceConstants.P_ARGSSYNTAX, "&Syntax Check:", getFieldEditorParent()));
		addField(new StringFieldEditor(ECLPreferenceConstants.P_ARGSCOMPILE, "&Local Compile:", getFieldEditorParent()));
		addField(new StringFieldEditor(ECLPreferenceConstants.P_ARGSCOMPILEREMOTE, "&Remote Compile:", getFieldEditorParent()));
		
		addField(new SpacerFieldEditor(getFieldEditorParent()));
		addField(new LabelFieldEditor("Workunit Arguments:", getFieldEditorParent()));
		addField(new StringFieldEditor(ECLPreferenceConstants.P_ARGSWULOCAL, "&Local:", getFieldEditorParent()));

		addField(new SpacerFieldEditor(getFieldEditorParent()));
		addField(new LabelFieldEditor("Miscellaneous:", getFieldEditorParent()));
		addField(new BooleanFieldEditor(ECLPreferenceConstants.P_MONITORDEPENDEES, "&Monitor Dependees (requires manual \"Project/Clean...\")", getFieldEditorParent()));
		addField(new BooleanFieldEditor(ECLPreferenceConstants.P_SUPRESSSECONDERROR, "&Supress Subsequent Errors", getFieldEditorParent()));

//		addField(new BooleanFieldEditor(ECLPreferenceConstants.P_REMOTEEXECUTE, "&Execute On Server:", getFieldEditorParent()));
//		addField(new StringFieldEditor(ECLPreferenceConstants.P_SERVERIP, "&Server IP:", getFieldEditorParent()));
//		addField(new StringFieldEditor(ECLPreferenceConstants.P_SERVERCLUSTER, "&Server Cluster:", getFieldEditorParent()));
		
//		addField(
//			new BooleanFieldEditor(
//				PreferenceConstants.P_BOOLEAN,
//				"&An example of a boolean preference",
//				getFieldEditorParent()));
//
//		addField(new RadioGroupFieldEditor(
//				PreferenceConstants.P_CHOICE,
//			"An example of a multiple-choice preference",
//			1,
//			new String[][] { { "&Choice 1", "choice1" }, {
//				"C&hoice 2", "choice2" }
//		}, getFieldEditorParent()));
//		addField(
//			new StringFieldEditor(PreferenceConstants.P_STRING, "A &text preference:", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}
