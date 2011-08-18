package org.perlipse.internal.validators.compiler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IResource;
import org.eclipse.dltk.validators.core.IValidatorProblem;
import org.eclipse.dltk.validators.core.ValidatorProblem;
import org.seisint.eclide.core.OctclipsePlugin;
import org.perlipse.internal.validators.PerlErrorsAndWarnings;
import org.perlipse.internal.validators.PerlValidatorConstants;
import org.perlipse.internal.validators.PerlErrorsAndWarnings.ErrorOrWarning;


/**
 */
public class PerlCompilerOutputParser
{
    private static final Pattern compilerPattern =
        Pattern.compile("^(.*) at (\\S+) line (\\d+)[\\.,]");

    public IValidatorProblem parseLine(IResource resource, String line)
    {
        Matcher matcher = compilerPattern.matcher(line);
        if (matcher.find())
        {
            String message = matcher.group(1);
            String path = matcher.group(2);
            int lineNo = parseInt(matcher.group(3), line);

            if (isLocal(path))
            {
                return createProblem(resource, message, lineNo);
            }
        }

        return null;
    }

    private IValidatorProblem createProblem(IResource resource, String message, int lineNo)
    {
    	String fileName = resource.getName();
    	
        ErrorOrWarning eom = PerlErrorsAndWarnings.getInstance().getErrorOrWarning(message);
        IValidatorProblem.Type type = getProblemType(eom);

        IValidatorProblem problem = new ValidatorProblem(fileName, message, lineNo, type);
        problem.addAttribute(PerlValidatorConstants.MARKER_ATTR_ERROR_WARN_DESC,
            eom.getDescription());

        return problem;
    }

    private IValidatorProblem.Type getProblemType(ErrorOrWarning eom)
    {
        return (eom.isWarning()) ? IValidatorProblem.Type.WARN : IValidatorProblem.Type.ERROR;
    }

    private boolean isLocal(String path)
    {
        return "-".equals(path);
    }

    private int parseInt(String str, String line)
    {
        try
        {
            return Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            //TODO:  PerlCorePlugin.error("unable to parse line number from [" + line + "]", e);
            return -1;
        }
    }
}
