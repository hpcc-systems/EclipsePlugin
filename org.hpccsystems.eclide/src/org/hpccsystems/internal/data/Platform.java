package org.hpccsystems.internal.data;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.internal.Eclipse;
import org.hpccsystems.ws.filespray.DFUWorkunit;
import org.hpccsystems.ws.filespray.FileSprayLocator;
import org.hpccsystems.ws.filespray.FileSprayServiceSoap;
import org.hpccsystems.ws.filespray.GetDFUWorkunits;
import org.hpccsystems.ws.filespray.GetDFUWorkunitsResponse;
import org.hpccsystems.ws.wsdfu.DFULogicalFile;
import org.hpccsystems.ws.wsdfu.DFUQueryRequest;
import org.hpccsystems.ws.wsdfu.DFUQueryResponse;
import org.hpccsystems.ws.wsdfu.WsDfuLocator;
import org.hpccsystems.ws.wsdfu.WsDfuServiceSoap;
import org.hpccsystems.ws.wstopology.TpTargetCluster;
import org.hpccsystems.ws.wstopology.TpTargetClusterQueryRequest;
import org.hpccsystems.ws.wstopology.TpTargetClusterQueryResponse;
import org.hpccsystems.ws.wstopology.WsTopologyLocator;
import org.hpccsystems.ws.wstopology.WsTopologyServiceSoap;
import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLSourceFile;
import org.hpccsystems.ws.wsworkunits.ECLWorkunit;
import org.hpccsystems.ws.wsworkunits.WUQuery;
import org.hpccsystems.ws.wsworkunits.WUQueryResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsLocator;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;



public class Platform extends Observable {
	public static final String P_IP = "ipLaunchConfig";

	public static final String P_USER = "userLaunchConfig";
	public static final String P_PASSWORD = "passwordLaunchConfig";

	Data data;
	//public String name; 
	public String ip; 
	public String user; 
	public String password;

	private Map<Integer, Workunit> Workunits;
	private Map<Integer, FileSprayWorkunit> FileSprayWorkunits;
	private Map<Integer, LogicalFile> LogicalFiles;
	private Map<Integer, Cluster> Clusters;

	Platform(Data data, ILaunchConfiguration launchConfiguration) {
		this.data = data;
		Workunits = new HashMap<Integer, Workunit>(); 
		FileSprayWorkunits = new HashMap<Integer, FileSprayWorkunit>(); 
		LogicalFiles = new HashMap<Integer, LogicalFile>();
		Clusters = new HashMap<Integer, Cluster>();

		//name = launchConfiguration.getName();

		try {
			ip = launchConfiguration.getAttribute(P_IP, "");
		} catch (CoreException e) {
		} 
		try {
			user = launchConfiguration.getAttribute(P_USER, "");
		} catch (CoreException e) {
		} 
		try {
			password = launchConfiguration.getAttribute(P_PASSWORD, "");
		} catch (CoreException e) {
		}
		setChanged();
	}

	public Workunit Submit(IFile file, String cluster) {
		Eclipse.doSaveDirty(file.getProject());
		ECLCompiler compiler = new ECLCompiler(file.getProject());
		String wuid = compiler.buildAndRun(file, ip, cluster, user, password);
		if (wuid.isEmpty())
			return null;

		Workunit retVal = GetWorkunit(wuid);
		notifyObservers("Submit");
		return retVal;
	}

	//  Workunit  ---
	public synchronized Workunit GetWorkunit(String wuid) {
		if (wuid == null || wuid.isEmpty())
			return null;
		Workunit workunit = new Workunit(data, this, wuid);
		if (Workunits.containsKey(workunit.hashCode())) {
			return Workunits.get(workunit.hashCode());
		}
		else {
			Workunits.put(workunit.hashCode(), workunit);
		}
		setChanged();
		return workunit;
	}

	public Workunit GetWorkunit(ECLWorkunit wu) {
		Workunit workunit = GetWorkunit(wu.getWuid());
		workunit.Update(wu);
		return workunit;
	}

