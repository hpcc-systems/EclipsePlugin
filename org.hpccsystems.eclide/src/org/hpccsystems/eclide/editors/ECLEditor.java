/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.eclide.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class ECLEditor extends TextEditor {

	private ECLColorManager colorManager;

	public ECLEditor() {
		super();
		colorManager = new ECLColorManager();
		setSourceViewerConfiguration(new ECLConfiguration(colorManager));
		setDocumentProvider(new ECLDocumentProvider());
	}
	
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
}


