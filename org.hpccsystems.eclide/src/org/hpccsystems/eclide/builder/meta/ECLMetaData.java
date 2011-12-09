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
import java.util.HashMap;

import org.eclipse.core.runtime.IPath;

public class ECLMetaData implements Serializable {
	private static final long serialVersionUID = -5499233442101195002L;

	protected HashMap<String, ECLSource> nameSourceMap;
	protected HashMap<String, ECLSource> pathSourceMap;

	ECLMetaData() {
		nameSourceMap = new HashMap<String, ECLSource>();
		pathSourceMap = new HashMap<String, ECLSource>();
	}

	void clear() {
		nameSourceMap.clear();
	}

	public void append(ECLSource eclSource) {
		nameSourceMap.put(eclSource.getQualifiedName(), eclSource);
		pathSourceMap.put(eclSource.getPathString(), eclSource);
	}

	public ECLSource getSource(String path) {
		if (pathSourceMap.containsKey(path)) {
			return pathSourceMap.get(path);
		}
		return null;
	}

	public ECLSource getSource(IPath path) {
		return getSource(path.toOSString());
	}

	public ECLDefinition findDefinition(String _text) {
		String eclID = _text.toLowerCase();
		while(!eclID.isEmpty()) {
			if (nameSourceMap.containsKey(eclID)) {
				String remainder = eclID.length() + 1 > _text.length() ? "" :_text.substring(eclID.length() + 1);
				ECLDefinition retVal = nameSourceMap.get(eclID).getDefinition(remainder);
				if (retVal != null)
					return retVal;
			}

			int pos = eclID.lastIndexOf(".");
			if (pos < 0)
				break;
			eclID = eclID.substring(0, pos);
		}
		return null;
	}

	public void findDefinitionList(String _text, Collection<ECLDefinition> retVal) {
		String eclID = _text.toLowerCase();
		while(!eclID.isEmpty()) {
			if (nameSourceMap.containsKey(eclID)) {
				String remainder = eclID.length() + 1 > _text.length() ? "" :_text.substring(eclID.length() + 1);
				nameSourceMap.get(eclID).getDefinitionList(remainder, retVal);
				if (!retVal.isEmpty())
					return;
			}

			int pos = eclID.lastIndexOf(".");
			if (pos < 0)
				break;
			eclID = eclID.substring(0, pos);
		}
	}
}
