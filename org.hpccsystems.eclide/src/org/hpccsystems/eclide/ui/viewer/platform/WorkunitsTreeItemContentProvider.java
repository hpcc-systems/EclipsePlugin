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
import org.hpccsystems.internal.data.CollectionMonitor;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.DataSingleton;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.LazyChildLoader;
import org.hpccsystems.internal.ui.tree.MyTreeItem;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

class WorkunitsTreeItemContentProvider extends TreeItemContentProvider {
	Data data;
	LazyChildLoader children;

	WorkunitsTreeItemContentProvider(TreeViewer treeViewer, Data data) {
		super(treeViewer);
		this.data = data;
		this.children = new LazyChildLoader();
	}

	public Object[] getElements(Object inputElement) {
		switch (children.getState()) {
		case UNKNOWN:
			final WorkunitsTreeItemContentProvider self = this;
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
		//children.clearState();
		return children.get();
	}

	Object[] fetchChildren() {
		ArrayList<MyTreeItem> retVal = new ArrayList<MyTreeItem>();
		for (Platform p : data.getPlatforms()) {
			p.addObserver(this);
			for(Workunit wu : p.getWorkunits()) {
				retVal.add(new WorkunitTreeItem(this, null, wu));
			}
		}
		return retVal.toArray();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Platform) {
			if (arg instanceof CollectionMonitor) {
				CollectionMonitor monitor = (CollectionMonitor)arg;
				
				//  Remove removed workunits  --- 
				for (Object item : children.get().clone()) {
					if (item instanceof WorkunitTreeItem) {
						WorkunitTreeItem ti = (WorkunitTreeItem)item;
						if (monitor.removeContains(ti.getWorkunit())) {
							children.remove(item);
						}
					}
				}
				//  Add new workunits  ---
				for (DataSingleton ds : monitor.getAdded()) {
					if (ds instanceof Workunit) {
						children.add(new WorkunitTreeItem(this, null, (Workunit)ds));						
					}
				}
			}

			//children.clearState();
			Display.getDefault().asyncExec(new Runnable() {   
				public void run() {
					treeViewer.refresh();
				}
			});
		}
	}
}
