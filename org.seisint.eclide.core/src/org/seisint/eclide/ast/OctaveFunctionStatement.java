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

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.declarations.MethodDeclaration;

public class OctaveFunctionStatement extends MethodDeclaration {

	OctaveFunctionDeclaration funcDecl; 
	
	public OctaveFunctionStatement(OctaveFunctionDeclaration funcDecl, OctaveASTListNode funcStatements) {
		super(funcDecl.getId().getText(), 
				funcDecl.getId().sourceStart(), funcDecl.getId().sourceEnd(),
				funcStatements.sourceStart(), funcStatements.sourceEnd());
		this.funcDecl = funcDecl;
		setBody(funcStatements);
		acceptArguments(funcDecl.getParamList());
	}

	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			funcDecl.traverse(visitor);
			if (getBody() != null) {
				getBody().traverse(visitor);
			}
		}
		visitor.endvisit(this);
	}

	public OctaveFunctionDeclaration getFuncDecl() {
		return funcDecl;
	}

}
