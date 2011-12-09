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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Stack;

public class DataSingletonCollection extends Observable {
	Map<Integer, DataSingleton> items;
	CollectionDelta notificationDelta;
	int notifcationDepth;

	public DataSingletonCollection() {
		items = new HashMap<Integer, DataSingleton>();
		notificationDelta = null;
		notifcationDepth = 0;
	}
	
	protected synchronized DataSingleton get(DataSingleton item) {
		if (items.containsKey(item.hashCode())) {
			return items.get(item.hashCode());
		} else {
			try {
				pushTransaction("DataSingletonCollection.get");
				items.put(item.hashCode(), item);
				setChanged();
			} finally {
				popTransaction();
			}
		}
		return item;
	}

	protected synchronized DataSingleton getNoCreate(DataSingleton item) {
		if (items.containsKey(item.hashCode())) {
			return items.get(item.hashCode());
		}
		return null;
	}

	public synchronized Collection<DataSingleton> getAll() {
		return items.values();
	}
	
	public synchronized void pushTransaction(String cause) {
		if (notifcationDepth == 0) {
			notificationDelta = new CollectionDelta(cause, items.values());
		}
		++notifcationDepth;
	}

	public synchronized void popTransaction() {
		--notifcationDepth;
		if (notifcationDepth == 0) {
			notifyObservers(notificationDelta.calcChanges(items.values()));
			notificationDelta = null;
		}
	}
}
