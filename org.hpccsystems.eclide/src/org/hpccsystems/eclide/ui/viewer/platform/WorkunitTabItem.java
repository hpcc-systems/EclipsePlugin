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
package org.hpccsystems.eclide.ui.viewer.platform;

import java.util.Observable;
import java.util.Observer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.hpccsystems.eclide.resources.Messages;
import org.hpccsystems.eclide.ui.viewer.BrowserEx;
import org.hpccsystems.eclide.ui.viewer.TableEx;
import org.hpccsystems.eclide.ui.viewer.TextEx;
import org.hpccsystems.internal.data.Result;
import org.hpccsystems.internal.data.Workunit;

public class WorkunitTabItem extends CTabItem implements Observer {

	Workunit workunit;
	WorkunitView wuView;

	CTabFolder detailsContainer;

	CTabItem browserTab;
	private BrowserEx browser;
	CTabItem textTab;
	private TextEx text;

	public WorkunitTabItem(CTabFolder parent, int style, int index, WorkunitView wuti) {
		super(parent, style, index);
		workunit = wuti.getWorkunit();

		wuView = wuti;
		wuView.getWorkunit().addObserver(this);

		parent.setLayout(new FillLayout());

		detailsContainer = new CTabFolder(parent, SWT.BOTTOM);

		browserTab = new CTabItem(detailsContainer, SWT.NONE);
		browser = new BrowserEx(detailsContainer, false);
		browserTab.setControl(browser);
		browserTab.setText(Messages.WorkunitTabItem_0);

		textTab = new CTabItem(detailsContainer, SWT.NONE);
		text = new TextEx(detailsContainer);
		textTab.setControl(text);
		textTab.setText(Messages.WorkunitTabItem_1);

		setText(wuView.getText());
		setImage(wuView.getImage());

		setControl(detailsContainer);

		detailsContainer.setTabHeight(0);
	}

	public Workunit getWorkunit() {
		return workunit;
	}

	public WorkunitView getWorkunitView() {
		return wuView;
	}

	public void navigateTo(String url, String user, String password) {
		browser.setUrl(null, url, user, password);
		detailsContainer.setSelection(browserTab);
	}

	public void setQuery(String query) {
		text.setText(query);
		//table.setResult(result);
		detailsContainer.setSelection(textTab);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		Display.getDefault().asyncExec(new Runnable() {   
			@Override
			public void run() {
				setText(wuView.getText());
				setImage(wuView.getImage());
			}
		});
	}
}

