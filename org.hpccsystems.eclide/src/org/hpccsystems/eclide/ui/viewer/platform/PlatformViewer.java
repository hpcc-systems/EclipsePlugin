package org.hpccsystems.eclide.ui.viewer.platform;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.tree.DefaultTreeModel;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.part.ViewPart;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.data.Cluster;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.FileSprayWorkunit;
import org.hpccsystems.internal.data.LogicalFile;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;

public class PlatformViewer extends ViewPart {

	TreeViewer viewer;
	Action showWebItemAction;
	Action refreshItemAction;
	Action reloadAction;
	
	class FileTreeContentProvider implements ITreeContentProvider {
		Data data;
		
		FileTreeContentProvider(Data data) {
			this.data = data;
		}
		
		@Override
		public void dispose() {
			// TODO Auto-generated method stub
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			Vector<TreeItem> retVal = new Vector<TreeItem>();
			if (inputElement == data) {
				for (Platform p : data.GetPlatforms()) {
					retVal.add(new PlatformTreeItem(null, p));
				}
			}
			return retVal.toArray();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof TreeItem) {
				return ((TreeItem)parentElement).getChildren();
			}
			return null;
		}

		@Override
		public Object getParent(Object element) {
			if (element instanceof TreeItem) {
				return ((TreeItem)element).getParent();
			}
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			if (element instanceof TreeItem) {
				return ((TreeItem)element).hasChildren();
			}
		    return false;
		}
	}
	
	class FileTreeLabelProvider implements ILabelProvider {

		@Override
		public void addListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void dispose() {
			// TODO Auto-generated method stub
		}

		@Override
		public boolean isLabelProperty(Object element, String property) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void removeListener(ILabelProviderListener listener) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Image getImage(Object element) {
			if (element instanceof TreeItem) {
				return ((TreeItem)element).getImage();
			}
			return null;
		}

		@Override
		public String getText(Object element) {
			if (element instanceof TreeItem) {
				return ((TreeItem)element).getText();
			}
			// TODO Auto-generated method stub
			return "TODO";
		}
	}	
	
	public PlatformViewer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// Create the tree viewer to display the file tree
	    viewer = new TreeViewer(parent);
	    viewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
	    viewer.setContentProvider(new FileTreeContentProvider(Data.getDefault()));
	    viewer.setLabelProvider(new FileTreeLabelProvider());
	    viewer.setInput(Data.getDefault()); // pass a non-null that will be ignored
	    
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
		viewer.getControl().setFocus();
	}

	public void createActions() {
		showWebItemAction = new Action("Show ECL Watch") {
			public void run() { 
				IStructuredSelection sel = (IStructuredSelection)viewer.getSelection();
				Iterator iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof TreeItem) {
						((TreeItem)o).showWebPage();
					}
					//viewer.refresh(iter.next());
					break;
				}
			}
		};
		
		refreshItemAction = new Action("Refresh") {
			public void run() { 
				IStructuredSelection sel = (IStructuredSelection)viewer.getSelection();
				Iterator iter = sel.iterator();
				while (iter.hasNext()) {
					viewer.refresh(iter.next());
				}
			}
		};

		reloadAction = new Action("Reload") {
			public void run() { 
				viewer.refresh();
			}
		};

		// Add selection listener.
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection)viewer.getSelection();
				Iterator iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof TreeItem) {
						((TreeItem)o).showWebPage();
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
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		
		// Register menu for extension.
		getSite().registerContextMenu(menuMgr, viewer);
	}	
	
	private void fillContextMenu(IMenuManager mgr) {
		mgr.add(showWebItemAction);
		mgr.add(refreshItemAction);
		mgr.add(reloadAction);
	}	
}
