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

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.builder.meta.ECLDefinition;
import org.hpccsystems.eclide.builder.meta.ECLMetaTree.ECLMetaNode;

public class MetaSourceLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof ECLMetaNode) {
			ECLMetaNode node = (ECLMetaNode)element;			
			if (node.getData().isExported()) {
				return Activator.getImage("icons/attr_exported.png"); 
			}
			return Activator.getImage("icons/attr.png");
		}
		
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ECLMetaNode) {
			ECLMetaNode node = (ECLMetaNode)element;			
			String type = (node.getData()).getType();
			return (node.getData()).getName() + (type.isEmpty() ? "" : " (" + type.toUpperCase() + ")");
		}
		return null;
	}
}
