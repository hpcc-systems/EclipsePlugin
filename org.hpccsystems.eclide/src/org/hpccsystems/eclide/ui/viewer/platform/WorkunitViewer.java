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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.hpccsystems.internal.data.Result;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.MyTreeItem;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;

public class WorkunitViewer extends PlatformViewer {

	WorkunitTabItem owner;
	Workunit wu;
	
	public WorkunitViewer(WorkunitTabItem owner, Workunit wu) {
		super();
		this.owner = owner;
		this.wu = wu;
	}
	
	TreeItemContentProvider getContentProvider() {
		return new WorkunitTreeItemContentProvider(treeViewer, wu);
	}
	
	ISelectionChangedListener getSelectionListener() {
		return new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection sel = (IStructuredSelection)treeViewer.getSelection();
				Iterator<?> iter = sel.iterator();
				while (iter.hasNext()) {
					Object o = iter.next();
					if (o instanceof MyTreeItem) {
						showWebPage((MyTreeItem)o);
						showResult((MyTreeItem)o);
						showQuery((MyTreeItem)o);
						break;
					}
				}
			}
		};
	}
	
	public void showWebPage(MyTreeItem ti) {
		if (owner == null)
			return;
		
		try {
			URL webPageURL = ti.getWebPageURL();
			if (webPageURL != null) {
				owner.navigateTo(webPageURL.toString(), ti.getUser(), ti.getPassword());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean showResult(MyTreeItem ti) {
		if (owner == null) 
			return false;

		Result result = ti.getResult();
		if (result == null)
			return false;
		
		owner.setResult(result);
		return true;
	}
	
	public boolean showQuery(MyTreeItem ti) {
		if (owner == null) 
			return false;
		
		if (ti instanceof TextTreeItem) {
			TextTreeItem tti = (TextTreeItem)ti;
			owner.setQuery(tti.getQueryText());
			return true;
		}
		return false;
	}
	
	protected void createToolbar() {
	}

	protected void createContextMenu() {
	}
}
