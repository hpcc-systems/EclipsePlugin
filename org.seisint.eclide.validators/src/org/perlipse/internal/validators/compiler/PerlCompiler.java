package org.perlipse.internal.validators.compiler;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.validators.core.AbstractValidator;
import org.eclipse.dltk.validators.core.ISourceModuleValidator;
import org.eclipse.dltk.validators.core.IValidatorType;
import org.perlipse.internal.validators.PerlValidatorsPlugin;

public class PerlCompiler extends AbstractValidator
{

    protected PerlCompiler(String id, String name, IValidatorType type)
    {
        super(id, name, type);

        // TODO: this needs to be controlled via a preference
        //super.setAutomatic(true);
    }

    @SuppressWarnings("unchecked")
	public Object getValidator(IScriptProject project, Class validatorType)
    {
    	if (validatorType == ISourceModuleValidator.class)
    	{
    		return getSourceModuleValidator(project);
    	}
    	
    	return null;
    }

    public boolean isValidatorValid(IScriptProject project)
    {
        // TODO: figure out how this should really be used...
        return true;
    }
    
    protected ISourceModuleValidator getSourceModuleValidator(IScriptProject project)
    {
    	ISourceModuleValidator validator = null;
        
        try
        {       
            validator = new PerlCompilerWorker(project);
        }
        catch (CoreException e)
        {
        	PerlValidatorsPlugin.error("unable to create source validator", e);
        }
        
        return validator;
    }

}
