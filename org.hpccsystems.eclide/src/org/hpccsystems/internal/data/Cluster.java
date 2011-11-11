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
import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.wstopology.TpClusterInfoRequest;
import org.hpccsystems.ws.wstopology.TpClusterInfoResponse;
import org.hpccsystems.ws.wstopology.TpTargetCluster;
import org.hpccsystems.ws.wstopology.WsTopologyServiceSoap;
import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;

public class Cluster extends DataSingleton  {
	public static final String P_CLUSTER = "clusterLaunchConfig";
	private static Map<Integer, Cluster> Clusters = new HashMap<Integer, Cluster>();
	public static synchronized Cluster get(Data data, Platform platform, String name) {
		Cluster cluster = new Cluster(platform, name);
		if (Clusters.containsKey(cluster.hashCode())) {
			return Clusters.get(cluster.hashCode());
		}
		else {
			Clusters.put(cluster.hashCode(), cluster);
		}
		return cluster;
	}

	private Platform platform;
	private TpTargetCluster info;
	private TpClusterInfoResponse info2;
	
	Cluster(Platform platform, String name) {
		this.platform = platform;
		info = new TpTargetCluster();
		info.setName(name);
		info2 = new TpClusterInfoResponse();
		info2.setName(name);
	}
	
	public String getName() {
		return info.getName();
	}

	@Override
	boolean isComplete() {
		return true;
	}

	@Override
	void fastRefresh() {
		fullRefresh();
	}

	@Override
	void fullRefresh() {
		//  Probably not needed...
		WsTopologyServiceSoap service = platform.getWsTopologyService();
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
		if (info.getName().equals(tc.getName())) {
			info = tc;
			setChanged();
		}
	}

	void Update(TpClusterInfoResponse ci) {
		if (info2.getName().equals(ci.getName())) {
			info2 = ci;
			setChanged();
		}
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
