/**
 * WsAttributesServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public interface WsAttributesServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse checkinAttributes(org.hpccsystems.ws.WsAttributes.CheckinAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse checkoutAttributes(org.hpccsystems.ws.WsAttributes.CheckoutAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.CreateAttributeResponse createAttribute(org.hpccsystems.ws.WsAttributes.CreateAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.CreateLabelResponse createLabel(org.hpccsystems.ws.WsAttributes.CreateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.CreateModuleResponse createModule(org.hpccsystems.ws.WsAttributes.CreateModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse deleteAttributes(org.hpccsystems.ws.WsAttributes.DeleteAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.DeleteLabelResponse deleteLabel(org.hpccsystems.ws.WsAttributes.DeleteLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.DeleteModuleResponse deleteModule(org.hpccsystems.ws.WsAttributes.DeleteModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.FindAttributesResponse findAttributes(org.hpccsystems.ws.WsAttributes.FindAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.GetAttributeResponse getAttribute(org.hpccsystems.ws.WsAttributes.GetAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.GetAttributeHistoryResponse getAttributeHistory(org.hpccsystems.ws.WsAttributes.GetAttributeHistory parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.GetAttributeLabelsResponse getAttributeLabels(org.hpccsystems.ws.WsAttributes.GetAttributeLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.GetAttributesResponse getAttributes(org.hpccsystems.ws.WsAttributes.GetAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.GetLabelsResponse getLabels(org.hpccsystems.ws.WsAttributes.GetLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.GetModulesResponse getModules(org.hpccsystems.ws.WsAttributes.GetModules parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse importAttributes(org.hpccsystems.ws.WsAttributes.ImportAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.ListAttributeTypesResponse listAttributeTypes() throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse renameAttributes(org.hpccsystems.ws.WsAttributes.RenameAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.RenameModuleResponse renameModule(org.hpccsystems.ws.WsAttributes.RenameModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse rollbackAttributes(org.hpccsystems.ws.WsAttributes.RollbackAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse saveAttributes(org.hpccsystems.ws.WsAttributes.SaveAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.SupportsEarMarkResponse supportsEarMark() throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
    public org.hpccsystems.ws.WsAttributes.UpdateLabelResponse updateLabel(org.hpccsystems.ws.WsAttributes.UpdateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException;
}
