package org.seisint.eclide.internal.ui.actions;

import org.eclipse.dltk.ui.DLTKUIPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.search.ui.NewSearchUI;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class OpenOctaveSearchPageAction implements IWorkbenchWindowActionDelegate {

	private static final String OCTAVE_SEARCH_PAGE_ID = "org.seisint.eclide.ui.OctaveSearchPage";

	private IWorkbenchWindow window;

	public OpenOctaveSearchPageAction() {
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	public void run(IAction action) {
		if (window == null || window.getActivePage() == null) {
			beep();
			return;
		}

		NewSearchUI.openSearchDialog(window, OCTAVE_SEARCH_PAGE_ID);
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void dispose() {
		window = null;
	}

	protected void beep() {
		Shell shell = DLTKUIPlugin.getActiveWorkbenchShell();
		if (shell != null && shell.getDisplay() != null)
			shell.getDisplay().beep();
	}
}