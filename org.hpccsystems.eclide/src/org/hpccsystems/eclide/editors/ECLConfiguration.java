/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

package org.hpccsystems.eclide.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;
import org.hpccsystems.eclide.text.ECLPartitionScanner;
import org.hpccsystems.eclide.text.ECLScanner;
import org.hpccsystems.eclide.text.ECLTagScanner;
import org.hpccsystems.eclide.text.IECLColorConstants;
import org.hpccsystems.eclide.text.NonRuleBasedDamagerRepairer;

public class ECLConfiguration extends TextSourceViewerConfiguration {
	//private ECLDoubleClickStrategy doubleClickStrategy;
	private ECLTagScanner tagScanner;
	private ECLScanner scanner;
	private ColorManager colorManager;

	public ECLConfiguration(ColorManager colorManager) {
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

//	@Override
//	public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
//		return new DefaultAnnotationHover();//sourceViewer);
//	}
	
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