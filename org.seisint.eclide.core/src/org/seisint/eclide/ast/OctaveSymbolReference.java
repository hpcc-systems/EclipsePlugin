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
package org.seisint.eclide.ast;

import org.eclipse.dltk.ast.references.SimpleReference;

public class OctaveSymbolReference extends SimpleReference {

	OctaveIdentifier id ;
	
	/* An Octave symbol may be a function or a variable */
	public OctaveSymbolReference(OctaveIdentifier id) {
		super(id.sourceStart(), id.sourceEnd(), id.getText());
		this.id = id;
	}
	
	public OctaveIdentifier getId() {
		return id;
	}
	
}
