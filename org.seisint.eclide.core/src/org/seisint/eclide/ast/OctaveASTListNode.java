<<<<<<< HEAD
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

import org.eclipse.dltk.ast.ASTListNode;
import org.eclipse.dltk.ast.ASTNode;

public class OctaveASTListNode extends ASTListNode {

	public void addNode(ASTNode s) {
		if (s.sourceStart() <= sourceStart() || getChilds().isEmpty())
			setStart(s.sourceStart());
		if (s.sourceEnd() >= sourceEnd() || getChilds().isEmpty())
			setEnd(s.sourceEnd());
		super.addNode(s);
	}

}
=======
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

import org.eclipse.dltk.ast.ASTListNode;
import org.eclipse.dltk.ast.ASTNode;

public class OctaveASTListNode extends ASTListNode {

	public void addNode(ASTNode s) {
		if (s.sourceStart() <= sourceStart() || getChilds().isEmpty())
			setStart(s.sourceStart());
		if (s.sourceEnd() >= sourceEnd() || getChilds().isEmpty())
			setEnd(s.sourceEnd());
		super.addNode(s);
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
