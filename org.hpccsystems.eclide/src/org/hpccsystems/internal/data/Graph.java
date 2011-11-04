package org.hpccsystems.internal.data;

import java.rmi.RemoteException;
import java.util.Observable;

import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLGraph;
import org.hpccsystems.ws.wsworkunits.ECLResult;
import org.hpccsystems.ws.wsworkunits.ECLWorkunit;
import org.hpccsystems.ws.wsworkunits.WUInfo;
import org.hpccsystems.ws.wsworkunits.WUInfoResponse;
import org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap;


public class Graph extends Observable{
	Data data;
	public Workunit workunit;
	public ECLGraph info;
	
	Graph(Data data, Workunit workunit, String name) {
		this.data = data;
		this.workunit = workunit;
		info = new ECLGraph();
		info.setName(name);
	}
	
	void Update(ECLGraph graph) {
		if (info.getName().equals(graph.getName()) && info != graph) {
			info = graph;
			setChanged();
		}
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( (Object)this == aThat ) 
			return true;

		if ( !(aThat instanceof Graph) ) 
			return false;
		Graph that = (Graph)aThat;

		//now a proper field-by-field evaluation can be made
		return 	EqualsUtil.areEqual(this.workunit, that.workunit) &&
				EqualsUtil.areEqual(this.info.getName(), that.info.getName());
	}

	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, workunit);
		result = HashCodeUtil.hash(result, info.getName());
		return result;
	}
}
