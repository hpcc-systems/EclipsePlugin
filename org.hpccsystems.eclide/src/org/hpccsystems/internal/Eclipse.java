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
package org.hpccsystems.internal;

import java.util.HashSet;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.ide.IDE;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;
import org.hpccsystems.eclide.ui.viewer.ResultViewer;
import org.hpccsystems.eclide.ui.viewer.platform.WorkunitsViewer;

public class Eclipse {

	public static final String MARKER_TYPE = "org.hpccsystems.eclide.eclProblem";

	//  Navigator Helpers  ---
	static public IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	static public IResource findResource(IPath path) {
		return getWorkspaceRoot().getFileForLocation(path);
	}

	static public IResource findResource(String absolutePath) {
		if (absolutePath == null || absolutePath.isEmpty()) {
			return null;
		}

		IPath path = new Path(absolutePath);
		return getWorkspaceRoot().getFileForLocation(path);
	}

	static public IProject findProject(String name) {
		if (name.isEmpty()) {
			return null;
		}

		return getWorkspaceRoot().getProject(name);
	}

	static public IFile findFile(IProject project, String name) {
		if (name.isEmpty()) {
			return null;
		}

		return project.getFile(name);
	}

	static public IFile findFile(String name) {
		if (name.isEmpty()) {
			return null;
		}

		IProject[] projects = getWorkspaceRoot().getProjects();
		for (int i = 0; i < projects.length; i++) {
			IFile retVal = findFile(projects[i], name);
			if (retVal != null) {
				return retVal;
			}
		}
		return null;
	}

	static public IFile findFile(IPath path) {
		return findFile(path, null);
	}

	static public IFile findFile(IPath path, IProject project) {
		if (path == null || path.isEmpty()) {
			return null;
		}
		
		if (path.isAbsolute())
		{
			IFile[] files = Eclipse.getWorkspaceRoot().findFilesForLocationURI(path.toFile().toURI(), IContainer.INCLUDE_HIDDEN);
			if (files.length > 0) {
				for(int i = 0; i < files.length; ++i) {
					if (files[i].getProject() == project) {
						return files[i]; 
					}
				}
				return files[0];
			}  
		}

		return getWorkspaceRoot().getFile(path);
	}

	//  Viewer Helpers  ---
	static public MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName())) {
				return (MessageConsole) existing[i];
			}
		}
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}

	static public void showHtmlViewer() {
		IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
		for (int i = 0; i < windows.length; ++i) {
			final IWorkbenchPage window = windows[i].getActivePage();
			if (window != null) {
				Display.getDefault().syncExec(new Runnable() {   
					@Override
					public void run() {
						try {
							window.showView(HtmlViewer.PI_UI_HTMLVIEW);
						} catch (PartInitException e) {
							e.printStackTrace();
						}
					}
				});
			}
		}
	}

	static public HtmlViewer findHtmlViewer() {
		HtmlViewer retVal = HtmlViewer.getDefault();
		/*
		if (retVal == null) {
			showHtmlViewer();
		}
		retVal = HtmlViewer.getDefault();
		 */
		return retVal;
	}

	static public WorkunitsViewer findWorkunitsViewer() {
		WorkunitsViewer retVal = WorkunitsViewer.getDefault();
		return retVal;
	}

	static public void showResultViewer() {
		IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
		for (int i = 0; i < windows.length; ++i) {
			final IWorkbenchPage window = windows[i].getActivePage();
			if (window != null) {
				Display.getDefault().syncExec(new Runnable() {   
					@Override
					public void run() {
						try {
							window.showView(ResultViewer.PI_UI_RESULTVIEW);
						} catch (PartInitException e) {
							e.printStackTrace();
						}
					}
				});
			}
		}
	}

	static public ResultViewer findResultViewer() {
		ResultViewer retVal = ResultViewer.getDefault();
		/*
		if (retVal == null) {
			showResultViewer();
		}
		retVal = ResultViewer.getDefault();
		 */
		return retVal;
	}

	//  Marker Helpers  ---
	static public void addMarker(IResource resolvedFile, int severity, String code, String message, int lineNumber, int colNumber, boolean oneErrorOnly)
	{
		if (resolvedFile != null)
		{
			if (lineNumber <= 0) {
				lineNumber = 1;
			}
			if (colNumber <= 0) {
				colNumber = 1;
			}

			if (resolvedFile.exists()) {
				try {
					IMarker[] markers = resolvedFile.findMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
					for (int i = 0; i < markers.length; ++i) {
						if (oneErrorOnly && markers[i].getAttribute(IMarker.SEVERITY).equals(IMarker.SEVERITY_ERROR)) {
							return;
						}

						if (markers[i].getAttribute(IMarker.SEVERITY).equals(severity) && 
								markers[i].getAttribute(IMarker.MESSAGE).equals(message) && 
								markers[i].getAttribute(IMarker.LINE_NUMBER).equals(lineNumber)) {
							return;
						}
					}

					IMarker marker = resolvedFile.createMarker(MARKER_TYPE);
					marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
					marker.setAttribute(IMarker.MESSAGE, message);
					marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
					marker.setAttribute(IMarker.SEVERITY, severity);
					//marker.setAttribute(IMarker.CHAR_START, 1);
					//marker.setAttribute(IMarker.CHAR_END, 3);

				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}

	static public void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	//  Dirty Helpers  ---
	static protected IResource[] getScopedDirtyResources(IProject[] projects) {
		HashSet<IResource> dirtyres = new HashSet<IResource>();
		IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
		for (int l = 0; l < windows.length; l++) {
			IWorkbenchPage[] pages = windows[l].getPages();
			for (int i = 0; i < pages.length; i++) {
				IEditorPart[] eparts = pages[i].getDirtyEditors();
				for (int j = 0; j < eparts.length; j++) {
					IResource resource = (IResource) eparts[j].getEditorInput().getAdapter(IResource.class);
					if (resource != null) {
						for (int k = 0; k < projects.length; k++) {
							if (projects[k].equals(resource.getProject())) {
								dirtyres.add(resource);
							}
						}
					}
				}
			}
		}
		return dirtyres.toArray(new IResource[dirtyres.size()]);
	}

	public static void doSaveDirty(IProject project)
	{
		IProject[] projects = new IProject[1];
		projects[0] = project;
		IResource[] resources = getScopedDirtyResources(projects);
		IDE.saveAllEditors(resources, false);			
	}
}
