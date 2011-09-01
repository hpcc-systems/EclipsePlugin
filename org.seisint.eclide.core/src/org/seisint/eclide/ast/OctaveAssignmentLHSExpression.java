<<<<<<< HEAD
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

import org.eclipse.dltk.ast.expressions.Expression;

public class OctaveAssignmentLHSExpression extends OctaveExpression {

	public OctaveAssignmentLHSExpression(Expression expr) {
		super();
		nodes.add(expr);
		setStart(expr.sourceStart());
		setEnd(expr.sourceEnd());
	}

	public int getKind() {
		return E_ASSIGN;
	}
	
	public String toString() {
		return nodes.get(0).toString();
	}
	
}
=======
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

import org.eclipse.dltk.ast.expressions.Expression;

public class OctaveAssignmentLHSExpression extends OctaveExpression {

	public OctaveAssignmentLHSExpression(Expression expr) {
		super();
		nodes.add(expr);
		setStart(expr.sourceStart());
		setEnd(expr.sourceEnd());
	}

	public int getKind() {
		return E_ASSIGN;
	}
	
	public String toString() {
		return nodes.get(0).toString();
	}
	
}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
