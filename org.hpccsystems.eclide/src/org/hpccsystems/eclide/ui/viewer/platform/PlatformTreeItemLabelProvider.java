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

import org.eclipse.jface.viewers.TreeViewer;
import org.hpccsystems.internal.ui.tree.TreeItem;
import org.hpccsystems.internal.ui.tree.TreeItemLabelProvider;

public class PlatformTreeItemLabelProvider extends TreeItemLabelProvider {

	public PlatformTreeItemLabelProvider(TreeViewer treeViewer) {
		super(treeViewer);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof TreeItem) {
			final TreeItem treeItem = (TreeItem)element; 
			switch(treeItem.children.getState()) {
			case UNKNOWN:
				return treeItem.getText() + " (Unknown...)";
			case STARTED:
				return treeItem.getText() + " (Calculating...)";
			case FINISHED:
				if (treeItem instanceof FolderTreeItem) {
					//if (!treeViewer.getExpandedState(element)) {
						if (treeItem.children.getCount() > 0)
							return treeItem.getText() + " (" + treeItem.children.get().length + ")";
					//}
				}
				break;
			}
			return super.getText(element);
		}
		return "TODO";
	}
}	
