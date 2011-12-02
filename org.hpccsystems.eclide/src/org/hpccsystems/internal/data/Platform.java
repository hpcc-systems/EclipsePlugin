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

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.hpccsystems.eclide.Activator;
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
import org.hpccsystems.ws.wsworkunits.ApplicationValue;
import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLSourceFile;
import org.hpccsystems.ws.wsworkunits.ECLWorkunit;
import org.hpccsystems.ws.wsworkunits.QuerySet;
import org.hpccsystems.ws.wsworkunits.WUCreateAndUpdate;
import org.hpccsystems.ws.wsworkunits.WUQuery;
import org.hpccsystems.ws.wsworkunits.WUQueryResponse;
import org.hpccsystems.ws.wsworkunits.WUQuerysets;
import org.hpccsystems.ws.wsworkunits.WUQuerysetsResponse;
import org.hpccsystems.ws.wsworkunits.WUSubmit;
import org.hpccsystems.ws.wsworkunits.WUSubmitResponse;
import org.hpccsystems.ws.wsworkunits.WUUpdateResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsLocator;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;

public class Platform extends DataSingleton {
	private static Map<Integer, Platform> Platforms = new HashMap<Integer, Platform>();
	public static synchronized Platform get(String ip) {
		Platform platform = new Platform(ip);
		if (Platforms.containsKey(platform.hashCode())) {
			return Platforms.get(platform.hashCode());
		}
		else {
			Platforms.put(platform.hashCode(), platform);
		}
		return platform;
	}

	public static final String P_ENABLED = "enabledConfig";
	public static final String P_IP = "ipLaunchConfig";
	public static final String P_USER = "userLaunchConfig";
	public static final String P_PASSWORD = "passwordLaunchConfig";
	public static final String P_CLUSTER = "clusterLaunchConfig";
	
	private String name;
	private boolean isEnabled;
	private String ip;
	private String user;
	private String password;
	private Collection<Cluster> clusters;
	private Collection<Workunit> workunits;	
	private Collection<FileSprayWorkunit> fileSprayWorkunits;
	private Collection<DataQuerySet> dataQuerySets;
	private Collection<LogicalFile> logicalFiles;

	Platform(String ip) {
		this.ip = ip;
		this.isEnabled = false;
		this.name = "";
		this.user = "";
		this.password = "";
		this.clusters = new HashSet<Cluster>();
		this.workunits = new HashSet<Workunit>();	
		this.fileSprayWorkunits = new HashSet<FileSprayWorkunit>();
		this.dataQuerySets = new HashSet<DataQuerySet>();
		this.logicalFiles = new HashSet<LogicalFile>();
		setChanged();
	}
	
	public void update(ILaunchConfiguration launchConfiguration) {
		name = launchConfiguration.getName();
		try {
			isEnabled = launchConfiguration.getAttribute(P_ENABLED, false);
		} catch (CoreException e) {
		} 
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
	}

	void confirmDisable() {
		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
		    public void run() {
			    Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	            if (MessageDialog.openConfirm(activeShell, "ECL Plug-in", "\"" + name + "\" is Unreachable.  Disable for current session?")) {
            		isEnabled = false;
	            }
			}
		});
	}
	
	public boolean isEnabled() {
		return isEnabled;
	}

	public String getIP() {
		return ip;
	}

	public String getUser() {
		return user;
	}
	
	public String getPassword() {
		return password;
	}
	
