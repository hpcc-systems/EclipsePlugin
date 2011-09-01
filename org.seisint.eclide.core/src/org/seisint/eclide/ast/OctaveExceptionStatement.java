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


public class OctaveExceptionStatement extends OctaveStatement {

	public static class OctaveTryStatement extends OctaveExceptionStatement {

		public OctaveTryStatement(OctaveASTListNode stmts,
				OctaveASTListNode exceptionStmts) {
			super(stmts, exceptionStmts);
		}
		
	}
	
	public static class OctaveUnwindStatement extends OctaveExceptionStatement {

		public OctaveUnwindStatement(OctaveASTListNode stmts,
				OctaveASTListNode exceptionStmts) {
			super(stmts, exceptionStmts);
		}
		
	}
	
	public OctaveExceptionStatement(OctaveASTListNode stmts, 
			OctaveASTListNode exceptionStmts) {
		super();
		children.addAll(stmts.getChilds());
		children.addAll(exceptionStmts.getChilds());
	}

	public int getKind() {
		return S_TRY_CATCH;
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


public class OctaveExceptionStatement extends OctaveStatement {

	public static class OctaveTryStatement extends OctaveExceptionStatement {

		public OctaveTryStatement(OctaveASTListNode stmts,
				OctaveASTListNode exceptionStmts) {
			super(stmts, exceptionStmts);
		}
		
	}
	
	public static class OctaveUnwindStatement extends OctaveExceptionStatement {

		public OctaveUnwindStatement(OctaveASTListNode stmts,
				OctaveASTListNode exceptionStmts) {
			super(stmts, exceptionStmts);
		}
		
	}
	
	public OctaveExceptionStatement(OctaveASTListNode stmts, 
			OctaveASTListNode exceptionStmts) {
		super();
		children.addAll(stmts.getChilds());
		children.addAll(exceptionStmts.getChilds());
	}

	public int getKind() {
		return S_TRY_CATCH;
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
