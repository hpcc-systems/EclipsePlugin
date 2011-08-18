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
package org.seisint.eclide.internal.parser;

import org.eclipse.dltk.ast.parser.ISourceParser;
import org.eclipse.dltk.ast.parser.ISourceParserFactory;

public class OctaveSourceParserFactory extends Object implements
		ISourceParserFactory {

	public ISourceParser createSourceParser() {
		return new EclSourceParser();
	}

}
