package org.seisint.eclide.internal.ui.text.folding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.eclipse.dltk.ast.parser.ISourceParser;
import org.eclipse.dltk.ast.statements.Statement;
import org.eclipse.dltk.compiler.env.ModuleSource;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.seisint.eclide.ast.OctaveFunctionStatement;
import org.seisint.eclide.ast.OctaveStatement;
import org.seisint.eclide.ast.OctaveTranslationUnit;
import org.seisint.eclide.core.AbstractCodeBlockProvider;
import org.seisint.eclide.core.OctaveNature;

public class OctaveParserCodeBlockProvider extends AbstractCodeBlockProvider {

	public static final String ID = "org.seisint.eclide.ui.codeblockprovider";
	
	public OctaveCodeBlock[] getCodeBlocks(ISourceParser parser, String code, int offset) {
		OctaveTranslationUnit tu = 
			(OctaveTranslationUnit)parser.parse(new ModuleSource(code), null);
		if (tu == null)
			return new OctaveCodeBlock[0];
		List statements = tu.getStatements();
        if (statements == null) { return new OctaveCodeBlock[0]; }
        List<OctaveCodeBlock> result = new ArrayList<OctaveCodeBlock>();
        Iterator i = statements.iterator();
        while (i.hasNext())
        {
        	Statement stmt = (Statement)i.next();
        	if (stmt instanceof OctaveStatement) {
        		OctaveStatement statement = (OctaveStatement) stmt;
        		result.add(new OctaveCodeBlock(statement,
                       offset + statement.sourceStart(),
                       statement.sourceEnd() - statement.sourceStart() - 1));        		
        		List s = statement.getChilds();
        		Iterator si = s.iterator();
        		while (si.hasNext())
                {
        			Object o = (Object)si.next();
        			if (o instanceof OctaveStatement) {
        				OctaveStatement s2 = (OctaveStatement)o;
		        		String newContents =
		                    code.substring(s2.sourceStart(), s2.sourceEnd());
		        		OctaveCodeBlock[] cb =
		                    getCodeBlocks(parser, newContents, offset + s2.sourceStart());
		                for (int j = 0; j < cb.length; j++)
		                {
		                    result.add(cb[j]);
		                }
        			}
                }               
        	} else if (stmt instanceof OctaveFunctionStatement) {
        		OctaveFunctionStatement statement = (OctaveFunctionStatement) stmt;
        		result.add(new OctaveCodeBlock(statement,
                        offset + statement.sourceStart(),
                            statement.sourceEnd() - statement.sourceStart() - 1));
        		List s = statement.getBody().getStatements();
        		Iterator si = s.iterator();
        		while (si.hasNext())
                {
        			Object o = (Object)si.next();
        			if (o instanceof OctaveStatement) {
        				OctaveStatement s2 = (OctaveStatement)o;
		        		String newContents =
		                    code.substring(s2.sourceStart(), s2.sourceEnd());
		        		OctaveCodeBlock[] cb =
		                    getCodeBlocks(parser, newContents, offset + s2.sourceStart());
		                for (int j = 0; j < cb.length; j++)
		                {
		                    result.add(cb[j]);
		                }
        			}
                } 
        	}
        }
        return (OctaveCodeBlock[]) result.toArray(new OctaveCodeBlock[result.size()]);
	}

}
