package org.perlipse.internal.validators;

import org.eclipse.osgi.util.NLS;

public class PerlValidatorMessages extends NLS {

private static String BUNDLE_NAME = "org.perlipse.internal.validators.validatorMessages";
    
    static {
        NLS.initializeMessages(BUNDLE_NAME, PerlValidatorMessages.class);
    }
    
    public static String compiler_unknownError;
	
}
