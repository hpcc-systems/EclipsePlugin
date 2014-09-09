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
package org.hpccsystems.internal.data;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.hpccsystems.eclide.Workbench;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.eclide.resources.Messages;
import org.hpccsystems.esp.DataSingletonCollection;
import org.hpccsystems.esp.Platform;
import org.hpccsystems.esp.Workunit;
import org.hpccsystems.internal.ConfigurationPreferenceStore;

public class LauncherPlatform extends Platform {
	public static DataSingletonCollection All = new DataSingletonCollection();	
	public static LauncherPlatform get(boolean ssl, String ip, int port) {
		if (ip == null || ip.isEmpty()) {
			return null;
		}

		return (LauncherPlatform)All.get(new LauncherPlatform(ssl, ip, port));
	}
	public static LauncherPlatform getNoCreate(boolean ssl, String ip, int port) {
		if (ip == null || ip.isEmpty()) {
			return null;
		}

		return (LauncherPlatform)All.getNoCreate(new LauncherPlatform(ssl, ip, port));
	}
	public static void remove(LauncherPlatform p) {
		All.remove(p);
	}

	private ConfigurationPreferenceStore launchConfiguration;	
	private String name;
	LauncherPlatform(boolean ssl, String ip, int port) {
		super(ssl, ip, port);
		name = "";
		isDisabled = true;
	}

	public void update(ILaunchConfiguration _launchConfiguration) {
		launchConfiguration = new ConfigurationPreferenceStore(_launchConfiguration);
		name = _launchConfiguration.getName();
		user = launchConfiguration.getAttribute(P_USER, ""); //$NON-NLS-1$
		password = launchConfiguration.getAttribute(P_PASSWORD, ""); //$NON-NLS-1$
		isDisabled = launchConfiguration.getAttribute(P_DISABLED, true);
		ssl = launchConfiguration.getAttribute(P_SSL, false);
		ip = launchConfiguration.getAttribute(P_IP, ""); //$NON-NLS-1$
		port = launchConfiguration.getAttribute(P_PORT, 8010);
	}

	public boolean matches(ILaunchConfiguration _launchConfiguration) {
		try {
			return (ip.equals(_launchConfiguration.getAttribute(P_IP, "")) && port == _launchConfiguration.getAttribute(P_PORT, 8010)); //$NON-NLS-1$
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return false;
	}

	protected synchronized void confirmDisable() {
		if (!isDisabled()) {
			Workbench.getDisplay().syncExec(new Runnable() {
				@Override
				public void run() {
					Shell activeShell = Workbench.getShell();
					if (MessageDialog.openConfirm(activeShell, Messages.EclPlugin, Messages.Double_Quote + name + Messages.DisableCurrentSession)) {
						isTempDisabled = true;
					}
				}
			});
		}
	}

	public Workunit submit(ILaunchConfiguration configuration, IFile file, String cluster, boolean compileOnly) {
		if (!isEnabled()) {
			Workbench.getDisplay().syncExec(new Runnable() {
				@Override
				public void run() {
					Shell activeShell = Workbench.getShell();
					MessageDialog.openInformation(activeShell, Messages.UnableToSubmitECL, "\"" + name + Messages.Msg_Unreachable); //$NON-NLS-2$
				}
			});
		} else {
			ClientTools clientTools = ClientTools.get(this, configuration);
			if (clientTools == null) {
				return null;
			}
			ECLCompiler compiler = clientTools.getCompiler(file); 
			compiler.setProject(file.getProject());
			String archive = compiler.getArchive(file);
			if (!archive.isEmpty())
			{
				String jobname = file.getFullPath().removeFileExtension().lastSegment();
				String filePath = file.getFullPath().toPortableString();
				int inlineResultLimit = launchConfiguration.getInt(ClientTools.P_INLINERESULTLIMIT);
				return super.submit(cluster, archive, jobname, filePath, inlineResultLimit, compileOnly);
			}
		}
		return null;
	}

	public Workunit submit(ILaunchConfiguration configuration, IFile file, String cluster) {
		boolean compileOnly = false;
		try {
			if (configuration.getAttribute(P_COMPILEONLY, false)) {
				compileOnly = true;
			}
		} catch (CoreException e) {
		}
		
		return submit(configuration, file, cluster, compileOnly);
	}
}
