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
import org.eclipse.dltk.ast.expressions.Expression;

public class OctaveIfStatement extends OctaveStatement {
	
	public static class OctaveElseClause extends ASTNode {
		
		List children;
		
		public void traverse(ASTVisitor visitor) throws Exception {
			if (visitor.visit(this)) {
				Iterator i = children.iterator();
				while (i.hasNext()) {
					((ASTNode)i.next()).traverse(visitor);
				}
				visitor.endvisit(this);
			}	
		}
		
		public OctaveElseClause(OctaveASTListNode if_c) {
			children = new ArrayList();
			children.addAll(if_c.getChilds());
		}
		
	}
	
	public static class OctaveElseIfClause extends ASTNode {
		
		List children;
		
		public void traverse(ASTVisitor visitor) throws Exception {
			if (visitor.visit(this)) {
				Iterator i = children.iterator();
				while (i.hasNext()) {
					((ASTNode)i.next()).traverse(visitor);
				}
				visitor.endvisit(this);
			}	
		}
		
		public OctaveElseIfClause(Expression expr, OctaveASTListNode if_c) {
			children = new ArrayList();
			children.add(expr);
			children.addAll(if_c.getChilds());
		}
		
	}

	public OctaveIfStatement(Expression expr, OctaveASTListNode if_c, 
				OctaveASTListNode else_c) {
		super();
		children.add(expr);
		children.addAll(if_c.getChilds());
		children.addAll(else_c.getChilds());
	}

	public void addElseClause(ASTNode else_c) {
		children.add(else_c);
		setEnd(else_c.sourceEnd());
	}

	public int getKind() {
		return S_IF;
	}
	
}
