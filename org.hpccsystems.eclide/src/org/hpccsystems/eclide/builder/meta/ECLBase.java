package org.hpccsystems.eclide.builder.meta;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Observable;

import org.xml.sax.Attributes;

public class ECLBase extends Observable implements Serializable {
	private static final long serialVersionUID = 6777457786109500872L;
	private static final String DOLLAR = "_local_directory_";
	
	final HashMap<String, String> attributes;

	public ECLBase(Attributes attributes) {
		this.attributes = new HashMap<String, String>();
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
