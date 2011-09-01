<<<<<<< HEAD
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
package org.seisint.eclide.internal.ui.text.completion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.ui.text.completion.AbstractScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ContentAssistInvocationContext;
import org.eclipse.dltk.ui.text.completion.IScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ProposalInfo;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalComputer;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.templates.TemplateCompletionProcessor;
import org.seisint.eclide.internal.ui.templates.OctaveTemplateCompletionProcessor;
import org.seisint.eclide.runtime.symbols.Symbol;
import org.seisint.eclide.ui.documentation.OctaveDocumentationUtils;

public class OctaveCompletionProposalComputer extends
		ScriptCompletionProposalComputer {
	
	OctaveSymbolTracker tracker;
	
	class OctaveSymbolProposalInfo extends ProposalInfo {
		private Symbol s;
		public OctaveSymbolProposalInfo(Symbol sym) {
			s = sym;
		}
		public  String getInfo(IProgressMonitor monitor) {
			return OctaveDocumentationUtils.convertTexInfoToHTML(s.getHelpText());
		}
	}
	
	private IScriptCompletionProposal createSymbolProposal(int relevance,
			Symbol s,
			int currLength,
			ScriptContentAssistInvocationContext context) throws ModelException {
		CompletionProposal proposal = null;
		ProposalInfo pinfo = new OctaveSymbolProposalInfo(s);
		if ((s.getFlags() & (Symbol.BUILTIN_FUNCTION|Symbol.USER_FUNCTION)) != 0) {
			proposal = CompletionProposal.create(
				CompletionProposal.METHOD_DECLARATION, context.getInvocationOffset());			
		} else {
			proposal = CompletionProposal.create(
				CompletionProposal.VARIABLE_DECLARATION, context.getInvocationOffset());	
		}
		proposal.setName(s.getName());
		proposal.setCompletion(s.getName().substring(currLength));
		proposal.setFlags(0);
		proposal.setRelevance(20);
		proposal.setReplaceRange(context.getInvocationOffset(), context
				.getInvocationOffset());
		OctaveLazyCompletionProposal lazy = new OctaveLazyCompletionProposal(proposal, context);
		lazy.setProposalInfo(pinfo);
		return lazy;
	}
	
	public OctaveCompletionProposalComputer() {
		tracker = new OctaveSymbolTracker();
	}
	
	public List computeContextInformation(
			ContentAssistInvocationContext context, IProgressMonitor monitor) {//
		List types = computeCompletionProposals(context, monitor);
		Iterator iter = types.iterator();
		List<IContextInformation> list = new ArrayList<IContextInformation>();
		while (iter.hasNext()) {
			IScriptCompletionProposal proposal = (IScriptCompletionProposal) iter
					.next();
			list.add(proposal.getContextInformation());
		}
		return list;
	}
	
	public List computeScriptCompletionProposals(int offset,
			ScriptContentAssistInvocationContext context,
			IProgressMonitor monitor) {
		List types = super.computeScriptCompletionProposals(offset, context, monitor); 
		try {
			CharSequence s = context.computeIdentifierPrefix();
			List<IScriptCompletionProposal> proposals = new LinkedList<IScriptCompletionProposal>();
			proposals.addAll(types);
			if (s != null)
			{
				String currWord = new String(s.toString());
				List<Symbol> suggestions = 
					new ArrayList<Symbol>(tracker.suggestSymbols(currWord).values());
				if (suggestions.size() > 0) {
					for (Iterator<Symbol> i = suggestions.iterator(); i.hasNext();) {
						Symbol sym = (Symbol) i.next();
						IScriptCompletionProposal prop = createSymbolProposal(20, sym, s.length(), context); 
						int index = Collections.binarySearch(proposals, prop, new Comparator<IScriptCompletionProposal>() {
							public int compare(IScriptCompletionProposal o1, IScriptCompletionProposal o2) {
								if (o1 instanceof AbstractScriptCompletionProposal && o2 instanceof 
										AbstractScriptCompletionProposal)
								{
									AbstractScriptCompletionProposal p1 = (AbstractScriptCompletionProposal)o1; 
									AbstractScriptCompletionProposal p2 = (AbstractScriptCompletionProposal)o2;	
									return p1.getDisplayString().compareTo(p2.getDisplayString());
								} else {
									return o1.toString().compareTo(o2.toString());
								}
							}
						});
						proposals.add(-index-1, prop);
					}
				}
			}
			return proposals;
		} catch (Exception e) {
			e.printStackTrace();
			return null;	
		}	
	}
	
	protected TemplateCompletionProcessor createTemplateProposalComputer(
			ScriptContentAssistInvocationContext context) {
		return new OctaveTemplateCompletionProcessor(context);
	}
	
	protected ScriptCompletionProposalCollector createCollector(
			ScriptContentAssistInvocationContext context) {
		ScriptCompletionProposalCollector collector = new OctaveCompletionProposalCollector(
				context.getSourceModule());
		return collector;
	}
}
=======
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
package org.seisint.eclide.internal.ui.text.completion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.ui.text.completion.AbstractScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ContentAssistInvocationContext;
import org.eclipse.dltk.ui.text.completion.IScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ProposalInfo;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalComputer;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.templates.TemplateCompletionProcessor;
import org.seisint.eclide.internal.ui.templates.OctaveTemplateCompletionProcessor;
import org.seisint.eclide.runtime.symbols.Symbol;
import org.seisint.eclide.ui.documentation.OctaveDocumentationUtils;

