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
import java.util.Collection;
import java.util.Observable;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.hpccsystems.internal.data.CollectionDelta;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.DataSingleton;
import org.hpccsystems.internal.data.DataSingletonCollection;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.LazyChildLoader;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

class PlatformTreeItemContentProvider extends TreeItemContentProvider {
	Data data;
	LazyChildLoader<ItemView> children;

	PlatformTreeItemContentProvider(TreeViewer treeViewer) {
		super(treeViewer);
		children = new LazyChildLoader<ItemView>();
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput != null && !newInput.equals(oldInput)) {
			if (newInput instanceof Data) {
				data = (Data)newInput;
				children.start(new Runnable() {
					@Override
					public void run() {
						refreshChildren();
						refresh();
					}
				});
			}
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return children.get();
	}

	@Override 
	public void refreshChildren() {
		Platform.All.deleteObserver(this);

		CollectionDelta delta = new CollectionDelta("PlatformTreeItemContentProvider.refreshChildren", getCurrentPlatforms());
		delta.calcChanges(data.getPlatforms());
		mergeChanges(delta);

		Platform.All.addObserver(this);
	}

	@Override
	public void reloadChildren() {
		children.clear();
		refreshChildren();
		refresh();
	}

	Collection<Platform> getCurrentPlatforms() {
		Collection<Platform> retVal = new ArrayList<Platform>();
		for (Object item : children.get().clone()) {
			if (item instanceof PlatformView) {
				PlatformView ti = (PlatformView)item;
				retVal.add(ti.getPlatform());
			}
		}
		return retVal;
	}

	boolean mergeChanges(CollectionDelta delta) {
		boolean changed = false;
		for (Object item : children.get().clone()) {
			if (item instanceof WorkunitView) {
				WorkunitView ti = (WorkunitView)item;

				//  Remove deleted workunits  --- 
				if (delta.removeContains(ti.getWorkunit())) {
					ti.getWorkunit().refreshState();
					changed = true;
				}
			}
		}

		//  Add new platforms  ---
		for (DataSingleton ds : delta.getAdded()) {
			if (ds instanceof Platform) {
				Platform wu = (Platform)ds;
				//  Filter goes here ---
				children.add(new PlatformView(this, null, wu));
				changed = true;
			}
		}

		//if (changed)
		//	children.sort(new WorkunitComparator());

		return changed;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof DataSingletonCollection) {
			if (arg instanceof CollectionDelta) {
				if (mergeChanges((CollectionDelta)arg)) {
					refresh();
				}
			}
		}
	}
}
