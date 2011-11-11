package org.hpccsystems.internal.data;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.filespray.DFUWorkunit;
import org.hpccsystems.ws.filespray.FileSprayServiceSoap;
import org.hpccsystems.ws.filespray.GetDFUWorkunit;
import org.hpccsystems.ws.filespray.GetDFUWorkunitResponse;
import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;

public class FileSprayWorkunit extends DataSingleton {
	private static Map<Integer, FileSprayWorkunit> FileSprayWorkunits = new HashMap<Integer, FileSprayWorkunit>();
	public static synchronized FileSprayWorkunit get(Platform platform, String id) {
		FileSprayWorkunit workunit = new FileSprayWorkunit(platform, id);
		if (FileSprayWorkunits.containsKey(workunit.hashCode())) {
			return FileSprayWorkunits.get(workunit.hashCode());
		}
		else {
			FileSprayWorkunits.put(workunit.hashCode(), workunit);
		}
		return workunit;
	}
	
	private Platform platform;
	private DFUWorkunit info;
	public enum Notification {
		LOGICALFILEWORKUNIT,
	}

	FileSprayWorkunit(Platform platform, String id) {
		this.platform = platform;
		this.info = new DFUWorkunit();
		this.info.setID(id);
		setChanged();
	}
	
	public String getID() {
		return info.getID();
	}

	/*enum DFUstate
{
0    DFUstate_unknown,
1    DFUstate_scheduled,
2    DFUstate_queued,
3    DFUstate_started,
4    DFUstate_aborted,
5    DFUstate_failed,
6    DFUstate_finished,
7    DFUstate_monitoring,
8    DFUstate_aborting
9;
	 */	
	public State getStateID() {
		if (info.getState() != null) {
			switch (info.getState()){
			case 1:		return State.SCHEDULED;
			case 2:		return State.WAIT;
			case 3:		return State.RUNNING;
			case 4:		return State.ABORTED;
			case 5:		return State.FAILED;
			case 6:		return State.COMPLETED;
			case 7:		return State.COMPLETED;
			case 8:		return State.ABORTING;
			}
		}
		return State.UNKNOWN;
	}
	@Override
	boolean isComplete() {
		return false;
	}

	@Override
	void fastRefresh() {
		fullRefresh();
	}

	@Override
	void fullRefresh() {
		FileSprayServiceSoap service = platform.getFileSprayService();
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
		notifyObservers(Notification.LOGICALFILEWORKUNIT);
	}

	boolean Update(DFUWorkunit wu) {
		boolean retVal = false;
		if (wu != null && info.getID().equals(wu.getID()) && !info.equals(wu)) {
			if (UpdateState(wu))
				retVal = true;
		}
		monitor();
		return retVal;
	}

	synchronized boolean UpdateState(DFUWorkunit wu) {
		if (wu != null && info.getID().equals(wu.getID()) && 
				EqualsUtil.hasChanged(info.getState(), wu.getState())) {
			info.setState(wu.getState());
			setChanged();
			return true;
		}
		return false;
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
