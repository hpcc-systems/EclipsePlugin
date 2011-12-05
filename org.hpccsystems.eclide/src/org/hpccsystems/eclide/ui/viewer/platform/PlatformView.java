package org.hpccsystems.eclide.ui.viewer.platform;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.ui.tree.ItemView;

public class PlatformView extends PlatformBaseView {

	PlatformView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform) {
		super(treeViewer, parent, platform);
		refreshChildren();
	}

	public Platform getPlatform() {
		return platform;
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
		retVal.add(new ClusterFolderView(treeViewer, this, platform));
		retVal.add(new DropZoneFolderView(treeViewer, this, platform));
		retVal.add(new WorkunitFolderView(treeViewer, this, platform));
		retVal.add(new FileSprayWorkunitFolderView(treeViewer, this, platform));
		retVal.add(new QuerySetFolderView(treeViewer, this, platform));
		retVal.add(new LogicalFileFolderView(treeViewer, this, platform));
		children.set(retVal.toArray(new ItemView[0]));
	}
}

