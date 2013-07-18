package org.hpccsystems.eclide.ui.navigator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IContributorResourceAdapter;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

class ShortcutFolder implements IAdaptable {
	String displayLabel;
	IFolder hiddenLibFolder;
	
	public ShortcutFolder(IProject project, String folderID, String displayLabel, IPath shortcutPath) {
		hiddenLibFolder = project.getFolder(folderID);
		this.displayLabel= displayLabel;
		if (!hiddenLibFolder.exists()) {
			try {
				hiddenLibFolder.createLink(shortcutPath, IResource.HIDDEN, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String getText() {
		return displayLabel;
	}

	public Image getImage() {
		WorkbenchLabelProvider wlp = new WorkbenchLabelProvider();
		return wlp.getImage(hiddenLibFolder);
	}

	@Override
	public Object getAdapter(Class adapter) {
		return hiddenLibFolder.getAdapter(adapter);
	}

	public Object[] getChildren() {
		WorkbenchContentProvider wcp = new WorkbenchContentProvider();
		return wcp.getChildren(hiddenLibFolder);
	}

	public boolean hasChildren() {
		WorkbenchContentProvider wcp = new WorkbenchContentProvider();
		return wcp.hasChildren(hiddenLibFolder);
	}

}