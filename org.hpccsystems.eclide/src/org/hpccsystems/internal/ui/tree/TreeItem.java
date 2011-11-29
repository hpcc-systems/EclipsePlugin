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

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.hpccsystems.eclide.ui.viewer.platform.TreeItemOwner;
import org.hpccsystems.internal.data.Result;

public class TreeItem {
	protected TreeItemOwner treeViewer;
	protected TreeItem parent;
	public LazyChildLoader children;

	protected TreeItem(TreeItemOwner treeViewer, TreeItem parent) {
		this.treeViewer = treeViewer;
		this.parent = parent;
		this.children = new LazyChildLoader();
	}
	
	public TreeItem getParent() {
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
			final TreeItem self = this;
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
