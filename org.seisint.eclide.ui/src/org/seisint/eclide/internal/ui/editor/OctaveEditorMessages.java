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

import org.eclipse.osgi.util.NLS;

public class OctaveEditorMessages extends NLS
{
	private static final String BUNDLE_NAME = "org.seisint.eclide.internal.ui.editor.OctaveEditorMessages";
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, OctaveEditorMessages.class);
	}
	
	public static String MemberFilterActionGroup_hide_variables_label;
	public static String MemberFilterActionGroup_hide_variables_tooltip;
	public static String MemberFilterActionGroup_hide_variables_description;
	public static String MemberFilterActionGroup_hide_procedures_label;
	public static String MemberFilterActionGroup_hide_procedures_tooltip;
	public static String MemberFilterActionGroup_hide_procedures_description;
	
}
