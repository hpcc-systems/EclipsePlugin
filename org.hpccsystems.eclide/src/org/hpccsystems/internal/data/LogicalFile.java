package org.hpccsystems.internal.data;

import java.rmi.RemoteException;

import org.hpccsystems.ws.wsdfu.DFUFileDetail;
import org.hpccsystems.ws.wsdfu.DFUInfoRequest;
import org.hpccsystems.ws.wsdfu.DFUInfoResponse;
import org.hpccsystems.ws.wsdfu.DFULogicalFile;
import org.hpccsystems.ws.wsdfu.WsDfuServiceSoap;
import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLResult;
import org.hpccsystems.ws.wsworkunits.ECLSourceFile;
import org.hpccsystems.ws.wsworkunits.ECLWorkunit;
import org.hpccsystems.ws.wsworkunits.WUInfo;
import org.hpccsystems.ws.wsworkunits.WUInfoResponse;
import org.hpccsystems.ws.wsworkunits.WUResult;
import org.hpccsystems.ws.wsworkunits.WUResultResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;


public class LogicalFile {
	Data data;
	Platform platform;
	public DFULogicalFile info;
	public DFUFileDetail info2;
	public ECLSourceFile info3;
	
	LogicalFile(Data data, Platform platform, String name) {
		this.data = data;
		this.platform = platform;
		info = new DFULogicalFile();
		info.setName(name);
		info2 = new DFUFileDetail();
		info2.setName(name);
		info3 = new ECLSourceFile();
		info3.setName(name);
	}
	
	public void Refresh() {
			WsDfuServiceSoap service = platform.GetWsDfuService();
			if (service != null) {
				DFUInfoRequest request = new DFUInfoRequest();
				request.setName(info.getName());
				try {
					DFUInfoResponse respsone = service.DFUInfo(request);
					Update(respsone.getFileDetail());		
				} catch (ArrayOfEspException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
	void Update(DFULogicalFile lf) {
		if (info.getName().equals(lf.getName()))
			info = lf;
	}

	void Update(DFUFileDetail fd) {
		if (info2.getName().equals(fd.getName()))
			info2 = fd;
	}
	
	void Update(ECLSourceFile sf) {
		if (info3.getName().equals(sf.getName()))
			info3 = sf;
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( (Object)this == aThat ) 
			return true;

		if ( !(aThat instanceof LogicalFile) ) 
			return false;
		LogicalFile that = (LogicalFile)aThat;

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
