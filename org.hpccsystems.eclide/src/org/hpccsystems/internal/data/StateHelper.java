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
