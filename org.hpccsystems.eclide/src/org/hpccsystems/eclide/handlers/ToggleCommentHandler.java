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
package org.hpccsystems.eclide.handlers;

import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextOperationTarget;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.texteditor.TextOperationAction;

public class ToggleCommentHandler extends AbstractHandler {
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (!(selection instanceof TextSelection)) {
			return null;
		}
		TextSelection ts = (TextSelection) selection;

		IEditorPart editorPart = HandlerUtil.getActiveEditor(event);
		if (!(editorPart instanceof TextEditor) && !(editorPart instanceof MultiPageEditorPart)) {
			return null;
		}

		TextEditor textEditor = null;
		if (editorPart instanceof MultiPageEditorPart) {
			MultiPageEditorPart mpe = (MultiPageEditorPart) editorPart;
			IEditorPart[] editors = mpe.findEditors(mpe.getEditorInput());
			for (IEditorPart editor : editors) {
				if (editor instanceof TextEditor) {
					textEditor = (TextEditor) editor;
					break;
				}
			}
			if (null == textEditor) {
				return null;
			}
		} else {
			textEditor = (TextEditor) editorPart;
		}

		IDocument document = textEditor.getDocumentProvider().getDocument(textEditor.getEditorInput());
		ResourceBundle b = ResourceBundle.getBundle("org.hpccsystems.eclide.resources.messages");
		Action action;
		if (addComment(document, ts)) {
			action = new TextOperationAction(b, "", textEditor, ITextOperationTarget.PREFIX);
		} else {
			action = new TextOperationAction(b, "", textEditor, ITextOperationTarget.STRIP_PREFIX);
		}
		action.run();
		return null;
	}

	public static boolean addComment(IDocument document, TextSelection selection) {
		int startLine = selection.getStartLine();
		int endLine = selection.getEndLine();
		try {
			for (int lineNum = startLine; lineNum <= endLine; lineNum++) {
				int offsetAtStart = document.getLineOffset(lineNum);
				int lineLength = document.getLineLength(lineNum);
				String lineText = document.get(offsetAtStart, lineLength);
				if (!startsWithComment(lineText)) {
					return true;
				}
			}
		} catch (BadLocationException ex) {
			return false;
		}
		return false;
	}

	public static boolean startsWithComment(String line) {
		Pattern commentPattern = Pattern.compile("^\\s*//.*", Pattern.DOTALL);
		Matcher m = commentPattern.matcher(line);
		boolean match = m.matches();
		return match;
	}
}
