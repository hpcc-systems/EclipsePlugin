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
	
	public void showWuid(final String ip, final String wuid, final String user, final String password) {
		showURL(getWuidUrl(ip, wuid), user, password);
	}

	public void showURL(final String url, final String user, final String password) {
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {
				browser.navigateTo(url, user, password);
				htmlViewer.getSite().getPage().bringToTop(htmlViewer);
			}   
		});
	}
	@Override
	public void setFocus() {
		browser.setFocus();
	}
}
