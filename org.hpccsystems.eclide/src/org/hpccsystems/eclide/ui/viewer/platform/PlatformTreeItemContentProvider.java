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
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.ui.tree.TreeItem;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

class PlatformTreeItemContentProvider extends TreeItemContentProvider implements TreeItemOwner {
	Data data;
	
	PlatformTreeItemContentProvider(TreeViewer treeViewer, Data data) {
		super(treeViewer);
		this.data = data;
	}

	public Object[] getElements(Object inputElement) {
		ArrayList<TreeItem> retVal = new ArrayList<TreeItem>();
		for (Platform p : ((Data)inputElement).getPlatforms()) {
			retVal.add(new PlatformTreeItem(this, null, p));
		}
		return retVal.toArray();
	}
	
	@Override
	public void update(Observable o, Object arg) {
	}
	
	@Override
	public void update(final Object element, final String[] properties) {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				treeViewer.update(element, properties);
			} 
		});
	}
	
	@Override
	public void refresh(final Object element) {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				treeViewer.refresh(element);		
			} 
		});
	}
}
