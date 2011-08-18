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
package org.seisint.eclide.internal.ui.templates;


import org.eclipse.dltk.ui.templates.ScriptTemplateAccess;
import org.eclipse.dltk.ui.templates.ScriptTemplatePreferencePage;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.jface.text.IDocument;
import org.seisint.eclide.internal.ui.OctclipseUIPlugin;
import org.seisint.eclide.internal.ui.text.OctaveTextTools;
import org.seisint.eclide.internal.ui.text.SimpleOctaveSourceViewerConfiguration;
import org.seisint.eclide.ui.text.OctavePartitions;

public class OctaveTemplatePreferencePage extends ScriptTemplatePreferencePage {

	protected ScriptSourceViewerConfiguration createSourceViewerConfiguration() {
		return new SimpleOctaveSourceViewerConfiguration(
				getTextTools().getColorManager(), getPreferenceStore(), null,
				OctavePartitions.ECL_PARTITIONING, false);
	}

	protected void setDocumentParticioner(IDocument document) {
		getTextTools().setupDocumentPartitioner(document,
				OctavePartitions.ECL_PARTITIONING);
	}

	protected ScriptTemplateAccess getTemplateAccess() {
		return OctaveTemplateAccess.getInstance();
	}
	
	protected void setPreferenceStore() {
		setPreferenceStore(OctclipseUIPlugin.getDefault().getPreferenceStore());
		
	}
	
	private OctaveTextTools getTextTools() {
		return OctclipseUIPlugin.getDefault().getTextTools();
	}
	
}
