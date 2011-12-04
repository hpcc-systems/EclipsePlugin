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

import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.Workunit;

public class TextItemView extends PlatformBaseItemView {
	Workunit workunit;

	TextItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Workunit workunit) {
		super(treeViewer, parent, workunit.getPlatform());
		this.workunit = workunit; 
		refreshChildren();
	}

	@Override
	public String getText() {
		return "Query";
	}
	
	public String getQueryText() {
		return workunit.getQueryText();
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/doc.png");
	}

	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUInfo", "Wuid=" + workunit.getWuid());
	}
}

