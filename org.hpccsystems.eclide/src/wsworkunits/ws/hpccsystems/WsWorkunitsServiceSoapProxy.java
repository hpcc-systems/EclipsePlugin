package wsworkunits.ws.hpccsystems;

public class WsWorkunitsServiceSoapProxy implements wsworkunits.ws.hpccsystems.WsWorkunitsServiceSoap {
  private String _endpoint = null;
  private wsworkunits.ws.hpccsystems.WsWorkunitsServiceSoap wsWorkunitsServiceSoap = null;
  
  public WsWorkunitsServiceSoapProxy() {
    _initWsWorkunitsServiceSoapProxy();
  }
  
  public WsWorkunitsServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsWorkunitsServiceSoapProxy();
  }
  
  private void _initWsWorkunitsServiceSoapProxy() {
    try {
      wsWorkunitsServiceSoap = (new wsworkunits.ws.hpccsystems.WsWorkunitsLocator()).getWsWorkunitsServiceSoap();
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
  
  public wsworkunits.ws.hpccsystems.WsWorkunitsServiceSoap getWsWorkunitsServiceSoap() {
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap;
  }
  
  public wsworkunits.ws.hpccsystems.GVCAjaxGraphResponse GVCAjaxGraph(wsworkunits.ws.hpccsystems.GVCAjaxGraph parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.GVCAjaxGraph(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUAbortResponse WUAbort(wsworkunits.ws.hpccsystems.WUAbort parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAbort(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUActionResponse WUAction(wsworkunits.ws.hpccsystems.WUAction parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAction(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUAddLocalFileToWorkunitResponse WUAddLocalFileToWorkunit(wsworkunits.ws.hpccsystems.WUAddLocalFileToWorkunit parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAddLocalFileToWorkunit(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUDebugResponse WUCDebug(wsworkunits.ws.hpccsystems.WUCDebug parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCDebug(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUClusterJobQueueLOGResponse WUClusterJobQueueLOG(wsworkunits.ws.hpccsystems.WUClusterJobQueueLOG parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueLOG(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUClusterJobQueueXLSResponse WUClusterJobQueueXLS(wsworkunits.ws.hpccsystems.WUClusterJobQueueXLS parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueXLS(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUClusterJobSummaryXLSResponse WUClusterJobSummaryXLS(wsworkunits.ws.hpccsystems.WUClusterJobSummaryXLS parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobSummaryXLS(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUClusterJobXLSResponse WUClusterJobXLS(wsworkunits.ws.hpccsystems.WUClusterJobXLS parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobXLS(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUCompileECLResponse WUCompileECL(wsworkunits.ws.hpccsystems.WUCompileECL parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCompileECL(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUCopyLogicalFilesResponse WUCopyLogicalFiles(wsworkunits.ws.hpccsystems.WUCopyLogicalFiles parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCopyLogicalFiles(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUCreateResponse WUCreate() throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreate();
  }
  
  public wsworkunits.ws.hpccsystems.WUUpdateResponse WUCreateAndUpdate(wsworkunits.ws.hpccsystems.WUCreateAndUpdate parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreateAndUpdate(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUDeleteResponse WUDelete(wsworkunits.ws.hpccsystems.WUDelete parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDelete(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUDeployWorkunitResponse WUDeployWorkunit(wsworkunits.ws.hpccsystems.WUDeployWorkunit parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDeployWorkunit(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUExportResponse WUExport(wsworkunits.ws.hpccsystems.WUExport parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUExport(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WULogFileResponse WUFile(wsworkunits.ws.hpccsystems.WUFile parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUFile(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUGVCGraphInfoResponse WUGVCGraphInfo(wsworkunits.ws.hpccsystems.WUGVCGraphInfo parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGVCGraphInfo(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUGetDependancyTreesResponse WUGetDependancyTrees(wsworkunits.ws.hpccsystems.WUGetDependancyTrees parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetDependancyTrees(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUGetGraphResponse WUGetGraph(wsworkunits.ws.hpccsystems.WUGetGraph parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetGraph(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUGraphInfoResponse WUGraphInfo(wsworkunits.ws.hpccsystems.WUGraphInfo parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphInfo(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUGraphTimingResponse WUGraphTiming(wsworkunits.ws.hpccsystems.WUGraphTiming parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphTiming(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUInfoResponse WUInfo(wsworkunits.ws.hpccsystems.WUInfo parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfo(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUInfoResponse WUInfoDetails(wsworkunits.ws.hpccsystems.WUInfoDetails parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfoDetails(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUJobListResponse WUJobList(wsworkunits.ws.hpccsystems.WUJobList parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUJobList(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUListLocalFileRequiredResponse WUListLocalFileRequired(wsworkunits.ws.hpccsystems.WUListLocalFileRequired parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListLocalFileRequired(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUProcessGraphResponse WUProcessGraph(wsworkunits.ws.hpccsystems.WUProcessGraph parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProcessGraph(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUProtectResponse WUProtect(wsworkunits.ws.hpccsystems.WUProtect parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProtect(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUPublishWorkunitResponse WUPublishWorkunit(wsworkunits.ws.hpccsystems.WUPublishWorkunit parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPublishWorkunit(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUPushEventResponse WUPushEvent(wsworkunits.ws.hpccsystems.WUPushEvent parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPushEvent(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUQueryResponse WUQuery(wsworkunits.ws.hpccsystems.WUQuery parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuery(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUQuerySetActionAliasesResponse WUQuerysetActionAliases(wsworkunits.ws.hpccsystems.WUQuerysetActionAliases parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetActionAliases(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUQuerySetActionQueriesResponse WUQuerysetActionQueries(wsworkunits.ws.hpccsystems.WUQuerysetActionQueries parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetActionQueries(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUQuerySetDetailsResponse WUQuerysetDetails(wsworkunits.ws.hpccsystems.WUQuerysetDetails parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetDetails(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUQuerysetsResponse WUQuerysets(wsworkunits.ws.hpccsystems.WUQuerysets parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysets(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUResubmitResponse WUResubmit(wsworkunits.ws.hpccsystems.WUResubmit parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResubmit(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUResultResponse WUResult(wsworkunits.ws.hpccsystems.WUResult parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResult(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUResultBinResponse WUResultBin(wsworkunits.ws.hpccsystems.WUResultBin parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultBin(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUResultSummaryResponse WUResultSummary(wsworkunits.ws.hpccsystems.WUResultSummary parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultSummary(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUResultViewResponse WUResultView(wsworkunits.ws.hpccsystems.WUResultView parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultView(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUScheduleResponse WUSchedule(wsworkunits.ws.hpccsystems.WUSchedule parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSchedule(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUShowScheduledResponse WUShowScheduled(wsworkunits.ws.hpccsystems.WUShowScheduled parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUShowScheduled(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUSubmitResponse WUSubmit(wsworkunits.ws.hpccsystems.WUSubmit parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSubmit(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUSyntaxCheckResponse WUSyntaxCheckECL(wsworkunits.ws.hpccsystems.WUSyntaxCheckECL parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSyntaxCheckECL(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUUpdateResponse WUUpdate(wsworkunits.ws.hpccsystems.WUUpdate parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUUpdate(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUWaitResponse WUWaitCompiled(wsworkunits.ws.hpccsystems.WUWaitCompiled parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitCompiled(parameters);
  }
  
  public wsworkunits.ws.hpccsystems.WUWaitResponse WUWaitComplete(wsworkunits.ws.hpccsystems.WUWaitComplete parameters) throws java.rmi.RemoteException, wsworkunits.ws.hpccsystems.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitComplete(parameters);
  }
  
  
}