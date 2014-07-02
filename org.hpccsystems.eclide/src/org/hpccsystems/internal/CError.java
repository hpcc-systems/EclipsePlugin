package org.hpccsystems.internal;

import org.eclipse.core.runtime.IPath;

public class CError {
	public int severity;
	public String code;
	public String message;
	public IPath errorPath;
	public int lineNumber;
	public int colNumber;
	
	public boolean valid = false;
}