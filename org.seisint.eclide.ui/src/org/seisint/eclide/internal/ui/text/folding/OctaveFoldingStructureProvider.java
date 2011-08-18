/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw, some portions (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.ui.text.folding;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.core.runtime.ILog;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.parser.ISourceParser;
import org.eclipse.dltk.ui.text.folding.AbstractASTFoldingStructureProvider;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.seisint.eclide.ast.OctaveDoStatement;
import org.seisint.eclide.ast.OctaveExceptionStatement;
import org.seisint.eclide.ast.OctaveForStatement;
import org.seisint.eclide.ast.OctaveFunctionStatement;
import org.seisint.eclide.ast.OctaveIfStatement;
import org.seisint.eclide.ast.OctaveStatement;
import org.seisint.eclide.ast.OctaveWhileStatement;
import org.seisint.eclide.core.CodeBlockProviderManager;
import org.seisint.eclide.core.IOctaveCodeBlockProvider;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.ui.OctclipseUIPlugin;
import org.seisint.eclide.internal.ui.text.OctavePartitionScanner;
import org.seisint.eclide.ui.OctavePreferenceConstants;
import org.seisint.eclide.ui.text.OctavePartitions;

public class OctaveFoldingStructureProvider extends AbstractASTFoldingStructureProvider {

	private boolean fInitCollapse = true;
	private boolean fInitCollapseComments = true;
	private int fBlockFolding = 0;
	private List fBlockExcludeList = new ArrayList();
	private List fBlockIncludeList = new ArrayList();

	protected String getCommentPartition() {
		return OctavePartitions.ECL_COMMENT;
	}

	protected ILog getLog() {
		return OctclipseUIPlugin.getDefault().getLog();
	}

	protected String getPartition() {
		return OctavePartitions.ECL_PARTITIONING;
	}

	protected IPartitionTokenScanner getPartitionScanner() {
		return new OctavePartitionScanner();
	}

	protected String[] getPartitionTypes() {
		return OctavePartitions.ECL_PARTITION_TYPES;
	}

	protected boolean initiallyCollapse(ASTNode s,
			FoldingStructureComputationContext ctx) {
		return ctx.allowCollapsing() && fInitCollapse;
	}

	protected boolean initiallyCollapseComments(
			FoldingStructureComputationContext ctx) {
		return ctx.allowCollapsing() && fInitCollapseComments;
	}

	protected boolean mayCollapse(ASTNode s,
			FoldingStructureComputationContext ctx) {
		if (s instanceof OctaveStatement) {
			 switch (fBlockFolding)
	         {
			 case OctavePreferenceConstants.EDITOR_FOLDING_BLOCKS_OFF:
				 return false;
			 case OctavePreferenceConstants.EDITOR_FOLDING_BLOCKS_INCLUDE:
				 if (s instanceof OctaveIfStatement) {
					 if (fBlockIncludeList.contains("if")) { return true; }
				 } else if (s instanceof OctaveDoStatement) {
					 if (fBlockIncludeList.contains("do")) { return true; }
				 } else if (s instanceof OctaveExceptionStatement) {
					 if (s instanceof OctaveExceptionStatement.OctaveTryStatement) {
						 if (fBlockIncludeList.contains("try")) { return true; }
					 } else if (s instanceof OctaveExceptionStatement.OctaveUnwindStatement) {
						 if (fBlockIncludeList.contains("unwind_protect")) { return true; }
					 }
				 } else if (s instanceof OctaveWhileStatement) {
					 if (fBlockIncludeList.contains("while")) { return true; }
				 } else if (s instanceof OctaveForStatement) {
					 if (fBlockIncludeList.contains("for")) { return true; }
				 }
				 return false;
			 case OctavePreferenceConstants.EDITOR_FOLDING_BLOCKS_EXCLUDE:
				 if (s instanceof OctaveIfStatement) {
					 if (fBlockIncludeList.contains("if")) { return false; }
				 } else if (s instanceof OctaveDoStatement) {
					 if (fBlockIncludeList.contains("do")) { return false; }
				 } else if (s instanceof OctaveExceptionStatement) {
					 if (s instanceof OctaveExceptionStatement.OctaveTryStatement) {
						 if (fBlockIncludeList.contains("try")) { return false; }
					 } else if (s instanceof OctaveExceptionStatement.OctaveUnwindStatement) {
						 if (fBlockIncludeList.contains("unwind_protect")) { return false; }
					 }
				 } else if (s instanceof OctaveWhileStatement) {
					 if (fBlockIncludeList.contains("while")) { return false; }
				 } else if (s instanceof OctaveForStatement) {
					 if (fBlockIncludeList.contains("for")) { return false; }
				 }
				 return true;
	         }
		} else if (s instanceof OctaveFunctionStatement) {
			switch (fBlockFolding)
	        {
	        case OctavePreferenceConstants.EDITOR_FOLDING_BLOCKS_OFF:
	        	return false;
	        case OctavePreferenceConstants.EDITOR_FOLDING_BLOCKS_INCLUDE:
	        	if (fBlockIncludeList.contains("function")) { return true; }
	        	return false;
	        case OctavePreferenceConstants.EDITOR_FOLDING_BLOCKS_EXCLUDE:
	        	if (fBlockIncludeList.contains("function")) { return false; }
	        	return true;
	        }
		}
		return false;
	}

    protected void initializePreferences(IPreferenceStore store)
    {
        super.initializePreferences(store);
        fBlockFolding = store.getInt(OctavePreferenceConstants.EDITOR_FOLDING_BLOCKS);
        String t = store.getString(OctavePreferenceConstants.EDITOR_FOLDING_EXCLUDE_LIST);
        String[] items = t.split(",");
        fBlockExcludeList.clear();
        for (int i = 0; i < items.length; i++)
        {
            if (items[i].trim().length() > 0)
            {
                fBlockExcludeList.add(items[i]);
            }
        }
        t = store.getString(OctavePreferenceConstants.EDITOR_FOLDING_INCLUDE_LIST);
        items = t.split(",");
        fBlockIncludeList.clear();
        for (int i = 0; i < items.length; i++)
        {
            if (items[i].trim().length() > 0)
            {
                fBlockIncludeList.add(items[i]);
            }
        }
        fFoldNewLines =
            store.getBoolean(OctavePreferenceConstants.EDITOR_FOLDING_COMMENTS_WITH_NEWLINES);
        fInitCollapse = store.getBoolean(OctavePreferenceConstants.EDITOR_FOLDING_INIT_BLOCKS);
        fInitCollapseComments =
            store.getBoolean(OctavePreferenceConstants.EDITOR_FOLDING_INIT_COMMENTS);
    }

	protected CodeBlock[] getCodeBlocks(String code, int offset)
    {
		ISourceParser p = getSourceParser();
		IOctaveCodeBlockProvider provider = getCodeBlockProvider();
		IOctaveCodeBlockProvider.OctaveCodeBlock[] blocks = provider.getCodeBlocks(p, code, offset);
		CodeBlock[] values = new CodeBlock[blocks.length];
		for (int i = 0; i < blocks.length; ++i)
			values[i] = new CodeBlock(blocks[i].statement,new Region(blocks[i].offset, blocks[i].length));
		return values;
    }

	private IOctaveCodeBlockProvider getCodeBlockProvider() {
		return CodeBlockProviderManager.getInstance().getCodeBlockProvider(null, getNatureId());
	}

	protected String getNatureId() {
		return OctaveNature.NATURE_ID;
	}
}
