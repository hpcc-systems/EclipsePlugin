package org.hpccsystems.eclide.builder;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.hpccsystems.eclide.builder.messages"; //$NON-NLS-1$
	public static String ECLBuilder_1;
	public static String ECLCompiler_0;
	public static String ECLCompiler_13;
	public static String ECLCompiler_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
