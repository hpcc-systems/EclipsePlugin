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

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class DatasetParser {

	private SAXParserFactory parserFactory;

	class DatasetHandler extends StackHandler {
		Map<Long, Map<Integer, String>> data;

		long row;
		int col;

		DatasetHandler(long row, Map<Long, Map<Integer, String>> data) {
			super();
			this.row = row;
			col = 0;
			this.data = data;
		}

		@Override
		public void endElement(String uri, String localName, String qName)	throws SAXException {
			assert(!elementStack.empty());
			switch(elementStack.size()) {
			case 2:
				++row;
				col = 0;
				break;
			case 3:
				Element e = elementStack.peek();
				if (col == 0) {
					data.put(row, new HashMap<Integer, String>());
				}

				data.get(row).put(col, e.content.toString());
				++col;
				break;
			default:
				break;
			}
			super.endElement(uri, localName, qName);
		}
	}

	public DatasetParser(long start, InputSource is, Map<Long, Map<Integer, String>> data) {
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

		DatasetHandler handler = new DatasetHandler(start, data); 
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
}

