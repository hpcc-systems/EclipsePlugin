package org.hpccsystems.internal.data;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.hpccsystems.eclide.builder.ECLCompiler;
import org.hpccsystems.internal.Eclipse;

import wsworkunits.ws.hpccsystems.ArrayOfEspException;
import wsworkunits.ws.hpccsystems.ECLWorkunit;
import wsworkunits.ws.hpccsystems.WUQuery;
import wsworkunits.ws.hpccsystems.WUQueryResponse;
import wsworkunits.ws.hpccsystems.WsWorkunitsLocator;
import wsworkunits.ws.hpccsystems.WsWorkunitsServiceSoap;

public class Platform {
	public static final String P_IP = "ipLaunchConfig";
	public static final String P_CLUSTER = "clusterLaunchConfig";

	public static final String P_USER = "userLaunchConfig";
	public static final String P_PASSWORD = "passwordLaunchConfig";

	Data data;
	public String name; 
	public String ip; 
	public String cluster; 
	public String user; 
	public String password;
	
	private Map<Integer, Workunit> Workunits;

	Platform(Data data, ILaunchConfiguration launchConfiguration) {
		this.data = data;
		Workunits = new HashMap<Integer, Workunit>(); 
		
		name = launchConfiguration.getName();

		try {
			ip = launchConfiguration.getAttribute(P_IP, "");
		} catch (CoreException e) {
		} 
		try {
			cluster = launchConfiguration.getAttribute(P_CLUSTER, "");
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
	
	public Workunit Submit(IFile file) {
		Eclipse.doSaveDirty(file.getProject());
		ECLCompiler compiler = new ECLCompiler(file.getProject());
		String wuid = compiler.buildAndRun(file, ip, cluster, user, password);
		if (wuid.isEmpty())
			return null;
		return GetWorkunit(wuid);
	}

	//  Workunit  ---
	public synchronized Workunit GetWorkunit(String wuid) {
		Workunit workunit = new Workunit(data, this, wuid);
		if (Workunits.containsKey(workunit.hashCode())) {
			return Workunits.get(workunit.hashCode());
		}
		else {
			Workunits.put(workunit.hashCode(), workunit);
		}
		return workunit;
	}

	public synchronized Workunit GetWorkunit(ECLWorkunit wu) {
		Workunit workunit = GetWorkunit(wu.getWuid());
		workunit.Update(wu);
		return workunit;
	}

	public synchronized Collection<Workunit> GetWorkunits() {
		WsWorkunitsServiceSoap service = GetService();
		WUQuery request = new WUQuery();
		try {
			WUQueryResponse response = service.WUQuery(request);
			ECLWorkunit[] workunits = response.getWorkunits();
			for(int i = 0; i < workunits.length ;++i) {
				GetWorkunit(workunits[i]);
			}
		} catch (ArrayOfEspException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Workunits.values();
	}
	
	URL GetURL() throws MalformedURLException {
		return new URL("http", ip, 8010, "/WsWorkunits");
	}
	
	public WsWorkunitsServiceSoap GetService() {
		WsWorkunitsLocator locator = new WsWorkunitsLocator();
		try {
			WsWorkunitsServiceSoap service = locator.getWsWorkunitsServiceSoap(GetURL());
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
		return EqualsUtil.areEqual(this.name, that.name);
	}

	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, name);
		return result;
	}
}
