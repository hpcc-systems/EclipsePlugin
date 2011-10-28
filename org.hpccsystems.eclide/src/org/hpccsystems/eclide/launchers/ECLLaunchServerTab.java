package org.hpccsystems.eclide.launchers;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.AuthenticationEvent;
import org.eclipse.swt.browser.AuthenticationListener;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressAdapter;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.ECLLaunchConfigurationTab;
import org.hpccsystems.internal.Eclipse;

import wsworkunits.ws.hpccsystems.ArrayOfEspException;
import wsworkunits.ws.hpccsystems.ECLWorkunit;
import wsworkunits.ws.hpccsystems.WUQuery;
import wsworkunits.ws.hpccsystems.WUQueryResponse;
import wsworkunits.ws.hpccsystems.WsWorkunitsLocator;
import wsworkunits.ws.hpccsystems.WsWorkunitsServiceSoap;

public class ECLLaunchServerTab extends ECLLaunchConfigurationTab {

	private class WidgetListener extends SelectionAdapter implements ModifyListener {
		public void modifyText(ModifyEvent e) {
			scheduleUpdateJob();
			Object source= e.getSource();
			if (source == fIPText) {
				refreshAddress();
			} if (source == fAddressText) {
			}
		}
		public void widgetSelected(SelectionEvent e) {
			Object source= e.getSource();
//			if (source == fProjButton) {
//				handleProjectButtonSelected();
//			}
//			if (source == fWorkspaceButton) {
////				handleWorkspaceDirBrowseButtonSelected();
//			}
//			else if (source == fFileSystemButton) {
////				handleWorkingDirBrowseButtonSelected();
//			} 
//			else if (source == fVariablesButton) {
////				handleWorkingDirVariablesButtonSelected();
//			} 
//			else if(source == localButton) {
//				//only perform the action if this is the button that was selected
////				if(fUseDefaultDirButton.getSelection()) {
////					setDefaultWorkingDir();
////				}
//			} 
//			else if(source == remoteButton) {
//				//only perform the action if this is the button that was selected
////				if(fUseOtherDirButton.getSelection()) {
////					handleUseOtherWorkingDirButtonSelected();
////				}
//			}
		}
	}
	
	private WidgetListener fListener = new WidgetListener();
	
    Image image;

//    // Local directory
//	private Button fWorkspaceButton;
//	private Button fFileSystemButton;
//	private Button fVariablesButton;
//	
//	//bug 29565 fix
//	private Button localButton = null;
//	private Button remoteButton = null;
	protected Text fIPText;
	protected Text fClusterText;

	protected Text fUserText;
	protected Text fPasswordText;

	protected Text fAddressText;
	private Browser browser;

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		/*
		setErrorMessage("");
		try {
			IProject targetProject = Eclipse.findProject(launchConfig.getAttribute(ECLLaunchConstants.P_PROJECT, ""));
			if (targetProject == null || !targetProject.exists()) {
				setErrorMessage("Project does not exist");
				return false;
			}
			IFile targetFile = Eclipse.findFile(targetProject, launchConfig.getAttribute(ECLLaunchConstants.P_FILE, ""));
			if (targetFile == null || !targetFile.exists()) {
				setErrorMessage("File does not exist");
				return false;
			}
		} catch (CoreException e) {
			return false;
		}
		 */

