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
import java.util.Iterator;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.part.ViewPart;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;
import org.hpccsystems.eclide.ui.viewer.ResultViewer;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Result;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

public class PlatformViewer extends ViewPart {

	TreeViewer treeViewer;
	TreeItemContentProvider contentProvider;
	private HtmlViewer htmlViewer;
	private ResultViewer resultViewer;
	
	Action showWebItemAction;
	Action refreshItemAction;
	Action updateItemAction;
	Action reloadAction;
	Action refreshAction;

	public PlatformViewer() {
		contentProvider = null;
	}
	
	synchronized TreeItemContentProvider getContentProvider() {
		return new PlatformTreeItemContentProvider(treeViewer);
	}
	
	ISelectionChangedListener getSelectionListener() {
		return new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator<?> iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof ItemView) {
						boolean resultShown = showResult((ItemView)o);
						showWebPage((ItemView)o, !resultShown);
						break;
					}
				}
			}
		};
	}

	@Override
	public void createPartControl(Composite parent) {
	    treeViewer = new TreeViewer(parent);
	    treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
	    contentProvider = getContentProvider();
	    treeViewer.setContentProvider(contentProvider);
	    treeViewer.setLabelProvider(new PlatformTreeItemLabelProvider(treeViewer));
	    treeViewer.setInput(Data.get());
	    
        createActions();
        createToolbar();
        createContextMenu();

		treeViewer.addSelectionChangedListener(getSelectionListener());
	}

	@Override
	public void setFocus() {
		treeViewer.getControl().setFocus();
	}

	public void showWebPage(ItemView ti, boolean bringToTop) {
		if (htmlViewer == null)
			htmlViewer = Eclipse.findHtmlViewer();
		
		try {
			URL webPageURL = ti.getWebPageURL();
			if (htmlViewer != null && webPageURL != null) {
				htmlViewer.showURL(ti, webPageURL.toString(), ti.getUser(), ti.getPassword(), bringToTop);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean showResult(ItemView ti) {
		Result result = ti.getResult();
		if (result == null)
			return false;
		
		if (resultViewer == null)
			resultViewer = Eclipse.findResultViewer();
		
		if (resultViewer == null) 
			return false;

		resultViewer.showResult(result);
		return true;
	}
	
	public void createActions() {
		showWebItemAction = new Action("Show ECL Watch") {
			@Override
			public void run() { 
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator<?> iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof ItemView) {
						showWebPage((ItemView)o, true);
					}
					break;
				}
			}
		};
		
		refreshItemAction = new Action("Refresh") {
			@Override
			public void run() { 
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				if (sel.size() == 0) {	//  No selection == reload
					treeViewer.refresh();
				} else {
					Iterator<?> iter = sel.iterator();
					while (iter.hasNext()) {
						Object o = iter.next();
						if (o instanceof ItemView)
							((ItemView)o).refresh();
					}
				}
			}
		};

		updateItemAction = new Action("Update") {
			@Override
			public void run() { 
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator<?> iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof ItemView)
						((ItemView)o).update(null);
				}
			}
		};

		reloadAction = new Action("Reload") {
			@Override
			public void run() {
				contentProvider.reloadChildren();
			}
		};

		refreshAction = new Action("Refresh") {
			@Override
			public void run() {
				contentProvider.refreshChildren();
			}
		};
	}
	
	/**
	 * Create toolbar.
	 */
	protected void createToolbar() {
		IToolBarManager mgr = getViewSite().getActionBars().getToolBarManager();
		mgr.add(refreshAction);
		mgr.add(reloadAction);
	}

	protected void createContextMenu() {
		// Create menu manager.
		MenuManager menuMgr = new MenuManager();
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			@Override
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
		//mgr.add(showWebItemAction);
		mgr.add(refreshItemAction);
		//mgr.add(updateItemAction);
	}	
}
