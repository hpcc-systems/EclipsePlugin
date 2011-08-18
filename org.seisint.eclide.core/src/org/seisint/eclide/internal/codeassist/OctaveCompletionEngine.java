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
package org.seisint.eclide.internal.codeassist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.references.SimpleReference;
import org.eclipse.dltk.codeassist.AssistParser;
import org.eclipse.dltk.codeassist.IAssistParser;
import org.eclipse.dltk.codeassist.ICompletionNameProvider;
import org.eclipse.dltk.codeassist.ScriptCompletionEngine;
import org.eclipse.dltk.codeassist.complete.CompletionNodeFound;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.env.lookup.Scope;
import org.eclipse.dltk.core.CompletionContext;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.IType;
import org.eclipse.dltk.core.search.FieldDeclarationMatch;
import org.eclipse.dltk.core.search.FieldReferenceMatch;
import org.eclipse.dltk.core.search.IDLTKSearchConstants;
import org.eclipse.dltk.core.search.IDLTKSearchScope;
import org.eclipse.dltk.core.search.MethodDeclarationMatch;
import org.eclipse.dltk.core.search.SearchEngine;
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.core.search.SearchRequestor;
import org.seisint.eclide.ast.OctaveTranslationUnit;
import org.seisint.eclide.internal.codeassist.completion.OctaveCompletionOnIdentifierOrKeyword;
import org.seisint.eclide.internal.codeassist.completion.OctaveCompletionParser;
import org.seisint.eclide.internal.search.OctaveSearchParticipant;

@SuppressWarnings("restriction")
public class OctaveCompletionEngine extends ScriptCompletionEngine {

	private AssistParser parser;
	protected ISourceModule sourceModule;
	private SearchEngine searchEngine = new SearchEngine();
	
	public static final ICompletionNameProvider<IField> FIELD_NAME_PROVIDER = new ICompletionNameProvider<IField>() {

		public String getCompletion(IField t) {
			return t.getElementName();
		}

		public String getName(IField t) {
			return t.getElementName();
		}
		
	};

	public OctaveCompletionEngine() {
		this.parser = new AssistParser(new OctaveCompletionParser());
	}

	protected int getEndOfEmptyToken() {
		return 0;
	}

	public void complete(IModuleSource sourceModule, int position, int i) {
		boolean contextAccepted = false;
		try {
			this.actualCompletionPosition = position;
			this.offset = i;
			this.sourceModule = (ISourceModule) sourceModule.getModelElement();
			OctaveTranslationUnit parsedUnit = (OctaveTranslationUnit) this.parser
				.parse(sourceModule);
			if (parsedUnit != null) {
				try {
					this.source = sourceModule.getSourceContents().toCharArray();
					parser.parseBlockStatements(parsedUnit, 
							this.actualCompletionPosition);
				} catch (CompletionNodeFound e) {
					if (e.astNode != null) {
						contextAccepted = complete(e.astNode, this.parser.getAssistNodeParent(), 
								e.scope, e.insideTypeAnnotation);
					}
				}
			}
		} finally {
			if (!contextAccepted) {	
				contextAccepted = true;
				CompletionContext context = new CompletionContext();
				context.setTokenKind(CompletionContext.TOKEN_KIND_UNKNOWN);
				context.setOffset(position);
				this.requestor.acceptContext(context);
			}
			this.requestor.endReporting();
		}
	}