		return super.isValid(launchConfig);
	}

	protected void createServerEditor(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Server:", 2, 1, GridData.FILL_HORIZONTAL);
		SWTFactory.createLabel(group, "IP Address:  ", 1);
		fIPText = SWTFactory.createSingleText(group, 1);
		fIPText.addModifyListener(fListener);

		SWTFactory.createLabel(group, "Cluster:  ", 1);
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
	

	protected void createBrowser(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "ECL Watch:", 2, 1, GridData.FILL_BOTH);
		SWTFactory.createLabel(group, "Address:  ", 1);
		fAddressText = SWTFactory.createSingleText(group, 1);
		fAddressText.addModifyListener(fListener);

		browser = new Browser(group, SWT.BORDER);
		browser.setUrl("about:blank");
    	GridData gd = new GridData(GridData.FILL_BOTH);
    	gd.horizontalSpan = 2;
    	browser.setLayoutData(gd);
    	browser.addAuthenticationListener(new AuthenticationListener() {
			
			@Override
			public void authenticate(AuthenticationEvent event) {
				// TODO Auto-generated method stub
				event.user = fUserText.getText();
				event.password = fPasswordText.getText();
			}
		});
	}

	public final void createControl(Composite parent) {
		Composite projComp = SWTFactory.createComposite(parent, parent.getFont(), 1, 1, GridData.FILL_BOTH); 
		((GridLayout)projComp.getLayout()).verticalSpacing = 0;
		
		createVerticalSpacer(projComp, 1);
		createServerEditor(projComp);
		createCredentialsEditor(projComp);		
		createVerticalSpacer(projComp, 1);
		createBrowser(projComp);
		setControl(projComp);
		
//		Font font = parent.getFont();	
//		SWTFactory.createHorizontalSpacer(parent, 1);
//
//		Group serverGroup = SWTFactory.createGroup(parent, "Server", 2, 1, GridData.FILL_HORIZONTAL);
//		setControl(serverGroup);
//		SWTFactory.createLabel(serverGroup, "IP Address:  ", 1);
//		ip = SWTFactory.createSingleText(serverGroup, 1); 
//		ip.addModifyListener(fListener);
//
//		SWTFactory.createLabel(serverGroup, "Cluster:  ", 1);
//		cluster = SWTFactory.createSingleText(serverGroup, 1);
//		cluster.addModifyListener(fListener);
//
//		//setControl(parent);
//		//Group launchItemGroup = SWTFactory.createGroup(parent, "Launch Item", 2, 1, GridData.FILL_HORIZONTAL);
//		setControl(serverGroup);
//		fProjText = SWTFactory.createSingleText(serverGroup, 1);
//		fProjText.addModifyListener(fListener);
//		//ControlAccessibleListener.addListener(fProjText, group.getText());
//		fProjButton = createPushButton(serverGroup, "LauncherMessages.AbstractJavaMainTab_1", null); 
//		fProjButton.addSelectionListener(fListener);
//
//		Composite projComp = SWTFactory.createComposite(parent, parent.getFont(), 1, 1, GridData.FILL_BOTH); 
//		((GridLayout)projComp.getLayout()).verticalSpacing = 0;
//
//		Group group = SWTFactory.createGroup(parent, "LauncherMessages.AbstractJavaMainTab_0", 2, 1, GridData.FILL_HORIZONTAL);
//		fProjText = SWTFactory.createSingleText(group, 1);
//		fProjText.addModifyListener(fListener);
//		//ControlAccessibleListener.addListener(fProjText, group.getText());
//		fProjButton = createPushButton(group, "LauncherMessages.AbstractJavaMainTab_1", null); 
//		fProjButton.addSelectionListener(fListener);
//		
//		createVerticalSpacer(projComp, 1);
//		createMainTypeEditor(projComp, LauncherMessages.appletlauncher_maintab_mainclasslabel_name);
//		createVerticalSpacer(projComp, 1);
//		createAppletViewerControl(projComp);
//		setControl(projComp);
	//	PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), IJavaDebugHelpContextIds.LAUNCH_CONFIGURATION_DIALOG_APPLET_MAIN_TAB);
	
		
//		//buttons
//		Composite buttonComp = SWTFactory.createComposite(comp, font, 3, 2, GridData.HORIZONTAL_ALIGN_END); 
//		GridLayout ld = (GridLayout)buttonComp.getLayout();
//		ld.marginHeight = 1;
//		ld.marginWidth = 0;
//		fWorkspaceButton = createPushButton(buttonComp, DebugUIMessages.WorkingDirectoryBlock_0, null); 
//		fWorkspaceButton.addSelectionListener(fListener);
//		fFileSystemButton = createPushButton(buttonComp, DebugUIMessages.WorkingDirectoryBlock_1, null); 
//		fFileSystemButton.addSelectionListener(fListener);
//		fVariablesButton = createPushButton(buttonComp, DebugUIMessages.WorkingDirectoryBlock_17, null); 
//		fVariablesButton.addSelectionListener(fListener);
	}
	
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
//		ip.setText("localhost");
//		cluster.setText("hthor");
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			fIPText.setText(configuration.getAttribute(ECLLaunchConstants.P_IP, "localhost"));
			fClusterText.setText(configuration.getAttribute(ECLLaunchConstants.P_CLUSTER, "hthor"));

			fUserText.setText(configuration.getAttribute(ECLLaunchConstants.P_USER, ""));
			fPasswordText.setText(configuration.getAttribute(ECLLaunchConstants.P_PASSWORD, ""));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(ECLLaunchConstants.P_IP, fIPText.getText());
		configuration.setAttribute(ECLLaunchConstants.P_CLUSTER, fClusterText.getText());

		configuration.setAttribute(ECLLaunchConstants.P_USER, fUserText.getText());
		configuration.setAttribute(ECLLaunchConstants.P_PASSWORD, fPasswordText.getText());
		refreshBrowser();
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
		url.append(":8010/");
		fAddressText.setText(url.toString());
	}
	
	void refreshBrowser() {
		browser.addProgressListener(new ProgressAdapter() {
			public void completed(ProgressEvent event) {
				browser.removeProgressListener(this);
				System.out.println(fAddressText.getText());
				browser.setUrl(fAddressText.getText());
			}
		});
		browser.setText("<html><body><h3>Loading (" + fAddressText.getText() + ")...</h3></body></html>");
	}

	@Override
	public String getName() {
		return "HPCC Platform";
	}

    public Image getImage() {
        if (image == null) {
        	image = Activator.getImage("icons/releng_gears.gif"); //$NON-NLS-1$
        }
        return image;
    }
}
