/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.debug.ui;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.debug.ui.breakpoints.IScriptBreakpointLineValidator;
import org.eclipse.dltk.debug.ui.breakpoints.ScriptToggleBreakpointAdapter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.seisint.eclide.debug.OctaveDebugConstants;

public class OctaveToggleBreakpointAdapter extends
		ScriptToggleBreakpointAdapter {
	
	protected IScriptBreakpointLineValidator getValidator() {
		return new IScriptBreakpointLineValidator() {
			public boolean isValid(String line, int number) {
				final String trimmedLine = line.trim();
				return trimmedLine.length() > 0
						&& trimmedLine.indexOf("#") != 0 
						&& trimmedLine.indexOf("%") != 0;
			}
		};
	}
	
	protected String getDebugModelId() {
		return OctaveDebugConstants.DEBUG_MODEL_ID;
	}

	public boolean canToggleBreakpoints(IWorkbenchPart part,
			ISelection selection) {
		return canToggleLineBreakpoints(part, selection);
	}

	public void toggleBreakpoints(IWorkbenchPart part, ISelection selection)
			throws CoreException {
		toggleLineBreakpoints(part, selection);
	}

	public boolean canToggleMethodBreakpoints(IWorkbenchPart part,
			ISelection selection) {
		return false;
	}

	public boolean canToggleWatchpoints(IWorkbenchPart part,
			ISelection selection) {
		return false;
	}

	public void toggleMethodBreakpoints(IWorkbenchPart part,
			ISelection selection) throws CoreException {
		// TODO Implement this !!!!
	}

	public void toggleWatchpoints(IWorkbenchPart part, ISelection selection)
			throws CoreException {
	}

}
