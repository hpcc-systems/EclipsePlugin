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

import java.util.ArrayList;

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.internal.ui.editor.ScriptOutlinePage;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.dltk.ui.actions.MemberFilterActionGroup;
import org.eclipse.dltk.ui.viewsupport.MemberFilterAction;
import org.eclipse.dltk.ui.viewsupport.ModelElementFilter;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.ui.IActionBars;

public class OctaveOutlinePage extends ScriptOutlinePage {
	
	public OctaveOutlinePage(OctaveEditor editor, IPreferenceStore store)
	{
		super(editor, store);
	}
	
	protected void registerSpecialToolbarActions(IActionBars actionBars) {
		IToolBarManager toolBarManager = actionBars.getToolBarManager();
		MemberFilterActionGroup fMemberFilterActionGroup = new MemberFilterActionGroup(
				fOutlineViewer, fStore);
		String title, helpContext;
		ArrayList<MemberFilterAction> actions = new ArrayList<MemberFilterAction>(3);
		// fill-in actions variables
		// int filterProperty = MemberFilter.FILTER_FIELDS;
		title = OctaveEditorMessages.MemberFilterActionGroup_hide_variables_label;
		// TODO help support
		helpContext = "";// IDLTKHelpContextIds.FILTER_FIELDS_ACTION;
		MemberFilterAction hideVariables = new MemberFilterAction(
				fMemberFilterActionGroup, title, new ModelElementFilter(
						IModelElement.FIELD), helpContext, true);
		hideVariables
				.setDescription(OctaveEditorMessages.MemberFilterActionGroup_hide_variables_description);
		hideVariables
				.setToolTipText(OctaveEditorMessages.MemberFilterActionGroup_hide_variables_tooltip);
		DLTKPluginImages.setLocalImageDescriptors(hideVariables,
				"filter_fields.gif"); //$NON-NLS-1$
		actions.add(hideVariables);
		// procedures
		title = OctaveEditorMessages.MemberFilterActionGroup_hide_procedures_label;
		// TODO help support
		helpContext = "";// IDLTKHelpContextIds.FILTER_STATIC_ACTION;
		MemberFilterAction hideProcedures = new MemberFilterAction(
				fMemberFilterActionGroup, title, new ModelElementFilter(
						IModelElement.METHOD), helpContext, true);
		hideProcedures
				.setDescription(OctaveEditorMessages.MemberFilterActionGroup_hide_procedures_description);
		hideProcedures
				.setToolTipText(OctaveEditorMessages.MemberFilterActionGroup_hide_procedures_tooltip);
		// TODO: add correct icon
		DLTKPluginImages.setLocalImageDescriptors(hideProcedures,
				"filter_methods.gif"); //$NON-NLS-1$
		actions.add(hideProcedures);
		// order corresponds to order in toolbar
		MemberFilterAction[] fFilterActions = (MemberFilterAction[]) actions
				.toArray(new MemberFilterAction[actions.size()]);
		fMemberFilterActionGroup.setActions(fFilterActions);
		fMemberFilterActionGroup.contributeToToolBar(toolBarManager);
	}

	protected ILabelDecorator getLabelDecorator() {
		return new OctaveOutlineLabelDecorator();
	}

}
