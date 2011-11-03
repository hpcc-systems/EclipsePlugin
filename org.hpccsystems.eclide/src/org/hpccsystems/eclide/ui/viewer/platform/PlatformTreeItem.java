package org.hpccsystems.eclide.ui.viewer.platform;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.ui.viewer.HtmlViewer;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.internal.data.Cluster;
import org.hpccsystems.internal.data.FileSprayWorkunit;
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

class TreeItem {
	protected TreeItem parent;
	private HtmlViewer htmlViewer;

	TreeItem(TreeItem parent) {
		this.parent = parent;
		this.htmlViewer = null;
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

	boolean hasChildren() {
		 // Get the children
	    Object[] obj = getChildren();

	    // Return whether the parent has children
	    return obj == null ? false : obj.length > 0;
	}
	
	Object[] getChildren() {
		return null;
	}
}

class PlatformBaseTreeItem extends TreeItem {
	Platform platform;
	
	PlatformBaseTreeItem(TreeItem parent, Platform platform) {
		super(parent);
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
	
	ClusterPlatformBaseTreeItem(TreeItem parent, Platform platform, Cluster cluster) {
		super(parent, platform);
		this.cluster = cluster;
	}
}

class PlatformTreeItem extends PlatformBaseTreeItem {

	PlatformTreeItem(TreeItem parent, Platform platform) {
		super(parent, platform);
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
	
	boolean hasChildren() {
		return true;
	}

	public Object[] getChildren() {
		Vector<TreeItem> retVal = new Vector<TreeItem>();
		retVal.add(new ClusterFolderTreeItem(this, platform));
		retVal.add(new WorkunitFolderTreeItem(this, platform));
		retVal.add(new FileSprayWorkunitFolderTreeItem(this, platform));
		retVal.add(new LogicalFileFolderTreeItem(this, platform));
		return retVal.toArray();
	}
}

class ClusterFolderTreeItem extends PlatformBaseTreeItem {

	ClusterFolderTreeItem(TreeItem parent, Platform platform) {
		super(parent, platform);
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
			retVal.add(new ClusterTreeItem(this, platform, c));
		return retVal.toArray();
	}
}

class WorkunitFolderTreeItem extends PlatformBaseTreeItem {
	
