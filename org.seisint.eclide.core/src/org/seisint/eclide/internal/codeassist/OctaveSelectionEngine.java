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
package org.seisint.eclide.internal.codeassist;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;
import org.eclipse.dltk.codeassist.AssistParser;
import org.eclipse.dltk.codeassist.IAssistParser;
import org.eclipse.dltk.codeassist.ScriptSelectionEngine;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.search.FieldDeclarationMatch;
import org.eclipse.dltk.core.search.FieldReferenceMatch;
import org.eclipse.dltk.core.search.IDLTKSearchConstants;
import org.eclipse.dltk.core.search.IDLTKSearchScope;
import org.eclipse.dltk.core.search.MethodDeclarationMatch;
import org.eclipse.dltk.core.search.MethodReferenceMatch;
import org.eclipse.dltk.core.search.SearchEngine;
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.core.search.SearchRequestor;
import org.eclipse.dltk.internal.core.ModelElement;
import org.seisint.eclide.ast.OctaveIdentifier;
import org.seisint.eclide.ast.OctaveSymbolCallExpression;
import org.seisint.eclide.ast.OctaveSymbolReference;
import org.seisint.eclide.ast.OctaveTranslationUnit;
import org.seisint.eclide.ast.OctaveVariableDeclaration;
import org.seisint.eclide.internal.codeassist.selection.OctaveSelectionParser;
import org.seisint.eclide.internal.search.OctaveSearchParticipant;

@SuppressWarnings("restriction")
public class OctaveSelectionEngine extends ScriptSelectionEngine {

	private AssistParser parser = new AssistParser(new OctaveSelectionParser());;
	private ISourceModule sourceModule;
	private int actualSelectionStart;
	private int actualSelectionEnd;
	private List<IModelElement> selectionElements = new ArrayList<IModelElement>();
	private SearchEngine searchEngine = new SearchEngine();

	public IModelElement[] select(IModuleSource module, int start, int end) {
		sourceModule = (org.eclipse.dltk.core.ISourceModule)module.getModelElement();
		this.actualSelectionStart = start;
		this.actualSelectionEnd = end;
		try {
			OctaveTranslationUnit parsedUnit = (OctaveTranslationUnit)parser.parse(module);
			if (parsedUnit != null) {			
				final SearchRequestor methodRequestor = new SearchRequestor() {
					public void acceptSearchMatch(SearchMatch match)
							throws CoreException {
						Object element = match.getElement();						
						if (match instanceof MethodDeclarationMatch)
						{
							if (element instanceof IModelElement) {
								selectionElements.add((IModelElement)element);
							}
						}
						if (match instanceof MethodReferenceMatch)
						{
							System.err.println("MethodReferenceMatch: " + match.toString());
						}
					}
				};
				final SearchRequestor fieldRequestor = new SearchRequestor() {
					public void acceptSearchMatch(SearchMatch match)
							throws CoreException {
						Object element = match.getElement();						
						if (match instanceof FieldDeclarationMatch)
						{
							if (element instanceof IModelElement) {
								selectionElements.add((IModelElement)element);
							}
						}
						else if (match instanceof FieldReferenceMatch)
						{
							FieldReferenceMatch frm = (FieldReferenceMatch)match;
							IModelElement[] arr = new IModelElement[0];
							if (element instanceof IMethod) {
								IMethod method = (IMethod) element;
								arr = method.getChildren();
							} else if (element instanceof ISourceModule) {
								ISourceModule m = (ISourceModule)element;
								arr = ((ModelElement)m).getChildren();
							}
							for (int i = 0; i < arr.length; ++i) {
								ASTNode node = frm.getNode();
								String name;
								if (node instanceof OctaveSymbolReference)
									name = ((OctaveSymbolReference)node).getId().getText();
								else if (node instanceof OctaveVariableDeclaration) {
									name = ((OctaveVariableDeclaration)node).getName();
								} else if (node instanceof OctaveIdentifier) {
									name = ((OctaveIdentifier)node).getText();
								} else {
									name = node.toString();
								}
								if (arr[i].getElementName().equals(name)) {
									if (!selectionElements.contains(arr[i]))
										selectionElements.add((IModelElement)arr[i]);
								}
							}
						}
					}
				};
				final IModelElement element = module.getModelElement();
				ASTVisitor visitor = new ASTVisitor() {				
					public boolean visit(Expression s) throws Exception {
						if (s.sourceStart() <= actualSelectionStart && 
								s.sourceEnd() >= actualSelectionEnd) {
							if (s instanceof OctaveSymbolCallExpression) {
								/* search through all the methods in the library path */
								ASTNode rcvr = ((OctaveSymbolCallExpression)s).getReceiver();
								if (rcvr instanceof OctaveSymbolReference) {
									String name = ((OctaveSymbolReference)rcvr).getId().getText();
									searchForMethod(element, methodRequestor, name);
									/* 
									 * Note: If this is actually a matrix reference a(1), then well catch
									 * it when the visitor has s as an OctaveSymbolReference
									 */
								}
							} else if (s instanceof OctaveSymbolReference) {
								String name = ((OctaveSymbolReference)s).getId().getText();
								searchForField(element, fieldRequestor, name);
							}
						}
						return true;
					}
					public boolean visit(Statement s) throws Exception {
						if (s.sourceStart() <= actualSelectionStart && 
								s.sourceEnd() >= actualSelectionEnd) {
							if (s instanceof OctaveVariableDeclaration) {
								String name = ((OctaveVariableDeclaration)s).getName();
								searchForField(element, fieldRequestor, name);
							}
						}
						return true;
					}
				};
				parsedUnit.traverse(visitor);
			}
		} catch (Exception e) {
		}
		return (IModelElement[]) selectionElements
			.toArray(new IModelElement[selectionElements.size()]);
	}

