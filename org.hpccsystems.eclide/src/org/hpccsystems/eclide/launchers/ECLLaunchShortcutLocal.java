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
import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.internal.Eclipse;

public class ECLLaunchShortcutLocal implements ILaunchShortcut2 {
	
	public void launchXXX(ISelection selection, String mode) {
		if (selection instanceof TreeSelection) {
			TreeSelection treeSel = (TreeSelection) selection;
			IFile file = null;
			if (treeSel.size() >= 1) {
				file = (IFile) treeSel.getFirstElement();
			}
			
			if (file == null)
				return;

			Eclipse.doSaveDirty(file.getProject());
			ECLCompiler compiler = new ECLCompiler(file.getProject());
			compiler.buildAndRun(file);
		}
	}
	
	public void launchXXX(IEditorPart editor, String mode) {
		//ProgressMonitor monitor = new ProgressMonitor((Component) editor, "Save All", "", 0, 0);
		//editor.doSave(null);
		IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
		if (input != null) {
			IFile file = input.getFile();
			Eclipse.doSaveDirty(file.getProject());
			ECLCompiler compiler = new ECLCompiler(file.getProject());
			compiler.buildAndRun(file);
		}
		assert(input != null);
	}

	@Override
	public void launch(ISelection selection, String mode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(ISelection selection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(IEditorPart editorpart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResource getLaunchableResource(ISelection selection) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResource getLaunchableResource(IEditorPart editorpart) {
		// TODO Auto-generated method stub
		return null;
	}
}
