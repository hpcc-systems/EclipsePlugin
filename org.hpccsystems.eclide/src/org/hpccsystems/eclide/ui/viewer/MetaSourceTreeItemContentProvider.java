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
import org.eclipse.ui.part.FileEditorInput;
import org.hpccsystems.eclide.builder.meta.ECLDefinition;
import org.hpccsystems.eclide.builder.meta.ECLGlobalMeta;
import org.hpccsystems.eclide.builder.meta.ECLSource;

class MetaSourceTreeItemContentProvider implements ITreeContentProvider, Observer{
	TreeViewer viewer;
	IPath path;
	ECLSource source;

	MetaSourceTreeItemContentProvider() {
		source = null;
	}
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.viewer = (TreeViewer)viewer;
		source = null;
		if (newInput != null && !newInput.equals(oldInput)) {
			if (newInput instanceof IPath) {
				this.path = (IPath)newInput;
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
		ArrayList<ECLDefinition> defs = new ArrayList<ECLDefinition>(); 
		if (source != null) {
			defs.add(source);
			/*for (ECLDefinition def : source.getDefinitions()) {
				defs.add(def);
			}*/
		}
		return defs.toArray();
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		ArrayList<ECLDefinition> defs = new ArrayList<ECLDefinition>(); 
		if (parentElement instanceof ECLDefinition)
			for (ECLDefinition def : ((ECLDefinition)parentElement).getDefinitions()) {
				if (!(def.getName().startsWith("__") && def.getName().endsWith("__"))) {
					defs.add(def);
				}
			}
		return defs.toArray();
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof ECLDefinition)
			return ((ECLDefinition)element).getDefinitions().size() > 0;
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

		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				viewer.refresh(source);
			}
		});
	}

}
