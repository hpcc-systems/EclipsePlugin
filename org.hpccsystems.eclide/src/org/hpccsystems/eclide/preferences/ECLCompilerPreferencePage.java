/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

package org.hpccsystems.eclide.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.hpccsystems.eclide.Activator;

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

	 public class SpacerFieldEditor extends LabelFieldEditor {
	 	// Implemented as an empty label field editor.
	 	public SpacerFieldEditor(Composite parent) {
	 		super("", parent);
	 	}
	 }
	 
	class LabelFieldEditor extends FieldEditor {

		private Label label;

		// All labels can use the same preference name since they don't
		// store any preference.
		public LabelFieldEditor(String value, Composite parent) {
			super("label", value, parent);
		}

		// Adjusts the field editor to be displayed correctly
		// for the given number of columns.
		protected void adjustForNumColumns(int numColumns) {
			((GridData) label.getLayoutData()).horizontalSpan = numColumns;
		}

		// Fills the field editor's controls into the given parent.
		protected void doFillIntoGrid(Composite parent, int numColumns) {
			label = getLabelControl(parent);
			
			GridData gridData = new GridData();
			gridData.horizontalSpan = numColumns;
			gridData.horizontalAlignment = GridData.FILL;
			gridData.grabExcessHorizontalSpace = false;
			gridData.verticalAlignment = GridData.CENTER;
			gridData.grabExcessVerticalSpace = false;
			
			label.setLayoutData(gridData);
		}

		// Returns the number of controls in the field editor.
		public int getNumberOfControls() {
			return 1;
		}

		// Labels do not persist any preferences, so these methods are empty.
		protected void doLoad() {
		}
		protected void doLoadDefault() {
		}
		protected void doStore() {
		}
	}

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
		addField(new LabelFieldEditor("Compiler Arguements:", getFieldEditorParent()));
		addField(new StringFieldEditor(ECLPreferenceConstants.P_ARGSCOMMON, "&Common:", getFieldEditorParent()));
		addField(new StringFieldEditor(ECLPreferenceConstants.P_ARGSSYNTAX, "&Syntax Check:", getFieldEditorParent()));
		addField(new StringFieldEditor(ECLPreferenceConstants.P_ARGSCOMPILE, "&Local Compile:", getFieldEditorParent()));
		addField(new StringFieldEditor(ECLPreferenceConstants.P_ARGSCOMPILEREMOTE, "&Remote Compile:", getFieldEditorParent()));
		
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