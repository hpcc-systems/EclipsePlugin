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
package org.seisint.eclide.internal.ui.editor;


import org.eclipse.core.filebuffers.IDocumentSetupParticipant;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.internal.ui.actions.FoldingActionGroup;
import org.eclipse.dltk.internal.ui.editor.DLTKEditorMessages;
import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.internal.ui.editor.ScriptOutlinePage;
import org.eclipse.dltk.internal.ui.editor.ToggleCommentAction;
import org.eclipse.dltk.ui.actions.IScriptEditorActionDefinitionIds;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.dltk.ui.text.folding.IFoldingStructureProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextOperationTarget;
import org.eclipse.jface.text.ITextViewerExtension5;
import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;
import org.eclipse.jface.text.source.ICharacterPairMatcher;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.TextOperationAction;
import org.seisint.eclide.core.OctaveLanguageToolkit;
import org.seisint.eclide.internal.ui.OctclipseUIPlugin;
import org.seisint.eclide.internal.ui.text.folding.OctaveFoldingStructureProvider;
import org.seisint.eclide.ui.text.OctavePartitions;

@SuppressWarnings("restriction")
public class OctaveEditor extends ScriptEditor {

	private DefaultCharacterPairMatcher bracketMatcher = new DefaultCharacterPairMatcher(BRACKETS);
	
	public void gotoMatchingBracket() {
		ISourceViewer sourceViewer = getSourceViewer();
		IDocument document = sourceViewer.getDocument();
		if (document == null)
			return;

		IRegion selection = getSignedSelection(sourceViewer);

		int selectionLength = Math.abs(selection.getLength());
		if (selectionLength > 1) {
			setStatusLineErrorMessage("No bracket selected");
			sourceViewer.getTextWidget().getDisplay().beep();
			return;
		}

		int sourceCaretOffset = selection.getOffset() + selection.getLength();
		if (isSurroundedByBrackets(document, sourceCaretOffset))
			sourceCaretOffset -= selection.getLength();

		IRegion region = bracketMatcher.match(document, sourceCaretOffset);
		if (region == null) {
			setStatusLineErrorMessage("No matching bracket found");
			sourceViewer.getTextWidget().getDisplay().beep();
			return;
		}

		int offset = region.getOffset();
		int length = region.getLength();

		if (length < 1)
			return;

		int anchor = bracketMatcher.getAnchor();
		int targetOffset = (ICharacterPairMatcher.RIGHT == anchor) ? offset + 1
				: offset + length;

		boolean visible = false;
		if (sourceViewer instanceof ITextViewerExtension5) {
			ITextViewerExtension5 extension = (ITextViewerExtension5) sourceViewer;
			visible = (extension.modelOffset2WidgetOffset(targetOffset) > -1);
		} else {
			IRegion visibleRegion = sourceViewer.getVisibleRegion();
			visible = (targetOffset >= visibleRegion.getOffset() && targetOffset <= visibleRegion
					.getOffset()
					+ visibleRegion.getLength());
		}

		if (!visible) {
			setStatusLineErrorMessage("Matching bracket is outside selected element");
			sourceViewer.getTextWidget().getDisplay().beep();
			return;
		}

		if (selection.getLength() < 0)
			targetOffset -= selection.getLength();

		sourceViewer.setSelectedRange(targetOffset, selection.getLength());
		sourceViewer.revealRange(targetOffset, selection.getLength());
	}

	public static final String EDITOR_ID = "org.seisint.eclide.ui.editor.OctaveEditor";
	public static final String EDITOR_CONTEXT = "#OctaveEditorContext";
	public static final String RULER_CONTEXT = "#OctaveRulerContext";
	public static final String EDITOR_SCOPE_ID = "org.seisint.eclide.ui.octaveEditorScope";
	
	private IFoldingStructureProvider foldingProvider;
	
	private void configureToggleCommentAction() {
		IAction action = getAction("ToggleComment"); //$NON-NLS-1$
		if (action instanceof ToggleCommentAction) {
			ISourceViewer sourceViewer = getSourceViewer();
			SourceViewerConfiguration configuration = getSourceViewerConfiguration();
			((ToggleCommentAction) action).configure(sourceViewer,
					configuration);
		}
	}
	
	protected void createActions() {
		super.createActions();
		Action action = new TextOperationAction(DLTKEditorMessages
				.getBundleForConstructedKeys(),
				"Comment.", this, ITextOperationTarget.PREFIX); //$NON-NLS-1$
		action.setActionDefinitionId(IScriptEditorActionDefinitionIds.COMMENT);
		setAction("Comment", action); //$NON-NLS-1$
		markAsStateDependentAction("Comment", true); //$NON-NLS-1$
		action = new TextOperationAction(DLTKEditorMessages
				.getBundleForConstructedKeys(),
				"Uncomment.", this, ITextOperationTarget.STRIP_PREFIX); //$NON-NLS-1$
		action.setActionDefinitionId(IScriptEditorActionDefinitionIds.UNCOMMENT);
		setAction("Uncomment", action); //$NON-NLS-1$
		markAsStateDependentAction("Uncomment", true); //$NON-NLS-1$
		action = new ToggleCommentAction(DLTKEditorMessages
				.getBundleForConstructedKeys(), "ToggleComment.", this); //$NON-NLS-1$
		action
				.setActionDefinitionId(IScriptEditorActionDefinitionIds.TOGGLE_COMMENT);
		setAction("ToggleComment", action); //$NON-NLS-1$
		markAsStateDependentAction("ToggleComment", true); //$NON-NLS-1$
		configureToggleCommentAction();		
	}
	
	protected void initializeEditor() {
		super.initializeEditor();
		setEditorContextMenuId(EDITOR_CONTEXT);
		setRulerContextMenuId(RULER_CONTEXT);
	}

	protected void connectPartitioningToElement(IEditorInput input,
			IDocument document) {
		if (document instanceof IDocumentExtension3) {
			IDocumentExtension3 doc = (IDocumentExtension3) document;
			if (doc.getDocumentPartitioner(OctavePartitions.ECL_PARTITIONING) == null) {
				IDocumentSetupParticipant participant = new OctaveDocumentSetupParticipant();
				participant.setup(document);
			}
		}
	}

	protected FoldingActionGroup createFoldingActionGroup() {
		return new FoldingActionGroup(this, getViewer(), getScriptPreferenceStore());
	}

	protected ScriptOutlinePage doCreateOutlinePage() {
		return new OctaveOutlinePage(this, getScriptPreferenceStore());
	}

	public String getCallHierarchyID() {
		return "org.eclipse.dltk.callhierarchy.view";
	}

	public String getEditorId() {
		return EDITOR_ID;
	}

	protected IFoldingStructureProvider getFoldingStructureProvider() {
		if (foldingProvider == null) {
			foldingProvider = new OctaveFoldingStructureProvider();
		}
		return foldingProvider;
	}

	public IDLTKLanguageToolkit getLanguageToolkit() {
		return OctaveLanguageToolkit.getDefault();
	}

	public IPreferenceStore getScriptPreferenceStore() {
		return OctclipseUIPlugin.getDefault().getPreferenceStore();
	}

	public ScriptTextTools getTextTools() {
		return OctclipseUIPlugin.getDefault().getTextTools();
	}
	
	protected void initializeKeyBindingScopes() {
		setKeyBindingScopes(new String[] { EDITOR_SCOPE_ID });
	}
}
