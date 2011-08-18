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
package org.seisint.eclide.internal.launching.debug;

import org.eclipse.jface.preference.IPreferenceStore;

public final class OctaveEngineDebuggerConstants {
	
	private OctaveEngineDebuggerConstants() {
	
	}
	
	public static void initalizeDefaults(IPreferenceStore store) {
		store.setDefault(DEBUGGING_ENGINE_PATH_KEY, "");
		store.setDefault(ENABLE_LOGGING, true);
		store.setDefault(LOG_FILE_NAME, "octclipse_debug_external_{0}.log");
		store.setDefault(LOG_FILE_PATH, "");
	}
	
	public static final String DEBUGGING_ENGINE_PATH_KEY = "_external_debugging_engine_path";
	public static final String ENABLE_LOGGING = "_external_enable_logging";
	public static final String LOG_FILE_PATH = "_external_log_file_path";
	public static final String LOG_FILE_NAME = "_external_log_file_name";
	
}
