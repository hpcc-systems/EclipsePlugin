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
package org.hpccsystems.ws.wsworkunits;

public class WsWorkunitsServiceSoapProxy implements org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap {
	private String _endpoint = null;
	private org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap wsWorkunitsServiceSoap = null;

	public WsWorkunitsServiceSoapProxy() {
		_initWsWorkunitsServiceSoapProxy();
	}

	public WsWorkunitsServiceSoapProxy(String endpoint) {
		_endpoint = endpoint;
		_initWsWorkunitsServiceSoapProxy();
	}

	private void _initWsWorkunitsServiceSoapProxy() {
		try {
			wsWorkunitsServiceSoap = (new org.hpccsystems.ws.wsworkunits.WsWorkunitsLocator()).getWsWorkunitsServiceSoap();
			if (wsWorkunitsServiceSoap != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub)wsWorkunitsServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
				else
					_endpoint = (String)((javax.xml.rpc.Stub)wsWorkunitsServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		}
		catch (javax.xml.rpc.ServiceException serviceException) {}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (wsWorkunitsServiceSoap != null)
			((javax.xml.rpc.Stub)wsWorkunitsServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap getWsWorkunitsServiceSoap() {
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap;
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.GVCAjaxGraphResponse GVCAjaxGraph(org.hpccsystems.ws.wsworkunits.GVCAjaxGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.GVCAjaxGraph(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUAbortResponse WUAbort(org.hpccsystems.ws.wsworkunits.WUAbort parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUAbort(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUActionResponse WUAction(org.hpccsystems.ws.wsworkunits.WUAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUAction(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUAddLocalFileToWorkunitResponse WUAddLocalFileToWorkunit(org.hpccsystems.ws.wsworkunits.WUAddLocalFileToWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUAddLocalFileToWorkunit(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUDebugResponse WUCDebug(org.hpccsystems.ws.wsworkunits.WUCDebug parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUCDebug(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUClusterJobQueueLOGResponse WUClusterJobQueueLOG(org.hpccsystems.ws.wsworkunits.WUClusterJobQueueLOG parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUClusterJobQueueLOG(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUClusterJobQueueXLSResponse WUClusterJobQueueXLS(org.hpccsystems.ws.wsworkunits.WUClusterJobQueueXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUClusterJobQueueXLS(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUClusterJobSummaryXLSResponse WUClusterJobSummaryXLS(org.hpccsystems.ws.wsworkunits.WUClusterJobSummaryXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUClusterJobSummaryXLS(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUClusterJobXLSResponse WUClusterJobXLS(org.hpccsystems.ws.wsworkunits.WUClusterJobXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUClusterJobXLS(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUCompileECLResponse WUCompileECL(org.hpccsystems.ws.wsworkunits.WUCompileECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUCompileECL(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUCopyLogicalFilesResponse WUCopyLogicalFiles(org.hpccsystems.ws.wsworkunits.WUCopyLogicalFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUCopyLogicalFiles(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUCreateResponse WUCreate() throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUCreate();
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUUpdateResponse WUCreateAndUpdate(org.hpccsystems.ws.wsworkunits.WUCreateAndUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUCreateAndUpdate(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUDeleteResponse WUDelete(org.hpccsystems.ws.wsworkunits.WUDelete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUDelete(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUDeployWorkunitResponse WUDeployWorkunit(org.hpccsystems.ws.wsworkunits.WUDeployWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUDeployWorkunit(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUExportResponse WUExport(org.hpccsystems.ws.wsworkunits.WUExport parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUExport(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WULogFileResponse WUFile(org.hpccsystems.ws.wsworkunits.WUFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUFile(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUGVCGraphInfoResponse WUGVCGraphInfo(org.hpccsystems.ws.wsworkunits.WUGVCGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUGVCGraphInfo(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUGetDependancyTreesResponse WUGetDependancyTrees(org.hpccsystems.ws.wsworkunits.WUGetDependancyTrees parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUGetDependancyTrees(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUGetGraphResponse WUGetGraph(org.hpccsystems.ws.wsworkunits.WUGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUGetGraph(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUGraphInfoResponse WUGraphInfo(org.hpccsystems.ws.wsworkunits.WUGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUGraphInfo(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUGraphTimingResponse WUGraphTiming(org.hpccsystems.ws.wsworkunits.WUGraphTiming parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUGraphTiming(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUInfoResponse WUInfo(org.hpccsystems.ws.wsworkunits.WUInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUInfo(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUInfoResponse WUInfoDetails(org.hpccsystems.ws.wsworkunits.WUInfoDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUInfoDetails(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUJobListResponse WUJobList(org.hpccsystems.ws.wsworkunits.WUJobList parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUJobList(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUListLocalFileRequiredResponse WUListLocalFileRequired(org.hpccsystems.ws.wsworkunits.WUListLocalFileRequired parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUListLocalFileRequired(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUProcessGraphResponse WUProcessGraph(org.hpccsystems.ws.wsworkunits.WUProcessGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUProcessGraph(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUProtectResponse WUProtect(org.hpccsystems.ws.wsworkunits.WUProtect parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUProtect(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUPublishWorkunitResponse WUPublishWorkunit(org.hpccsystems.ws.wsworkunits.WUPublishWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUPublishWorkunit(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUPushEventResponse WUPushEvent(org.hpccsystems.ws.wsworkunits.WUPushEvent parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUPushEvent(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUQueryResponse WUQuery(org.hpccsystems.ws.wsworkunits.WUQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUQuery(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUQuerySetActionAliasesResponse WUQuerysetActionAliases(org.hpccsystems.ws.wsworkunits.WUQuerysetActionAliases parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUQuerysetActionAliases(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUQuerySetActionQueriesResponse WUQuerysetActionQueries(org.hpccsystems.ws.wsworkunits.WUQuerysetActionQueries parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUQuerysetActionQueries(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUQuerySetDetailsResponse WUQuerysetDetails(org.hpccsystems.ws.wsworkunits.WUQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUQuerysetDetails(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUQuerysetsResponse WUQuerysets(org.hpccsystems.ws.wsworkunits.WUQuerysets parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUQuerysets(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUResubmitResponse WUResubmit(org.hpccsystems.ws.wsworkunits.WUResubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUResubmit(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUResultResponse WUResult(org.hpccsystems.ws.wsworkunits.WUResult parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUResult(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUResultBinResponse WUResultBin(org.hpccsystems.ws.wsworkunits.WUResultBin parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUResultBin(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUResultSummaryResponse WUResultSummary(org.hpccsystems.ws.wsworkunits.WUResultSummary parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUResultSummary(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUResultViewResponse WUResultView(org.hpccsystems.ws.wsworkunits.WUResultView parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUResultView(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUScheduleResponse WUSchedule(org.hpccsystems.ws.wsworkunits.WUSchedule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUSchedule(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUShowScheduledResponse WUShowScheduled(org.hpccsystems.ws.wsworkunits.WUShowScheduled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUShowScheduled(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUSubmitResponse WUSubmit(org.hpccsystems.ws.wsworkunits.WUSubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUSubmit(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUSyntaxCheckResponse WUSyntaxCheckECL(org.hpccsystems.ws.wsworkunits.WUSyntaxCheckECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUSyntaxCheckECL(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUUpdateResponse WUUpdate(org.hpccsystems.ws.wsworkunits.WUUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUUpdate(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUWaitResponse WUWaitCompiled(org.hpccsystems.ws.wsworkunits.WUWaitCompiled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUWaitCompiled(parameters);
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUWaitResponse WUWaitComplete(org.hpccsystems.ws.wsworkunits.WUWaitComplete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException{
		if (wsWorkunitsServiceSoap == null)
			_initWsWorkunitsServiceSoapProxy();
		return wsWorkunitsServiceSoap.WUWaitComplete(parameters);
	}


}
