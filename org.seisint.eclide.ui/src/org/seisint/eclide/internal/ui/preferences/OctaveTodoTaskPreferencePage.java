package org.seisint.eclide.internal.ui.preferences;


import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.ui.PreferencesAdapter;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.TodoTaskOptionsBlock;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.core.OctclipsePlugin;

public class OctaveTodoTaskPreferencePage extends AbstractConfigurationBlockPropertyAndPreferencePage {

	protected void setDescription() {
		setDescription(OctavePreferencesMessages.OctaveTodoTaskPreferencePage_description);
	}
 
	protected String getHelpId() {
		return null;
	}
 
    protected AbstractOptionsBlock createOptionsBlock(IStatusChangeListener newStatusChangedListener, IProject project,
            IWorkbenchPreferenceContainer container) {
		return new TodoTaskOptionsBlock(newStatusChangedListener, project,
				container, OctclipsePlugin.PLUGIN_ID);
    }
 
    protected String getNatureId() {
        return OctaveNature.NATURE_ID;
    }
 
    protected void setPreferenceStore() {
    	setPreferenceStore(new PreferencesAdapter(OctclipsePlugin.getDefault().getPluginPreferences()));
    }
 
    protected String getPreferencePageId() {
    	return "org.seisint.eclide.ui.preferences.todo";
    }
 
    protected String getPropertyPageId() {
    	return "org.seisint.eclide.ui.propertyPage.todo";
    }

	protected String getProjectHelpId() {
		return null;
	}

}
