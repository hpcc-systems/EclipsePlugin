package org.hpccsystems.eclide.ui.viewer;

import java.util.Queue;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.AuthenticationEvent;
import org.eclipse.swt.browser.AuthenticationListener;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressAdapter;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class BrowserEx extends Composite {
	private String url;
	private String user;
	private String password;
	
	private Browser browser;
	private boolean loading = false;
	

	public BrowserEx(Composite parent) {
		super(parent, SWT.NONE);
		
		GridLayout layout = new GridLayout(4, false);
		setLayout(layout);

		final Button backButton = new Button(this, SWT.PUSH);
		backButton.setText("Back");
		backButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				browser.back();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		final Button forwardButton = new Button(this, SWT.PUSH);
		forwardButton.setText("Forward");
		forwardButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
				browser.forward();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		final Combo comboUrl = new Combo(this, SWT.SINGLE | SWT.READ_ONLY | SWT.BORDER);
		GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
		comboUrl.setLayoutData(layoutData);
		comboUrl.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				browser.setUrl(comboUrl.getItem(comboUrl.getSelectionIndex()));
			}
		});	

		Button refreshButton = new Button(this, SWT.PUSH);
		refreshButton.setText("Refresh");
		refreshButton.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
//				navigateTo(url, user, password);
				browser.setUrl(comboUrl.getItem(comboUrl.getSelectionIndex()));
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

	void navigateTo(final String url) {
		navigateTo(url, "", "");
	}	

	void navigateTo(final String url, final String user, final String password) {
		this.url = url;
		this.user = user;
		this.password = password;
		
		browser.addProgressListener(new ProgressAdapter() {
			public void completed(ProgressEvent event) {
				browser.removeProgressListener(this);
				browser.setUrl(url);
			}
		});
		browser.setText("<html><body><h3>Loading (" + this.url + ")...</h3></body></html>");
	}	
}
