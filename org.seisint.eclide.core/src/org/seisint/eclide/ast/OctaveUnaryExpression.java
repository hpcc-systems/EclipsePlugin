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


import org.eclipse.dltk.ast.expressions.Expression;
import org.seisint.eclide.internal.parser.OctaveToken;

public class OctaveUnaryExpression extends OctaveExpression {

	public OctaveUnaryExpression(OctaveToken octaveToken, Expression expr) {
		super();
		nodes.add(octaveToken);
		nodes.add(expr);
		setStart(expr.sourceStart());
		setEnd(expr.sourceEnd());
		if (octaveToken.getCharacter() <= sourceStart())
			setStart(octaveToken.getCharacter());
		if (octaveToken.getCharacter() >= sourceEnd())
			setEnd(octaveToken.getCharacter());
	}

	public int getKind() {
		return OctaveASTConstants.UNARY_EXPR;
	}

	public OctaveToken getToken() {
		return (OctaveToken)nodes.get(0);
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


import org.eclipse.dltk.ast.expressions.Expression;
import org.seisint.eclide.internal.parser.OctaveToken;

public class OctaveUnaryExpression extends OctaveExpression {

	public OctaveUnaryExpression(OctaveToken octaveToken, Expression expr) {
		super();
		nodes.add(octaveToken);
		nodes.add(expr);
		setStart(expr.sourceStart());
		setEnd(expr.sourceEnd());
		if (octaveToken.getCharacter() <= sourceStart())
			setStart(octaveToken.getCharacter());
		if (octaveToken.getCharacter() >= sourceEnd())
			setEnd(octaveToken.getCharacter());
	}

	public int getKind() {
		return OctaveASTConstants.UNARY_EXPR;
	}

	public OctaveToken getToken() {
		return (OctaveToken)nodes.get(0);
	}
	
}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
