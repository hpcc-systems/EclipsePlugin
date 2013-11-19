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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Observable;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.hpccsystems.internal.data.CollectionDelta;
import org.hpccsystems.internal.data.Data;
import org.hpccsystems.internal.data.DataSingleton;
import org.hpccsystems.internal.data.DataSingletonCollection;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.LazyChildLoader;
import org.hpccsystems.internal.ui.tree.TreeItemContentProvider;
import org.hpccsystems.internal.ui.tree.WorkunitComparator;

class WorkunitsTreeItemContentProvider2 extends TreeItemContentProvider {
	Data data;
	WorkunitFilterFolderView today;
	LazyChildLoader<ItemView> children;

	WorkunitsTreeItemContentProvider2(TreeViewer treeViewer) {
		super(treeViewer);
		Calendar now = GregorianCalendar.getInstance();
		today = createDayFolder(now, Messages.WorkunitsTreeItemContentProvider2_0);
		children = new LazyChildLoader<ItemView>();
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput != null && !newInput.equals(oldInput)) {
			if (newInput instanceof Data) {
				data = (Data)newInput;
				data.addObserver(this);
				children.start(new Runnable() {
					@Override
					public void run() {
						refreshChildren();
						refresh();
					}
				});
			}
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		ArrayList<Object> retVal = new ArrayList<Object>();
		retVal.addAll(Arrays.asList(today.getChildren()));
		retVal.addAll(Arrays.asList(children.get()));
		return retVal.toArray(new Object[retVal.size()]);
	}
	
	WorkunitFilterFolderView createDayFolder(Calendar day, String label) {
		WorkunitFilterFolderView dayFolder = new WorkunitFilterFolderView(this, null, label);			
		GregorianCalendar from = new GregorianCalendar(day.get(Calendar.YEAR), day.get(Calendar.MONTH), day.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		GregorianCalendar to = (GregorianCalendar)from.clone();
		to.add(Calendar.DAY_OF_MONTH, 1);
		dayFolder.setDateRange(from, to);
		return dayFolder;
		
	}

	WorkunitFilterFolderView createWeekFolder(Calendar day, String label) {
		WorkunitFilterFolderView weekFolder = new WorkunitFilterFolderView(this, null, label);			
		GregorianCalendar from = new GregorianCalendar(day.get(Calendar.YEAR), day.get(Calendar.MONTH), day.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
		GregorianCalendar to = (GregorianCalendar)from.clone();
		to.add(Calendar.DAY_OF_MONTH, 7);
		weekFolder.setDateRange(from, to);
		return weekFolder;
	}
	
	WorkunitFilterFolderView createMonthFolder(Calendar day, String label) {
		WorkunitFilterFolderView monthFolder = new WorkunitFilterFolderView(this, null, label);			
		GregorianCalendar from = new GregorianCalendar(day.get(Calendar.YEAR), day.get(Calendar.MONTH), 1, 0, 0, 0);
		GregorianCalendar to = (GregorianCalendar)from.clone();
		to.add(Calendar.MONTH, 1);
		monthFolder.setDateRange(from, to);
		return monthFolder;
	}
	
	WorkunitFilterFolderView createYearFolder(Calendar day, String label) {
		WorkunitFilterFolderView yearFolder = new WorkunitFilterFolderView(this, null, label);			
		GregorianCalendar from = new GregorianCalendar(day.get(Calendar.YEAR), 0, 1, 0, 0, 0);
		GregorianCalendar to = (GregorianCalendar)from.clone();
		to.add(Calendar.YEAR, 1);
		yearFolder.setDateRange(from, to);
		return yearFolder;
	}
	
	@Override 
	public void refreshChildren() {
		today.refreshChildren();
		Calendar now = GregorianCalendar.getInstance();

		//  Days of this week
		for (int i = now.get(Calendar.DAY_OF_WEEK); i > 1; --i) {
			now.add(Calendar.DATE,  -1);
			SimpleDateFormat df = new SimpleDateFormat("EEEE"); //$NON-NLS-1$
			children.add(createDayFolder(now, df.format(now.getTime())));
		}

		//  Previous weeks of the month (may start in last month)
		int nowMonth = now.get(Calendar.MONTH); 
		int weeksInMonth = now.get(Calendar.WEEK_OF_MONTH); 
		for (int i = 1; i <= weeksInMonth; ++i) {
			now.add(Calendar.WEEK_OF_MONTH,  -1);
			if (i == 1) {
				children.add(createWeekFolder(now, Messages.WorkunitsTreeItemContentProvider2_2));
			} else {
				children.add(createWeekFolder(now, Integer.toString(i) + Messages.WorkunitsTreeItemContentProvider2_3));
			}
		}
		
		now.set(Calendar.MONTH, nowMonth);
		now.set(Calendar.DAY_OF_MONTH, 1);
		for (int i = now.get(Calendar.MONTH); i > 0; --i) {
			now.add(Calendar.MONTH,  -1);
			SimpleDateFormat df = new SimpleDateFormat("MMMM"); //$NON-NLS-1$
			children.add(createMonthFolder(now, df.format(now.getTime())));
		}
		while (now.get(Calendar.YEAR) > 2004) {
			now.add(Calendar.YEAR,  -1);
			children.add(createYearFolder(now, Integer.toString(now.get(Calendar.YEAR))));
		}
	
	}

	@Override
	public void reloadChildren() {
		today.clear();
		children.clear();
		refreshChildren();
		refresh();
	}
	
	boolean mergeChanges(CollectionDelta delta) {
		return false;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Data) {
			reloadChildren();
		} else if (o instanceof DataSingletonCollection) {
			if (arg instanceof CollectionDelta) {
				if (mergeChanges((CollectionDelta)arg)) {
					refresh();
				}
			}
		}
	}
}
