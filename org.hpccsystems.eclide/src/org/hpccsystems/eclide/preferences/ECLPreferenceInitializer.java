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

/**
 * Class used to initialize default preference values.
 */
public class ECLPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		try{
			String hpccBinFolder = System.getenv("HPCCBIN");
			store.setDefault(ECLPreferenceConstants.P_TOOLSPATH, hpccBinFolder);
		} catch (Exception e) {
			store.setDefault(ECLPreferenceConstants.P_TOOLSPATH, "");
		}
		
		store.setDefault(ECLPreferenceConstants.P_ARGSCOMMON, "");
		store.setDefault(ECLPreferenceConstants.P_ARGSSYNTAX, "-fsyntaxcheck=1");
		store.setDefault(ECLPreferenceConstants.P_ARGSCOMPILE, "");
		store.setDefault(ECLPreferenceConstants.P_ARGSCOMPILEREMOTE, "-E");

		store.setDefault(ECLPreferenceConstants.P_ARGSWULOCAL, "");

		store.setDefault(ECLPreferenceConstants.P_MONITORDEPENDEES, true);
		store.setDefault(ECLPreferenceConstants.P_SUPRESSSECONDERROR, false);

//		store.setDefault(ECLPreferenceConstants.P_REMOTEEXECUTE, false);
//		store.setDefault(ECLPreferenceConstants.P_SERVERIP, "192.168.241.131");
//		store.setDefault(ECLPreferenceConstants.P_SERVERCLUSTER, "thor");
	}

}
