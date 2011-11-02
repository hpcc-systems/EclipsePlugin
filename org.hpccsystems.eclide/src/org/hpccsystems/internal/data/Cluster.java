package org.hpccsystems.internal.data;

import java.rmi.RemoteException;

import org.hpccsystems.ws.wsdfu.DFUFileDetail;
import org.hpccsystems.ws.wsdfu.DFUInfoRequest;
import org.hpccsystems.ws.wsdfu.DFUInfoResponse;
import org.hpccsystems.ws.wsdfu.DFULogicalFile;
import org.hpccsystems.ws.wsdfu.WsDfuServiceSoap;
import org.hpccsystems.ws.wstopology.TpClusterInfoRequest;
import org.hpccsystems.ws.wstopology.TpClusterInfoResponse;
import org.hpccsystems.ws.wstopology.TpTargetCluster;
import org.hpccsystems.ws.wstopology.WsTopologyServiceSoap;
import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLWorkunit;
import org.hpccsystems.ws.wsworkunits.WUInfo;
import org.hpccsystems.ws.wsworkunits.WUInfoResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;


public class Cluster {
	public static final String P_CLUSTER = "clusterLaunchConfig";

	Data data;
	Platform platform;
	public TpTargetCluster info;
	public TpClusterInfoResponse info2;
	
	Cluster(Data data, Platform platform, String name) {
		this.data = data;
		this.platform = platform;
		info = new TpTargetCluster();
		info.setName(name);
		info2 = new TpClusterInfoResponse();
		info2.setName(name);
	}
	
	public void Refresh() {
		WsTopologyServiceSoap service = platform.GetWsTopologyService();
		if (service != null) {
			TpClusterInfoRequest request = new TpClusterInfoRequest();
			request.setName(info.getName());
			try {
				TpClusterInfoResponse respsone = service.tpClusterInfo(request);
				Update(respsone);		
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void Update(TpTargetCluster tc) {
		if (info.getName().equals(tc.getName()))
			info = tc;
	}

	void Update(TpClusterInfoResponse ci) {
		if (info2.getName().equals(ci.getName()))
			info2 = ci;
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( (Object)this == aThat ) 
			return true;

		if ( !(aThat instanceof Cluster) ) 
			return false;
		Cluster that = (Cluster)aThat;

		//now a proper field-by-field evaluation can be made
		return EqualsUtil.areEqual(this.platform, that.platform) &&
				EqualsUtil.areEqual(this.info.getName(), that.info.getName());
	}

	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, platform);
		result = HashCodeUtil.hash(result, info.getName());
		return result;
	}
}
