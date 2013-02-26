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

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.help.IContextProvider;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.builder.meta.ECLGlobalMeta;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree.ECLMetaNode;

public class ECLEditor extends TextEditor {
	
    public static final String EDITOR_ID = "org.hpccsystems.eclide.editors.ECLEditor";

    /** The ID of the editor context menu */
    public static final String EDITOR_CONTEXT = EDITOR_ID + ".context";
    
    /** The ID of the editor ruler context menu */
    public static final String RULER_CONTEXT = EDITOR_CONTEXT + ".ruler";
	
	private ECLColorManager colorManager;
	private boolean readOnly;

	public ECLEditor() {
		super();
		readOnly = false;
		colorManager = new ECLColorManager();
		setSourceViewerConfiguration(new ECLConfiguration(colorManager));
		setDocumentProvider(new ECLDocumentProvider());
		setKeyBindingScopes( new String[] { "org.hpccsystems.eclide.eclideScope" } );
	}
	
	public void setReadonly() {
		readOnly = true;
		setPartName(getPartName() + " (Read-Only)");
	}

	@Override
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		super.init(site, input);
		if (input instanceof IStorageEditorInput) {
			try {
				IStorage storage = ((IStorageEditorInput)input).getStorage();
				if (storage.isReadOnly()) {
					setReadonly();
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
			
		} else if (input instanceof IFileEditorInput) {
			IFile file = ((IFileEditorInput)input).getFile();
			IPath fileLocation = file.getLocation();
			if (fileLocation != null){
				File actualFile = fileLocation.toFile();
				if (actualFile == null || !actualFile.canWrite()) {
					setReadonly();
				}
			}
		}
	}
	
	@Override
	public boolean isEditable() {
		if (readOnly)
			return false;
			
		return super.isEditable();
	}

	@Override
	public boolean isEditorInputModifiable() {
		if (readOnly)
			return false;
			
		return super.isEditorInputModifiable();
	}

	@Override
	public boolean isEditorInputReadOnly() {
		if (readOnly)
			return true;
			
		return super.isEditorInputReadOnly();
	}

	@Override
	public boolean isDirty() {
		if (readOnly)
			return false;
			
		return super.isDirty();
	}	
	
	@Override
	protected void initializeEditor() {
		super.initializeEditor();
		setEditorContextMenuId(EDITOR_CONTEXT);
		setRulerContextMenuId(RULER_CONTEXT);
		setHelpContextId(Activator.PLUGIN_ID + ".context_dynamichelpview");
	}

	@Override
	public Object getAdapter(Class required) {
		if (IContextProvider.class.equals(required)) {
			return new ECLContextProvider(Activator.PLUGIN_ID + ".context_dynamichelpview", getHoverWord());
		}
		return super.getAdapter(required);
	}
	
	void setCaretPosition(int offset) {
		ISourceViewer sourceViewer = getSourceViewer();
		StyledText textWidget= sourceViewer.getTextWidget();
		textWidget.setCaretOffset(offset);
	}

	int getCaretPosition() {
		ISourceViewer sourceViewer = getSourceViewer();
		StyledText textWidget= sourceViewer.getTextWidget();
		return textWidget.getCaretOffset();
	}

	@Override
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

	public IDocument getDocument() {
		ISourceViewer sourceViewer = getSourceViewer();
		return sourceViewer.getDocument();
	}

	public static int getFirstCharOffset(IDocument doc, int offset, boolean includePeriod) {
		try {
			for (int n = offset-1; n >= 0; n--) {
				char c = doc.getChar(n);
				if (!(Character.isJavaIdentifierPart(c) || (c == '.' && includePeriod) || c == '#')) {
					return n + 1;
				}
			}
			return 0;
		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return offset;
	}

	public static int getLastCharOffset(IDocument doc, int offset) {
		try {
			for (int n = offset; n < doc.getLength(); ++n) {
				char c = doc.getChar(n);
				if (!Character.isJavaIdentifierPart(c) && c != '.') {
					return n;
				}
			}
			return doc.getLength() - 1;
		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return offset;
	}

	public static String getHoverWord(IDocument doc, int offset) {
		int firstOffset = getFirstCharOffset(doc, offset, true);
		int lastOffset = getLastCharOffset(doc, offset);
		try {
			return doc.get(firstOffset,  lastOffset - firstOffset);

		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return "";
	}

	public String getHoverWord() {
		return getHoverWord(getDocument(), getCaretPosition());
	}
	
	public ECLMetaNode getDefinition() {
		IDocument doc = getDocument();
		ECLMetaNode source;
		if (doc instanceof ECLDocument) {
			IFile file = ((ECLDocument)doc).getFile();
			ECLMetaTree meta = ECLGlobalMeta.get();
			source = meta.getSource(file);
			if (source != null) {
				ECLMetaNode context = source.getContext(getCaretPosition());
				return context.findDefinition(getHoverWord(), false);
			}
		}
		return null;
	}

	public IProject getProject() {
		IDocument doc = getDocument();
		if (doc instanceof ECLDocument) {
			IFile file = ((ECLDocument)doc).getFile();
			return file.getProject();
		}
		return null;
	}
}


