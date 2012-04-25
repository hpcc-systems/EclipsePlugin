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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.hpccsystems.eclide.Activator;

public class ConfigurationPreferenceStore extends PreferenceStore {

	IPreferenceStore globalStore;
	ILaunchConfiguration configuration;
	IPropertyChangeListener listener;

	private List<FieldEditor> fields = null;

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

	public void addField(FieldEditor editor) {
		if (fields == null) {
			fields = new ArrayList<FieldEditor>();
		}
		fields.add(editor);
		editor.setPreferenceStore(this);
		editor.setPropertyChangeListener(listener);
	}

	public void loadFields(ILaunchConfiguration configuration) {
		for (FieldEditor field : fields) {
			String key = field.getPreferenceName();
			try {
				super.setValue(key, configuration.getAttribute(key, globalStore.getString(key)));
			} catch (CoreException e) {
				e.printStackTrace();
			}
			field.load();
		}
	}

	public void saveFields(ILaunchConfigurationWorkingCopy configuration) {
		for (FieldEditor field : fields) {
			field.store();
			String key = field.getPreferenceName();
			configuration.setAttribute(key, super.getString(key));
		}
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
			return getString(key);
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
			return getBoolean(key);
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
			return getInt(key);
		}
		if (globalStore.contains(key)) {
			return globalStore.getInt(key);
		}
		return defaultValue;
	}
}
