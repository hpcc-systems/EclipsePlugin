package org.hpccsystems.eclide.problem;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.hpccsystems.eclide.problem.messages"; //$NON-NLS-1$
	public static String QuickFix_0;
	public static String QuickFix_1;
	public static String QuickFixer_1;
	public static String QuickFixer_2;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
