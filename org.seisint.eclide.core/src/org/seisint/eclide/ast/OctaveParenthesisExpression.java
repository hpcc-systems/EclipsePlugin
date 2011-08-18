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
import org.eclipse.dltk.ast.expressions.ExpressionConstants;

public class OctaveParenthesisExpression extends OctaveExpression {

	public OctaveParenthesisExpression(Expression node) {
		super();
		nodes.add(node);
		this.setStart(node.sourceStart());
		this.setEnd(node.sourceEnd());
	}

	public int getKind() {
		return ExpressionConstants.E_PAREN;
	}

}
