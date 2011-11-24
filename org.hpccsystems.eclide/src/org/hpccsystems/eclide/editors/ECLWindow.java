package org.hpccsystems.eclide.editors;

import java.io.StringWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;

public class ECLWindow extends MultiPageEditorPart implements IResourceChangeListener, Observer {

	private ECLEditor editor;

	public ECLWindow() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	void createEditorPage() {
		try {
			editor = new ECLEditor();
			int index = addPage(editor, getEditorInput());
			this.setTitle(editor.getTitle());
			setPageText(index, "ECL");
		} catch (PartInitException e) {
			ErrorDialog.openError(
					getSite().getShell(),
					"Error creating nested text editor",
					null,
					e.getStatus());
		}
	}
	
	void createWorkunitPage(Workunit wu, boolean addToEnd) {
    	boolean found = false;
    	for (int i = 1; i < getPageCount(); ++i) {
    		if (getPageText(i).compareTo(wu.getWuid()) == 0) {
    			found = true;
    			break;
    		}			    		
    	}
    	
    	if (!found) {
    		Composite composite = new Composite(getContainer(), SWT.NONE);
    		GridLayout layout = new GridLayout();
    		composite.setLayout(layout);
    		layout.numColumns = 2;
    		
    		if (addToEnd) {
    			int index = addPage(composite);
        		setPageText(index, wu.getWuid());
    		}
    		else {
    			addPage(1, composite);
    			setPageText(1, wu.getWuid());
    		}
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
		if (newPageIndex == 2) {
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
		for (Platform p : data.getPlatforms()) {
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
					    	createWorkunitPage(w, addToEnd);
						}
			    	});
			    }
			}
		}
	}
}
