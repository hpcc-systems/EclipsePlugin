/**
 * WsDfu.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public interface WsDfu extends javax.xml.rpc.Service {
    public java.lang.String getWsDfuServiceSoapAddress();

    public org.hpccsystems.ws.wsdfu.WsDfuServiceSoap getWsDfuServiceSoap() throws javax.xml.rpc.ServiceException;

    public org.hpccsystems.ws.wsdfu.WsDfuServiceSoap getWsDfuServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
