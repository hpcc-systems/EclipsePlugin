package org.seisint.eclide.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

public abstract class OctaveExpression extends Expression {

	List nodes;

	public OctaveExpression() {
		super();
		nodes = new ArrayList();
	}

	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			Iterator i = nodes.iterator();
			while (i.hasNext()) {
				Object o = i.next();
				if (o instanceof ASTNode) {
					((ASTNode)o).traverse(visitor);			
				}
			}
			visitor.endvisit(this);
		}
	}

}