	public Collection<Workunit> GetWorkunits(String cluster, String startDate, String endDate) {
		Date fromDate = new Date();
		Date toDate = new Date();
		
		Collection<Workunit> retVal = new ArrayList<Workunit>();
		WsWorkunitsServiceSoap service = GetWsWorkunitsService();
		WUQuery request = new WUQuery();
		request.setCluster(cluster);
		request.setStartDate(startDate);
		request.setEndDate(startDate);
		try {
			WUQueryResponse response = service.WUQuery(request);
			if (response.getWorkunits() != null) {
				for(ECLWorkunit wu : response.getWorkunits()) {
					retVal.add(GetWorkunit(wu));
				}
			}
		} catch (ArrayOfEspException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyObservers("GetWorkunits");
		return retVal;
	}

	public Collection<Workunit> GetWorkunits(String cluster) {
		return GetWorkunits(cluster, "", "");
	}

	public Collection<Workunit> GetWorkunits() {
		return GetWorkunits("", "", "");
	}

	//  FileSPrayWorkunit  ---
	public synchronized FileSprayWorkunit GetFileSprayWorkunit(String id) {
		FileSprayWorkunit workunit = new FileSprayWorkunit(data, this, id);
		if (FileSprayWorkunits.containsKey(workunit.hashCode())) {
			return FileSprayWorkunits.get(workunit.hashCode());
		}
		else {
			FileSprayWorkunits.put(workunit.hashCode(), workunit);
		}
		setChanged();
		return workunit;
	}

	public FileSprayWorkunit GetFileSprayWorkunit(DFUWorkunit wu) {
		FileSprayWorkunit workunit = GetFileSprayWorkunit(wu.getID());
		workunit.Update(wu);
		return workunit;
	}

	public Collection<FileSprayWorkunit> GetFileSprayWorkunits(String cluster) {
		Collection<FileSprayWorkunit> retVal = new ArrayList<FileSprayWorkunit>();
		FileSprayServiceSoap service = GetFileSprayService();
		GetDFUWorkunits request = new GetDFUWorkunits();
		request.setCluster(cluster);
		try {
			GetDFUWorkunitsResponse response = service.getDFUWorkunits(request);
			if (response.getResults() != null) {
				for(DFUWorkunit wu : response.getResults()) {
					retVal.add(GetFileSprayWorkunit(wu));
				}
			}
		} catch (ArrayOfEspException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyObservers("GetFileSprayWorkunits");
		return retVal;
	}

	public Collection<FileSprayWorkunit> GetFileSprayWorkunits() {
		return GetFileSprayWorkunits("");
	}

	//  LogicalFile  ---
	public synchronized LogicalFile GetLogicalFile(String name) {
		LogicalFile logicalFile = new LogicalFile(data, this, name);
		if (LogicalFiles.containsKey(logicalFile.hashCode())) {
			return LogicalFiles.get(logicalFile.hashCode());
		}
		else {
			LogicalFiles.put(logicalFile.hashCode(), logicalFile);
		}
		setChanged();
		return logicalFile;
	}

	public LogicalFile GetLogicalFile(DFULogicalFile lf) {
		LogicalFile logicalFile = GetLogicalFile(lf.getName());
		logicalFile.Update(lf);
		return logicalFile;
	}

	public LogicalFile GetLogicalFile(ECLSourceFile sf) {
		LogicalFile logicalFile = GetLogicalFile(sf.getName());
		logicalFile.Update(sf);
		return logicalFile;
	}

	public Collection<LogicalFile> GetLogicalFiles(String cluster) {
		Collection<LogicalFile> retVal = new ArrayList<LogicalFile>();
		WsDfuServiceSoap service = GetWsDfuService();
		DFUQueryRequest request = new DFUQueryRequest();
		request.setClusterName(cluster);
		try {
			DFUQueryResponse response = service.DFUQuery(request);
			if (response.getDFULogicalFiles() != null) {
				for(DFULogicalFile logicalFile : response.getDFULogicalFiles()) {
					retVal.add(GetLogicalFile(logicalFile));
				}
			}
		} catch (ArrayOfEspException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyObservers("GetLogicalFiles");
		return retVal;
	}

	public Collection<LogicalFile> GetLogicalFiles() {
		return GetLogicalFiles("");
	}

	//  Cluster  ---
	public synchronized Cluster GetCluster(String name) {
		Cluster cluster = new Cluster(data, this, name);
		if (Clusters.containsKey(cluster.hashCode())) {
			return Clusters.get(cluster.hashCode());
		}
		else {
			Clusters.put(cluster.hashCode(), cluster);
		}
		setChanged();
		return cluster;
	}

	public Cluster GetCluster(TpTargetCluster tc) {
		Cluster cluster = GetCluster(tc.getName());
		cluster.Update(tc);
		return cluster;
	}

	public Collection<Cluster> GetClusters() {
		Collection<Cluster> retVal = new ArrayList<Cluster>();
		WsTopologyServiceSoap service = GetWsTopologyService();
		TpTargetClusterQueryRequest request = new TpTargetClusterQueryRequest();
		try {
			TpTargetClusterQueryResponse response = service.tpTargetClusterQuery(request);
			if (response.getTpTargetClusters() != null) {
				for(TpTargetCluster cluster : response.getTpTargetClusters()) {
					retVal.add(GetCluster(cluster));
				}
			}
		} catch (ArrayOfEspException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyObservers("GetClusters");
		return retVal;
	}

	public URL GetURL() throws MalformedURLException {
		return GetURL("");
	}

	public URL GetURL(String service) throws MalformedURLException {
		return new URL("http", ip, 8010, "/" + service);
	}

	public URL GetURL(String service, String method) throws MalformedURLException {
		return GetURL(service + "/" + method);
	}

	public URL GetURL(String service, String method, String params) throws MalformedURLException {
		return GetURL(service + "/" + method + "?" + params);
	}

	public WsWorkunitsServiceSoap GetWsWorkunitsService() {
		WsWorkunitsLocator locator = new WsWorkunitsLocator();
		try {
			WsWorkunitsServiceSoap service = locator.getWsWorkunitsServiceSoap(GetURL("WsWorkunits"));
			org.apache.axis.client.Stub stub = (org.apache.axis.client.Stub)service;
			stub.setUsername(user);
			stub.setPassword(password);
			return service;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}

	public WsDfuServiceSoap GetWsDfuService() {
		WsDfuLocator locator = new WsDfuLocator();
		try {
			WsDfuServiceSoap service = locator.getWsDfuServiceSoap(GetURL("WsDfu"));
			org.apache.axis.client.Stub stub = (org.apache.axis.client.Stub)service;
			stub.setUsername(user);
			stub.setPassword(password);
			return service;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}

	public FileSprayServiceSoap GetFileSprayService() {
		FileSprayLocator locator = new FileSprayLocator();
		try {
			FileSprayServiceSoap service = locator.getFileSprayServiceSoap(GetURL("FileSpray"));
			org.apache.axis.client.Stub stub = (org.apache.axis.client.Stub)service;
			stub.setUsername(user);
			stub.setPassword(password);
			return service;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}

	public WsTopologyServiceSoap GetWsTopologyService() {
		WsTopologyLocator locator = new WsTopologyLocator();
		try {
			WsTopologyServiceSoap service = locator.getWsTopologyServiceSoap(GetURL("WsTopology"));
			org.apache.axis.client.Stub stub = (org.apache.axis.client.Stub)service;
			stub.setUsername(user);
			stub.setPassword(password);
			return service;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( (Object)this == aThat ) 
			return true;

		if ( !(aThat instanceof Platform) ) 
			return false;
		Platform that = (Platform)aThat;

		//now a proper field-by-field evaluation can be made
		return EqualsUtil.areEqual(this.ip, that.ip);
	}

	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, ip);
		return result;
	}

	public String GetIP() {
		return ip;
	}
}
