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

