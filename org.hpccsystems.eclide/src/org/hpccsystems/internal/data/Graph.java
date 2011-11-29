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
package org.hpccsystems.internal.data;

import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.wsworkunits.ECLGraph;

public class Graph extends DataSingleton {
	private static Map<Integer, Graph> Graphs = new HashMap<Integer, Graph>();
	public static synchronized Graph get(Workunit workunit, String name) {
		Graph graph = new Graph(workunit, name);
		if (Graphs.containsKey(graph.hashCode())) {
			return Graphs.get(graph.hashCode());
		}
		else {
			Graphs.put(graph.hashCode(), graph);
		}
		return graph;
	}
	
	private Workunit workunit;
	private ECLGraph info;
	public enum Notification {
		GRAPH
	}
	
	private Graph(Workunit workunit, String name) {
		this.workunit = workunit;
		info = new ECLGraph();
		info.setName(name);
	}

	public String getWuid() {
		return workunit.getWuid();
	}

	public String getName() {
		return info.getName();
	}

	public State getStateID() {
		if (info.getRunning() != null && info.getRunning()) 
			return State.RUNNING;
		else if (info.getComplete() != null && info.getComplete())
			return State.COMPLETED;
		else if (info.getFailed() != null && info.getFailed())
			return State.FAILED;
		return State.UNKNOWN;
	}
	
	@Override
	public boolean isComplete() {
		return StateHelper.isCompleted(getStateID());
	}

	@Override
	void fastRefresh() {
		fullRefresh();
	}

	@Override
	void fullRefresh() {
		workunit.getGraphs();
		/*
		WsWorkunitsServiceSoap service = platform.GetWsWorkunitsService();
		if (service != null) {
			WUGraphInfo request = new WUGraphInfo();
			request.setWuid(workunit.getWuid());
			request.setName(info.getName());

			try {
				WUGraphInfoResponse response = service.WUGraphInfo(request);
				ECLGraph newInfo = info;
				newInfo.setRunning(response.getRunning());
				Update(newInfo);
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyObservers(Notification.GRAPH);
		*/
	}

	//  Updates  ---
	boolean Update(ECLGraph graph) {		
		boolean retVal = false;
		if (graph != null && info.getName().equals(graph.getName()) && !info.equals(graph)) {
			if (UpdateState(graph)) {
				retVal = true;
				notifyObservers(Notification.GRAPH);
			}
		}
		monitor();
		return retVal;
	}

	boolean UpdateState(ECLGraph graph) {
		if (info.getName().equals(graph.getName()) && 
				EqualsUtil.hasChanged(info, graph)) {
			info = graph;
			setChanged();
			return true;
		}
		return false;
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( (Object)this == aThat ) 
			return true;

		if ( !(aThat instanceof Graph) ) 
			return false;
		Graph that = (Graph)aThat;

		//now a proper field-by-field evaluation can be made
		return 	EqualsUtil.areEqual(this.workunit, that.workunit) &&
				EqualsUtil.areEqual(this.info.getName(), that.info.getName());
	}

	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, workunit);
		result = HashCodeUtil.hash(result, info.getName());
		return result;
	}
}
