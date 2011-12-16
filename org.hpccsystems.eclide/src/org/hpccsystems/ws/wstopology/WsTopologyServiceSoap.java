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
/**
 * WsTopologyServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public interface WsTopologyServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.wstopology.SystemLogResponse systemLog(org.hpccsystems.ws.wstopology.SystemLogRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpClusterInfoResponse tpClusterInfo(org.hpccsystems.ws.wstopology.TpClusterInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpClusterQueryResponse tpClusterQuery(org.hpccsystems.ws.wstopology.TpClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpGetComponentFileResponse tpGetComponentFile(org.hpccsystems.ws.wstopology.TpGetComponentFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpGroupQueryResponse tpGroupQuery(org.hpccsystems.ws.wstopology.TpGroupQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpLogFileResponse tpLogFile(org.hpccsystems.ws.wstopology.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpLogFileResponse tpLogFileDisplay(org.hpccsystems.ws.wstopology.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpLogicalClusterQueryResponse tpLogicalClusterQuery(org.hpccsystems.ws.wstopology.TpLogicalClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpMachineQueryResponse tpMachineQuery(org.hpccsystems.ws.wstopology.TpMachineQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpServiceQueryResponse tpServiceQuery(org.hpccsystems.ws.wstopology.TpServiceQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpSetMachineStatusResponse tpSetMachineStatus(org.hpccsystems.ws.wstopology.TpSetMachineStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpSwapNodeResponse tpSwapNode(org.hpccsystems.ws.wstopology.TpSwapNodeRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpTargetClusterQueryResponse tpTargetClusterQuery(org.hpccsystems.ws.wstopology.TpTargetClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
    public org.hpccsystems.ws.wstopology.TpXMLFileResponse tpXMLFile(org.hpccsystems.ws.wstopology.TpXMLFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wstopology.ArrayOfEspException;
}
