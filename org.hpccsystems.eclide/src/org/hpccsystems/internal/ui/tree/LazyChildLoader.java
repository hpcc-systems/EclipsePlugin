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

