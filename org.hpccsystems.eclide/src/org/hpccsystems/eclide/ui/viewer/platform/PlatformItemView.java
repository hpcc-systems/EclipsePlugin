package org.hpccsystems.eclide.ui.viewer.platform;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.ui.tree.ItemView;

public class PlatformItemView extends PlatformBaseItemView {

	PlatformItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform) {
		super(treeViewer, parent, platform);
		refreshChildren();
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
	public void refreshChildren() {
		ArrayList<ItemView> retVal = new ArrayList<ItemView>();
		retVal.add(new ClusterFolderItemView(treeViewer, this, platform));
		retVal.add(new WorkunitFolderItemView(treeViewer, this, platform));
		retVal.add(new FileSprayWorkunitFolderItemView(treeViewer, this, platform));
		retVal.add(new QuerySetFolderItemView(treeViewer, this, platform));
		retVal.add(new LogicalFileFolderItemView(treeViewer, this, platform));
		children.set(retVal.toArray(new ItemView[0]));
	}
}

