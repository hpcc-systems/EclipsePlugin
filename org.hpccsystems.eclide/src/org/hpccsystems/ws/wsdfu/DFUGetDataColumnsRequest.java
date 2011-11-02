/**
 * DFUGetDataColumnsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUGetDataColumnsRequest  implements java.io.Serializable {
    private java.lang.String openLogicalName;

    private java.lang.String logicalName;

    private java.lang.String filterBy;

    private java.lang.String showColumns;

    private java.lang.Integer chooseFile;

    private java.lang.String cluster;

    private java.lang.String clusterType;

    private java.lang.Long startIndex;

    private java.lang.Long endIndex;

    public DFUGetDataColumnsRequest() {
    }

    public DFUGetDataColumnsRequest(
           java.lang.String openLogicalName,
           java.lang.String logicalName,
           java.lang.String filterBy,
           java.lang.String showColumns,
           java.lang.Integer chooseFile,
           java.lang.String cluster,
           java.lang.String clusterType,
           java.lang.Long startIndex,
           java.lang.Long endIndex) {
           this.openLogicalName = openLogicalName;
           this.logicalName = logicalName;
           this.filterBy = filterBy;
           this.showColumns = showColumns;
           this.chooseFile = chooseFile;
           this.cluster = cluster;
           this.clusterType = clusterType;
           this.startIndex = startIndex;
           this.endIndex = endIndex;
    }


    /**
     * Gets the openLogicalName value for this DFUGetDataColumnsRequest.
     * 
     * @return openLogicalName
     */
    public java.lang.String getOpenLogicalName() {
        return openLogicalName;
    }


    /**
     * Sets the openLogicalName value for this DFUGetDataColumnsRequest.
     * 
     * @param openLogicalName
     */
    public void setOpenLogicalName(java.lang.String openLogicalName) {
        this.openLogicalName = openLogicalName;
    }


    /**
     * Gets the logicalName value for this DFUGetDataColumnsRequest.
     * 
     * @return logicalName
     */
    public java.lang.String getLogicalName() {
        return logicalName;
    }


    /**
     * Sets the logicalName value for this DFUGetDataColumnsRequest.
     * 
     * @param logicalName
     */
    public void setLogicalName(java.lang.String logicalName) {
        this.logicalName = logicalName;
    }


    /**
     * Gets the filterBy value for this DFUGetDataColumnsRequest.
     * 
     * @return filterBy
     */
    public java.lang.String getFilterBy() {
        return filterBy;
    }


    /**
     * Sets the filterBy value for this DFUGetDataColumnsRequest.
     * 
     * @param filterBy
     */
    public void setFilterBy(java.lang.String filterBy) {
        this.filterBy = filterBy;
    }


    /**
     * Gets the showColumns value for this DFUGetDataColumnsRequest.
     * 
     * @return showColumns
     */
    public java.lang.String getShowColumns() {
        return showColumns;
    }


    /**
     * Sets the showColumns value for this DFUGetDataColumnsRequest.
     * 
     * @param showColumns
     */
    public void setShowColumns(java.lang.String showColumns) {
        this.showColumns = showColumns;
    }


    /**
     * Gets the chooseFile value for this DFUGetDataColumnsRequest.
     * 
     * @return chooseFile
     */
    public java.lang.Integer getChooseFile() {
        return chooseFile;
    }


    /**
     * Sets the chooseFile value for this DFUGetDataColumnsRequest.
     * 
     * @param chooseFile
     */
    public void setChooseFile(java.lang.Integer chooseFile) {
        this.chooseFile = chooseFile;
    }


    /**
     * Gets the cluster value for this DFUGetDataColumnsRequest.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this DFUGetDataColumnsRequest.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the clusterType value for this DFUGetDataColumnsRequest.
     * 
     * @return clusterType
     */
    public java.lang.String getClusterType() {
        return clusterType;
    }


    /**
     * Sets the clusterType value for this DFUGetDataColumnsRequest.
     * 
     * @param clusterType
     */
    public void setClusterType(java.lang.String clusterType) {
        this.clusterType = clusterType;
    }


    /**
     * Gets the startIndex value for this DFUGetDataColumnsRequest.
     * 
     * @return startIndex
     */
    public java.lang.Long getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this DFUGetDataColumnsRequest.
     * 
     * @param startIndex
     */
    public void setStartIndex(java.lang.Long startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the endIndex value for this DFUGetDataColumnsRequest.
     * 
     * @return endIndex
     */
    public java.lang.Long getEndIndex() {
        return endIndex;
    }


    /**
     * Sets the endIndex value for this DFUGetDataColumnsRequest.
     * 
     * @param endIndex
     */
    public void setEndIndex(java.lang.Long endIndex) {
        this.endIndex = endIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUGetDataColumnsRequest)) return false;
        DFUGetDataColumnsRequest other = (DFUGetDataColumnsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.openLogicalName==null && other.getOpenLogicalName()==null) || 
             (this.openLogicalName!=null &&
              this.openLogicalName.equals(other.getOpenLogicalName()))) &&
            ((this.logicalName==null && other.getLogicalName()==null) || 
             (this.logicalName!=null &&
              this.logicalName.equals(other.getLogicalName()))) &&
            ((this.filterBy==null && other.getFilterBy()==null) || 
             (this.filterBy!=null &&
              this.filterBy.equals(other.getFilterBy()))) &&
            ((this.showColumns==null && other.getShowColumns()==null) || 
             (this.showColumns!=null &&
              this.showColumns.equals(other.getShowColumns()))) &&
            ((this.chooseFile==null && other.getChooseFile()==null) || 
             (this.chooseFile!=null &&
              this.chooseFile.equals(other.getChooseFile()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.clusterType==null && other.getClusterType()==null) || 
             (this.clusterType!=null &&
              this.clusterType.equals(other.getClusterType()))) &&
            ((this.startIndex==null && other.getStartIndex()==null) || 
             (this.startIndex!=null &&
              this.startIndex.equals(other.getStartIndex()))) &&
            ((this.endIndex==null && other.getEndIndex()==null) || 
             (this.endIndex!=null &&
              this.endIndex.equals(other.getEndIndex())));
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
        if (getOpenLogicalName() != null) {
            _hashCode += getOpenLogicalName().hashCode();
        }
        if (getLogicalName() != null) {
            _hashCode += getLogicalName().hashCode();
        }
        if (getFilterBy() != null) {
            _hashCode += getFilterBy().hashCode();
        }
        if (getShowColumns() != null) {
            _hashCode += getShowColumns().hashCode();
        }
        if (getChooseFile() != null) {
            _hashCode += getChooseFile().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getClusterType() != null) {
            _hashCode += getClusterType().hashCode();
        }
        if (getStartIndex() != null) {
            _hashCode += getStartIndex().hashCode();
        }
        if (getEndIndex() != null) {
            _hashCode += getEndIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUGetDataColumnsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUGetDataColumnsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openLogicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "OpenLogicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FilterBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showColumns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ShowColumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chooseFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ChooseFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ClusterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EndIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
