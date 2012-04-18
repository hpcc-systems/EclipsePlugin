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
package org.hpccsystems.eclide.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.ClientTools;

/**
 * Class used to initialize default preference values.
 */
public class ECLPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		try{
			String hpccBinFolder = System.getenv("HPCCBIN");
			store.setDefault(ClientTools.P_TOOLSPATH, hpccBinFolder);
		} catch (Exception e) {
			store.setDefault(ClientTools.P_TOOLSPATH, "");
		}
		
		store.setDefault(ClientTools.P_ARGSCOMMON, "");
		store.setDefault(ClientTools.P_ARGSSYNTAX, "-fsyntaxcheck=1");
		store.setDefault(ClientTools.P_ARGSCOMPILE, "");
		store.setDefault(ClientTools.P_ARGSCOMPILEREMOTE, "-E");

		store.setDefault(ClientTools.P_ARGSWULOCAL, "");

		store.setDefault(ClientTools.P_INLINERESULTLIMIT, 0);
		store.setDefault(ClientTools.P_MONITORDEPENDEES, true);
		store.setDefault(ClientTools.P_SUPRESSSECONDERROR, false);
		store.setDefault(ClientTools.P_ENABLEMETAPROCESSING, true);
	}
}
