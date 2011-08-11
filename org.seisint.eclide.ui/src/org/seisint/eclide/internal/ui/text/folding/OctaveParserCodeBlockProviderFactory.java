package org.seisint.eclide.internal.ui.text.folding;

import org.seisint.eclide.core.IOctaveCodeBlockProvider;
import org.seisint.eclide.core.IOctaveCodeBlockProviderFactory;

public class OctaveParserCodeBlockProviderFactory implements
		IOctaveCodeBlockProviderFactory {

	public IOctaveCodeBlockProvider getProvider() {
		return new OctaveParserCodeBlockProvider();
	}

}
