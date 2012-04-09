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
import java.util.Observable;
import java.util.Observer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.ItemView.ACTION;

public class WorkunitView extends PlatformBaseView implements Observer {
	Workunit workunit;

	public WorkunitView(TreeItemOwner treeViewer, PlatformBaseView parent, Workunit wu) {
		super(treeViewer, parent, wu.getPlatform());
		this.workunit = wu;
		this.workunit.addObserver(this);
		refreshChildren();
	}

	public Workunit getWorkunit() {
		return workunit;
	}
	@Override
	public String getText() {
		if (workunit.isComplete()) 
			return workunit.getWuid();
		return workunit.getWuid() + " (" + workunit.getState() + ")";
	}

	@Override
	public Image getImage() {
		switch(workunit.getStateID()) {
		case SCHEDULED:
			return Activator.getImage("icons/workunit_warning.png"); 
		case SUBMITTED:
			return Activator.getImage("icons/workunit_submitted.png"); 
		case RUNNING:
			return Activator.getImage("icons/workunit_running.png"); 
		case ABORTING:
			return Activator.getImage("icons/workunit_aborting.png"); 
		case BLOCKED:
			return Activator.getImage("icons/workunit_warning.png"); 
		case WAIT:
			return Activator.getImage("icons/workunit_warning.png"); 
		case COMPILING:
			return Activator.getImage("icons/workunit_running.png"); 
		case COMPLETED:
			return Activator.getImage("icons/workunit_completed.png"); 
		case FAILED:
			return Activator.getImage("icons/workunit_failed.png"); 
		case ABORTED:
			return Activator.getImage("icons/workunit_failed.png"); 
		case ARCHIVED:
			return Activator.getImage("icons/workunit_warning.png"); 
		case COMPILED:
			return Activator.getImage("icons/workunit_completed.png"); 
		case UNKNOWN_ONSERVER:
			return Activator.getImage("icons/workunit_deleted.png"); 
		}
		return Activator.getImage("icons/workunit.png"); 
	}

	@Override
	public Color getForeground() {
		switch (workunit.getStateID()) {
		case UNKNOWN_ONSERVER:
			return Display.getDefault().getSystemColor(SWT.COLOR_RED);
		}
		return null;
	}
	
	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUInfo", "Wuid=" + workunit.getWuid());
	}

	@Override
	public void refreshItem() {
		workunit.refreshState();		
	}
	
	@Override
	public boolean canPerform(ACTION action) {
		switch (action) {
		case ABORT:
			return !workunit.isComplete();
		case DELETE:
			return true;
		case RESUBMIT:
			return true;
		case RESTART:
			return true;
		case CLONE:
			return true;
		case PUBLISH:
			return !workunit.getJobname().isEmpty();
		}
		return false;
	}

	@Override
	public void perform(ACTION action) {
		switch (action) {
		case ABORT:
			workunit.abort();
			break;
		case DELETE:
			workunit.delete();
			break;
		case RESUBMIT:
			workunit.resubmit();
			break;
		case RESTART:
			workunit.restart();
			break;
		case CLONE:
			workunit._clone();
			break;
		case PUBLISH:
			workunit.publish();
			break;
		}
	}

	@Override
	public void refreshChildren() {
		ArrayList<ItemView> retVal = new ArrayList<ItemView>();
		ItemView parent = getParent();
		while (parent != null) {
			if (parent instanceof WorkunitView)
				if (workunit == ((WorkunitView)parent).workunit) {
					retVal.add(new RecursiveItemView(treeViewer, this));				
					break;
				}
			parent = parent.getParent();
		}
		if (retVal.isEmpty()) {
			retVal.add(new ResultFolderView(treeViewer, this, workunit));
			retVal.add(new GraphFolderView(treeViewer, this, workunit));
			retVal.add(new WorkunitLogicalFileFolderView(treeViewer, this, workunit));
			retVal.add(new TextItemView(treeViewer, this, workunit));
		}
		children.set(retVal.toArray(new ItemView[0]));
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg1 instanceof Workunit.Notification) {
			switch ((Workunit.Notification)arg1){
			case WORKUNIT:
				update(null);
			}
		}
	}
}

