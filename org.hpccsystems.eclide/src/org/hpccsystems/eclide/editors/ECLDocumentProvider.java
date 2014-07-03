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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.FileDocumentProvider;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.eclide.builder.PluginCompiler;
import org.hpccsystems.eclide.text.ECLPartitionScanner;
import org.hpccsystems.internal.data.ClientTools;

public class ECLDocumentProvider extends FileDocumentProvider {

	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		if (document != null) {
			IDocumentPartitioner partitioner =
					new FastPartitioner(
							new ECLPartitionScanner(),
							new String[] {
								ECLPartitionScanner.ECL_BODY,
								ECLPartitionScanner.ECL_COMMENT,
								ECLPartitionScanner.ECL_JAVADOC });
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}

	@Override
	protected IDocument createEmptyDocument() {
		return new ECLDocument();
	}

	@Override
	protected boolean setDocumentContent(IDocument document, IEditorInput editorInput, String encoding) throws CoreException {
		if (document instanceof ECLDocument) {
			((ECLDocument)document).setEditorInput(editorInput);
		}
		return super.setDocumentContent(document, editorInput, encoding);
	}
	
	@Override
	public void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite) throws CoreException {
		super.doSaveDocument(monitor, element, document, overwrite);
		if (element instanceof IFileEditorInput) {
			IFileEditorInput input= (IFileEditorInput) element;
			String encoding= null;

			FileInfo info= (FileInfo) getElementInfo(element);
			IFile file= input.getFile();

			ClientTools ct = ClientTools.get();
			ECLCompiler compiler = ct.getCompiler(file);
			if (compiler instanceof PluginCompiler) {
				PluginCompiler pCompiler = (PluginCompiler)compiler;
				pCompiler.saveFile(file);
			}
		}		
	}
}
