package org.hpccsystems.eclide.editors;

import org.eclipse.help.HelpSystem;
import org.eclipse.help.IContext;
import org.eclipse.help.IContextProvider;

public class ECLContextProvider implements IContextProvider {

	String fContextId;
	String word;
	
	public ECLContextProvider(String contextID, String word) {
		fContextId = contextID;
		this.word = word;
	}

	@Override
	public String getSearchExpression(Object target) {
		return null;
	}

	@Override
	public int getContextChangeMask() {
		return SELECTION;
	}

	@Override
	public IContext getContext(Object target) {
		IContext context = HelpSystem.getContext(fContextId);
		if (!word.isEmpty()) {
			context = new ECLSelectionContext(context, word);
		}
		return context;
	}
}
