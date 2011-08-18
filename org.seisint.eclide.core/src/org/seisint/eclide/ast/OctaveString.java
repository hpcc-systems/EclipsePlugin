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
import org.eclipse.dltk.ast.expressions.StringLiteral;
import org.seisint.eclide.internal.parser.OctaveToken;

public class OctaveString extends StringLiteral {

	OctaveToken token;
	
	public OctaveString(OctaveToken tok) {
		super(tok);
		this.token = tok;
		setStart(tok.getCharacter());
		setEnd(tok.getCharacter() + tok.toString().length());
	}

	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {			
			visitor.endvisit(this);
		}
	}

	public OctaveToken getToken() {
		return token;
	}
	
}
