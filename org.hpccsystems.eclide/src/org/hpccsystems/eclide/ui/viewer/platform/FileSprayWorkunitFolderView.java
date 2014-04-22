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
import org.hpccsystems.internal.data.FileSprayWorkunit;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.ui.tree.WorkunitComparator;

public class FileSprayWorkunitFolderView extends FolderItemView implements Observer {

	public FileSprayWorkunitFolderView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return Messages.FileSprayWorkunitFolderView_0;
	}

	@Override
	public URL getWebPageURL(boolean hasNewEclWatch) throws MalformedURLException {
		if (hasNewEclWatch) {
			return platform.getWidgetURL("GetDFUWorkunitsWidget", clusterName.isEmpty() ? "" : "ClusterName=" + clusterName); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		if (clusterName.isEmpty()) {
			return platform.getURL("FileSpray", "GetDFUWorkunits"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		return platform.getURL("FileSpray", "GetDFUWorkunits", "Cluster=" + clusterName); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public void refreshChildren() {
		FileSprayWorkunit.All.deleteObserver(this);

		CollectionDelta monitor = new CollectionDelta("primeChildren", getCurrentWorkunits()); //$NON-NLS-1$
		monitor.calcChanges(platform.getFileSprayWorkunits(clusterName));
		mergeChanges(monitor);

		FileSprayWorkunit.All.addObserver(this);
	}

	Collection<FileSprayWorkunit> getCurrentWorkunits() {
		Collection<FileSprayWorkunit> retVal = new ArrayList<FileSprayWorkunit>();
		for (Object item : children.get().clone()) {
			if (item instanceof FileSprayWorkunitView) {
				FileSprayWorkunitView ti = (FileSprayWorkunitView)item;
				retVal.add(ti.getFileSprayWorkunit());
			}
		}
		return retVal;
	}

	boolean mergeChanges(CollectionDelta delta) {
		boolean changed = false;
		for (Object item : children.get().clone()) {
			if (item instanceof FileSprayWorkunitView) {
				FileSprayWorkunitView ti = (FileSprayWorkunitView)item;

				//  Remove deleted workunits  --- 
				if (delta.removeContains(ti.getFileSprayWorkunit())) {
					ti.getFileSprayWorkunit().refreshState();
					changed = true;
				}
			}
		}

		//  Add new workunits  ---
		for (DataSingleton ds : delta.getAdded()) {
			if (ds instanceof FileSprayWorkunit) {
				FileSprayWorkunit wu = (FileSprayWorkunit)ds;
				if (platform.equals(wu.getPlatform())  && (clusterName.isEmpty() || clusterName.equals(wu.getClusterName()))) {
					children.add(new FileSprayWorkunitView(treeViewer, this, wu));						
					changed = true;
				}
			}
		}

		if (changed) {
			children.sort(new WorkunitComparator());
		}

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
