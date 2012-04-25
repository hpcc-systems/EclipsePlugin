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
package org.hpccsystems.ws.wstopology;

public class WsTopologyServiceSoapProxy implements org.hpccsystems.ws.wstopology.WsTopologyServiceSoap {
	private String _endpoint = null;
	private org.hpccsystems.ws.wstopology.WsTopologyServiceSoap wsTopologyServiceSoap = null;

	public WsTopologyServiceSoapProxy() {
		_initWsTopologyServiceSoapProxy();
	}

	public WsTopologyServiceSoapProxy(String endpoint) {
		_endpoint = endpoint;
		_initWsTopologyServiceSoapProxy();
	}

	private void _initWsTopologyServiceSoapProxy() {
		try {
			wsTopologyServiceSoap = (new org.hpccsystems.ws.wstopology.WsTopologyLocator()).getWsTopologyServiceSoap();
			if (wsTopologyServiceSoap != null) {
				if (_endpoint != null) {
					((javax.xml.rpc.Stub)wsTopologyServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				} else {
					_endpoint = (String)((javax.xml.rpc.Stub)wsTopologyServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
				}
			}

		}
		catch (javax.xml.rpc.ServiceException serviceException) {}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (wsTopologyServiceSoap != null) {
			((javax.xml.rpc.Stub)wsTopologyServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
		}

	}

	public org.hpccsystems.ws.wstopology.WsTopologyServiceSoap getWsTopologyServiceSoap() {
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap;
	}

	@Override
	public org.hpccsystems.ws.wstopology.SystemLogResponse systemLog(org.hpccsystems.ws.wstopology.SystemLogRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.systemLog(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpClusterInfoResponse tpClusterInfo(org.hpccsystems.ws.wstopology.TpClusterInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpClusterInfo(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpClusterQueryResponse tpClusterQuery(org.hpccsystems.ws.wstopology.TpClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpClusterQuery(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpGetComponentFileResponse tpGetComponentFile(org.hpccsystems.ws.wstopology.TpGetComponentFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpGetComponentFile(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpGroupQueryResponse tpGroupQuery(org.hpccsystems.ws.wstopology.TpGroupQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpGroupQuery(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpLogFileResponse tpLogFile(org.hpccsystems.ws.wstopology.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpLogFile(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpLogFileResponse tpLogFileDisplay(org.hpccsystems.ws.wstopology.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpLogFileDisplay(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpLogicalClusterQueryResponse tpLogicalClusterQuery(org.hpccsystems.ws.wstopology.TpLogicalClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpLogicalClusterQuery(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpMachineQueryResponse tpMachineQuery(org.hpccsystems.ws.wstopology.TpMachineQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpMachineQuery(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpServiceQueryResponse tpServiceQuery(org.hpccsystems.ws.wstopology.TpServiceQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpServiceQuery(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpSetMachineStatusResponse tpSetMachineStatus(org.hpccsystems.ws.wstopology.TpSetMachineStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpSetMachineStatus(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpSwapNodeResponse tpSwapNode(org.hpccsystems.ws.wstopology.TpSwapNodeRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpSwapNode(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpTargetClusterQueryResponse tpTargetClusterQuery(org.hpccsystems.ws.wstopology.TpTargetClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpTargetClusterQuery(parameters);
	}

	@Override
	public org.hpccsystems.ws.wstopology.TpXMLFileResponse tpXMLFile(org.hpccsystems.ws.wstopology.TpXMLFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException{
		if (wsTopologyServiceSoap == null) {
			_initWsTopologyServiceSoapProxy();
		}
		return wsTopologyServiceSoap.tpXMLFile(parameters);
	}


}
