/**
 * WsSMCLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wssmc;

public class WsSMCLocator extends org.apache.axis.client.Service implements WsSMC {

    public WsSMCLocator() {
    }


    public WsSMCLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsSMCLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsSMCServiceSoap
    private java.lang.String WsSMCServiceSoap_address = "http://192.168.1.201:8010/WsSMC?ver_=1.15";

    public java.lang.String getWsSMCServiceSoapAddress() {
        return WsSMCServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsSMCServiceSoapWSDDServiceName = "WsSMCServiceSoap";

    public java.lang.String getWsSMCServiceSoapWSDDServiceName() {
        return WsSMCServiceSoapWSDDServiceName;
    }

    public void setWsSMCServiceSoapWSDDServiceName(java.lang.String name) {
        WsSMCServiceSoapWSDDServiceName = name;
    }

    public WsSMCServiceSoap getWsSMCServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsSMCServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsSMCServiceSoap(endpoint);
    }

    public WsSMCServiceSoap getWsSMCServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            WsSMCServiceSoapStub _stub = new WsSMCServiceSoapStub(portAddress, this);
            _stub.setPortName(getWsSMCServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsSMCServiceSoapEndpointAddress(java.lang.String address) {
        WsSMCServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (WsSMCServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                WsSMCServiceSoapStub _stub = new WsSMCServiceSoapStub(new java.net.URL(WsSMCServiceSoap_address), this);
                _stub.setPortName(getWsSMCServiceSoapWSDDServiceName());
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
        if ("WsSMCServiceSoap".equals(inputPortName)) {
            return getWsSMCServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "WsSMC");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "WsSMCServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsSMCServiceSoap".equals(portName)) {
            setWsSMCServiceSoapEndpointAddress(address);
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
