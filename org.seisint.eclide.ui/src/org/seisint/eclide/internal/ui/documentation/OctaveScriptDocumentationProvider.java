package org.seisint.eclide.internal.ui.documentation;

import java.io.Reader;
import java.io.StringReader;


import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.internal.core.SourceField;
import org.eclipse.dltk.internal.core.SourceMethod;
import org.eclipse.dltk.ui.documentation.IScriptDocumentationProvider;
import org.seisint.eclide.ui.documentation.OctaveDocumentationUtils;

@SuppressWarnings("restriction")
public class OctaveScriptDocumentationProvider implements IScriptDocumentationProvider {

	public OctaveScriptDocumentationProvider() {
		super();
	}
	
	public Reader getInfo(String content) {
		return null;
	}
	
	public Reader getInfo(IMember element, boolean lookIntoParents,
			boolean lookIntoExternal) {
		if (element instanceof SourceMethod) {
			String header = OctaveDocumentationUtils.getHeaderComment(element);
			return new StringReader (OctaveDocumentationUtils.convertTexInfoToHTML(header));
		}
		else if (element instanceof SourceField) {
			try {
				int flags = element.getFlags();
				String modifier = "";
				switch(flags) {
				case Modifiers.AccGlobal:
					modifier = "<b>global</b> "; break;
				case Modifiers.AccStatic:
					modifier = "<b>persistent</b> "; break;
				}
				return new StringReader(modifier + element.getElementName());
			} catch (ModelException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
}
