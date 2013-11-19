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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree.ECLMetaNode;
import org.hpccsystems.eclide.ui.viewer.ECLContentOutlinePage;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitActions;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitActions.IPlatformUI;
import org.hpccsystems.eclide.ui.viewer.platform.TextItemView;
import org.hpccsystems.eclide.ui.viewer.platform.TreeItemOwner;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitTabItem;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitView;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitsViewer;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.data.CollectionDelta;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.DataSingleton;
import org.hpccsystems.internal.data.DataSingletonCollection;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.LazyChildLoader;
import org.hpccsystems.internal.ui.tree.WorkunitComparator;

public class ECLWindow extends MultiPageEditorPart implements IResourceChangeListener, Observer, TreeItemOwner {

	ECLContentOutlinePage eclOutlinePage;

	private IEditorPart editor;

	Data data;
	CTabFolder workunitFolder;
	LazyChildLoader<ItemView> children;
	boolean workunitsLoaded = false;	
	private ItemView delayedShowItemView;	

	public static enum ACTION {
		UNKNOWN,
		CLOSE,
		CLOSEOTHERS,
		CLOSEALL,
		LAST
	}

	WorkunitActions actions;
	ECLWindowActions thisActions;

	public ECLWindow() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		data = null;
		workunitFolder = null;
		children = new LazyChildLoader<ItemView>();

