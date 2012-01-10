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
import java.util.HashSet;
import java.util.Map;

import org.xml.sax.Attributes;

public class ECLDefinition extends ECLBase implements Serializable {
	private static final long serialVersionUID = 5021451023768469028L;

	ECLDefinition parent;
	Map<String, ECLDefinition> definitions;
	transient Collection<ECLDefinition> pushedDefinitions;
	
	public ECLDefinition(ECLDefinition parent, Attributes attributes) {
		super(attributes);
		this.parent = parent;
		definitions = new HashMap<String, ECLDefinition>();
		setChanged();
	}

	public ECLSource getSource() {
		if (this instanceof ECLSource)
			return (ECLSource)this;

		if (parent != null) {
			return parent.getSource();
		}
		return null;
	}

	String getQualifiedName() {
		if (attributes.containsKey("name")) {
			return attributes.get("name");
		} else {	//  Plugins have no name at the moment  ...
			//assert(attributes.containsKey("sourcePath"));
			return attributes.get("sourcePath");
		}
		//return "";
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

	public void addDefinition(ECLDefinition def) {
		definitions.put(def.getQualifiedName(), def);
		setChanged();
	}
	
	public ECLDefinition findDefinition(String _text) {
		ECLDefinition retVal = getDefinition(_text);
		if (retVal != null) 
			return retVal;

		if (parent != null) {
			retVal = parent.findDefinition(_text);
			if (retVal != null) 
				return retVal;
		} else {
			retVal = ECLGlobalMeta.get().findDefinition(_text);
			if (retVal != null) 
				return retVal;
		}
		return null;
	}
	
	public ECLDefinition getDefinition(String _text) {
		if (_text.isEmpty())
			return null;
		
		String text = _text.toLowerCase();
		String firstID;
		String remainderID;
		if (text.contains(".")) {
			int pos = text.indexOf(".");
			firstID = text.substring(0, pos);
			remainderID = text.substring(pos + 1);
		} else {
			firstID = text;
			remainderID = "";
		}
		
		if (getName().equals(firstID)) {
			if (remainderID.isEmpty())
				return this;
			return getDefinition(remainderID);
		} else if (definitions.containsKey(firstID)) {
			if (remainderID.isEmpty())
				return definitions.get(firstID);
			return definitions.get(firstID).getDefinition(remainderID);
		}
		return null;
	}
	
	public void findDefinitionList(String _text, Collection<ECLDefinition> retVal) {
		getDefinitionList(_text, retVal);
		if (!retVal.isEmpty()) 
			return;
		
		if (parent != null) {
			parent.findDefinitionList(_text, retVal);
			if (!retVal.isEmpty())
				return;
		} else {
			ECLGlobalMeta.get().findDefinitionList(_text, retVal);
			if (!retVal.isEmpty())
				return;
		}
	}
	
	public void getDefinitionList(String _text, Collection<ECLDefinition> retVal) {
		if (_text.isEmpty())
			return;
		
		String text = _text.toLowerCase();
		String firstID;
		String remainderID;
		if (text.contains(".")) {
			int pos = text.indexOf(".");
			firstID = text.substring(0, pos);
			remainderID = text.substring(pos + 1);
		} else {
			firstID = text;
			remainderID = "";
		}
		
		if (getName().equals(firstID)) {
			retVal.add(this);
			getDefinitionList(remainderID, retVal);
		} else if (definitions.containsKey(firstID)) {
			retVal.add(definitions.get(firstID));
			definitions.get(firstID).getDefinitionList(remainderID, retVal);
		}
	}

	public Collection<ECLDefinition> getDefinitions() {
		return definitions.values();
	}

	public boolean isExported() {
		if (attributes.containsKey("exported")) {
			return true;
		}
		return false;
	}

	public int getOffset() {
		if (attributes.containsKey("start")) {
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
		if (retVal >= 0)
			return retVal;
		return 0;
	}

	public ECLDefinition getContext(int offset) {
		if (getName().startsWith("__") && getName().endsWith("__")) {
			return null;
		}
		
		ECLDefinition retVal = null;
		if (offset >= getOffset() && offset <= getEndOffset()) {
			for (ECLDefinition def : definitions.values()) {
				retVal = def.getContext(offset);
				if (retVal != null)
					return retVal;
			}
			retVal = this;
		}
		return retVal;
	}

	public void pushDefinitions() {
		pushedDefinitions = new HashSet<ECLDefinition>();
		pushedDefinitions.addAll(definitions.values());
	}

	synchronized public void popDefinition(ECLDefinition def) {
		pushedDefinitions.remove(def);
	}

	synchronized public void popDefinitions(boolean deleteItems) {
		if (pushedDefinitions != null) {
			for(ECLDefinition def : pushedDefinitions) {
				if (deleteItems) {
					definitions.remove(def.getName());
				}
			}
		}
		pushedDefinitions.clear();
	}
}