/*
 enum WUAction
{
    WUActionUnknown = 0,
    WUActionCompile = 1,
    WUActionCheck = 2,
    WUActionRun = 3,
    WUActionExecuteExisting = 4,
    WUActionPause = 5, 
    WUActionPauseNow = 6, 
    WUActionResume = 7, 
    WUActionSize = 8
};
*/	
	public Workunit submit(IFile file, String cluster) {
		if (isEnabled()) {
			CollectionMonitor monitor = new CollectionMonitor("submit", workunits);
			Eclipse.doSaveDirty(file.getProject());
			ECLCompiler compiler = new ECLCompiler(file.getProject());
			String archive = compiler.getArchive(file);
			
			WsWorkunitsServiceSoap service = getWsWorkunitsService();
			WUCreateAndUpdate request = new WUCreateAndUpdate();
			request.setQueryText(archive);
			request.setJobname(file.getFullPath().removeFileExtension().lastSegment());
			ApplicationValue[] appVals = new ApplicationValue[1];
			appVals[0] = new ApplicationValue();
			appVals[0].setApplication(Activator.PLUGIN_ID);
			appVals[0].setName("path");
			appVals[0].setValue(file.getFullPath().toPortableString());
			request.setApplicationValues(appVals);
			try {
				WUUpdateResponse response = service.WUCreateAndUpdate(request);
				response.getWorkunit().setCluster(cluster);	//  WUSubmit does not return an updated ECLWorkunit, so set cluster here...  
				Workunit wu = getWorkunit(response.getWorkunit());
				if (wu != null) {
					workunits.add(wu);
					setChanged();
					notifyObservers(monitor.calcChanges(workunits));

					WUSubmit submitRequest = new WUSubmit();
					submitRequest.setWuid(response.getWorkunit().getWuid());
					submitRequest.setCluster(cluster);
					WUSubmitResponse submitResponse = service.WUSubmit(submitRequest);
				}
				return wu;
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	boolean isComplete() {
		return true;
	}

	@Override
	void fastRefresh() {
	}

	@Override
	void fullRefresh() {
	}

	//  Workunit  ---
	public Workunit getWorkunit(String wuid) {
		return Workunit.get(this, wuid);
	}

	public Workunit getWorkunit(ECLWorkunit wu) {
		Workunit workunit = getWorkunit(wu.getWuid());
		workunit.update(wu);
		return workunit;
	}

	private Workunit[] getWorkunits(String cluster, String startDate, String endDate) {
		if (isEnabled()) {
			CollectionMonitor monitor = new CollectionMonitor("getWorkunits", workunits);
			WsWorkunitsServiceSoap service = getWsWorkunitsService();
			WUQuery request = new WUQuery();
			request.setCluster(cluster);
			request.setStartDate(startDate);
			request.setEndDate(startDate);
			try {
				WUQueryResponse response = service.WUQuery(request);
				updateWorkunits(response.getWorkunits());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				confirmDisable();
				e.printStackTrace();
			}
			notifyObservers(monitor.calcChanges(workunits));
		}
		return workunits.toArray(new Workunit[0]);
	}

	private Workunit[] getWorkunits(String cluster) {
		return getWorkunits(cluster, "", "");
	}

	public Workunit[] getWorkunits() {
		return getWorkunits("", "", "");
	}
	
	synchronized boolean updateWorkunits(ECLWorkunit[] rawWorkunits) {
		int beforeCount = workunits.size();
		workunits.clear();
		if (rawWorkunits != null) {
			for(ECLWorkunit wu : rawWorkunits) {
				workunits.add(getWorkunit(wu)); 	//  Will mark changed if needed  ---
			}
		}
		if (beforeCount != workunits.size()) {
			setChanged();
			return true;
		}		
		return false;
	}

	//  FileSPrayWorkunit  ---
	public FileSprayWorkunit getFileSprayWorkunit(String id) {
		return FileSprayWorkunit.get(this, id);
	}

	public FileSprayWorkunit getFileSprayWorkunit(DFUWorkunit wu) {
		FileSprayWorkunit workunit = getFileSprayWorkunit(wu.getID());
		workunit.Update(wu);
		return workunit;
	}

	public FileSprayWorkunit[] getFileSprayWorkunits(String cluster) {
		if (isEnabled()) {
			CollectionMonitor monitor = new CollectionMonitor("getFileSprayWorkunits", fileSprayWorkunits);
			FileSprayServiceSoap service = getFileSprayService();
			GetDFUWorkunits request = new GetDFUWorkunits();
			request.setCluster(cluster);
			try {
				GetDFUWorkunitsResponse response = service.getDFUWorkunits(request);
				updateFileSprayWorkunits(response.getResults());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notifyObservers(monitor.calcChanges(fileSprayWorkunits));
		}
		return fileSprayWorkunits.toArray(new FileSprayWorkunit[0]);
	}

	public FileSprayWorkunit[] getFileSprayWorkunits() {
		return getFileSprayWorkunits("");
	}

	synchronized boolean updateFileSprayWorkunits(DFUWorkunit[] rawWorkunits) {
		int beforeCount = fileSprayWorkunits.size();
		fileSprayWorkunits.clear();
		if (rawWorkunits != null) {
			for(DFUWorkunit wu : rawWorkunits) {
				fileSprayWorkunits.add(getFileSprayWorkunit(wu)); 	//  Will mark changed if needed  ---
			}
		}
		if (beforeCount != fileSprayWorkunits.size()) {
			setChanged();
			return true;
		}		
		return false;
	}

	//  LogicalFile  ---
	public DataQuerySet getDataQuerySet(String name) {
		return DataQuerySet.get(this, name);
	}

	public DataQuerySet getDataQuerySet(QuerySet qs) {
		DataQuerySet dataQuerySet = getDataQuerySet(qs.getQuerySetName());
		dataQuerySet.Update(qs);
		return dataQuerySet;
	}

	public DataQuerySet[] getDataQuerySets() {
		if (isEnabled()) {
			CollectionMonitor monitor = new CollectionMonitor("getDataQuerySets", dataQuerySets);
			WsWorkunitsServiceSoap service = getWsWorkunitsService();
			WUQuerysets request = new WUQuerysets();
			try {
				WUQuerysetsResponse response = service.WUQuerysets(request);
				updateDataQuerySets(response.getQuerysets());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notifyObservers(monitor.calcChanges(dataQuerySets));
		}
		return dataQuerySets.toArray(new DataQuerySet[0]);
	}

	synchronized boolean updateDataQuerySets(QuerySet[] rawQuerySets) {
		int beforeCount = dataQuerySets.size();
		dataQuerySets.clear();
		if (rawQuerySets != null) {
			for(QuerySet qs : rawQuerySets) {
				dataQuerySets.add(getDataQuerySet(qs)); 	//  Will mark changed if needed  ---
			}
		}
		if (beforeCount != dataQuerySets.size()) {
			setChanged();
			return true;
		}		
		return false;
	}

	//  LogicalFile  ---
	public LogicalFile getLogicalFile(String name) {
		return LogicalFile.get(this, name);
	}

	public LogicalFile getLogicalFile(DFULogicalFile lf) {
		LogicalFile logicalFile = getLogicalFile(lf.getName());
		logicalFile.Update(lf);
		return logicalFile;
	}

	public LogicalFile getLogicalFile(ECLSourceFile sf) {
		LogicalFile logicalFile = getLogicalFile(sf.getName());
		logicalFile.Update(sf);
		return logicalFile;
	}

	public LogicalFile[] getLogicalFiles(String cluster) {
		if (isEnabled()) {
			CollectionMonitor monitor = new CollectionMonitor("getLogicalFiles", logicalFiles);
			WsDfuServiceSoap service = getWsDfuService();
			DFUQueryRequest request = new DFUQueryRequest();
			request.setClusterName(cluster);
			try {
				DFUQueryResponse response = service.DFUQuery(request);
				updateLogicalFiles(response.getDFULogicalFiles());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notifyObservers(monitor.calcChanges(logicalFiles));
		}
		return logicalFiles.toArray(new LogicalFile[0]);
	}

	public LogicalFile[] getLogicalFiles() {
		return getLogicalFiles("");
	}
	
	synchronized boolean updateLogicalFiles(DFULogicalFile[] rawLogicalFiles) {
		int beforeCount = logicalFiles.size();
		logicalFiles.clear();
		if (rawLogicalFiles != null) {
			for(DFULogicalFile lf : rawLogicalFiles) {
				logicalFiles.add(getLogicalFile(lf)); 	//  Will mark changed if needed  ---
			}
		}
		if (beforeCount != logicalFiles.size()) {
			setChanged();
			return true;
		}		
		return false;
	}

	//  Cluster  ---
	public Cluster getCluster(String name) {
		return Cluster.get(this, name);
	}

	public Cluster getCluster(TpTargetCluster tc) {
		Cluster cluster = getCluster(tc.getName());
		cluster.Update(tc);
		return cluster;
	}

	public Cluster[] getClusters() {
		if (isEnabled()) {
			CollectionMonitor monitor = new CollectionMonitor("getClusters", clusters);
			WsTopologyServiceSoap service = getWsTopologyService();
			TpTargetClusterQueryRequest request = new TpTargetClusterQueryRequest();
			try {
				TpTargetClusterQueryResponse response = service.tpTargetClusterQuery(request);
				updateClusters(response.getTpTargetClusters());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notifyObservers(monitor.calcChanges(clusters));
		}
		return clusters.toArray(new Cluster[0]);
	}

	synchronized boolean updateClusters(TpTargetCluster[] rawCluster) {
		int beforeCount = clusters.size();
		clusters.clear();
		if (rawCluster != null) {
			for(TpTargetCluster c : rawCluster) {
				clusters.add(getCluster(c)); 	//  Will mark changed if needed  ---
			}
		}
		if (beforeCount != clusters.size()) {
			setChanged();
			return true;
		}		
		return false;
	}

	//  SOAP Stub Helpers  ---
	public URL getURL() throws MalformedURLException {
		return getURL("");
	}

	public URL getURL(String service) throws MalformedURLException {
		return new URL("http", getIP(), 8010, "/" + service);
	}

	public URL getURL(String service, String method) throws MalformedURLException {
		return getURL(service + "/" + method);
	}

	public URL getURL(String service, String method, String params) throws MalformedURLException {
		return getURL(service + "/" + method + "?" + params);
	}
	
	void initStub(org.apache.axis.client.Stub stub) {
		stub.setUsername(getUser());
		stub.setPassword(getPassword());
	}

	public WsWorkunitsServiceSoap getWsWorkunitsService() {
		WsWorkunitsLocator locator = new WsWorkunitsLocator();
		try {
			WsWorkunitsServiceSoap service = locator.getWsWorkunitsServiceSoap(getURL("WsWorkunits"));
			initStub((org.apache.axis.client.Stub)service);
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

	public WsDfuServiceSoap getWsDfuService() {
		WsDfuLocator locator = new WsDfuLocator();
		try {
			WsDfuServiceSoap service = locator.getWsDfuServiceSoap(getURL("WsDfu"));
			initStub((org.apache.axis.client.Stub)service);
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

	public FileSprayServiceSoap getFileSprayService() {
		FileSprayLocator locator = new FileSprayLocator();
		try {
			FileSprayServiceSoap service = locator.getFileSprayServiceSoap(getURL("FileSpray"));
			initStub((org.apache.axis.client.Stub)service);
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

	public WsTopologyServiceSoap getWsTopologyService() {
		WsTopologyLocator locator = new WsTopologyLocator();
		try {
			WsTopologyServiceSoap service = locator.getWsTopologyServiceSoap(getURL("WsTopology"));
			initStub((org.apache.axis.client.Stub)service);
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
		if ( this == aThat ) 
			return true;

		if ( !(aThat instanceof Platform) ) 
			return false;
		Platform that = (Platform)aThat;

		//now a proper field-by-field evaluation can be made
		return EqualsUtil.areEqual(this.getIP(), that.getIP());
	}

	@Override
	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, getIP());
		return result;
	}
}
