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

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.CallArgumentsList;
import org.eclipse.dltk.ast.expressions.CallExpression;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.expressions.ExpressionConstants;

public class OctaveSymbolCallExpression extends CallExpression {

	public static class OctaveDotCallExpression extends OctaveSymbolCallExpression {
		
		private boolean skipReceiver = false;
		
		public OctaveDotCallExpression(Expression expr, CallArgumentsList exprList) {
			super(expr, exprList);
		}	
		
		public void appendArg(CallArgumentsList exprList) {
			OctaveDotCallExpression parent = this;
			Object e = getArgs().getChilds().get(0);
			while (e instanceof OctaveDotCallExpression) {
				parent = (OctaveDotCallExpression)e;
				e = ((OctaveDotCallExpression)e).getArgs().getChilds().get(0);
			}
			Expression x = (Expression)parent.getArgs().getChilds().remove(0);
			parent.getArgs().addNode(new OctaveDotCallExpression(x, exprList));
		}
		
		public void traverse(ASTVisitor pVisitor) throws Exception {
			if( pVisitor.visit( this ) ) {
				if(receiver != null && !skipReceiver) {
					receiver.traverse( pVisitor );
				}
				if( getArgs() != null ) {
					getArgs().traverse( pVisitor );
				}
				pVisitor.endvisit( this );
			}
		}

		public void setSkipReceiver(boolean skipReceiver) {
			this.skipReceiver = skipReceiver;
		}
		
	}
	
	public OctaveSymbolCallExpression(Expression expr, CallArgumentsList exprList) {
		super(expr.sourceStart(), 
				expr.sourceEnd(), 
				(ASTNode)expr,
				expr.toString(),
				exprList);
	}
	
	public int getKind() {
		return ExpressionConstants.E_CALL;
	}

}
