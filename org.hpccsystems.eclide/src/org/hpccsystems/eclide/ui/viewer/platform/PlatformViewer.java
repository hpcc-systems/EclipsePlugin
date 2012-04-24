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
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.ide.IDE;

import org.hpccsystems.eclide.editors.ECLWindow;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;
import org.hpccsystems.eclide.ui.viewer.ResultViewer;
import org.hpccsystems.eclide.ui.viewer.platform.PlatformActions.IPlatformUI;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Result;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

public class PlatformViewer extends ViewPart {

	class MyTreeViewer extends TreeViewer {

		public MyTreeViewer(Composite parent) {
			super(parent);
		}

		List<Object> getElements() {
			Item[] items = getChildren(getControl());
			ArrayList<Object> result = new ArrayList<Object>(items.length);
			for (Item item : items) {
				Object data = item.getData();
				if (data != null) {
					result.add(data);
				}
			}
			return result;
		}
	}
	
	MyTreeViewer treeViewer;
	TreeItemContentProvider contentProvider;
	private HtmlViewer htmlViewer;
	private ResultViewer resultViewer;
	
	Action showWebItemAction;
	Action updateItemAction;
	Action reloadAction;
	Action refreshAction;
	
	PlatformActions actions;	

	public PlatformViewer() {
		contentProvider = null;

		actions = new PlatformActions(new IPlatformUI() {
			
			@Override
			public void refresh() {
				treeViewer.refresh();
			}
			
			@Override
			public Vector<ItemView> getSelection() {
				Vector<ItemView> retVal = new Vector<ItemView>(); 
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator<?> iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof ItemView) {
						retVal.add((ItemView)o);
					}
				}
				return retVal;
			}
		});
	}
	
	synchronized TreeItemContentProvider getContentProvider() {
		return new PlatformTreeItemContentProvider(treeViewer);
	}
	
	@Override
	public void createPartControl(Composite parent) {
	    treeViewer = new MyTreeViewer(parent);
	    treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
	    contentProvider = getContentProvider();
	    treeViewer.setContentProvider(contentProvider);
	    treeViewer.setLabelProvider(new PlatformTreeItemLabelProvider(treeViewer));
	    treeViewer.setInput(Data.get());
	    
        createActions();
        createToolbar();
        createContextMenu();
		
		addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection sel = (IStructuredSelection)event.getSelection();
					Iterator<?> iter = sel.iterator();
					while (iter.hasNext()) {
						Object next = iter.next();
						if (next instanceof ItemView) {
							ItemView item  = (ItemView)next;
							
							//  Editor View  ---
							WorkunitView wuView = item.getWorkunitAncestor();
							if (wuView != null) {
								String workunitPath = wuView.getWorkunit().getApplicationValue("path");

								IEditorPart ep = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
								if (ep != null) {
									IFileEditorInput input = (IFileEditorInput) ep.getEditorInput(); 
									IFile file = input.getFile();
									String editorPath = file.getFullPath().toPortableString();
									if (editorPath.compareTo(workunitPath) == 0) {
										PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().activate(ep);
										((ECLWindow) ep).showItemView((ItemView)next);
									}
								}
							}

							//  ECL Watch View  ---
							boolean resultShown = showResult(item);
							showWebPage(item, !resultShown);
						}
					}
				}
			}
		});
		
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (event.getSelection() instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) event.getSelection();
					if (selection.size() >= 1) {
						if (selection.getFirstElement() instanceof ItemView) {
							ItemView item = (ItemView) selection.getFirstElement();
							WorkunitView wuView = item.getWorkunitAncestor();
							
							if (wuView != null) {
								IFile file = Eclipse.findFile(new Path(wuView.getWorkunit().getApplicationValue("path")));
								
								try {
									IEditorPart ep = IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file, true);
									((ECLWindow) ep).showItemView(item);											
								} catch (PartInitException e) {
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		});
	}
	
	public void addSelectionChangedListener(ISelectionChangedListener selectionChangedListener) {
		treeViewer.addSelectionChangedListener(selectionChangedListener);
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
		mgr.add(actions.abortItemAction);
		mgr.add(actions.resubmitItemAction);
		mgr.add(actions.restartItemAction);
		mgr.add(actions.publishItemAction);
		mgr.add(new Separator());
		mgr.add(actions.cloneItemAction);
		mgr.add(actions.deleteItemAction);
		mgr.add(new Separator());
		mgr.add(actions.refreshItemAction);
		actions.setState();
	}
}
