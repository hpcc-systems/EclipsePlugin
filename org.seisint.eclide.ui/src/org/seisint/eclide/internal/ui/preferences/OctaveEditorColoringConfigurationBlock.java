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
package org.seisint.eclide.internal.ui.preferences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import org.eclipse.dltk.internal.ui.editor.ScriptSourceViewer;
import org.eclipse.dltk.ui.preferences.AbstractScriptEditorColoringConfigurationBlock;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;
import org.eclipse.dltk.ui.preferences.PreferencesMessages;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.texteditor.ITextEditor;
import org.seisint.eclide.internal.ui.editor.OctaveDocumentSetupParticipant;
import org.seisint.eclide.internal.ui.text.SimpleOctaveSourceViewerConfiguration;
import org.seisint.eclide.ui.OctavePreferenceConstants;
import org.seisint.eclide.ui.text.OctavePartitions;


public class OctaveEditorColoringConfigurationBlock extends
		AbstractScriptEditorColoringConfigurationBlock implements
		IPreferenceConfigurationBlock {
	
	private static final String PREVIEW_FILE_NAME = "PreviewFile.txt";

	private static final String[][] fSyntaxColorListModel = new String[][] {
			{ OctavePreferencesMessages.OctaveEditorColoringConfigurationBlock_comment,
					OctavePreferenceConstants.EDITOR_SINGLE_LINE_COMMENT_COLOR,
					sCommentsCategory },					
			{ PreferencesMessages.DLTKEditorPreferencePage_keywords,
					OctavePreferenceConstants.EDITOR_KEYWORD1_COLOR, sCoreCategory },
			{ PreferencesMessages.DLTKEditorPreferencePage_keywords,
					OctavePreferenceConstants.EDITOR_KEYWORD2_COLOR, sCoreCategory },
			{ PreferencesMessages.DLTKEditorPreferencePage_keywords,
					OctavePreferenceConstants.EDITOR_KEYWORD3_COLOR, sCoreCategory },
			{ PreferencesMessages.DLTKEditorPreferencePage_keywords,
					OctavePreferenceConstants.EDITOR_KEYWORD4_COLOR, sCoreCategory },
			{ PreferencesMessages.DLTKEditorPreferencePage_keywords,
					OctavePreferenceConstants.EDITOR_KEYWORD5_COLOR, sCoreCategory },
			{ PreferencesMessages.DLTKEditorPreferencePage_keywords,
					OctavePreferenceConstants.EDITOR_KEYWORD6_COLOR, sCoreCategory },
			{ PreferencesMessages.DLTKEditorPreferencePage_strings,
					OctavePreferenceConstants.EDITOR_STRING_COLOR, sCoreCategory },
			{ PreferencesMessages.DLTKEditorPreferencePage_numbers,
					OctavePreferenceConstants.EDITOR_NUMBER_COLOR, sCoreCategory },
			{ OctavePreferencesMessages.OctaveEditorColoringConfigurationBlock_function,
					OctavePreferenceConstants.EDITOR_FUNCTION_COLOR, sCoreCategory },
			{ PreferencesMessages.DLTKEditorPreferencePage_CommentTaskTags,
					OctavePreferenceConstants.COMMENT_TASK_TAGS, sCommentsCategory } };
	

	public OctaveEditorColoringConfigurationBlock(OverlayPreferenceStore store) {
		super(store);
	}

	protected String[][] getSyntaxColorListModel() {
		return fSyntaxColorListModel;
	}

	protected ProjectionViewer createPreviewViewer(Composite parent,
			IVerticalRuler verticalRuler, IOverviewRuler overviewRuler,
			boolean showAnnotationsOverview, int styles, IPreferenceStore store) {
		return new ScriptSourceViewer(parent, verticalRuler, overviewRuler,
				showAnnotationsOverview, styles, store);
	}

	protected ScriptSourceViewerConfiguration createSimpleSourceViewerConfiguration(
			IColorManager colorManager, IPreferenceStore preferenceStore,
			ITextEditor editor, boolean configureFormatter) {
		return new SimpleOctaveSourceViewerConfiguration(colorManager,
				preferenceStore, editor, OctavePartitions.ECL_PARTITIONING, 
				configureFormatter);
	}

	protected void setDocumentPartitioning(IDocument document) {
		OctaveDocumentSetupParticipant participant = new OctaveDocumentSetupParticipant();
		participant.setup(document);
	}

	protected String getPreviewContent() {
		String line;
		String separator = System.getProperty("line.separator"); //$NON-NLS-1$
		StringBuffer buffer = new StringBuffer(512);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(getClass()
					.getResourceAsStream(PREVIEW_FILE_NAME)));
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
				buffer.append(separator);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
				}
			}
		}
		return buffer.toString();

	}
}
