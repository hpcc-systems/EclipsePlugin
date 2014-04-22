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

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.ListEditor;
import org.eclipse.jface.preference.PathEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.ClientTools;
import org.hpccsystems.internal.ui.LabelFieldEditor;
import org.hpccsystems.internal.ui.SpacerFieldEditor;

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
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription(Messages.ECLCompilerPreferencePage_0);
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	@Override
	public void createFieldEditors() {
		addField(new SpacerFieldEditor(getFieldEditorParent()));
		addField(new LabelFieldEditor(Messages.ECLCompilerPreferencePage_1, getFieldEditorParent()));
		addField(new DirectoryFieldEditor(ClientTools.P_TOOLSPATH, Messages.ECLCompilerPreferencePage_2, getFieldEditorParent()));

		addField(new SpacerFieldEditor(getFieldEditorParent()));
		addField(new LabelFieldEditor(Messages.ECLCompilerPreferencePage_3, getFieldEditorParent()));
		addField(new StringFieldEditor(ClientTools.P_ARGSCOMMON, Messages.ECLCompilerPreferencePage_4, getFieldEditorParent()));
		addField(new StringFieldEditor(ClientTools.P_ARGSSYNTAX, Messages.ECLCompilerPreferencePage_5, getFieldEditorParent()));
		addField(new StringFieldEditor(ClientTools.P_ARGSCOMPILE, Messages.ECLCompilerPreferencePage_6, getFieldEditorParent()));
		addField(new StringFieldEditor(ClientTools.P_ARGSCOMPILEREMOTE, Messages.ECLCompilerPreferencePage_7, getFieldEditorParent()));

		addField(new SpacerFieldEditor(getFieldEditorParent()));
		addField(new LabelFieldEditor(Messages.ECLCompilerPreferencePage_8, getFieldEditorParent()));
		addField(new StringFieldEditor(ClientTools.P_ARGSWULOCAL, Messages.ECLCompilerPreferencePage_9, getFieldEditorParent()));

		addField(new SpacerFieldEditor(getFieldEditorParent()));
		addField(new LabelFieldEditor(Messages.ECLCompilerPreferencePage_10, getFieldEditorParent()));
		addField(new IntegerFieldEditor(ClientTools.P_INLINERESULTLIMIT, Messages.ECLCompilerPreferencePage_11, getFieldEditorParent()));
		addField(new BooleanFieldEditor(ClientTools.P_MONITORDEPENDEES, Messages.ECLCompilerPreferencePage_12, getFieldEditorParent()));
		addField(new BooleanFieldEditor(ClientTools.P_SUPRESSSECONDERROR, Messages.ECLCompilerPreferencePage_13, getFieldEditorParent()));
		addField(new BooleanFieldEditor(ClientTools.P_ENABLEMETAPROCESSING, Messages.ECLCompilerPreferencePage_14, getFieldEditorParent()));
	}

}
