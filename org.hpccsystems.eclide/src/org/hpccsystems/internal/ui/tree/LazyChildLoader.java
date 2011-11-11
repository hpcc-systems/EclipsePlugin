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
	
	public void clearState() {
		this.state = CalcState.UNKNOWN;
	}
	
	public CalcState getState() {
		return state;
	}
	
	public void set(Object[] children) {
		this.children = children;
		state = CalcState.FINISHED;
	}
	
	public Object[] get() {
		return children;
	}

	public int getCount() {
		return children != null ? children.length : 0;
	}

	public void start(final Runnable childrenFetcher) {
		state = CalcState.STARTED;
		Thread thread = new Thread(childrenFetcher);
		thread.start();
	}
}

