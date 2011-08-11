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
package org.seisint.eclide.internal.codeassist;


import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.parser.ISourceParser;
import org.eclipse.dltk.codeassist.AssistParser;
import org.eclipse.dltk.codeassist.IAssistParser;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.seisint.eclide.core.OctaveNature;

public abstract class OctaveAssistParser implements IAssistParser {

	protected ModuleDeclaration unit;
	protected ASTNode parent;
	protected ISourceParser parser = null;
	
	public OctaveAssistParser() {
		parser = DLTKLanguageManager.getSourceParser(OctaveNature.NATURE_ID);
	}
	
	public ASTNode getAssistNodeParent() {
		return parent;
	}
	
	public ModuleDeclaration parse(IModuleSource sourceUnit) {
		unit = (ModuleDeclaration) this.parser.parse(sourceUnit, null);
		unit.rebuild();
		return unit;
	}
	
	public void setSource(ModuleDeclaration unit) {
		this.unit = unit;
	}

	public ModuleDeclaration getModule() {
		return unit;
	}

	public String getNatureId() {
		return OctaveNature.NATURE_ID;
	}
	
}
