package org.seisint.eclide.internal.ui.documentation;

import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.Vector;


import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.ui.documentation.IScriptDocumentationProvider;
import org.seisint.eclide.core.OctclipsePlugin;
import org.seisint.eclide.runtime.symbols.ISymbolListener;
import org.seisint.eclide.runtime.symbols.Symbol;
import org.seisint.eclide.ui.documentation.OctaveDocumentationUtils;

public class OctaveSymbolDocumentationProvider implements IScriptDocumentationProvider, ISymbolListener {

	Vector mysyms = new Vector();
		
	public OctaveSymbolDocumentationProvider() {
		super();
		OctclipsePlugin.getSymbolList().addChangeListener(this);
	}
	
	protected void finalize() throws Throwable {
		OctclipsePlugin.getSymbolList().removeChangeListener(this);
		super.finalize();
	}
	
	public Reader getInfo(String content) {
		Iterator i = mysyms.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			if (o instanceof Symbol)
			{
				Symbol s = (Symbol)o;
				if (s.getName().equals(content)) {
					return new StringReader(OctaveDocumentationUtils.convertTexInfoToHTML(s.getHelpText())); 
				}
			}
		}
		return null;
	}
	
	public Reader getInfo(IMember element, boolean lookIntoParents,
			boolean lookIntoExternal) {
		return null;
	}

	public void update() {
		mysyms.clear();
		mysyms.addAll(OctclipsePlugin.getSymbolList().getSymbols(Symbol.BUILTIN_FUNCTION));
	}
	
}
