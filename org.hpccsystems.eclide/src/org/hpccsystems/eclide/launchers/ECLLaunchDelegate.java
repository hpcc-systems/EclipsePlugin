/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

package org.hpccsystems.eclide.launchers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.debug.internal.ui.stringsubstitution.SelectedResourceManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.hpccsystems.internal.data.Cluster;
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
		final String cluster = configuration.getAttribute(Cluster.P_CLUSTER, ""); 
		
		IFile file = null;
		IStructuredSelection ss = SelectedResourceManager.getDefault().getCurrentSelection();
		Object o = ss.getFirstElement();
		if(o instanceof IEditorPart) {
			IEditorPart editorPart = (IEditorPart)o;
			IFileEditorInput input = (IFileEditorInput)editorPart.getEditorInput();
			if (input != null) {
				file = input.getFile();
			}
		
//			fShortcut.launch((IEditorPart) o, fMode, ip, cluster, user, password);
		}
		else {
			if (ss instanceof TreeSelection) {
				TreeSelection treeSel = (TreeSelection) ss;
				if (treeSel.size() >= 1) {
					file = (IFile) treeSel.getFirstElement();
				}
			}
			//fShortcut.launch(ss, fMode, ip, cluster, user, password);
		}
		if (file != null) {
			Platform platform = Data.get().GetPlatform(configuration);
			platform.submit(file, cluster);
		}
	}
}
