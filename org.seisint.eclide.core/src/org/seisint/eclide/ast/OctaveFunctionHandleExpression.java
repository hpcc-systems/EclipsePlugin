/*******************************************************************************
 * Copyright (c) 2007, 2010 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.ast;


public class OctaveFunctionHandleExpression extends OctaveExpression {

	OctaveIdentifier id;
	public OctaveFunctionHandleExpression(OctaveIdentifier octaveIdentifier) {
		super();
		nodes.add(id);
	}

	public int getKind() {
		return OctaveASTConstants.FUNCTION_HANDLE_EXPR;
	}

	public OctaveIdentifier getId() {
		return id;
	}

}
