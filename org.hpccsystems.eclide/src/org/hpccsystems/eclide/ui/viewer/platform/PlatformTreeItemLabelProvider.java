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

import org.eclipse.jface.viewers.TreeViewer;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.TreeItemLabelFontProvider;

public class PlatformTreeItemLabelProvider extends TreeItemLabelFontProvider {

	public PlatformTreeItemLabelProvider(TreeViewer treeViewer) {
		super(treeViewer);
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ItemView) {
			final ItemView treeItem = (ItemView)element; 
			switch(treeItem.children.getState()) {
			case UNKNOWN:
				return treeItem.getText() + " (Loading...)";
			case STARTED:
				return treeItem.getText() + " (Calculating...)";
			case FINISHED:
				if (treeItem instanceof FolderItemView) {
					//if (!treeViewer.getExpandedState(element)) {
					if (treeItem.children.getCount() > 0)
						return treeItem.getText() + " (" + treeItem.children.get().length + ")";
					//}
				}
				break;
			}
			return super.getText(element);
		}
		if (element instanceof PlatformView) 
			return "PTODO";
		return "TODO";
	}
}	
