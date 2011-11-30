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

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.ui.tree.TreeItem;
import org.hpccsystems.internal.data.*;

class WorkunitComparator implements Comparator<TreeItem> {

	@Override
	public int compare(TreeItem left, TreeItem right) {
		String l = left.getText();
		String r = right.getText();

		//  Ignore "W" and "D" and maybe "L"  ---
		l = l.substring(1);
		r = r.substring(1);
		return r.compareTo(l);
	}
}

class PlatformBaseTreeItem extends TreeItem {
	Platform platform;
	String clusterName;

	PlatformBaseTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform) {
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

class PlatformTreeItem extends PlatformBaseTreeItem {

	PlatformTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform) {
		super(treeViewer, parent, platform);
		children.set(fetchChildren());
	}

	@Override
	public String getText() {
		return platform.getIP();
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/platform.png"); 
	}

	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL();
	}

	@Override
	public Object[] fetchChildren() {
		ArrayList<TreeItem> retVal = new ArrayList<TreeItem>();
		retVal.add(new ClusterFolderTreeItem(treeViewer, this, platform));
		retVal.add(new WorkunitFolderTreeItem(treeViewer, this, platform));
		retVal.add(new FileSprayWorkunitFolderTreeItem(treeViewer, this, platform));
		retVal.add(new QuerySetFolderTreeItem(treeViewer, this, platform));
		retVal.add(new LogicalFileFolderTreeItem(treeViewer, this, platform));
		return retVal.toArray();
	}
}

class ClusterFolderTreeItem extends FolderTreeItem {

	ClusterFolderTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return "Clusters";
	}

	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsTopology", "TpTargetClusterQuery");
	}

	@Override
	public Object[] fetchChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Cluster c : platform.getClusters())
			retVal.add(new ClusterTreeItem(treeViewer, this, platform, c));
				return retVal.toArray();
	}
}

class WorkunitFolderTreeItem extends FolderTreeItem {

	WorkunitFolderTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return "Workunits";
	}

	public URL getWebPageURL() throws MalformedURLException {
		if (clusterName.isEmpty())
			return platform.getURL("WsWorkunits", "WUQuery");
		return platform.getURL("WsWorkunits", "WUQuery", "Cluster=" + clusterName);
	}

	@Override
	public Object[] fetchChildren() {
		ArrayList<TreeItem> retVal = new ArrayList<TreeItem>();
		for (Workunit wu : platform.getWorkunits(clusterName)) {
			retVal.add(new WorkunitTreeItem(treeViewer, this, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class FileSprayWorkunitFolderTreeItem extends FolderTreeItem {

	FileSprayWorkunitFolderTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform) {
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
	public Object[] fetchChildren() {
		ArrayList<TreeItem> retVal = new ArrayList<TreeItem>();
		for (FileSprayWorkunit wu : platform.getFileSprayWorkunits(clusterName)) {
			retVal.add(new FileSprayWorkunitTreeItem(treeViewer, this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class FileSprayWorkunitTreeItem extends PlatformBaseTreeItem implements Observer {
	FileSprayWorkunit workunit;

	FileSprayWorkunitTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform, FileSprayWorkunit wu) {
		super(treeViewer, parent, platform);
		this.workunit = wu;
		this.workunit.addObserver(this);
		this.children.set(fetchChildren());
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
	public Object[] fetchChildren() {
		ArrayList<TreeItem> retVal = new ArrayList<TreeItem>();
		TreeItem parent = getParent();
		while (parent != null) {
			if (parent instanceof FileSprayWorkunitTreeItem)
				if (workunit == ((FileSprayWorkunitTreeItem)parent).workunit) {
					retVal.add(new RecursiveTreeItem(treeViewer, this));				
					break;
				}
			parent = parent.getParent();
		}
		if (retVal.isEmpty()) {
			LogicalFile lf = workunit.getLogicalFile();
			String filePath = workunit.getFilePath();
			if (workunit.isDespray()) {
				if (lf != null)
					retVal.add(new LogicalFileTreeItem(treeViewer, this, platform, lf));
				if (filePath != null)
					retVal.add(new LandingZoneFileTreeItem(treeViewer, this, platform, filePath));
			} else {
				if (filePath != null)
					retVal.add(new LandingZoneFileTreeItem(treeViewer, this, platform, filePath));
				if (lf != null)
					retVal.add(new LogicalFileTreeItem(treeViewer, this, platform, lf));
			}
		}
		return retVal.toArray();
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

class ClusterTreeItem extends PlatformBaseTreeItem {
	Cluster cluster;

	ClusterTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform, Cluster cluster) {
		super(treeViewer, parent, platform);
		this.cluster = cluster;
		this.clusterName = cluster.getName();
		this.children.set(fetchChildren());
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
	public Object[] fetchChildren() {
		ArrayList<TreeItem> retVal = new ArrayList<TreeItem>();
		retVal.add(new WorkunitFolderTreeItem(treeViewer, this, platform));
		retVal.add(new FileSprayWorkunitFolderTreeItem(treeViewer, this, platform));
		retVal.add(new LogicalFileFolderTreeItem(treeViewer, this, platform));
		return retVal.toArray();
	}
}

class QuerySetFolderTreeItem extends FolderTreeItem {

	QuerySetFolderTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform) {
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
	public Object[] fetchChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (DataQuerySet qs : platform.getDataQuerySets()) {
			retVal.add(new DataQuerySetTreeItem(treeViewer, this, platform, qs));				
		}
		return retVal.toArray();
	}
}

class DataQuerySetTreeItem extends PlatformBaseTreeItem {
	DataQuerySet querySet;

	DataQuerySetTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform, DataQuerySet querySet) {
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
	public Object[] fetchChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		TreeItem parent = getParent();
		while (parent != null) {
			if (parent instanceof DataQuerySetTreeItem)
				if (querySet == ((DataQuerySetTreeItem)parent).querySet) {
					retVal.add(new RecursiveTreeItem(treeViewer, this));				
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
		return retVal.toArray();
	}
}

class LogicalFileFolderTreeItem extends FolderTreeItem {

	LogicalFileFolderTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform) {
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
	public Object[] fetchChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (LogicalFile lf : platform.getLogicalFiles(clusterName)) {
			retVal.add(new LogicalFileTreeItem(treeViewer, this, platform, lf));				
		}
		return retVal.toArray();
	}
}

class WorkunitLogicalFileFolderTreeItem extends FolderTreeItem implements Observer {
	Workunit workunit;

	WorkunitLogicalFileFolderTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Workunit wu) {
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
	public Object[] fetchChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (LogicalFile file : workunit.getSourceFiles()) {
			retVal.add(new LogicalFileTreeItem(treeViewer, this, platform, file));
		}
		return retVal.toArray();
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

class LogicalFileTreeItem extends PlatformBaseTreeItem {
	LogicalFile file;

	LogicalFileTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform, LogicalFile file) {
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
	public Object[] fetchChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		TreeItem parent = getParent();
		while (parent != null) {
			if (parent instanceof LogicalFileTreeItem)
				if (file == ((LogicalFileTreeItem)parent).file) {
					retVal.add(new RecursiveTreeItem(treeViewer, this));				
					break;
				}
			parent = parent.getParent();
		}

		if (retVal.isEmpty()) {
			retVal.add(new LogicalFileContentsTreeItem(treeViewer, this, platform, file));
			Workunit wu = file.getWorkunit();
			if (wu != null) {
				retVal.add(new WorkunitTreeItem(treeViewer, this, wu));				
			}
			FileSprayWorkunit fswu = file.getFileSprayWorkunit();
			if (fswu != null) {
				retVal.add(new FileSprayWorkunitTreeItem(treeViewer, this, platform, fswu));				
			}
		}
		return retVal.toArray();
	}
}

class LogicalFileContentsTreeItem extends PlatformBaseTreeItem {
	LogicalFile file;

	LogicalFileContentsTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform, LogicalFile file) {
		super(treeViewer, parent, platform);
		this.file = file; 
		this.children.set(fetchChildren());
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

class LandingZoneFileTreeItem extends PlatformBaseTreeItem {
	String path;

	LandingZoneFileTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform, String path) {
		super(treeViewer, parent, platform);
		this.path = path; 
		this.children.set(fetchChildren());
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

class ResultFolderTreeItem extends FolderTreeItem implements Observer {
	Workunit workunit;

	ResultFolderTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Workunit wu) {
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
	public Object[] fetchChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Result r : workunit.getResults())
			retVal.add(new ResultTreeItem(treeViewer, this, platform, r));
				return retVal.toArray();
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

class ResultTreeItem extends PlatformBaseTreeItem implements Observer {
	Result result;

	ResultTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform, Result result) {
		super(treeViewer, parent, platform);
		this.result = result; 
		this.result.addObserver(this);
		this.children.set(fetchChildren());
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
	//http://192.168.2.68:8010/WsWorkunits/WUResult?Wuid=W20111026-161619&Sequence=0
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUResult", "Wuid=" + result.getWuid() + "&Sequence=" + result.getSequence());
	}
	
	@Override
	public Result getResult() {
		return result;
	}

	@Override
	public Object[] fetchChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(String s : result.getResultViews())
			retVal.add(new ResultViewTreeItem(treeViewer, this, platform, result, s));
		return retVal.toArray();
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		update(null);
	}
}

class ResultViewTreeItem extends PlatformBaseTreeItem {
	Result result;
	String viewName;

	ResultViewTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform, Result result, String viewName) {
		super(treeViewer, parent, platform);
		this.result = result; 
		this.viewName = viewName;
		this.children.set(fetchChildren());
	}

	@Override
	public String getText() {
		return viewName;
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/chart.png"); 
	}

	//http://192.168.2.68:8010/WsWorkunits/WUResultView?Wuid=W20111123-150928&ResultName=ScatterChart_Scatter_Test&ViewName=Google_Chart_by_Name
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUResultView", "Wuid=" + result.getWuid() + "&ResultName=" + result.getResultName() + "&ViewName=" + viewName);
	}
}

class GraphFolderTreeItem extends FolderTreeItem implements Observer  {
	Workunit workunit;

	GraphFolderTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Workunit wu) {
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
	public Object[] fetchChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Graph g : workunit.getGraphs())
			retVal.add(new GraphTreeItem(treeViewer, this, platform, g));
				return retVal.toArray();
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

class GraphTreeItem extends PlatformBaseTreeItem implements Observer {
	Graph graph;

	GraphTreeItem(TreeItemOwner treeViewer, PlatformBaseTreeItem parent, Platform platform, Graph graph) {
		super(treeViewer, parent, platform);
		this.graph = graph; 
		this.graph.addObserver(this);
		this.children.set(fetchChildren());
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

class MessageTreeItem extends TreeItem {
	String message;

	MessageTreeItem(TreeItemOwner treeViewer, TreeItem parent, String message) {
		super(treeViewer, parent);
		this.message = message;
		this.children.set(fetchChildren());
	}

	@Override
	public String getText() {
		return message;
	}
}

class RecursiveTreeItem extends MessageTreeItem {

	RecursiveTreeItem(TreeItemOwner treeViewer, TreeItem parent) {
		super(treeViewer, parent, "...recursive expansion...");
	}
}

class LoadingTreeItem extends MessageTreeItem {

	LoadingTreeItem(TreeItemOwner treeViewer, TreeItem parent) {
		super(treeViewer, parent, "...loading...");
	}
}
