/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.codeassist.selection;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.references.SimpleReference;

public class OctaveSelectionOnIdentifierOrKeyword extends SimpleReference {

	ASTNode unit;
	
	public OctaveSelectionOnIdentifierOrKeyword(String completionToken,
			ASTNode completionNode, ASTNode node) {
		super(completionNode.sourceStart(), completionNode.sourceEnd(),
				completionToken);
		unit = node;
	}

	public ASTNode getNode() {
		return unit;
	}
	
}
