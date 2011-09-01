<<<<<<< HEAD
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
package org.seisint.eclide.internal.codeassist.completion;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.references.SimpleReference;
import org.eclipse.dltk.codeassist.complete.ICompletionOnKeyword;
import org.eclipse.dltk.utils.CorePrinter;

public class OctaveCompletionOnIdentifierOrKeyword extends SimpleReference implements ICompletionOnKeyword {

	private String[] possibleKeywords;
	
	public OctaveCompletionOnIdentifierOrKeyword(String token, 
			ASTNode completionNode, ASTNode node, String[] possibleKeywords) {
		super(completionNode.sourceStart(), completionNode.sourceEnd(), token);
		this.possibleKeywords = possibleKeywords;
	}

	public boolean canCompleteEmptyToken() {
		return true;
	}

	public String[] getPossibleKeywords() {
		return possibleKeywords;
	}

	public char[] getToken() {
		return getName().toCharArray();
	}
	
	public void printNode(CorePrinter output) {
	}

	public void traverse(ASTVisitor pVisitor) throws Exception {
	}

}
=======
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
package org.seisint.eclide.internal.codeassist.completion;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.references.SimpleReference;
import org.eclipse.dltk.codeassist.complete.ICompletionOnKeyword;
import org.eclipse.dltk.utils.CorePrinter;

public class OctaveCompletionOnIdentifierOrKeyword extends SimpleReference implements ICompletionOnKeyword {

	private String[] possibleKeywords;
	
	public OctaveCompletionOnIdentifierOrKeyword(String token, 
			ASTNode completionNode, ASTNode node, String[] possibleKeywords) {
		super(completionNode.sourceStart(), completionNode.sourceEnd(), token);
		this.possibleKeywords = possibleKeywords;
	}

	public boolean canCompleteEmptyToken() {
		return true;
	}

	public String[] getPossibleKeywords() {
		return possibleKeywords;
	}

	public char[] getToken() {
		return getName().toCharArray();
	}
	
	public void printNode(CorePrinter output) {
	}

	public void traverse(ASTVisitor pVisitor) throws Exception {
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
