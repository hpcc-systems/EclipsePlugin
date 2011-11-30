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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.debug.internal.ui.stringsubstitution.*;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Platform;

public class ECLLaunchDelegate extends LaunchConfigurationDelegate {//implements ILaunchConfigurationDelegate {
	@Override
	public boolean preLaunchCheck(ILaunchConfiguration configuration, String mode, IProgressMonitor monitor) throws CoreException {
		// TODO Auto-generated method stub
		return super.preLaunchCheck(configuration, mode, monitor);
	}

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		final String cluster = configuration.getAttribute(Platform.P_CLUSTER, ""); 
		
		IFile file = null;
		IStructuredSelection ss = SelectedResourceManager.getDefault().getCurrentSelection();
		Object o = ss.getFirstElement();
		if(o instanceof IEditorPart) {
			IEditorPart editorPart = (IEditorPart)o;
			IFileEditorInput input = (IFileEditorInput)editorPart.getEditorInput();
			if (input != null) {
				file = input.getFile();
			}
		}
		else if (ss instanceof TreeSelection) {
			TreeSelection treeSel = (TreeSelection) ss;
			for (Object selItem : treeSel.toList()) {
				if (selItem instanceof IFile) {
					file = (IFile) selItem;
					break;
				}
			}
		}

		if (file != null) {
			Platform platform = Data.get().GetPlatform(configuration);
			platform.submit(file, cluster);
		}
	}
}
