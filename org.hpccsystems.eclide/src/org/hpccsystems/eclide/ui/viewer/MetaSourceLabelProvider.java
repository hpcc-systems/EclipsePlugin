package org.hpccsystems.eclide.ui.viewer;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.builder.meta.ECLDefinition;

public class MetaSourceLabelProvider implements ILabelProvider {

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
		if (element instanceof ECLDefinition) {
			if (((ECLDefinition)element).isExported()) {
				return Activator.getImage("icons/attr_exported.png"); 
			}
			return Activator.getImage("icons/attr.png"); 
		}
		
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ECLDefinition) {
			String type = ((ECLDefinition)element).getType();
			return ((ECLDefinition)element).getName() + (type.isEmpty() ? "" : " (" + type.toUpperCase() + ")");
		}
		return null;
	}
}
