package org.hpccsystems.eclide.ui.viewer.platform;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.swt.graphics.Image;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.internal.data.Graph;
import org.hpccsystems.internal.data.Platform;

public class GraphView extends PlatformBaseView implements Observer {
	Graph graph;

	GraphView(TreeItemOwner treeViewer, PlatformBaseView parent, Platform platform, Graph graph) {
		super(treeViewer, parent, platform);
		this.graph = graph; 
		this.graph.addObserver(this);
		refreshChildren();
	}

	public Graph getGraph() {
		return graph;
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