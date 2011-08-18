package org.seisint.eclide.internal.debug.ui;


import org.eclipse.dltk.debug.ui.AbstractDebugUILanguageToolkit;
import org.eclipse.jface.preference.IPreferenceStore;
import org.seisint.eclide.debug.OctaveDebugConstants;

public class OctaveDebugUILanguageToolkit extends
		AbstractDebugUILanguageToolkit {

	/*
	 * @see org.eclipse.dltk.debug.ui.IDLTKDebugUILanguageToolkit#getDebugModelId()
	 */
	public String getDebugModelId() {
		return OctaveDebugConstants.DEBUG_MODEL_ID;
	}
	
	/*
	 * @see org.eclipse.dltk.debug.ui.IDLTKDebugUILanguageToolkit#getPreferenceStore()
	 */
	public IPreferenceStore getPreferenceStore() {
		return OctclipseDebugUIPlugin.getDefault().getPreferenceStore();
	}

	/*
	 * @see org.eclipse.dltk.debug.ui.AbstractDebugUILanguageToolkit#getVariablesViewPreferencePages()
	 */
	public String[] getVariablesViewPreferencePages() {
		return new String[] {"org.seisint.eclide.preferences.debug.detailFormatters"};
	}
}
