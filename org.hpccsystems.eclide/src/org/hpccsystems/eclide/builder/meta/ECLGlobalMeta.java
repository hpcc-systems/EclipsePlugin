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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Stack;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.runtime.QualifiedName;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.StackHandler;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ECLGlobalMeta {
	static ECLGlobalMeta self;
	synchronized static public ECLMetaData get() {
		if (self == null)
			self = new ECLGlobalMeta();
		return self.data;		
	}

	//  Parser  ---
	static class ECLMetaHandler extends StackHandler {

		Stack<ECLBase> metaStack;

		ECLMetaHandler() {
			super();
			metaStack = new Stack<ECLBase>();
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			super.startElement(uri, localName, qName, attributes);
			Element e = elementStack.peek();
			if (e.tag.equals("Source")) {
				String path = attributes.getValue("sourcePath");
				ECLSource source = get().getSource(path);
				if (source != null) {
					metaStack.push(source);
					source.clear();
				}
				else
					metaStack.push(new ECLSource(attributes));
				get().append((ECLSource) metaStack.peek());
			} else if (e.tag.equals("Definition") || e.tag.equals("Field")) {
				ECLDefinition parent = (ECLDefinition)metaStack.peek();
				if (parent instanceof ECLSource && attributes.getValue("name").equals(parent.getName())) {
					metaStack.push(parent);
				} else {
					metaStack.push(new ECLDefinition(parent, attributes));
					parent.addDefinition((ECLDefinition)metaStack.peek());
				}
			} else if (e.tag.equals("Import")) {
				ECLSource parent = (ECLSource)metaStack.peek();
				parent.setImport(new ECLImport(attributes));
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			Element e = elementStack.peek();
			if (e.tag.equals("Source") || e.tag.equals("Definition") || e.tag.equals("Field")) {
				metaStack.peek().notifyObservers();
				metaStack.pop();
			} else if (e.tag.equals("Import")) {
			}
			super.endElement(uri, localName, qName);
		}
	}

	//  At some point we may have project and global meta containers...
	ECLMetaData data; 
	
	static String getPersistFile() {
		return Activator.getDefault().getStateLocation().append("meta.dat").toOSString();
	}

	private ECLGlobalMeta() {
		try
		{
			FileInputStream fis = new FileInputStream(getPersistFile());
			ObjectInputStream in = new ObjectInputStream(fis);
			data = (ECLMetaData)in.readObject();
			in.close();
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		} catch (ClassCastException e) {
		}
		
		if (data == null)
			data = new ECLMetaData();		

	}
	
	static public void clear() {
		get().clear();
	}
	
	public static void parse(String xml) {
		if (xml.isEmpty())
			return;
		SAXParserFactory parserFactory = SAXParserFactory.newInstance();

		SAXParser parser = null;
		parserFactory.setValidating(false);

		try {
			parser = parserFactory.newSAXParser();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		ECLMetaHandler handler = new ECLMetaHandler(); 
		try {
			parser.parse(new InputSource(new StringReader(xml)), handler);
		} catch (SAXException e) {
			//  If there is an error we may end up here. 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static public void save() {
		try {
			FileOutputStream fos = new FileOutputStream(getPersistFile());
			ObjectOutputStream out = new ObjectOutputStream(fos);
			out.writeObject(get());
			out.close();		
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
