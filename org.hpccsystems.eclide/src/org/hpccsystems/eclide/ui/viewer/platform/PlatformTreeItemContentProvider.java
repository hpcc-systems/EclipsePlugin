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

package org.hpccsystems.eclide.ui.viewer.platform;

import java.util.ArrayList;
import java.util.Observable;

import org.eclipse.jface.viewers.TreeViewer;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.ui.tree.TreeItem;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

class PlatformTreeItemContentProvider extends TreeItemContentProvider {
	Data data;
	
	PlatformTreeItemContentProvider(TreeViewer treeViewer, Data data) {
		super(treeViewer);
		this.data = data;
	}

	public Object[] getElements(Object inputElement) {
		ArrayList<TreeItem> retVal = new ArrayList<TreeItem>();
		for (Platform p : ((Data)inputElement).getPlatforms()) {
			retVal.add(new PlatformTreeItem(treeViewer, null, p));
		}
		return retVal.toArray();
	}

	@Override
	public void update(Observable o, Object arg) {
	}
}
