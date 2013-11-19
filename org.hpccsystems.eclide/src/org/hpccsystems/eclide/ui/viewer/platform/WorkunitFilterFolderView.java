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
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.Cluster;
import org.hpccsystems.internal.data.CollectionDelta;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.DataSingleton;
import org.hpccsystems.internal.data.DataSingletonCollection;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.LazyChildLoader.CalcState;
import org.hpccsystems.internal.ui.tree.WorkunitComparator;

public class WorkunitFilterFolderView extends ItemView implements Observer {
	class LoadingItemView extends MessageItemView {

		LoadingItemView(TreeItemOwner treeViewer, ItemView parent) {
			super(treeViewer, parent, Messages.WorkunitFilterFolderView_0);
		}
	}
	
	String label;
	Data data;
	Platform platform;
	Cluster cluster;
	String owner = null;
	GregorianCalendar from;
	GregorianCalendar to;
	
	public WorkunitFilterFolderView(TreeItemOwner treeViewer, ItemView parent, String label) {
		super(treeViewer, parent);
		this.label = label;
		data = Data.get();
		data.addObserver(this);
	}
	
	//  Filters  ---
	public void clear() {
		children.clear();
	}

	public void setUser(String owner) {
		this.owner = owner;
	}
	
	public String getOwner(Platform platform) {
		if (owner != null)
			return owner;
		return platform.getUser();
	}
	
	public void setPlatform (Platform platform) {
		this.platform = platform;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;		
	}
	
	public void setDateRange(GregorianCalendar from, GregorianCalendar to) {
		String sFrom = Integer.toString(from.get(Calendar.YEAR)) + "/" + Integer.toString(from.get(Calendar.MONTH)) + "/" + Integer.toString(from.get(Calendar.DAY_OF_MONTH));  //$NON-NLS-1$ //$NON-NLS-2$
		String sTo = Integer.toString(to.get(Calendar.YEAR)) + "/" + Integer.toString(to.get(Calendar.MONTH)) + "/" + Integer.toString(to.get(Calendar.DAY_OF_MONTH));  //$NON-NLS-1$ //$NON-NLS-2$
		this.from = from;
		this.to = to;
	}
	
	boolean isIncluded(Workunit wu) {
		if (platform != null && !wu.getPlatform().equals(platform))
			return false;
		if (cluster != null && !wu.getClusterName().equals(cluster.getName()))
			return false;
		if (!wu.getOwner().equals(getOwner(wu.getPlatform())))
			return false;
		if (platform != null && !wu.getPlatform().equals(platform))
			return false;
		GregorianCalendar date = wu.getDate();
		if (from != null && from.after(date)) {
			return false;
		}
		if (to != null && to.before(date)) {
			return false;
		}
		return true;
	}

	public WorkunitView ensureLoaded(Workunit workunit) {
		if (!isIncluded(workunit))
			return null;
		
		if (children.getState() != CalcState.PREFETCH_FINISHED) {
			refreshChildren();
			treeViewer.refresh(this);
		}
		
		for (Object o : children.get()) {
			if (o instanceof WorkunitView) {
				if (((WorkunitView)o).getWorkunit() == workunit) {
					return (WorkunitView)o; 
				}
			}
		}
		return null;
	}
	
	//  ItemView  ---	
	@Override
	public String getText() {
		return label;
	}

	@Override
	public String getStateText() {
		switch(children.getState()) {
		case PREFETCH_UNKNOWN:
			return ""; //$NON-NLS-1$
		case PREFETCH_STARTED:
			return Messages.WorkunitFilterFolderView_6;
		case PREFETCH_FINISHED:
			if (children.getCount() > 0) {
				return " (" + children.getCount() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
			}
			break;
		}
		return ""; //$NON-NLS-1$
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/folder.png");  //$NON-NLS-1$
	}

	@Override
	public boolean hasChildren() {
		return true;
	}
	
	public Object[] getChildren() {
		if (children.getState() == CalcState.PREFETCH_UNKNOWN) {
			children.add(new LoadingItemView(treeViewer, this));

			final ItemView self = this;
			children.start(new Runnable() {
				@Override
				public void run() {
					refreshChildren();
					treeViewer.refresh(self);
				}
			});
		}
		return children.get();
	}

	public void refreshItem() {
		ItemView parent = getParent();
		if (parent == null) {
			if (treeViewer != null) {
				treeViewer.refresh();
			}
		}
	}

	@Override
	public void refreshChildren() {
		Workunit.All.deleteObserver(this);

		ArrayList<Workunit> workunits = new ArrayList<Workunit>();		
		if (platform != null) {
			workunits.addAll(platform.getWorkunits(getOwner(platform), cluster != null ? cluster.getName() : "", from, to)); //$NON-NLS-1$
		} else {
			for(Platform platform : data.getPlatforms()) {
				workunits.addAll(platform.getWorkunits(getOwner(platform), cluster != null ? cluster.getName() : "", from, to)); //$NON-NLS-1$
			}
		}
		ArrayList<WorkunitView> workunitViews = new ArrayList<WorkunitView>();
		for (Workunit workunit : workunits) {
			workunitViews.add(new WorkunitView(treeViewer, this, workunit));
		}
		class CustomComparator implements Comparator<WorkunitView> {
		    @Override
		    public int compare(WorkunitView o1, WorkunitView o2) {
		        return o2.getWorkunit().getWuid().compareTo(o1.getWorkunit().getWuid());
		    }
		}
		Collections.sort(workunitViews, new CustomComparator());
		children.clear();
		children.add(workunitViews.toArray(new ItemView[workunits.size()]));

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
				if (isIncluded(wu)) {
					children.add(new WorkunitView(treeViewer, this, wu));
					changed = true;
				}
			}
		}

		if (changed) {
			children.sort(new WorkunitComparator());
		}

		return changed;
	}

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
