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

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.hpccsystems.internal.data.Result;

public class TableEx extends Composite {

	private Table table;
	private Result result;

	public TableEx(Composite parent) {
		super(parent, SWT.NONE);

		FillLayout layout = new FillLayout();
		setLayout(layout);

		table = new Table(this, SWT.VIRTUAL | SWT.FULL_SELECTION);

		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		TableColumn tc = new TableColumn(table, SWT.NONE);
		tc.setText("##");
		tc.setWidth(30);

		table.addListener(SWT.SetData, new Listener() {
			@Override
			public void handleEvent(Event event) {
				TableItem item = (TableItem) event.item;
				int row = table.indexOf(item);
				item.setText(Integer.toString(row + 1));
				if (result != null) {
					for (int col = 1; col < table.getColumnCount(); ++col) {
						item.setText(col, result.getCell(row, col - 1));
					} 
				}
				table.setRedraw(false);
				if (row == 0) {
					for (TableColumn tc : table.getColumns()) 
						tc.pack(); 
				}
				table.setRedraw(true);
			}
		});
	}

	public void setResult(Result _result) {
		if (_result == null)
			return;

		table.setRedraw(false);
		table.setItemCount(0);
		result = null;
		while (table.getColumnCount() > 1 ) { 
			table.getColumns()[1].dispose(); 
		} 
		result = _result;

		for (int i = 0; i < result.getColumnCount(); ++i) {
			TableColumn tc = new TableColumn(table, SWT.NONE, i + 1);
			tc.setText(result.getColumnName(i));
			tc.setWidth(120);
		}
		table.setItemCount(result.getTotal().intValue());
		table.setRedraw(true);
	}

	@Override
	public boolean setFocus() {
		return table.setFocus();		
	}

	public Table getControl() {
		return table;
	}
}
