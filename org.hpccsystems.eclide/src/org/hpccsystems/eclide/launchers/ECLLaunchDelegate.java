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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.internal.Workspace;

public class ECLLaunchDelegate extends LaunchConfigurationDelegate {//implements ILaunchConfigurationDelegate {
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		IProject targetProject = Workspace.findProject(configuration.getAttribute(ECLLaunchConstants.P_PROJECT, ""));
		IFile targetFile = Workspace.findFile(targetProject, configuration.getAttribute(ECLLaunchConstants.P_FILE, ""));

		Workspace.doSaveDirty(targetProject);
		ECLCompiler compiler = new ECLCompiler(targetProject);
		compiler.buildAndRunRemote(targetFile, configuration.getAttribute(ECLLaunchConstants.P_IP, ""), configuration.getAttribute(ECLLaunchConstants.P_CLUSTER, ""));
//		ISourceLocator sourceLocator = launch.getSourceLocator();
//		sourceLocator.
//		
//		if (selection instanceof TreeSelection) {
//			TreeSelection treeSel = (TreeSelection) selection;
//			IFile file = null;
//			if (treeSel.size() >= 1) {
//				file = (IFile) treeSel.getFirstElement();
//			}
//			
//			if (file == null)
//				return;
//
//			doSaveDirty(file.getProject());
//			ECLCompiler compiler = new ECLCompiler(file.getProject());
//			compiler.buildAndRun(file);
//		}
//
//		
//		
//		ECLCompiler compiler = new ECLCompiler(file.getProject());
//		compiler.buildAndRun(file);
		
//		IWorkbench workbench = PlatformUI.getWorkbench().getWorkbenchWindows();
//		workbench.getSelection();
//		workbench.
		//workbench.get

		//ECLCompiler compiler = new ECLCompiler(configuration.getProject());
		//compiler.CheckSyntax(file);
	}

}
