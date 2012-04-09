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
package org.hpccsystems.eclide.builder.meta;

import java.io.Serializable;

import org.eclipse.core.runtime.IPath;

public class ECLFolder extends ECLPath implements Serializable {
	private static final long serialVersionUID = 1078062313896533557L;

	public ECLFolder(String _containerName, IPath _containerPath) {
		super();
		attributes.put("name", _containerName);
		attributes.put("sourcePath", _containerPath.toOSString());
		setChanged();
	}
}
