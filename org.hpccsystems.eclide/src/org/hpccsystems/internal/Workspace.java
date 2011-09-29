package org.hpccsystems.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;

public class Workspace {
	
	public static final String MARKER_TYPE = "org.hpccsystems.eclide.eclProblem";
	
	static public MessageConsole FindConsole(String name) {
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

	static public HtmlViewer FindHtmlViewer() {
		return HtmlViewer.getDefault();
	}
	
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

	

}
