<<<<<<< HEAD
/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.runtime.symbols;

public class Symbol {
	
	private String name;
	private String dims;
	private long   size;
	private String typename;
	private String helptext;
	private long   flags;
	private String value;
	private long   version;
	
	public static final long USER_FUNCTION = 1;
	public static final long USER_VARIABLE = 2;
	public static final long BUILTIN_FUNCTION = 8;
	public static final long COMMAND = 16;
	
	public Symbol() {
		
	}
	
	public String getName() {
		return name;
	}

	public String getDims() {
		return dims;
	}

	public long getSize() {
		return size;
	}

	public String getTypeName() {
		return typename;
	}
	
	public String getValue() {
		return value;
	}

	public String getHelpText() {
		return helptext;
	}

	public long getFlags() {
		return flags;
	}
	
	public long getVersion() {
		return version;
	}

}
=======
/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.runtime.symbols;

public class Symbol {
	
	private String name;
	private String dims;
	private long   size;
	private String typename;
	private String helptext;
	private long   flags;
	private String value;
	private long   version;
	
	public static final long USER_FUNCTION = 1;
	public static final long USER_VARIABLE = 2;
	public static final long BUILTIN_FUNCTION = 8;
	public static final long COMMAND = 16;
	
	public Symbol() {
		
	}
	
	public String getName() {
		return name;
	}

	public String getDims() {
		return dims;
	}

	public long getSize() {
		return size;
	}

	public String getTypeName() {
		return typename;
	}
	
	public String getValue() {
		return value;
	}

	public String getHelpText() {
		return helptext;
	}

	public long getFlags() {
		return flags;
	}
	
	public long getVersion() {
		return version;
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
