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
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.ISourceViewer;
import org.hpccsystems.eclide.builder.meta.ECLGlobalMeta;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree.ECLMetaNode;

public class ECLTextHover implements ITextHover {
	ISourceViewer sourceViewer;
	String contentType;
	ECLMetaTree meta;
	ECLMetaNode source;

	ECLTextHover(ISourceViewer sourceViewer, String contentType) {
		this.sourceViewer = sourceViewer;
		this.contentType = contentType;
		this.meta = ECLGlobalMeta.get();
	}

	@Override
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		return new Region(offset, 0);
	}

	private int getFirstCharOffset(IDocument doc, int offset) {
		try {
			for (int n = offset-1; n >= 0; n--) {
				char c = doc.getChar(n);
				if (!Character.isJavaIdentifierPart(c) && c != '.' && c != '#')
					return n + 1;
			}
		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return offset;
	}

	private int getLastCharOffset(IDocument doc, int offset) {
		try {
			for (int n = offset; n < doc.getLength(); ++n) {
				char c = doc.getChar(n);
				if (!Character.isJavaIdentifierPart(c) && c != '.')
					return n;
			}
		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return offset;
	}

	private String getHoverWord(IDocument doc, int offset) {
		int firstOffset = getFirstCharOffset(doc, offset);
		int lastOffset = getLastCharOffset(doc, offset);
		try {
			return doc.get(firstOffset,  lastOffset - firstOffset);

		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return "";
	}


	@Override
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		IDocument doc = textViewer.getDocument();
		if (doc instanceof ECLDocument) {
			IFile file = ((ECLDocument)doc).getFile();
			source = meta.getSource(file.getLocation());
			if (source == null)
				return "---  NO META  ---";
		}

		String text = getHoverWord(doc, hoverRegion.getOffset());
		StringBuilder hover = new StringBuilder("---  SEARCH INFO  ---");
		hover.append("\nSearch For:  " + text);

		ECLMetaNode context = source.getContext(hoverRegion.getOffset());
		hover.append("\nContext:  " + context.getName());

		ECLMetaNode found = context.findDefinition(text, false);
		if (found != null) {
			hover.append("\n---  MATCH  ---");
			//hover.append("\nFound in:  " + def.getSource().getPathString());
			hover.append("\nDefinition:  " + found.getQualifiedName());// + " (" + def.getOffset() + ", " + def.getLength() + ")");
		}

		/*
		ArrayList<ECLDefinition> matchedDef = new ArrayList<ECLDefinition>();
		context.findDefinitionList(text, matchedDef);
		if (!matchedDef.isEmpty()) {
			hover.append("\n---  PARTIAL MATCH  ---");
			boolean first = true;
			for(ECLDefinition mdef : matchedDef) {
				if (first) {
					first = false;
					hover.append("\nFound in:  " + mdef.getSource().getPathString());
				}
				hover.append("\nDefinition:  " + mdef.getName() + " (" + mdef.getOffset() + ", " + mdef.getLength() + ")");
			}
		}
		 */

		return hover.toString();
	}

}
