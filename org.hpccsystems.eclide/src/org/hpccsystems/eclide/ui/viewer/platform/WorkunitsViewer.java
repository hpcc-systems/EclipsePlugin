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

package org.hpccsystems.eclide.ui.viewer.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
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
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.LazyChildLoader;
import org.hpccsystems.internal.ui.tree.TreeItem;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

public class WorkunitsViewer extends ViewPart {

	TreeViewer treeViewer;
	Action showWebItemAction;
	Action refreshItemAction;
	Action updateItemAction;
	Action reloadAction;
	
	class WorkunitsTreeItemContentProvider extends TreeItemContentProvider {
		Data data;
		LazyChildLoader children;
		
		WorkunitsTreeItemContentProvider(TreeViewer treeViewer, Data data) {
			super(treeViewer);
			this.data = data;
			this.children = new LazyChildLoader();
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public Object[] getElements(Object inputElement) {
			switch (children.getState()) {
			case UNKNOWN:
				final WorkunitsTreeItemContentProvider self = this;
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
			ArrayList<TreeItem> retVal = new ArrayList<TreeItem>();
			for (Platform p : data.getPlatforms()) {
				p.addObserver(this);
				for(Workunit w : p.getWorkunits()) {
					retVal.add(new WorkunitTreeItem(treeViewer, null, p, w));
				}
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


	
	public WorkunitsViewer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// Create the tree viewer to display the file tree
	    treeViewer = new TreeViewer(parent);
	    treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
	    treeViewer.setContentProvider(new WorkunitsTreeItemContentProvider(treeViewer, Data.get()));
	    treeViewer.setLabelProvider(new PlatformTreeItemLabelProvider(treeViewer));
	    treeViewer.setInput(Data.get().getPlatforms()); // pass a non-null that will be ignored
	    
	 // Create menu and toolbars.
        createActions();
        //createMenu();
        createToolbar();
        createContextMenu();
        //hookGlobalActions();
         
        // Restore state from the previous session.
        //restoreState();
  	}

	@Override
	public void setFocus() {
		treeViewer.getControl().setFocus();
	}

	public void createActions() {
		showWebItemAction = new Action("Show ECL Watch") {
			public void run() { 
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator<?> iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof TreeItem) {
						((TreeItem)o).showWebPage(true);
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
						boolean resultShown = ((TreeItem)o).showResult();
						((TreeItem)o).showWebPage(!resultShown);
					}
					break;
				}
			}
		});
   }
	
	/**
	 * Create toolbar.
	 */
	private void createToolbar() {
		IToolBarManager mgr = getViewSite().getActionBars().getToolBarManager();
		mgr.add(reloadAction);
	}

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
}
