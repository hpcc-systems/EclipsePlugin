package org.hpccsystems.eclide.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension2;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension3;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension4;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.hpccsystems.eclide.builder.meta.ECLDefinition;
import org.hpccsystems.eclide.builder.meta.ECLGlobalMeta;
import org.hpccsystems.eclide.builder.meta.ECLSource;

public class ECLCompletionProcessor implements IContentAssistProcessor {
    private final IContextInformation[] NO_CONTEXTS = { };
    private final char[] PROPOSAL_ACTIVATION_CHARS = { '.' };
    private ICompletionProposal[] NO_COMPLETIONS = { };
	
	private int getFirstCharOffset(IDocument doc, int offset) {
		try {
			for (int n = offset-1; n >= 0; n--) {
				char c = doc.getChar(n);
				if (!Character.isJavaIdentifierPart(c) && c != '.' && c != '$')
					return n + 1;
			}
		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return offset;
	}

	private String getAutoCWord(IDocument doc, int offset) {
		int firstOffset = getFirstCharOffset(doc, offset);
		try {
			return doc.get(firstOffset,  offset - firstOffset);
			
		} catch (BadLocationException e) {
			// ... log the exception ...
		}
		return "";
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		IDocument doc = viewer.getDocument();
		ECLSource source = null;
		if (doc instanceof ECLDocument) {
			IFile file = ((ECLDocument)doc).getFile();
			source = ECLGlobalMeta.get().getSource(file.getLocation());
		}

		String text = getAutoCWord(doc, offset);
		StringBuilder hover = new StringBuilder("---  SEARCH INFO  ---");
		hover.append("\nSearch For:  " + text);

		
		ECLDefinition context = source.getContext(offset);
		hover.append("\nContext:  " + context.getName());
		
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
		
		ArrayList result = new ArrayList();
		
		result.add(new CompletionProposal("Gordon", offset, 0, 0));
		
		return (ICompletionProposal[]) result.toArray(new ICompletionProposal[result.size()]);
	       		
		
		//return NO_COMPLETIONS;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		// TODO Auto-generated method stub
		return null;
	}
}
