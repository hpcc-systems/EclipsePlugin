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

import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.Cluster;
import org.hpccsystems.internal.data.DataQuerySet;
import org.hpccsystems.internal.data.DropZone;
import org.hpccsystems.internal.data.FileSprayWorkunit;
import org.hpccsystems.internal.data.Graph;
import org.hpccsystems.internal.data.LogicalFile;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Result;
import org.hpccsystems.internal.data.Workunit;
import org.hpccsystems.internal.ui.tree.ItemView;

class PlatformBaseView extends ItemView {
	Platform platform;
	String clusterName;

	PlatformBaseView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform) {
		super(treeViewer, parent);
		this.platform = platform;
		clusterName = parent != null ? parent.clusterName : "";
	}

	@Override
	public String getUser() {
		return platform.getUser();
	}

	@Override
	public String getPassword() {
		return platform.getPassword();
	}
}

class TargetFolderView extends FolderItemView {

	TargetFolderView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return "Targets";
	}
	
	@Override
	public boolean hasChildren() {
		return super.hasChildren();
	}

	@Override
	public Object[] getChildren() {
		return super.getChildren();
	}

	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsTopology", "TpTargetClusterQuery");
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Cluster c : platform.getClusters())
			retVal.add(new ClusterView(treeViewer, this, platform, c));
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class ClusterView extends PlatformBaseView {
	Cluster cluster;

	ClusterView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform, Cluster cluster) {
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

	@Override
	public URL getWebPageURL() throws MalformedURLException {
		//http://192.168.2.68:8010/ws_machine/GetTargetClusterInfo?form
		return platform.getURL("ws_machine", "GetTargetClusterInfo", "TargetClusters=" + clusterName);
	}

	@Override
	public void refreshChildren() {
		ArrayList<ItemView> retVal = new ArrayList<ItemView>();
		retVal.add(new WorkunitFolderView(treeViewer, this, platform));
		retVal.add(new FileSprayWorkunitFolderView(treeViewer, this, platform));
		retVal.add(new LogicalFileFolderView(treeViewer, this, platform));
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class DropZoneFolderView extends FolderItemView {

	DropZoneFolderView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return "Drop Zones";
	}
	
	//  http://192.168.2.68:8010/FileSpray/DropZoneFiles?ver_=1.03
	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("FileSpray", "DropZoneFiles");
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (DropZone dz : platform.getDropZones()) {
			retVal.add(new DropZoneView(treeViewer, this, platform, dz));
		}
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class DropZoneView extends PlatformBaseView {
	DropZone dropZone;

	DropZoneView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform, DropZone dropZone) {
		super(treeViewer, parent, platform);
		this.dropZone = dropZone;
		refreshChildren();
	}

	@Override
	public String getText() {
		return dropZone.getName();
	}

	@Override
	public Image getImage() {
		return Activator.getImage("icons/cluster.png"); 
	}

	@Override
	public URL getWebPageURL() throws MalformedURLException {
		//http://192.168.2.68:8010/FileSpray/FileList?Netaddr=192.168.2.68&OS=1&Path=/var/lib/HPCCSystems/mydropzone
		return platform.getURL("FileSpray", "FileList", "Netaddr=" + dropZone.getIP() + "&OS=" + dropZone.getOS() + "&Path=" + dropZone.getDirectory());
	}

	@Override
	public void refreshChildren() {
		ArrayList<ItemView> retVal = new ArrayList<ItemView>();
		for (LogicalFile lf : dropZone.getFiles()) {
			retVal.add(new LogicalFileView(treeViewer, this, platform, lf));
		}
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class QuerySetFolderView extends FolderItemView {

	QuerySetFolderView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return "Query Sets";
	}

	//http://192.168.2.68:8010/WsWorkunits/WUQuerySets	
	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUQuerySets");
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (DataQuerySet qs : platform.getDataQuerySets()) {
			retVal.add(new DataQuerySetView(treeViewer, this, platform, qs));				
		}
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class DataQuerySetView extends PlatformBaseView {
	DataQuerySet querySet;

	DataQuerySetView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform, DataQuerySet querySet) {
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
	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUQuerysetDetails", "QuerySetName=" + querySet.getName());
}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		ItemView parent = getParent();
		while (parent != null) {
			if (parent instanceof DataQuerySetView)
				if (querySet == ((DataQuerySetView)parent).querySet) {
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

class LogicalFileFolderView extends FolderItemView {

	LogicalFileFolderView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	@Override
	public String getText() {
		return "Files";
	}

	//http://192.168.2.68:8010/WsDfu/DFUQuery
	@Override
	public URL getWebPageURL() throws MalformedURLException {
		if (clusterName.isEmpty())
			return platform.getURL("WsDfu", "DFUQuery");
		return platform.getURL("WsDfu", "DFUQuery", "ClusterName=" + clusterName);
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (LogicalFile lf : platform.getLogicalFiles(clusterName)) {
			retVal.add(new LogicalFileView(treeViewer, this, platform, lf));				
		}
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class WorkunitLogicalFileFolderView extends FolderItemView implements Observer {
	Workunit workunit;

	WorkunitLogicalFileFolderView(TreeItemOwner treeViewer, PlatformBaseView parent, Workunit wu) {
		super(treeViewer, parent, wu.getPlatform());
		this.workunit = wu;
		this.workunit.addObserver(this);
	}

	@Override
	public String getText() {
		return "Source Files";
	}

	//http://192.168.2.68:8010/WsDfu/DFUQuery
	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUInfo", "Wuid=" + workunit.getWuid());
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (LogicalFile file : workunit.getSourceFiles()) {
			retVal.add(new LogicalFileView(treeViewer, this, platform, file));
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

class LogicalFileView extends PlatformBaseView {
	LogicalFile file;

	LogicalFileView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform, LogicalFile file) {
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
	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsDfu", "DFUInfo", "Name=" + file.getName());
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		ItemView parent = getParent();
		while (parent != null) {
			if (parent instanceof LogicalFileView)
				if (file == ((LogicalFileView)parent).file) {
					retVal.add(new RecursiveItemView(treeViewer, this));				
					break;
				}
			parent = parent.getParent();
		}

		if (retVal.isEmpty()) {
			retVal.add(new LogicalFileContentsView(treeViewer, this, platform, file));
			Workunit wu = file.getWorkunit();
			if (wu != null) {
				retVal.add(new WorkunitView(treeViewer, this, wu));				
			}
			FileSprayWorkunit fswu = file.getFileSprayWorkunit();
			if (fswu != null) {
				retVal.add(new FileSprayWorkunitView(treeViewer, this, fswu));				
			}
		}
		children.set(retVal.toArray(new ItemView[0]));
	}
}

class LogicalFileContentsView extends PlatformBaseView {
	LogicalFile file;

	LogicalFileContentsView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform, LogicalFile file) {
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

	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUResult", "LogicalName=" + file.getName());
	}
}

class LandingZoneFileView extends PlatformBaseView {
	String path;

	LandingZoneFileView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform, String path) {
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

class ResultFolderView extends FolderItemView implements Observer {
	Workunit workunit;

	ResultFolderView(TreeItemOwner treeViewer, PlatformBaseView parent, Workunit wu) {
		super(treeViewer, parent, wu.getPlatform());
		this.workunit = wu;
		this.workunit.addObserver(this);
	}

	@Override
	public String getText() {
		return "Results";
	}

	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUInfo", "Wuid=" + workunit.getWuid());
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Result r : workunit.getResults())
			retVal.add(new ResultView(treeViewer, this, platform, r));
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

class ResultView extends PlatformBaseView implements Observer {
	Result result;

	ResultView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform, Result result) {
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

	@Override
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
			retVal.add(new ResultViewView(treeViewer, this, platform, result, s));
		children.set(retVal.toArray(new ItemView[0]));
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		update(null);
	}
}

class ResultViewView extends PlatformBaseView {
	Result result;
	String viewName;

	ResultViewView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform, Result result, String viewName) {
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

	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUResultView", "Wuid=" + result.getWuid() + "&ResultName=" + result.getResultName() + "&ViewName=" + viewName);
	}
}

class GraphFolderView extends FolderItemView implements Observer  {
	Workunit workunit;

	GraphFolderView(TreeItemOwner treeViewer, PlatformBaseView parent, Workunit wu) {
		super(treeViewer, parent, wu.getPlatform());
		this.workunit = wu;
		this.workunit.addObserver(this);
	}

	@Override
	public String getText() {
		return "Graphs";
	}

	@Override
	public URL getWebPageURL() throws MalformedURLException {
		return platform.getURL("WsWorkunits", "WUInfo", "Wuid=" + workunit.getWuid());
	}

	@Override
	public void refreshChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Graph g : workunit.getGraphs())
			retVal.add(new GraphView(treeViewer, this, platform, g));
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

class GraphView extends PlatformBaseView implements Observer {
	Graph graph;

	GraphView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform, Graph graph) {
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
	@Override
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
