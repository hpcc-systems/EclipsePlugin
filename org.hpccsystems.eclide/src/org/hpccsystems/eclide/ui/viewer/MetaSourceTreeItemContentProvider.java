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

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Display;
import org.hpccsystems.eclide.builder.meta.ECLGlobalMeta;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree.ECLMetaNode;

class MetaSourceTreeItemContentProvider implements ITreeContentProvider, Observer{
	TreeViewer viewer;
	IPath path;
	ECLMetaNode source;

	MetaSourceTreeItemContentProvider() {
		source = null;
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = (TreeViewer)viewer;
		source = null;
		if (newInput != null && !newInput.equals(oldInput)) {
			if (newInput instanceof IPath) {
				path = (IPath)newInput;
				if (source == null) {
					source = ECLGlobalMeta.get().getSource(path);
					if (source != null) {
						source.addObserver(this);
					}
				}
			}
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		ArrayList<ECLMetaNode> nodes = new ArrayList<ECLMetaNode>(); 
		if (source != null) {
			nodes.add(source);
		}
		return nodes.toArray();
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		ArrayList<ECLMetaNode> nodes = new ArrayList<ECLMetaNode>(); 
		if (parentElement instanceof ECLMetaNode) {
			for (ECLMetaNode node : ((ECLMetaNode)parentElement).getChildren()) {
				if (!(node.getData().getName().startsWith("__") && node.getData().getName().endsWith("__"))) {
					nodes.add(node);
				}
			}
		}
		return nodes.toArray();
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof ECLMetaNode) {
			return ((ECLMetaNode)element).getChildren().size() > 0;
		}
			return false;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if (path != null && source == null) {
			source = ECLGlobalMeta.get().getSource(path);
			if (source != null) {
				source.addObserver(this);
			}
		}

		if (arg0.equals(source)) {
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					viewer.refresh(source);
				}
			});
		}
	}

}
