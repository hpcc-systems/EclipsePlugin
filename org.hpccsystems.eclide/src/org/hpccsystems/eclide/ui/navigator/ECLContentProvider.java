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
	Viewer viewer;
	
	class ProjectClientToolsElement {
		IProject project;
		ClientTools clientTools;

		protected ProjectClientToolsElement(IProject project, ClientTools clientTools) {
			this.project = project;
			this.clientTools = clientTools;
		}
		
		IFolder getEclLibraryFolder() {
			IFolder hiddenLibFolder = project.getFolder("ECL Library (" + clientTools.getVersion() + ")");
			if (!hiddenLibFolder.exists()) {
				try {
					hiddenLibFolder.createLink(clientTools.getEclLibraryPath(), IResource.HIDDEN, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			return hiddenLibFolder;
		}
	}
	
	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = viewer;
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
		}
		return false;
	}
}
