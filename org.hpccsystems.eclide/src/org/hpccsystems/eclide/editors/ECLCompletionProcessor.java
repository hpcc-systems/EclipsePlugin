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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.hpccsystems.eclide.builder.meta.ECLDefinition;
import org.hpccsystems.eclide.builder.meta.ECLGlobalMeta;
import org.hpccsystems.eclide.builder.meta.ECLSource;
import org.hpccsystems.eclide.text.ECLKeywords;

public class ECLCompletionProcessor implements IContentAssistProcessor {
    private final IContextInformation[] NO_CONTEXTS = { };
    private final char[] PROPOSAL_ACTIVATION_CHARS = { '.' };
    private ICompletionProposal[] NO_COMPLETIONS = { };
	
    private int getFirstCharOffset(IDocument doc, int offset, boolean includePeriod) {
    	try {
    		for (int n = offset-1; n >= 0; n--) {
    			char c = doc.getChar(n);
    			if (!(Character.isJavaIdentifierPart(c) || (c == '.' && includePeriod) || c == '#'))
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

	private String getAutoCString(IDocument doc, int offset) {
		int firstOffset = getFirstCharOffset(doc, offset, true);
		try {
			return doc.get(firstOffset,  offset - firstOffset);
			
		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return "";
	}

	private String getAutoCKnownString(IDocument doc, int offset) {
		int firstOffset = getFirstCharOffset(doc, offset, true);
		int replacementPos = getFirstCharOffset(doc, offset, false);
		try {
			String retVal = doc.get(firstOffset,  replacementPos - firstOffset);
			if (retVal.endsWith("."))
				return retVal.substring(0, retVal.length() - 1);
			return retVal;
			
		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return "";
	}

	private String getAutoCRemainingString(IDocument doc, int offset) {
		int replacementPos = getFirstCharOffset(doc, offset, false);
		try {
			return doc.get(replacementPos,  offset - replacementPos);
			
		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return "";
	}
	
	private String getAutoCWordToReplace(IDocument doc, int offset) {
		int firstOffset = getFirstCharOffset(doc, offset, false);
		try {
			return doc.get(firstOffset,  offset - firstOffset);

		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return "";
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		ArrayList<CompletionProposal> result = new ArrayList<CompletionProposal>();

		IDocument doc = viewer.getDocument();
		ECLSource source = null;
		if (doc instanceof ECLDocument) {
			IFile file = ((ECLDocument)doc).getFile();
			source = ECLGlobalMeta.get().getSource(file.getLocation());
		}
		ECLDefinition context = source.getContext(offset);
		String knownText = getAutoCKnownString(doc, offset);
		String remainingText = getAutoCRemainingString(doc, offset);
		int replacementPos = getFirstCharOffset(doc, offset, false);
		int endReplacementPos = getLastCharOffset(doc, offset);
		if (knownText.isEmpty()) {
			for (int i = 0; i < 6; ++i) {
				for (String s : ECLKeywords.getKeywords(i)) {
					if (s.toLowerCase().startsWith(remainingText.toLowerCase()))
						result.add(new CompletionProposal(s.toUpperCase(), replacementPos, endReplacementPos - replacementPos, s.length()));
				}
			}
			
		} else {
			ECLDefinition def = context.findDefinition(knownText);
			if (def != null) {
				for (ECLDefinition child_def : def.getDefinitions()) {
					if (child_def.getName().toLowerCase().startsWith(remainingText.toLowerCase()))
						result.add(new CompletionProposal(child_def.getName(), replacementPos, endReplacementPos - replacementPos, child_def.getName().length()));
				}			
			}
		}
		
		Collections.sort(result, new Comparator<CompletionProposal>() {

			@Override
			public int compare(CompletionProposal o1, CompletionProposal o2) {
				return o1.getDisplayString().compareTo(o2.getDisplayString());
			}
		});
		
		return (ICompletionProposal[]) result.toArray(new ICompletionProposal[result.size()]);
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return NO_CONTEXTS;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		return PROPOSAL_ACTIVATION_CHARS;
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}
}
