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
 * TpClusterInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpClusterInfoResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions;

    private java.lang.String name;

    private java.lang.String workUnit;

    private org.hpccsystems.ws.wstopology.TpQueue[] tpQueues;

    public TpClusterInfoResponse() {
    }

    public TpClusterInfoResponse(
           org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions,
           java.lang.String name,
           java.lang.String workUnit,
           org.hpccsystems.ws.wstopology.TpQueue[] tpQueues) {
           this.exceptions = exceptions;
           this.name = name;
           this.workUnit = workUnit;
           this.tpQueues = tpQueues;
    }


    /**
     * Gets the exceptions value for this TpClusterInfoResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wstopology.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this TpClusterInfoResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the name value for this TpClusterInfoResponse.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TpClusterInfoResponse.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the workUnit value for this TpClusterInfoResponse.
     * 
     * @return workUnit
     */
    public java.lang.String getWorkUnit() {
        return workUnit;
    }


    /**
     * Sets the workUnit value for this TpClusterInfoResponse.
     * 
     * @param workUnit
     */
    public void setWorkUnit(java.lang.String workUnit) {
        this.workUnit = workUnit;
    }


    /**
     * Gets the tpQueues value for this TpClusterInfoResponse.
     * 
     * @return tpQueues
     */
    public org.hpccsystems.ws.wstopology.TpQueue[] getTpQueues() {
        return tpQueues;
    }


    /**
     * Sets the tpQueues value for this TpClusterInfoResponse.
     * 
     * @param tpQueues
     */
    public void setTpQueues(org.hpccsystems.ws.wstopology.TpQueue[] tpQueues) {
        this.tpQueues = tpQueues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpClusterInfoResponse)) return false;
        TpClusterInfoResponse other = (TpClusterInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exceptions==null && other.getExceptions()==null) || 
             (this.exceptions!=null &&
              this.exceptions.equals(other.getExceptions()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.workUnit==null && other.getWorkUnit()==null) || 
             (this.workUnit!=null &&
              this.workUnit.equals(other.getWorkUnit()))) &&
            ((this.tpQueues==null && other.getTpQueues()==null) || 
             (this.tpQueues!=null &&
              java.util.Arrays.equals(this.tpQueues, other.getTpQueues())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExceptions() != null) {
            _hashCode += getExceptions().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getWorkUnit() != null) {
            _hashCode += getWorkUnit().hashCode();
        }
        if (getTpQueues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTpQueues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTpQueues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpClusterInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpClusterInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "WorkUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpQueues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpQueues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpQueue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpQueue"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
