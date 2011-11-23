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
import org.eclipse.swt.browser.AuthenticationEvent;
import org.eclipse.swt.browser.AuthenticationListener;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressAdapter;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.hpccsystems.eclide.Activator;

public class BrowserEx extends Composite {

	private String user;
	private String password;
	private Browser browser;
	
	public BrowserEx(Composite parent) {
		super(parent, SWT.NONE);
		
		GridLayout layout = new GridLayout(4, false);
		setLayout(layout);

		final Button backButton = new Button(this, SWT.PUSH);
		backButton.setImage(Activator.getImage("icons/left.png"));
		backButton.setToolTipText("Back");
		backButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				browser.back();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		final Button forwardButton = new Button(this, SWT.PUSH);
		forwardButton.setImage(Activator.getImage("icons/right.png"));
		forwardButton.setToolTipText("Forward");
		forwardButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				browser.forward();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		final Combo comboUrl = new Combo(this, SWT.SINGLE | SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		comboUrl.setLayoutData(layoutData);

		Button refreshButton = new Button(this, SWT.PUSH);
		refreshButton.setImage(Activator.getImage("icons/refresh.png"));
		refreshButton.setToolTipText("Refresh");
		refreshButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
//				navigateTo(url, user, password);
				browser.setUrl(comboUrl.getText());
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		browser = new Browser(this, SWT.BORDER);
		layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.horizontalSpan = 4;
		layoutData.verticalSpan = 1;
		browser.setLayoutData(layoutData);
    	browser.addAuthenticationListener(new AuthenticationListener() {
			
			@Override
			public void authenticate(AuthenticationEvent event) {
				// TODO Auto-generated method stub
				event.user = user;
				event.password = password;
			}
		});

    	navigateTo("about:blank");

		browser.addProgressListener(new ProgressAdapter() {
			public void completed(ProgressEvent event) {
				String url = browser.getUrl();
				for (int i = 0; i < comboUrl.getItemCount(); ++i)
				{
					if (comboUrl.getItem(i).equalsIgnoreCase(url)) {
						comboUrl.select(i);
						return;
					}
				}
				comboUrl.add(browser.getUrl(), 0);
				comboUrl.select(0);
			}
		});
	}

	void navigateTo(String url) {
		navigateTo(url, "", "");
	}	

	void navigateTo(String url, String user, String password) {
		this.user = user;
		this.password = password;
		browser.setUrl(url);
	}	
}
