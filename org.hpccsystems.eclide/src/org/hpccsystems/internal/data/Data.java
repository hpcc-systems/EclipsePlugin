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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Observable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationListener;

public class Data extends Observable {
	private static Data singletonFactory;

	private Collection<Platform> platforms;	
	private Collection<ClientTools> clientTools;	

	//  Singleton Pattern
	private Data() {
		platforms = new ArrayList<Platform>();
		clientTools = new ArrayList<ClientTools>();

		//  Load platforms  ---
		ILaunchConfiguration[] configs;
		try {
			configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations();
			for(int i = 0; i < configs.length; ++i) {
				Platform p = GetPlatform(configs[i]);
				if (p != null && !platforms.contains(p)) {
					platforms.add(p);
				}

				ClientTools ct = GetClientTools(configs[i]);
				if (!clientTools.contains(ct)) {
					clientTools.add(ct);
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		//  Monitor platforms  ---
		DebugPlugin.getDefault().getLaunchManager().addLaunchConfigurationListener(new ILaunchConfigurationListener() {

			@Override
			public void launchConfigurationRemoved(ILaunchConfiguration configuration) {
				Platform p = GetPlatform(configuration);
				if (platforms.contains(p)) {
					platforms.remove(p);
					setChanged();
				}
				notifyObservers();
			}

			@Override
			public void launchConfigurationChanged(ILaunchConfiguration configuration) {
				//  GetPlatform will update config information
				GetPlatform(configuration);
			}

			@Override
			public void launchConfigurationAdded(ILaunchConfiguration configuration) {
				Platform p = GetPlatform(configuration);
				if (!platforms.contains(p)) {
					platforms.add(p);
					setChanged();
				}
				notifyObservers();
			}
		});

		setChanged();
	}

	public static synchronized Data get() {
		if (singletonFactory == null) {
			singletonFactory = new Data();
		}
		return singletonFactory;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	//  Platform  ---
	public Platform GetPlatform(ILaunchConfiguration launchConfiguration) {
		Platform retVal = null;
		String ip = "";
		int port = 0;
		try {
			ip = launchConfiguration.getAttribute(Platform.P_IP, "");
		} catch (CoreException e) {
		} 

		try {
			port = launchConfiguration.getAttribute(Platform.P_PORT, 8010);
		} catch (CoreException e) {
		}

		if (port == 0) {
			port = 8010;
		}

		if (!ip.isEmpty() && port != 0) {
			retVal = Platform.get(ip, port);
			retVal.update(launchConfiguration);	
		}
		return retVal;
	}

	public Platform GetPlatformNoCreate(String ip, int port) {
		return Platform.getNoCreate(ip, port);
	}

	public final Platform[] getPlatforms() {
		return platforms.toArray(new Platform[0]);
	}

	public Collection<Workunit> getWorkunits(Platform platform, String cluster, String startDate, String endDate) {
		Collection<Workunit> workunits = new HashSet<Workunit>();
		try {
			Workunit.All.pushTransaction("Data.getWorkunits");
			for (Platform p : getPlatforms()) {
				assert p != null;
				if (platform == null || platform.equals(p)) {
					workunits.addAll(p.getWorkunits(cluster, startDate, endDate));
				}
			}
		}
		finally {
			Workunit.All.popTransaction();
		}
		return workunits;
	}

	//  ClientTools  ---
	public ClientTools[] GetClientTools() {
		return clientTools.toArray(new ClientTools[0]);
	}

	public ClientTools GetClientTools(ILaunchConfiguration launchConfiguration) {
		ClientTools retVal = null;
		String path = "";
		try {
			path = launchConfiguration.getAttribute(ClientTools.P_TOOLSPATH, "");
		} catch (CoreException e) {
		} 
		if (!path.isEmpty()) {
			retVal = ClientTools.get(path);
			retVal.update(launchConfiguration);	
		}
		return retVal;
	}

	public ClientTools GetClientTools(IFile file) {
		ClientTools retVal = null;
		ILaunchConfiguration launchConfiguration = DebugPlugin.getDefault().getLaunchManager().getLaunchConfiguration(file);
		if (launchConfiguration != null) {
			retVal = GetClientTools(launchConfiguration);
		}

		if (retVal != null) {
			return retVal;
		}

		for(ClientTools ct : clientTools) {
			if (retVal == null) {
				retVal = ct;
			} else {
				if (ct.isNewerThan(retVal)) {
					retVal = ct;
				}
			}
		}
		return retVal;
	}
}
