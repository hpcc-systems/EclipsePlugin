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
import java.util.Collections;
import java.util.Comparator;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.ui.tree.ItemView;
import org.hpccsystems.internal.ui.tree.WorkunitComparator;
import org.hpccsystems.internal.data.*;

class PlatformBaseItemView extends ItemView {
	Platform platform;
	String clusterName;

	PlatformBaseItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform) {
		super(treeViewer, parent);
		this.platform = platform;
		clusterName = parent != null ? parent.clusterName : "";
	}

	public String getUser() {
		return platform.getUser();
	}

	public String getPassword() {
		return platform.getPassword();
	}
}

class ClusterFolderItemView extends FolderItemView {

	ClusterFolderItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return "Clusters";
	}
	
	@Override
	public boolean hasChildren() {
		return super.hasChildren();
	}

	@Override
	public Object[] getChildren() {
		return super.getChildren();
	}

	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsTopology", "TpTargetClusterQuery");
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Cluster c : platform.getClusters())
			retVal.add(new ClusterItemView(treeViewer, this, platform, c));
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class FileSprayWorkunitFolderItemView extends FolderItemView {

	FileSprayWorkunitFolderItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return "File Sprays";
	}

	public URL getWebPageURL() throws MalformedURLException {
		if (clusterName.isEmpty())
			return platform.getURL("FileSpray", "GetDFUWorkunits");
		return platform.getURL("FileSpray", "GetDFUWorkunits", "Cluster=" + clusterName);
	}

	@Override
	public void refreshChildren() {
		ArrayList<ItemView> retVal = new ArrayList<ItemView>();
		for (FileSprayWorkunit wu : platform.getFileSprayWorkunits(clusterName)) {
			retVal.add(new FileSprayWorkunitItemView(treeViewer, this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class FileSprayWorkunitItemView extends PlatformBaseItemView implements Observer {
	FileSprayWorkunit workunit;

	FileSprayWorkunitItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform, FileSprayWorkunit wu) {
		super(treeViewer, parent, platform);
		this.workunit = wu;
		this.workunit.addObserver(this);
		refreshChildren();
	}

	@Override
	public String getText() {
		return workunit.getID();
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
		}
		return Activator.getImage("icons/workunit.png"); 
	}

	//javascript:go('/FileSpray/GetDFUWorkunit?wuid=D20111027-153447')
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("FileSpray", "GetDFUWorkunit", "wuid=" + workunit.getID());
	}
	
	@Override
	public void refreshChildren() {
		ArrayList<ItemView> retVal = new ArrayList<ItemView>();
		ItemView parent = getParent();
		while (parent != null) {
			if (parent instanceof FileSprayWorkunitItemView)
				if (workunit == ((FileSprayWorkunitItemView)parent).workunit) {
					retVal.add(new RecursiveItemView(treeViewer, this));				
					break;
				}
			parent = parent.getParent();
		}
		if (retVal.isEmpty()) {
			LogicalFile lf = workunit.getLogicalFile();
			String filePath = workunit.getFilePath();
			if (workunit.isDespray()) {
				if (lf != null)
					retVal.add(new LogicalFileItemView(treeViewer, this, platform, lf));
				if (filePath != null)
					retVal.add(new LandingZoneFileItemView(treeViewer, this, platform, filePath));
			} else {
				if (filePath != null)
					retVal.add(new LandingZoneFileItemView(treeViewer, this, platform, filePath));
				if (lf != null)
					retVal.add(new LogicalFileItemView(treeViewer, this, platform, lf));
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

class ClusterItemView extends PlatformBaseItemView {
	Cluster cluster;

	ClusterItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform, Cluster cluster) {
		super(treeViewer, parent, platform);
		this.cluster = cluster;
		this.clusterName = cluster.getName();
		refreshChildren();
	}

	@Override
	public String getText() {
		return cluster.getName();
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/cluster.png"); 
	}

	public URL getWebPageURL() throws MalformedURLException {
		//http://192.168.2.68:8010/ws_machine/GetTargetClusterInfo?form
		return platform.getURL("ws_machine", "GetTargetClusterInfo", "TargetClusters=" + clusterName);
	}

	@Override
	public void refreshChildren() {
		ArrayList<ItemView> retVal = new ArrayList<ItemView>();
		retVal.add(new WorkunitFolderItemView(treeViewer, this, platform));
		retVal.add(new FileSprayWorkunitFolderItemView(treeViewer, this, platform));
		retVal.add(new LogicalFileFolderItemView(treeViewer, this, platform));
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class QuerySetFolderItemView extends FolderItemView {

	QuerySetFolderItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return "Query Sets";
	}

	//http://192.168.2.68:8010/WsWorkunits/WUQuerySets	
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUQuerySets");
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (DataQuerySet qs : platform.getDataQuerySets()) {
			retVal.add(new DataQuerySetItemView(treeViewer, this, platform, qs));				
		}
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class DataQuerySetItemView extends PlatformBaseItemView {
	DataQuerySet querySet;

	DataQuerySetItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform, DataQuerySet querySet) {
		super(treeViewer, parent, platform);
		this.querySet = querySet; 
	}

	@Override
	public String getText() {
		return querySet.getName();
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/file.png"); 
	}

	//http://192.168.2.68:8010/WsWorkunits/WUQuerysetDetails?QuerySetName=myroxie
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUQuerysetDetails", "QuerySetName=" + querySet.getName());
}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		ItemView parent = getParent();
		while (parent != null) {
			if (parent instanceof DataQuerySetItemView)
				if (querySet == ((DataQuerySetItemView)parent).querySet) {
					retVal.add(new RecursiveItemView(treeViewer, this));				
					break;
				}
			parent = parent.getParent();
		}

		if (retVal.isEmpty()) {
//			retVal.add(new LogicalFileContentsTreeItem(treeViewer, this, platform, querySet));
//			Workunit wu = querySet.getWorkunit();
//			if (wu != null) {
//				retVal.add(new WorkunitTreeItem(treeViewer, this, platform, wu));				
//			}
		}
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class LogicalFileFolderItemView extends FolderItemView {

	LogicalFileFolderItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return "Files";
	}

	//http://192.168.2.68:8010/WsDfu/DFUQuery
	public URL getWebPageURL() throws MalformedURLException {
		if (clusterName.isEmpty())
			return platform.getURL("WsDfu", "DFUQuery");
		return platform.getURL("WsDfu", "DFUQuery", "ClusterName=" + clusterName);
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (LogicalFile lf : platform.getLogicalFiles(clusterName)) {
			retVal.add(new LogicalFileItemView(treeViewer, this, platform, lf));				
		}
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class WorkunitLogicalFileFolderItemView extends FolderItemView implements Observer {
	Workunit workunit;

	WorkunitLogicalFileFolderItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Workunit wu) {
		super(treeViewer, parent, wu.getPlatform());
		this.workunit = wu;
		this.workunit.addObserver(this);
	}

	@Override
	public String getText() {
		return "Source Files";
	}

	//http://192.168.2.68:8010/WsDfu/DFUQuery
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUInfo", "Wuid=" + workunit.getWuid());
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (LogicalFile file : workunit.getSourceFiles()) {
			retVal.add(new LogicalFileItemView(treeViewer, this, platform, file));
		}
		children.set(retVal.toArray(new ItemView[0]));
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg1 instanceof Workunit.Notification) {
			switch ((Workunit.Notification)arg1){
			case SOURCEFILES:
				refresh();
			}
		}
	}
}

class LogicalFileItemView extends PlatformBaseItemView {
	LogicalFile file;

	LogicalFileItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform, LogicalFile file) {
		super(treeViewer, parent, platform);
		this.file = file; 
	}

	@Override
	public String getText() {
		return file.getName();
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/file.png"); 
	}

	//http://192.168.2.68:8010/WsDfu/DFUInfo?Name=tutorial::g::originalperson
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsDfu", "DFUInfo", "Name=" + file.getName());
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		ItemView parent = getParent();
		while (parent != null) {
			if (parent instanceof LogicalFileItemView)
				if (file == ((LogicalFileItemView)parent).file) {
					retVal.add(new RecursiveItemView(treeViewer, this));				
					break;
				}
			parent = parent.getParent();
		}

		if (retVal.isEmpty()) {
			retVal.add(new LogicalFileContentsItemView(treeViewer, this, platform, file));
			Workunit wu = file.getWorkunit();
			if (wu != null) {
				retVal.add(new WorkunitItemView(treeViewer, this, wu));				
			}
			FileSprayWorkunit fswu = file.getFileSprayWorkunit();
			if (fswu != null) {
				retVal.add(new FileSprayWorkunitItemView(treeViewer, this, platform, fswu));				
			}
		}
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class LogicalFileContentsItemView extends PlatformBaseItemView {
	LogicalFile file;

	LogicalFileContentsItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform, LogicalFile file) {
		super(treeViewer, parent, platform);
		this.file = file; 
		refreshChildren();
	}

	@Override
	public String getText() {
		return file.getDir();
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/filecontent.png"); 
	}

	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUResult", "LogicalName=" + file.getName());
	}
}

class LandingZoneFileItemView extends PlatformBaseItemView {
	String path;

	LandingZoneFileItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform, String path) {
		super(treeViewer, parent, platform);
		this.path = path; 
		refreshChildren();
	}

	@Override
	public String getText() {
		return path;
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/filecontent.png"); 
	}
}

