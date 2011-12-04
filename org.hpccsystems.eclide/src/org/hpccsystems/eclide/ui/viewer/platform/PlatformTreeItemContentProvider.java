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

import java.util.ArrayList;
import java.util.Observable;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Font;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

class PlatformTreeItemContentProvider extends TreeItemContentProvider {
	Data data;
	
	PlatformTreeItemContentProvider(TreeViewer treeViewer, Data data) {
		super(treeViewer);
		this.data = data;
	}

	public Object[] getElements(Object inputElement) {
		ArrayList<ItemView> retVal = new ArrayList<ItemView>();
		for (Platform p : ((Data)inputElement).getPlatforms()) {
			retVal.add(new PlatformItemView(this, null, p));
		}
		return retVal.toArray();
	}

	@Override
	public void update(Observable o, Object arg) {
	}

}
