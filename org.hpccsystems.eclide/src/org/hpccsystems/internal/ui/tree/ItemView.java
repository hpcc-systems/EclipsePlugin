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
package org.hpccsystems.internal.ui.tree;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.ui.viewer.platform.TreeItemOwner;
import org.hpccsystems.internal.data.Result;
import org.hpccsystems.internal.ui.tree.ItemView.ACTION;
import org.hpccsystems.internal.ui.tree.LazyChildLoader.CalcState;

public class ItemView {
	protected TreeItemOwner treeViewer;
	protected ItemView parent;
	public LazyChildLoader<ItemView> children;
	
	public static enum ACTION {
		UNKNOWN,
		ABORT,
		DELETE,
		RESUBMIT,
		RESTART,
		CLONE,
		PUBLISH,
		LAST
	}

	protected ItemView(TreeItemOwner treeViewer, ItemView parent) {
		this.treeViewer = treeViewer;
		this.parent = parent;
		this.children = new LazyChildLoader<ItemView>();
	}
	
	public ItemView getParent() {
		return parent;
	}

	public String getText() {
		return "TODO";
	}
	
	public Image getImage() {
        return null;
	}

	public Font getFont() {
		return null;
	}

	public Color getForeground() {
		return null;
	}

	public Color getBackground() {
		return null;
	}

	public URL getWebPageURL() throws MalformedURLException {
		return new URL ("about:blank");
	}
	
	public Result getResult() {
		return null;
	}
	
	public String getUser() {
		return "";
	}

	public String getPassword() {
		return "";
	}

	public void update(final String[] properties) {
		if (treeViewer != null)
			treeViewer.update(this, properties);
	}

	public void refresh() {
		refreshItem();
		refreshChildren();
		if (treeViewer != null)
			treeViewer.refresh(this);
	}
	
	public boolean hasChildren() {
		switch (children.getState()) {
		case UNKNOWN:
			final ItemView self = this;
			children.start(new Runnable() {
				@Override
				public void run() {
					refreshChildren();
					children.setState(CalcState.FINISHED);
					treeViewer.refresh(self);
				}
			});
			break;
		case STARTED:
			break;
		case FINISHED:
			break;
		}
		return children.get() == null ? false : children.get().length > 0;
	}
	
	public Object[] getChildren() {
		return children.get();
	}

	public void refreshItem() {
	}

	public void refreshChildren() {
		children.set(new ItemView[0]);
	}
	
	public boolean canPerform(ACTION action) {
		return false;
	}

	public void perform(ACTION action) {
	}
}
