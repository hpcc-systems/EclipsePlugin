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
	
	private Table table; 
	private Result result;

	public static ResultViewer getDefault() {
		return resultViewer;
	}

	public ResultViewer() {
		resultViewer = this;
	}
	
	@Override
	public void createPartControl(Composite parent) {
		table = new Table(parent, SWT.VIRTUAL | SWT.FULL_SELECTION);
	    table.setLinesVisible(true);
	    table.setHeaderVisible(true);

	    TableColumn tc = new TableColumn(table, SWT.NONE);
		tc.setText("##");
		tc.setWidth(30);
		
		table.addListener(SWT.SetData, new Listener() {
			public void handleEvent(Event event) {
				TableItem item = (TableItem) event.item;
				int row = table.indexOf(item);
				item.setText(Integer.toString(row + 1));
				if (result != null) {
					for (int col = 1; col < table.getColumnCount(); ++col) {
						item.setText(col, result.getCell(row, col - 1));
					} 
				}
				if (row == 0) {
					for (TableColumn tc : table.getColumns()) 
				        tc.pack(); 
				}
			}
		});
	}
	
	String getUrl(String ip) {
		return "http://" + ip + ":8010/";
	}
	
	String getWuidUrl(String ip, String wuid) {
		return getUrl(ip) + "WsWorkunits/WUInfo?Wuid=" + wuid;
	}
	
	public void showWuid(final String ip, final String wuid, final String user, final String password) {
		showURL(getWuidUrl(ip, wuid), user, password);
	}

	public void showURL(final String url, final String user, final String password) {
	}

	public void showResult(final Result result) {
		table.setRedraw(false);
		table.setItemCount(0);
		this.result = null;
		while (table.getColumnCount() > 1 ) { 
		    table.getColumns()[1].dispose(); 
		} 
		this.result = result;

		for (int i = 0; i < result.getColumnCount(); ++i) {
		    TableColumn tc = new TableColumn(table, SWT.NONE, i + 1);
		    tc.setText(result.getColumnName(i));
		    tc.setWidth(120);
		}
		table.setItemCount(result.getTotal().intValue());
		table.setRedraw(true);
		resultViewer.getSite().getPage().bringToTop(resultViewer);
	}

	@Override
	public void setFocus() {
		table.setFocus();
	}
}
