package org.seisint.eclide.internal.search;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.core.search.DLTKSearchParticipant;
import org.eclipse.dltk.core.search.SearchDocument;
import org.eclipse.dltk.internal.core.Model;

@SuppressWarnings("restriction")
public class OctaveSearchParticipant extends DLTKSearchParticipant {

	public SearchDocument getDocument(String documentPath, IProject project) {
		return new OctaveLazySearchDocument(documentPath, this,
				isExternal(documentPath), project);	
	}
	
	private boolean isExternal(String documentPath) {
		Object target = Model.getTarget(ResourcesPlugin.getWorkspace()
				.getRoot(), new Path(documentPath), true);
		if (target instanceof IResource)
			return false;
		else
			return true;
	}

}
