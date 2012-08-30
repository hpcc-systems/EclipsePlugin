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

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.PathEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.ClientTools;
import org.hpccsystems.internal.ui.LabelFieldEditor;
import org.hpccsystems.internal.ui.SpacerFieldEditor;

public class ECLGlobalPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public ECLGlobalPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("ECL Related Preferences.");
	}

	@Override
	protected void createFieldEditors() {
		addField(new PathEditor(ClientTools.P_KNOWNTOOLSPATH, "&HPCC Client Tools:", "Select Root Folder", getFieldEditorParent()));
	}
}
