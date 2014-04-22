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
package org.hpccsystems.internal.ui.tree;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

public class TreeItemLabelFontProvider implements ILabelProvider, IFontProvider, IColorProvider {
	protected TreeViewer treeViewer;

	public TreeItemLabelFontProvider(TreeViewer treeViewer) {
		this.treeViewer = treeViewer;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof ItemView) {
			return ((ItemView)element).getImage();
		}
		return null;
	}

	@Override
	public Font getFont(Object element) {
		if (element instanceof ItemView) {
			return ((ItemView)element).getFont();
		}
		return null;
	}

	@Override
	public Color getForeground(Object element) {
		if (element instanceof ItemView) {
			return ((ItemView)element).getForeground();
		}
		return null;
	}

	@Override
	public Color getBackground(Object element) {
		if (element instanceof ItemView) {
			return ((ItemView)element).getBackground();
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ItemView) {
			return ((ItemView)element).getText();
		}
		return Messages.TreeItemLabelFontProvider_0;
	}
}	
