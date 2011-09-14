package org.hpccsystems.eclide.builder;

import java.io.BufferedReader; 
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ECLArchiveParser {

	private SAXParserFactory parserFactory;
	Set<IFile> ancestors;

	class Element {
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
	
	class StackHandler extends DefaultHandler {

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

	class ECLArchiveHandler extends StackHandler {
		IFile file;

		ECLArchiveHandler(IFile file) {
			super();
			this.file = file;
			ancestors = new HashSet<IFile>();
		}

		@Override
		public void endElement(String uri, String localName, String qName)	throws SAXException {
			assert(!elementStack.empty());
			switch(elementStack.size()) {
			case 3:
				Element e = elementStack.peek();
				IPath fileFolder = file.getProjectRelativePath().removeLastSegments(1);
				String sourcePath = e.attributes.getValue("sourcePath");
				if (sourcePath != null) {
					IPath path = fileFolder.append(sourcePath);	//  Paths are relative to item being checked.
					IResource resource = file.getProject().findMember(path);
					if (resource instanceof IFile && !resource.equals(file) && resource.getName().endsWith(".ecl")) 
						ancestors.add((IFile) resource);
				}
				
				break;
			default:
				break;
			}
			super.endElement(uri, localName, qName);
		}
	}

	ECLArchiveParser(IFile file, BufferedReader reader) {
		parserFactory = SAXParserFactory.newInstance();

		SAXParser parser = null;
		parserFactory.setValidating(false);

		try {
			parser = parserFactory.newSAXParser();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		ECLArchiveHandler handler = new ECLArchiveHandler(file); 
		try {
			parser.parse(new InputSource(reader), handler);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
}
