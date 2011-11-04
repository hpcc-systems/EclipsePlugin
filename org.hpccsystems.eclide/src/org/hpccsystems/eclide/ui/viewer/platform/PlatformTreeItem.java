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
import org.eclipse.swt.widgets.Display;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.data.Cluster;
import org.hpccsystems.internal.data.FileSprayWorkunit;
import org.hpccsystems.internal.data.Graph;
import org.hpccsystems.internal.data.LogicalFile;
import org.hpccsystems.internal.data.Platform;
import org.hpccsystems.internal.data.Result;
import org.hpccsystems.internal.data.Workunit;

class WorkunitComparator implements Comparator<Object> {

	@Override
	public int compare(Object left, Object right) {
		String l = "";
		String r = "";
		if (left instanceof TreeItem)
			l = ((TreeItem)left).getText();
		else if (left instanceof Workunit)
			l = ((Workunit)left).info.getWuid();
		else if(left instanceof FileSprayWorkunit)
			l = ((FileSprayWorkunit)left).info.getID();

		if (right instanceof TreeItem)
			r = ((TreeItem)right).getText();
		if (right instanceof Workunit)
			r = ((Workunit)right).info.getWuid();
		else if(right instanceof FileSprayWorkunit)
			r = ((FileSprayWorkunit)right).info.getID();
		
		l = l.substring(1);
		r = r.substring(1);
		return r.compareTo(l);
	}
}

enum CalcState {
	UNKNOWN,
	STARTED,
	FINISHED
}

class TreeItem {
	protected TreeViewer treeViewer;
	protected TreeItem parent;
	private HtmlViewer htmlViewer;
	CalcState childrenCalcState;
	boolean hasChildren;

	TreeItem(TreeViewer treeViewer, TreeItem parent) {
		this.treeViewer = treeViewer;
		this.parent = parent;
		this.htmlViewer = null;
		this.childrenCalcState = CalcState.UNKNOWN;
		this.hasChildren = false;
	}
	
	HtmlViewer getHtmlViewer() {
		return htmlViewer;
	}
	
	TreeItem getParent() {
		return parent;
	}

	String getText() {
		return "TODO";
	}
	
	Image getImage() {
        return null;
	}

	final void showWebPage() {
		if (htmlViewer == null)
			htmlViewer = Eclipse.findHtmlViewer();
		
		try {
			URL webPageURL = getWebPageURL();
			if (htmlViewer != null && webPageURL != null) {
				htmlViewer.showURL(webPageURL.toString(), getUser(), getPassword());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	URL getWebPageURL() throws MalformedURLException {
		return new URL ("about:blank");
	}
	
	String getUser() {
		return "";
	}

	String getPassword() {
		return "";
	}

	void update(final String[] properties) {
		final TreeItem self = this;
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {
				treeViewer.update(self, properties);
			}
		});
	}

	void refresh() {
		final TreeItem self = this;
		Display.getDefault().asyncExec(new Runnable() {   
			public void run() {
				treeViewer.refresh(self);
			}
		});
	}
	
	CalcState getChildrenCaclState() {
		return childrenCalcState;
	}
	
	final boolean hasChildren() {
		switch (childrenCalcState) {
		case UNKNOWN:
			childrenCalcState = CalcState.STARTED;
			update(null);
			final TreeItem self = this;
			Thread thread = new Thread(new Runnable() {
				public void run() {
					Object[] children = getChildren();
					hasChildren = children == null ? false : children.length > 0;
					childrenCalcState = CalcState.FINISHED;
					self.refresh();
				}
			}, "Load children:  " + getText());
			thread.start();
			break;
		case STARTED:
			break;
		case FINISHED:
			return hasChildren;
		}
		return false;
	}
	
	Object[] getChildren() {
		return null;
	}
}

class PlatformBaseTreeItem extends TreeItem {
	Platform platform;
	
	PlatformBaseTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform) {
		super(treeViewer, parent);
		this.platform = platform;
	}

	String getUser() {
		return platform.user;
	}

