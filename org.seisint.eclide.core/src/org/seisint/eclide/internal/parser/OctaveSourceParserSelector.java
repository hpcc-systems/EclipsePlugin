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
package org.seisint.eclide.internal.parser;


import org.eclipse.dltk.core.DLTKIdContributionSelector;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.seisint.eclide.core.OctaveCoreConstants;
import org.seisint.eclide.core.OctclipsePlugin;

public class OctaveSourceParserSelector extends DLTKIdContributionSelector {

	protected String getSavedContributionId(PreferencesLookupDelegate delegate) 
	{
		 return delegate.getString(OctclipsePlugin.PLUGIN_ID, OctaveCoreConstants.SOURCE_PARSER);
	}

}
