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
import java.util.HashMap;
import java.util.Observable;

import org.xml.sax.Attributes;

public class ECLBase extends Observable implements Serializable {
	private static final long serialVersionUID = 6777457786109500872L;
	private static final String DOLLAR = "_local_directory_";
	
	HashMap<String, String> attributes;

	public ECLBase(Attributes attributes) {
		this.attributes = new HashMap<String, String>();
		update(attributes);
	}

	public void update(Attributes attributes) {
		for(int i = 0; i < attributes.getLength(); ++i) {
			this.attributes.put(attributes.getQName(i), attributes.getValue(i));
			if (attributes.getQName(i).equals("name")) {
				int pos = attributes.getValue(i).indexOf(DOLLAR);
				if (pos >= 0) {
					String newName = "$" + attributes.getValue(i).substring(pos + DOLLAR.length());
					this.attributes.put(attributes.getQName(i), newName);
				}
			}
		}
	}
}
