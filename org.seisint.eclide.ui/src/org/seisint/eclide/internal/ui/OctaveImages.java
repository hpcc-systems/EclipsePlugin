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
package org.seisint.eclide.internal.ui;

import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.ui.PluginImagesHelper;
import org.eclipse.jface.resource.ImageDescriptor;

public class OctaveImages {
	
	private static final PluginImagesHelper helper = new PluginImagesHelper(
			OctclipseUIPlugin.getDefault().getBundle(), new Path("/icons"));

	public static final ImageDescriptor PROJECT_DECARATOR = helper
			.createUnManaged(PluginImagesHelper.T_OVR, "oct_ovr.gif");
	
	public static final ImageDescriptor DESC_WIZBAN_PROJECT_CREATION = helper
			.createUnManaged(PluginImagesHelper.T_WIZBAN,
					"projectcreate_wiz.png");

	public static final ImageDescriptor DESC_WIZBAN_FILE_CREATION = helper
			.createUnManaged(PluginImagesHelper.T_WIZBAN, "filecreate_wiz.png");

	public static final ImageDescriptor STATIC_DECARATOR = helper
		.createUnManaged(PluginImagesHelper.T_OVR, "static_ovr.png");

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
package org.seisint.eclide.internal.ui;

import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.ui.PluginImagesHelper;
import org.eclipse.jface.resource.ImageDescriptor;

public class OctaveImages {
	
	private static final PluginImagesHelper helper = new PluginImagesHelper(
			OctclipseUIPlugin.getDefault().getBundle(), new Path("/icons"));

	public static final ImageDescriptor PROJECT_DECARATOR = helper
			.createUnManaged(PluginImagesHelper.T_OVR, "oct_ovr.gif");
	
	public static final ImageDescriptor DESC_WIZBAN_PROJECT_CREATION = helper
			.createUnManaged(PluginImagesHelper.T_WIZBAN,
					"projectcreate_wiz.png");

	public static final ImageDescriptor DESC_WIZBAN_FILE_CREATION = helper
			.createUnManaged(PluginImagesHelper.T_WIZBAN, "filecreate_wiz.png");

	public static final ImageDescriptor STATIC_DECARATOR = helper
		.createUnManaged(PluginImagesHelper.T_OVR, "static_ovr.png");

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
