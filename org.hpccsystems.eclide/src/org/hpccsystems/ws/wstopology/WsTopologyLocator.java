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
 * WsTopologyLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class WsTopologyLocator extends org.apache.axis.client.Service implements org.hpccsystems.ws.wstopology.WsTopology {

    public WsTopologyLocator() {
    }


    public WsTopologyLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsTopologyLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsTopologyServiceSoap
    private java.lang.String WsTopologyServiceSoap_address = "http://192.168.2.68:8010/WsTopology?ver_=1.17";

    @Override
	public java.lang.String getWsTopologyServiceSoapAddress() {
        return WsTopologyServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsTopologyServiceSoapWSDDServiceName = "WsTopologyServiceSoap";

    public java.lang.String getWsTopologyServiceSoapWSDDServiceName() {
        return WsTopologyServiceSoapWSDDServiceName;
    }

    public void setWsTopologyServiceSoapWSDDServiceName(java.lang.String name) {
        WsTopologyServiceSoapWSDDServiceName = name;
    }

    @Override
	public org.hpccsystems.ws.wstopology.WsTopologyServiceSoap getWsTopologyServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsTopologyServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsTopologyServiceSoap(endpoint);
    }

    @Override
	public org.hpccsystems.ws.wstopology.WsTopologyServiceSoap getWsTopologyServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.hpccsystems.ws.wstopology.WsTopologyServiceSoapStub _stub = new org.hpccsystems.ws.wstopology.WsTopologyServiceSoapStub(portAddress, this);
            _stub.setPortName(getWsTopologyServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsTopologyServiceSoapEndpointAddress(java.lang.String address) {
        WsTopologyServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @Override
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.hpccsystems.ws.wstopology.WsTopologyServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.hpccsystems.ws.wstopology.WsTopologyServiceSoapStub _stub = new org.hpccsystems.ws.wstopology.WsTopologyServiceSoapStub(new java.net.URL(WsTopologyServiceSoap_address), this);
                _stub.setPortName(getWsTopologyServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @Override
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WsTopologyServiceSoap".equals(inputPortName)) {
            return getWsTopologyServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    @Override
	public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "WsTopology");
    }

    private java.util.HashSet ports = null;

    @Override
	public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "WsTopologyServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsTopologyServiceSoap".equals(portName)) {
            setWsTopologyServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
