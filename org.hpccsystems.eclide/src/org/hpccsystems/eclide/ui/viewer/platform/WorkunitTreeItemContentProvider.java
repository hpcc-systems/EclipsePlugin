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

import java.util.ArrayList;
import java.util.Observable;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Display;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.LazyChildLoader;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

class WorkunitTreeItemContentProvider extends TreeItemContentProvider {
	Platform p;
	Workunit wu;
	LazyChildLoader<ItemView> children;

	WorkunitTreeItemContentProvider(TreeViewer treeViewer, Workunit wu) {
		super(treeViewer);
		this.wu = wu;
		this.children = new LazyChildLoader<ItemView>();
	}

	public Object[] getElements(Object inputElement) {
		switch (children.getState()) {
		case UNKNOWN:
			final WorkunitTreeItemContentProvider self = this;
			children.start(new Runnable() {
				public void run() {
					children.set(fetchChildren());
					Display.getDefault().asyncExec(new Runnable() {   
						public void run() {
							self.treeViewer.refresh();
						}
					});
				}
			});
			break;
		case STARTED:
			break;
		case FINISHED:
			break;
		}
		return children.get();
	}

	ItemView[] fetchChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		WorkunitItemView item = new WorkunitItemView(this, null, wu);
		item.refreshChildren();
		for (Object o : item.getChildren()) {
			retVal.add(o);
		}
		return retVal.toArray(new ItemView[0]);
	}

	@Override
	public void update(Observable o, Object arg) {
		children.clear();
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {
				treeViewer.refresh();
			}
		});
	}
}

