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

import java.util.Observable;

public abstract class DataSingleton extends Observable {
	static final int MONITOR_SLEEP = 1000;

	Thread monitorThread;

	DataSingleton() {
		monitorThread = null;
	}

	void monitor() {
		monitor(MONITOR_SLEEP);
	}

	synchronized void monitor(final int sleepTime) {
		if (isComplete()) {
			return;
		}

		if (monitorThread == null || !monitorThread.isAlive()) {
			monitorThread = new Thread(new Runnable() {
				@Override
				public void run() {
					while(!isComplete()) {
						try {
							Thread.sleep(sleepTime);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						if (countObservers() > 0) {
							fastRefresh();
							if (isComplete()) {
								fullRefresh();
							}
						}
					}
					monitorThread = null;
				}
			});
			monitorThread.start();
		}
	}

	abstract boolean isComplete();
	abstract void fastRefresh();
	abstract void fullRefresh();

	@Override
	public abstract boolean equals(Object aThat);
	@Override
	public abstract int hashCode();
}
