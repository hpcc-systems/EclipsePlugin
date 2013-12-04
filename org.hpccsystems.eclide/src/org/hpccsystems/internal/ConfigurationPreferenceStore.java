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
package org.hpccsystems.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.hpccsystems.eclide.Activator;

public class ConfigurationPreferenceStore extends PreferenceStore {

	IPreferenceStore globalStore;
	ILaunchConfiguration configuration;
	IPropertyChangeListener listener;

	public ConfigurationPreferenceStore() {
		super();
		globalStore = Activator.getDefault().getPreferenceStore();
	}

	public ConfigurationPreferenceStore(IPropertyChangeListener listener) {
		this();
		this.listener = listener;
	}

	public ConfigurationPreferenceStore(ILaunchConfiguration configuration) {
		this();
		this.configuration = configuration;
	}

	//  ILaunchConfiguration like calls  ---
	public String getAttribute(String key, String defaultValue) {
		if (configuration != null) {
			try {
				return configuration.getAttribute(key, defaultValue);
			} catch (CoreException e) {
			}
		}
		if (contains(key)) {
			return super.getString(key);
		}
		if (globalStore.contains(key)) {
			return globalStore.getString(key);
		}
		return defaultValue;
	}

	public boolean getAttribute(String key, boolean defaultValue) {
		if (configuration != null) {
			try {
				return configuration.getAttribute(key, defaultValue);
			} catch (CoreException e) {
			}
		}
		if (contains(key)) {
			return super.getBoolean(key);
		}
		if (globalStore.contains(key)) {
			return globalStore.getBoolean(key);
		}
		return defaultValue;
	}

	public int getAttribute(String key, int defaultValue) {
		if (configuration != null) {
			try {
				return configuration.getAttribute(key, defaultValue);
			} catch (CoreException e) {
			}
		}
		if (contains(key)) {
			return super.getInt(key);
		}
		if (globalStore.contains(key)) {
			return globalStore.getInt(key);
		}
		return defaultValue;
	}
	//  IPreference Like Calls  ---
    public boolean getBoolean(String name) {
    	return getAttribute(name, false);    	
    }
    
    public int getInt(String name) {
    	return getAttribute(name, 0);    	
    }
    
    public String getString(String name) {
    	return getAttribute(name, "");    	
    }
}
