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
package org.seisint.eclide.core;


import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.declarations.TypeDeclaration;
import org.eclipse.dltk.compiler.env.ISourceModule;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.ISourceElementParser;
import org.eclipse.dltk.core.SourceParserUtil;
import org.eclipse.dltk.core.ISourceModuleInfoCache.ISourceModuleInfo;
import org.eclipse.dltk.core.search.matching.MatchLocator;
import org.eclipse.dltk.core.search.matching.MatchLocatorParser;
import org.eclipse.dltk.core.search.matching.PatternLocator;
import org.eclipse.dltk.core.search.matching.PossibleMatch;
import org.eclipse.dltk.internal.core.ModelManager;
import org.seisint.eclide.ast.OctaveSymbolCallExpression;
import org.seisint.eclide.ast.OctaveSymbolReference;
import org.seisint.eclide.ast.OctaveTranslationUnit;
import org.seisint.eclide.ast.OctaveVariableDeclaration;

@SuppressWarnings("restriction")
public class OctaveMatchLocatorParser extends MatchLocatorParser {
	
	public OctaveMatchLocatorParser(MatchLocator locator) {
		super(locator);
	}
	
	protected void processStatement(ASTNode node, PatternLocator locator) {
		if (node == null) {
			return;
		}
		if (node instanceof OctaveVariableDeclaration) {
			locator.match((OctaveVariableDeclaration)node, this.getNodeSet());
		} else if (node instanceof OctaveSymbolReference) {
			locator.match((OctaveSymbolReference)node, this.getNodeSet());
		} else if (node instanceof OctaveSymbolCallExpression) {
			locator.match((OctaveSymbolCallExpression)node, this.getNodeSet());
		}
	}


	public TypeDeclaration processType(TypeDeclaration t) {
		return super.processType(t);
	}

	public String getNatureId() {
		return OctaveNature.NATURE_ID;
	}
	
}
