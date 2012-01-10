/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.internal.data;

import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.internal.DatasetParser;
import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLResult;
import org.hpccsystems.ws.wsworkunits.WUResult;
import org.hpccsystems.ws.wsworkunits.WUResultResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;
import org.xml.sax.InputSource;

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
	
	class ResultData {
		final int PAGE_SIZE = 180;
		final int PAGE_BEFORE = 60;
		Map<Long, Map<Integer, String>> data;
		
		ResultData() {
			data = new HashMap<Long, Map<Integer, String>>();
		}
		
		String GetCell(long row, int col) {
			if (data.containsKey(row))
				return data.get(row).get(col);
			
			Long start = row;
			for (int i = 0; i < PAGE_BEFORE; ++i) {
				if (start -1 < 0)
					break;
				
				if (data.containsKey(start - 1))
					break;
				
				--start;
			}
			
			int count = (int)(row - start);
			for (int i = count; i < PAGE_SIZE; ++i) {
				if (data.containsKey(start + count))
					break;
				++count;
			}
			
			WsWorkunitsServiceSoap service = workunit.getPlatform().getWsWorkunitsService();
			if (service != null) {
				WUResult request = new WUResult();
				request.setWuid(workunit.getWuid());
				request.setSequence(info.getSequence());
				request.setStart(start);
				request.setCount(count);
				try {
					WUResultResponse response = service.WUResult(request);
					String resultString = response.getResult();
					if (resultString != null) {
						int offset = resultString.indexOf("<Dataset");
						resultString = resultString.substring(offset);
						DatasetParser dp = new DatasetParser(response.getStart(), new InputSource(new StringReader(resultString)), data);
						return data.get(row).get(col);
					}
				} catch (ArrayOfEspException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			return data.get(row).get(col);
		}
	}
	
	ResultData data;
	
	private Result(Workunit workunit, Integer sequence) {
		this.workunit = workunit;
		info = new ECLResult();
		info.setSequence(sequence);
		data = new ResultData();
		setChanged();
	}
	
	public String getWuid() {
		return workunit.getWuid();
	}

	public Integer getSequence() {
		return info.getSequence();
	}

	public String getResultName() {
		return info.getName();
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
	
	public Long getTotal() {
		return info.getTotal();
	}
	
	public String[] getResultViews() {
		return workunit.getResultViews();
	}
	
	@Override
	public boolean isComplete() {
		return StateHelper.isCompleted(getStateID()) || workunit.isComplete();
	}

	public int getColumnCount() {
		if (info.getECLSchemas() == null)
			return 0;
		return info.getECLSchemas().length;
	}

	public String getColumnName(int i) {
		if (info.getECLSchemas() == null)
			return "";
		return info.getECLSchemas()[i].getColumnName();
	}

	public String getCell(int row, int col) {
		return data.GetCell(row, col);
	}
	
	//  Refresh + Update  ---
	@Override
	void fastRefresh() {
		fullRefresh();	
	}

	@Override
	void fullRefresh() {
		workunit.getResults();
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
			
			assert(result.getECLSchemas() != null);
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
