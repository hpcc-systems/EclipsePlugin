/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw
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

public class OctaveColonExpression extends org.seisint.eclide.ast.OctaveExpression {

	public OctaveColonExpression(Expression first) 
	{
		super();
		nodes.add(first);
		setStart(first.sourceStart());
		setEnd(first.sourceEnd());
	}
	
	public void addNode(Expression next)
	{
		nodes.add(next);
		setEnd(next.sourceEnd());
	}
	
	public int getKind() {
		return OctaveASTConstants.COLON_EXPR;
	}

}