class ResultFolderItemView extends FolderItemView implements Observer {
	Workunit workunit;

	ResultFolderItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Workunit wu) {
		super(treeViewer, parent, wu.getPlatform());
		this.workunit = wu;
		this.workunit.addObserver(this);
	}

	@Override
	public String getText() {
		return "Results";
	}

	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUInfo", "Wuid=" + workunit.getWuid());
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Result r : workunit.getResults())
			retVal.add(new ResultItemView(treeViewer, this, platform, r));
		children.set(retVal.toArray(new ItemView[0]));
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg1 instanceof Workunit.Notification) {
			switch ((Workunit.Notification)arg1){
			case RESULTS:
				refresh();
			}
		}
	}
}

class ResultItemView extends PlatformBaseItemView implements Observer {
	Result result;

	ResultItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform, Result result) {
		super(treeViewer, parent, platform);
		this.result = result; 
		this.result.addObserver(this);
		refreshChildren();
	}

	@Override
	public String getText() {
		if (!result.getValue().isEmpty())
			return result.getName() + " " + result.getValue();
		return result.getName();
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/result.png"); 
	}

	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUResult", "Wuid=" + result.getWuid() + "&Sequence=" + result.getSequence());
	}
	
	@Override
	public Result getResult() {
		return result;
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(String s : result.getResultViews())
			retVal.add(new ResultViewItemView(treeViewer, this, platform, result, s));
		children.set(retVal.toArray(new ItemView[0]));
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		update(null);
	}
}

