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
package org.hpccsystems.internal.ui.tree;

import java.util.ArrayList;

public class LazyChildLoader {
	public enum CalcState {
		UNKNOWN,
		STARTED,
		FINISHED
	}

	private CalcState state;
	private Object[] children;
	
	public LazyChildLoader() {
		this.state = CalcState.UNKNOWN;
		this.children = new ArrayList<Object>().toArray();
	}
	
	public synchronized void clearState() {
		state = CalcState.UNKNOWN;
	}
	
	public synchronized CalcState getState() {
		return state;
	}
	
	public synchronized void set(Object[] children) {
		this.children = children;
		state = CalcState.FINISHED;
	}
	
	public synchronized Object[] get() {
		return children;
	}

	public synchronized int getCount() {
		return children != null ? children.length : 0;
	}

	public synchronized void start(final Runnable childrenFetcher) {
		assert(state == CalcState.UNKNOWN);
		state = CalcState.STARTED;
		Thread thread = new Thread(childrenFetcher);
		thread.start();
	}
}

