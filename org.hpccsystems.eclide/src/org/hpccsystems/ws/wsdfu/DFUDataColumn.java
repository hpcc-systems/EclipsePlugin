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
 * DFUDataColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUDataColumn  implements java.io.Serializable {
    private java.lang.String columnLabel;

    private java.lang.String columnType;

    private java.lang.String columnValue;

    private java.lang.Integer columnSize;

    private java.lang.Integer maxSize;

    public DFUDataColumn() {
    }

    public DFUDataColumn(
           java.lang.String columnLabel,
           java.lang.String columnType,
           java.lang.String columnValue,
           java.lang.Integer columnSize,
           java.lang.Integer maxSize) {
           this.columnLabel = columnLabel;
           this.columnType = columnType;
           this.columnValue = columnValue;
           this.columnSize = columnSize;
           this.maxSize = maxSize;
    }


    /**
     * Gets the columnLabel value for this DFUDataColumn.
     * 
     * @return columnLabel
     */
    public java.lang.String getColumnLabel() {
        return columnLabel;
    }


    /**
     * Sets the columnLabel value for this DFUDataColumn.
     * 
     * @param columnLabel
     */
    public void setColumnLabel(java.lang.String columnLabel) {
        this.columnLabel = columnLabel;
    }


    /**
     * Gets the columnType value for this DFUDataColumn.
     * 
     * @return columnType
     */
    public java.lang.String getColumnType() {
        return columnType;
    }


    /**
     * Sets the columnType value for this DFUDataColumn.
     * 
     * @param columnType
     */
    public void setColumnType(java.lang.String columnType) {
        this.columnType = columnType;
    }


    /**
     * Gets the columnValue value for this DFUDataColumn.
     * 
     * @return columnValue
     */
    public java.lang.String getColumnValue() {
        return columnValue;
    }


    /**
     * Sets the columnValue value for this DFUDataColumn.
     * 
     * @param columnValue
     */
    public void setColumnValue(java.lang.String columnValue) {
        this.columnValue = columnValue;
    }


    /**
     * Gets the columnSize value for this DFUDataColumn.
     * 
     * @return columnSize
     */
    public java.lang.Integer getColumnSize() {
        return columnSize;
    }


    /**
     * Sets the columnSize value for this DFUDataColumn.
     * 
     * @param columnSize
     */
    public void setColumnSize(java.lang.Integer columnSize) {
        this.columnSize = columnSize;
    }


    /**
     * Gets the maxSize value for this DFUDataColumn.
     * 
     * @return maxSize
     */
    public java.lang.Integer getMaxSize() {
        return maxSize;
    }


    /**
     * Sets the maxSize value for this DFUDataColumn.
     * 
     * @param maxSize
     */
    public void setMaxSize(java.lang.Integer maxSize) {
        this.maxSize = maxSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUDataColumn)) return false;
        DFUDataColumn other = (DFUDataColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.columnLabel==null && other.getColumnLabel()==null) || 
             (this.columnLabel!=null &&
              this.columnLabel.equals(other.getColumnLabel()))) &&
            ((this.columnType==null && other.getColumnType()==null) || 
             (this.columnType!=null &&
              this.columnType.equals(other.getColumnType()))) &&
            ((this.columnValue==null && other.getColumnValue()==null) || 
             (this.columnValue!=null &&
              this.columnValue.equals(other.getColumnValue()))) &&
            ((this.columnSize==null && other.getColumnSize()==null) || 
             (this.columnSize!=null &&
              this.columnSize.equals(other.getColumnSize()))) &&
            ((this.maxSize==null && other.getMaxSize()==null) || 
             (this.maxSize!=null &&
              this.maxSize.equals(other.getMaxSize())));
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
        if (getColumnLabel() != null) {
            _hashCode += getColumnLabel().hashCode();
        }
        if (getColumnType() != null) {
            _hashCode += getColumnType().hashCode();
        }
        if (getColumnValue() != null) {
            _hashCode += getColumnValue().hashCode();
        }
        if (getColumnSize() != null) {
            _hashCode += getColumnSize().hashCode();
        }
        if (getMaxSize() != null) {
            _hashCode += getMaxSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUDataColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxSize"));
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
