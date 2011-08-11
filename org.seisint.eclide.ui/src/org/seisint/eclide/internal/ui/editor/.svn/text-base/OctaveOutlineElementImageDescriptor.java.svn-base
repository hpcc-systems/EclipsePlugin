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
package org.seisint.eclide.internal.ui.editor;


import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.internal.ui.editor.AnnotatedImageDescriptor;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.seisint.eclide.internal.ui.OctaveImages;

@SuppressWarnings("deprecation")
public class OctaveOutlineElementImageDescriptor extends AnnotatedImageDescriptor {

	private int fFlags;
	
	public OctaveOutlineElementImageDescriptor(
			ImageDescriptor baseImageDescriptor, Point size, int flags) {
		super(baseImageDescriptor, size);
		fFlags = flags;
	}

	protected void drawAnnotations() {
		ImageData data = null;
		if ((fFlags & Modifiers.AccGlobal) != 0) {
			data = getImageData(DLTKPluginImages.DESC_OVR_FIELD_GLOBAL);
		/*
		} else if ((fFlags & OctaveASTConstants.INDEX_EXPR) != 0) {
			data = getImageData(DLTKPluginImages.DESC_OVR_FIELD_INDEX);
		*/
		} else if ((fFlags & Modifiers.AccStatic) != 0) {
			data = getImageData(OctaveImages.STATIC_DECARATOR);
		}
		if (data != null) {
			drawImageTopRight(data);
		}
	}

}
