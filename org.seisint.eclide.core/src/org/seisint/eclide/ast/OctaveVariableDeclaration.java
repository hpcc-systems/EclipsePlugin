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
package org.seisint.eclide.ast;

import org.eclipse.dltk.ast.declarations.FieldDeclaration;
import org.eclipse.dltk.ast.expressions.Expression;

public class OctaveVariableDeclaration extends FieldDeclaration {
	OctaveIdentifier ident;
	Expression expr;
	
	public OctaveVariableDeclaration(OctaveIdentifier ident) {
		super(ident.getText(), ident.sourceStart(), ident.sourceEnd(),
				ident.sourceStart(), ident.sourceEnd());
		this.ident = ident;
		this.expr = null;
	}
	
	public OctaveVariableDeclaration(OctaveIdentifier ident, Expression assignment) {
		super(ident.getText(), ident.sourceStart(), ident.sourceEnd(),
				ident.sourceStart(), ident.sourceEnd());
		this.ident = ident;
		this.expr = assignment;
	}

	public OctaveIdentifier getId() {
		return ident;
	}
	
	public Expression getExpression() {
		return expr;
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
package org.seisint.eclide.ast;

import org.eclipse.dltk.ast.declarations.FieldDeclaration;
import org.eclipse.dltk.ast.expressions.Expression;

public class OctaveVariableDeclaration extends FieldDeclaration {
	OctaveIdentifier ident;
	Expression expr;
	
	public OctaveVariableDeclaration(OctaveIdentifier ident) {
		super(ident.getText(), ident.sourceStart(), ident.sourceEnd(),
				ident.sourceStart(), ident.sourceEnd());
		this.ident = ident;
		this.expr = null;
	}
	
	public OctaveVariableDeclaration(OctaveIdentifier ident, Expression assignment) {
		super(ident.getText(), ident.sourceStart(), ident.sourceEnd(),
				ident.sourceStart(), ident.sourceEnd());
		this.ident = ident;
		this.expr = assignment;
	}

	public OctaveIdentifier getId() {
		return ident;
	}
	
	public Expression getExpression() {
		return expr;
	}
	
}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
