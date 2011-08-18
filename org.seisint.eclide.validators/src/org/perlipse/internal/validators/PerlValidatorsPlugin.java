package org.perlipse.internal.validators;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import org.osgi.framework.BundleContext;


public class PerlValidatorsPlugin extends AbstractUIPlugin
{

    public static final String PLUGIN_ID = "org.perlipse.validators";

    private static PerlValidatorsPlugin plugin;

    public PerlValidatorsPlugin()
    {
        // empty constructor
    }

    public static void error(String message, Throwable t)
    {
        plugin.getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.OK, message, t));
    }

    public static PerlValidatorsPlugin getDefault()
    {
        return plugin;
    }

    @Override public void start(BundleContext context) throws Exception
    {
        super.start(context);
        plugin = this;
    }

    public void stop(BundleContext context) throws Exception
    {
        plugin = null;
        super.stop(context);
    }
}
