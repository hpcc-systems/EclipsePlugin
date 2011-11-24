/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

package org.hpccsystems.internal.data;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;

public class Data {
	public static final String P_IP = "ipLaunchConfig";
	public static final String P_USER = "userLaunchConfig";
	public static final String P_PASSWORD = "passwordLaunchConfig";
	public static final String P_CLUSTER = "clusterLaunchConfig";

	private static Data singletonFactory;
	
	private Collection<Platform> platforms;	
	
	//  Singleton Pattern
	private Data() {
		this.platforms = new ArrayList<Platform>();
	}

	public static synchronized Data get() {
		if (singletonFactory == null) {
			singletonFactory = new Data();
		}
		return singletonFactory;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	//  Platform  ---
	public Platform GetPlatform(ILaunchConfiguration launchConfiguration) {
		String ip = "";
		String user = "";
		String password = "";
		try {
			ip = launchConfiguration.getAttribute(P_IP, "");
		} catch (CoreException e) {
		} 
		try {
			user = launchConfiguration.getAttribute(P_USER, "");
		} catch (CoreException e) {
		} 
		try {
			password = launchConfiguration.getAttribute(P_PASSWORD, "");
		} catch (CoreException e) {
		}
		
		return Platform.get(ip, user, password);
	}

	public Collection<Platform> getPlatforms() {
		platforms.clear();
		ILaunchConfiguration[] configs;
		try {
			configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations();
			for(int i = 0; i < configs.length; ++i) {
				Platform p = GetPlatform(configs[i]);
				if (!platforms.contains(p))
					platforms.add(p);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return platforms;
	}
}
