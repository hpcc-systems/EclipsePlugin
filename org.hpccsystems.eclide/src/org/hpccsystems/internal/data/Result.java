package org.hpccsystems.internal.data;

import java.rmi.RemoteException;

import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLResult;
import org.hpccsystems.ws.wsworkunits.ECLWorkunit;
import org.hpccsystems.ws.wsworkunits.WUInfo;
import org.hpccsystems.ws.wsworkunits.WUInfoResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;


public class Result {
	Data data;
	public Workunit workunit;
	public ECLResult info;
	
	Result(Data data, Workunit workunit, Integer sequence) {
		this.data = data;
		this.workunit = workunit;
		info = new ECLResult();
		info.setSequence(sequence);
	}
	
	void Update(ECLResult result) {
		if (info.getSequence().equals(result.getSequence()))
			info = result;
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( (Object)this == aThat ) 
			return true;

		if ( !(aThat instanceof Result) ) 
			return false;
		Result that = (Result)aThat;

		//now a proper field-by-field evaluation can be made
		return 	EqualsUtil.areEqual(this.workunit, that.workunit) &&
				EqualsUtil.areEqual(this.info.getSequence(), that.info.getSequence());
	}

	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, workunit);
		result = HashCodeUtil.hash(result, info.getSequence());
		return result;
	}
}
