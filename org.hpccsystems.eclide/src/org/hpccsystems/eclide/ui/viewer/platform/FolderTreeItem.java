package org.hpccsystems.eclide.ui.viewer.platform;

import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.Platform;

public class FolderTreeItem extends PlatformBaseTreeItem {

	FolderTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/folder.png"); 
	}
}

