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
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.ISourceViewer;
import org.hpccsystems.eclide.builder.meta.ECLGlobalMeta;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree.ECLMetaNode;
import org.hpccsystems.eclide.resources.Messages;

public class ECLTextHover implements ITextHover {
	ISourceViewer sourceViewer;
	String contentType;
	ECLMetaTree meta;
	ECLMetaNode source;

	ECLTextHover(ISourceViewer sourceViewer, String contentType) {
		this.sourceViewer = sourceViewer;
		this.contentType = contentType;
		meta = ECLGlobalMeta.get();
	}

	@Override
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		return new Region(offset, 0);
	}

	@Override
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		IDocument doc = textViewer.getDocument();
		if (doc instanceof ECLDocument) {
			IFile file = ((ECLDocument)doc).getFile();
			source = meta.getSource(file);
			if (source == null) {
				return Messages.ECLTextHover_0;
			}
		}

		final String text = ECLEditor.getHoverWord(doc, hoverRegion.getOffset());
		StringBuilder hover = new StringBuilder(Messages.ECLTextHover_1);
		hover.append(Messages.ECLTextHover_2 + text);

		ECLMetaNode context = source.getContext(hoverRegion.getOffset());
		hover.append(Messages.ECLTextHover_3 + context.getName());
		
		ECLMetaNode found = context.findDefinition(text, false);
		if (found != null) {
			hover.append(Messages.ECLTextHover_4);
			hover.append(Messages.ECLTextHover_5 + found.getQualifiedName());// + " (" + def.getOffset() + ", " + def.getLength() + ")");
		}

		return hover.toString();
	}

}
