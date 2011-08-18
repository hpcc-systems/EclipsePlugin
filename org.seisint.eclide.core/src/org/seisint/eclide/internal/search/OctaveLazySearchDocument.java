/*******************************************************************************
 * Copyright (c) 2010 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.internal.search;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.core.search.IDLTKSearchScope;
import org.eclipse.dltk.core.search.SearchDocument;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.internal.core.Model;
import org.eclipse.dltk.internal.core.search.LazyDLTKSearchDocument;
import org.eclipse.dltk.internal.core.util.Util;

@SuppressWarnings("restriction")
public class OctaveLazySearchDocument extends LazyDLTKSearchDocument {

	public OctaveLazySearchDocument(String path, SearchParticipant participant,
			boolean external, IProject project) {
		super(path, participant, external, project);
	}

	public OctaveLazySearchDocument(String path, IPath containerPath,
			char[] contents, SearchParticipant participant, boolean external,
			IProject project) {
		super(path, containerPath, contents, participant, external, project);
	}
	
	private void loadContents() {
		if (charContents == null) {
			charContents = getDocumentContents(getPath());
		}
	}
	
	private static final boolean WINDOWS = (Platform.getOS() == Platform.OS_WIN32);
	
	private char[] getDocumentContents(String documentPath) {
		Object target = null;
		if (!WINDOWS)
		{
			String devicePart = null;			
			int i = documentPath.indexOf(Path.DEVICE_SEPARATOR);
			if (i != -1) {
				int start = documentPath.charAt(0) == Path.SEPARATOR ? 1 : 0;
				devicePart = documentPath.substring(start, i + 1);
				documentPath = documentPath.substring(i + 1, documentPath.length());
			}
			target = Model.getTarget(ResourcesPlugin.getWorkspace()
					.getRoot(), new Path(devicePart, documentPath), true);
		}
		else
		{
			target = Model.getTarget(ResourcesPlugin.getWorkspace()
					.getRoot(), new Path(documentPath), true);
		}
		try {
			if (target instanceof IFile) {
				return Util.getResourceContentsAsCharArray((IFile) target);
			} else if (target instanceof IFileHandle) {
				return Util.getResourceContentsAsCharArray((IFileHandle) target);
			}
		} catch (ModelException e) {
			if (DLTKCore.DEBUG) {
				e.printStackTrace();
			}
		}
		return CharOperation.NO_CHAR;
	}
	
	public String getContents() {
		loadContents();
		return new String(charContents);
	}

	public char[] getCharContents() {
		loadContents();
		return charContents;
	}
	
}
