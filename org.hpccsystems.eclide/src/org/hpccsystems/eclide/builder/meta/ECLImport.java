/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.eclide.builder.meta;

import java.io.Serializable;

import org.xml.sax.Attributes;

public class ECLImport extends ECLBase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5720495962909839717L;

	public ECLImport(Attributes attributes) {
		super(attributes);
	}
}
