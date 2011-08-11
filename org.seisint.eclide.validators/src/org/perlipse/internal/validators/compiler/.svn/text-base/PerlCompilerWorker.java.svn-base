package org.perlipse.internal.validators.compiler;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.IScriptProcessHandler.ScriptResult;
import org.eclipse.dltk.launching.InternalScriptExecutor;
import org.eclipse.dltk.launching.ScriptRuntime;
import org.eclipse.dltk.validators.core.IValidatorOutput;
import org.eclipse.dltk.validators.core.IValidatorProblem;
import org.eclipse.dltk.validators.core.IValidatorReporter;
import org.eclipse.dltk.validators.core.SourceModuleValidatorWorker;

import org.seisint.eclide.launching.OctaveProcessHandler;

//TODO import org.seisint.eclide.core.util.PerlProcessHandler;

import org.perlipse.internal.validators.PerlValidatorsPlugin;


/**
 */
public class PerlCompilerWorker extends SourceModuleValidatorWorker
{
    private static String MARKER_ID = PerlValidatorsPlugin.PLUGIN_ID + ".perlCompilerMarker";
    private InternalScriptExecutor executor;

    private String incPath;

    public PerlCompilerWorker(IScriptProject project) throws CoreException
    {
        IInterpreterInstall interpreter = ScriptRuntime.getInterpreterInstall(project);
        executor = new InternalScriptExecutor(interpreter, new OctaveProcessHandler());
        //TODO incPath = PerlEnvironmentUtils.createBuildPath(project);
    }

    @Override protected String getMarkerId()
    {
        return MARKER_ID;
    }

    @Override protected String getNullResourceMessage()
    {
        return "";
    }

    @Override protected String getPluginId()
    {
        return PerlValidatorsPlugin.PLUGIN_ID;
    }

    @Override protected String getTaskName()
    {
        return "Compiling perl sources...";
    }

    @Override protected boolean isValidSourceModule(ISourceModule module)
    {
        return true;
    }

    @Override protected void runValidator(ISourceModule module, IValidatorOutput console,
        IValidatorReporter reporter, IProgressMonitor monitor) throws CoreException
    {
        IResource resource = module.getResource();

        String[] args = new String[] { "-c", "-w", incPath };

        // IResource resource = module.getResource();
        // String location = resource.getLocation().toOSString();
        // String[] args = new String[] {incPath.path, "-MO=Perlipse::Depends,"
        // + location + ",1"};

        ScriptResult result = executor.execute(args, module.getSourceAsCharArray());
        console.println(result.toString());

        PerlCompilerOutputParser parser = new PerlCompilerOutputParser();

        for (Object line : result.stderrLines)
        {
            IValidatorProblem problem = parser.parseLine(resource, (String) line);
            reporter.report(module, problem);
        }
    }
}
