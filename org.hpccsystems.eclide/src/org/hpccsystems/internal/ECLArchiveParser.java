package org.hpccsystems.internal;

import java.io.BufferedReader; 
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
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

	public ECLArchiveParser(IFile file, BufferedReader reader) {
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
			//  If there is an error we may end up here. 
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}		
}
