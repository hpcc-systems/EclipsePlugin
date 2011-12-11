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
import java.util.Collection;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.hpccsystems.internal.data.DataSingletonCollection;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;
import org.xml.sax.Attributes;

public class ECLSource extends ECLDefinition implements Serializable {
	private static final long serialVersionUID = 9079056685493893907L;
	ECLImport _import;
	
	public ECLSource(Attributes attributes) {
		super(null, attributes);
		_import = null;
		setChanged();
	}
	
	void setImport(ECLImport _import) {
		this._import = _import;
		setChanged();
	}
	
	public IPath getPath() {
		assert(attributes.containsKey("sourcePath"));
		return new Path(attributes.get("sourcePath"));
	}

	public String getPathString() {
		assert(attributes.containsKey("sourcePath"));
		return attributes.get("sourcePath");
	}
	
	@Override 
	public ECLDefinition getContext(int offset) {
		for (ECLDefinition def : definitions.values()) {
			ECLDefinition retVal = def.getContext(offset);
			if (retVal != null)
				return retVal;
		}
		return this;
	}
	
//	@Override 
//	public ECLDefinition getDefinition(String _text) {
//		if (_text.isEmpty())
//			return super.getDefinition(getName());
//
//		return super.getDefinition(_text);
//	}

//	@Override 
//	public void getDefinitionList(String _text, Collection<ECLDefinition> retVal) {
//		if (_text.isEmpty()) {
//			super.getDefinitionList(getName(), retVal);
//			return;
//		}
//
//		super.getDefinitionList(_text, retVal);
//	}

	public void clear() {
		definitions.clear();
		setChanged();
	}
}
