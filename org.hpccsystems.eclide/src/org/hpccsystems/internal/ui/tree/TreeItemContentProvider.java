/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.internal.ui.tree;

import java.util.Observer;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.hpccsystems.eclide.ui.viewer.platform.TreeItemOwner;

abstract public class TreeItemContentProvider implements ITreeContentProvider, Observer, TreeItemOwner {
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

	@Override
	public void update(final Object element, final String[] properties) {
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {
				treeViewer.update(element, properties);
			}
		});
	}
	
	@Override
	public void refresh(final Object element) {
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {
				treeViewer.refresh(element);
			}
		});
	}
}

