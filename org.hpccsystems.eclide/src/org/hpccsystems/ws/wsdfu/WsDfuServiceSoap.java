/**
 * WsDfuServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public interface WsDfuServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.wsdfu.AddResponse add(org.hpccsystems.ws.wsdfu.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.AddRemoteResponse addRemote(org.hpccsystems.ws.wsdfu.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.wsdfu.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.wsdfu.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.wsdfu.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.wsdfu.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.wsdfu.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.wsdfu.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.DFUInfoResponse DFUInfo(org.hpccsystems.ws.wsdfu.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.DFUQueryResponse DFUQuery(org.hpccsystems.ws.wsdfu.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.DFUSearchResponse DFUSearch(org.hpccsystems.ws.wsdfu.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.wsdfu.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.wsdfu.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.SavexmlResponse savexml(org.hpccsystems.ws.wsdfu.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.SuperfileActionResponse superfileAction(org.hpccsystems.ws.wsdfu.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.SuperfileAddRawResponse superfileAddRaw(org.hpccsystems.ws.wsdfu.SuperfileAddRawRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
    public org.hpccsystems.ws.wsdfu.SuperfileListResponse superfileList(org.hpccsystems.ws.wsdfu.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException;
}
