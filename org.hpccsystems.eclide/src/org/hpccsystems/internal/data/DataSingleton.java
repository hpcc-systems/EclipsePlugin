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

import java.util.Observable;

public abstract class DataSingleton extends Observable{
	static final int MONITOR_SLEEP = 1000;

	Thread monitorThread;

	DataSingleton() {
		this.monitorThread = null;
	}
	
	void monitor() {
		monitor(MONITOR_SLEEP);
	}
	
	synchronized void monitor(final int sleepTime) {
		if (isComplete()) 
			return;
		
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
							if (isComplete())
								fullRefresh();
						}
					}
				}
			});
			monitorThread.start();
		}
	}

	abstract void fastRefresh();
	abstract void fullRefresh();
	abstract boolean isComplete();
}
