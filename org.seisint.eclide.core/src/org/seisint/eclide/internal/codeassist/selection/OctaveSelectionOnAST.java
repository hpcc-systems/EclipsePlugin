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
package org.seisint.eclide.internal.codeassist.selection;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.references.SimpleReference;

public class OctaveSelectionOnAST extends SimpleReference {

	ASTNode unit;
	
	public OctaveSelectionOnAST(ASTNode unit) {
		super(unit.sourceStart(),unit.sourceEnd(),"");
		this.unit = unit;
	}

	public ASTNode getNode() {
		return unit;
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
package org.seisint.eclide.internal.codeassist.selection;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.references.SimpleReference;

public class OctaveSelectionOnAST extends SimpleReference {

	ASTNode unit;
	
	public OctaveSelectionOnAST(ASTNode unit) {
		super(unit.sourceStart(),unit.sourceEnd(),"");
		this.unit = unit;
	}

	public ASTNode getNode() {
		return unit;
	}
	
}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
