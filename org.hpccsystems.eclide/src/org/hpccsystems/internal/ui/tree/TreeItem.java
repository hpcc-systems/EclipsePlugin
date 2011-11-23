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

package org.hpccsystems.internal.ui.tree;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;
import org.hpccsystems.eclide.ui.viewer.ResultViewer;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.data.Result;

public class TreeItem {
	protected TreeViewer treeViewer;
	protected TreeItem parent;
	private HtmlViewer htmlViewer;
	private ResultViewer resultViewer;
	public LazyChildLoader children;

	protected TreeItem(TreeViewer treeViewer, TreeItem parent) {
		this.treeViewer = treeViewer;
		this.parent = parent;
		this.htmlViewer = null;
		this.resultViewer = null;
		this.children = new LazyChildLoader();
	}
	
	HtmlViewer getHtmlViewer() {
		return htmlViewer;
	}
	
	ResultViewer getResultViewer() {
		return resultViewer;
	}
	
	public TreeItem getParent() {
		return parent;
	}

	public String getText() {
		return "TODO";
	}
	
	public Image getImage() {
        return null;
	}

	public void showWebPage(boolean bringToTop) {
		if (htmlViewer == null)
			htmlViewer = Eclipse.findHtmlViewer();
		
		try {
			URL webPageURL = getWebPageURL();
			if (htmlViewer != null && webPageURL != null) {
				htmlViewer.showURL(webPageURL.toString(), getUser(), getPassword(), bringToTop);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean showResult() {
		Result result = getResult();
		if (result == null)
			return false;
		
		if (resultViewer == null)
			resultViewer = Eclipse.findResultViewer();
		
		if (resultViewer == null) 
			return false;

		resultViewer.showResult(result);
		return true;
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
		final TreeItem self = this;
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {
				treeViewer.update(self, properties);
			}
		});
	}

	public void refresh() {
		children.clearState();
		final TreeItem self = this;
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {
				treeViewer.refresh(self);
			}
		});
	}
	
	final boolean hasChildren() {
		switch (children.getState()) {
		case UNKNOWN:
			final TreeItem self = this;
			children.start(new Runnable() {
				public void run() {
					children.set(fetchChildren());
					Display.getDefault().asyncExec(new Runnable() {   
						public void run() {
							treeViewer.refresh(self);
						}
					});
				}
			});
			update(null);
			break;
		case STARTED:
			break;
		case FINISHED:
			break;
		}
		return children.get() == null ? false : children.get().length > 0;
	}
	
	final Object[] getChildren() {
		return children.get();
	}

	protected Object[] fetchChildren() {
		return null;
	}
}
