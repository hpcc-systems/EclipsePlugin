package org.hpccsystems.eclide.ui.viewer.platform;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.ui.tree.MyTreeItem;

public class PlatformTreeItem extends PlatformBaseTreeItem {

	PlatformTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform) {
		super(treeViewer, parent, platform);
		primeChildren();
	}

	@Override
	public String getText() {
		return platform.getIP();
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/platform.png"); 
	}

	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL();
	}

	@Override
	public void primeChildren() {
		ArrayList<MyTreeItem> retVal = new ArrayList<MyTreeItem>();
		retVal.add(new ClusterFolderTreeItem(treeViewer, this, platform));
		retVal.add(new WorkunitFolderTreeItem(treeViewer, this, platform));
		retVal.add(new FileSprayWorkunitFolderTreeItem(treeViewer, this, platform));
		retVal.add(new QuerySetFolderTreeItem(treeViewer, this, platform));
		retVal.add(new LogicalFileFolderTreeItem(treeViewer, this, platform));
		children.set(retVal.toArray(new MyTreeItem[0]));
	}
}

