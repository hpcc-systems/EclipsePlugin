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

import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.browser.AuthenticationEvent;
import org.eclipse.swt.browser.AuthenticationListener;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.ProgressAdapter;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.ui.tree.ItemView;

public class BrowserEx extends Composite {

	private String user;
	private String password;
	private Browser browser;
	private ItemView previousTreeItem;
	private ItemView nextTreeItem;
	private String nextUrl;
	
	Combo comboUrl = null;

	public BrowserEx(Composite parent, boolean showAddressBar) {
		super(parent, SWT.NONE);

		GridLayout layout = new GridLayout(4, false);
		setLayout(layout);

		if (showAddressBar) {
			final Button backButton = new Button(this, SWT.PUSH);
			backButton.setImage(Activator.getImage("icons/left.png")); //$NON-NLS-1$
			backButton.setToolTipText(Messages.BrowserEx_1);
			backButton.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (browser != null) {
						browser.back();
					}
				}
	
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
	
			final Button forwardButton = new Button(this, SWT.PUSH);
			forwardButton.setImage(Activator.getImage("icons/right.png")); //$NON-NLS-1$
			forwardButton.setToolTipText(Messages.BrowserEx_3);
			forwardButton.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (browser != null) {
						browser.forward();
					}
				}
	
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
	
			comboUrl = new Combo(this, SWT.SINGLE | SWT.BORDER);
			GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
			comboUrl.setLayoutData(layoutData);
	
			Button refreshButton = new Button(this, SWT.PUSH);
			refreshButton.setImage(Activator.getImage("icons/refresh.png")); //$NON-NLS-1$
			refreshButton.setToolTipText(Messages.BrowserEx_5);
			refreshButton.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					//				navigateTo(url, user, password);
					if (browser != null) {
						browser.setUrl(comboUrl.getText());
					}
				}
	
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
		}

		try {
			browser = new Browser(this, SWT.BORDER);
		} catch (IllegalArgumentException e) {
			browser = null;
			org.hpccsystems.eclide.Activator.log(Messages.BrowserEx_6, e);
		} catch (SWTException e) {
			browser = null;
			org.hpccsystems.eclide.Activator.log(Messages.BrowserEx_7, e);
		} catch (SWTError e) {
			browser = null;
			org.hpccsystems.eclide.Activator.log(Messages.BrowserEx_8 + e.getMessage());
		}
		if (browser != null) {
			GridData layoutData = new GridData(GridData.FILL_BOTH);
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
			browser.addLocationListener(new LocationListener() {
				@Override
				public void changing(LocationEvent event) {
				}

				@Override
				public void changed(LocationEvent event) {
					if (nextTreeItem != null && event.location.equals(nextUrl)) {
						previousTreeItem = nextTreeItem;
						nextTreeItem = null;
					} else if (previousTreeItem != null) {
						previousTreeItem.refresh();
						previousTreeItem = null;
					}
				}
			});

			setUrl(null, "about:blank"); //$NON-NLS-1$

			if (showAddressBar) {
				browser.addProgressListener(new ProgressAdapter() {
					@Override
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
		} else {
			SWTFactory.createLabel(this, Messages.BrowserEx_10, 1);
		}
	}

	void setUrl(ItemView treeItem, String url) {
		setUrl(treeItem, url, "", ""); //$NON-NLS-1$ //$NON-NLS-2$
	}	

	public void setUrl(ItemView treeItem, String url, String user, String password) {
		previousTreeItem = null;
		this.user = user;
		this.password = password;

		nextUrl = url;
		nextTreeItem = treeItem;
		if (browser != null) {
			browser.setUrl(url);
	
			/*  TODO:  We may want some URL parsing to help tree refreshing  --- 
			int ipPos = url.indexOf("http://");
			if (ipPos >= 0) {
				ipPos += 7;
				StringBuilder ipsb = new StringBuilder();
				for (int i = ipPos; i < url.length(); ++i) {
					char c = url.charAt(i);
					if (c == '.' || Character.isDigit(c)) {
						ipsb.append(url.charAt(i));
					} else {
						break;
					}
				}
	
				Platform p = Data.get().GetPlatformNoCreate(ipsb.toString());
				if (p != null) {
					int wuidPos = url.indexOf("Wuid=");
					if (wuidPos >= 0) {
						wuidPos += 5;
						StringBuilder wuidsb = new StringBuilder(url.substring(wuidPos, wuidPos + 16));
						for (int i = wuidPos + 16; i < url.length(); ++i) {
							char c = url.charAt(i);
							if (c == '-' || Character.isDigit(c)) {
								wuidsb.append(url.charAt(i));
							} else {
								break;
							}
						}
						String wuid =  wuidsb.toString();
						//previousWU = p.getWorkunit(wuid);
					}
				}
			}
			 */
		}
	}	
}
