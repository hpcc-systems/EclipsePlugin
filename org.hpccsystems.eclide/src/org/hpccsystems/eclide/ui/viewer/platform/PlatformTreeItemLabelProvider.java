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
