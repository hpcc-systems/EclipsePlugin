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
package org.seisint.eclide.internal.ui.text;


import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.compiler.task.TodoTaskPreferences;
import org.eclipse.dltk.ui.CodeFormatterConstants;
import org.eclipse.dltk.ui.text.AbstractScriptScanner;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.ScriptPresentationReconciler;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.completion.ContentAssistPreference;
import org.eclipse.dltk.ui.text.completion.ContentAssistProcessor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.information.IInformationProvider;
import org.eclipse.jface.text.information.InformationPresenter;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.texteditor.ITextEditor;
import org.seisint.eclide.internal.ui.OctclipseUIPlugin;
import org.seisint.eclide.internal.ui.text.completion.OctaveContentAssistPreference;
import org.seisint.eclide.internal.ui.text.completion.OctaveScriptCompletionProcessor;
import org.seisint.eclide.ui.text.OctavePartitions;

public class OctaveSourceViewerConfiguration extends ScriptSourceViewerConfiguration {

	public IAutoEditStrategy[] getAutoEditStrategies(
			ISourceViewer sourceViewer, String contentType) {
		String partitioning = getConfiguredDocumentPartitioning(sourceViewer);
		return new OctaveAutoEditStrategy[] { new OctaveAutoEditStrategy(
				fPreferenceStore, partitioning) };
	}

	private AbstractScriptScanner[] scanners;
	private OctaveTextTools   textTools;
	private static final int DEFAULT = 0;
	private static final int STRING = 1;
	private static final int COMMENT = 2;
	
	public OctaveSourceViewerConfiguration(IColorManager manager,
			IPreferenceStore preferenceStore, ITextEditor editor,
			String partitioning) {
		super(manager, preferenceStore, editor, partitioning);
	}

	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		if (getEditor() != null) {
			ContentAssistant assistant = new ContentAssistant();
			assistant
					.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
			assistant
					.setRestoreCompletionProposalSize(getSettings("completion_proposal_size")); //$NON-NLS-1$
			IContentAssistProcessor scriptProcessor = new OctaveScriptCompletionProcessor(
					getEditor(), assistant, IDocument.DEFAULT_CONTENT_TYPE);
			assistant.setContentAssistProcessor(scriptProcessor,
					IDocument.DEFAULT_CONTENT_TYPE);
			ContentAssistProcessor commentProcessor = new OctaveScriptCompletionProcessor(
					getEditor(), assistant, OctavePartitions.ECL_COMMENT);
			assistant.setContentAssistProcessor(commentProcessor,
					OctavePartitions.ECL_COMMENT);
			ContentAssistProcessor stringProcessor = new OctaveScriptCompletionProcessor(
					getEditor(), assistant, OctavePartitions.ECL_STRING);
			assistant.setContentAssistProcessor(stringProcessor,
					OctavePartitions.ECL_STRING);
			OctaveContentAssistPreference.getDefault().configure(assistant,
					fPreferenceStore);
			assistant
					.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
			assistant
					.setInformationControlCreator(getInformationControlCreator(sourceViewer));
			return assistant;
		} 
		return null;
	}
	
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer)
	{
		return OctavePartitions.ECL_PARTITION_TYPES;
	}
	
	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer)
	{
		PresentationReconciler reconciler = new ScriptPresentationReconciler();
		reconciler
				.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
		DefaultDamagerRepairer dr;
		String[] contentTypes = OctavePartitions.ECL_PARTITION_TYPES;
		for (int i = 0; i < contentTypes.length; i++)
		{
			dr = new DefaultDamagerRepairer(scanners[i]);
			reconciler.setDamager(dr, contentTypes[i]);
			reconciler.setRepairer(dr, contentTypes[i]);
		}
		return reconciler;
	}

	public boolean affectsTextPresentation(PropertyChangeEvent event) {
		return scanners[DEFAULT].affectsBehavior(event)
			|| scanners[STRING].affectsBehavior(event)
			|| scanners[COMMENT].affectsBehavior(event);
	}

	protected IInformationControlCreator getOutlinePresenterControlCreator(
			ISourceViewer sourceViewer, final String commandId) {
		return new IInformationControlCreator() {
			public IInformationControl createInformationControl(Shell parent) {
				int shellStyle = SWT.RESIZE;
				int treeStyle = SWT.V_SCROLL | SWT.H_SCROLL;
				return new OctaveOutlineInformationControl(parent, shellStyle,
						treeStyle, commandId);
			}
		};
	}
	
	protected void initializeQuickOutlineContexts(InformationPresenter presenter,
			IInformationProvider provider) {
		presenter.setInformationProvider(provider, OctavePartitions.ECL_COMMENT);
		presenter.setInformationProvider(provider, OctavePartitions.ECL_STRING);
	}

	public void handlePropertyChangeEvent(PropertyChangeEvent event) {
		Assert.isTrue(isNewSetup());
		if (scanners[DEFAULT].affectsBehavior(event)) {
			scanners[DEFAULT].adaptToPreferenceChange(event);
		}
		if (scanners[STRING].affectsBehavior(event)) {
			scanners[STRING].adaptToPreferenceChange(event);
		}
		if (scanners[COMMENT].affectsBehavior(event)) {
			scanners[COMMENT].adaptToPreferenceChange(event);
		}
	}
	
	protected void initializeScanners() {
		Assert.isTrue(isNewSetup());
		scanners = new AbstractScriptScanner[3];
		scanners[DEFAULT] = new OctaveCodeScanner(getColorManager(), fPreferenceStore);
		scanners[STRING] = new OctaveStringScanner(getColorManager(), fPreferenceStore);
		scanners[COMMENT] = new OctaveScriptCommentScanner(getColorManager(),
				   fPreferenceStore, OctaveColorConstants.ECL_COMMENT,
				   OctaveColorConstants.TODO_TAG, 
				   new TodoTaskPreferences(
						   OctclipseUIPlugin.getDefault().getPluginPreferences())); 
	}
	
	public int getTabWidth(ISourceViewer sourceViewer) {
		if (fPreferenceStore == null)
			return super.getTabWidth(sourceViewer);
		return fPreferenceStore
				.getInt(CodeFormatterConstants.FORMATTER_TAB_SIZE);
	}
	
	private boolean isNewSetup() {
		return textTools == null;
	}
	
	public String[] getIndentPrefixes(ISourceViewer sourceViewer,
			String contentType) {
		return new String[] { "\t", "    " }; //$NON-NLS-1$ //$NON-NLS-2$
	}

	public String[] getDefaultPrefixes(ISourceViewer sourceViewer,
			String contentType) {
		return new String[] { "#", "%", "" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}
	
	protected ContentAssistPreference getContentAssistPreference() {
		return OctaveContentAssistPreference.getDefault();
	}
	
}
