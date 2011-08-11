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


import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Literal;
import org.seisint.eclide.internal.parser.OctaveToken;

public class OctaveConstant extends Literal {
	
	OctaveToken token;
	
	public OctaveConstant(OctaveToken val) {
		super(val);
		this.token = val;
		setStart(val.getCharacter());
		setEnd(val.getCharacter() + val.toString().length());
	}

	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {			
			visitor.endvisit(this);
		}
	}

	public int getKind() {
		return NUMBER_LITERAL;
	}
	
	public OctaveToken getToken() {
		return token;
	}

}
