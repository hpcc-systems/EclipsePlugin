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
package org.seisint.eclide.internal.ui.preferences;


import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.ui.preferences.BuildPathsPropertyPage;
import org.eclipse.dltk.ui.util.BusyIndicatorRunnableContext;
import org.eclipse.dltk.ui.wizards.BuildpathsBlock;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
import org.seisint.eclide.core.OctaveLanguageToolkit;
import org.seisint.eclide.core.OctclipsePlugin;

public class OctaveBuildPathsPropertyPage extends BuildPathsPropertyPage
		implements IWorkbenchPropertyPage {

	protected BuildpathsBlock createBuildPathBlock(
			IWorkbenchPreferenceContainer pageContainer) {
		return new OctaveBuildPathsBlock(new BusyIndicatorRunnableContext(), this,
				getSettings().getInt(INDEX), false, pageContainer);
	}

	public IDLTKLanguageToolkit getLanguageToolkit() {
		return OctaveLanguageToolkit.getDefault();
	}

}
