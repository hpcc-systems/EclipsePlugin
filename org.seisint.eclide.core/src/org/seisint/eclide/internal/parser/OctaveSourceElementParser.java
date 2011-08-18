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
package org.seisint.eclide.internal.parser;


import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.compiler.SourceElementRequestVisitor;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.AbstractSourceElementParser;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceElementParserExtension;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.parser.visitors.OctaveSourceElementRequestVisitor;

public class OctaveSourceElementParser extends AbstractSourceElementParser 
	implements ISourceElementParserExtension {

	private IScriptProject scriptProject = null;
	
	protected SourceElementRequestVisitor createVisitor() {
		return new OctaveSourceElementRequestVisitor(getRequestor());
	}
	
	public void parseSourceModule(
			IModuleSource module) {
		return;
		/*
		final ModuleDeclaration moduleDeclaration = parse(module);

		SourceElementRequestVisitor requestor = createVisitor();
		
		try {
//			IModelElement parent = module.getModelElement().getParent();
//			ISourceElementRequestor.TypeInfo ti = null;
//			IPath path = parent.getPath();
//			if (path.lastSegment().startsWith("@")) {
//				ti = new ISourceElementRequestor.TypeInfo();
//				ti.name = path.lastSegment().substring(1);
//				ti.nameSourceStart = moduleDeclaration.sourceStart();
//				ti.nameSourceEnd = moduleDeclaration.sourceStart();
//				ti.declarationStart = moduleDeclaration.sourceStart();
//				//getRequestor().enterType(ti);
//			}
			moduleDeclaration.traverse(requestor);
		} catch (Exception e) {
			if (DLTKCore.DEBUG) {
				e.printStackTrace();
			}
		}
		*/
	}

	protected String getNatureId() {
		return OctaveNature.NATURE_ID;
	}

	public void setScriptProject(IScriptProject project) {
		scriptProject = project;
	}
	
}
