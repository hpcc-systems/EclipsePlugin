package org.hpccsystems.eclide.editors;

import java.text.Annotation;
import java.util.Iterator;

import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;

public class ECLAnnotationHover implements IAnnotationHover {

	@Override
	public String getHoverInfo(ISourceViewer sourceViewer, int lineNumber) {
		Iterator<Annotation> itr = sourceViewer.getAnnotationModel().getAnnotationIterator();
//		while(itr.hasNext()) {
//			Annotation annotation = itr.next();
//			int i = annotation.hashCode();
//		}
		return "Nothing to see move along...";
	}

}
