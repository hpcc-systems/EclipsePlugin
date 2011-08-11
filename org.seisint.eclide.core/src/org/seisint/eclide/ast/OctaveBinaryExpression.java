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

public class OctaveBinaryExpression extends OctaveExpression {
	
	public OctaveBinaryExpression(Expression first, OctaveToken token,
			Expression second) {
		super();
		nodes.add(first);
		nodes.add(token);
		nodes.add(second);
		setStart(first.sourceStart());
		setEnd(second.sourceEnd());
	}

	public int getKind() {
		return OctaveASTConstants.BINARY_EXPR;
	}

	public OctaveToken getToken() {
		return (OctaveToken)nodes.get(1);
	}
	
	public String toString() {
		return nodes.get(0).toString() + nodes.get(1).toString() + nodes.get(2).toString();
	}
}