	String getPassword() {
		return platform.password;
	}
}

class ClusterPlatformBaseTreeItem extends PlatformBaseTreeItem {
	Cluster cluster;
	
	ClusterPlatformBaseTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, Cluster cluster) {
		super(treeViewer, parent, platform);
		this.cluster = cluster;
	}
}

class PlatformTreeItem extends PlatformBaseTreeItem {

	PlatformTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	String getText() {
		return platform.GetIP();
	}
	
	Image getImage() {
        return Activator.getImage("icons/platform.png"); 
	}

	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL();
	}
	
	String getUser() {
		return platform.user;
	}

	String getPassword() {
		return platform.password;
	}
	
	public Object[] getChildren() {
		ArrayList<TreeItem> retVal = new ArrayList<TreeItem>();
		retVal.add(new ClusterFolderTreeItem(treeViewer, this, platform));
		retVal.add(new WorkunitFolderTreeItem(treeViewer, this, platform));
		retVal.add(new FileSprayWorkunitFolderTreeItem(treeViewer, this, platform));
		retVal.add(new LogicalFileFolderTreeItem(treeViewer, this, platform));
		return retVal.toArray();
	}
}

class ClusterFolderTreeItem extends PlatformBaseTreeItem {

	ClusterFolderTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform) {
		super(treeViewer, parent, platform);
	}
	
	String getText() {
		return "Clusters";
	}
	
	Image getImage() {
        return Activator.getImage("icons/folder.png"); 
	}
	
	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsTopology", "TpTargetClusterQuery");
	}

	public Object[] getChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Cluster c : platform.GetClusters())
			retVal.add(new ClusterTreeItem(treeViewer, this, platform, c));
		return retVal.toArray();
	}
}

class WorkunitFolderTreeItem extends PlatformBaseTreeItem {
	
	WorkunitFolderTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform) {
		super(treeViewer, parent, platform);
	}
	
	String getText() {
		return "Workunits";
	}
	
	Image getImage() {
        return Activator.getImage("icons/folder.png"); 
	}

	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsWorkunits", "WUQuery");
	}

	public Object[] getChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (Workunit wu : platform.GetWorkunits()) {
			retVal.add(new WorkunitTreeItem(treeViewer, this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class ClusterWorkunitFolderTreeItem extends ClusterPlatformBaseTreeItem {

	ClusterWorkunitFolderTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, Cluster cluster) {
		super(treeViewer, parent, platform, cluster);
	}
	
	String getText() {
		return "Workunits";
	}

	Image getImage() {
        return Activator.getImage("icons/folder.png"); 
	}

	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsWorkunits", "WUQuery", "Cluster=" + cluster.info.getName());
	}

	public Object[] getChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (Workunit wu : platform.GetWorkunits(cluster.info.getName())) {
			retVal.add(new WorkunitTreeItem(treeViewer, this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class WorkunitTreeItem extends PlatformBaseTreeItem implements Observer {
	Workunit workunit;
	
	WorkunitTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, Workunit wu) {
		super(treeViewer, parent, platform);
		this.workunit = wu;
		wu.addObserver(this);
	}
	
	String getText() {
		if (workunit.isComplete()) 
			return workunit.info.getWuid();
		return workunit.info.getWuid() + " (" + workunit.info.getState() + ")";
	}
	
	Image getImage() {
		/*enum WUState 
		{
			WUStateUnknown = 0,
			WUStateCompiled,
			WUStateRunning,
			WUStateCompleted,
			WUStateFailed,
			WUStateArchived,
			WUStateAborting,
			WUStateAborted,
			WUStateBlocked,
			WUStateSubmitted,
			WUStateScheduled,
			WUStateCompiling,
			WUStateWait,
			WUStateWaitingForUpload,
			WUStateDebugPaused,
			WUStateDebugRunning,
			WUStateSize	//Don't forget to update the string table below..
		};*/
		
		if (workunit.info.getStateID() == null)
			return null;
		
		switch(workunit.info.getStateID()) {
			case 1:
				return Activator.getImage("icons/workunit_submitted.png"); 
			case 2:
				return Activator.getImage("icons/workunit_running.png"); 
			case 3:
				return Activator.getImage("icons/workunit_completed.png"); 
			case 4:
				return Activator.getImage("icons/workunit_failed.png"); 
			case 5:
				return Activator.getImage("icons/workunit_warning.png"); 
			case 6:
				return Activator.getImage("icons/workunit_aborting.png"); 
			case 7:
				return Activator.getImage("icons/workunit_failed.png"); 
			case 8:
				return Activator.getImage("icons/workunit_warning.png"); 
			case 9:
				return Activator.getImage("icons/workunit_submitted.png"); 
			case 10:
				return Activator.getImage("icons/workunit_warning.png"); 
			default:
				break;
			}
		return Activator.getImage("icons/workunit_warning.png"); 
	}

	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsWorkunits", "WUInfo", "Wuid=" + workunit.info.getWuid());
	}

	public Object[] getChildren() {
		ArrayList<TreeItem> retVal = new ArrayList<TreeItem>();
		TreeItem parent = getParent();
		while (parent != null) {
			if (parent instanceof WorkunitTreeItem)
				if (workunit == ((WorkunitTreeItem)parent).workunit) {
					retVal.add(new RecursiveTreeItem(treeViewer, this));				
					break;
				}
			parent = parent.getParent();
		}
		if (retVal.isEmpty()) {
			retVal.add(new ResultFolderTreeItem(treeViewer, this, platform, workunit));
			retVal.add(new GraphFolderTreeItem(treeViewer, this, platform, workunit));
			retVal.add(new WorkunitLogicalFileFolderTreeItem(treeViewer, this, platform, workunit));
		}
		return retVal.toArray();
	}

	public void update(Observable arg0, Object arg1) {
		update(null);
	}
}

class FileSprayWorkunitFolderTreeItem extends PlatformBaseTreeItem {
	
	FileSprayWorkunitFolderTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform) {
		super(treeViewer, parent, platform);
	}
	
	String getText() {
		return "File Sprays";
	}

	Image getImage() {
        return Activator.getImage("icons/folder.png"); 
	}

	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("FileSpray", "GetDFUWorkunits");
	}

	public Object[] getChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (FileSprayWorkunit wu : platform.GetFileSprayWorkunits()) {
			retVal.add(new FileSprayWorkunitTreeItem(treeViewer, this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class ClusterFileSprayWorkunitFolderTreeItem extends ClusterPlatformBaseTreeItem {
	
	ClusterFileSprayWorkunitFolderTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, Cluster cluster) {
		super(treeViewer, parent, platform, cluster);
	}
	
	String getText() {
		return "File Sprays";
	}

	Image getImage() {
        return Activator.getImage("icons/folder.png"); 
	}

	//http://192.168.2.68:8010/FileSpray/GetDFUWorkunits?Cluster=thor
	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("FileSpray", "GetDFUWorkunits", "Cluster=" + cluster.info.getName());
	}

	public Object[] getChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (FileSprayWorkunit wu : platform.GetFileSprayWorkunits(cluster.info.getName())) {
			retVal.add(new FileSprayWorkunitTreeItem(treeViewer, this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class FileSprayWorkunitTreeItem extends PlatformBaseTreeItem {
	FileSprayWorkunit wu;
	
	FileSprayWorkunitTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, FileSprayWorkunit wu) {
		super(treeViewer, parent, platform);
		this.wu = wu;
	}
	
	String getText() {
		return wu.info.getID();
	}
	
	Image getImage() {
        return Activator.getImage("icons/workunit.png"); 
	}

	//javascript:go('/FileSpray/GetDFUWorkunit?wuid=D20111027-153447')
	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("FileSpray", "GetDFUWorkunit", "wuid=" + wu.info.getID());
	}
}

class ClusterTreeItem extends ClusterPlatformBaseTreeItem {
	ClusterTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, Cluster cluster) {
		super(treeViewer, parent, platform, cluster);
	}
	
	String getText() {
		return cluster.info.getName();
	}

	Image getImage() {
        return Activator.getImage("icons/cluster.png"); 
	}

	URL getWebPageURL() throws MalformedURLException {
		//http://192.168.2.68:8010/ws_machine/GetTargetClusterInfo?form
		return platform.GetURL("ws_machine", "GetTargetClusterInfo", "TargetClusters=" + cluster.info.getName());
	}

	public Object[] getChildren() {
		ArrayList<TreeItem> retVal = new ArrayList<TreeItem>();
		retVal.add(new ClusterWorkunitFolderTreeItem(treeViewer, this, platform, cluster));
		retVal.add(new ClusterFileSprayWorkunitFolderTreeItem(treeViewer, this, platform, cluster));
		retVal.add(new ClusterLogicalFileFolderTreeItem(treeViewer, this, platform, cluster));
		return retVal.toArray();
	}
}

class LogicalFileFolderTreeItem extends PlatformBaseTreeItem {

	LogicalFileFolderTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform) {
		super(treeViewer, parent, platform);
	}

	String getText() {
		return "Files";
	}
	
	Image getImage() {
        return Activator.getImage("icons/folder.png"); 
	}

	//http://192.168.2.68:8010/WsDfu/DFUQuery
	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsDfu", "DFUQuery");
	}

	public Object[] getChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (LogicalFile wu : platform.GetLogicalFiles()) {
			retVal.add(new LogicalFileTreeItem(treeViewer, this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class WorkunitLogicalFileFolderTreeItem extends PlatformBaseTreeItem {
	Workunit wu;

	WorkunitLogicalFileFolderTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, Workunit wu) {
		super(treeViewer, parent, platform);
		this.wu = wu;
	}

	String getText() {
		return "Source Files";
	}
	
	Image getImage() {
        return Activator.getImage("icons/folder.png"); 
	}

	//http://192.168.2.68:8010/WsDfu/DFUQuery
	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsWorkunits", "WUInfo", "Wuid=" + wu.info.getWuid());
	}

	public Object[] getChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (LogicalFile file : wu.GetLogicalFiles()) {
			retVal.add(new LogicalFileTreeItem(treeViewer, this, platform, file));
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class ClusterLogicalFileFolderTreeItem extends ClusterPlatformBaseTreeItem {

	ClusterLogicalFileFolderTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, Cluster cluster) {
		super(treeViewer, parent, platform, cluster);
	}

	String getText() {
		return "Files";
	}

	Image getImage() {
        return Activator.getImage("icons/folder.png"); 
	}

	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsDfu", "DFUQuery", "ClusterName=" + cluster.info.getName());
	}

	public Object[] getChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for (LogicalFile wu : platform.GetLogicalFiles(cluster.info.getName())) {
			retVal.add(new LogicalFileTreeItem(treeViewer, this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class LogicalFileTreeItem extends PlatformBaseTreeItem {
	LogicalFile file;
	
	LogicalFileTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, LogicalFile file) {
		super(treeViewer, parent, platform);
		this.file = file; 
	}
	
	String getText() {
		return file.info.getName();
	}

	Image getImage() {
        return Activator.getImage("icons/file.png"); 
	}

	//http://192.168.2.68:8010/WsDfu/DFUInfo?Name=tutorial::g::originalperson
	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsDfu", "DFUInfo", "Name=" + file.info.getName());
	}

	public Object[] getChildren() {
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
			file.Refresh();
			retVal.add(new LogicalFileContentsTreeItem(treeViewer, this, platform, file));
			Workunit wu = platform.GetWorkunit(file.info2.getWuid());
			if (wu != null) {
				retVal.add(new WorkunitTreeItem(treeViewer, this, platform, wu));				
			}
			Collections.sort(retVal, new WorkunitComparator());
		}
		return retVal.toArray();
	}
}

class LogicalFileContentsTreeItem extends PlatformBaseTreeItem {
	LogicalFile file;
	
	LogicalFileContentsTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, LogicalFile file) {
		super(treeViewer, parent, platform);
		this.file = file; 
	}
	
	String getText() {
		return file.info2.getDir();
	}

	Image getImage() {
        return Activator.getImage("icons/filecontent.png"); 
	}

	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsWorkunits", "WUResult", "LogicalName=" + file.info.getName());
	}
}

class ResultFolderTreeItem extends PlatformBaseTreeItem {
	Workunit wu;
	
	ResultFolderTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, Workunit wu) {
		super(treeViewer, parent, platform);
		this.wu = wu;
	}
	
	String getText() {
		return "Results";
	}
	
	Image getImage() {
        return Activator.getImage("icons/folder.png"); 
	}

	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsWorkunits", "WUInfo", "Wuid=" + wu.info.getWuid());
	}

	public Object[] getChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Result r : wu.GetResults())
			retVal.add(new ResultTreeItem(treeViewer, this, platform, r));
		return retVal.toArray();
	}
}