class ResultViewItemView extends PlatformBaseItemView {
	Result result;
	String viewName;

	ResultViewItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform, Result result, String viewName) {
		super(treeViewer, parent, platform);
		this.result = result; 
		this.viewName = viewName;
		refreshChildren();
	}

	@Override
	public String getText() {
		return viewName;
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/chart.png"); 
	}

	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUResultView", "Wuid=" + result.getWuid() + "&ResultName=" + result.getResultName() + "&ViewName=" + viewName);
	}
}

class GraphFolderItemView extends FolderItemView implements Observer  {
	Workunit workunit;

	GraphFolderItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Workunit wu) {
		super(treeViewer, parent, wu.getPlatform());
		this.workunit = wu;
		this.workunit.addObserver(this);
	}

	@Override
	public String getText() {
		return "Graphs";
	}

	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUInfo", "Wuid=" + workunit.getWuid());
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Graph g : workunit.getGraphs())
			retVal.add(new GraphItemView(treeViewer, this, platform, g));
		children.set(retVal.toArray(new ItemView[0]));
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg1 instanceof Workunit.Notification) {
			switch ((Workunit.Notification)arg1){
			case GRAPHS:
				refresh();
			}
		}
	}
}

class GraphItemView extends PlatformBaseItemView implements Observer {
	Graph graph;

	GraphItemView(TreeItemOwner treeViewer, PlatformBaseItemView parent, Platform platform, Graph graph) {
		super(treeViewer, parent, platform);
		this.graph = graph; 
		this.graph.addObserver(this);
		refreshChildren();
	}

	@Override
	public String getText() {
		return graph.getName();
	}

	@Override
	public Image getImage() {
		switch (graph.getStateID()) {
		case RUNNING:
			return Activator.getImage("icons/graph_running.png");
		case COMPLETED:
			return Activator.getImage("icons/graph_completed.png");
		case FAILED:
			return Activator.getImage("icons/graph_failed.png");
		}
		return Activator.getImage("icons/graph.png"); 
	}
	//http://192.168.2.68:8010/WsWorkunits/GVCAjaxGraph?Name=W20111103-233901&GraphName=graph1
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "GVCAjaxGraph", "Name=" + graph.getWuid() + "&GraphName=" + graph.getName());
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		update(null);
	}
}

class MessageItemView extends ItemView {
	String message;

	MessageItemView(TreeItemOwner treeViewer, ItemView parent, String message) {
		super(treeViewer, parent);
		this.message = message;
		refreshChildren();
	}

	@Override
	public String getText() {
		return message;
	}
}

class RecursiveItemView extends MessageItemView {

	RecursiveItemView(TreeItemOwner treeViewer, ItemView parent) {
		super(treeViewer, parent, "...recursive expansion...");
	}
}

class LoadingItemView extends MessageItemView {

	LoadingItemView(TreeItemOwner treeViewer, ItemView parent) {
		super(treeViewer, parent, "...loading...");
	}
}
