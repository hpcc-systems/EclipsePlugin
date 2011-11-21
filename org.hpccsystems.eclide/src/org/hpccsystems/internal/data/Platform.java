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

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import org.eclipse.core.resources.IFile;
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

public class Platform extends DataSingleton {
	private static Map<Integer, Platform> Platforms = new HashMap<Integer, Platform>();
	public static synchronized Platform get(String ip, String user, String password) {
		Platform platform = new Platform(ip, user, password);
		if (Platforms.containsKey(platform.hashCode())) {
			return Platforms.get(platform.hashCode());
		}
		else {
			Platforms.put(platform.hashCode(), platform);
		}
		return platform;
	}


	//public String name; 
	private String ip; 
	private String user; 
	private String password;
	private Collection<Cluster> clusters;
	private Collection<Workunit> workunits;	
	private Collection<FileSprayWorkunit> fileSprayWorkunits;
	private Collection<LogicalFile> logicalFiles;


	Platform(String ip, String user, String password) {
		this.ip = ip;
		this.user = user;
		this.password = password;
		this.clusters = new ArrayList<Cluster>();
		this.workunits = new ArrayList<Workunit>();	
		this.fileSprayWorkunits = new ArrayList<FileSprayWorkunit>();
		this.logicalFiles = new ArrayList<LogicalFile>();
		setChanged();
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
	
	public Workunit submit(IFile file, String cluster) {
		Eclipse.doSaveDirty(file.getProject());
		ECLCompiler compiler = new ECLCompiler(file.getProject());
		String wuid = compiler.buildAndRun(file, ip, cluster, user, password);
		if (wuid.isEmpty())
			return null;

		Workunit retVal = getWorkunit(wuid);
		setChanged();
		notifyObservers("Submit");
		return retVal;
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

	public Collection<Workunit> getWorkunits(String cluster, String startDate, String endDate) {
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyObservers("GetWorkunits");
		return workunits;
	}

	public Collection<Workunit> getWorkunits(String cluster) {
		return getWorkunits(cluster, "", "");
	}

	public Collection<Workunit> getWorkunits() {
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

	public Collection<FileSprayWorkunit> getFileSprayWorkunits(String cluster) {
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
		notifyObservers("GetFileSprayWorkunits");
		return fileSprayWorkunits;
	}

	public Collection<FileSprayWorkunit> getFileSprayWorkunits() {
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

	public Collection<LogicalFile> getLogicalFiles(String cluster) {
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
		notifyObservers("GetLogicalFiles");
		return logicalFiles;
	}

	public Collection<LogicalFile> getLogicalFiles() {
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

	public Collection<Cluster> getClusters() {
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
		notifyObservers("GetClusters");
		return clusters;
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
		return new URL("http", ip, 8010, "/" + service);
	}

	public URL getURL(String service, String method) throws MalformedURLException {
		return getURL(service + "/" + method);
	}

	public URL getURL(String service, String method, String params) throws MalformedURLException {
		return getURL(service + "/" + method + "?" + params);
	}
	
	void initStub(org.apache.axis.client.Stub stub) {
		//QName portName = stub.getPortName();
		//QName newPortName = new QName("urn:hpccsystems:ws:wsworkunits", portName.getLocalPart(), portName.getPrefix());
		//stub.setPortName(newPortName);
		stub.setUsername(user);
		stub.setPassword(password);
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
		return EqualsUtil.areEqual(this.ip, that.ip);
	}

	@Override
	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, ip);
		return result;
	}
}
