package org.hpccsystems.internal.ui.tree;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;
import org.hpccsystems.internal.Eclipse;

public class TreeItem {
	protected TreeViewer treeViewer;
	protected TreeItem parent;
	private HtmlViewer htmlViewer;
	public LazyChildLoader children;

	protected TreeItem(TreeViewer treeViewer, TreeItem parent) {
		this.treeViewer = treeViewer;
		this.parent = parent;
		this.htmlViewer = null;
		this.children = new LazyChildLoader();
	}
	
	HtmlViewer getHtmlViewer() {
		return htmlViewer;
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

	public final void showWebPage() {
		if (htmlViewer == null)
			htmlViewer = Eclipse.findHtmlViewer();
		
		try {
			URL webPageURL = getWebPageURL();
			if (htmlViewer != null && webPageURL != null) {
				htmlViewer.showURL(webPageURL.toString(), getUser(), getPassword());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public URL getWebPageURL() throws MalformedURLException {
		return new URL ("about:blank");
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
