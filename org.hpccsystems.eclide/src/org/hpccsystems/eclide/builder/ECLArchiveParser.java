package org.hpccsystems.eclide.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ECLArchiveParser {

	private SAXParserFactory parserFactory;
	List<IFile> dependants;
	
	class Element {
		public String tag;
		public Attributes attributes;
		public StringBuilder content;
		
		Element(String tag, Attributes attributes) {
			this.tag = tag;
			this.attributes = attributes;
		}
		
		void AppendContent(char[] ch, int start, int length) {
			//content.append(new String(ch, start, length));		
			//System.out.println(content);
		}
	}
		class StackHandler extends DefaultHandler {
		
		protected Stack<Element> elementStack;

		public StackHandler() {
			elementStack = new Stack<Element>();
		}

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			assert(!elementStack.empty());
			elementStack.peek().AppendContent(ch, start, length);
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

	class ECLArchiveHandler extends StackHandler {
		IProject project;

		ECLArchiveHandler(IProject project) {
			super();
			this.project = project;
			dependants = new Vector<IFile>();
		}
		
		@Override
		public void endElement(String uri, String localName, String qName)	throws SAXException {
			assert(!elementStack.empty());
			switch(elementStack.size()) {
			case 3:
				Element e = elementStack.peek();
				String path = e.attributes.getValue("sourcePath");
				dependants.add(project.getFile(path));
				break;
			default:
				break;
			}
			super.endElement(uri, localName, qName);
		}
	}
	
	ECLArchiveParser(IProject project, BufferedReader reader) {
		parserFactory = SAXParserFactory.newInstance();

		SAXParser parser = null;
//		spf.setNamespaceAware(true);
		parserFactory.setValidating(false);

		try {
			parser = parserFactory.newSAXParser();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ECLArchiveHandler handler = new ECLArchiveHandler(project); 
		try {
			parser.parse(new InputSource(reader), handler);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
}
