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
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.internal.Eclipse;

public class ECLLaunchShortcutLocal implements ILaunchShortcut {
	
	public void launch(ISelection selection, String mode) {
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
	
	public void launch(IEditorPart editor, String mode) {
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
}
