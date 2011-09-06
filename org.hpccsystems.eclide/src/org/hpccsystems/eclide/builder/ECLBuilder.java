/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */
package org.hpccsystems.eclide.builder;

import java.util.Map;

//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.parsers.SAXParser;
//import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

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
		private boolean cleanOnly;

		ECLResourceVisitor(IProgressMonitor monitor) {
			this.monitor = monitor;
			this.cleanOnly = cleanOnly;
		}

		public boolean visit(IResource resource) {
			if (monitor.isCanceled()) {
				return false;
			}

			checkItem(resource, monitor);
			return true;
		}
	}

	class ECLErrorHandler extends DefaultHandler {
		
		private IFile file;

		public ECLErrorHandler(IFile file) {
			this.file = file;
		}

		private void addMarker(SAXParseException e, int severity) {
			ECLBuilder.this.addMarker(file, e.getMessage(), e
					.getLineNumber(), severity);
		}

		public void error(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_ERROR);
		}

		public void fatalError(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_ERROR);
		}

		public void warning(SAXParseException exception) throws SAXException {
			addMarker(exception, IMarker.SEVERITY_WARNING);
		}
	}

	public static final String BUILDER_ID = "org.hpccsystems.eclide.eclBuilder";

	private static final String MARKER_TYPE = "org.hpccsystems.eclide.eclProblem";

//	private SAXParserFactory parserFactory;

	private void addMarker(IFile file, String message, int lineNumber,
			int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
		}
	}

	protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
		monitor.setTaskName("Checking Syntax");
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
			monitor.subTask(file.getName());
			ECLCompiler compiler = new ECLCompiler(getProject());
			compiler.CheckSyntax(file);
		}
	}

	protected void fullBuild(final IProgressMonitor monitor) throws CoreException {
		getProject().accept(new ECLResourceVisitor(monitor));
	}

	protected void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) throws CoreException {
		delta.accept(new ECLDeltaVisitor(monitor));
	}
}
