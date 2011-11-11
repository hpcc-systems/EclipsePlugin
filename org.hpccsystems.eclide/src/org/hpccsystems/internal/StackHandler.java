/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

package org.hpccsystems.internal;

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
		}

		void appendContent(char[] ch, int start, int length) {
			//content.append(new String(ch, start, length));		
			//System.out.println(content);
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

