package org.hpccsystems.eclide.perspectives;

import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

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
