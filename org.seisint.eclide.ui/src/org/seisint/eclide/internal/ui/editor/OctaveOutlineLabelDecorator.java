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
package org.seisint.eclide.internal.ui.editor;

import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.ui.viewsupport.ImageImageDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;

public class OctaveOutlineLabelDecorator  extends LabelProvider implements ILabelDecorator {

	public Image decorateImage(Image image, Object element) {
		try {
			if (element instanceof IField) {
				IField field = (IField) element;
				ImageDescriptor baseImage = new ImageImageDescriptor(image);
				Rectangle bounds = image.getBounds();
				ImageDescriptor dsc = new OctaveOutlineElementImageDescriptor(
						baseImage, new Point(bounds.width, bounds.height),
						field.getFlags());				
				return dsc.createImage();
			}
		} catch (ModelException e) {
		}
		return image;
	}

	public String decorateText(String text, Object element) {
		return text;
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
package org.seisint.eclide.internal.ui.editor;

import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.ui.viewsupport.ImageImageDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;

public class OctaveOutlineLabelDecorator  extends LabelProvider implements ILabelDecorator {

	public Image decorateImage(Image image, Object element) {
		try {
			if (element instanceof IField) {
				IField field = (IField) element;
				ImageDescriptor baseImage = new ImageImageDescriptor(image);
				Rectangle bounds = image.getBounds();
				ImageDescriptor dsc = new OctaveOutlineElementImageDescriptor(
						baseImage, new Point(bounds.width, bounds.height),
						field.getFlags());				
				return dsc.createImage();
			}
		} catch (ModelException e) {
		}
		return image;
	}

	public String decorateText(String text, Object element) {
		return text;
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
