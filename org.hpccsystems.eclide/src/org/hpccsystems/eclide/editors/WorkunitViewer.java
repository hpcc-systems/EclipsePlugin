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
package org.hpccsystems.eclide.editors;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.part.ViewPart;
import org.hpccsystems.eclide.editors.ECLWindow.CWorkunitTabItem;
import org.hpccsystems.eclide.ui.viewer.BrowserEx;
import org.hpccsystems.eclide.ui.viewer.TableEx;
import org.hpccsystems.eclide.ui.viewer.platform.PlatformTreeItemLabelProvider;
import org.hpccsystems.eclide.ui.viewer.platform.TextTreeItem;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitTreeItem;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Result;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.LazyChildLoader;
import org.hpccsystems.internal.ui.tree.TreeItem;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

public class WorkunitViewer extends ViewPart {
	Workunit wu;

	TreeViewer treeViewer;
	
	CWorkunitTabItem owner;
	
	Action showWebItemAction;
	Action refreshItemAction;
	Action updateItemAction;
	Action reloadAction;
	
	class WorkunitTreeItemContentProvider extends TreeItemContentProvider {
		Platform p;
		Workunit wu;
		LazyChildLoader children;
		
		WorkunitTreeItemContentProvider(TreeViewer treeViewer, Workunit wu) {
			super(treeViewer);
			this.wu = wu;
			this.children = new LazyChildLoader();
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public Object[] getElements(Object inputElement) {
			switch (children.getState()) {
			case UNKNOWN:
				final WorkunitTreeItemContentProvider self = this;
				children.start(new Runnable() {
					public void run() {
						children.set(fetchChildren());
						Display.getDefault().asyncExec(new Runnable() {   
							public void run() {
								self.treeViewer.refresh();
							}
						});
					}
				});
				break;
			case STARTED:
				break;
			case FINISHED:
				break;
			}
			children.clearState();
			return children.get();
		}
		
		Object[] fetchChildren() {
			ArrayList<Object> retVal = new ArrayList<Object>();
			WorkunitTreeItem item = new WorkunitTreeItem(this, null, wu);
			for (Object o : item.fetchChildren()) {
				retVal.add(o);
			}
			return retVal.toArray();
		}

		@Override
		public void update(Observable o, Object arg) {
			children.clearState();
			Display.getDefault().asyncExec(new Runnable() {   
				public void run() {
					treeViewer.refresh();
				}
			});
		}
	}

	public WorkunitViewer(Workunit wu) {
		this.wu = wu;
	}

	@Override
	public void createPartControl(Composite parent) {
		// Create the tree viewer to display the file tree
	    treeViewer = new TreeViewer(parent);
	    treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
	    treeViewer.setContentProvider(new WorkunitTreeItemContentProvider(treeViewer, wu));
	    treeViewer.setLabelProvider(new PlatformTreeItemLabelProvider(treeViewer));
	    treeViewer.setInput(Data.get().getPlatforms()); // pass a non-null that will be ignored
	    
	 // Create menu and toolbars.
        createActions();
        //createMenu();
        //createToolbar();
        //createContextMenu();
        //hookGlobalActions();
         
        // Restore state from the previous session.
        //restoreState();
  	}

	@Override
	public void setFocus() {
		treeViewer.getControl().setFocus();
	}

	public void showWebPage(TreeItem ti) {
		if (owner == null)
			return;
		
		try {
			URL webPageURL = ti.getWebPageURL();
			if (webPageURL != null) {
				owner.navigateTo(webPageURL.toString(), ti.getUser(), ti.getPassword());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean showResult(TreeItem ti) {
		if (owner == null) 
			return false;

		Result result = ti.getResult();
		if (result == null)
			return false;
		
		owner.setResult(result);
		return true;
	}
	
	public boolean showQuery(TreeItem ti) {
		if (owner == null) 
			return false;
		
		if (ti instanceof TextTreeItem) {
			TextTreeItem tti = (TextTreeItem)ti;
			owner.setQuery(tti.getQueryText());
			return true;
		}
		return false;
	}
	
	public void createActions() {
		showWebItemAction = new Action("Show ECL Watch") {
			public void run() { 
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator<?> iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof TreeItem) {
						//showWebPage((TreeItem)o, true);
					}
					break;
				}
			}
		};
		
		refreshItemAction = new Action("Refresh") {
			public void run() { 
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator<?> iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof TreeItem)
						((TreeItem)o).refresh();
				}
			}
		};

		updateItemAction = new Action("Update") {
			public void run() { 
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator<?> iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof TreeItem)
						((TreeItem)o).update(null);
				}
			}
		};

		reloadAction = new Action("Reload") {
			public void run() { 
				treeViewer.refresh();
			}
		};

		// Add selection listener.
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator<?> iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof TreeItem) {
						showWebPage((TreeItem)o);
						showResult((TreeItem)o);
						showQuery((TreeItem)o);
					}
					break;
				}
			}
		});
   }
	
	/**
	 * Create toolbar.
	 */
	private void createContextMenu() {
		// Create menu manager.
		MenuManager menuMgr = new MenuManager();
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager mgr) {
				fillContextMenu(mgr);
			}
		});
		
		// Create menu.
		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		treeViewer.getControl().setMenu(menu);
		
		// Register menu for extension.
		getSite().registerContextMenu(menuMgr, treeViewer);
	}	
	
	private void fillContextMenu(IMenuManager mgr) {
		mgr.add(showWebItemAction);
		mgr.add(refreshItemAction);
		mgr.add(updateItemAction);
		mgr.add(reloadAction);
	}

	public void setOwner(CWorkunitTabItem workunitTabItem) {
		this.owner = workunitTabItem;
	}	
}
