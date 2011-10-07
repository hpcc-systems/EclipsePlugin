package org.hpccsystems.eclide.ui.viewer;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.preferences.ECLPreferenceConstants;

public class HtmlViewer extends ViewPart {
	private static HtmlViewer htmlViewer = null;
	
	private Browser browser;
	private String ip;
	private String wuid;

	public static HtmlViewer getDefault() {
		return htmlViewer;
	}

	public HtmlViewer() {
		htmlViewer = this;
	}
	
	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, SWT.NULL);
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
	
	public void showWuid(final String ip, final String wuid) {
//		notifyIP = ip;
//		notifyWUID = wuid;
//		Post
//		Invalidate()
//		browser.no
		this.ip = ip;
		this.wuid = wuid;
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {   
			browser.setUrl(getWuidUrl(ip, wuid));
			}   
		});
	}

	@Override
	public void setFocus() {
		browser.setFocus();
	}
}
