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


import org.eclipse.dltk.ast.expressions.Expression;
import org.seisint.eclide.internal.parser.OctaveToken;

public class OctavePostfixExpression extends OctaveExpression {
	
	public OctavePostfixExpression(Expression node, OctaveToken token) {
		super();
		nodes.add(node);
		nodes.add(token);
		this.setStart(node.sourceStart());
		this.setEnd(token.getCharacter() + token.toString().length());
	}

	public int getKind() {
		return OctaveASTConstants.POSTFIX_EXPR;
	}

	public OctaveToken getToken() {
		return (OctaveToken)nodes.get(1);
	}
	
}