	WorkunitFolderTreeItem(TreeItem parent, Platform platform) {
		super(parent, platform);
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
			retVal.add(new WorkunitTreeItem(this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class ClusterWorkunitFolderTreeItem extends ClusterPlatformBaseTreeItem {

	ClusterWorkunitFolderTreeItem(TreeItem parent, Platform platform, Cluster cluster) {
		super(parent, platform, cluster);
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
			retVal.add(new WorkunitTreeItem(this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class WorkunitTreeItem extends PlatformBaseTreeItem {
	Workunit workunit;
	
	WorkunitTreeItem(TreeItem parent, Platform platform, Workunit wu) {
		super(parent, platform);
		this.workunit = wu;
	}
	
	String getText() {
		return workunit.info.getWuid();
	}
	
	Image getImage() {
		switch(workunit.info.getStateID()) {
		case 3:
	        return Activator.getImage("icons/workunit_completed.png"); 
		case 4:
	        return Activator.getImage("icons/workunit_failed.png"); 
		default:
			break;
		}
        return Activator.getImage("icons/workunit.png"); 
	}

	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsWorkunits", "WUInfo", "Wuid=" + workunit.info.getWuid());
	}

	public Object[] getChildren() {
		Vector<TreeItem> retVal = new Vector<TreeItem>();
		TreeItem parent = getParent();
		while (parent != null) {
			if (parent instanceof WorkunitTreeItem)
				if (workunit == ((WorkunitTreeItem)parent).workunit) {
					retVal.add(new RecursiveTreeItem(this));				
					break;
				}
			parent = parent.getParent();
		}
		if (retVal.isEmpty()) {
			retVal.add(new ResultFolderTreeItem(this, platform, workunit));
			retVal.add(new WorkunitLogicalFileFolderTreeItem(this, platform, workunit));
		}
		return retVal.toArray();
	}
}

class FileSprayWorkunitFolderTreeItem extends PlatformBaseTreeItem {
	
	FileSprayWorkunitFolderTreeItem(TreeItem parent, Platform platform) {
		super(parent, platform);
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
			retVal.add(new FileSprayWorkunitTreeItem(this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class ClusterFileSprayWorkunitFolderTreeItem extends ClusterPlatformBaseTreeItem {
	
	ClusterFileSprayWorkunitFolderTreeItem(TreeItem parent, Platform platform, Cluster cluster) {
		super(parent, platform, cluster);
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
			retVal.add(new FileSprayWorkunitTreeItem(this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class FileSprayWorkunitTreeItem extends PlatformBaseTreeItem {
	FileSprayWorkunit wu;
	
	FileSprayWorkunitTreeItem(TreeItem parent, Platform platform, FileSprayWorkunit wu) {
		super(parent, platform);
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

	public Object[] getChildren() {
		return null;
	}
}

class ClusterTreeItem extends ClusterPlatformBaseTreeItem {
	ClusterTreeItem(TreeItem parent, Platform platform, Cluster cluster) {
		super(parent, platform, cluster);
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
		Vector<TreeItem> retVal = new Vector<TreeItem>();
		retVal.add(new ClusterWorkunitFolderTreeItem(this, platform, cluster));
		retVal.add(new ClusterFileSprayWorkunitFolderTreeItem(this, platform, cluster));
		retVal.add(new ClusterLogicalFileFolderTreeItem(this, platform, cluster));
		return retVal.toArray();
	}
}

class LogicalFileFolderTreeItem extends PlatformBaseTreeItem {

	LogicalFileFolderTreeItem(TreeItem parent, Platform platform) {
		super(parent, platform);
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
			retVal.add(new LogicalFileTreeItem(this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class WorkunitLogicalFileFolderTreeItem extends PlatformBaseTreeItem {
	Workunit wu;

	WorkunitLogicalFileFolderTreeItem(TreeItem parent, Platform platform, Workunit wu) {
		super(parent, platform);
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
			retVal.add(new LogicalFileTreeItem(this, platform, file));
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class ClusterLogicalFileFolderTreeItem extends ClusterPlatformBaseTreeItem {

	ClusterLogicalFileFolderTreeItem(TreeItem parent, Platform platform, Cluster cluster) {
		super(parent, platform, cluster);
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
			retVal.add(new LogicalFileTreeItem(this, platform, wu));				
		}
		Collections.sort(retVal, new WorkunitComparator());
		return retVal.toArray();
	}
}

class LogicalFileTreeItem extends PlatformBaseTreeItem {
	LogicalFile file;
	
	LogicalFileTreeItem(TreeItem parent, Platform platform, LogicalFile file) {
		super(parent, platform);
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
					retVal.add(new RecursiveTreeItem(this));				
					break;
				}
			parent = parent.getParent();
		}
		
		if (retVal.isEmpty()) {
			file.Refresh();
			retVal.add(new LogicalFileContentsTreeItem(this, platform, file));
			Workunit wu = platform.GetWorkunit(file.info2.getWuid());
			if (wu != null) {
				retVal.add(new WorkunitTreeItem(this, platform, wu));				
			}
			Collections.sort(retVal, new WorkunitComparator());
		}
		return retVal.toArray();
	}
}

class LogicalFileContentsTreeItem extends PlatformBaseTreeItem {
	LogicalFile file;
	
	LogicalFileContentsTreeItem(TreeItem parent, Platform platform, LogicalFile file) {
		super(parent, platform);
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

	public Object[] getChildren() {
		return null;
	}
}

class ResultFolderTreeItem extends PlatformBaseTreeItem {
	Workunit wu;
	
	ResultFolderTreeItem(TreeItem parent, Platform platform, Workunit wu) {
		super(parent, platform);
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
		wu.Refresh();
		for(Result r : wu.GetResults())
			retVal.add(new ResultTreeItem(this, platform, r));
		return retVal.toArray();
	}
}

class ResultTreeItem extends PlatformBaseTreeItem {
	Result result;
	
	ResultTreeItem(TreeItem parent, Platform platform, Result result) {
		super(parent, platform);
		this.result = result; 
	}
	
	String getText() {
		return result.info.getName();
	}

	//http://192.168.2.68:8010/WsWorkunits/WUResult?Wuid=W20111026-161619&Sequence=0
	URL getWebPageURL() throws MalformedURLException {
		return platform.GetURL("WsWorkunits", "WUResult", "Wuid=" + result.workunit.info.getWuid() + "&Sequence=" + result.info.getSequence());
	}

	public Object[] getChildren() {
		return null;
	}
}

class RecursiveTreeItem extends TreeItem {

	RecursiveTreeItem(TreeItem parent) {
		super(parent);
	}

	String getText() {
		return "...already expanded...";
	}

	public Object[] getChildren() {
		return null;
	}
}
