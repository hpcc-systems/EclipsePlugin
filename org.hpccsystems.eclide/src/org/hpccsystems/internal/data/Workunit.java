package org.hpccsystems.internal.data;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLGraph;
import org.hpccsystems.ws.wsworkunits.ECLResult;
import org.hpccsystems.ws.wsworkunits.ECLSourceFile;
import org.hpccsystems.ws.wsworkunits.ECLWorkunit;
import org.hpccsystems.ws.wsworkunits.WUInfo;
import org.hpccsystems.ws.wsworkunits.WUInfoResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;

public class Workunit extends Observable {
	static final public String NOTIFY_RESULTS = "NotifyResults";
	static final public String NOTIFY_GRAPHS = "NotifyGraphs";
	static final public String NOTIFY_STATE = "NotifyState";
	Data data;
	Platform platform;
	private Map<Integer, Result> Results;
	private Map<Integer, Graph> Graphs;
	public ECLWorkunit info;

	
	Workunit(Data data, Platform platform, String wuid) {
		this.data = data;
		this.platform = platform;
		this.Results = new HashMap<Integer, Result>(); 		
		this.Graphs = new HashMap<Integer, Graph>(); 		
		info = new ECLWorkunit();
		info.setWuid(wuid);
		setChanged();
	}

	//  Results  ---
	public synchronized Result GetResult(Integer sequence) {
		Result result = new Result(data, this, sequence);
		if (Results.containsKey(result.hashCode())) {
			return Results.get(result.hashCode());
		}
		else {
			Results.put(result.hashCode(), result);
		}
		setChanged();
		return result;
	}

	public Result GetResult(ECLResult r) {
		Result result = GetResult(r.getSequence());
		result.Update(r);
		return result;
	}
	
	public Collection<Result> GetResults() {
		Collection<Result> retVal = new ArrayList<Result>();
		WsWorkunitsServiceSoap service = platform.GetWsWorkunitsService();
		if (service != null) {
			WUInfo request = new WUInfo();
			request.setWuid(info.getWuid());
			request.setIncludeResults(true);
			try {
				WUInfoResponse respsone = service.WUInfo(request);
				UpdateResults(respsone.getWorkunit());
				for(ECLResult r : info.getResults()) {
					retVal.add(GetResult(r));
				}
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyObservers(NOTIFY_RESULTS);
		return retVal;
	}
	
	//  Results  ---
	public synchronized Graph GetGraph(String name) {
		Graph graph = new Graph(data, this, name);
		if (Graphs.containsKey(graph.hashCode())) {
			return Graphs.get(graph.hashCode());
		}
		else {
			Graphs.put(graph.hashCode(), graph);
		}
		setChanged();
		return graph;
	}

	public Graph GetGraph(ECLGraph g) {
		Graph graph = GetGraph(g.getName());
		graph.Update(g);
		return graph;
	}
	
	public Collection<Graph> GetGraphs() {
		Collection<Graph> retVal = new ArrayList<Graph>();
		WsWorkunitsServiceSoap service = platform.GetWsWorkunitsService();
		if (service != null) {
			WUInfo request = new WUInfo();
			request.setWuid(info.getWuid());
			request.setIncludeGraphs(true);
			try {
				WUInfoResponse respsone = service.WUInfo(request);
				UpdateGraphs(respsone.getWorkunit());
				for(ECLGraph g : info.getGraphs()) {
					retVal.add(GetGraph(g));
				}
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyObservers(NOTIFY_GRAPHS);
		return retVal;
	}
	
	//  Source Files  ---
	public Collection<LogicalFile> GetLogicalFiles() {
		Collection<LogicalFile> retVal = new ArrayList<LogicalFile>();
		WsWorkunitsServiceSoap service = platform.GetWsWorkunitsService();
		if (service != null) {
			WUInfo request = new WUInfo();
			request.setWuid(info.getWuid());
			request.setIncludeSourceFiles(true);
			try {
				WUInfoResponse respsone = service.WUInfo(request);
				UpdateSourceFiles(respsone.getWorkunit());
				if (info.getSourceFiles() != null) {
					for(ECLSourceFile sf : info.getSourceFiles()) {
						retVal.add(platform.GetLogicalFile(sf));
					}
				}
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyObservers("SourceFiles");
		return retVal;
	}
	
	//  General  ---
	public boolean isComplete() {
		switch (info.getStateID()) {
		case 3:
		case 4:
		case 7:
			return true;
		}
		return false;
	}

	public void Refresh() {
		WsWorkunitsServiceSoap service = platform.GetWsWorkunitsService();
		if (service != null) {
			WUInfo request = new WUInfo();
			request.setWuid(info.getWuid());
			/*
			request.setIncludeApplicationValues(true);
			request.setIncludeDebugValues(true);
			request.setIncludeExceptions(true);
			request.setIncludeGraphs(true);
			request.setIncludeResults(true);
			request.setIncludeResultsViewNames(true);
			request.setIncludeSourceFiles(true);
			request.setIncludeTimers(true);
			request.setIncludeVariables(true);
			request.setIncludeWorkflows(true);
			*/
			try {
				WUInfoResponse respsone = service.WUInfo(request);
				Update(respsone.getWorkunit());		
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyObservers(NOTIFY_STATE);
	}
	
	void Update(final ECLWorkunit wu) {
		if (info.getWuid().equals(wu.getWuid()) && !info.equals(wu)) {
			UpdateState(wu);
			UpdateResults(wu);
			UpdateGraphs(wu);
			UpdateSourceFiles(wu);
			setChanged();

			if (!isComplete()) { 
				Thread threadMonitor = new Thread(new Runnable() {
					public void run() {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						Refresh();
					}
				}, "WU Monitor:  " + wu.getWuid());
				threadMonitor.start();
			}
		}
	}
	
	boolean hasChanged(Object target, Object source) {
		if (source == null)
			return false;
		
		return !EqualsUtil.areEqual(target, source);		
	}
	
	boolean UpdateState(ECLWorkunit wu) {
		if (info.getWuid().equals(wu.getWuid()) && hasChanged(info.getStateID(), wu.getStateID())) {
			info.setStateID(wu.getStateID());
			info.setStateEx(wu.getStateEx());
			info.setState(wu.getState());
			setChanged();
			return true;
		}
		return false;
	}
	
	void UpdateResults(ECLWorkunit wu) {
		if (info.getWuid().equals(wu.getWuid()) && hasChanged(info.getResults(), wu.getResults())) {
			info.setResultCount(wu.getResultCount());
			info.setResultLimit(wu.getResultLimit());
			info.setResultsDesc(wu.getResultsDesc());
			info.setResults(wu.getResults());
			setChanged();
		}
	}

	void UpdateGraphs(ECLWorkunit wu) {
		if (info.getWuid().equals(wu.getWuid()) && hasChanged(info.getGraphs(), wu.getGraphs())) {
			info.setGraphCount(wu.getGraphCount());
			info.setGraphsDesc(wu.getGraphsDesc());
			info.setGraphs(wu.getGraphs());
			setChanged();
		}
	}

	void UpdateSourceFiles(ECLWorkunit wu) {
		if (info.getWuid().equals(wu.getWuid()) && hasChanged(info.getSourceFiles(), wu.getSourceFiles())) {
			info.setSourceFileCount(wu.getSourceFileCount());
			info.setSourceFilesDesc(wu.getSourceFilesDesc());
			info.setSourceFiles(wu.getSourceFiles());
			setChanged();
		}
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
