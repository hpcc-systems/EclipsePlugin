/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.debug.console.ui.actions;


import org.eclipse.dltk.console.ui.IScriptConsole;
import org.eclipse.dltk.console.ui.ScriptConsole;
import org.eclipse.dltk.console.ui.ScriptConsoleManager;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;
import org.seisint.eclide.internal.debug.console.ui.OctaveConsole;


public class PasteOctaveTextToConsoleAction implements IEditorActionDelegate {

	private ISelection selection;

	private IEditorPart targetEditor;

	protected IDocument getDocument() {
		if (!(targetEditor instanceof ITextEditor))
			return null;
		ITextEditor editor = (ITextEditor) targetEditor;
		IDocumentProvider dp = editor.getDocumentProvider();
		return dp.getDocument(editor.getEditorInput());
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.targetEditor = targetEditor;
	}

	public void run(IAction action) {
		ScriptConsoleManager manager = ScriptConsoleManager.getInstance();
		IScriptConsole console = manager
				.getActiveScriptConsole(OctaveConsole.CONSOLE_TYPE);
		if (console == null) {
			return;
		}
		if (selection instanceof ITextSelection) {
			String text = ((ITextSelection) selection).getText();
			console.insertText(text);
		}		
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
}
