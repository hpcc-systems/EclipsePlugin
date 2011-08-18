package org.perlipse.internal.validators.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.ui.PreferencesAdapter;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.seisint.eclide.core.OctaveNature;
import org.perlipse.internal.validators.PerlValidatorsPlugin;


public class PerlValidatorsPreferencePage extends AbstractConfigurationBlockPropertyAndPreferencePage
{
//    private static final PreferenceKey VALIDATOR_XML = 
//    	ValidatorOptionsBlock.createValidatorXMLKey(PerlValidatorsPlugin.PLUGIN_ID);

    @Override protected AbstractOptionsBlock createOptionsBlock(
        IStatusChangeListener newStatusChangedListener, IProject project,
        IWorkbenchPreferenceContainer container)
    {
    	return null;    
//        return new ValidatorOptionsBlock(newStatusChangedListener, project, getKeys(), container)
//        {
//            @Override protected PreferenceKey getValidatorXMLKey()
//            {
//                return VALIDATOR_XML;
//            }
//
//            @Override protected String getNatureId()
//            {
//                return PerlValidatorsPreferencePage.this.getNatureId();
//            }
//        };
    }

    @Override protected String getHelpId()
    {
        return null;
    }

    protected PreferenceKey[] getKeys()
    {
    	return new PreferenceKey[] { };
    	// return new PreferenceKey[] { VALIDATOR_XML };
    }

    @Override protected String getNatureId()
    {
        return OctaveNature.NATURE_ID;
    }

    @Override protected String getPreferencePageId()
    {
        return "org.perlipse.validators.ui.preferences.PerlValidatorPreferencePage";
    }

    @Override protected String getProjectHelpId()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override protected String getPropertyPageId()
    {
        return "org.perlipse.validators.ui.propertyPage.PerlValidatorsPreferencePage";
    }

    @Override protected void setDescription()
    {
        // TODO Auto-generated method stub

    }

    @Override protected void setPreferenceStore()
    {
        setPreferenceStore(new PreferencesAdapter(
                PerlValidatorsPlugin.getDefault().getPluginPreferences()));
    }

}
