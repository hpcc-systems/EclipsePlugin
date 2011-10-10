package org.hpccsystems.eclide.launchers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.ECLLaunchConfigurationTab;
import org.hpccsystems.internal.Workspace;

public class ECLLaunchSourceTab extends ECLLaunchConfigurationTab {

	@Override
	public String getErrorMessage() {
		IProject targetProject = Workspace.findProject(fProjText.getText());
		if (targetProject == null || !targetProject.exists())
			return "Project does not exist";
		IFile targetFile = Workspace.findFile(targetProject, fMainText.getText());
		if (targetFile == null || !targetFile.exists())
			return "File does not exist";
		return super.getErrorMessage();
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		try {
			IProject targetProject = Workspace.findProject(launchConfig.getAttribute(ECLLaunchConstants.P_PROJECT, ""));
			if (targetProject == null || !targetProject.exists())
				return false;
			IFile targetFile = Workspace.findFile(targetProject, launchConfig.getAttribute(ECLLaunchConstants.P_FILE, ""));
			if (targetFile == null || !targetFile.exists())
				return false;
		} catch (CoreException e) {
			return false;
		}
		
		return super.isValid(launchConfig);
	}

	private class WidgetListener extends SelectionAdapter implements ModifyListener {
		public void modifyText(ModifyEvent e) {
			scheduleUpdateJob();
		}
		public void widgetSelected(SelectionEvent e) {
			Object source= e.getSource();
			if (source == fProjButton) {
				handleProjectButtonSelected();
			}
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

	protected Text fProjText;
	private Button fProjButton;
	
	protected Text fMainText;
	private Button fSearchButton;
	
	protected void createProjectEditor(Composite parent) {
		Group group = SWTFactory.createGroup(parent, "Project:", 3, 1, GridData.FILL_HORIZONTAL);
		SWTFactory.createLabel(group, "Project:  ", 1);
		fProjText = SWTFactory.createSingleText(group, 1);
		fProjText.addModifyListener(fListener);
		//ControlAccessibleListener.addListener(fProjText, group.getText());
		fProjButton = createPushButton(group, "Search", null); 
		fProjButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
			}
			public void widgetSelected(SelectionEvent e) {
				//TODO:  handleProjectButtonSelected();
			}
		});
		fProjButton.setEnabled(false);
		
		SWTFactory.createLabel(group, "File:  ", 1);
		fMainText = SWTFactory.createSingleText(group, 1);
		fMainText.addModifyListener(fListener);
//		ControlAccessibleListener.addListener(fMainText, group.getText());
		fSearchButton = createPushButton(group, "Search", null); 
		fSearchButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
			}
			public void widgetSelected(SelectionEvent e) {
				//TODO:  handleSearchButtonSelected();
			}
		});
		fSearchButton.setEnabled(false);
		
	}
	
	public final void createControl(Composite parent) {
		Composite projComp = SWTFactory.createComposite(parent, parent.getFont(), 1, 1, GridData.FILL_BOTH); 
		((GridLayout)projComp.getLayout()).verticalSpacing = 0;
		
		createVerticalSpacer(projComp, 1);
		createProjectEditor(projComp);
		createVerticalSpacer(projComp, 1);
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
			fProjText.setText(configuration.getAttribute(ECLLaunchConstants.P_PROJECT, ""));
			fMainText.setText(configuration.getAttribute(ECLLaunchConstants.P_FILE, ""));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(ECLLaunchConstants.P_PROJECT, fProjText.getText());
		configuration.setAttribute(ECLLaunchConstants.P_FILE, fMainText.getText());
	}

	protected void handleProjectButtonSelected() {
//		IJavaProject project = chooseJavaProject();
//		if (project == null) {
//			return;
//		}
//		String projectName = project.getElementName();
//		fProjText.setText(projectName);		
	}

	@Override
	public String getName() {
		return "ECL Target";
	}

    public Image getImage() {
        if (image == null) {
        	image = Activator.getImage("icons/releng_gears.gif"); //$NON-NLS-1$
        }
        return image;
    }
}
