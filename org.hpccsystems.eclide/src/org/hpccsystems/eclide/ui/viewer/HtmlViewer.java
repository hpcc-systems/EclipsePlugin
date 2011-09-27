package org.hpccsystems.eclide.ui.viewer;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.preferences.PreferenceConstants;

public class HtmlViewer extends ViewPart {
	private static HtmlViewer htmlViewer = null;
	
	private Browser browser;
	private IPreferenceStore store;
	private boolean executeRemotely;
	private String serverIP;

	IPropertyChangeListener listener = new IPropertyChangeListener() {
		@Override
		public void propertyChange(PropertyChangeEvent event) {
			if (event.getProperty().equals(PreferenceConstants.P_REMOTEEXECUTE)) {
				executeRemotely = store.getBoolean(PreferenceConstants.P_REMOTEEXECUTE);
				display();
			}
		}
	};	
	
	public static HtmlViewer getDefault() {
		return htmlViewer;
	}

	public HtmlViewer() {
		htmlViewer = this;
	}
	
	public void dispose() {
		store.removePropertyChangeListener(listener);
		super.dispose();
	}

	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, SWT.NULL);
		store = Activator.getDefault().getPreferenceStore();
		executeRemotely = store.getBoolean(PreferenceConstants.P_REMOTEEXECUTE);
		serverIP = store.getString(PreferenceConstants.P_SERVERIP);
		store.addPropertyChangeListener(listener);
		display();
	}
	
	void display()
	{
		if (executeRemotely) {
			browser.setUrl(getUrl());
		} else {
			browser.setUrl("about:blank");
		}
	}
	
	String getUrl() {
		return "http://" + serverIP + ":8010/";
	}
	
	String getWuidUrl(String wuid) {
		return getUrl() + "WsWorkunits/WUInfo?Wuid=" + wuid;
	}
	
	public void showWuid(String wuid) {
		browser.setUrl(getWuidUrl(wuid));
	}

	@Override
	public void setFocus() {
		browser.setFocus();
	}
}
