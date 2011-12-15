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
package org.hpccsystems.eclide.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.jdt.ui.JavaUI;


/**
 *  This class is meant to serve as an example for how various contributions 
 *  are made to a perspective. Note that some of the extension point id's are
 *  referred to as API constants while others are hardcoded and may be subject 
 *  to change. 
 */
public class ECLPerspective implements IPerspectiveFactory {

	public static final String PERSPECTIVE_ID = "org.hpccsystems.eclide.perspectives.ECLPerspective";

	private IPageLayout layout;

	public ECLPerspective() {
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

		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.25f, editorArea);
		left.addView("org.hpccsystems.eclide.viewWorkunits");
		IFolderLayout bottomLeft = layout.createFolder( "bottomLeft", IPageLayout.BOTTOM, 0.25f, "left");
		bottomLeft.addView("org.hpccsystems.eclide.navigator");
		//bottomLeft.addView("org.hpccsystems.eclide.viewPlatforms");

		IFolderLayout bottom = layout.createFolder("bottomRight", IPageLayout.BOTTOM, 0.75f, editorArea);
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
		bottom.addView("org.hpccsystems.eclide.htmlView");
		bottom.addView("org.hpccsystems.eclide.resultView");

		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, 0.75f, editorArea);
		right.addView(IPageLayout.ID_OUTLINE);
}

	private void addActionSets() {
		layout.addActionSet("org.eclipse.debug.ui.launchActionSet"); //NON-NLS-1
		//factory.addActionSet("org.eclipse.debug.ui.debugActionSet"); //NON-NLS-1
		//factory.addActionSet("org.eclipse.debug.ui.profileActionSet"); //NON-NLS-1
		//factory.addActionSet("org.eclipse.jdt.debug.ui.JDTDebugActionSet"); //NON-NLS-1
		//factory.addActionSet("org.eclipse.jdt.junit.JUnitActionSet"); //NON-NLS-1
		//factory.addActionSet("org.eclipse.team.ui.actionSet"); //NON-NLS-1
		//factory.addActionSet("org.eclipse.team.cvs.ui.CVSActionSet"); //NON-NLS-1
		//factory.addActionSet("org.eclipse.ant.ui.actionSet.presentation"); //NON-NLS-1
		layout.addActionSet(JavaUI.ID_ACTION_SET);
		//factory.addActionSet(JavaUI.ID_ELEMENT_CREATION_ACTION_SET);
		//factory.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET); //NON-NLS-1
	}

	private void addPerspectiveShortcuts() {
		//factory.addPerspectiveShortcut("org.eclipse.team.ui.TeamSynchronizingPerspective"); //NON-NLS-1
		//factory.addPerspectiveShortcut("org.eclipse.team.cvs.ui.cvsPerspective"); //NON-NLS-1
		//layout.addPerspectiveShortcut("org.hpccsystems.eclide.perspectives.ECLPerspective"); //NON-NLS-1
		//layout.addPerspectiveShortcut(PERSPECTIVE_ID); //NON-NLS-1
		layout.addPerspectiveShortcut(ECLPerspective.PERSPECTIVE_ID); //NON-NLS-1
		layout.addPerspectiveShortcut(ECLWatch.PERSPECTIVE_ID); //NON-NLS-1
		//factory.addPerspectiveShortcut("org.eclipse.ui.resourcePerspective"); //NON-NLS-1
	}

	private void addNewWizardShortcuts() {
		//factory.addNewWizardShortcut("org.eclipse.team.cvs.ui.newProjectCheckout");//NON-NLS-1
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");//NON-NLS-1
		layout.addNewWizardShortcut("org.hpccsystems.eclide.wizards.ECLNewFileWizard");//NON-NLS-1
	}

	private void addViewShortcuts() {
		//factory.addShowViewShortcut("org.eclipse.ant.ui.views.AntView"); //NON-NLS-1
		//factory.addShowViewShortcut("org.eclipse.team.ccvs.ui.AnnotateView"); //NON-NLS-1
		//factory.addShowViewShortcut("org.eclipse.pde.ui.DependenciesView"); //NON-NLS-1
		//factory.addShowViewShortcut("org.eclipse.jdt.junit.ResultView"); //NON-NLS-1
		//factory.addShowViewShortcut("org.eclipse.team.ui.GenericHistoryView"); //NON-NLS-1
		layout.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
		//factory.addShowViewShortcut(JavaUI.ID_PACKAGES);
		layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
	}

}
