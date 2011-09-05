package org.hpccsystems.eclide.launchers;

import java.io.File;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.hpccsystems.eclide.builder.ECLCompiler;

public class ECLShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof TreeSelection) {
			TreeSelection treeSel = (TreeSelection) selection;
			TreePath[] paths = treeSel.getPaths();
			IProject project = null;
			if (paths.length >= 1) {
				for (int i = 0; i < paths[0].getSegmentCount(); ++i) {
					project = (IProject)paths[0].getSegment(i);
					if (project != null)
						break;
				}
			}
			if (project == null)
				return;
		
			IFile file = null;
			if (treeSel.size() >= 1) {
				file = (IFile) treeSel.getFirstElement();
			}
			
			if (file == null)
				return;
			
			ECLCompiler compiler = new ECLCompiler(project);
			compiler.BuildAndRun(file);
		}
			
		//ECLCompiler compiler(selection)
		// TODO Auto-generated method stub

	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		// TODO Auto-generated method stub

	}
}
