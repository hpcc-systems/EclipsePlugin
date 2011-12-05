package org.hpccsystems.internal.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDelta {
	private ArrayList<DataSingleton> before;
	private ArrayList<DataSingleton> after;
	
	protected String cause;
	protected ArrayList<DataSingleton> added;
	protected ArrayList<DataSingleton> unchanged;
	protected ArrayList<DataSingleton> removed;
	
	public CollectionDelta(String cause) {
		this.cause = cause;
		this.before = new ArrayList<DataSingleton>();
	}

	public <T extends DataSingleton> CollectionDelta(String cause, Collection<T> before) {
		this.cause = cause;
		this.before = new ArrayList<DataSingleton>(before);
	}
	
	public <T extends DataSingleton> CollectionDelta calcChanges(T[] after) {
		return calcChanges(new ArrayList<T>(Arrays.asList(after)));		
	}
	
	public <T extends DataSingleton> CollectionDelta calcChanges(Collection<T> after) {
		this.after = new ArrayList<DataSingleton>(after);
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
	
	public boolean hasChanged() {
		return !removed.isEmpty() || !added.isEmpty();
	}
	
	public boolean exists(DataSingleton item) {
		return added.contains(item) || unchanged.contains(item);
	}

	public String getCause() {
		return cause;
	}

	public boolean removeContains(DataSingleton item) {
		return removed.contains(item);
	}
	
	public ArrayList<DataSingleton> getAdded() {
		return added;
	}
}
