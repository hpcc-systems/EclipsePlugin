package org.hpccsystems.internal.ui.tree;

import java.util.Observer;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;

abstract public class TreeItemContentProvider implements ITreeContentProvider, Observer{
	protected TreeViewer treeViewer;

	protected TreeItemContentProvider(TreeViewer treeViewer) {
		this.treeViewer = treeViewer;
		//loadingState = new HashMap<Object, LoadingState>();
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof TreeItem) {
			return ((TreeItem)parentElement).getChildren();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof TreeItem) {
			return ((TreeItem)element).getParent();
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof TreeItem) {
			return ((TreeItem)element).hasChildren();
		}
		return false;
	}
}

