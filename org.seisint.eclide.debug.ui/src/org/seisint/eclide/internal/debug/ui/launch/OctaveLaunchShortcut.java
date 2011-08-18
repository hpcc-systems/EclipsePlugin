/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.debug.ui.launch;


import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.dltk.internal.debug.ui.launcher.AbstractScriptLaunchShortcut;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.launching.OctaveLaunchConfigurationConstants;

public class OctaveLaunchShortcut extends AbstractScriptLaunchShortcut {

	protected ILaunchConfigurationType getConfigurationType() {
		return getLaunchManager().getLaunchConfigurationType(
				OctaveLaunchConfigurationConstants.ID_OCTAVE_SCRIPT);
	}

	protected String getNatureId() {
		return OctaveNature.NATURE_ID;
	}

}
