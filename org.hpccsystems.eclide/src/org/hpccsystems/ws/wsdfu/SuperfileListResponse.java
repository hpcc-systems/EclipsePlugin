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
 * SuperfileListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class SuperfileListResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions;

    private java.lang.String superfile;

    private java.lang.String[] subfiles;

    public SuperfileListResponse() {
    }

    public SuperfileListResponse(
           org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions,
           java.lang.String superfile,
           java.lang.String[] subfiles) {
           this.exceptions = exceptions;
           this.superfile = superfile;
           this.subfiles = subfiles;
    }


    /**
     * Gets the exceptions value for this SuperfileListResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wsdfu.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this SuperfileListResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the superfile value for this SuperfileListResponse.
     * 
     * @return superfile
     */
    public java.lang.String getSuperfile() {
        return superfile;
    }


    /**
     * Sets the superfile value for this SuperfileListResponse.
     * 
     * @param superfile
     */
    public void setSuperfile(java.lang.String superfile) {
        this.superfile = superfile;
    }


    /**
     * Gets the subfiles value for this SuperfileListResponse.
     * 
     * @return subfiles
     */
    public java.lang.String[] getSubfiles() {
        return subfiles;
    }


    /**
     * Sets the subfiles value for this SuperfileListResponse.
     * 
     * @param subfiles
     */
    public void setSubfiles(java.lang.String[] subfiles) {
        this.subfiles = subfiles;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuperfileListResponse)) return false;
        SuperfileListResponse other = (SuperfileListResponse) obj;
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
            ((this.superfile==null && other.getSuperfile()==null) || 
             (this.superfile!=null &&
              this.superfile.equals(other.getSuperfile()))) &&
            ((this.subfiles==null && other.getSubfiles()==null) || 
             (this.subfiles!=null &&
              java.util.Arrays.equals(this.subfiles, other.getSubfiles())));
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
        if (getSuperfile() != null) {
            _hashCode += getSuperfile().hashCode();
        }
        if (getSubfiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubfiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubfiles(), i);
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
        new org.apache.axis.description.TypeDesc(SuperfileListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "superfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "subfiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Item"));
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
