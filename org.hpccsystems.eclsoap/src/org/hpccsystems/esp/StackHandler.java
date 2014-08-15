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
package org.hpccsystems.esp;

import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class StackHandler extends DefaultHandler {
	public class Element {
		public String tag;
		public Attributes attributes;
		public StringBuilder content;

		Element(String tag, Attributes attributes) {
			this.tag = tag;
			this.attributes = attributes;
			content = new StringBuilder();
		}

		void appendContent(char[] ch, int start, int length) {
			content.append(new String(ch, start, length));		
		}
	}

	protected Stack<Element> elementStack;

	public StackHandler() {
		elementStack = new Stack<Element>();
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		assert(!elementStack.empty());
		elementStack.peek().appendContent(ch, start, length);
		super.characters(ch, start, length);
	}

	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
	}

	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
		elementStack.push(new Element(qName, attributes));
	}

	@Override
	public void endElement(String uri, String localName, String qName)	throws SAXException {
		elementStack.pop();
		super.endElement(uri, localName, qName);
	}
}

