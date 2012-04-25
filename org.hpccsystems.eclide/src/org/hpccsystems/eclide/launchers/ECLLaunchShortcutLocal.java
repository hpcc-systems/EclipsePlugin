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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

public class ECLLaunchShortcutLocal implements ILaunchShortcut2 {

	@Override
	public void launch(ISelection selection, String mode) {
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
	}

	public ILaunchConfiguration[] getLaunchConfigurations() {
		Collection<ILaunchConfiguration> retVal = new ArrayList<ILaunchConfiguration>();
		try {
			ILaunchConfiguration[] configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations();
			for(int i = 0; i < configs.length; ++i) {
				//if (configs[i].getAttribute(Platform.P_ENABLED, true)) {
				retVal.add(configs[i]);
				//}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return retVal.toArray(new ILaunchConfiguration[0]);
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(ISelection selection) {
		return getLaunchConfigurations();
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(IEditorPart editorpart) {
		return getLaunchConfigurations();
	}

	@Override
	public IResource getLaunchableResource(ISelection selection) {
		if (selection instanceof TreeSelection) {
			TreeSelection treeSel = (TreeSelection) selection;
			for (Object selItem : treeSel.toList()) {
				if (selItem instanceof IFile) {
					return (IFile) selItem;
				}
			}
		}
		return null;
	}

	@Override
	public IResource getLaunchableResource(IEditorPart editorpart) {
		IFileEditorInput input = (IFileEditorInput)editorpart.getEditorInput();
		if (input != null) {
			return input.getFile();
		}
		return null;
	}
}
