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

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.xml.sax.Attributes;

public class ECLPath extends ECLDefinition implements Serializable {
	private static final long serialVersionUID = -6814855348579221209L;
	ECLFolder container;

	public ECLPath() {
		super(null);
		setChanged();
	}

	public ECLPath(Attributes attributes) {
		super(null, attributes);
		setChanged();
	}

	public ECLFolder getContainer() {
		return container;
	}

	public IPath getPath() {
		assert (attributes.containsKey("sourcePath"));
		return new Path(attributes.get("sourcePath"));
	}

	public String getPathString() {
		assert (attributes.containsKey("sourcePath"));
		return attributes.get("sourcePath");
	}

	public void clear() {
		setChanged();
	}
}
