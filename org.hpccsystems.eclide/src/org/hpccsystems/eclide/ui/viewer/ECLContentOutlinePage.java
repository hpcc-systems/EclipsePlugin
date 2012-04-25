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
package org.hpccsystems.eclide.ui.viewer;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.hpccsystems.eclide.builder.meta.ECLDefinition;
import org.hpccsystems.eclide.builder.meta.ECLGlobalMeta;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree;

public class ECLContentOutlinePage extends ContentOutlinePage {
	ECLMetaTree meta;
	TreeViewer viewer;
	IEditorInput editorInput;

	class MySorter extends ViewerSorter {
		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			if (e1 instanceof ECLDefinition) {
				ECLDefinition def1 = (ECLDefinition)e1;
				if (e2 instanceof ECLDefinition) {
					ECLDefinition def2 = (ECLDefinition)e2;
					int i1 = def1.getOffset();
					int i2 = def2.getOffset();
					if (i1 == i2) {
						return 0;
					} else if (i1 < i2) {
						return -1;
					}
					return 1;
				}
			}
			return 0;
		}
	}

	public ECLContentOutlinePage() {
		meta = ECLGlobalMeta.get();
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		viewer = getTreeViewer();
		viewer.setContentProvider(new MetaSourceTreeItemContentProvider());
		viewer.setLabelProvider(new MetaSourceLabelProvider());
		viewer.setSorter(new MySorter());
		if (editorInput instanceof FileEditorInput) {
			viewer.setInput(((FileEditorInput)editorInput).getPath());
		}
		viewer.expandAll();

	}

	public void setInput(IEditorInput editorInput) {
		this.editorInput = editorInput;
	}
}
