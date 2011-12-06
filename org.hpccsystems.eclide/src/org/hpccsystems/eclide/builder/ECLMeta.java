package org.hpccsystems.eclide.builder;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.hpccsystems.internal.StackHandler;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ECLMeta {
	static ECLMeta self = null;
	
	private ECLMeta() {
	}
	
	synchronized public static ECLMeta get() {
		if (self == null)
			self = new ECLMeta();
		return self;
	}
	
	//  Parser  ---
	class ECLMetaHandler extends StackHandler {

		ECLMetaHandler() {
			super();
		}

		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			super.startElement(uri, localName, qName, attributes);
			Element e = elementStack.peek();
			switch(elementStack.size()) {
			case 2: 
				if (e.tag.equals("Source")) {
				}
				break;
			case 3: 
				if (e.tag.equals("Import")) {
				}
				break;
			}
			
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			assert(!elementStack.empty());
			switch(elementStack.size()) {
			case 3:
				Element e = elementStack.peek();
				
				break;
			default:
				break;
			}
			super.endElement(uri, localName, qName);
		}
	}
	
	public void clear() {
	}

	public void append(String xml) {
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
			parser.parse(new InputSource(xml), handler);
		} catch (SAXException e) {
			//  If there is an error we may end up here. 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
