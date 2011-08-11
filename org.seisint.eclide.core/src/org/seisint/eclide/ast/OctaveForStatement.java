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

import java.util.Iterator;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

public class OctaveForStatement extends OctaveStatement {

	OctaveASTListNode lhs;
	
	public OctaveForStatement(Expression lhs, Expression expr,
			OctaveASTListNode list) {
		super();
		this.lhs = new OctaveASTListNode(); 
		this.lhs.addNode(lhs);
		children.add(expr);
		children.addAll(list.getChilds());
	}
	
	public OctaveForStatement(OctaveASTListNode lhs, Expression expr,
			OctaveASTListNode list) {
		super();
		this.lhs = lhs;
		children.add(expr);
		children.addAll(list.getChilds());
	}

	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (lhs != null) {
				lhs.traverse(visitor);
			}
			Iterator i = children.iterator();
			while (i.hasNext()) {
				((ASTNode)i.next()).traverse(visitor);
			}
			visitor.endvisit(this);
		}
	}

	public int getKind() {
		return S_FOR;
	}

}