class ResultTreeItem extends PlatformBaseTreeItem {
	Result result;
	
	ResultTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, Result result) {
		super(treeViewer, parent, platform);
		this.result = result; 
	}
	
	String getText() {
		return result.info.getName();
	}

	Image getImage() {
        return Activator.getImage("icons/result.png"); 
	}
	//http://192.168.2.68:8010/WsWorkunits/WUResult?Wuid=W20111026-161619&Sequence=0
	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsWorkunits", "WUResult", "Wuid=" + result.workunit.info.getWuid() + "&Sequence=" + result.info.getSequence());
	}
}

class GraphFolderTreeItem extends PlatformBaseTreeItem {
	Workunit wu;
	
	GraphFolderTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, Workunit wu) {
		super(treeViewer, parent, platform);
		this.wu = wu;
	}
	
	String getText() {
		return "Graphs";
	}
	
	Image getImage() {
        return Activator.getImage("icons/folder.png"); 
	}

	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsWorkunits", "WUInfo", "Wuid=" + wu.info.getWuid());
	}

	public Object[] getChildren() {
		ArrayList<Object> retVal = new ArrayList<Object>();
		for(Graph g : wu.GetGraphs())
			retVal.add(new GraphTreeItem(treeViewer, this, platform, g));
		return retVal.toArray();
	}
}

