package org.hpccsystems.eclide.ui.navigator;

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
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ProjectClientToolsElement) {
			String label = "Client Tools (" + ((ProjectClientToolsElement)element).clientTools.getVersion() + ")";
			return label;
		}
		return null;
	}

}