		actions = new WorkunitActions(new IPlatformUI() {

			@Override
			public void refresh() {
			}

			@Override
			public Vector<ItemView> getSelection() {
				Vector<ItemView> retVal = new Vector<ItemView>(); 
				CTabItem childItem = getTabItem(getActivePage());
				if (childItem != null && childItem instanceof WorkunitTabItem) {
					WorkunitTabItem treeItemTabItem = (WorkunitTabItem)childItem;
					retVal.add(treeItemTabItem.getWorkunitView());
				}
				return retVal;
			}
		});
		thisActions = new ECLWindowActions(this);
	}

	WorkunitTabItem createWorkunitTabItem(WorkunitView wuti) {
		int index = getPageCount();
		return createWorkunitTabItem(index, wuti);
	}

	WorkunitTabItem createWorkunitTabItem(int index, WorkunitView wuView) {
		return new WorkunitTabItem(workunitFolder, SWT.CLOSE, index, wuView);
	}

	void createEditorPage() {
		try {
			editor = new ECLEditor();
			int index = addPage(editor, getEditorInput());
			setPartName(editor.getTitle());
			setPageText(index, "ECL");
			setPageImage(index, Activator.getImage("icons/doc.png")); //$NON-NLS-1$
		} catch (PartInitException e) {
			ErrorDialog.openError(
					getSite().getShell(),
					Messages.ECLWindow_2,
					null,
					e.getStatus());
		}
	}
	
	WorkunitTabItem findWorkunitTabItem(Workunit workunit) {
		for (int i = 0; i < workunitFolder.getItemCount(); ++i) {
			CTabItem tabItem = workunitFolder.getItem(i);
			if (tabItem instanceof WorkunitTabItem) {
				WorkunitTabItem wuTabItem = (WorkunitTabItem)tabItem;
				if (wuTabItem.getWorkunit().equals(workunit)) {
					return wuTabItem;
				}
			}
		}
		return null;
	}
	

	WorkunitTabItem createWorkunitPage(WorkunitView wuti, boolean addToEnd) {
		WorkunitTabItem wuTabItem = findWorkunitTabItem(wuti.getWorkunit());
		if (wuTabItem != null) {
			return wuTabItem; 
		}
		return addToEnd ? createWorkunitTabItem(wuti) : createWorkunitTabItem(1, wuti);
	}

	WorkunitTabItem selectTab(WorkunitView wuti, boolean createIfMissing) {
		WorkunitTabItem retVal = findWorkunitTabItem(wuti.getWorkunit());
		if (retVal != null) {
			workunitFolder.setSelection(retVal);
			return retVal;
		}
		if (createIfMissing) {
			retVal = createWorkunitTabItem(1, wuti);
			workunitFolder.setSelection(retVal);
			return retVal;
		}
		return null;
	}

	public void showItemView(ItemView item, boolean createIfMissing) {
		if (!workunitsLoaded) {
			if (createIfMissing) {
				WorkunitView wuView = item.getWorkunitAncestor();
				WorkunitTabItem wuTabItem = findWorkunitTabItem(wuView.getWorkunit());
				if (wuTabItem == null) {
					createWorkunitTabItem(1, wuView);
				}
			} else {			
				delayedShowItemView = item;
				return;
			}
		}

		delayedShowItemView = null;
		if (item instanceof WorkunitView) {
			showEclWatch((WorkunitView)(item), item, createIfMissing); 
			return;
		}
		//  Descendant of WorkunitView?  ---
		WorkunitView wuView = item.getWorkunitAncestor();
		if (wuView != null) {
			showEclWatch(wuView, item, createIfMissing);
		}
	}

	void showEclWatch(WorkunitView wuView, ItemView item, boolean createIfMissing) {
		WorkunitTabItem tabItem = selectTab(wuView, createIfMissing);
		if (tabItem != null) {
			try {
				boolean hasNewEclWatch = wuView.getWorkunit().getPlatform().getVersion().major >= 4;
				tabItem.navigateTo(item.getWebPageURL(hasNewEclWatch).toString(), item.getUser(), item.getPassword());
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}

	void showTextItem(TextItemView textItemView) {
		WorkunitTabItem tabItem = selectTab(textItemView.getWorkunitAncestor(), false);
		if (tabItem != null) {
			tabItem.setQuery(textItemView.getQueryText());
		}
	}

	void createWorkunitPages() {
		data = Data.get();
		workunitFolder = (CTabFolder)getContainer(); 		
		children.start(new Runnable() {
			@Override
			public void run() {
				refreshChildren();
				refresh();
			}
		});

		workunitFolder.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.item instanceof WorkunitTabItem) {
					WorkunitsViewer workunitsViewer = Eclipse.findWorkunitsViewer();
					if (workunitsViewer != null) {
						workunitsViewer.select(((WorkunitTabItem)e.item).getWorkunit());
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	}

	@Override
	protected void createPages() {
		createEditorPage();
		createWorkunitPages();
		createContextMenu();
	}
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}
	/**
	 * Saves the multi-page editor's document.
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor);
	}
	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 0's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	@Override
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
	@Override
	public void init(IEditorSite site, IEditorInput editorInput)
			throws PartInitException {
		if (!(editorInput instanceof IEditorInput)) {
			throw new PartInitException(Messages.ECLWindow_3);
		}
		super.init(site, editorInput);
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	CTabItem getTabItem(int index){
		CTabItem childItem = ((CTabFolder)getContainer()).getItem(index);
		return childItem;
	}

	public ECLEditor getEditor(){
		if (editor instanceof ECLEditor) {
			return (ECLEditor)editor;
		}
		return null;
	}

	@Override
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
	}

	@Override
	public void resourceChanged(final IResourceChangeEvent event){
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				@Override
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
	public Object getAdapter(Class required) {
		if (IContentOutlinePage.class.equals(required)) {
			if (eclOutlinePage == null) {
				eclOutlinePage = new ECLContentOutlinePage();
				eclOutlinePage.setInput(getEditorInput());
				eclOutlinePage.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						ISelection selection = event.getSelection();
						if (selection != null && selection instanceof TreeSelection) {
							Object o = ((TreeSelection)selection).getFirstElement();
							if (o != null && o instanceof ECLMetaNode) {
								ECLMetaNode node = (ECLMetaNode)o;
								if (editor instanceof ECLEditor) {
									((ECLEditor)editor).setHighlightRange(node.getData().getOffset(), node.getData().getLength(), true);
								}
							}
						}
					}
				});

			}
			return eclOutlinePage;
		}
		return super.getAdapter(required);
	}

	public void refreshChildren() {
		Workunit.All.deleteObserver(this);

		CollectionDelta delta = new CollectionDelta("primeChildren", getCurrentWorkunits()); //$NON-NLS-1$
		//  Workaround for:  HPCC-10299  ---
		//  delta.calcChanges(data.getWorkunits(null, true, "", "", "", "path", getFilePath()));
		delta.calcChanges(data.getWorkunits(null, true, "", "", "", getFileName())); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		//  Workaround for:  HPCC-10299  ---
		mergeChanges(delta, false);

		Workunit.All.addObserver(this);
	}

	public void reloadChildren() {
		children.clear();
		refreshChildren();
		refresh();
	}

	Collection<Workunit> getCurrentWorkunits() {
		Collection<Workunit> retVal = new ArrayList<Workunit>();
		for (Object item : children.get().clone()) {
			if (item instanceof WorkunitView) {
				WorkunitView ti = (WorkunitView)item;
				retVal.add(ti.getWorkunit());
			}
		}
		return retVal;
	}
	
	IFile getFile() {
		IEditorInput input = getEditorInput(); 
		if (input instanceof IFileEditorInput) {
			IFileEditorInput fileInput = (IFileEditorInput) getEditorInput(); 
			return fileInput.getFile();
		}
		return null;
	}

	String getFileName() {
		IFile file = getFile();
		if (file != null) {
			String ext = file.getFileExtension();
			String name = file.getName();
			return name.substring(0, name.length() - ext.length() - 1);
		}
		return ""; //$NON-NLS-1$
	}

	String getFilePath() {
		IFile file = getFile();
		if (file != null) {
			return file.getFullPath().toPortableString();
		}
		return ""; //$NON-NLS-1$
	}

	boolean mergeChanges(CollectionDelta delta, boolean checkFilePath) {
		boolean changed = false;
		for (Object item : children.get().clone()) {
			if (item instanceof WorkunitView) {
				WorkunitView ti = (WorkunitView)item;

				//  Remove deleted workunits  --- 
				if (delta.removeContains(ti.getWorkunit())) {
					ti.getWorkunit().refreshState();
					changed = true;
				}
			}
		}

		//  Add new workunits  ---
		if (checkFilePath) {
			String filePath = getFilePath();
			if (!filePath.isEmpty()) {
				for (DataSingleton ds : delta.getAdded()) {
					if (ds instanceof Workunit) {
						Workunit wu = (Workunit)ds;
						if (wu.getOwner().equals(wu.getPlatform().getUser())) {
							if (filePath.compareTo(wu.getApplicationValue("path")) == 0) { //$NON-NLS-1$
								children.add(new WorkunitView(this, null, wu));
								changed = true;
							}
						}
					}
				}
			}
		} else {
			for (DataSingleton ds : delta.getAdded()) {
				if (ds instanceof Workunit) {
					Workunit wu = (Workunit)ds;
					children.add(new WorkunitView(this, null, wu));
					changed = true;
				}
			}
		}

		if (changed) {
			children.sort(new WorkunitComparator());
		}

		return changed;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof DataSingletonCollection) {
			if (arg instanceof CollectionDelta) {
				if (mergeChanges((CollectionDelta)arg, true)) {
					refresh();
				}
			}
		}
	}

	@Override
	public void update(Object element, String[] properties) {
	}

	@Override
	public void refresh(Object element) {
	}

	@Override
	public void refresh() {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				int pos = 1;
				for (Object item : children.get().clone()) {
					if (item instanceof WorkunitView) {
						WorkunitView wuView = (WorkunitView)item;
						WorkunitTabItem wuTabItem = findWorkunitTabItem(wuView.getWorkunit());
						if (wuTabItem == null) {
							createWorkunitTabItem(1, wuView);
						}
						++pos;
					}
				}
				workunitsLoaded = true;
				if (delayedShowItemView != null) {
					showItemView(delayedShowItemView, false);
				}

			}
		});
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
		Menu menu = menuMgr.createContextMenu(getContainer());
		getContainer().setMenu(menu);

		// Register menu for extension.
		//getSite().registerContextMenu(menuMgr, getContainer());
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
		mgr.add(thisActions.close);
		mgr.add(thisActions.closeOthers);
		mgr.add(thisActions.closeAll);
		actions.setState();
		thisActions.setState();
	}

	public void gotoLine(int lineNumber) {
		if (editor instanceof ECLEditor) {
			IDocument document = ((ECLEditor)editor).getDocumentProvider().getDocument(editor.getEditorInput());
			if (document != null) {
				IRegion lineInfo = null;
				try {
					lineInfo = document.getLineInformation(lineNumber - 1);
				} catch (BadLocationException e) {
				}
				if (lineInfo != null) {
					((ECLEditor)editor).selectAndReveal(lineInfo.getOffset(), 0);
				}
			}
		}
	}

	public boolean canPerform(ACTION action) {
		CTabItem tabItem = workunitFolder.getSelection();
		switch(action) {
		case CLOSE:
			if (tabItem instanceof WorkunitTabItem) {
				return true;
			}
			break;
		case CLOSEOTHERS:
			if (tabItem instanceof WorkunitTabItem) {
				return workunitFolder.getItemCount() > 2;
			}
			return workunitFolder.getItemCount() > 1;
		case CLOSEALL:
			return workunitFolder.getItemCount() > 1;
		}
		return false;
	}

	public void perform(ACTION action) {
		switch(action) {
		case CLOSE:
			CTabItem tabItem = workunitFolder.getSelection();
			if (tabItem instanceof WorkunitTabItem) {
				tabItem.dispose();
			}
			break;
		case CLOSEOTHERS:
			CTabItem selectedItem = workunitFolder.getSelection();
			for (int i = workunitFolder.getItemCount(); i > 0 ; --i) {
				CTabItem tabItem2 = workunitFolder.getItem(i - 1);
				if (tabItem2 instanceof WorkunitTabItem && !tabItem2.equals(selectedItem)) {
					tabItem2.dispose();
				}
			}
			break;
		case CLOSEALL:
			workunitFolder.setSelection(0);
			for (int i = workunitFolder.getItemCount(); i > 0 ; --i) {
				CTabItem tabItem2 = workunitFolder.getItem(i - 1);
				if (tabItem2 instanceof WorkunitTabItem) {
					tabItem2.dispose();
				}
			}
			break;
		}
	}
}
