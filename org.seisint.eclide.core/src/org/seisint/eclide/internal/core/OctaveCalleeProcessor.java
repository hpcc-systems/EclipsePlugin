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
package org.seisint.eclide.internal.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.ast.references.SimpleReference;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.compiler.SourceElementRequestorAdaptor;
import org.eclipse.dltk.compiler.env.MethodSourceCode;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.ICalleeProcessor;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceElementParser;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.search.IDLTKSearchScope;
import org.eclipse.dltk.core.search.SearchEngine;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.core.search.SearchRequestor;
import org.seisint.eclide.core.OctaveNature;
import org.seisint.eclide.internal.search.OctaveSearchParticipant;

public class OctaveCalleeProcessor implements ICalleeProcessor {
	private IMethod method;
	
	private Map<SimpleReference, IMethod[]> fSearchResults = new HashMap<SimpleReference, IMethod[]>();
	
	public OctaveCalleeProcessor(IMethod method, IProgressMonitor monitor,
			IDLTKSearchScope scope) {
		this.method = method;
	}
	
	private class CalleeSourceElementRequestor extends SourceElementRequestorAdaptor {

		@Override
		public void acceptFieldReference(String fieldName, int sourcePosition) {
			int off = 0;
			try {
				off = method.getSourceRange().getOffset();
			} catch (ModelException e) {
				e.printStackTrace();
			}
			SimpleReference ref = new SimpleReference(off + sourcePosition, off
					+ sourcePosition + fieldName.length(), fieldName);
			IMethod[] methods = findMethods(fieldName, off
					+ sourcePosition + fieldName.length() - 1);
			fSearchResults.put(ref, methods);
		}

		@Override
		public void acceptMethodReference(String methodName, int argCount,
				int sourcePosition, int sourceEndPosition) {
			int off = 0;
			try {
				off = method.getSourceRange().getOffset();
			} catch (ModelException e) {
				e.printStackTrace();
			}
			SimpleReference ref = new SimpleReference(off + sourcePosition, off
					+ sourceEndPosition, methodName);
			IMethod[] methods = findMethods(methodName, off
					+ sourceEndPosition - 1);
			fSearchResults.put(ref, methods);
		}
		
	}

	public Map<SimpleReference, IMethod[]> doOperation() {
		try {
			if (method.getSource() != null) {
				CalleeSourceElementRequestor requestor = new CalleeSourceElementRequestor();
				ISourceElementParser parser = DLTKLanguageManager
						.getSourceElementParser(OctaveNature.NATURE_ID);
				parser.setRequestor(requestor);
				parser.parseSourceModule(new MethodSourceCode(method));
			} else {
				// TODO: Report error here.
			}
			return fSearchResults;
		} catch (ModelException e) {
			if (DLTKCore.DEBUG) {
				e.printStackTrace();
			}
		} 
		return fSearchResults;
	}
	
	public IMethod[] findMethods(final String methodName, int sourcePosition) {
		final List<IMethod> methods = new ArrayList<IMethod>();
		ISourceModule module = this.method.getSourceModule();
		try {
			IModelElement[] elements = module.codeSelect(sourcePosition, 1);
			for (int i = 0; i < elements.length; ++i) {
				if (elements[i] instanceof IMethod) {
					methods.add((IMethod)elements[i]);
				}
			}
		} catch (ModelException e) {
			e.printStackTrace();
		}
		return (IMethod[]) methods.toArray(new IMethod[methods.size()]);
	}
	
	private SearchEngine searchEngine = new SearchEngine();
	
	protected void search(String patternString, int searchFor, int limitTo,
			IDLTKSearchScope scope, SearchRequestor resultCollector)
			throws CoreException {
		search(patternString, searchFor, limitTo, 
				SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE, 
				scope,
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
				searchFor, limitTo, matchRule, scope.getLanguageToolkit());
		searchEngine.search(pattern,
				new SearchParticipant[] { new OctaveSearchParticipant() }, scope, requestor,
				null);
	}

}
