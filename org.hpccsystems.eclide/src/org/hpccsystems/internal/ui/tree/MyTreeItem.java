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

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.hpccsystems.eclide.ui.viewer.platform.TreeItemOwner;
import org.hpccsystems.internal.data.Result;

public class MyTreeItem {
	protected TreeItemOwner treeViewer;
	protected MyTreeItem parent;
	public LazyChildLoader children;

	protected MyTreeItem(TreeItemOwner treeViewer, MyTreeItem parent) {
		this.treeViewer = treeViewer;
		this.parent = parent;
		this.children = new LazyChildLoader();
	}
	
	public MyTreeItem getParent() {
		return parent;
	}

	public String getText() {
		return "TODO";
	}
	
	public Image getImage() {
        return null;
	}

	public URL getWebPageURL() throws MalformedURLException {
		return new URL ("about:blank");
	}
	
	public Result getResult() {
		return null;
	}
	
	public String getUser() {
		return "";
	}

	public String getPassword() {
		return "";
	}

	public void update(final String[] properties) {
		if (treeViewer != null)
			treeViewer.update(this, properties);
	}

	public void refresh() {
		children.clearState();
		if (treeViewer != null)
			treeViewer.refresh(this);
	}
	
	public boolean hasChildren() {
		switch (children.getState()) {
		case UNKNOWN:
			final MyTreeItem self = this;
			children.start(new Runnable() {
				public void run() {
					children.set(fetchChildren());
					Display.getDefault().asyncExec(new Runnable() {   
						public void run() {
							treeViewer.refresh(self);
						}
					});
				}
			});
			//  Java does not like this (but it is being used to display "calculating") -> update(null);
			break;
		case STARTED:
			break;
		case FINISHED:
			break;
		}
		return children.get() == null ? false : children.get().length > 0;
	}
	
	public Object[] getChildren() {
		return children.get();
	}

	public Object[] fetchChildren() {
		return null;
	}
}
