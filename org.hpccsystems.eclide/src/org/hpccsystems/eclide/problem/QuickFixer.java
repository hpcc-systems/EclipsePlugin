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
package org.hpccsystems.eclide.problem;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator;
import org.hpccsystems.eclide.resources.Messages;

public class QuickFixer implements IMarkerResolutionGenerator {

	@Override
	public IMarkerResolution[] getResolutions(IMarker marker) {
		try {
			Object problem = marker.getAttribute("WhatsUp"); //$NON-NLS-1$
			return new IMarkerResolution[] {
					new QuickFix(Messages.QuickFixer_1+problem),
					new QuickFix(Messages.QuickFixer_2+problem),
			};
		}
		catch (CoreException e) {
			return new IMarkerResolution[0];
		}
	}

}
