package org.hpccsystems.eclide.launchers;

import java.util.HashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.hpccsystems.eclide.builder.ECLCompiler;

public class ECLLaunchShortcut implements ILaunchShortcut {


	protected IResource[] getScopedDirtyResources(IProject[] projects) {
		HashSet<IResource> dirtyres = new HashSet<IResource>();
		IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
		for (int l = 0; l < windows.length; l++) {
			IWorkbenchPage[] pages = windows[l].getPages();
			for (int i = 0; i < pages.length; i++) {
				IEditorPart[] eparts = pages[i].getDirtyEditors();
				for (int j = 0; j < eparts.length; j++) {
					IResource resource = (IResource) eparts[j].getEditorInput().getAdapter(IResource.class);
					if (resource != null) {
						for (int k = 0; k < projects.length; k++) {
							if (projects[k].equals(resource.getProject())) {
								dirtyres.add(resource);
							}
						}
					}
				}
			}
		}
		return (IResource[]) dirtyres.toArray(new IResource[dirtyres.size()]);
	}
	
	void doSaveDirty(IProject project)
	{
		IProject[] projects = new IProject[1];
		projects[0] = project;
		IResource[] resources = getScopedDirtyResources(projects);
		IDE.saveAllEditors(resources, false);			
	}

	public void launch(ISelection selection, String mode) {
		if (selection instanceof TreeSelection) {
			TreeSelection treeSel = (TreeSelection) selection;
			IFile file = null;
			if (treeSel.size() >= 1) {
				file = (IFile) treeSel.getFirstElement();
			}
			
			if (file == null)
				return;

			doSaveDirty(file.getProject());
			ECLCompiler compiler = new ECLCompiler(file.getProject());
			compiler.buildAndRun(file);
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		//ProgressMonitor monitor = new ProgressMonitor((Component) editor, "Save All", "", 0, 0);
		//editor.doSave(null);
		IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
		if (input != null) {
			IFile file = input.getFile();
			doSaveDirty(file.getProject());
			ECLCompiler compiler = new ECLCompiler(file.getProject());
			compiler.buildAndRun(file);
		}
		assert(input != null);
	}
}
