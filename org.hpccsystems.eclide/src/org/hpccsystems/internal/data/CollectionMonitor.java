package org.hpccsystems.internal.data;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMonitor {
	private ArrayList<DataSingleton> before;
	
	protected String cause;
	protected ArrayList<DataSingleton> added;
	protected ArrayList<DataSingleton> unchanged;
	protected ArrayList<DataSingleton> removed;
	
	<T extends DataSingleton> CollectionMonitor(String cause, Collection<T> before) {
		this.cause = cause;
		this.before = new ArrayList<DataSingleton>(before);
	}
	
	<T extends DataSingleton> CollectionMonitor calcChanges(Collection<T> after) {
		this.added = new ArrayList<DataSingleton>();
		this.unchanged = new ArrayList<DataSingleton>();
		this.removed = new ArrayList<DataSingleton>(before);
		for (T item : after) {
			if (removed.contains(item)) {
				unchanged.add(item);
				removed.remove(item);
			} else {
				added.add(item);
			}
		}
		return this;
	}
	
	boolean hasChanged() {
		return removed.isEmpty() && added.isEmpty();
	}
	
	public boolean exists(DataSingleton item) {
		return added.contains(item) || unchanged.contains(item);
	}

	public String getCause() {
		return cause;
	}

	public boolean removeContains(Workunit workunit) {
		return removed.contains(workunit);
	}
	
	public ArrayList<DataSingleton> getAdded() {
		return added;
	}
}
