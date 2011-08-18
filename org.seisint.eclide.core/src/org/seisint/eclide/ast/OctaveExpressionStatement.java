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

public class OctaveExpressionStatement extends OctaveStatement {

	public OctaveExpressionStatement(Expression node) {
		super();
		children.add(node);
		setStart(node.sourceStart());
		setEnd(node.sourceEnd());
	}

	public int getKind() {
		return OctaveASTConstants.EXPR_ST;
	}

}
