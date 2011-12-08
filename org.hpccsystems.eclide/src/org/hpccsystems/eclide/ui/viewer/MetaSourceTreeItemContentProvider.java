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

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.hpccsystems.eclide.builder.meta.ECLDefinition;
import org.hpccsystems.eclide.builder.meta.ECLSource;

class MetaSourceTreeItemContentProvider implements ITreeContentProvider {
	ECLSource source;

	MetaSourceTreeItemContentProvider() {
		source = null;
	}
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		source = null;
		if (newInput != null && !newInput.equals(oldInput)) {
			if (newInput instanceof ECLSource) {
				source = (ECLSource)newInput;
			}
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		ArrayList<ECLDefinition> defs = new ArrayList<ECLDefinition>(); 
		if (source != null) {
			for (ECLDefinition def : source.getDefinitions()) {
				defs.add(def);
			}
		}
		return defs.toArray();
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof ECLDefinition)
			return ((ECLDefinition)parentElement).getDefinitions().toArray();
		return null;
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

}
