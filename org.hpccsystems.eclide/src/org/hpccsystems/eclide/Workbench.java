package org.hpccsystems.eclide;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class Workbench {
	
	static IWorkbench getWorkbench() {
		return PlatformUI.getWorkbench();
	}
	
	static public IWorkbenchWindow getActiveWorkbenchWindow() {
		return getWorkbench().getActiveWorkbenchWindow();
	}
	
	static public IWorkbenchPage getActivePage() {
		return getActiveWorkbenchWindow().getActivePage();
	}

	static public IPerspectiveDescriptor getActivePerspective() {
		return getActivePage().getPerspective();
	}

	public static IEditorPart getActiveEditor() {
		return getActivePage().getActiveEditor();
	}

	public static Display getDisplay() {
		return getWorkbench().getDisplay();
	}

	public static Shell getShell() {
		return getActiveWorkbenchWindow().getShell();
	}

	public static IWorkbenchWindow[] getWorkbenchWindows() {
		return getWorkbench().getWorkbenchWindows();
	}
}
