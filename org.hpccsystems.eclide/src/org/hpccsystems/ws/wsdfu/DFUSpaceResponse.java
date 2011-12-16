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
 * DFUSpaceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUSpaceResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions;

    private java.lang.String countBy;

    private java.lang.String scopeUnder;

    private java.lang.String ownerUnder;

    private java.lang.String interval;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private org.hpccsystems.ws.wsdfu.DFUSpaceItem[] DFUSpaceItems;

    public DFUSpaceResponse() {
    }

    public DFUSpaceResponse(
           org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions,
           java.lang.String countBy,
           java.lang.String scopeUnder,
           java.lang.String ownerUnder,
           java.lang.String interval,
           java.lang.String startDate,
           java.lang.String endDate,
           org.hpccsystems.ws.wsdfu.DFUSpaceItem[] DFUSpaceItems) {
           this.exceptions = exceptions;
           this.countBy = countBy;
           this.scopeUnder = scopeUnder;
           this.ownerUnder = ownerUnder;
           this.interval = interval;
           this.startDate = startDate;
           this.endDate = endDate;
           this.DFUSpaceItems = DFUSpaceItems;
    }


    /**
     * Gets the exceptions value for this DFUSpaceResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wsdfu.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DFUSpaceResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the countBy value for this DFUSpaceResponse.
     * 
     * @return countBy
     */
    public java.lang.String getCountBy() {
        return countBy;
    }


    /**
     * Sets the countBy value for this DFUSpaceResponse.
     * 
     * @param countBy
     */
    public void setCountBy(java.lang.String countBy) {
        this.countBy = countBy;
    }


    /**
     * Gets the scopeUnder value for this DFUSpaceResponse.
     * 
     * @return scopeUnder
     */
    public java.lang.String getScopeUnder() {
        return scopeUnder;
    }


    /**
     * Sets the scopeUnder value for this DFUSpaceResponse.
     * 
     * @param scopeUnder
     */
    public void setScopeUnder(java.lang.String scopeUnder) {
        this.scopeUnder = scopeUnder;
    }


    /**
     * Gets the ownerUnder value for this DFUSpaceResponse.
     * 
     * @return ownerUnder
     */
    public java.lang.String getOwnerUnder() {
        return ownerUnder;
    }


    /**
     * Sets the ownerUnder value for this DFUSpaceResponse.
     * 
     * @param ownerUnder
     */
    public void setOwnerUnder(java.lang.String ownerUnder) {
        this.ownerUnder = ownerUnder;
    }


    /**
     * Gets the interval value for this DFUSpaceResponse.
     * 
     * @return interval
     */
    public java.lang.String getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this DFUSpaceResponse.
     * 
     * @param interval
     */
    public void setInterval(java.lang.String interval) {
        this.interval = interval;
    }


    /**
     * Gets the startDate value for this DFUSpaceResponse.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DFUSpaceResponse.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this DFUSpaceResponse.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DFUSpaceResponse.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the DFUSpaceItems value for this DFUSpaceResponse.
     * 
     * @return DFUSpaceItems
     */
    public org.hpccsystems.ws.wsdfu.DFUSpaceItem[] getDFUSpaceItems() {
        return DFUSpaceItems;
    }


    /**
     * Sets the DFUSpaceItems value for this DFUSpaceResponse.
     * 
     * @param DFUSpaceItems
     */
    public void setDFUSpaceItems(org.hpccsystems.ws.wsdfu.DFUSpaceItem[] DFUSpaceItems) {
        this.DFUSpaceItems = DFUSpaceItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUSpaceResponse)) return false;
        DFUSpaceResponse other = (DFUSpaceResponse) obj;
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
            ((this.countBy==null && other.getCountBy()==null) || 
             (this.countBy!=null &&
              this.countBy.equals(other.getCountBy()))) &&
            ((this.scopeUnder==null && other.getScopeUnder()==null) || 
             (this.scopeUnder!=null &&
              this.scopeUnder.equals(other.getScopeUnder()))) &&
            ((this.ownerUnder==null && other.getOwnerUnder()==null) || 
             (this.ownerUnder!=null &&
              this.ownerUnder.equals(other.getOwnerUnder()))) &&
            ((this.interval==null && other.getInterval()==null) || 
             (this.interval!=null &&
              this.interval.equals(other.getInterval()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.DFUSpaceItems==null && other.getDFUSpaceItems()==null) || 
             (this.DFUSpaceItems!=null &&
              java.util.Arrays.equals(this.DFUSpaceItems, other.getDFUSpaceItems())));
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
        if (getCountBy() != null) {
            _hashCode += getCountBy().hashCode();
        }
        if (getScopeUnder() != null) {
            _hashCode += getScopeUnder().hashCode();
        }
        if (getOwnerUnder() != null) {
            _hashCode += getOwnerUnder().hashCode();
        }
        if (getInterval() != null) {
            _hashCode += getInterval().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getDFUSpaceItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDFUSpaceItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDFUSpaceItems(), i);
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
        new org.apache.axis.description.TypeDesc(DFUSpaceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSpaceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CountBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeUnder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ScopeUnder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerUnder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "OwnerUnder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFUSpaceItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSpaceItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSpaceItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSpaceItem"));
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
