/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.ui.preferences;


import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.ui.PreferencesAdapter;
import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.AbstractSourceParserOptionsBlock;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.seisint.eclide.core.OctaveCoreConstants;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.core.OctclipsePlugin;


public class OctaveParserPreferencePage
    extends AbstractConfigurationBlockPropertyAndPreferencePage
{
    static PreferenceKey PARSER_KEY =
        new PreferenceKey(OctclipsePlugin.PLUGIN_ID, OctaveCoreConstants.SOURCE_PARSER);
    private static final String PREFERENCE_PAGE_ID =
        "org.seisint.eclide.ui.preferences.parser";
    private static final String PROPERTY_PAGE_ID = null;
    
    protected AbstractOptionsBlock createOptionsBlock(IStatusChangeListener context,
        IProject project, IWorkbenchPreferenceContainer container) {
        return new AbstractSourceParserOptionsBlock(context, project, getKeys(), container) {            
            protected String getNatureId() {
                return OctaveNature.NATURE_ID;
            }
            protected PreferenceKey getSavedContributionKey() {
                return PARSER_KEY;
            }
        };
    }

    /*
     * @see org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage#getHelpId()
     */
    protected String getHelpId() {
        return PREFERENCE_PAGE_ID;
    }

    /*
     * @see org.eclipse.dltk.internal.ui.preferences.PropertyAndPreferencePage#getPreferencePageId()
     */
    protected String getPreferencePageId() {
        return PREFERENCE_PAGE_ID;
    }

    /*
     * @see org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage#getProjectHelpId()
     */
    protected String getProjectHelpId() {
        return PROPERTY_PAGE_ID;
    }

    /*
     * @see org.eclipse.dltk.internal.ui.preferences.PropertyAndPreferencePage#getPropertyPageId()
     */
    protected String getPropertyPageId() {    	
        return PROPERTY_PAGE_ID;
    }
    
    /*
     * @see org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage#setDescription()
     */
    protected void setDescription()
    {
        setDescription(OctavePreferencesMessages.OctaveParserPreferencePage_description);
    }

    /*
     * @see org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPropertyAndPreferencePage#setPreferenceStore()
     */
    protected void setPreferenceStore() {
        setPreferenceStore(new PreferencesAdapter(OctclipsePlugin.getDefault().getPluginPreferences()));
    }

    private static PreferenceKey[] getKeys() {
        return new PreferenceKey[] { PARSER_KEY };
    }
}
