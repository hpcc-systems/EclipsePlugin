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
package org.seisint.eclide.internal.ui.editor;


import org.eclipse.core.filebuffers.IDocumentSetupParticipant;
import org.eclipse.jface.text.IDocument;
import org.seisint.eclide.internal.ui.OctclipseUIPlugin;
import org.seisint.eclide.internal.ui.text.OctaveTextTools;
import org.seisint.eclide.ui.text.OctavePartitions;

public class OctaveDocumentSetupParticipant implements
		IDocumentSetupParticipant {

	public void setup(IDocument document) {
		OctaveTextTools tools = OctclipseUIPlugin.getDefault().getTextTools();
		tools.setupDocumentPartitioner(document,
				OctavePartitions.ECL_PARTITIONING);	
	}

}
