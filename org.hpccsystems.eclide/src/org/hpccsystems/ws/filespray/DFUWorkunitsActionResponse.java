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
 * DFUWorkunitsActionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class DFUWorkunitsActionResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.filespray.ArrayOfEspException exceptions;

    private java.lang.String firstColumn;

    private org.hpccsystems.ws.filespray.DFUActionResult[] DFUActionResults;

    public DFUWorkunitsActionResponse() {
    }

    public DFUWorkunitsActionResponse(
           org.hpccsystems.ws.filespray.ArrayOfEspException exceptions,
           java.lang.String firstColumn,
           org.hpccsystems.ws.filespray.DFUActionResult[] DFUActionResults) {
           this.exceptions = exceptions;
           this.firstColumn = firstColumn;
           this.DFUActionResults = DFUActionResults;
    }


    /**
     * Gets the exceptions value for this DFUWorkunitsActionResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.filespray.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DFUWorkunitsActionResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.filespray.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the firstColumn value for this DFUWorkunitsActionResponse.
     * 
     * @return firstColumn
     */
    public java.lang.String getFirstColumn() {
        return firstColumn;
    }


    /**
     * Sets the firstColumn value for this DFUWorkunitsActionResponse.
     * 
     * @param firstColumn
     */
    public void setFirstColumn(java.lang.String firstColumn) {
        this.firstColumn = firstColumn;
    }


    /**
     * Gets the DFUActionResults value for this DFUWorkunitsActionResponse.
     * 
     * @return DFUActionResults
     */
    public org.hpccsystems.ws.filespray.DFUActionResult[] getDFUActionResults() {
        return DFUActionResults;
    }


    /**
     * Sets the DFUActionResults value for this DFUWorkunitsActionResponse.
     * 
     * @param DFUActionResults
     */
    public void setDFUActionResults(org.hpccsystems.ws.filespray.DFUActionResult[] DFUActionResults) {
        this.DFUActionResults = DFUActionResults;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUWorkunitsActionResponse)) return false;
        DFUWorkunitsActionResponse other = (DFUWorkunitsActionResponse) obj;
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
            ((this.firstColumn==null && other.getFirstColumn()==null) || 
             (this.firstColumn!=null &&
              this.firstColumn.equals(other.getFirstColumn()))) &&
            ((this.DFUActionResults==null && other.getDFUActionResults()==null) || 
             (this.DFUActionResults!=null &&
              java.util.Arrays.equals(this.DFUActionResults, other.getDFUActionResults())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
	public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExceptions() != null) {
            _hashCode += getExceptions().hashCode();
        }
        if (getFirstColumn() != null) {
            _hashCode += getFirstColumn().hashCode();
        }
        if (getDFUActionResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDFUActionResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDFUActionResults(), i);
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
        new org.apache.axis.description.TypeDesc(DFUWorkunitsActionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWorkunitsActionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "FirstColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFUActionResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUActionResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUActionResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUActionResult"));
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
