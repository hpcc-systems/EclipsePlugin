/*##############################################################################

    Copyright (C) 2011 HPCC Systems.

    All rights reserved. This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

package org.hpccsystems.internal.data;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLGraph;
import org.hpccsystems.ws.wsworkunits.ECLResult;
import org.hpccsystems.ws.wsworkunits.ECLSourceFile;
import org.hpccsystems.ws.wsworkunits.ECLWorkunit;
import org.hpccsystems.ws.wsworkunits.WUInfo;
import org.hpccsystems.ws.wsworkunits.WUInfoResponse;
import org.hpccsystems.ws.wsworkunits.WUQuery;
import org.hpccsystems.ws.wsworkunits.WUQueryResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;

public class Workunit extends DataSingleton {
	private static Map<Integer, Workunit> Workunits = new HashMap<Integer, Workunit>();
	public static synchronized Workunit get(Platform platform, String wuid) {
		if (wuid == null || wuid.isEmpty())
			return null;
		Workunit workunit = new Workunit(platform, wuid);
		if (Workunits.containsKey(workunit.hashCode())) {
			return Workunits.get(workunit.hashCode());
		}
		else {
			Workunits.put(workunit.hashCode(), workunit);
		}
		return workunit;
	}
	
	private Platform platform;

	private ECLWorkunit info;
	private String[] resultViews; 
	private Collection<Result> results;	
	private Collection<Graph> graphs;
	private Collection<LogicalFile> sourceFiles;

	public enum Notification {
		WORKUNIT,
		RESULTS,
		GRAPHS,
		SOURCEFILES
	}

	private Workunit(Platform platform, String wuid) {
		this.platform = platform;
		info = new ECLWorkunit();
		info.setWuid(wuid); 		
		this.results = new ArrayList<Result>(); 		
		this.graphs = new ArrayList<Graph>(); 		
		this.sourceFiles = new ArrayList<LogicalFile>(); 		
		setChanged();
	}
	
	public String getWuid() {
		return info.getWuid();
	}

	/*
	WUStateUnknown = 0,
	WUStateCompiled,1
	WUStateRunning,2
	WUStateCompleted,3
	WUStateFailed,4
	WUStateArchived,5
	WUStateAborting,6
	WUStateAborted,7
	WUStateBlocked,8
	WUStateSubmitted,9
	WUStateScheduled,0
	WUStateCompiling,1
	WUStateWait,2
	WUStateWaitingForUpload,3
	WUStateDebugPaused,4
	WUStateDebugRunning,5
	WUStateSize	//Don't forget to update the string table below..
	 */

	public State getStateID() {
		if (info.getStateID() != null) {
			switch (info.getStateID()){
			case 1:		return State.COMPILED;
			case 2:		return State.RUNNING;
			case 3:		return State.COMPLETED;
			case 4:		return State.FAILED;
			case 5:		return State.ARCHIVED;
			case 6:		return State.ABORTING;
			case 7:		return State.ABORTED;
			case 8:		return State.BLOCKED;
			case 9:		return State.SUBMITTED;
			case 10:	return State.SCHEDULED;
			case 11:	return State.COMPILING;
			case 12:	return State.WAIT;
			case 13:	return State.WAIT;
			case 14:	return State.WAIT;
			case 15:	return State.RUNNING;
			}
		}
		return State.UNKNOWN;
	}

	public String getState() {
		if (info.getState() == null)
			fastRefresh();
		return info.getState() != null ? info.getState() : "Unknown";

	}
	
	public String[] getResultViews() {
		if (resultViews == null)
			fullRefresh(false, true, false);
		return resultViews;
	}

	@Override
	public boolean isComplete() {
		return StateHelper.isCompleted(getStateID());
	}

	@Override
	void fastRefresh() {
		State previousState = getStateID();
		WsWorkunitsServiceSoap service = platform.getWsWorkunitsService();
		if (service != null) {
			WUQuery request = new WUQuery();
			request.setWuid(info.getWuid());
			request.setCount(1);
			try {
				WUQueryResponse response = service.WUQuery(request);
				if (response.getWorkunits() != null && response.getWorkunits().length == 1)
					update(response.getWorkunits()[0]);		
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (previousState != getStateID())
			fullRefresh();
	}

	@Override
	void fullRefresh() {
		fullRefresh(true, true, true);
	}

	void fullRefresh(boolean includeGraphs, boolean includeResults, boolean includeSourceFiles) {
		WsWorkunitsServiceSoap service = platform.getWsWorkunitsService();
		if (service != null) {
			WUInfo request = new WUInfo();
			request.setWuid(info.getWuid());
			request.setIncludeGraphs(includeGraphs);
			request.setIncludeResults(includeResults);
			request.setIncludeResultsViewNames(includeResults);
			request.setIncludeSourceFiles(includeSourceFiles);
			/*
			request.setIncludeApplicationValues(true);
			request.setIncludeDebugValues(true);
			request.setIncludeExceptions(true);
			request.setIncludeResultsViewNames(true);
			request.setIncludeTimers(true);
			request.setIncludeVariables(true);
			request.setIncludeWorkflows(true);
			 */
			try {
				WUInfoResponse respsone = service.WUInfo(request);
				update(respsone.getWorkunit());
				if (respsone.getResultViews() != null)
					resultViews = respsone.getResultViews(); 
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//  Results  ---
	public synchronized Result getResult(Integer sequence) {
		return Result.get(this, sequence);
	}

	public Result getResult(ECLResult r) {
		Result result = getResult(r.getSequence());
		result.Update(r);
		return result;
	}

	public Collection<Result> getResults() {
		fullRefresh(false, true, false);
		return results;
	}

	//  Graphs  ---
	synchronized Graph getGraph(String name) {
		return Graph.get(this, name);
	}

	Graph getGraph(ECLGraph g) {
		Graph graph = getGraph(g.getName());
		graph.Update(g);
		return graph;
	}

	public Collection<Graph> getGraphs() {
		fullRefresh(true, false, false);
		return graphs;
	}

	//  Source Files  ---
	synchronized LogicalFile getSourceFile(String name) {
		return LogicalFile.get(platform, name);
	}

	LogicalFile getSourceFile(ECLSourceFile sf) {
		LogicalFile sourceFile = getSourceFile(sf.getName());
		sourceFile.Update(sf);
		return sourceFile;
	}

	public Collection<LogicalFile> getSourceFiles() {
		fullRefresh(false, false, true);
		return sourceFiles;
	}

	//  Updates  ---
	boolean update(ECLWorkunit wu) {		
		boolean retVal = false;
		if (wu != null && info.getWuid().equals(wu.getWuid()) && !info.equals(wu)) {
			if (updateState(wu)) {
				retVal = true;
				notifyObservers(Notification.WORKUNIT);
			}
			if (updateResults(wu.getResults())) {
				retVal = true;
				notifyObservers(Notification.RESULTS);
			}
			if (updateGraphs(wu.getGraphs())) {
				retVal = true;
				notifyObservers(Notification.GRAPHS);
			}
			if (updateSourceFiles(wu.getSourceFiles())) {
				retVal = true;
				notifyObservers(Notification.SOURCEFILES);
			}
		}
		monitor();
		return retVal;
	}

	synchronized boolean updateState(ECLWorkunit wu) {
		if (wu != null && info.getWuid().equals(wu.getWuid()) && 
				EqualsUtil.hasChanged(info.getStateID(), wu.getStateID())) {
			info.setStateID(wu.getStateID());
			info.setStateEx(wu.getStateEx());
			info.setState(wu.getState());
			setChanged();
			return true;
		}
		return false;
	}

	synchronized boolean updateResults(ECLResult[] rawResults) {
		if (rawResults != null) {
			int resultCount = results.size();
			//  Prime results;
			results.clear();
			for(ECLResult r : rawResults) {
				results.add(getResult(r)); 	//  Will mark changed if needed  ---
			}
			if (resultCount != results.size()) {
				setChanged();
				return true;
			}
		}
		return false;
	}

	synchronized boolean updateGraphs(ECLGraph[] rawGraphs) {
		if (rawGraphs != null) {
			int graphCount = graphs.size();
			//  Prime graphs;
			graphs.clear();
			for(ECLGraph g : rawGraphs) {
				graphs.add(getGraph(g));	//  Will mark changed if needed  ---
			}
			if (graphCount != graphs.size()) {
				setChanged();
				return true;
			}
		}
		return false;
	}

	synchronized boolean updateSourceFiles(ECLSourceFile[] rawSourceFiles) {
		if (rawSourceFiles != null) {
			int sourceFileCount = sourceFiles.size();
			//  Prime graphs;
			sourceFiles.clear();
			for(ECLSourceFile g : rawSourceFiles) {
				sourceFiles.add(getSourceFile(g));	//  Will mark changed if needed  ---
			}
			if (sourceFileCount != sourceFiles.size()) {
				setChanged();
				return true;
			}
		}
		return false;
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( (Object)this == aThat ) 
			return true;

		if ( !(aThat instanceof Workunit) ) 
			return false;
		Workunit that = (Workunit)aThat;

		//now a proper field-by-field evaluation can be made
		return EqualsUtil.areEqual(this.platform, that.platform) &&
				EqualsUtil.areEqual(this.info.getWuid(), that.info.getWuid());
	}

	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, platform);
		result = HashCodeUtil.hash(result, info.getWuid());
		return result;
	}
}

