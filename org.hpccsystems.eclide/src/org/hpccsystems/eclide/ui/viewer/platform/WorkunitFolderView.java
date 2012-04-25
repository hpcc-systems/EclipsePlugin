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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;
import java.util.Observer;

import org.hpccsystems.internal.data.CollectionDelta;
import org.hpccsystems.internal.data.DataSingleton;
import org.hpccsystems.internal.data.DataSingletonCollection;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.WorkunitComparator;

public class WorkunitFolderView extends FolderItemView implements Observer {

	public WorkunitFolderView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return "Workunits";
	}

	@Override
	public URL getWebPageURL() throws MalformedURLException {
		if (clusterName.isEmpty())
			return platform.getURL("WsWorkunits", "WUQuery");
		return platform.getURL("WsWorkunits", "WUQuery", "Cluster=" + clusterName);
	}

	@Override
	public void refreshChildren() {
		Workunit.All.deleteObserver(this);

		CollectionDelta monitor = new CollectionDelta("primeChildren", getCurrentWorkunits());
		monitor.calcChanges(platform.getWorkunits(clusterName));
		mergeChanges(monitor);

		Workunit.All.addObserver(this);
	}

	Collection<Workunit> getCurrentWorkunits() {
		Collection<Workunit> retVal = new ArrayList<Workunit>();
		for (Object item : children.get().clone()) {
			if (item instanceof WorkunitView) {
				WorkunitView ti = (WorkunitView)item;
				retVal.add(ti.getWorkunit());
			}
		}
		return retVal;
	}

	boolean mergeChanges(CollectionDelta delta) {
		boolean changed = false;
		for (Object item : children.get().clone()) {
			if (item instanceof WorkunitView) {
				WorkunitView ti = (WorkunitView)item;

				//  Remove deleted workunits  --- 
				if (delta.removeContains(ti.getWorkunit())) {
					ti.getWorkunit().refreshState();
					changed = true;
				}
			}
		}

		//  Add new workunits  ---
		for (DataSingleton ds : delta.getAdded()) {
			if (ds instanceof Workunit) {
				Workunit wu = (Workunit)ds;
				if (platform.equals(wu.getPlatform())  && (clusterName.isEmpty() || clusterName.equals(wu.getClusterName()))) {
					children.add(new WorkunitView(treeViewer, this, wu));						
					changed = true;
				}
			}
		}

		if (changed)
			children.sort(new WorkunitComparator());

		return changed;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof DataSingletonCollection) {
			if (arg instanceof CollectionDelta) {
				if (mergeChanges((CollectionDelta)arg)) {
					refresh();
				}
			}
		}
	}
}
