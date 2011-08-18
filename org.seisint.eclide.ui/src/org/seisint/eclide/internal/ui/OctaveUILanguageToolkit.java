/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.ui;


import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.ui.AbstractDLTKUILanguageToolkit;
import org.eclipse.dltk.ui.ScriptElementLabels;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.dltk.ui.viewsupport.ScriptUILabelProvider;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.preference.IPreferenceStore;
import org.seisint.eclide.core.OctaveLanguageToolkit;
import org.seisint.eclide.internal.ui.text.SimpleOctaveSourceViewerConfiguration;
import org.seisint.eclide.ui.text.OctavePartitions;

public class OctaveUILanguageToolkit extends AbstractDLTKUILanguageToolkit {

	private static ScriptElementLabels sInstance = new ScriptElementLabels() {
	};

	public ScriptElementLabels getScriptElementLabels() {
		return sInstance;
	}
	
	public IPreferenceStore getPreferenceStore() {
		return OctclipseUIPlugin.getDefault().getPreferenceStore();
	}
	
	public IDLTKLanguageToolkit getCoreToolkit() {
		return OctaveLanguageToolkit.getDefault();
	}
	
	public IDialogSettings getDialogSettings() {
		return OctclipseUIPlugin.getDefault().getDialogSettings();
	}
	
	public String getEditorId(Object inputElement) {
		return "org.seisint.eclide.ui.editor.OctaveEditor";
	}

	public String getInterpreterContainerId() {
		return "net.sf.debug.launching.INTERPRETER_CONTAINER";
	}
	
	public String getPartitioningId() {
		return OctavePartitions.ECL_PARTITIONING;
	}

	public ScriptUILabelProvider createScripUILabelProvider() {
		return null;
	}
	
	public boolean getProvideMembers(ISourceModule element) {
		return true;
	}

	public ScriptTextTools getTextTools() {
		return OctclipseUIPlugin.getDefault().internalgetTextTools();
	}

	public ScriptSourceViewerConfiguration createSourceViewerConfiguration() {
		return new SimpleOctaveSourceViewerConfiguration(
                getTextTools().getColorManager(), getPreferenceStore(), null, getPartitioningId(),
                false);
	}

	private static final String INTERPRETERS_PREFERENCE_PAGE_ID = "net.sf.ui.preferences.interpreters";
	
	private static final String DEBUG_PREFERENCE_PAGE_ID = "org.seisint.eclide.preferences.debug";
	
	public String getInterpreterPreferencePage() {
		return INTERPRETERS_PREFERENCE_PAGE_ID;
	}
	
	public String getDebugPreferencePage() {
		return DEBUG_PREFERENCE_PAGE_ID;
	}
	
	private static final String[] EDITOR_PREFERENCE_PAGES_IDS = {
		"org.seisint.eclide.ui.preferences.editor", 
		"org.seisint.eclide.ui.preferences.editor.templates", 
		"org.seisint.eclide.ui.preferences.editor.syntaxcoloring", 
		"org.seisint.eclide.ui.preferences.editor.hovers", 
		"org.seisint.eclide.ui.preferences.editor.smarttyping", 
		"org.seisint.eclide.ui.preferences.editor.folding", 
	};
	
	public String[] getEditorPreferencePages() {
		return EDITOR_PREFERENCE_PAGES_IDS;
	}
	
}
