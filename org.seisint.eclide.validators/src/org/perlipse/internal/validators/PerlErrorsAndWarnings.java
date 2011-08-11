package org.perlipse.internal.validators;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.regex.Pattern;


/**
 */
public class PerlErrorsAndWarnings
{
    private static String BUNDLE = "org.perlipse.internal.validators.errorsAndWarnings";

    private static PerlErrorsAndWarnings self;

    private static ErrorOrWarning UNKNOWN_ERROR =
        new ErrorOrWarning("", PerlValidatorMessages.compiler_unknownError, true);

    private Set<ErrorOrWarning> messages;

    private PerlErrorsAndWarnings()
    {
        messages = new HashSet<ErrorOrWarning>();

        ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE);
        for (Enumeration<String> e = bundle.getKeys(); e.hasMoreElements();)
        {
        	String value = bundle.getString(e.nextElement());
            String[] parts = value.split("\\t", 2);
            
          	messages.add(new ErrorOrWarning(parts[0], parts[1], false));
        }
    }

    public static PerlErrorsAndWarnings getInstance()
    {
        if (self == null)
        {
            self = new PerlErrorsAndWarnings();
        }

        return self;
    }

    public ErrorOrWarning getErrorOrWarning(String line)
    {
        for (Iterator<ErrorOrWarning> i = messages.iterator(); i.hasNext();)
        {
            ErrorOrWarning eom = i.next();
            if (eom.matches(line))
            {
                return eom;
            }
        }

        return UNKNOWN_ERROR;
    }

    /**
     */
    public static class ErrorOrWarning
    {
        private String desc;
        private Pattern pattern;
        private boolean unknown;

        ErrorOrWarning(String regexp, String desc, boolean unknown)
        {
            this.desc = desc;
            this.unknown = unknown;
            this.pattern = Pattern.compile(regexp);
        }

        public String getDescription()
        {
            return desc;
        }

        public boolean isUnknown()
        {
            return unknown;
        }

        public boolean isWarning()
        {
            return desc.startsWith("(W") || desc.startsWith("(D") || desc.startsWith("(S");
        }

        boolean matches(String line)
        {
            return pattern.matcher(line).find();
        }
    }
}
