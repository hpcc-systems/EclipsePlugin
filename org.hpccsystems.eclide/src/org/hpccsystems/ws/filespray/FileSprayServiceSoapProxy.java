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
package org.hpccsystems.ws.filespray;

public class FileSprayServiceSoapProxy implements org.hpccsystems.ws.filespray.FileSprayServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.filespray.FileSprayServiceSoap fileSprayServiceSoap = null;
  
  public FileSprayServiceSoapProxy() {
    _initFileSprayServiceSoapProxy();
  }
  
  public FileSprayServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initFileSprayServiceSoapProxy();
  }
  
  private void _initFileSprayServiceSoapProxy() {
    try {
      fileSprayServiceSoap = (new org.hpccsystems.ws.filespray.FileSprayLocator()).getFileSprayServiceSoap();
      if (fileSprayServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fileSprayServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fileSprayServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fileSprayServiceSoap != null)
      ((javax.xml.rpc.Stub)fileSprayServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.filespray.FileSprayServiceSoap getFileSprayServiceSoap() {
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap;
  }
  
  @Override
public org.hpccsystems.ws.filespray.AbortDFUWorkunitResponse abortDFUWorkunit(org.hpccsystems.ws.filespray.AbortDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.abortDFUWorkunit(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.CopyResponse copy(org.hpccsystems.ws.filespray.Copy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.copy(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.CreateDFUWorkunitResponse createDFUWorkunit() throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.createDFUWorkunit();
  }
  
  @Override
public org.hpccsystems.ws.filespray.DFUWUFileResponse DFUWUFile(org.hpccsystems.ws.filespray.DFUWUFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWUFile(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.DFUWUSearchResponse DFUWUSearch(org.hpccsystems.ws.filespray.DFUWUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWUSearch(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.DFUWorkunitsActionResponse DFUWorkunitsAction(org.hpccsystems.ws.filespray.DFUWorkunitsActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWorkunitsAction(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.DeleteDFUWorkunitResponse deleteDFUWorkunit(org.hpccsystems.ws.filespray.DeleteDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDFUWorkunit(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.DeleteDFUWorkunitsResponse deleteDFUWorkunits(org.hpccsystems.ws.filespray.DeleteDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDFUWorkunits(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.DFUWorkunitsActionResponse deleteDropZoneFiles(org.hpccsystems.ws.filespray.DeleteDropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDropZoneFiles(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.DesprayResponse despray(org.hpccsystems.ws.filespray.Despray parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.despray(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.DfuMonitorResponse dfuMonitor(org.hpccsystems.ws.filespray.DfuMonitorRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.dfuMonitor(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.DropZoneFilesResponse dropZoneFiles(org.hpccsystems.ws.filespray.DropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.dropZoneFiles(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.EchoDateTimeResponse echoDateTime(org.hpccsystems.ws.filespray.EchoDateTime parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.echoDateTime(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.FileListResponse fileList(org.hpccsystems.ws.filespray.FileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.fileList(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.GetDFUExceptionsResponse getDFUExceptions(org.hpccsystems.ws.filespray.GetDFUExceptions parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUExceptions(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.ProgressResponse getDFUProgress(org.hpccsystems.ws.filespray.ProgressRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUProgress(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.GetDFUWorkunitResponse getDFUWorkunit(org.hpccsystems.ws.filespray.GetDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUWorkunit(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.GetDFUWorkunitsResponse getDFUWorkunits(org.hpccsystems.ws.filespray.GetDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUWorkunits(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.OpenSaveResponse openSave(org.hpccsystems.ws.filespray.OpenSaveRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.openSave(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.RenameResponse rename(org.hpccsystems.ws.filespray.Rename parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.rename(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.ReplicateResponse replicate(org.hpccsystems.ws.filespray.Replicate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.replicate(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.ShowResultResponse showResult(org.hpccsystems.ws.filespray.ShowResultRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.showResult(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.SprayFixedResponse sprayFixed(org.hpccsystems.ws.filespray.SprayFixed parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.sprayFixed(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.SprayResponse sprayVariable(org.hpccsystems.ws.filespray.SprayVariable parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.sprayVariable(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.SubmitDFUWorkunitResponse submitDFUWorkunit(org.hpccsystems.ws.filespray.SubmitDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.submitDFUWorkunit(parameters);
  }
  
  @Override
public org.hpccsystems.ws.filespray.UpdateDFUWorkunitResponse updateDFUWorkunit(org.hpccsystems.ws.filespray.UpdateDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.updateDFUWorkunit(parameters);
  }
  
  
}
