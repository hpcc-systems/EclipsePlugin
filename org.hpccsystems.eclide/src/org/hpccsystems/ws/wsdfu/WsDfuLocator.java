/**
 * WsDfuLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class WsDfuLocator extends org.apache.axis.client.Service implements org.hpccsystems.ws.wsdfu.WsDfu {

    public WsDfuLocator() {
    }


    public WsDfuLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsDfuLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsDfuServiceSoap
    private java.lang.String WsDfuServiceSoap_address = "http://192.168.2.68:8010/WsDfu?ver_=1.19";

    public java.lang.String getWsDfuServiceSoapAddress() {
        return WsDfuServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsDfuServiceSoapWSDDServiceName = "WsDfuServiceSoap";

    public java.lang.String getWsDfuServiceSoapWSDDServiceName() {
        return WsDfuServiceSoapWSDDServiceName;
    }

    public void setWsDfuServiceSoapWSDDServiceName(java.lang.String name) {
        WsDfuServiceSoapWSDDServiceName = name;
    }

    public org.hpccsystems.ws.wsdfu.WsDfuServiceSoap getWsDfuServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsDfuServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsDfuServiceSoap(endpoint);
    }

    public org.hpccsystems.ws.wsdfu.WsDfuServiceSoap getWsDfuServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.hpccsystems.ws.wsdfu.WsDfuServiceSoapStub _stub = new org.hpccsystems.ws.wsdfu.WsDfuServiceSoapStub(portAddress, this);
            _stub.setPortName(getWsDfuServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsDfuServiceSoapEndpointAddress(java.lang.String address) {
        WsDfuServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.hpccsystems.ws.wsdfu.WsDfuServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.hpccsystems.ws.wsdfu.WsDfuServiceSoapStub _stub = new org.hpccsystems.ws.wsdfu.WsDfuServiceSoapStub(new java.net.URL(WsDfuServiceSoap_address), this);
                _stub.setPortName(getWsDfuServiceSoapWSDDServiceName());
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
        if ("WsDfuServiceSoap".equals(inputPortName)) {
            return getWsDfuServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "WsDfu");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "WsDfuServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsDfuServiceSoap".equals(portName)) {
            setWsDfuServiceSoapEndpointAddress(address);
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
