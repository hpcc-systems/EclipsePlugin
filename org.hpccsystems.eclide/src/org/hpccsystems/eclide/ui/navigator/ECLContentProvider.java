package org.hpccsystems.eclide.ui.navigator;

import java.util.ArrayList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.hpccsystems.internal.data.ClientTools;
import org.hpccsystems.internal.data.Data;

public class ECLContentProvider implements ITreeContentProvider {
	class ProjectClientToolsElement {
		IProject project;
		ClientTools clientTools;

		protected ProjectClientToolsElement(IProject project, ClientTools clientTools) {
			this.project = project;
			this.clientTools = clientTools;
		}

		Object getEclLibraryFolder() {
			return new ShortcutFolder(project, clientTools.getLibraryFolderName(true), clientTools.getLibraryFolderName(false), clientTools.getEclLibraryPath());
		}

		Object getEclExampleFolder() {
			return new ShortcutFolder(project, clientTools.getExamplesFolderName(true), clientTools.getExamplesFolderName(false), clientTools.getEclExamplesPath());
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
			for (ClientTools ct : Data.get().GetClientTools()) {
				retVal.add(new ProjectClientToolsElement((IProject)parentElement, ct));
			}
		} else if (parentElement instanceof ProjectClientToolsElement) {
			ProjectClientToolsElement pct = (ProjectClientToolsElement)parentElement;
			retVal.add(pct.getEclLibraryFolder());
			retVal.add(pct.getEclExampleFolder());
		} else if (parentElement instanceof ShortcutFolder) {
			return ((ShortcutFolder)parentElement).getChildren();
		}
		return retVal.toArray();
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof ProjectClientToolsElement) {
			return ((ProjectClientToolsElement)element).project;
		}
		else if (element instanceof IFolder) {
			//return ((ECLLibrary)element).parent;
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof IProject) {
			return true;
		} else if (element instanceof ProjectClientToolsElement) {
			return true;
		} else if (element instanceof ShortcutFolder) {
			return ((ShortcutFolder)element).hasChildren();
		}
		return false;
	}
}
