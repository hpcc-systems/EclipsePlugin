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

import java.util.List;


import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.internal.codeassist.select.SelectionNodeFound;
import org.seisint.eclide.ast.OctaveFunctionStatement;
import org.seisint.eclide.ast.OctaveStatement;
import org.seisint.eclide.internal.codeassist.OctaveAssistParser;

public class OctaveSelectionParser extends OctaveAssistParser {

	public void handleNotInElement(ASTNode unit, int position) {
		ASTNode nde = new OctaveSelectionOnAST(unit);
		throw new SelectionNodeFound(nde);
	}

	public void parseBlockStatements(ASTNode node, ASTNode unit, int position) {
		if (node instanceof OctaveStatement) {
			OctaveStatement statement = (OctaveStatement) node;
			List expressions = statement.getChilds();
			int len = expressions.size();
			boolean first = false;
			ASTNode completionNode = null;
			String completionToken = null;
			for (int i = 0; i < len; ++i) {
				ASTNode n = (ASTNode) expressions.get(i);
				if (n.sourceStart() <= position && n.sourceEnd() >= position) {
					if (i == 0) {
						first = true;
					}
					completionNode = n;
				}
			}
			if (completionNode instanceof OctaveStatement) {
				List s = completionNode.getChilds();
				if (s != null) {
					int slen = s.size();
					for (int u = 0; u < slen; ++u) {
						ASTNode n = (ASTNode) s.get(u);
						if (n != null && n.sourceStart() <= position
								&& n.sourceEnd() >= position) {
							parseBlockStatements(n, unit, position);
						}
					}
				}
				handleNotInElement(unit, position);
			}
			if (completionToken != null && completionNode != null && first) {
				ASTNode nde = new OctaveSelectionOnIdentifierOrKeyword(
						completionToken, completionNode, node);
				this.parent = unit;
				throw new SelectionNodeFound(nde);
			}
		} else if (node instanceof OctaveFunctionStatement) {
			OctaveFunctionStatement func = (OctaveFunctionStatement)node;
			List statements = func.getStatements();
			boolean inStatement = false;
			if (func.getNameStart() <= position
					&& func.getNameEnd() >= position) {
				ASTNode nde = new OctaveSelectionOnAST(func);
				this.parent = unit;
				throw new SelectionNodeFound(nde);
			}
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
				this.handleNotInElement(func, position);
			}
		}
	}

}
