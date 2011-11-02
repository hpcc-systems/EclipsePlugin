package org.hpccsystems.internal.data;

import java.rmi.RemoteException;

import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLWorkunit;
import org.hpccsystems.ws.wsworkunits.WUInfo;
import org.hpccsystems.ws.wsworkunits.WUInfoResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;


public class Workunit {
	Data data;
	Platform platform;
	public ECLWorkunit info;
	
	Workunit(Data data, Platform platform, String wuid) {
		this.data = data;
		this.platform = platform;
		info = new ECLWorkunit();
		info.setWuid(wuid);
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
	
	void Update(ECLWorkunit wu) {
		if (info.getWuid().equals(wu.getWuid()))
			info = wu;
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