public class OctaveCompletionProposalComputer extends
		ScriptCompletionProposalComputer {
	
	OctaveSymbolTracker tracker;
	
	class OctaveSymbolProposalInfo extends ProposalInfo {
		private Symbol s;
		public OctaveSymbolProposalInfo(Symbol sym) {
			s = sym;
		}
		public  String getInfo(IProgressMonitor monitor) {
			return OctaveDocumentationUtils.convertTexInfoToHTML(s.getHelpText());
		}
	}
	
	private IScriptCompletionProposal createSymbolProposal(int relevance,
			Symbol s,
			int currLength,
			ScriptContentAssistInvocationContext context) throws ModelException {
		CompletionProposal proposal = null;
		ProposalInfo pinfo = new OctaveSymbolProposalInfo(s);
		if ((s.getFlags() & (Symbol.BUILTIN_FUNCTION|Symbol.USER_FUNCTION)) != 0) {
			proposal = CompletionProposal.create(
				CompletionProposal.METHOD_DECLARATION, context.getInvocationOffset());			
		} else {
			proposal = CompletionProposal.create(
				CompletionProposal.VARIABLE_DECLARATION, context.getInvocationOffset());	
		}
		proposal.setName(s.getName());
		proposal.setCompletion(s.getName().substring(currLength));
		proposal.setFlags(0);
		proposal.setRelevance(20);
		proposal.setReplaceRange(context.getInvocationOffset(), context
				.getInvocationOffset());
		OctaveLazyCompletionProposal lazy = new OctaveLazyCompletionProposal(proposal, context);
		lazy.setProposalInfo(pinfo);
		return lazy;
	}
	
	public OctaveCompletionProposalComputer() {
		tracker = new OctaveSymbolTracker();
	}
	
	public List computeContextInformation(
			ContentAssistInvocationContext context, IProgressMonitor monitor) {//
		List types = computeCompletionProposals(context, monitor);
		Iterator iter = types.iterator();
		List<IContextInformation> list = new ArrayList<IContextInformation>();
		while (iter.hasNext()) {
			IScriptCompletionProposal proposal = (IScriptCompletionProposal) iter
					.next();
			list.add(proposal.getContextInformation());
		}
		return list;
	}
	
	public List computeScriptCompletionProposals(int offset,
			ScriptContentAssistInvocationContext context,
			IProgressMonitor monitor) {
		List types = super.computeScriptCompletionProposals(offset, context, monitor); 
		try {
			CharSequence s = context.computeIdentifierPrefix();
			List<IScriptCompletionProposal> proposals = new LinkedList<IScriptCompletionProposal>();
			proposals.addAll(types);
			if (s != null)
			{
				String currWord = new String(s.toString());
				List<Symbol> suggestions = 
					new ArrayList<Symbol>(tracker.suggestSymbols(currWord).values());
				if (suggestions.size() > 0) {
					for (Iterator<Symbol> i = suggestions.iterator(); i.hasNext();) {
						Symbol sym = (Symbol) i.next();
						IScriptCompletionProposal prop = createSymbolProposal(20, sym, s.length(), context); 
						int index = Collections.binarySearch(proposals, prop, new Comparator<IScriptCompletionProposal>() {
							public int compare(IScriptCompletionProposal o1, IScriptCompletionProposal o2) {
								if (o1 instanceof AbstractScriptCompletionProposal && o2 instanceof 
										AbstractScriptCompletionProposal)
								{
									AbstractScriptCompletionProposal p1 = (AbstractScriptCompletionProposal)o1; 
									AbstractScriptCompletionProposal p2 = (AbstractScriptCompletionProposal)o2;	
									return p1.getDisplayString().compareTo(p2.getDisplayString());
								} else {
									return o1.toString().compareTo(o2.toString());
								}
							}
						});
						proposals.add(-index-1, prop);
					}
				}
			}
			return proposals;
		} catch (Exception e) {
			e.printStackTrace();
			return null;	
		}	
	}
	
	protected TemplateCompletionProcessor createTemplateProposalComputer(
			ScriptContentAssistInvocationContext context) {
		return new OctaveTemplateCompletionProcessor(context);
	}
	
	protected ScriptCompletionProposalCollector createCollector(
			ScriptContentAssistInvocationContext context) {
		ScriptCompletionProposalCollector collector = new OctaveCompletionProposalCollector(
				context.getSourceModule());
		return collector;
	}
}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
