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
package org.hpccsystems.eclide.ui.viewer;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.hpccsystems.internal.data.Result;

public class ResultViewer extends ViewPart {
	public static final String PI_UI_RESULTVIEW = "org.hpccsystems.eclide.resultView";
	
	private static ResultViewer resultViewer = null;
	
	private TableEx table; 

	public static ResultViewer getDefault() {
		return resultViewer;
	}

	public ResultViewer() {
		resultViewer = this;
	}
	
	@Override
	public void createPartControl(Composite parent) {
		table = new TableEx(parent);
	}

	public void showResult(final Result result) {
		table.setResult(result);
		resultViewer.getSite().getPage().bringToTop(resultViewer);
	}

	@Override
	public void setFocus() {
		table.setFocus();
	}
}
