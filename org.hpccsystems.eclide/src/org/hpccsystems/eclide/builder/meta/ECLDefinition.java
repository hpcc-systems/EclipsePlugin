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

public class ECLDefinition extends ECLBase implements Serializable {
	private static final long serialVersionUID = 5021451023768469028L;

	public ECLDefinition(ECLDefinition parent) {
		super();
		setChanged();
	}

	public ECLDefinition(ECLDefinition parent, Attributes attributes) {
		super(attributes);
		setChanged();
	}

	public String getQualifiedName() {
		if (attributes.containsKey("name")) {
			return attributes.get("name");
		}
		return attributes.get("sourcePath");
	}

	public String getName() {
		String qName = getQualifiedName();
		if (qName.contains(".")) {
			return qName.substring(qName.lastIndexOf('.') + 1);
		} else {
			return qName;
		}
	}

	public String getType() {
		if (attributes.containsKey("type")) {
			return attributes.get("type");
		}
		return "";
	}

	public boolean isExported() {
		if (attributes.containsKey("exported")) {
			return true;
		}
		return false;
	}

	public int getOffset() {
		if (attributes.containsKey("body")) {
			return Integer.parseInt(attributes.get("body"));
		} else if (attributes.containsKey("start")) {
			return Integer.parseInt(attributes.get("start"));
		}
		return 0;
	}

	public int getEndOffset() {
		if (attributes.containsKey("end")) {
			return Integer.parseInt(attributes.get("end"));
		}
		return 0;
	}

	public int getLength() {
		int retVal = getEndOffset() - getOffset();
		if (retVal >= 0) {
			return retVal;
		}
		return 0;
	}
}
