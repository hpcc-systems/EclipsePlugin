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
package org.hpccsystems.internal;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ECLArchiveParser {

	private SAXParserFactory parserFactory;
	public Set<IFile> ancestors;

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
				IResource resource = Eclipse.findResource(e.attributes.getValue("sourcePath"));
				if (resource != null && resource instanceof IFile && !resource.equals(file) && resource.getName().endsWith(".ecl")) { 
					ancestors.add((IFile) resource);
				}
				
				break;
			default:
				break;
			}
			super.endElement(uri, localName, qName);
		}
	}

	public void doParse(IFile file, InputSource is) {
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
			parser.parse(is, handler);
		} catch (SAXException e) {
			//  If there is an error we may end up here. 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		

	public ECLArchiveParser(IFile file, String archive) {
		doParse(file, new InputSource(new StringReader(archive)));
	}
	
	public ECLArchiveParser(IFile file, BufferedReader reader) {
		doParse(file, new InputSource(reader));
	}
}
