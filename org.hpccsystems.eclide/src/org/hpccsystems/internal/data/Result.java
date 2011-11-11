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

import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.wsworkunits.ECLResult;

public class Result extends DataSingleton {
	private static Map<Integer, Result> Results = new HashMap<Integer, Result>();
	public static synchronized Result get(Workunit workunit, Integer sequence) {
		Result result = new Result(workunit, sequence);
		if (Results.containsKey(result.hashCode())) {
			return Results.get(result.hashCode());
		}
		else {
			Results.put(result.hashCode(), result);
		}
		return result;
	}

	private Workunit workunit;
	private ECLResult info;
	public enum Notification {
		RESULT
	}
	
	private Result(Workunit workunit, Integer sequence) {
		this.workunit = workunit;
		info = new ECLResult();
		info.setSequence(sequence);
		setChanged();
	}
	
	public String getWuid() {
		return workunit.getWuid();
	}

	public Integer getSequence() {
		return info.getSequence();
	}

	public String getName() {
		return info.getName();
	}

	public String getValue() {
		return info.getValue();
	}

	public State getStateID() {
		if (info.getTotal() != null && info.getTotal() != -1) {
			return State.COMPLETED;
		}
		return State.UNKNOWN;
		}
	
	@Override
	public boolean isComplete() {
		return StateHelper.isCompleted(getStateID());
	}

	@Override
	void fastRefresh() {
		fullRefresh();	
	}

	@Override
	void fullRefresh() {
		workunit.getResults();
		/*
		WsWorkunitsServiceSoap service = platform.GetWsWorkunitsService();
		if (service != null) {
			WUResult request = new WUResult();
			request.setWuid(workunit.getWuid());
			request.setSequence(info.getSequence());
			request.setStart(new Long(0));
			request.setCount(1);

			try {
				WUResultResponse response = service.WUResult(request);
				ECLResult newInfo = info;
				newInfo.setName(response.getName());
				newInfo.setTotal(response.getTotal());
				Update(newInfo);
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
	}

	//  Updates  ---
	boolean Update(ECLResult result) {		
		boolean retVal = false;
		if (result != null && info.getSequence().equals(result.getSequence()) && !info.equals(result)) {
			if (UpdateState(result)) {
				retVal = true;
				notifyObservers(Notification.RESULT);
			}
		}
		monitor();
		return retVal;
	}

	synchronized boolean UpdateState(ECLResult result) {
		if (result != null && info.getSequence().equals(result.getSequence()) &&
				EqualsUtil.hasChanged(info, result)) {
			info = result;
			setChanged();
			return true;
		}
		return false;
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
