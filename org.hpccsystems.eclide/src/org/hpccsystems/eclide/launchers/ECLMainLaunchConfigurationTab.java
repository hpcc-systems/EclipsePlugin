package org.hpccsystems.eclide.launchers;

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

public class ECLMainLaunchConfigurationTab extends AbstractLaunchConfigurationTab {

    Image image;

    // Local directory
	private Button fWorkspaceButton;
	private Button fFileSystemButton;
	private Button fVariablesButton;
	
	//bug 29565 fix
	private Button localButton = null;
	private Button remoteButton = null;
	private Text fOtherWorkingText = null;
	private Text fWorkingDirText;

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
		Group group = SWTFactory.createGroup(parent, "Target", 2, 1, GridData.FILL_HORIZONTAL);
		setControl(group);
		
		//default choice
		Composite comp = SWTFactory.createComposite(group, font, 2, 2, GridData.FILL_BOTH, 0, 0);
		localButton = SWTFactory.createRadioButton(comp, "Local");
		localButton.addSelectionListener(fListener);
//		fWorkingDirText = SWTFactory.createSingleText(comp, 1); 
//		fWorkingDirText.addModifyListener(fListener);
//		fWorkingDirText.setEnabled(false);
		//user enter choice
		remoteButton = SWTFactory.createRadioButton(comp, "Remote");
		remoteButton.addSelectionListener(fListener);
//		fOtherWorkingText = SWTFactory.createSingleText(comp, 1);
//		fOtherWorkingText.addModifyListener(fListener);
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}

    public Image getImage() {
        if (image == null) {
        	image = Activator.getImage("icons/releng_gears.gif"); //$NON-NLS-1$
        }

        return image;
    }

    @Override
	public String getName() {
		return "Target";
	}

}
