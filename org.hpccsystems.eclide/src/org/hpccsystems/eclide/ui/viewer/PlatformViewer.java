package org.hpccsystems.eclide.ui.viewer;

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
import org.hpccsystems.internal.data.Cluster;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.FileSprayWorkunit;
import org.hpccsystems.internal.data.LogicalFile;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;

public class PlatformViewer extends ViewPart {

	TreeViewer viewer;
	Action refreshItemAction;
	Action reloadAction;
	
	class Folder {
		String GetLabel() {
			return "TODO";
		}
		
		void refresh() {
		}
		
		boolean hasChildren() {
			 // Get the children
		    Object[] obj = getChildren();

		    // Return whether the parent has children
		    return obj == null ? false : obj.length > 0;
		}
		
		Object[] getChildren() {
			return null;
		}
	}
	
	class PlatformFolder extends Folder {
		Platform platform;
		
		PlatformFolder(Platform platform) {
			this.platform = platform;
		}

		String GetLabel() {
			return platform.GetIP();
		}
		
		boolean hasChildren() {
			return true;
		}

		public Object[] getChildren() {
			Vector<Folder> retVal = new Vector<Folder>();
			retVal.add(new ClusterFolder(platform));
			retVal.add(new WorkunitFolder(platform));
			retVal.add(new LogicalFileFolder(platform));
			return retVal.toArray();
		}
	}

	class ClusterFolder extends Folder {
		Platform platform;
		
		ClusterFolder(Platform platform) {
			this.platform = platform;
		}
		
		String GetLabel() {
			return "Clusters";
		}

		public Object[] getChildren() {
			ArrayList<Object> retVal = new ArrayList<Object>();
			for(Cluster c : platform.GetClusters())
				retVal.add(new ClusterItemFolder(platform, c));
			return retVal.toArray();
		}
	}

	class ClusterItemFolder extends Folder {
		Platform platform;
		Cluster cluster;
		
		ClusterItemFolder(Platform platform, Cluster cluster) {
			this.platform = platform;
			this.cluster = cluster; 
		}
		
		String GetLabel() {
			return cluster.info.getName();
		}

		public Object[] getChildren() {
			Vector<Folder> retVal = new Vector<Folder>();
			retVal.add(new WorkunitFolder(platform, cluster.info.getName()));
			return retVal.toArray();
		}
	}

	class WorkunitFolder extends Folder {
		Platform platform;
		String cluster;
		
		class WorkunitComparator implements Comparator<Object> {

			@Override
			public int compare(Object left, Object right) {
				String l = "";
				String r = "";
				if (left instanceof Workunit)
					l = ((Workunit)left).info.getWuid();
				else if(left instanceof FileSprayWorkunit)
					l = ((FileSprayWorkunit)left).info.getID();
				if (right instanceof Workunit)
					r = ((Workunit)right).info.getWuid();
				else if(right instanceof FileSprayWorkunit)
					r = ((FileSprayWorkunit)right).info.getID();
				
				l = l.substring(1);
				r = r.substring(1);
				return r.compareTo(l);
			}
		}
		
		WorkunitFolder(Platform platform) {
			this.platform = platform;
			this.cluster = "";
		}
		
		WorkunitFolder(Platform platform, String cluster) {
			this.platform = platform;
			this.cluster = cluster;
		}
		
		String GetLabel() {
			return "Workunits";
		}

		public Object[] getChildren() {
			ArrayList<Object> retVal = new ArrayList<Object>();
			retVal.addAll(platform.GetWorkunits(cluster));
			if (cluster.isEmpty())
				retVal.addAll(platform.GetFileSprayWorkunits());
			Collections.sort(retVal, new WorkunitComparator());
			return retVal.toArray();
		}
	}

	class LogicalFileFolder extends Folder {
		Platform platform;

		LogicalFileFolder(Platform platform) {
			this.platform = platform;
		}

		String GetLabel() {
			return "Files";
		}

		public Object[] getChildren() {
			return platform.GetLogicalFiles().toArray();
		}
	}

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
			Vector<Folder> retVal = new Vector<Folder>();
			if (inputElement == data) {
				for (Platform p : data.GetPlatforms()) {
					retVal.add(new PlatformFolder(p));
				}
			}
			return retVal.toArray();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof Folder) {
				return ((Folder)parentElement).getChildren();
			}
			return null;
		}

		@Override
		public Object getParent(Object element) {
			if (element == data) {
				return null;
			}
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			 // Get the children
		    Object[] obj = getChildren(element);

		    // Return whether the parent has children
		    return obj == null ? false : obj.length > 0;
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
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getText(Object element) {
			if (element instanceof Folder) {
				return ((Folder)element).GetLabel();
			} else if (element instanceof Platform) {
				return ((Platform)element).GetIP();
			} else if (element instanceof Cluster) {
				return ((Cluster)element).info.getName();
			} else if (element instanceof Workunit) {
				return ((Workunit)element).info.getWuid();
			} else if (element instanceof FileSprayWorkunit) {
				return ((FileSprayWorkunit)element).info.getID();
			} else if (element instanceof LogicalFile) {
				return ((LogicalFile)element).info.getName();
			}
			// TODO Auto-generated method stub
			return null;
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
				//updateActionEnablement();
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
		mgr.add(refreshItemAction);
		mgr.add(reloadAction);
	}	
}
