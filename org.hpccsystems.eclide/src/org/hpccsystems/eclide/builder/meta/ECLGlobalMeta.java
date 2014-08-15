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
import java.io.StringReader;
import java.util.Stack;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree.ECLMetaNode;
import org.hpccsystems.esp.StackHandler;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ECLGlobalMeta {
	static ECLGlobalMeta self;

	synchronized static public ECLMetaTree get() {
		if (self == null) {
			self = new ECLGlobalMeta();
		}
		return self.tree;
	}

	// Parser ---
	static class ECLMetaTreeHandler extends StackHandler {

		Stack<ECLMetaNode> metaStack;

		ECLMetaTreeHandler() {
			super();
			metaStack = new Stack<ECLMetaNode>();
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			super.startElement(uri, localName, qName, attributes);
			Element e = elementStack.peek();
			if (e.tag.equals("Source")) {
				ECLSource eclSource = new ECLSource(attributes);
				ECLMetaNode node = get().createNode(eclSource.getQualifiedName(), eclSource);
				metaStack.push(node);
			} else if (e.tag.equals("Definition")) {
				ECLDefinition eclDefinition = new ECLDefinition(metaStack.peek().getData(), attributes);
				ECLMetaNode node;
				if (metaStack.peek().getName().equals(eclDefinition.getName())) {
					node = metaStack.peek();
					node.getData().update(attributes);
				} else {
					node = metaStack.peek().addChild(eclDefinition.getName(), eclDefinition);
				}
				metaStack.push(node);
			} else if (e.tag.equals("Field")) {
				ECLField eclField = new ECLField(metaStack.peek().getData(), attributes);
				metaStack.push(metaStack.peek().addChild(eclField.getName(), eclField));
			} else if (e.tag.equals("Import")) {
				assert (metaStack.peek().getData() instanceof ECLSource);
				ECLImport eclImport = new ECLImport(metaStack.peek().getData(), attributes);
				metaStack.peek().addChild(eclImport.getName(), eclImport);
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			Element e = elementStack.peek();
			if (e.tag.equals("Source") || e.tag.equals("Definition") || e.tag.equals("Field")) {
				metaStack.peek().notifyObservers("endElement");
				metaStack.pop();
			} else if (e.tag.equals("Import")) {
			}
			super.endElement(uri, localName, qName);
		}
	}

	// At some point we may have project and global meta containers...
	ECLMetaTree tree;

	static String getPersistFile() {
		return Activator.getDefault().getStateLocation().append("meta.dat").toOSString();
	}

	private ECLGlobalMeta() {
		try {
			FileInputStream fis = new FileInputStream(getPersistFile());
			ObjectInputStream in = new ObjectInputStream(fis);
			tree = (ECLMetaTree) in.readObject();
			in.close();
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		} catch (ClassCastException e) {
		}

		if (tree == null) {
			tree = new ECLMetaTree();
		}
	}

	static public void clear() {
		get().clear();
	}

	public static void parse(String xml) {
		if (xml.isEmpty()) {
			return;
		}
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

		ECLMetaTreeHandler handler = new ECLMetaTreeHandler();
		try {
			parser.parse(new InputSource(new StringReader(xml)), handler);
		} catch (SAXException e) {
			// If there is an error we may end up here.
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
