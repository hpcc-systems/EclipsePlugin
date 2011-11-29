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
 * WUAbort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUAbort  implements java.io.Serializable {
    private java.lang.String[] wuids;

    private java.lang.Integer blockTillFinishTimer;

    public WUAbort() {
    }

    public WUAbort(
           java.lang.String[] wuids,
           java.lang.Integer blockTillFinishTimer) {
           this.wuids = wuids;
           this.blockTillFinishTimer = blockTillFinishTimer;
    }


    /**
     * Gets the wuids value for this WUAbort.
     * 
     * @return wuids
     */
    public java.lang.String[] getWuids() {
        return wuids;
    }


    /**
     * Sets the wuids value for this WUAbort.
     * 
     * @param wuids
     */
    public void setWuids(java.lang.String[] wuids) {
        this.wuids = wuids;
    }


    /**
     * Gets the blockTillFinishTimer value for this WUAbort.
     * 
     * @return blockTillFinishTimer
     */
    public java.lang.Integer getBlockTillFinishTimer() {
        return blockTillFinishTimer;
    }


    /**
     * Sets the blockTillFinishTimer value for this WUAbort.
     * 
     * @param blockTillFinishTimer
     */
    public void setBlockTillFinishTimer(java.lang.Integer blockTillFinishTimer) {
        this.blockTillFinishTimer = blockTillFinishTimer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUAbort)) return false;
        WUAbort other = (WUAbort) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuids==null && other.getWuids()==null) || 
             (this.wuids!=null &&
              java.util.Arrays.equals(this.wuids, other.getWuids()))) &&
            ((this.blockTillFinishTimer==null && other.getBlockTillFinishTimer()==null) || 
             (this.blockTillFinishTimer!=null &&
              this.blockTillFinishTimer.equals(other.getBlockTillFinishTimer())));
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
        if (getWuids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWuids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWuids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBlockTillFinishTimer() != null) {
            _hashCode += getBlockTillFinishTimer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUAbort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAbort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuids");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockTillFinishTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BlockTillFinishTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
