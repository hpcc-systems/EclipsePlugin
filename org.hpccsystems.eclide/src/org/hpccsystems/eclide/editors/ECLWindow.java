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

import java.util.ArrayList;
import java.util.Collection;
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
import org.hpccsystems.eclide.ui.viewer.platform.TreeItemOwner;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitFolderItemView;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitTabItem;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitItemView;
import org.hpccsystems.internal.data.CollectionDelta;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.DataSingleton;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.LazyChildLoader;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.WorkunitComparator;

public class ECLWindow extends MultiPageEditorPart implements IResourceChangeListener, Observer, TreeItemOwner {

	private ECLEditor editor;

	Data data; 
	LazyChildLoader<ItemView> topItems;
	LazyChildLoader<WorkunitTabItem> children;
	
	public ECLWindow() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		topItems = new LazyChildLoader<ItemView>();
		children = new LazyChildLoader<WorkunitTabItem>();
	}

	WorkunitTabItem createItem(Control control, WorkunitItemView wuti) {
		int index = getPageCount();
		return createItem(index, control, wuti);
	}

	WorkunitTabItem createItem(int index, Control control, WorkunitItemView wuti) {
		CTabFolder folder = (CTabFolder)getContainer();
		WorkunitTabItem item = new WorkunitTabItem(folder, SWT.NONE, index, wuti);
		return item;
	}
	
	void createEditorPage() {
		try {
			editor = new ECLEditor();
			int index = addPage(editor, getEditorInput());
			this.setTitle(editor.getTitle());
			setPageText(index, "ECL");
			setPageImage(index, Activator.getImage("icons/doc.png"));
		} catch (PartInitException e) {
			ErrorDialog.openError(
					getSite().getShell(),
					"Error creating nested text editor",
					null,
					e.getStatus());
		}
	}
	
	WorkunitTabItem createWorkunitPage(WorkunitItemView wuti, boolean addToEnd) {
		//  TODO need to do better check than label...
    	boolean found = false;
    	for (int i = 1; i < getPageCount(); ++i) {
    		if (getPageText(i).compareTo(wuti.getText()) == 0) {
    			found = true;
    			break;
    		}			    		
    	}
    	
    	if (!found) {
    		return addToEnd ? createItem(getContainer(), wuti) : createItem(1, getContainer(), wuti);
    	}
    	return null;
	}

	void primeChildren() {
		for (final Platform platform : data.getPlatforms()) {
			platform.deleteObserver(this);
			
			WorkunitFolderItemView wuFolder = new WorkunitFolderItemView(this, null, platform);
			wuFolder.refreshChildren();
			topItems.add(wuFolder);
			for (Object o : wuFolder.getChildren()) {
				if (o instanceof WorkunitItemView) {
					WorkunitItemView wuti = (WorkunitItemView)o;
					Workunit w = wuti.getWorkunit();
					
					String path = w.getApplicationValue("path");
					
				    IFileEditorInput input = (IFileEditorInput) getEditorInput(); 
				    IFile file = input.getFile();
				    String path2 = file.getFullPath().toPortableString();
		
				    if (path.compareTo(path2) == 0) {
				    	children.add(createWorkunitPage(wuti, true));
				    }
				}
			}
			
			platform.addObserver(this);
		}
	}
	
	
	public void reloadChildren() {
		for (final Platform platform : data.getPlatforms()) {
			platform.getWorkunits();
		}
	}

	Collection<Workunit> getCurrentWorkunits() {
		Collection<Workunit> retVal = new ArrayList<Workunit>();
		for (Object item : children.get().clone()) {
			if (item instanceof WorkunitItemView) {
				WorkunitItemView ti = (WorkunitItemView)item;
				retVal.add(ti.getWorkunit());
			}
		}
		return retVal;
	}
	
	boolean mergeChanges(CollectionDelta monitor) {
		boolean changed = false;
		for (Object item : children.get().clone()) {
			if (item instanceof WorkunitTabItem) {
				WorkunitTabItem ti = (WorkunitTabItem)item;

				//  Remove deleted workunits  --- 
				if (monitor.removeContains(ti.getWorkunit())) {
					children.remove(ti);
					changed = true;
				}
			}
		}
		
		//  Add new workunits  ---
		for (DataSingleton ds : monitor.getAdded()) {
			if (ds instanceof Workunit) {
				Workunit w = (Workunit)ds;
				
				String path = w.getApplicationValue("path");
				
			    IFileEditorInput input = (IFileEditorInput) getEditorInput(); 
			    IFile file = input.getFile();
			    String path2 = file.getFullPath().toPortableString();
	
			    if (path.compareTo(path2) == 0) {
					children.add(createWorkunitPage(new WorkunitItemView(this, null, w), true));						
			    }
				changed = true;
			}
		}
		
		//if (changed)
			//children.sort(new WorkunitComparator());

		return changed;
	}
	
	

	void createWorkunitPages() {
		data = Data.get();
		primeChildren();
		//update(null, new Boolean(true));
	}

	protected void createPages() {
		createEditorPage();
//		createWorkunitPages();
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

	public boolean isSaveAsAllowed() {
		return true;
	}

	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		CTabItem childItem = ((CTabFolder)getContainer()).getItem(newPageIndex);
		if (childItem != null && childItem instanceof WorkunitTabItem) {
			WorkunitTabItem treeItemTabItem = (WorkunitTabItem)childItem;
		}
	}

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
		if (o instanceof Platform) {
			if (arg instanceof CollectionDelta) {
				CollectionDelta monitor = (CollectionDelta)arg;
				if (mergeChanges(monitor)) {
					refresh();
				}
			}
		}
	}

	@Override
	public void update(Object element, String[] properties) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}
}
