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
package org.seisint.eclide.ui.text;

import org.eclipse.jface.text.IDocument;

public final class OctavePartitions {
	private OctavePartitions() {
	}

	public static final String ECL_PARTITIONING = "__ecl_partitioning";
	public static final String ECL_COMMENT = "__ecl_comment";
	public static final String ECL_STRING = "__ecl_string";

    public final static String[] ECL_PARTITION_TYPES = new String[] {
        IDocument.DEFAULT_CONTENT_TYPE, ECL_STRING, ECL_COMMENT
    };
}
