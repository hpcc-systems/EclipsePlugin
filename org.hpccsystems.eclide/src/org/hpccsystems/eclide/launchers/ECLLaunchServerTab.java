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
package org.hpccsystems.eclide.launchers;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.browser.AuthenticationEvent;
import org.eclipse.swt.browser.AuthenticationListener;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.CloseWindowListener;
import org.eclipse.swt.browser.ProgressAdapter;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.WindowEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.ECLLaunchConfigurationTab;
import org.hpccsystems.internal.data.Platform;

public class ECLLaunchServerTab extends ECLLaunchConfigurationTab {

	private class WidgetListener extends SelectionAdapter implements ModifyListener {
		@Override
		public void modifyText(ModifyEvent e) {
			scheduleUpdateJob();
			Object source= e.getSource();
			if (source == fIPText) {
				refreshAddress();
			} else if (source == fPortText) {
				refreshAddress();
			} else if (source == fAddressText) {
			}
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			Object source= e.getSource();
			if (source == testButton) {
				refreshBrowser();
			} else if (source == disableButton) {
				scheduleUpdateJob();
			}
		}
	}

	private WidgetListener fListener;

	Image image;

	private Button disableButton;
	protected Text fIPText;
	protected Text fPortText;
	protected Text fClusterText;

	protected Text fUserText;
	protected Text fPasswordText;

	protected Text fAddressText;
	private Button testButton;
	private Browser browser;
	
	ECLLaunchServerTab() {
		fListener = new WidgetListener();
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		return super.isValid(launchConfig);
	}

	protected void createServerEditor(Composite parent) {
		disableButton = SWTFactory.createCheckButton(parent, "Disable Server", null, false, 1);
		disableButton.addSelectionListener(fListener);

		Group group = SWTFactory.createGroup(parent, "Server:", 2, 1, GridData.FILL_HORIZONTAL);
		SWTFactory.createLabel(group, "IP Address:  ", 1);
		fIPText = SWTFactory.createSingleText(group, 1);
		fIPText.addModifyListener(fListener);

		SWTFactory.createLabel(group, "Port:  ", 1);
		fPortText = SWTFactory.createSingleText(group, 1);
		fPortText.addModifyListener(fListener);

		SWTFactory.createLabel(group, "Target:  ", 1);
		fClusterText = SWTFactory.createSingleText(group, 1);
		fClusterText.addModifyListener(fListener);
	}

	protected void createCredentialsEditor(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Credentials:", 2, 1, GridData.FILL_HORIZONTAL);
		SWTFactory.createLabel(group, "User:  ", 1);
		fUserText = SWTFactory.createSingleText(group, 1);
		fUserText.addModifyListener(fListener);

		SWTFactory.createLabel(group, "Password:  ", 1);
		fPasswordText = SWTFactory.createText(group, SWT.SINGLE | SWT.BORDER | SWT.PASSWORD, 1);
		fPasswordText.addModifyListener(fListener);
	}

	protected Browser createBrowser(final Composite parent) {
		final Group group = SWTFactory.createGroup(parent, "ECL Watch:", 3, 1, GridData.FILL_BOTH);
		SWTFactory.createLabel(group, "Address:  ", 1);
		fAddressText = SWTFactory.createSingleText(group, 1);
		fAddressText.addModifyListener(fListener);
		testButton = SWTFactory.createPushButton(group, "Test", null);
		testButton.addSelectionListener(fListener);

		try {
			browser = new Browser(group, SWT.BORDER);
		} catch (IllegalArgumentException e) {
			browser = null;
			org.hpccsystems.eclide.Activator.log("Failed to create Browser Control", e);
		} catch (SWTException e) {
			browser = null;
			org.hpccsystems.eclide.Activator.log("Failed to create Browser Control", e);
		} catch (SWTError e) {
			browser = null;
			org.hpccsystems.eclide.Activator.log("Failed to create Browser Control");
		}
		if (browser != null) {
			browser.setUrl("about:blank");
			GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
			gd.horizontalSpan = 3;
			browser.setLayoutData(gd);
			browser.addCloseWindowListener(new CloseWindowListener() {
				@Override
				public void close(WindowEvent event) {
					group.dispose();
					final Browser newBrowser = createBrowser(parent);
					parent.pack();
					refreshAddress();
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							newBrowser.setText("<html><body><h3>Authentication Failed...</h3></body></html>");
						}
					});
				}
			});
			browser.addAuthenticationListener(new AuthenticationListener() {
				@Override
				public void authenticate(AuthenticationEvent event) {
					// TODO Auto-generated method stub
					event.user = fUserText.getText();
					event.password = fPasswordText.getText();
				}
			});
		} else {
			SWTFactory.createLabel(group, "Warning:  Failed to create Web Browser, see Error Log for further details.", 3);
		}
		return browser;
	}

	@Override
	public final void createControl(Composite parent) {
		Composite projComp = SWTFactory.createComposite(parent, parent.getFont(), 1, 1, GridData.FILL_BOTH); 
		((GridLayout)projComp.getLayout()).verticalSpacing = 0;

		createVerticalSpacer(projComp, 1);
		createServerEditor(projComp);
		createCredentialsEditor(projComp);		
		createVerticalSpacer(projComp, 1);
		createBrowser(projComp);
		setControl(projComp);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		//		ip.setText("localhost");
		//		cluster.setText("hthor");
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			disableButton.setSelection(configuration.getAttribute(Platform.P_DISABLED, false));

			fIPText.setText(configuration.getAttribute(Platform.P_IP, "localhost"));
			fPortText.setText(Integer.toString(configuration.getAttribute(Platform.P_PORT, 8010)));
			fClusterText.setText(configuration.getAttribute(Platform.P_CLUSTER, "hthor"));

			fUserText.setText(configuration.getAttribute(Platform.P_USER, ""));
			fPasswordText.setText(configuration.getAttribute(Platform.P_PASSWORD, ""));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(Platform.P_DISABLED, disableButton.getSelection());

		configuration.setAttribute(Platform.P_IP, fIPText.getText());
		try {
			configuration.setAttribute(Platform.P_PORT, Integer.parseInt(fPortText.getText()));
		} catch (NumberFormatException e) {
			configuration.setAttribute(Platform.P_PORT, 8010);
		}
		configuration.setAttribute(Platform.P_CLUSTER, fClusterText.getText());

		configuration.setAttribute(Platform.P_USER, fUserText.getText());
		configuration.setAttribute(Platform.P_PASSWORD, fPasswordText.getText());
	}

	protected void handleProjectButtonSelected() {
		//		IJavaProject project = chooseJavaProject();
		//		if (project == null) {
		//			return;
		//		}
		//		String projectName = project.getElementName();
		//		fProjText.setText(projectName);		
	}

	void refreshAddress() {
		StringBuilder url = new StringBuilder("http://");
		url.append(fIPText.getText());
		url.append(":" + fPortText.getText() + "/");
		fAddressText.setText(url.toString());
	}

	void refreshBrowser() {
		if (browser != null) {
			browser.addProgressListener(new ProgressAdapter() {
				@Override
				public void completed(ProgressEvent event) {
					browser.removeProgressListener(this);
					System.out.println(fAddressText.getText());
					browser.setUrl(fAddressText.getText());
				}
			});
			browser.setText("<html><body><h3>Loading (" + fAddressText.getText() + ")...</h3></body></html>");
		}
	}

	@Override
	public String getName() {
		return "HPCC Platform";
	}

	@Override
	public Image getImage() {
		if (image == null) {
			image = Activator.getImage("icons/releng_gears.gif"); //$NON-NLS-1$
		}
		return image;
	}
}
