package org.seisint.eclide.internal.ui.preferences;


import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.ui.PreferencesAdapter;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.seisint.eclide.core.OctaveCoreConstants;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.core.OctclipsePlugin;
import org.seisint.eclide.internal.ui.text.folding.OctaveCodeBlockProviderPreferenceBlock;

public class OctaveFoldingProviderPreferencePage  extends AbstractConfigurationBlockPropertyAndPreferencePage {

	static PreferenceKey PREF_KEY =
        new PreferenceKey(OctclipsePlugin.PLUGIN_ID, OctaveCoreConstants.CODE_BLOCK_PROVIDER);
    private static final String PREFERENCE_PAGE_ID =
        "org.seisint.eclide.ui.preferences.editor.folding.codeblockprovider";
    private static final String PROPERTY_PAGE_ID = null;
	
	protected AbstractOptionsBlock createOptionsBlock(
			IStatusChangeListener newStatusChangedListener, IProject project,
			IWorkbenchPreferenceContainer container) {
		 return new OctaveCodeBlockProviderPreferenceBlock(newStatusChangedListener, 
				 project, getKeys(), container) {

			protected String getNatureId() {
				return OctaveNature.NATURE_ID;
			}

			protected PreferenceKey getSavedContributionKey() {
				return PREF_KEY;
			}

		 };
	}

	protected String getHelpId() {
		return PREFERENCE_PAGE_ID;
	}

	protected String getProjectHelpId() {
		return PREFERENCE_PAGE_ID;
	}

	protected void setDescription() {
		 setDescription(OctavePreferencesMessages.OctaveCodeBlockProviderPreferences_description);
	}

	protected void setPreferenceStore() {
		 setPreferenceStore(new PreferencesAdapter(OctclipsePlugin.getDefault().getPluginPreferences()));
	}

	protected String getPreferencePageId() {
		return PREFERENCE_PAGE_ID;
	}

	protected String getPropertyPageId() {
		return PROPERTY_PAGE_ID;
	}
	
	private static PreferenceKey[] getKeys()
    {
        return new PreferenceKey[] { PREF_KEY };
    }

}
