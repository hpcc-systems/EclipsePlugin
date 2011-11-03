package org.hpccsystems.internal.data;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import org.hpccsystems.ws.wstopology.TpTargetCluster;
import org.hpccsystems.ws.wstopology.TpTargetClusterQueryRequest;
import org.hpccsystems.ws.wstopology.TpTargetClusterQueryResponse;
import org.hpccsystems.ws.wstopology.WsTopologyServiceSoap;
import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLResult;
import org.hpccsystems.ws.wsworkunits.ECLSourceFile;
import org.hpccsystems.ws.wsworkunits.ECLWorkunit;
import org.hpccsystems.ws.wsworkunits.WUInfo;
import org.hpccsystems.ws.wsworkunits.WUInfoResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;


public class Workunit extends Observable {
	Data data;
	Platform platform;
	private Map<Integer, Result> Results;
	public ECLWorkunit info;

	
	Workunit(Data data, Platform platform, String wuid) {
		this.data = data;
		this.platform = platform;
		this.Results = new HashMap<Integer, Result>(); 		
		info = new ECLWorkunit();
		info.setWuid(wuid);
		setChanged();
	}
	
	public void Refresh() {
		WsWorkunitsServiceSoap service = platform.GetWsWorkunitsService();
		if (service != null) {
			WUInfo request = new WUInfo();
			request.setWuid(info.getWuid());
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
	}
	
	public synchronized Result GetResult(Integer sequence) {
		Result result = new Result(data, this, sequence);
		if (Results.containsKey(result.hashCode())) {
			return Results.get(result.hashCode());
		}
		else {
			Results.put(result.hashCode(), result);
		}
		return result;
	}

	public synchronized Result GetResult(ECLResult r) {
		Result result = GetResult(r.getSequence());
		result.Update(r);
		return result;
	}
	
	public synchronized Collection<Result> GetResults() {
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
		return retVal;
	}
	
	public synchronized Collection<LogicalFile> GetLogicalFiles() {
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
		return retVal;
	}
	
	void Update(final ECLWorkunit wu) {
		if (info.getWuid().equals(wu.getWuid())) {
			info = wu;
			setChanged();
			notifyObservers(wu.getState());

			if (wu.getStateID() != 3 && wu.getStateID() != 4 && wu.getStateID() != 7) { 
				Runnable monitor = new Runnable() {
					public void run() {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Refresh();
						return;
					}
				};
				Thread threadMonitor = new Thread(monitor, "Monitor:  " + wu.getWuid());
				threadMonitor.start();
			}
		}
	}

	void UpdateResults(ECLWorkunit wu) {
		if (info.getWuid().equals(wu.getWuid())) {
			info.setResultCount(wu.getResultCount());
			info.setResultLimit(wu.getResultLimit());
			info.setResults(wu.getResults());
			info.setResultsDesc(wu.getResultsDesc());
			setChanged();
			notifyObservers(null);
		}
	}

	void UpdateSourceFiles(ECLWorkunit wu) {
		if (info.getWuid().equals(wu.getWuid())) {
			info.setSourceFileCount(wu.getSourceFileCount());
			info.setSourceFilesDesc(wu.getSourceFilesDesc());
			info.setSourceFiles(wu.getSourceFiles());
			setChanged();
			notifyObservers(null);
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
