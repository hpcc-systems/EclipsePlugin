/**
 * WUJobList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUJobList  implements java.io.Serializable {
    private java.lang.String cluster;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.Boolean showAll;

    private java.lang.Integer businessStartHour;

    private java.lang.Integer businessEndHour;

    public WUJobList() {
    }

    public WUJobList(
           java.lang.String cluster,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.Boolean showAll,
           java.lang.Integer businessStartHour,
           java.lang.Integer businessEndHour) {
           this.cluster = cluster;
           this.startDate = startDate;
           this.endDate = endDate;
           this.showAll = showAll;
           this.businessStartHour = businessStartHour;
           this.businessEndHour = businessEndHour;
    }


    /**
     * Gets the cluster value for this WUJobList.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this WUJobList.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the startDate value for this WUJobList.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this WUJobList.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this WUJobList.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this WUJobList.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the showAll value for this WUJobList.
     * 
     * @return showAll
     */
    public java.lang.Boolean getShowAll() {
        return showAll;
    }


    /**
     * Sets the showAll value for this WUJobList.
     * 
     * @param showAll
     */
    public void setShowAll(java.lang.Boolean showAll) {
        this.showAll = showAll;
    }


    /**
     * Gets the businessStartHour value for this WUJobList.
     * 
     * @return businessStartHour
     */
    public java.lang.Integer getBusinessStartHour() {
        return businessStartHour;
    }


    /**
     * Sets the businessStartHour value for this WUJobList.
     * 
     * @param businessStartHour
     */
    public void setBusinessStartHour(java.lang.Integer businessStartHour) {
        this.businessStartHour = businessStartHour;
    }


    /**
     * Gets the businessEndHour value for this WUJobList.
     * 
     * @return businessEndHour
     */
    public java.lang.Integer getBusinessEndHour() {
        return businessEndHour;
    }


    /**
     * Sets the businessEndHour value for this WUJobList.
     * 
     * @param businessEndHour
     */
    public void setBusinessEndHour(java.lang.Integer businessEndHour) {
        this.businessEndHour = businessEndHour;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUJobList)) return false;
        WUJobList other = (WUJobList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.showAll==null && other.getShowAll()==null) || 
             (this.showAll!=null &&
              this.showAll.equals(other.getShowAll()))) &&
            ((this.businessStartHour==null && other.getBusinessStartHour()==null) || 
             (this.businessStartHour!=null &&
              this.businessStartHour.equals(other.getBusinessStartHour()))) &&
            ((this.businessEndHour==null && other.getBusinessEndHour()==null) || 
             (this.businessEndHour!=null &&
              this.businessEndHour.equals(other.getBusinessEndHour())));
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
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getShowAll() != null) {
            _hashCode += getShowAll().hashCode();
        }
        if (getBusinessStartHour() != null) {
            _hashCode += getBusinessStartHour().hashCode();
        }
        if (getBusinessEndHour() != null) {
            _hashCode += getBusinessEndHour().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUJobList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUJobList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showAll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ShowAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessStartHour");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BusinessStartHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessEndHour");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BusinessEndHour"));
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
