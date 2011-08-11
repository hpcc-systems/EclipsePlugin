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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.statements.Statement;

public abstract class OctaveStatement extends Statement {

	protected List<ASTNode> children;
	
	protected OctaveStatement() {
		children = new ArrayList<ASTNode>();
	}
	
	public int getKind() {
		return 0;
	}

	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			Iterator<ASTNode> i = children.iterator();
			while (i.hasNext()) {
				i.next().traverse(visitor);
			}
			visitor.endvisit(this);
		}	
	}
	
}
