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
package org.hpccsystems.ws.wsdfu;

public class WsDfuServiceSoapProxy implements org.hpccsystems.ws.wsdfu.WsDfuServiceSoap {
	private String _endpoint = null;
	private org.hpccsystems.ws.wsdfu.WsDfuServiceSoap wsDfuServiceSoap = null;

	public WsDfuServiceSoapProxy() {
		_initWsDfuServiceSoapProxy();
	}

	public WsDfuServiceSoapProxy(String endpoint) {
		_endpoint = endpoint;
		_initWsDfuServiceSoapProxy();
	}

	private void _initWsDfuServiceSoapProxy() {
		try {
			wsDfuServiceSoap = (new org.hpccsystems.ws.wsdfu.WsDfuLocator()).getWsDfuServiceSoap();
			if (wsDfuServiceSoap != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub)wsDfuServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String)((javax.xml.rpc.Stub)wsDfuServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		}
		catch (javax.xml.rpc.ServiceException serviceException) {}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (wsDfuServiceSoap != null)
			((javax.xml.rpc.Stub)wsDfuServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public org.hpccsystems.ws.wsdfu.WsDfuServiceSoap getWsDfuServiceSoap() {
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap;
	}

	@Override
	public org.hpccsystems.ws.wsdfu.AddResponse add(org.hpccsystems.ws.wsdfu.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.add(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.AddRemoteResponse addRemote(org.hpccsystems.ws.wsdfu.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.addRemote(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.wsdfu.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.addtoSuperfile(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.wsdfu.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.DFUArrayAction(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.wsdfu.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.DFUBrowseData(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.wsdfu.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.DFUDefFile(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.wsdfu.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.DFUFileView(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.wsdfu.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.DFUGetDataColumns(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUInfoResponse DFUInfo(org.hpccsystems.ws.wsdfu.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.DFUInfo(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUQueryResponse DFUQuery(org.hpccsystems.ws.wsdfu.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.DFUQuery(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUSearchResponse DFUSearch(org.hpccsystems.ws.wsdfu.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.DFUSearch(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.wsdfu.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.DFUSearchData(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.wsdfu.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.DFUSpace(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.SavexmlResponse savexml(org.hpccsystems.ws.wsdfu.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.savexml(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.SuperfileActionResponse superfileAction(org.hpccsystems.ws.wsdfu.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.superfileAction(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.SuperfileAddRawResponse superfileAddRaw(org.hpccsystems.ws.wsdfu.SuperfileAddRawRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.superfileAddRaw(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsdfu.SuperfileListResponse superfileList(org.hpccsystems.ws.wsdfu.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException{
		if (wsDfuServiceSoap == null)
			_initWsDfuServiceSoapProxy();
		return wsDfuServiceSoap.superfileList(parameters);
	}


}
