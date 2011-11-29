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

public class StateHelper {
	static boolean isCompleted(State state) {
		switch (state) {
		case COMPLETED:
		case FAILED:
		case ABORTED:
		case ARCHIVED:
		case COMPILED:
			return true;		
		}
		return false;
	}
}
