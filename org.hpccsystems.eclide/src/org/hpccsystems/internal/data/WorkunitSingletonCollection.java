package org.hpccsystems.internal.data;

public class WorkunitSingletonCollection extends DataSingletonCollection<Workunit> {
	public synchronized Workunit get(Platform platform, String wuid) {
		if (wuid == null || wuid.isEmpty())
			return null;
		
		return get(new Workunit(platform, wuid));
	}
};
