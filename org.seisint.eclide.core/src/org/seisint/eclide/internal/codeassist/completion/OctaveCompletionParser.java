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

import java.util.ArrayList;
import java.util.List;


import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.declarations.MethodDeclaration;
import org.eclipse.dltk.ast.references.SimpleReference;
import org.eclipse.dltk.codeassist.complete.CompletionNodeFound;
import org.seisint.eclide.ast.OctaveFunctionStatement;
import org.seisint.eclide.ast.OctaveStatement;
import org.seisint.eclide.ast.OctaveTranslationUnit;
import org.seisint.eclide.core.OctaveKeywordsManager;
import org.seisint.eclide.internal.codeassist.OctaveAssistParser;

public class OctaveCompletionParser extends OctaveAssistParser {
	public static class OctaveEmptyCompleteStatement extends OctaveStatement {
		public OctaveEmptyCompleteStatement(List<SimpleReference> expressions) {
			super();
			children.addAll(expressions);
		}
	}
	
	public void handleNotInElement(ASTNode unit, int position) {
		 if (unit instanceof MethodDeclaration) {
			OctaveFunctionStatement func = (OctaveFunctionStatement) unit;
			List<SimpleReference> exprs = new ArrayList<SimpleReference>();
			exprs.add(new SimpleReference(position, position, ""));
			OctaveEmptyCompleteStatement statement = new OctaveEmptyCompleteStatement(
					exprs);
			func.getStatements().add(statement);
			this.parseBlockStatements(statement, func, position);
		} else if (unit instanceof OctaveTranslationUnit) {
			OctaveTranslationUnit translationUnit = (OctaveTranslationUnit)unit;
			List<SimpleReference> exprs = new ArrayList<SimpleReference>();
			exprs.add(new SimpleReference(position, position, ""));
			OctaveEmptyCompleteStatement statement = new OctaveEmptyCompleteStatement(
					exprs);
			translationUnit.getStatements().add(statement);
			this.parseBlockStatements(statement, translationUnit, position);
		}
	}

	public void parseBlockStatements(ASTNode node, ASTNode unit, int position) {
		if (node instanceof OctaveStatement) {
			OctaveStatement statement = (OctaveStatement) node;
			List expressions = statement.getChilds();
			int len = expressions.size();
			ASTNode completionNode = null;
			String completionToken = null;
			for (int i = 0; i < len; ++i) {
				ASTNode n = (ASTNode) expressions.get(i);
				if (n.sourceStart() <= position && n.sourceEnd() >= position
						|| (node instanceof OctaveEmptyCompleteStatement)) {
					completionNode = n;
				}
			}
			this.parent = unit;
			ASTNode nde = new OctaveCompletionOnIdentifierOrKeyword(completionNode.toString(), node,
					unit, checkKeywords(1));
			throw new CompletionNodeFound(nde, null);
		} else if (node instanceof OctaveFunctionStatement) {
			OctaveFunctionStatement func = (OctaveFunctionStatement)node;
			List statements = func.getStatements();
			boolean inStatement = false;
			if (statements != null) {
				int length = statements.size();
				for (int i = 0; i < length; i++) {
					ASTNode nde = (ASTNode) statements.get(i);
					if (nde.sourceStart() <= position
							&& nde.sourceEnd() >= position) {
						inStatement = true;
						parseBlockStatements(nde, func, position);
					}
				}
			}
			if (!inStatement) {
				List args = func.getArguments();
				boolean inArgs = false;
				if (args != null) {
					int length = args.size();
					ASTNode completionNode = null;
					for (int i = 0; i < length; i++) {
						ASTNode nde = (ASTNode) args.get(i);
						if (nde.sourceStart() <= position
								&& nde.sourceEnd() >= position) {
							inArgs = true;
							completionNode = nde;
						}
					}
					if (completionNode != null)
					{
						ASTNode nde2 = new OctaveCompletionOnIdentifierOrKeyword(completionNode.toString(), node,
								unit, checkKeywords(1));
						throw new CompletionNodeFound(nde2, null);
					}
				}
				if (!inArgs) {
					this.handleNotInElement(func, position);
				}
			}
		}
	}

	private String[] checkKeywords(int i) {
		return OctaveKeywordsManager.getKeywords(i);
	}

}
