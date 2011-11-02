package org.hpccsystems.internal.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;

public class Data {
	private static Data singletonFactory;
	
	private Map<Integer, Platform> Platforms;
	
	//  Singleton Pattern
	private Data() {
		Platforms = new HashMap<Integer, Platform>();
	}

	public static synchronized Data getDefault() {
		if (singletonFactory == null) {
			singletonFactory = new Data();
		}
		return singletonFactory;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	//  Platform  ---
	public synchronized Platform GetPlatform(ILaunchConfiguration launchConfiguration) {
		Platform platform = new Platform(this, launchConfiguration);
		if (Platforms.containsKey(platform.hashCode())) {
			return Platforms.get(platform.hashCode());
		}
		else {
			Platforms.put(platform.hashCode(), platform);
		}
		return platform;
	}

	public synchronized Collection<Platform> GetPlatforms() {
		ILaunchConfiguration[] configs;
		try {
			configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations();
			for(int i = 0; i < configs.length; ++i) {
				GetPlatform(configs[i]);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Platforms.values();
	}
}
