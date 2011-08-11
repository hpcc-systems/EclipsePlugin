package org.seisint.eclide.internal.ui.text.folding;


import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.core.DLTKContributionExtensionManager;
import org.eclipse.dltk.ui.preferences.ContributedExtensionOptionsBlock;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.preferences.PreferencesMessages;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.seisint.eclide.core.CodeBlockProviderManager;
import org.seisint.eclide.internal.ui.preferences.OctavePreferencesMessages;

public abstract class OctaveCodeBlockProviderPreferenceBlock extends ContributedExtensionOptionsBlock {

	public OctaveCodeBlockProviderPreferenceBlock(
			IStatusChangeListener context, IProject project,
			PreferenceKey[] allKeys, IWorkbenchPreferenceContainer container) {
		super(context, project, allKeys, container);
	}
	

	protected DLTKContributionExtensionManager getExtensionManager() {
		return CodeBlockProviderManager.getInstance();
	}


	protected String getSelectorGroupLabel() {
		return OctavePreferencesMessages.OctaveCodeBlockProviderPreferences_group;
	}


	protected String getSelectorNameLabel() {
		return OctavePreferencesMessages.OctaveCodeBlockProviderPreferences_name;
	}

	protected String getPreferenceLinkMessage() {
		return PreferencesMessages.SourceParsers_LinkToPreferences;
	}

}
