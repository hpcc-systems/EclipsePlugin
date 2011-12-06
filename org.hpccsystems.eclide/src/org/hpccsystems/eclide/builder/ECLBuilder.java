/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.eclide.builder;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class ECLBuilder extends IncrementalProjectBuilder {

	class ECLDeltaVisitor implements IResourceDeltaVisitor {
		private IProgressMonitor monitor;
		
		ECLDeltaVisitor(IProgressMonitor monitor) {
			this.monitor = monitor;
		}
		
		public boolean visit(IResourceDelta delta) throws CoreException {
			if (monitor.isCanceled()) {
				return false;
			}
			
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				checkItem(resource, monitor);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				checkItem(resource, monitor);
				break;
			}
			return true;
		}
	}

	class ECLResourceVisitor implements IResourceVisitor {
		private IProgressMonitor monitor;

		ECLResourceVisitor(IProgressMonitor monitor) {
			this.monitor = monitor;
		}

		public boolean visit(IResource resource) {
			if (monitor.isCanceled()) {
				return false;
			}

			checkItem(resource, monitor);
			return true;
		}
	}

	public static final String BUILDER_ID = "org.hpccsystems.eclide.eclBuilder";
	Set<IFile> checkedFiles;

	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		monitor.setTaskName("Checking Syntax");
		checkedFiles = new HashSet<IFile>();
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	void checkItem(IResource resource, IProgressMonitor monitor) {
		if (resource instanceof IFile && resource.getName().endsWith(".ecl")) {
			IFile file = (IFile) resource;
			if (checkedFiles.contains(file))
				return;
			
			checkedFiles.add(file);
			monitor.subTask(file.getName());
			ECLCompiler compiler = new ECLCompiler(getProject());
			compiler.refreshMeta(file);			

			RelationshipHelper rhelper = new RelationshipHelper(file);
			try {
				compiler.checkSyntax(file);
				if (!compiler.hasError && compiler.ancestors != null) {
					rhelper.setAncestors(compiler.ancestors);
				}
				Set<IFile> descendants = new HashSet<IFile>(rhelper.getDescendants());
				Iterator<IFile> itr = descendants.iterator(); 
				while (itr.hasNext()) {
					checkItem(itr.next(), monitor);
				}
			} finally {
				rhelper.close();
			}
		}
	}

	protected void fullBuild(final IProgressMonitor monitor) throws CoreException {
		ECLMeta.get().clear();
		getProject().accept(new ECLResourceVisitor(monitor));
	}

	protected void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) throws CoreException {
		delta.accept(new ECLDeltaVisitor(monitor));
	}
}
