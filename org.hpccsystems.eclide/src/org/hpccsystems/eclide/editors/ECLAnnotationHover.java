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

import java.text.Annotation;
import java.util.Iterator;

import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.hpccsystems.eclide.resources.Messages;

public class ECLAnnotationHover implements IAnnotationHover {

	@Override
	public String getHoverInfo(ISourceViewer sourceViewer, int lineNumber) {
		Iterator<Annotation> itr = sourceViewer.getAnnotationModel().getAnnotationIterator();
		//		while(itr.hasNext()) {
		//			Annotation annotation = itr.next();
		//			int i = annotation.hashCode();
		//		}
		return Messages.ECLAnnotationHover_0;
	}

}
