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
package org.seisint.eclide.internal.ui.text;


import org.eclipse.dltk.ui.editor.highlighting.ISemanticHighlighter;
import org.eclipse.dltk.ui.editor.highlighting.SemanticHighlighting;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.ui.texteditor.ITextEditor;
import org.seisint.eclide.ui.text.OctavePartitions;

public class OctaveTextTools extends ScriptTextTools {

	private IPartitionTokenScanner fPartitionScanner;
	
	private final static String[] LEGAL_CONTENT_TYPES = new String[] {
		OctavePartitions.ECL_STRING,
		OctavePartitions.ECL_COMMENT
	};
	
	public OctaveTextTools(boolean autoDisposeOnDisplayDispose) {
		super(OctavePartitions.ECL_PARTITIONING, LEGAL_CONTENT_TYPES, autoDisposeOnDisplayDispose);
		fPartitionScanner = new OctavePartitionScanner();
	}

	public ScriptSourceViewerConfiguration createSourceViewerConfiguraton(
			IPreferenceStore preferenceStore, ITextEditor editor,
			String partitioning) {
		return new OctaveSourceViewerConfiguration(getColorManager(), 
				preferenceStore, editor, partitioning);
	}

	public IPartitionTokenScanner getPartitionScanner() {
		return fPartitionScanner;
	}

	public SemanticHighlighting[] getSemanticHighlightings() {
		return new SemanticHighlighting[0];
	}

//	public ISemanticHighlighter getSemanticPositionUpdater() {
	//	return null;
	//}

}
