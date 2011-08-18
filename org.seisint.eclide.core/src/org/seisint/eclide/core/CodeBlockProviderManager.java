/*******************************************************************************
 * Copyright (c) 2009 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.core;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.dltk.core.DLTKContributedExtension;
import org.eclipse.dltk.core.DLTKContributionExtensionManager;

public class CodeBlockProviderManager extends DLTKContributionExtensionManager {

	private static final String PROVIDER_EXT_POINT = OctclipsePlugin.PLUGIN_ID + ".codeblockprovider"; //$NON-NLS-1$

	private static final String PROVIDER_TAG = "provider"; //$NON-NLS-1$
	
	private static CodeBlockProviderManager instance;
	
	public static CodeBlockProviderManager getInstance() {
		if (instance == null) {
			instance = new CodeBlockProviderManager();
		}
		return instance;
	}
	
	protected String getContributionElementName() {
		return PROVIDER_TAG;
	}

	protected String getExtensionPoint() {
		return PROVIDER_EXT_POINT;
	}

	protected boolean isValidContribution(Object object) {
		return (object instanceof IOctaveCodeBlockProviderFactory);
	}

	protected Object configureContribution(Object object,
			IConfigurationElement config) {
		return new CodeBlockProviderContribution((IOctaveCodeBlockProviderFactory) object, config);
	}
	
	public IOctaveCodeBlockProvider getCodeBlockProvider(IProject project, String natureId) {
		return ((CodeBlockProviderContribution) getSelectedContribution(project, natureId)).getProvider();
	}
	
	static class CodeBlockProviderContribution extends DLTKContributedExtension {
		private IOctaveCodeBlockProviderFactory factory;
		private IConfigurationElement config;
		
		CodeBlockProviderContribution(IOctaveCodeBlockProviderFactory factory, IConfigurationElement config) {
			this.factory = factory;
			this.config = config;
			setInitializationData(config, null, null);
		}

		IOctaveCodeBlockProvider getProvider() {
			IOctaveCodeBlockProvider provider = factory.getProvider();
			((AbstractCodeBlockProvider)provider).setInitializationData(config, null, null);
			return provider;
		}
	}
	
}
