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
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;

public class HtmlViewer extends ViewPart {
	public static final String PI_UI_HTMLVIEW = "org.hpccsystems.eclide.htmlView";
	
	private static HtmlViewer htmlViewer = null;
	
	private BrowserEx browser;

	public static HtmlViewer getDefault() {
		return htmlViewer;
	}

	public HtmlViewer() {
		htmlViewer = this;
	}
	
	@Override
	public void createPartControl(Composite parent) {
		browser = new BrowserEx(parent);
	}
	
	String getUrl(String ip) {
		return "http://" + ip + ":8010/";
	}
	
	String getWuidUrl(String ip, String wuid) {
		return getUrl(ip) + "WsWorkunits/WUInfo?Wuid=" + wuid;
	}
	
	public void showWuid(final String ip, final String wuid, final String user, final String password, final boolean bringToTop) {
		showURL(getWuidUrl(ip, wuid), user, password, bringToTop);
	}

	public void showURL(final String url, final String user, final String password, final boolean bringToTop) {
		//Display.getDefault().asyncExec(new Runnable() {   
			//public void run() {
				browser.navigateTo(url, user, password);
				if (bringToTop)
					htmlViewer.getSite().getPage().bringToTop(htmlViewer);
			//}   
		//});
	}
	@Override
	public void setFocus() {
		browser.setFocus();
	}
}
