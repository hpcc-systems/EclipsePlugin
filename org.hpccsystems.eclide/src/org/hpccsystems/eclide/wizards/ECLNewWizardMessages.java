package org.hpccsystems.eclide.wizards;

import org.eclipse.osgi.util.NLS;

public class ECLNewWizardMessages extends NLS {
	private static final String BUNDLE_NAME = "eclideplugin.wizards.messages"; //$NON-NLS-1$
	public static String ECLNewProjectWizard_Create_something_custom;
	public static String ECLNewProjectWizard_ECL_Plugin_Project;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, ECLNewWizardMessages.class);
	}

    private ECLNewWizardMessages() {
        // Hide me!
    }
}
