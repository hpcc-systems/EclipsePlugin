/*******************************************************************************
 * Copyright (c) 2007, 2008 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.ast;

public class OctaveAnonFunctionHandleExpression extends OctaveExpression {
	
	String name;
	
	public OctaveAnonFunctionHandleExpression(OctaveASTListNode exprs,
			OctaveStatement stmt) {
		super();
		nodes.addAll(exprs.getChilds());
		nodes.add(stmt);
		setStart(exprs.sourceStart());
		setEnd(stmt.sourceEnd());
		this.name = "Anonymous$" + sourceStart();
	}
	
	public OctaveAnonFunctionHandleExpression(OctaveASTListNode exprs,
			OctaveASTListNode stmts) {
		super();
		nodes.addAll(exprs.getChilds());
		nodes.addAll(stmts.getChilds());
		setStart(exprs.sourceStart());
		setEnd(stmts.sourceEnd());
		this.name = "Anonymous$" + sourceStart();
	}

	public int getKind() {
		return OctaveASTConstants.ANON_FUNCTION_HANDLE_EXPR;
	}

	public String getName() {
		return name;
	}
	
}
