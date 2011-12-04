package org.hpccsystems.internal.data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Stack;

public class DataSingletonCollection<T> extends Observable {
	Map<Integer, T> items;
	Stack<String> notificationStack; 

	public DataSingletonCollection() {
		items = new HashMap<Integer, T>();
		notificationStack = new Stack<String>();
	}
	
	protected synchronized T get(T item) {
		if (items.containsKey(item.hashCode())) {
			return items.get(item.hashCode());
		} else {
			if (notificationStack.empty()) {
				try {
					pushTransaction("DataSingletonCollection.get");
					items.put(item.hashCode(), item);
					setChanged();
				} finally {
					popTransaction();
				}
			}
			else {
				items.put(item.hashCode(), item);
				setChanged();
			}
		}
		return item;
	}

	public synchronized Collection<T> getAll() {
		return items.values();
	}
	
	public synchronized void pushTransaction(String cause) {
		notificationStack.push(cause);
	}

	public synchronized void popTransaction() {
		String cause = notificationStack.pop();
		if (notificationStack.empty()) {
			notifyObservers(cause);
		}
	}
}
