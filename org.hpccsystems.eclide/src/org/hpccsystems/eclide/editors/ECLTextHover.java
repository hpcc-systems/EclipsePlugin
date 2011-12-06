package org.hpccsystems.eclide.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.ISourceViewer;

public class ECLTextHover implements ITextHover {
	ISourceViewer sourceViewer;
	String contentType;
	
	ECLTextHover(ISourceViewer sourceViewer, String contentType) {
		this.sourceViewer = sourceViewer;
		this.contentType = contentType;
	}

	@Override
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		return new Region(offset, 0);
	}

	@Override
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		try {
            IDocument doc = textViewer.getDocument();
            //EscriptModel em = EscriptModel.getModel(doc, null);
            //return em.getElementAt(hoverRegion.getOffset()).getHoverHelp();
         }
         catch (Exception e) {            
            return ""; 
         }
        return "hmmm"; 
	}

}
