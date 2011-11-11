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

package org.hpccsystems.internal.ui;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class LabelFieldEditor extends FieldEditor {

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
