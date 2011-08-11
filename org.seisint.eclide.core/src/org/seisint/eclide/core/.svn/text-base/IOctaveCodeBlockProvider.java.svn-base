/*******************************************************************************
 * Copyright (c) 2009 Ryan Rusaw
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
import org.eclipse.dltk.ast.parser.ISourceParser;

public interface IOctaveCodeBlockProvider {

	public static class OctaveCodeBlock {
		public OctaveCodeBlock(ASTNode statement, int offset, int length) {
			this.length = length;
			this.offset = offset;
			this.statement = statement;
		}
		public ASTNode statement;
		public int length;
		public int offset;
	}
	
	OctaveCodeBlock[] getCodeBlocks(ISourceParser parser, String code, int offset);
	
}
