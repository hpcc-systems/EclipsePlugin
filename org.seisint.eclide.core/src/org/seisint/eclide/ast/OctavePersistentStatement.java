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

import java.util.Iterator;

import org.eclipse.dltk.ast.Modifiers;

public class OctavePersistentStatement extends OctaveStatement {
	
	public OctavePersistentStatement(OctaveASTListNode list) {
		children.addAll(list.getChilds());
		Iterator i = children.iterator();
		while(i.hasNext()) {
			OctaveVariableDeclaration decl = (OctaveVariableDeclaration)i.next();
			decl.setModifier(Modifiers.AccStatic);
		}
		setStart(list.sourceStart());
		setEnd(list.sourceEnd());
	}

	public int getKind() {
		return OctaveASTConstants.PERSIST_ST;
	}

}