class GraphTreeItem extends PlatformBaseTreeItem {
	Graph graph;
	
	GraphTreeItem(TreeViewer treeViewer, TreeItem parent, Platform platform, Graph graph) {
		super(treeViewer, parent, platform);
		this.graph = graph; 
	}
	
	String getText() {
		return graph.info.getName();
	}

	Image getImage() {
		if (graph.info.getRunning() != null && graph.info.getRunning()) 
	        return Activator.getImage("icons/graph_running.png");
		else if (graph.info.getComplete() != null && graph.info.getComplete())
	        return Activator.getImage("icons/graph_completed.png");
		else if (graph.info.getFailed() != null && graph.info.getFailed())
	        return Activator.getImage("icons/graph_failed.png");
        return Activator.getImage("icons/graph.png"); 
	}
	//http://192.168.2.68:8010/WsWorkunits/GVCAjaxGraph?Name=W20111103-233901&GraphName=graph1
	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsWorkunits", "GVCAjaxGraph", "Name=" + graph.workunit.info.getWuid() + "&GraphName=" + graph.info.getName());
	}
}

class MessageTreeItem extends TreeItem {
	String message;

	MessageTreeItem(TreeViewer treeViewer, TreeItem parent, String message) {
		super(treeViewer, parent);
		this.message = message;
	}

	String getText() {
		return message;
	}
}

class RecursiveTreeItem extends MessageTreeItem {

	RecursiveTreeItem(TreeViewer treeViewer, TreeItem parent) {
		super(treeViewer, parent, "...already expanded...");
	}
}

class LoadingTreeItem extends MessageTreeItem {

	LoadingTreeItem(TreeViewer treeViewer, TreeItem parent) {
		super(treeViewer, parent, "...loading...");
	}
}
