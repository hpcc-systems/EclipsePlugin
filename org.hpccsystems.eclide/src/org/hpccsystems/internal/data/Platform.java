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
import java.util.HashSet;

import javax.xml.rpc.ServiceException;

import org.eclipse.core.resources.IFile;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.hpccsystems.eclide.Activator;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.internal.ConfigurationPreferenceStore;
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
import org.hpccsystems.ws.wstopology.TpDropZone;
import org.hpccsystems.ws.wstopology.TpLogicalCluster;
import org.hpccsystems.ws.wstopology.TpLogicalClusterQueryRequest;
import org.hpccsystems.ws.wstopology.TpLogicalClusterQueryResponse;
import org.hpccsystems.ws.wstopology.TpServiceQueryRequest;
import org.hpccsystems.ws.wstopology.TpServiceQueryResponse;
import org.hpccsystems.ws.wstopology.TpServices;
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
	public static DataSingletonCollection All = new DataSingletonCollection();	
	public static Platform get(String ip, int port) {
		if (ip == null || ip.isEmpty()) {
			return null;
		}

		return (Platform)All.get(new Platform(ip, port));
	}
	public static Platform getNoCreate(String ip, int port) {
		if (ip == null || ip.isEmpty()) {
			return null;
		}

		return (Platform)All.getNoCreate(new Platform(ip, port));
	}

	public static final String P_DISABLED = "disabledConfig";
	public static final String P_IP = "ipLaunchConfig";
	public static final String P_PORT = "portLaunchConfig";
	public static final String P_USER = "userLaunchConfig";
	public static final String P_PASSWORD = "passwordLaunchConfig";
	public static final String P_CLUSTER = "clusterLaunchConfig";

	private ConfigurationPreferenceStore launchConfiguration;	
	private String name;
	private boolean isDisabled;
	private String ip;
	private int port;
	private Collection<Cluster> clusters;
	private Collection<DropZone> dropZones;
	private Collection<Workunit> workunits;	
	private Collection<FileSprayWorkunit> fileSprayWorkunits;
	private Collection<DataQuerySet> dataQuerySets;
	private Collection<LogicalFile> logicalFiles;

	static int LATENCY_TEST = 0;

	Platform(String ip, int port) {
		this.ip = ip;
		this.port = port;
		isDisabled = true;
		name = "";

		clusters = new HashSet<Cluster>();
		dropZones = new HashSet<DropZone>();
		workunits = new HashSet<Workunit>();	
		fileSprayWorkunits = new HashSet<FileSprayWorkunit>();
		dataQuerySets = new HashSet<DataQuerySet>();
		logicalFiles = new HashSet<LogicalFile>();
	}

	public void update(ILaunchConfiguration _launchConfiguration) {
		launchConfiguration = new ConfigurationPreferenceStore(_launchConfiguration);
		name = _launchConfiguration.getName();
		isDisabled = launchConfiguration.getAttribute(P_DISABLED, true);
		ip = launchConfiguration.getAttribute(P_IP, "");
		port = launchConfiguration.getAttribute(P_PORT, 8010);
	}

	synchronized void confirmDisable() {
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				if (!isDisabled) {
					Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
					if (MessageDialog.openConfirm(activeShell, "ECL Plug-in", "\"" + name + "\" is Unreachable.  Disable for current session?\n(Can be permanently disabled in the Launch Configuration)")) {
						isDisabled = true;
					}
				}
			}
		});
	}

	public boolean isDisabled() {
		return isDisabled;
	}

	public boolean isEnabled() {
		return !isDisabled;
	}

	public String getIP() {
		return ip;
	}

	public int getPort() {
		return port;
	}

	public String getUser() {
		return launchConfiguration.getAttribute(P_USER, "");
	}

	public String getPassword() {
		return launchConfiguration.getAttribute(P_PASSWORD, "");
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
	public Workunit submit(ILaunchConfiguration configuration, IFile file, String cluster) {
		if (isEnabled()) {
			ECLCompiler compiler = new ECLCompiler(new ConfigurationPreferenceStore(configuration), file.getProject());
			String archive = compiler.getArchive(file);
			if (!archive.isEmpty())
			{
				try {
					Workunit.All.pushTransaction("Platform.submit");
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

					int inlineResultLimit = launchConfiguration.getInt(ClientTools.P_INLINERESULTLIMIT);
					if (inlineResultLimit > 0) {
						request.setResultLimit(inlineResultLimit);
					}

					try {
						WUUpdateResponse response = service.WUCreateAndUpdate(request);
						response.getWorkunit().setCluster(cluster);	//  WUSubmit does not return an updated ECLWorkunit, so set cluster here...  
						Workunit wu = getWorkunit(response.getWorkunit());
						if (wu != null) {
							workunits.add(wu);

							WUSubmit submitRequest = new WUSubmit();
							submitRequest.setWuid(response.getWorkunit().getWuid());
							submitRequest.setCluster(cluster);
							service.WUSubmit(submitRequest);
						}
						return wu;
					} catch (ArrayOfEspException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} finally {
					Workunit.All.popTransaction();
				}
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

	Collection<Workunit> getWorkunits(String cluster, String startDate, String endDate) {
		if (isEnabled()) {
			Workunit.All.pushTransaction("platform.getWorkunits");
			WsWorkunitsServiceSoap service = getWsWorkunitsService();
			WUQuery request = new WUQuery();
			request.setCluster(cluster);
			request.setStartDate(startDate);
			request.setEndDate(startDate);
			request.setCount(100);
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
			Workunit.All.popTransaction();
		}
		return new HashSet<Workunit>(workunits);
	}

	public Collection<Workunit> getWorkunits(String cluster) {
		return getWorkunits(cluster, "", "");
	}

	public Collection<Workunit> getWorkunits() {
		return getWorkunits("", "", "");
	}

	synchronized void updateWorkunits(ECLWorkunit[] rawWorkunits) {
		workunits.clear();
		if (rawWorkunits != null) {
			for(ECLWorkunit wu : rawWorkunits) {
				if (!wu.getWuid().equalsIgnoreCase("global") && !wu.getWuid().equalsIgnoreCase("resultLimit"))
					workunits.add(getWorkunit(wu)); 	//  Will mark changed if needed  ---
			}
		}
	}

	//  FileSPrayWorkunit  ---
	public FileSprayWorkunit getFileSprayWorkunit(String id) {
		return FileSprayWorkunit.get(this, id);
	}

	public FileSprayWorkunit getFileSprayWorkunit(DFUWorkunit wu) {
		FileSprayWorkunit workunit = getFileSprayWorkunit(wu.getID());
		workunit.update(wu);
		return workunit;
	}

	public FileSprayWorkunit[] getFileSprayWorkunits(String cluster) {
		if (isEnabled()) {
			//TODO CollectionDelta monitor = new CollectionDelta("getFileSprayWorkunits", fileSprayWorkunits);
			FileSprayServiceSoap service = getFileSprayService();
			GetDFUWorkunits request = new GetDFUWorkunits();
			request.setPageSize(new Long(100));
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
			//TODO notifyObservers(monitor.calcChanges(fileSprayWorkunits));
		}
		return fileSprayWorkunits.toArray(new FileSprayWorkunit[0]);
	}

	public FileSprayWorkunit[] getFileSprayWorkunits() {
		return getFileSprayWorkunits("");
	}

	synchronized void updateFileSprayWorkunits(DFUWorkunit[] rawWorkunits) {
		fileSprayWorkunits.clear();
		if (rawWorkunits != null) {
			for(DFUWorkunit wu : rawWorkunits) {
				fileSprayWorkunits.add(getFileSprayWorkunit(wu)); 	//  Will mark changed if needed  ---
			}
		}
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
			//TODO CollectionDelta monitor = new CollectionDelta("getDataQuerySets", dataQuerySets);
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
			//TODO notifyObservers(monitor.calcChanges(dataQuerySets));
		}
		return dataQuerySets.toArray(new DataQuerySet[0]);
	}

	synchronized void updateDataQuerySets(QuerySet[] rawQuerySets) {
		dataQuerySets.clear();
		if (rawQuerySets != null) {
			for(QuerySet qs : rawQuerySets) {
				dataQuerySets.add(getDataQuerySet(qs)); 	//  Will mark changed if needed  ---
			}
		}
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
			//TODO CollectionDelta monitor = new CollectionDelta("getLogicalFiles", logicalFiles);
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
			//TODO notifyObservers(monitor.calcChanges(logicalFiles));
		}
		return logicalFiles.toArray(new LogicalFile[0]);
	}

	public LogicalFile[] getLogicalFiles() {
		return getLogicalFiles("");
	}

	synchronized void updateLogicalFiles(DFULogicalFile[] rawLogicalFiles) {
		logicalFiles.clear();
		if (rawLogicalFiles != null) {
			for(DFULogicalFile lf : rawLogicalFiles) {
				logicalFiles.add(getLogicalFile(lf)); 	//  Will mark changed if needed  ---
			}
		}
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
			//TODO CollectionDelta monitor = new CollectionDelta("getClusters", clusters);
			WsTopologyServiceSoap service = getWsTopologyService();
			TpLogicalClusterQueryRequest request = new TpLogicalClusterQueryRequest();
			try {
				TpLogicalClusterQueryResponse response = service.tpLogicalClusterQuery(request);
				updateClusters(response.getTpLogicalClusters());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//TODO notifyObservers(monitor.calcChanges(clusters));
		}
		return clusters.toArray(new Cluster[0]);
	}

	synchronized void updateClusters(TpLogicalCluster[] tpLogicalClusters) {
		if (tpLogicalClusters != null) {
			for(TpLogicalCluster c : tpLogicalClusters) {
				clusters.add(getCluster(c.getName())); 	//  Will mark changed if needed  ---
			}
		}
	}

	//  Drop Zones  ---
	public DropZone getDropZone(String name) {
		return DropZone.get(this, name);
	}

	public DropZone getDropZone(TpDropZone dz) {
		DropZone dropZone = getDropZone(dz.getName());
		dropZone.update(dz);
		return dropZone;
	}

	public DropZone[] getDropZones() {
		if (isEnabled()) {
			//TODO CollectionDelta monitor = new CollectionDelta("getClusters", clusters);
			WsTopologyServiceSoap service = getWsTopologyService();
			TpServiceQueryRequest request = new TpServiceQueryRequest();
			request.setType("ALLSERVICES");
			try {
				TpServiceQueryResponse response = service.tpServiceQuery(request);
				updateServices(response.getServiceList());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//TODO notifyObservers(monitor.calcChanges(clusters));
		}
		return dropZones.toArray(new DropZone[0]);
	}

	private void updateServices(TpServices serviceList) {
		if (serviceList != null) {
			updateDropZones(serviceList.getTpDropZones());
		}

	}
	private void updateDropZones(TpDropZone[] rawDropZones) {
		if (rawDropZones != null) {
			for(TpDropZone dz : rawDropZones) {
				dropZones.add(getDropZone(dz));
			}
		}
	}

	//  SOAP Stub Helpers  ---
	public URL getURL() throws MalformedURLException {
		return getURL("");
	}

	public URL getURL(String service) throws MalformedURLException {
		return new URL("http", getIP(), getPort(), "/" + service);
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
		stub.setTimeout(180 * 1000);
		stub.setMaintainSession(true);
	}

	void latencyTest() {
		if (LATENCY_TEST == 0) {
			return;
		}

		try {
			Thread.sleep(LATENCY_TEST);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public WsWorkunitsServiceSoap getWsWorkunitsService() {
		latencyTest();
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
		latencyTest();
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
		latencyTest();
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
		latencyTest();
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
		if ( this == aThat ) {
			return true;
		}

		if ( !(aThat instanceof Platform) ) {
			return false;
		}
		Platform that = (Platform)aThat;

		//now a proper field-by-field evaluation can be made
		return 	EqualsUtil.areEqual(getIP(), that.getIP()) &&
				EqualsUtil.areEqual(getPort(), that.getPort());
	}

	@Override
	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, getIP());
		result = HashCodeUtil.hash(result, getPort());
		return result;
	}
}
