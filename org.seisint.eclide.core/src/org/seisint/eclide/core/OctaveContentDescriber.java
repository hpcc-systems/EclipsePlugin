<<<<<<< HEAD
/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.core;

import java.util.regex.Pattern;

import org.eclipse.dltk.core.ScriptContentDescriber;

public class OctaveContentDescriber extends ScriptContentDescriber {

	protected final static Pattern[] header_patterns = {
		Pattern.compile("^#!.*octave.*",
				Pattern.MULTILINE),
		Pattern.compile(
				"^#!\\s*/bin/(ba|tc)?sh\\s*\r*\n#.*\\\\s*\r*\nexec .*octave.*",
				Pattern.MULTILINE),	
		Pattern.compile(
				"^#!\\s*/bin/(ba|tc)?sh\\s*\r*\n\\s*exec .*octave.* .*",
				Pattern.MULTILINE),
		Pattern.compile(
				"^#!\\s*/usr/bin/env\\s*octave.* .*",
				Pattern.MULTILINE)
	};
	
	protected Pattern[] getHeaderPatterns() {
		return header_patterns;
	}

}
=======
/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.core;

import java.util.regex.Pattern;

import org.eclipse.dltk.core.ScriptContentDescriber;

public class OctaveContentDescriber extends ScriptContentDescriber {

	protected final static Pattern[] header_patterns = {
		Pattern.compile("^#!.*octave.*",
				Pattern.MULTILINE),
		Pattern.compile(
				"^#!\\s*/bin/(ba|tc)?sh\\s*\r*\n#.*\\\\s*\r*\nexec .*octave.*",
				Pattern.MULTILINE),	
		Pattern.compile(
				"^#!\\s*/bin/(ba|tc)?sh\\s*\r*\n\\s*exec .*octave.* .*",
				Pattern.MULTILINE),
		Pattern.compile(
				"^#!\\s*/usr/bin/env\\s*octave.* .*",
				Pattern.MULTILINE)
	};
	
	protected Pattern[] getHeaderPatterns() {
		return header_patterns;
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
