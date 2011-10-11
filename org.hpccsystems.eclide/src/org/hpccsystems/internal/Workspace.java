package org.hpccsystems.internal;

import java.util.HashSet;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.ide.IDE;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;

public class Workspace {
	
	public static final String MARKER_TYPE = "org.hpccsystems.eclide.eclProblem";

	//  Navigator Helpers  ---
	static public IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}
	
	static public IProject findProject(String name) {
		if (name.isEmpty())
			return null;

		return getWorkspaceRoot().getProject(name);
	}

	static public IFile findFile(IProject project, String name) {
		if (name.isEmpty())
			return null;

		return project.getFile(name);
	}
	
	static public IFile findFile(String name) {
		if (name.isEmpty())
			return null;

		IProject[] projects = getWorkspaceRoot().getProjects();
        for (int i = 0; i < projects.length; i++) {
        	IFile retVal = findFile(projects[i], name);
        	if (retVal != null)
        		return retVal;
        }
        return null;
	}

	//  Viewer Helpers  ---
	static public MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}

	static public HtmlViewer findHtmlViewer() {
		return HtmlViewer.getDefault();
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
						if (oneErrorOnly && markers[i].getAttribute(IMarker.SEVERITY).equals(IMarker.SEVERITY_ERROR))
							return;
						
						if (markers[i].getAttribute(IMarker.SEVERITY).equals(severity) && 
								markers[i].getAttribute(IMarker.MESSAGE).equals(message) && 
								markers[i].getAttribute(IMarker.LINE_NUMBER).equals(lineNumber)) {
							return;
						}
					}
		
					IMarker marker = resolvedFile.createMarker(MARKER_TYPE);
					marker.setAttribute(IMarker.SEVERITY, severity);
					marker.setAttribute(IMarker.MESSAGE, message);
					marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
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
		return (IResource[]) dirtyres.toArray(new IResource[dirtyres.size()]);
	}
	
	public static void doSaveDirty(IProject project)
	{
		IProject[] projects = new IProject[1];
		projects[0] = project;
		IResource[] resources = getScopedDirtyResources(projects);
		IDE.saveAllEditors(resources, false);			
	}
}
