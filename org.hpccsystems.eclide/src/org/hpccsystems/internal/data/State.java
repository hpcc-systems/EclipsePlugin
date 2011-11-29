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

public enum State {
	UNKNOWN,

	// Not started  ---
	SCHEDULED,
	SUBMITTED,

	// In motion  ---
	RUNNING,
	ABORTING,
	BLOCKED,
	WAIT,
	COMPILING,

	// Completed  ---
	COMPLETED,
	FAILED,
	ABORTED,
	ARCHIVED,
	COMPILED,

	LAST
}