	private boolean complete(ASTNode astNode, ASTNode assistNodeParent,
			Scope scope, boolean insideTypeAnnotation) {
		setSourceRange(astNode.sourceStart(), astNode.sourceEnd());
		if (astNode instanceof OctaveCompletionOnIdentifierOrKeyword) {
			OctaveCompletionOnIdentifierOrKeyword key = (OctaveCompletionOnIdentifierOrKeyword) astNode;
			char[] token = key.getToken();
			String[] kw = key.getPossibleKeywords();
			findKeywords(key.getToken(), kw, key
					.canCompleteEmptyToken());
			final List<IMethod> methods = new ArrayList<IMethod>();
			final List<IField> fields = new ArrayList<IField>();
			final List<SimpleReference> references = new ArrayList<SimpleReference>();
			SearchRequestor methodRequestor = new SearchRequestor() {
				public void acceptSearchMatch(SearchMatch match)
						throws CoreException {
					if (match instanceof MethodDeclarationMatch) {
						Object element = match.getElement();
						IMethod method = (IMethod)element;
						methods.add(method);
					} 
				}
			};
			SearchRequestor fieldRequestor = new SearchRequestor() {
				public void acceptSearchMatch(SearchMatch match)
						throws CoreException {
					if (match instanceof FieldDeclarationMatch) {
						Object element = match.getElement();
						IField field = (IField)element;
						fields.add(field);
					} else if (match instanceof FieldReferenceMatch){
						FieldReferenceMatch frm = (FieldReferenceMatch)match;
						references.add((SimpleReference)frm.getNode());
					}
				}
			};
			try {
				String pattern = new String(key.getName()) + "*";
				/* search through all the methods in the library path */
				IDLTKSearchScope scope2 = SearchEngine.createSearchScope(
						sourceModule.getScriptProject());
				search(pattern, IDLTKSearchConstants.METHOD,
						IDLTKSearchConstants.DECLARATIONS, scope2, methodRequestor);
				/* search through all variables in this file */			
				IDLTKSearchScope scope3 = SearchEngine.createSearchScope(sourceModule);
				search(pattern, IDLTKSearchConstants.FIELD, 
						IDLTKSearchConstants.ALL_OCCURRENCES, scope3, fieldRequestor);
			} catch (CoreException e1) {
				e1.printStackTrace();
			}
			final String to = new String(token);
			findMethods(token, true, methods);
			findFields(token, true, fields, FIELD_NAME_PROVIDER);
			findLocalVariables(token, references, true, false);
			CompletionContext context = new CompletionContext();
			context.setTokenKind(CompletionContext.TOKEN_KIND_NAME);
			context.setOffset(astNode.sourceStart());
			this.requestor.acceptContext(context);
		} 
		return true;
	}
	
	private void findLocalVariables(char[] token, List<SimpleReference> references,
			boolean canCompleteEmptyToken, boolean provideDollar) {
		Map<String, SimpleReference> uniqueRefs = new HashMap<String, SimpleReference>();
		for (Iterator<SimpleReference> i = references.iterator(); i.hasNext(); ) {
			SimpleReference ref = (SimpleReference)i.next();
			uniqueRefs.put(ref.getName(), ref);			
		}
		String[] refArr = new String[uniqueRefs.values().size()];
		int k = 0;		
		for (Iterator<SimpleReference> i = uniqueRefs.values().iterator(); i.hasNext(); ++k) {
			SimpleReference ref = (SimpleReference)i.next();
			refArr[k] = ref.getName();
		}		
		findLocalVariables(token, refArr, canCompleteEmptyToken, provideDollar);
	}

	protected void search(String patternString, int searchFor, int limitTo,
			IDLTKSearchScope scope, SearchRequestor resultCollector)
			throws CoreException {
		search(patternString, searchFor, limitTo, SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE, scope,
				resultCollector);
	}
	
	protected void search(String patternString, int searchFor, int limitTo,
			int matchRule, IDLTKSearchScope scope, SearchRequestor requestor)
			throws CoreException {
		if (patternString.indexOf('*') != -1
				|| patternString.indexOf('?') != -1) {
			matchRule |= SearchPattern.R_PATTERN_MATCH;
		}
		SearchPattern pattern = SearchPattern.createPattern(patternString,
				searchFor, limitTo, matchRule, 
				DLTKLanguageManager.getLanguageToolkit(this.scriptProject));
		try {
			searchEngine
				.search(pattern,
						new SearchParticipant[] { new OctaveSearchParticipant() }, 
						scope, 
						requestor,
						null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
}
