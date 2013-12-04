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
			if (o instanceof WorkunitFilterFolderView) {
				WorkunitFilterFolderView folderView = (WorkunitFilterFolderView)o;
				WorkunitView wuView = folderView.ensureLoaded(workunit);
				if (wuView != null) {
					treeViewer.setSelection(new TreeSelection(wuView.getTreePath()), true);
					treeViewer.expandToLevel(wuView, 1);
					break;
				}
			} else if (o instanceof WorkunitView) {
				WorkunitView workunitView = (WorkunitView)o; 
				if (workunitView.getWorkunit() == workunit) {
					treeViewer.setSelection(new TreeSelection(workunitView.getTreePath()), true);
					treeViewer.expandToLevel(workunitView, 1);
					break;
				}
			}
		}
	}

	@Override
	synchronized TreeItemContentProvider getContentProvider() {
		return new WorkunitsTreeItemContentProvider2(treeViewer);
	}

	public IStructuredSelection getSelection() {
		return (IStructuredSelection)treeViewer.getSelection();
	}
}
