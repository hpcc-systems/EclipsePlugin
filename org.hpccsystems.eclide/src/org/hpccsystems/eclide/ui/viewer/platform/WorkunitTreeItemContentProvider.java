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
package org.hpccsystems.eclide.ui.viewer.platform;

import java.util.Observable;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.hpccsystems.esp.Platform;
import org.hpccsystems.esp.Workunit;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.LazyChildLoader;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

class WorkunitTreeItemContentProvider extends TreeItemContentProvider {
	Platform p;
	Workunit wu;
	WorkunitView wuView;
	LazyChildLoader<ItemView> children;

	WorkunitTreeItemContentProvider(TreeViewer treeViewer, Workunit wu) {
		super(treeViewer);
		this.wu = wu;
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput != null && !newInput.equals(oldInput)) {
			wuView = new WorkunitView(this, null, wu);
			wuView.hasChildren();
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return wuView.getChildren();
	}

	@Override 
	public void refreshChildren() {
		wuView.refreshChildren();
	}

	@Override
	public void reloadChildren() {
		wuView.refreshChildren();
		refresh();
	}

	@Override
	public void update(Observable o, Object arg) {
	}
}

