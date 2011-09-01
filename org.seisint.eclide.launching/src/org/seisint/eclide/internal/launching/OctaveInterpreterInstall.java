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
package org.seisint.eclide.internal.launching;


import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.dltk.launching.AbstractInterpreterInstall;
import org.eclipse.dltk.launching.IInterpreterInstallType;
import org.eclipse.dltk.launching.IInterpreterRunner;
import org.seisint.eclide.core.OctaveNature;

public class OctaveInterpreterInstall extends AbstractInterpreterInstall {

	public OctaveInterpreterInstall(IInterpreterInstallType type, String id) {
		super(type, id);
	}
	
	public IInterpreterRunner getInterpreterRunner(String mode) {
		IInterpreterRunner runner = super.getInterpreterRunner(mode);
		if (runner != null) {
			return runner;
		}
		if (ILaunchManager.RUN_MODE.equals(mode)) {
			return new OctaveInterpreterRunner(this);
		}
		return null;
	}
	public String getNatureId() {
		return OctaveNature.NATURE_ID;
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
package org.seisint.eclide.internal.launching;


import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.dltk.launching.AbstractInterpreterInstall;
import org.eclipse.dltk.launching.IInterpreterInstallType;
import org.eclipse.dltk.launching.IInterpreterRunner;
import org.seisint.eclide.core.OctaveNature;

public class OctaveInterpreterInstall extends AbstractInterpreterInstall {

	public OctaveInterpreterInstall(IInterpreterInstallType type, String id) {
		super(type, id);
	}
	
	public IInterpreterRunner getInterpreterRunner(String mode) {
		IInterpreterRunner runner = super.getInterpreterRunner(mode);
		if (runner != null) {
			return runner;
		}
		if (ILaunchManager.RUN_MODE.equals(mode)) {
			return new OctaveInterpreterRunner(this);
		}
		return null;
	}
	public String getNatureId() {
		return OctaveNature.NATURE_ID;
	}

}
>>>>>>> 491f10a275eb44f4aa5f7f631ff2004eba623b33