	protected void searchForMethod(IModelElement element,
			SearchRequestor methodRequestor,
			String name) throws CoreException {
		if (methodRequestor != null && selectionElements.isEmpty()) 
		{
			IDLTKSearchScope scope = SearchEngine.createSearchScope(element.getScriptProject());
			search(name, IDLTKSearchConstants.METHOD,
					IDLTKSearchConstants.DECLARATIONS, scope, methodRequestor);
		}
	}
	
	protected void searchForField(IModelElement element, SearchRequestor fieldRequestor,
			String name) throws CoreException {
		if (fieldRequestor != null && selectionElements.isEmpty())
		{
			IDLTKSearchScope scope2 = SearchEngine
				.createSearchScope( element );
			search(name, IDLTKSearchConstants.FIELD,
					IDLTKSearchConstants.ALL_OCCURRENCES, scope2, fieldRequestor);
		}
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
				searchFor, limitTo, matchRule, DLTKLanguageManager.getLanguageToolkit(sourceModule.getScriptProject()));
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
package org.seisint.eclide.internal.codeassist;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.statements.Statement;
import org.eclipse.dltk.codeassist.AssistParser;
import org.eclipse.dltk.codeassist.IAssistParser;
import org.eclipse.dltk.codeassist.ScriptSelectionEngine;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.search.FieldDeclarationMatch;
import org.eclipse.dltk.core.search.FieldReferenceMatch;
import org.eclipse.dltk.core.search.IDLTKSearchConstants;
import org.eclipse.dltk.core.search.IDLTKSearchScope;
import org.eclipse.dltk.core.search.MethodDeclarationMatch;
import org.eclipse.dltk.core.search.MethodReferenceMatch;
import org.eclipse.dltk.core.search.SearchEngine;
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.core.search.SearchRequestor;
import org.eclipse.dltk.internal.core.ModelElement;
import org.seisint.eclide.ast.OctaveIdentifier;
import org.seisint.eclide.ast.OctaveSymbolCallExpression;
import org.seisint.eclide.ast.OctaveSymbolReference;
import org.seisint.eclide.ast.OctaveTranslationUnit;
import org.seisint.eclide.ast.OctaveVariableDeclaration;
import org.seisint.eclide.internal.codeassist.selection.OctaveSelectionParser;
import org.seisint.eclide.internal.search.OctaveSearchParticipant;

@SuppressWarnings("restriction")
public class OctaveSelectionEngine extends ScriptSelectionEngine {

	private AssistParser parser = new AssistParser(new OctaveSelectionParser());;
	private ISourceModule sourceModule;
	private int actualSelectionStart;
	private int actualSelectionEnd;
	private List<IModelElement> selectionElements = new ArrayList<IModelElement>();
	private SearchEngine searchEngine = new SearchEngine();

