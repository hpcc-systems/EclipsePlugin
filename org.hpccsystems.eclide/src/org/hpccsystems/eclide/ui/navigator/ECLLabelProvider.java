package org.hpccsystems.eclide.ui.navigator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.ui.navigator.ECLContentProvider.ProjectClientToolsElement;

public class ECLLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof ProjectClientToolsElement) {
			return Activator.getImage("icons/package.gif"); 
		} else if (element instanceof ShortcutFolder) {
			return ((ShortcutFolder)element).getImage();
		} 
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ProjectClientToolsElement) {
			return ((ProjectClientToolsElement)element).clientTools.getFolderName(true);
		} else if (element instanceof ShortcutFolder) {
			return ((ShortcutFolder)element).getText();
		} 
		return null;
	}

}
