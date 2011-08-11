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
package org.seisint.eclide.internal.ui;


import org.eclipse.dltk.ui.AbstractScriptProjectDecorator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.seisint.eclide.core.OctaveNature;

public class OctaveProjectDecorator extends AbstractScriptProjectDecorator {

	protected String getNatureId() {
		return OctaveNature.NATURE_ID;
	}

	protected ImageDescriptor getProjectDecorator() {
		return OctaveImages.PROJECT_DECARATOR;
	}
}