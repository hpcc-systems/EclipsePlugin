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
		for (Platform p : ((Data)inputElement).GetPlatforms()) {
			retVal.add(new PlatformTreeItem(treeViewer, null, p));
		}
		return retVal.toArray();
	}

	@Override
	public void update(Observable o, Object arg) {
	}
}
