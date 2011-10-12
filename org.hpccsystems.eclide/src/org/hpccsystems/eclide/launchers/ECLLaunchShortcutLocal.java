package org.hpccsystems.eclide.launchers;

import org.eclipse.core.resources.IFile;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.internal.Eclipse;

public class ECLLaunchShortcutLocal implements ILaunchShortcut {
	
	public void launch(ISelection selection, String mode) {
		if (selection instanceof TreeSelection) {
			TreeSelection treeSel = (TreeSelection) selection;
			IFile file = null;
			if (treeSel.size() >= 1) {
				file = (IFile) treeSel.getFirstElement();
			}
			
			if (file == null)
				return;

			Eclipse.doSaveDirty(file.getProject());
			ECLCompiler compiler = new ECLCompiler(file.getProject());
			compiler.buildAndRunLocal(file);
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		//ProgressMonitor monitor = new ProgressMonitor((Component) editor, "Save All", "", 0, 0);
		//editor.doSave(null);
		IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
		if (input != null) {
			IFile file = input.getFile();
			Eclipse.doSaveDirty(file.getProject());
			ECLCompiler compiler = new ECLCompiler(file.getProject());
			compiler.buildAndRunLocal(file);
		}
		assert(input != null);
	}
}
