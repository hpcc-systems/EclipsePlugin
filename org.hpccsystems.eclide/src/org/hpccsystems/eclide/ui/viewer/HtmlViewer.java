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
				browser.setUrl(url, user, password);
				if (bringToTop)
					htmlViewer.getSite().getPage().bringToTop(htmlViewer);
			//}   
		//});
	}
	
	public static String stringToHTMLString(String string) {
	    StringBuffer sb = new StringBuffer(string.length());
	    // true if last char was blank
	    boolean lastWasBlankChar = false;
	    int len = string.length();
	    char c;

	    for (int i = 0; i < len; i++)
	        {
	        c = string.charAt(i);
	        if (c == ' ') {
	            // blank gets extra work,
	            // this solves the problem you get if you replace all
	            // blanks with &nbsp;, if you do that you loss 
	            // word breaking
	            if (lastWasBlankChar) {
	                lastWasBlankChar = false;
	                sb.append("&nbsp;");
	                }
	            else {
	                lastWasBlankChar = true;
	                sb.append(' ');
	                }
	            }
	        else {
	            lastWasBlankChar = false;
	            //
	            // HTML Special Chars
	            if (c == '"')
	                sb.append("&quot;");
	            else if (c == '&')
	                sb.append("&amp;");
	            else if (c == '<')
	                sb.append("&lt;");
	            else if (c == '>')
	                sb.append("&gt;");
	            else if (c == '\n')
	                // Handle Newline
	                sb.append("&lt;br/&gt;");
	            else {
	                int ci = 0xffff & c;
	                if (ci < 160 )
	                    // nothing special only 7 Bit
	                    sb.append(c);
	                else {
	                    // Not 7 Bit use the unicode system
	                    sb.append("&#");
	                    sb.append(new Integer(ci).toString());
	                    sb.append(';');
	                    }
	                }
	            }
	        }
	    return sb.toString();
	}
	
	@Override
	public void setFocus() {
		browser.setFocus();
	}
}
