package org.seisint.eclide.internal.ui.text.completion;

import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.ui.text.completion.LazyScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

public class OctaveLazyCompletionProposal extends
		LazyScriptCompletionProposal {

	public OctaveLazyCompletionProposal(CompletionProposal proposal,
			ScriptContentAssistInvocationContext context) {
		super(proposal, context);
	}

	protected char[] getDocTriggers() {
		return null;
	}

	protected char[] getTypeTriggers() {
		return null;
	}

	protected void handleSmartTrigger(IDocument document, char trigger,
			int referenceOffset) throws BadLocationException {
	}

	protected boolean isSmartTrigger(char trigger) {
		return false;
	}

}
