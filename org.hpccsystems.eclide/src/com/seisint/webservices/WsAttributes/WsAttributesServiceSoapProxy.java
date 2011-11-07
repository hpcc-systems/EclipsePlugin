package com.seisint.webservices.WsAttributes;

public class WsAttributesServiceSoapProxy implements com.seisint.webservices.WsAttributes.WsAttributesServiceSoap {
  private String _endpoint = null;
  private com.seisint.webservices.WsAttributes.WsAttributesServiceSoap wsAttributesServiceSoap = null;
  
  public WsAttributesServiceSoapProxy() {
    _initWsAttributesServiceSoapProxy();
  }
  
  public WsAttributesServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsAttributesServiceSoapProxy();
  }
  
  private void _initWsAttributesServiceSoapProxy() {
    try {
      wsAttributesServiceSoap = (new com.seisint.webservices.WsAttributes.WsAttributesLocator()).getWsAttributesServiceSoap();
      if (wsAttributesServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsAttributesServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsAttributesServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsAttributesServiceSoap != null)
      ((javax.xml.rpc.Stub)wsAttributesServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.seisint.webservices.WsAttributes.WsAttributesServiceSoap getWsAttributesServiceSoap() {
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap;
  }
  
  public com.seisint.webservices.WsAttributes.UpdateAttributesResponse checkinAttributes(com.seisint.webservices.WsAttributes.CheckinAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.checkinAttributes(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.UpdateAttributesResponse checkoutAttributes(com.seisint.webservices.WsAttributes.CheckoutAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.checkoutAttributes(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.CreateAttributeResponse createAttribute(com.seisint.webservices.WsAttributes.CreateAttribute parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createAttribute(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.CreateLabelResponse createLabel(com.seisint.webservices.WsAttributes.CreateLabel parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createLabel(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.CreateModuleResponse createModule(com.seisint.webservices.WsAttributes.CreateModule parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createModule(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.UpdateAttributesResponse deleteAttributes(com.seisint.webservices.WsAttributes.DeleteAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteAttributes(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.DeleteLabelResponse deleteLabel(com.seisint.webservices.WsAttributes.DeleteLabel parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteLabel(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.DeleteModuleResponse deleteModule(com.seisint.webservices.WsAttributes.DeleteModule parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteModule(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.FindAttributesResponse findAttributes(com.seisint.webservices.WsAttributes.FindAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.findAttributes(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.GetAttributeResponse getAttribute(com.seisint.webservices.WsAttributes.GetAttribute parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttribute(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.GetAttributeHistoryResponse getAttributeHistory(com.seisint.webservices.WsAttributes.GetAttributeHistory parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributeHistory(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.GetAttributeLabelsResponse getAttributeLabels(com.seisint.webservices.WsAttributes.GetAttributeLabels parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributeLabels(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.GetAttributesResponse getAttributes(com.seisint.webservices.WsAttributes.GetAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributes(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.GetLabelsResponse getLabels(com.seisint.webservices.WsAttributes.GetLabels parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getLabels(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.GetModulesResponse getModules(com.seisint.webservices.WsAttributes.GetModules parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getModules(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.UpdateAttributesResponse importAttributes(com.seisint.webservices.WsAttributes.ImportAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.importAttributes(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.ListAttributeTypesResponse listAttributeTypes() throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.listAttributeTypes();
  }
  
  public com.seisint.webservices.WsAttributes.UpdateAttributesResponse renameAttributes(com.seisint.webservices.WsAttributes.RenameAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.renameAttributes(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.RenameModuleResponse renameModule(com.seisint.webservices.WsAttributes.RenameModule parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.renameModule(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.UpdateAttributesResponse rollbackAttributes(com.seisint.webservices.WsAttributes.RollbackAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.rollbackAttributes(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.UpdateAttributesResponse saveAttributes(com.seisint.webservices.WsAttributes.SaveAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.saveAttributes(parameters);
  }
  
  public com.seisint.webservices.WsAttributes.SupportsEarMarkResponse supportsEarMark() throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.supportsEarMark();
  }
  
  public com.seisint.webservices.WsAttributes.UpdateLabelResponse updateLabel(com.seisint.webservices.WsAttributes.UpdateLabel parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.updateLabel(parameters);
  }
  
  
}