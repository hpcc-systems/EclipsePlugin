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
 * GetModules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class GetModules  implements java.io.Serializable {
    private java.lang.Long modifiedSince;

    private java.lang.Boolean includeDeleted;

    private java.lang.Boolean getChecksum;

    private java.lang.String label;

    private java.lang.String earMark;

    public GetModules() {
    }

    public GetModules(
           java.lang.Long modifiedSince,
           java.lang.Boolean includeDeleted,
           java.lang.Boolean getChecksum,
           java.lang.String label,
           java.lang.String earMark) {
           this.modifiedSince = modifiedSince;
           this.includeDeleted = includeDeleted;
           this.getChecksum = getChecksum;
           this.label = label;
           this.earMark = earMark;
    }


    /**
     * Gets the modifiedSince value for this GetModules.
     * 
     * @return modifiedSince
     */
    public java.lang.Long getModifiedSince() {
        return modifiedSince;
    }


    /**
     * Sets the modifiedSince value for this GetModules.
     * 
     * @param modifiedSince
     */
    public void setModifiedSince(java.lang.Long modifiedSince) {
        this.modifiedSince = modifiedSince;
    }


    /**
     * Gets the includeDeleted value for this GetModules.
     * 
     * @return includeDeleted
     */
    public java.lang.Boolean getIncludeDeleted() {
        return includeDeleted;
    }


    /**
     * Sets the includeDeleted value for this GetModules.
     * 
     * @param includeDeleted
     */
    public void setIncludeDeleted(java.lang.Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
    }


    /**
     * Gets the getChecksum value for this GetModules.
     * 
     * @return getChecksum
     */
    public java.lang.Boolean getGetChecksum() {
        return getChecksum;
    }


    /**
     * Sets the getChecksum value for this GetModules.
     * 
     * @param getChecksum
     */
    public void setGetChecksum(java.lang.Boolean getChecksum) {
        this.getChecksum = getChecksum;
    }


    /**
     * Gets the label value for this GetModules.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this GetModules.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the earMark value for this GetModules.
     * 
     * @return earMark
     */
    public java.lang.String getEarMark() {
        return earMark;
    }


    /**
     * Sets the earMark value for this GetModules.
     * 
     * @param earMark
     */
    public void setEarMark(java.lang.String earMark) {
        this.earMark = earMark;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetModules)) return false;
        GetModules other = (GetModules) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.modifiedSince==null && other.getModifiedSince()==null) || 
             (this.modifiedSince!=null &&
              this.modifiedSince.equals(other.getModifiedSince()))) &&
            ((this.includeDeleted==null && other.getIncludeDeleted()==null) || 
             (this.includeDeleted!=null &&
              this.includeDeleted.equals(other.getIncludeDeleted()))) &&
            ((this.getChecksum==null && other.getGetChecksum()==null) || 
             (this.getChecksum!=null &&
              this.getChecksum.equals(other.getGetChecksum()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.earMark==null && other.getEarMark()==null) || 
             (this.earMark!=null &&
              this.earMark.equals(other.getEarMark())));
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
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
        }
        if (getIncludeDeleted() != null) {
            _hashCode += getIncludeDeleted().hashCode();
        }
        if (getGetChecksum() != null) {
            _hashCode += getGetChecksum().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getEarMark() != null) {
            _hashCode += getEarMark().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetModules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetModules"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedSince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ModifiedSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "IncludeDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getChecksum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetChecksum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("earMark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "EarMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
