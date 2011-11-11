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
package org.hpccsystems.eclide.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class ECLWatch implements IPerspectiveFactory {

	public static final String PERSPECTIVE_ID = "org.hpccsystems.eclide.perspectives.ECLWatch";

	private IPageLayout layout;

	public ECLWatch() {
		super();
	}

	public void createInitialLayout(IPageLayout layout) {
		this.layout = layout;
		addViews();
		addActionSets();
		addNewWizardShortcuts();
		addPerspectiveShortcuts();
		addViewShortcuts();
	}

	private void addViews() {
		// Creates the overall folder layout. 
		// Note that each new Folder uses a percentage of the remaining EditorArea.
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);		

		IFolderLayout left = layout.createFolder( "left", IPageLayout.LEFT, 0.25f, editorArea);
		left.addView("org.hpccsystems.eclide.viewPlatforms");
		layout.getViewLayout("org.hpccsystems.eclide.viewPlatforms").setCloseable(false);
		layout.getViewLayout("org.hpccsystems.eclide.viewPlatforms").setMoveable(false);

		IFolderLayout right = layout.createFolder( "right", IPageLayout.RIGHT, 0.75f, editorArea);
		right.addView("org.hpccsystems.eclide.htmlView");
		layout.getViewLayout("org.hpccsystems.eclide.htmlView").setCloseable(false);
		layout.getViewLayout("org.hpccsystems.eclide.htmlView").setMoveable(false);
	}

	private void addActionSets() {
	}

	private void addPerspectiveShortcuts() {
		layout.addPerspectiveShortcut(ECLPerspective.PERSPECTIVE_ID); //NON-NLS-1
		layout.addPerspectiveShortcut(ECLWatch.PERSPECTIVE_ID); //NON-NLS-1
	}

	private void addNewWizardShortcuts() {
	}

	private void addViewShortcuts() {
	}

}
