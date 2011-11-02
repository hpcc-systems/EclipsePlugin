package org.hpccsystems.internal.data;

import java.rmi.RemoteException;

import org.hpccsystems.ws.filespray.DFUWorkunit;
import org.hpccsystems.ws.filespray.FileSprayServiceSoap;
import org.hpccsystems.ws.filespray.GetDFUWorkunit;
import org.hpccsystems.ws.filespray.GetDFUWorkunitResponse;
import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLWorkunit;
import org.hpccsystems.ws.wsworkunits.WUInfo;
import org.hpccsystems.ws.wsworkunits.WUInfoResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;



public class FileSprayWorkunit {
	Data data;
	Platform platform;
	public DFUWorkunit info;
	
	FileSprayWorkunit(Data data, Platform platform, String wuid) {
		this.data = data;
		this.platform = platform;
		info = new DFUWorkunit();
		info.setID(wuid);
	}
	
	public void Refresh() {
		FileSprayServiceSoap service = platform.GetFileSprayService();
		if (service != null) {
			GetDFUWorkunit request = new GetDFUWorkunit();
			request.setWuid(info.getID());
			try {
				GetDFUWorkunitResponse respsone = service.getDFUWorkunit(request);
				Update(respsone.getResult());		
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void Update(DFUWorkunit wu) {
		if (info.getID().equals(wu.getID()))
			info = wu;
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( (Object)this == aThat ) 
			return true;

		if ( !(aThat instanceof FileSprayWorkunit) ) 
			return false;
		FileSprayWorkunit that = (FileSprayWorkunit)aThat;

		//now a proper field-by-field evaluation can be made
		return EqualsUtil.areEqual(this.platform, that.platform) &&
				EqualsUtil.areEqual(this.info.getID(), that.info.getID());
	}

	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, platform);
		result = HashCodeUtil.hash(result, info.getID());
		return result;
	}
}
