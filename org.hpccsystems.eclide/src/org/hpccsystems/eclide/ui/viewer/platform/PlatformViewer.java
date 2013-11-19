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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Item;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ViewPart;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.Workbench;
import org.hpccsystems.eclide.editors.ECLWindow;
import org.hpccsystems.eclide.perspectives.ECLPerspective;
import org.hpccsystems.eclide.perspectives.ECLWatch;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitActions.IPlatformUI;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

public class PlatformViewer extends ViewPart {

	static final String WUTempFolder = Messages.PlatformViewer_0;
	
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

	Action showWebItemAction;
	Action updateItemAction;
	Action refreshListAction;
	Action refreshEachItemAction;
	Action testAction;

	WorkunitActions actions;	

	public PlatformViewer() {
		contentProvider = null;

		actions = new WorkunitActions(new IPlatformUI() {

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
	
	class WorkunitStorage implements IStorage {
		private Workunit workunit;
		private IFile file;
		
		WorkunitStorage(Workunit workunit) {
			this.workunit = workunit;
			if (this.workunit.hasApplicationValue("path")) { //$NON-NLS-1$
				String filePath = workunit.getApplicationValue("path"); //$NON-NLS-1$
				file = Eclipse.findFile(new Path(filePath));
			}
		}
		
		public Workunit getWorkunit() {
			return workunit;
		}

		public IFile getFile() {
			return file;
		}

		@Override 
		public InputStream getContents() throws CoreException {
			return new ByteArrayInputStream(workunit.getQueryText().getBytes());
		}

		@Override 
		public IPath getFullPath() {
			return null;
		}

		@Override 
		public Object getAdapter(Class adapter) {
			return null;
		}

		@Override 
		public String getName() {
			return workunit.getWuid();
		}

		@Override 
		public boolean isReadOnly() {
			return true;
		}
		
		@Override
		public boolean equals(Object aThat) {
			if ( this == aThat ) {
				return true;
			}

			if ( !(aThat instanceof WorkunitStorage) ) {
				return false;
			}
			WorkunitStorage that = (WorkunitStorage)aThat;
			
			return workunit.equals(that.workunit);
		}
	}
	
	class WorkunitInput implements IStorageEditorInput {
		private WorkunitStorage storage;

		WorkunitInput(Workunit workunit) {
			this.storage = new WorkunitStorage(workunit);
		}
		
		public boolean origonalFileExists() {
			IFile origFile = storage.getFile(); 
			if (origFile != null) {
				return origFile.exists();
			}
			return false;
		}

		public IFile getOrigonalFile() {
			return storage.getFile();
		}

		public String getOrigonalFilePath() {
			IFile origonalFile = storage.getFile();
			if (origonalFile != null) {
				return origonalFile.getFullPath().toPortableString();
			}
			return ""; //$NON-NLS-1$
		}

		@Override 
		public boolean exists() {
			return true;
		}

		@Override 
		public ImageDescriptor getImageDescriptor() {
			return null;
		}

		@Override 
		public String getName() {
			return storage.getName();
		}

		@Override 
		public IPersistableElement getPersistable() {
			return null;
		}

		@Override 
		public IStorage getStorage() {
			return storage;
		}

		@Override 
		public String getToolTipText() {
			String tooltip = storage.getWorkunit().getJobname();
			if (!tooltip.isEmpty()) {
				tooltip += " - "; //$NON-NLS-1$
			}
			tooltip += storage.getWorkunit().getWuid();
			return tooltip;
		}

		@Override 
		public Object getAdapter(Class adapter) {
			return null;
		}

		@Override
		public boolean equals(Object aThat) {
			if ( this == aThat ) {
				return true;
			}

			if ( !(aThat instanceof WorkunitInput) ) {
				return false;
			}
			WorkunitInput that = (WorkunitInput)aThat;
			
			return storage.equals(that.storage);
		}
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

							if (Workbench.getActivePerspective().getId().equals(ECLPerspective.PERSPECTIVE_ID)) {
								WorkunitView wuView = item.getWorkunitAncestor();
								if (wuView != null) {
									//WorkunitEditorInput workunitEditorInput = getWorkunitEditorInput(wuView);
									WorkunitInput workunitInput = new WorkunitInput(wuView.getWorkunit());
									IEditorPart ep = Workbench.getActiveEditor();
									if (ep != null) {
										IEditorInput input = ep.getEditorInput();
										if (input.equals(workunitInput)) {
											Workbench.getActivePage().activate(ep);
											((ECLWindow) ep).showItemView((ItemView)next, false);
										} else if (input instanceof IFileEditorInput) {
											IFileEditorInput fileInput = (IFileEditorInput)input; 
											IFile file = fileInput.getFile();
											String editorPath = file.getFullPath().toPortableString();
											String workunitPath = workunitInput.getOrigonalFilePath();
											if (editorPath.compareTo(workunitPath) == 0) {
												Workbench.getActivePage().activate(ep);
												((ECLWindow) ep).showItemView((ItemView)next, false);
											}
										}
									}
								}
							} else if(Workbench.getActivePerspective().getId().equals(ECLWatch.PERSPECTIVE_ID)) {
								showWebPage(item, true);
							}
							break;
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

							if (Workbench.getActivePerspective().getId().equals(ECLPerspective.PERSPECTIVE_ID)) {
								WorkunitView wuView = item.getWorkunitAncestor();
								if (wuView != null) {
									WorkunitInput workunitInput = new WorkunitInput(wuView.getWorkunit());
									try {
										IEditorPart ep = null;
										if (workunitInput.origonalFileExists()) {
											ep = IDE.openEditor(Workbench.getActivePage(), workunitInput.getOrigonalFile(), true);
										} else {
											ep = IDE.openEditor(Workbench.getActivePage(), workunitInput, "org.hpccsystems.eclide.editors.ECLWindow"); //$NON-NLS-1$
										}
										if (ep instanceof ECLWindow) {
											((ECLWindow) ep).showItemView(item, true);
										}
									} catch (PartInitException e) {
										e.printStackTrace();
									}
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
		if (htmlViewer == null) {
			htmlViewer = Eclipse.findHtmlViewer();
		}

		try {
			boolean hasNewEclWatch = false;
			PlatformView platformView = ti.getPlatformAncestor();
			if (platformView != null) {
				hasNewEclWatch = platformView.getPlatform().getVersion().major >= 4;
			}
			URL webPageURL = ti.getWebPageURL(hasNewEclWatch);
			if (htmlViewer != null && webPageURL != null) {
				htmlViewer.showURL(ti, webPageURL.toString(), ti.getUser(), ti.getPassword(), bringToTop);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public void createActions() {
		showWebItemAction = new Action(Messages.PlatformViewer_6) {
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

		updateItemAction = new Action(Messages.PlatformViewer_7) {
			@Override
			public void run() { 
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator<?> iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof ItemView) {
						((ItemView)o).update(null);
					}
				}
			}
		};

	    refreshListAction = new Action(Messages.PlatformViewer_8, Activator.getImageDescriptor("icons/refresh.png")) { //$NON-NLS-2$
			@Override
			public void run() {
				contentProvider.reloadChildren();
			}
		};
		
		refreshEachItemAction = new Action(Messages.PlatformViewer_10) {
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

		mgr.add(refreshListAction);
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
