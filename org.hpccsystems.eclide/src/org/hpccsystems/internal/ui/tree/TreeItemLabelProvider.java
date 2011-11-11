package org.hpccsystems.internal.ui.tree;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Image;

public class TreeItemLabelProvider implements ILabelProvider {
	protected TreeViewer treeViewer;

	public TreeItemLabelProvider(TreeViewer treeViewer) {
		this.treeViewer = treeViewer;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof TreeItem) {
			return ((TreeItem)element).getImage();
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof TreeItem) {
			return ((TreeItem)element).getText();
		}
		return "TODO";
	}
}	
