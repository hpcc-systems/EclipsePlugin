package org.seisint.eclide.internal.launching.debug;


import org.eclipse.dltk.core.DLTKIdContributionSelector;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.seisint.eclide.debug.OctaveDebugConstants;
import org.seisint.eclide.debug.OctclipseDebugPlugin;

public class OctaveDebuggingEngineSelector extends DLTKIdContributionSelector
{
    protected String getSavedContributionId(PreferencesLookupDelegate delegate)
    {
        return delegate.getString(OctclipseDebugPlugin.PLUGIN_ID, 
        		OctaveDebugConstants.DEBUGGING_ENGINE_ID_KEY);
    }
}
