package org.hpccsystems.eclide.editors;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.ui.viewer.BrowserEx;
import org.hpccsystems.eclide.ui.viewer.TableEx;
import org.hpccsystems.eclide.ui.viewer.platform.TreeItemOwner;
import org.hpccsystems.eclide.ui.viewer.platform.FolderTreeItem;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitTreeItem;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.TreeItem;

public class ECLWindow extends MultiPageEditorPart implements IResourceChangeListener, Observer {

	private ECLEditor editor;
	
	class CTreeItemTabItem extends CTabItem implements TreeItemOwner{
		private CTabFolder container;
		
		BrowserEx browser;
		TableEx table;
		TreeItem item;
		boolean loaded;

		public CTreeItemTabItem(CTabFolder parent, int style, int index) {
			super(parent, style, index);
			
			parent.setLayout(new FillLayout());
			container = new CTabFolder(parent, SWT.BOTTOM | SWT.FLAT);
			container.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					int newPageIndex = container.indexOf((CTabItem) e.item);
					myPageChange(newPageIndex);
				}
			});
			setControl(container);
			
			browser = new BrowserEx(container);
			CTabItem browserItem = new CTabItem(container, SWT.NONE);
			browserItem.setControl(browser);
			browserItem.setText("ECL Watch");

			table = new TableEx(container, SWT.VIRTUAL | SWT.FULL_SELECTION);
			CTabItem tableItem = new CTabItem(container, SWT.NONE);
			tableItem.setControl(table.getControl());
			tableItem.setText("Result View");

			loaded = false;
		}
		
		protected void myPageChange(int newPageIndex) {
			if (newPageIndex == 0) {
				try {
					URL webPageURL = item.getWebPageURL();
					if (webPageURL != null)			
						browser.navigateTo(webPageURL.toString(), item.getUser(), item.getPassword());
				} catch (MalformedURLException e) {
				}
			}
			if (newPageIndex == 1) {
				table.setResult(item.getResult());
			}
			else {
				CTabItem childItem = container.getItem(newPageIndex);
				if (childItem != null && childItem instanceof CTreeItemTabItem) {
					CTreeItemTabItem treeItemTabItem = (CTreeItemTabItem)childItem;
					treeItemTabItem.loadChildren();					
				}
			}
		}

		public void setTreeItem(TreeItem item) {
			this.item = item;
			setText(this.item.getText());
			setImage(this.item.getImage());
			item.hasChildren();
		}

		void loadChildren() {
			if (loaded || item == null)
				return;

			Object[] objs = item.getChildren();
			if (objs == null)
				return;
			
			container.setRedraw(false);
			for (Object o : objs) {
				if (loaded == false) {
					loaded = true;
				}

	    		CTreeItemTabItem tabItem = createItem(container);
	    		tabItem.setTreeItem((TreeItem)o);
			}
			container.setRedraw(true);
		}

		void reloadChildren() {
			while(container.getItemCount() > 1) {
				if (container.getItems()[1] instanceof CTreeItemTabItem)
					((CTreeItemTabItem)container.getItems()[1]).browser.dispose();
				container.getItems()[1].dispose();
			}
			loadChildren();
		}
		
		CTreeItemTabItem createItem(Control control) {
			int index = container.getItemCount();
			return createItem(index, control);
		}

		CTreeItemTabItem createItem(int index, Control control) {
			CTreeItemTabItem item = new CTreeItemTabItem(container, SWT.NONE, index);
			//item.setControl(control);
			return item;
		}

		@Override
		public void update(Object element, String[] properties) {
			Display.getDefault().asyncExec(new Runnable() {   
				public void run() {
					setText(item.getText());
					setImage(item.getImage());
				}
			});
		}

		@Override
		public void refresh(Object element) {
			Display.getDefault().asyncExec(new Runnable() {   
				public void run() {
					loadChildren();
				}
			});
		}
	}

	public ECLWindow() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	CTreeItemTabItem createItem(Control control) {
		int index = getPageCount();
		return createItem(index, control);
	}

	CTreeItemTabItem createItem(int index, Control control) {
		CTabFolder folder = (CTabFolder)getContainer();
		CTreeItemTabItem item = new CTreeItemTabItem(folder, SWT.NONE, index);
		//item.setControl(control);
		return item;
	}
	
	void createEditorPage() {
		try {
			editor = new ECLEditor();
			int index = addPage(editor, getEditorInput());
			this.setTitle(editor.getTitle());
			setPageText(index, "ECL");
			setPageImage(index, Activator.getImage("icons/releng_gears.gif"));
		} catch (PartInitException e) {
			ErrorDialog.openError(
					getSite().getShell(),
					"Error creating nested text editor",
					null,
					e.getStatus());
		}
	}
	
	void createWorkunitPage(Platform p, Workunit wu, boolean addToEnd) {
		WorkunitTreeItem treeItem = new WorkunitTreeItem(null, null, p, wu);

		//  TODO need to do better check than label...
    	boolean found = false;
    	for (int i = 1; i < getPageCount(); ++i) {
    		if (getPageText(i).compareTo(treeItem.getText()) == 0) {
    			found = true;
    			break;
    		}			    		
    	}
    	
    	if (!found) {
    		Composite composite = new Composite(getContainer(), SWT.NONE);
    		GridLayout layout = new GridLayout();
    		composite.setLayout(layout);
    		layout.numColumns = 2;
    		
    		CTreeItemTabItem tabItem = addToEnd ? createItem(composite) : createItem(1, composite);
    		tabItem.setTreeItem(new WorkunitTreeItem(tabItem, null, p, wu));
    	}
	}

	void createWorkunitPages() {
		update(null, new Boolean(true));
	}

	protected void createPages() {
		createEditorPage();
		createWorkunitPages();
//		createPage1();
//		createPage2();
	}
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}
	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor);
	}
	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 0's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
			throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}
	/**
	 * Calculates the contents of page 2 when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		CTabItem childItem = ((CTabFolder)getContainer()).getItem(newPageIndex);
		if (childItem != null && childItem instanceof CTreeItemTabItem) {
			CTreeItemTabItem treeItemTabItem = (CTreeItemTabItem)childItem;
			treeItemTabItem.loadChildren();					
		}
	}
	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i<pages.length; i++){
						if(((FileEditorInput)editor.getEditorInput()).getFile().getProject().equals(event.getResource())){
							IEditorPart editorPart = pages[i].findEditor(editor.getEditorInput());
							pages[i].closeEditor(editorPart,true);
						}
					}
				}            
			});
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		final boolean addToEnd = (arg instanceof Boolean) ? (Boolean)arg : false;
		Data data = Data.get();
		for (final Platform p : data.getPlatforms()) {
			p.addObserver(this);
			for(final Workunit w : p.getWorkunits()) {
				String path = w.getApplicationValue("path");
	
			    IFileEditorInput input = (IFileEditorInput) getEditorInput(); 
			    IFile file = input.getFile();
			    String path2 = file.getFullPath().toPortableString();
	
			    if (path.compareTo(path2) == 0) {
			    	Display.getDefault().asyncExec(new Runnable() {

						@Override
						public void run() {
					    	createWorkunitPage(p, w, addToEnd);
						}
			    	});
			    }
			}
		}
	}
}
