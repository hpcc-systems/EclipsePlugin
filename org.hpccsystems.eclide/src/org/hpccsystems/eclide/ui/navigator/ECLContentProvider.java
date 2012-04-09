package org.hpccsystems.eclide.ui.navigator;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IPathVariableManager;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.eclide.builder.meta.ECLDefinition;
import org.hpccsystems.internal.Eclipse;

public class ECLContentProvider implements ITreeContentProvider {
	class ECLLibrary extends org.eclipse.core.internal.resources.Folder {
		IProject parent;

		protected ECLLibrary(IPath path, Workspace workspace) {
			super(path, workspace);
		}
	}
	
	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		ArrayList<Object> retVal = new ArrayList<Object>();
		if (parentElement instanceof IProject) {
			IProject project = (IProject)parentElement;
			ECLCompiler compiler = new ECLCompiler(project);
			retVal.add(compiler);
		} else if (parentElement instanceof ECLCompiler) {
			ECLCompiler compiler = (ECLCompiler)parentElement;
			retVal.add(compiler.getLibraryFolder());
		}
		return retVal.toArray();
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof ECLLibrary) {
			return ((ECLLibrary)element).parent;
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof IProject) {
			return true;
		} else if (element instanceof ECLCompiler) {
			return true;
		}
		return false;
	}
}
