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

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.quickassist.IQuickAssistAssistant;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;
import org.hpccsystems.eclide.text.ECLPartitionScanner;
import org.hpccsystems.eclide.text.ECLScanner;
import org.hpccsystems.eclide.text.ECLTagScanner;
import org.hpccsystems.eclide.text.IECLColorConstants;
import org.hpccsystems.eclide.text.NonRuleBasedDamagerRepairer;

public class ECLConfiguration extends TextSourceViewerConfiguration {

	@Override
	public int[] getConfiguredTextHoverStateMasks(ISourceViewer sourceViewer, String contentType) {
		// TODO Auto-generated method stub
		return super.getConfiguredTextHoverStateMasks(sourceViewer, contentType);
	}

	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sv) {
        ContentAssistant ca = new ContentAssistant();
        ca.enableAutoActivation(true);
        
        IContentAssistProcessor cap = new ECLCompletionProcessor();
        ca.setContentAssistProcessor(cap, IDocument.DEFAULT_CONTENT_TYPE);
        ca.setContentAssistProcessor(cap, ECLPartitionScanner.ECL_BODY);
        ca.setInformationControlCreator(getInformationControlCreator(sv));
        return ca;
     }
	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
		//if (contentType.equals(ECLPartitionScanner.ECL_BODY)) {
			return new ECLTextHover(sourceViewer, contentType);
		//}
		//return super.getTextHover(sourceViewer, contentType);
	}

	@Override
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		// TODO Auto-generated method stub
		return super.getReconciler(sourceViewer);
	}

	@Override
	public IQuickAssistAssistant getQuickAssistAssistant(ISourceViewer sourceViewer) {
		// TODO Auto-generated method stub
		return super.getQuickAssistAssistant(sourceViewer);
	}

	//private ECLDoubleClickStrategy doubleClickStrategy;
	private ECLTagScanner tagScanner;
	private ECLScanner scanner;
	private ECLColorManager colorManager;

	public ECLConfiguration(ECLColorManager colorManager) {
		this.colorManager = colorManager;
	}

	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] {
			IDocument.DEFAULT_CONTENT_TYPE,
			ECLPartitionScanner.ECL_JAVADOC,
			ECLPartitionScanner.ECL_COMMENT,
			ECLPartitionScanner.ECL_BODY };
	}
	
//	public ITextDoubleClickStrategy getDoubleClickStrategy(
//		ISourceViewer sourceViewer,
//		String contentType) {
//		if (doubleClickStrategy == null)
//			doubleClickStrategy = new ECLDoubleClickStrategy();
//		return doubleClickStrategy;
//	}

	@Override
	public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
		return super.getAnnotationHover(sourceViewer);
	}
	
	protected ECLScanner getECLScanner() {
		if (scanner == null) {
			scanner = new ECLScanner(colorManager);
			scanner.setDefaultReturnToken(
				new Token(
					new TextAttribute(
						colorManager.getColor(IECLColorConstants.DEFAULT))));
		}
		return scanner;
	}
	
	protected ECLTagScanner getECLTagScanner() {
		if (tagScanner == null) {
			tagScanner = new ECLTagScanner(colorManager);
			tagScanner.setDefaultReturnToken(
				new Token(
					new TextAttribute(
						colorManager.getColor(IECLColorConstants.TAG))));
		}
		return tagScanner;
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr =
			new DefaultDamagerRepairer(getECLTagScanner());
		reconciler.setDamager(dr, ECLPartitionScanner.ECL_BODY);
		reconciler.setRepairer(dr, ECLPartitionScanner.ECL_BODY);

		dr = new DefaultDamagerRepairer(getECLScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		NonRuleBasedDamagerRepairer ndr =
			new NonRuleBasedDamagerRepairer(
				new TextAttribute(
					colorManager.getColor(IECLColorConstants.ECL_COMMENT)));
		reconciler.setDamager(ndr, ECLPartitionScanner.ECL_COMMENT);
		reconciler.setRepairer(ndr, ECLPartitionScanner.ECL_COMMENT);

		ndr =
				new NonRuleBasedDamagerRepairer(
					new TextAttribute(
						colorManager.getColor(IECLColorConstants.ECL_JAVADOC)));
			reconciler.setDamager(ndr, ECLPartitionScanner.ECL_JAVADOC);
			reconciler.setRepairer(ndr, ECLPartitionScanner.ECL_JAVADOC);

		return reconciler;
	}

}
