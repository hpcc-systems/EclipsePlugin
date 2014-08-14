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
package org.hpccsystems.eclide.ui.viewer.platform;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.esp.Platform;
import org.hpccsystems.internal.ui.tree.ItemView;

public class PlatformView extends PlatformBaseView {

	PlatformView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	public Platform getPlatform() {
		return platform;
	}

	@Override
	public String getText() {
		if (platform.getPort() != 8010) {
			return platform.getIP() + ":" + platform.getPort();
		}
		return platform.getIP();
	}

	@Override
	public Image getImage() {
		if (platform.isDisabled()) {
			return Activator.getImage("icons/platform_disabled.png");
		} 
		return Activator.getImage("icons/platform.png"); 
	}

	@Override
	public URL getWebPageURL(boolean hasNewEclWatch) throws MalformedURLException {
		return platform.getURL();
	}

	@Override
	public void refreshChildren() {
		ArrayList<ItemView> retVal = new ArrayList<ItemView>();
		if (platform.isEnabled()) {
			retVal.add(new TargetFolderView(treeViewer, this, platform));
			retVal.add(new DropZoneFolderView(treeViewer, this, platform));
			retVal.add(new WorkunitFolderView(treeViewer, this, platform));
			retVal.add(new FileSprayWorkunitFolderView(treeViewer, this, platform));
			retVal.add(new QuerySetFolderView(treeViewer, this, platform));
			retVal.add(new LogicalFileFolderView(treeViewer, this, platform));
		}
		children.set(retVal.toArray(new ItemView[0]));
	}
}

