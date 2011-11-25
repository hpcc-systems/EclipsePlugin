/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

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