	public IModelElement[] select(IModuleSource module, int start, int end) {
		sourceModule = (org.eclipse.dltk.core.ISourceModule)module.getModelElement();
		this.actualSelectionStart = start;
		this.actualSelectionEnd = end;
		try {
			OctaveTranslationUnit parsedUnit = (OctaveTranslationUnit)parser.parse(module);
			if (parsedUnit != null) {			
				final SearchRequestor methodRequestor = new SearchRequestor() {
					public void acceptSearchMatch(SearchMatch match)
							throws CoreException {
						Object element = match.getElement();						
						if (match instanceof MethodDeclarationMatch)
						{
							if (element instanceof IModelElement) {
								selectionElements.add((IModelElement)element);
							}
						}
						if (match instanceof MethodReferenceMatch)
						{
							System.err.println("MethodReferenceMatch: " + match.toString());
						}
					}
				};
				final SearchRequestor fieldRequestor = new SearchRequestor() {
					public void acceptSearchMatch(SearchMatch match)
							throws CoreException {
						Object element = match.getElement();						
						if (match instanceof FieldDeclarationMatch)
						{
							if (element instanceof IModelElement) {
								selectionElements.add((IModelElement)element);
							}
						}
						else if (match instanceof FieldReferenceMatch)
						{
							FieldReferenceMatch frm = (FieldReferenceMatch)match;
							IModelElement[] arr = new IModelElement[0];
							if (element instanceof IMethod) {
								IMethod method = (IMethod) element;
								arr = method.getChildren();
							} else if (element instanceof ISourceModule) {
								ISourceModule m = (ISourceModule)element;
								arr = ((ModelElement)m).getChildren();
							}
							for (int i = 0; i < arr.length; ++i) {
								ASTNode node = frm.getNode();
								String name;
								if (node instanceof OctaveSymbolReference)
									name = ((OctaveSymbolReference)node).getId().getText();
								else if (node instanceof OctaveVariableDeclaration) {
									name = ((OctaveVariableDeclaration)node).getName();
								} else if (node instanceof OctaveIdentifier) {
									name = ((OctaveIdentifier)node).getText();
								} else {
									name = node.toString();
								}
								if (arr[i].getElementName().equals(name)) {
									if (!selectionElements.contains(arr[i]))
										selectionElements.add((IModelElement)arr[i]);
								}
							}
						}
					}
				};
				final IModelElement element = module.getModelElement();
				ASTVisitor visitor = new ASTVisitor() {				
					public boolean visit(Expression s) throws Exception {
						if (s.sourceStart() <= actualSelectionStart && 
								s.sourceEnd() >= actualSelectionEnd) {
							if (s instanceof OctaveSymbolCallExpression) {
								/* search through all the methods in the library path */
								ASTNode rcvr = ((OctaveSymbolCallExpression)s).getReceiver();
								if (rcvr instanceof OctaveSymbolReference) {
									String name = ((OctaveSymbolReference)rcvr).getId().getText();
									searchForMethod(element, methodRequestor, name);
									/* 
									 * Note: If this is actually a matrix reference a(1), then well catch
									 * it when the visitor has s as an OctaveSymbolReference
									 */
								}
							} else if (s instanceof OctaveSymbolReference) {
								String name = ((OctaveSymbolReference)s).getId().getText();
								searchForField(element, fieldRequestor, name);
							}
						}
						return true;
					}
					public boolean visit(Statement s) throws Exception {
						if (s.sourceStart() <= actualSelectionStart && 
								s.sourceEnd() >= actualSelectionEnd) {
							if (s instanceof OctaveVariableDeclaration) {
								String name = ((OctaveVariableDeclaration)s).getName();
								searchForField(element, fieldRequestor, name);
							}
						}
						return true;
					}
				};
				parsedUnit.traverse(visitor);
			}
		} catch (Exception e) {
		}
		return (IModelElement[]) selectionElements
			.toArray(new IModelElement[selectionElements.size()]);
	}

	protected void searchForMethod(IModelElement element,
			SearchRequestor methodRequestor,
			String name) throws CoreException {
		if (methodRequestor != null && selectionElements.isEmpty()) 
		{
			IDLTKSearchScope scope = SearchEngine.createSearchScope(element.getScriptProject());
			search(name, IDLTKSearchConstants.METHOD,
					IDLTKSearchConstants.DECLARATIONS, scope, methodRequestor);
		}
	}
	
	protected void searchForField(IModelElement element, SearchRequestor fieldRequestor,
			String name) throws CoreException {
		if (fieldRequestor != null && selectionElements.isEmpty())
		{
			IDLTKSearchScope scope2 = SearchEngine
				.createSearchScope( element );
			search(name, IDLTKSearchConstants.FIELD,
					IDLTKSearchConstants.ALL_OCCURRENCES, scope2, fieldRequestor);
		}
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
				searchFor, limitTo, matchRule, DLTKLanguageManager.getLanguageToolkit(sourceModule.getScriptProject()));
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
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
