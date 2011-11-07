/**
 * WsAttributesServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seisint.webservices.WsAttributes;

public interface WsAttributesServiceSoap extends java.rmi.Remote {
    public com.seisint.webservices.WsAttributes.UpdateAttributesResponse checkinAttributes(com.seisint.webservices.WsAttributes.CheckinAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.UpdateAttributesResponse checkoutAttributes(com.seisint.webservices.WsAttributes.CheckoutAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.CreateAttributeResponse createAttribute(com.seisint.webservices.WsAttributes.CreateAttribute parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.CreateLabelResponse createLabel(com.seisint.webservices.WsAttributes.CreateLabel parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.CreateModuleResponse createModule(com.seisint.webservices.WsAttributes.CreateModule parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.UpdateAttributesResponse deleteAttributes(com.seisint.webservices.WsAttributes.DeleteAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.DeleteLabelResponse deleteLabel(com.seisint.webservices.WsAttributes.DeleteLabel parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.DeleteModuleResponse deleteModule(com.seisint.webservices.WsAttributes.DeleteModule parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.FindAttributesResponse findAttributes(com.seisint.webservices.WsAttributes.FindAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.GetAttributeResponse getAttribute(com.seisint.webservices.WsAttributes.GetAttribute parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.GetAttributeHistoryResponse getAttributeHistory(com.seisint.webservices.WsAttributes.GetAttributeHistory parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.GetAttributeLabelsResponse getAttributeLabels(com.seisint.webservices.WsAttributes.GetAttributeLabels parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.GetAttributesResponse getAttributes(com.seisint.webservices.WsAttributes.GetAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.GetLabelsResponse getLabels(com.seisint.webservices.WsAttributes.GetLabels parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.GetModulesResponse getModules(com.seisint.webservices.WsAttributes.GetModules parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.UpdateAttributesResponse importAttributes(com.seisint.webservices.WsAttributes.ImportAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.ListAttributeTypesResponse listAttributeTypes() throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.UpdateAttributesResponse renameAttributes(com.seisint.webservices.WsAttributes.RenameAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.RenameModuleResponse renameModule(com.seisint.webservices.WsAttributes.RenameModule parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.UpdateAttributesResponse rollbackAttributes(com.seisint.webservices.WsAttributes.RollbackAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.UpdateAttributesResponse saveAttributes(com.seisint.webservices.WsAttributes.SaveAttributes parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.SupportsEarMarkResponse supportsEarMark() throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
    public com.seisint.webservices.WsAttributes.UpdateLabelResponse updateLabel(com.seisint.webservices.WsAttributes.UpdateLabel parameters) throws java.rmi.RemoteException, com.seisint.webservices.WsAttributes.ArrayOfEspException;
}
