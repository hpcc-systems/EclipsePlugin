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
import java.util.Collections;
import java.util.Comparator;

public class LazyChildLoader<T> {
	public enum CalcState {
		UNKNOWN,
		STARTED,
		FINISHED
	}

	private CalcState state;
	private ArrayList<T> children;

	public LazyChildLoader() {
		this.state = CalcState.UNKNOWN;
		this.children = new ArrayList<T>();
	}

	public synchronized void clear() {
		state = CalcState.UNKNOWN;
		this.children.clear();
	}

	public synchronized void setState(CalcState state) {
		this.state = state;
	}

	public synchronized CalcState getState() {
		return state;
	}

	public synchronized void set(T[] children) {
		this.children.clear();
		if (children != null) {
			for (T o : children)
				this.children.add(o);
		}
		state = CalcState.FINISHED;
	}

	public synchronized Object[] get() {
		return children.toArray().clone();
	}

	public synchronized void add(T newChild) {
		this.children.add(newChild);
		state = CalcState.FINISHED;
	}

	public synchronized void add(T[] newChildren) {
		if (newChildren != null) {
			for (T o : newChildren)
				this.children.add(o);
		}
		state = CalcState.FINISHED;
	}

	public synchronized void remove(T[] oldChildren) {
		if (oldChildren != null) {
			for (T o : oldChildren)
				this.children.remove(o);
		}
	}

	public synchronized void remove(T oldChild) {
		this.children.remove(oldChild);
	}

	public synchronized int getCount() {
		return children != null ? children.size() : 0;
	}

	public synchronized void start(final Runnable childrenFetcher) {
		assert(state == CalcState.UNKNOWN);
		state = CalcState.STARTED;
		Thread thread = new Thread(childrenFetcher);
		thread.start();
	}

	public synchronized void sort(Comparator<T> comparator) {
		Collections.sort(children, comparator);
	}
}

