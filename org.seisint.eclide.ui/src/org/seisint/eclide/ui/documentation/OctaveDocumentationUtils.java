/*******************************************************************************
 * Copyright (c) 2008 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.ui.documentation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.eclipse.dltk.core.IBuffer;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;

public class OctaveDocumentationUtils {
	
	static private String getLine (Document d, int line) throws BadLocationException {
		return d.get(d.getLineOffset(line), d.getLineLength(line));
	}
	
	static public String convertTexInfoToHTML (String header) {
		return convertTexInfo(header, "--html");
	}
	
	static public String convertTexInfoToText (String header) {
		return convertTexInfo(header, "--plaintext");
	}
	
	static private String convertTexInfo (String header, String type) {
		StringBuffer result = new StringBuffer();
		Document d = new Document (header);
		try {
			for (int line = 0; ;line++) {
				String str = getLine (d, line);
				if (str == null)
					break;
				while (str.length() > 0 && str.startsWith("##"))
					str = str.substring(2);
				str = str.replaceAll(
						"(<[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*)@((?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?>)", "$1@@$2");
				result.append (str.replace("-*- texinfo -*-", ""));
			}
		} catch (BadLocationException e) {
		}
		try {
			Process p = Runtime.getRuntime().exec(new String[] { "makeinfo", type, "--no-split", "--force", "--no-warn", "--no-validate", "--no-headers" });
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
			writer.write("@macro seealso {args}\n@sp 1\n@noindent\nSee also: \\args\\.\n@end macro\n");
			writer.write(result.toString());
			writer.close();				
			Thread.sleep(10);	
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			StringBuffer result2 = new StringBuffer();
			String s = reader.readLine();
			boolean haveBlockQuote= false;
			/* remove extra <blockquote> tags */
			while (s != null) {
				if ("--html".equals(type))
				{
					if (haveBlockQuote) {
						s = s.replaceAll("<blockquote>", "");
					}
					if (s.contains("<blockquote>"))
						haveBlockQuote = true;
				}
				result2.append(s);
				if("--plaintext".equals(type))
					result2.append(" \n");
				s = reader.readLine();
			}
			reader.close();
			return result2.toString();
		} catch (Exception e) {
		}
		return result.toString();
	}
	
	static public String getHeaderComment (IMember member) {
		if (member instanceof IField) {
			return null;
		}
		try {
			ISourceRange range= member.getSourceRange();
			if (range == null) 
				return null;			
			IBuffer buf= null;			
			ISourceModule compilationUnit = member.getSourceModule();
			if (!compilationUnit.isConsistent()) {
				return null;
			}
			buf = compilationUnit.getBuffer();
			final int start= range.getOffset();	
			String contents;
			if (buf != null) {		
				contents = buf.getContents();
			} else {
				contents = compilationUnit.getSource();
			}
			String result = "";			
			Document doc = new Document(contents);
			try {
				int line = doc.getLineOfOffset(start);				
				line--;
				if (line < 0)
					return null;
				while (line >= 0) {
					String curLine = getLine(doc, line);
					String curLineTrimmed = curLine.trim();
					if ((curLineTrimmed.length() == 0) || curLineTrimmed.startsWith("##")) {
						result = curLine + result;
						if (curLine.contains("-*- texinfo -*-"))
							break;
					} else {
						break;
					}
					line--;
				}
			} catch (BadLocationException e) {
				return null;
			}
			return result;	
		} catch (ModelException e) {
		}
		return null;
	}
	
}
