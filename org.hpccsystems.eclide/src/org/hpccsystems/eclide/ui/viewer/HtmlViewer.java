package org.hpccsystems.eclide.ui.viewer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.AuthenticationEvent;
import org.eclipse.swt.browser.AuthenticationListener;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressAdapter;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;

public class HtmlViewer extends ViewPart {
	public static final String PI_UI_HTMLVIEW = "org.hpccsystems.eclide.htmlView";
	
	private static HtmlViewer htmlViewer = null;
	
	private Browser browser;
	private String user;
	private String password;

	public static HtmlViewer getDefault() {
		return htmlViewer;
	}

	public HtmlViewer() {
		htmlViewer = this;
	}
	
	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, SWT.NULL);
		browser.addAuthenticationListener(new AuthenticationListener() {
			public void authenticate(AuthenticationEvent event) {
				event.user = user;
				event.password = password;
			}
		});
		display();
	}
	
	void display()
	{
		browser.setUrl("about:blank");
	}
	
	String getUrl(String ip) {
		return "http://" + ip + ":8010/";
	}
	
	String getWuidUrl(String ip, String wuid) {
		return getUrl(ip) + "WsWorkunits/WUInfo?Wuid=" + wuid;
	}
	
	public void showWuid(final String ip, final String wuid, String user, String password) {
		this.user = user;
		this.password = password;
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {
				browser.addProgressListener(new ProgressAdapter() {
					public void completed(ProgressEvent event) {
						browser.removeProgressListener(this);
						browser.setUrl(getWuidUrl(ip, wuid));
					}
				});
				browser.setText("<html><body><h3>Loading (" + getWuidUrl(ip, wuid) + ")...</h3></body></html>");
			}   
		});
	}

	@Override
	public void setFocus() {
		browser.setFocus();
	}
}
