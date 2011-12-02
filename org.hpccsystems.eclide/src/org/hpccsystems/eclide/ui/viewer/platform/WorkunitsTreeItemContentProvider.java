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
import org.hpccsystems.internal.data.CollectionMonitor;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.DataSingleton;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.LazyChildLoader;
import org.hpccsystems.internal.ui.tree.MyTreeItem;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;
import org.hpccsystems.internal.ui.tree.WorkunitComparator;

class WorkunitsTreeItemContentProvider extends TreeItemContentProvider {
	Data data;
	LazyChildLoader<MyTreeItem> topItems;
	LazyChildLoader<MyTreeItem> children;

	WorkunitsTreeItemContentProvider(TreeViewer treeViewer) {
		super(treeViewer);
		this.topItems = new LazyChildLoader<MyTreeItem>();
		this.children = new LazyChildLoader<MyTreeItem>();
	}
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (!newInput.equals(oldInput)) {
			if (newInput instanceof Data) {
				this.data = (Data)newInput;
				children.start(new Runnable() {
					public void run() {
						primeChildren();
						refresh();
					}
				});
			}
		}
	}

	public Object[] getElements(Object inputElement) {
		return children.get();
	}
	
	@Override 
	public void primeChildren() {
		for (final Platform platform : data.getPlatforms()) {
			platform.deleteObserver(this);
			
			WorkunitFolderTreeItem wuFolder = new WorkunitFolderTreeItem(this, null, platform);
			wuFolder.primeChildren();
			topItems.add(wuFolder);
			for (Object o : wuFolder.getChildren()) {
				if (o instanceof MyTreeItem) {
					children.add((MyTreeItem)o);
				}
			}
			
			platform.addObserver(this);
		}
	}
	
	@Override 
	public void reloadChildren() {
		for (final Platform platform : data.getPlatforms()) {
			platform.getWorkunits();
		}
	}

	Collection<Workunit> getCurrentWorkunits() {
		Collection<Workunit> retVal = new ArrayList<Workunit>();
		for (Object item : children.get().clone()) {
			if (item instanceof WorkunitTreeItem) {
				WorkunitTreeItem ti = (WorkunitTreeItem)item;
				retVal.add(ti.getWorkunit());
			}
		}
		return retVal;
	}
	
	boolean mergeChanges(CollectionMonitor monitor) {
		boolean changed = false;
		for (Object item : children.get().clone()) {
			if (item instanceof WorkunitTreeItem) {
				WorkunitTreeItem ti = (WorkunitTreeItem)item;

				//  Remove deleted workunits  --- 
				if (monitor.removeContains(ti.getWorkunit())) {
					children.remove(ti);
					changed = true;
				}
			}
		}
		
		//  Add new workunits  ---
		for (DataSingleton ds : monitor.getAdded()) {
			if (ds instanceof Workunit) {
				children.add(new WorkunitTreeItem(this, null, (Workunit)ds));						
				changed = true;
			}
		}
		
		if (changed)
			children.sort(new WorkunitComparator());

		return changed;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Platform) {
			if (arg instanceof CollectionMonitor) {
				CollectionMonitor monitor = (CollectionMonitor)arg;
				if (mergeChanges(monitor)) {
					refresh();
				}
			}
		}
	}
}
