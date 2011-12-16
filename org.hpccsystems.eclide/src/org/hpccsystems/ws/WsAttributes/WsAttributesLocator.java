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
 * WsAttributesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class WsAttributesLocator extends org.apache.axis.client.Service implements org.hpccsystems.ws.WsAttributes.WsAttributes {

    public WsAttributesLocator() {
    }


    public WsAttributesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsAttributesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsAttributesServiceSoap
    private java.lang.String WsAttributesServiceSoap_address = "http://10.173.84.202:8145/WsAttributes?ver_=1.2";

    public java.lang.String getWsAttributesServiceSoapAddress() {
        return WsAttributesServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsAttributesServiceSoapWSDDServiceName = "WsAttributesServiceSoap";

    public java.lang.String getWsAttributesServiceSoapWSDDServiceName() {
        return WsAttributesServiceSoapWSDDServiceName;
    }

    public void setWsAttributesServiceSoapWSDDServiceName(java.lang.String name) {
        WsAttributesServiceSoapWSDDServiceName = name;
    }

    public org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoap getWsAttributesServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsAttributesServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsAttributesServiceSoap(endpoint);
    }

    public org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoap getWsAttributesServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoapStub _stub = new org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoapStub(portAddress, this);
            _stub.setPortName(getWsAttributesServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsAttributesServiceSoapEndpointAddress(java.lang.String address) {
        WsAttributesServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoapStub _stub = new org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoapStub(new java.net.URL(WsAttributesServiceSoap_address), this);
                _stub.setPortName(getWsAttributesServiceSoapWSDDServiceName());
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
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WsAttributesServiceSoap".equals(inputPortName)) {
            return getWsAttributesServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "WsAttributes");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "WsAttributesServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsAttributesServiceSoap".equals(portName)) {
            setWsAttributesServiceSoapEndpointAddress(address);
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
