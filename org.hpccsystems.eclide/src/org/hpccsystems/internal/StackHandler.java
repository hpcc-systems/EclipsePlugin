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

