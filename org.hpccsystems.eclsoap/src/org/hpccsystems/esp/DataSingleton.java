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
package org.hpccsystems.esp;

import java.util.Observable;

public abstract class DataSingleton extends Observable {
	static final int MONITOR_SLEEP = 1000;

	Thread monitorThread;

	protected DataSingleton() {
		monitorThread = null;
	}

	protected void monitor() {
		monitor(MONITOR_SLEEP);
	}

	synchronized void monitor(final int sleepTime) {
		if (isComplete()) {
			return;
		}

		if (monitorThread == null || !monitorThread.isAlive()) {
			monitorThread = new Thread(new Runnable() {
				private int timerTickCount = 0;

				@Override
				public void run() {
					while (!isComplete()) {
						this.timerTickCount++;
						if (this.timerTickCount == 1) {
							this.refresh(true);
						} else if (this.timerTickCount < 5 && this.timerTickCount % 1 == 0) {
							this.refresh();
						} else if (this.timerTickCount < 30 && this.timerTickCount % 5 == 0) {
							this.refresh();
						} else if (this.timerTickCount < 60 && this.timerTickCount % 10 == 0) {
							this.refresh();
						} else if (this.timerTickCount < 120 && this.timerTickCount % 30 == 0) {
							this.refresh(true);
						} else if (this.timerTickCount % 60 == 0) {
							this.refresh(true);
						}
						try {
							Thread.sleep(sleepTime);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					monitorThread = null;
					this.timerTickCount = 0;
				}

				void refresh() {
					this.refresh(false);
				}

				void refresh(boolean full) {
					if (countObservers() > 0) {
						if (full || isComplete()) {
							fullRefresh();
						} else {
							fastRefresh();
						}
					}
				}
			});
			monitorThread.start();
		}
	}

	protected abstract boolean isComplete();

	protected abstract void fastRefresh();

	protected abstract void fullRefresh();

	@Override
	public abstract boolean equals(Object aThat);

	@Override
	public abstract int hashCode();
}
