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
package org.hpccsystems.eclide.ui.viewer.platform;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

public class WorkunitsViewer extends PlatformViewer {

	private static WorkunitsViewer workunitsViewer = null;

	public static WorkunitsViewer getDefault() {
		return workunitsViewer;
	}

	public WorkunitsViewer() {
		workunitsViewer = this;
		contentProvider = null;
	}

	public void select(Workunit workunit) {
		for (Object o : treeViewer.getElements()) {
			if (o instanceof WorkunitView) {
				if (((WorkunitView)o).getWorkunit() == workunit) {
					Object[] path = new Object[1];
					path[0] = o;
					treeViewer.setSelection(new TreeSelection(new TreePath(path)), true);
					treeViewer.expandToLevel(o, 2);
				}
			}
		}
	}

	@Override
	synchronized TreeItemContentProvider getContentProvider() {
		return new WorkunitsTreeItemContentProvider(treeViewer);
	}

	public IStructuredSelection getSelection() {
		return (IStructuredSelection)treeViewer.getSelection();
	}
}
