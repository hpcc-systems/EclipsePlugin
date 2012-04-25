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
import org.hpccsystems.internal.data.FileSprayWorkunit;
import org.hpccsystems.internal.data.LogicalFile;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.ItemView;

public class FileSprayWorkunitView extends PlatformBaseView implements Observer {
	FileSprayWorkunit workunit;

	FileSprayWorkunitView(TreeItemOwner treeViewer, PlatformBaseView parent, FileSprayWorkunit wu) {
		super(treeViewer, parent, wu.getPlatform());
		this.workunit = wu;
		this.workunit.addObserver(this);
		refreshChildren();
	}

	public FileSprayWorkunit getFileSprayWorkunit() {
		return workunit;
	}

	@Override
	public String getText() {
		if (workunit.isComplete()) {
			return workunit.getID();
		}
		return workunit.getID() + " (" + workunit.getStateID() + ")";
	}

	/*enum DFUstate
{
0    DFUstate_unknown,
1    DFUstate_scheduled,
2    DFUstate_queued,
3    DFUstate_started,
4    DFUstate_aborted,
5    DFUstate_failed,
6    DFUstate_finished,
7    DFUstate_monitoring,
8    DFUstate_aborting
9;
	 */	
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
		return platform.getURL("FileSpray", "GetDFUWorkunit", "wuid=" + workunit.getID());
	}

	@Override
	public void refreshItem() {
		workunit.refreshState();		
	}

	@Override
	public void refreshChildren() {
		ArrayList<ItemView> retVal = new ArrayList<ItemView>();
		ItemView parent = getParent();
		while (parent != null) {
			if (parent instanceof FileSprayWorkunitView) {
				if (workunit == ((FileSprayWorkunitView)parent).workunit) {
					retVal.add(new RecursiveItemView(treeViewer, this));				
					break;
				}
			}
			parent = parent.getParent();
		}
		if (retVal.isEmpty()) {
			LogicalFile lf = workunit.getLogicalFile();
			String filePath = workunit.getFilePath();
			if (workunit.isDespray()) {
				if (lf != null) {
					retVal.add(new LogicalFileView(treeViewer, this, platform, lf));
				}
				if (filePath != null) {
					retVal.add(new LandingZoneFileView(treeViewer, this, platform, filePath));
				}
			} else {
				if (filePath != null) {
					retVal.add(new LandingZoneFileView(treeViewer, this, platform, filePath));
				}
				if (lf != null) {
					retVal.add(new LogicalFileView(treeViewer, this, platform, lf));
				}
			}
		}
		children.set(retVal.toArray(new ItemView[0]));
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg1 instanceof Workunit.Notification) {
			switch ((FileSprayWorkunit.Notification)arg1){
			case LOGICALFILEWORKUNIT:
				update(null);
			}
		}
	}
}
