package org.hpccsystems.eclide.launchers;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.hpccsystems.eclide.Activator;

public class ECLLaunchConfigurationTab extends AbstractLaunchConfigurationTab {

    Image image;

    // Local directory
	private Button fWorkspaceButton;
	private Button fFileSystemButton;
	private Button fVariablesButton;
	
	//bug 29565 fix
	private Button localButton = null;
	private Button remoteButton = null;
	private Text cluster = null;
	private Text ip;

	private class WidgetListener extends SelectionAdapter implements ModifyListener {
		public void modifyText(ModifyEvent e) {
			scheduleUpdateJob();
		}
		public void widgetSelected(SelectionEvent e) {
			Object source= e.getSource();
			if (source == fWorkspaceButton) {
//				handleWorkspaceDirBrowseButtonSelected();
			}
			else if (source == fFileSystemButton) {
//				handleWorkingDirBrowseButtonSelected();
			} 
			else if (source == fVariablesButton) {
//				handleWorkingDirVariablesButtonSelected();
			} 
			else if(source == localButton) {
				//only perform the action if this is the button that was selected
//				if(fUseDefaultDirButton.getSelection()) {
//					setDefaultWorkingDir();
//				}
			} 
			else if(source == remoteButton) {
				//only perform the action if this is the button that was selected
//				if(fUseOtherDirButton.getSelection()) {
//					handleUseOtherWorkingDirButtonSelected();
//				}
			}
		}
	}
	
	private WidgetListener fListener = new WidgetListener();

	public final void createControl(Composite parent) {
		Font font = parent.getFont();	

		SWTFactory.createHorizontalSpacer(parent, 1);

		Group group = SWTFactory.createGroup(parent, "Location", 2, 1, GridData.FILL_HORIZONTAL);
		setControl(group);
		
		SWTFactory.createLabel(group, "IP Address:  ", 1);
		ip = SWTFactory.createSingleText(group, 1); 
		ip.addModifyListener(fListener);

		SWTFactory.createLabel(group, "Cluster:  ", 1);
		cluster = SWTFactory.createSingleText(group, 1);
		cluster.addModifyListener(fListener);

		
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
		ip.setText("localhost");
		cluster.setText("hthor");
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			ip.setText(configuration.getAttribute(ECLLaunchConstants.P_IP, "localhost"));
			cluster.setText(configuration.getAttribute(ECLLaunchConstants.P_CLUSTER, "hthor"));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(ECLLaunchConstants.P_IP, ip.getText());
		configuration.setAttribute(ECLLaunchConstants.P_CLUSTER, cluster.getText());
	}

    @Override
	public String getName() {
		return "Remote Target";
	}

    public Image getImage() {
        if (image == null) {
        	image = Activator.getImage("icons/releng_gears.gif"); //$NON-NLS-1$
        }
        return image;
    }
}
