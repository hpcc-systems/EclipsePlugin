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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.declarations.Argument;

public class OctaveFunctionDeclaration extends ASTNode {

	List returnList;
	OctaveIdentifier id;
	List paramList;
	
	public OctaveFunctionDeclaration(OctaveIdentifier octaveIdentifier, OctaveASTListNode paramList) {
		this.id = octaveIdentifier;
		this.paramList = new ArrayList();
		this.returnList = new ArrayList();
		setStart(octaveIdentifier.sourceStart());
		if (paramList != null) {
			Iterator i = paramList.getChilds().iterator();
			while(i.hasNext()) {
				Object o = i.next();
				OctaveIdentifier id = null;
				if (o instanceof OctaveIdentifier) {
					id = (OctaveIdentifier)o;
				} else if (o instanceof OctaveVariableDeclaration) {
					OctaveVariableDeclaration var = (OctaveVariableDeclaration)o;
					id = var.getId();
				}
				if (id != null)
					this.paramList.add(new Argument(id.getToken(), id.sourceStart(), 
						id.sourceEnd(), null));
			}
			setEnd(paramList.sourceEnd());
		} else {
			setEnd(octaveIdentifier.sourceEnd());
		}
	}

	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			Iterator i = returnList.iterator();
			while (i.hasNext()) {
				((ASTNode)i.next()).traverse(visitor);
			}
			if (id != null)
				id.traverse(visitor);
			Iterator i2 = paramList.iterator();
			while (i2.hasNext()) {
				((ASTNode)i2.next()).traverse(visitor);
			}
			visitor.endvisit(this);
		}
	}

	public void setReturnList(OctaveASTListNode value) {
		returnList.clear();
		Iterator i = value.getChilds().iterator();
		while(i.hasNext()) {
			Object o = i.next();
			if (o instanceof OctaveIdentifier) {
				this.returnList.add(new OctaveVariableDeclaration((OctaveIdentifier)o));
			}
		}
	}

	public OctaveIdentifier getId() {
		return id;
	}

	public List getReturnList() {
		return returnList;
	}

	public List getParamList() {
		return paramList;
	}

}
