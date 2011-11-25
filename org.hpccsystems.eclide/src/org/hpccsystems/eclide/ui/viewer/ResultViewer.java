/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

package org.hpccsystems.eclide.ui.viewer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
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
		table = new TableEx(parent, SWT.VIRTUAL | SWT.FULL_SELECTION);
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
