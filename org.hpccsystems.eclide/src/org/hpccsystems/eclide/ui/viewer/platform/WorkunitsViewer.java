package org.hpccsystems.eclide.ui.viewer.platform;

import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.part.ViewPart;
import org.hpccsystems.eclide.ui.viewer.platform.PlatformViewer.FileTreeContentProvider;
import org.hpccsystems.eclide.ui.viewer.platform.PlatformViewer.FileTreeLabelProvider;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;

public class WorkunitsViewer extends ViewPart {

	TreeViewer treeViewer;
	Action showWebItemAction;
	Action refreshItemAction;
	Action updateItemAction;
	Action reloadAction;
	
	class FileTreeContentProvider implements ITreeContentProvider, Observer{
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
					p.addObserver(this);
					for(Workunit w : p.GetWorkunits()) {
						retVal.add(new WorkunitTreeItem(treeViewer, null, p, w));
					}
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

		@Override
		public void update(Observable o, Object arg) {
			Display.getDefault().asyncExec(new Runnable() {   
				public void run() {
					treeViewer.refresh();
				}
			});
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
			return true;
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
	
	public WorkunitsViewer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// Create the tree viewer to display the file tree
	    treeViewer = new TreeViewer(parent);
	    treeViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
	    treeViewer.setContentProvider(new FileTreeContentProvider(Data.getDefault()));
	    treeViewer.setLabelProvider(new FileTreeLabelProvider());
	    treeViewer.setInput(Data.getDefault()); // pass a non-null that will be ignored
	    
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
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator iter = sel.iterator();
				while (iter.hasNext()) {
					treeViewer.refresh(iter.next());
				}
			}
		};

		updateItemAction = new Action("Update") {
			public void run() { 
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator iter = sel.iterator();
				while (iter.hasNext()) {
					treeViewer.update(iter.next(), null);
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
