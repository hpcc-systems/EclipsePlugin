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
 * DFUBrowseDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUBrowseDataRequest  implements java.io.Serializable {
    private java.lang.String logicalName;

    private java.lang.String filterBy;

    private java.lang.String showColumns;

    private java.lang.Boolean schemaOnly;

    private java.lang.Long startForGoback;

    private java.lang.Integer countForGoback;

    private java.lang.Integer chooseFile;

    private java.lang.String cluster;

    private java.lang.String clusterType;

    private java.lang.String parentName;

    private java.lang.Long start;

    private java.lang.Integer count;

    private java.lang.Boolean disableUppercaseTranslation;

    public DFUBrowseDataRequest() {
    }

    public DFUBrowseDataRequest(
           java.lang.String logicalName,
           java.lang.String filterBy,
           java.lang.String showColumns,
           java.lang.Boolean schemaOnly,
           java.lang.Long startForGoback,
           java.lang.Integer countForGoback,
           java.lang.Integer chooseFile,
           java.lang.String cluster,
           java.lang.String clusterType,
           java.lang.String parentName,
           java.lang.Long start,
           java.lang.Integer count,
           java.lang.Boolean disableUppercaseTranslation) {
           this.logicalName = logicalName;
           this.filterBy = filterBy;
           this.showColumns = showColumns;
           this.schemaOnly = schemaOnly;
           this.startForGoback = startForGoback;
           this.countForGoback = countForGoback;
           this.chooseFile = chooseFile;
           this.cluster = cluster;
           this.clusterType = clusterType;
           this.parentName = parentName;
           this.start = start;
           this.count = count;
           this.disableUppercaseTranslation = disableUppercaseTranslation;
    }


    /**
     * Gets the logicalName value for this DFUBrowseDataRequest.
     * 
     * @return logicalName
     */
    public java.lang.String getLogicalName() {
        return logicalName;
    }


    /**
     * Sets the logicalName value for this DFUBrowseDataRequest.
     * 
     * @param logicalName
     */
    public void setLogicalName(java.lang.String logicalName) {
        this.logicalName = logicalName;
    }


    /**
     * Gets the filterBy value for this DFUBrowseDataRequest.
     * 
     * @return filterBy
     */
    public java.lang.String getFilterBy() {
        return filterBy;
    }


    /**
     * Sets the filterBy value for this DFUBrowseDataRequest.
     * 
     * @param filterBy
     */
    public void setFilterBy(java.lang.String filterBy) {
        this.filterBy = filterBy;
    }


    /**
     * Gets the showColumns value for this DFUBrowseDataRequest.
     * 
     * @return showColumns
     */
    public java.lang.String getShowColumns() {
        return showColumns;
    }


    /**
     * Sets the showColumns value for this DFUBrowseDataRequest.
     * 
     * @param showColumns
     */
    public void setShowColumns(java.lang.String showColumns) {
        this.showColumns = showColumns;
    }


    /**
     * Gets the schemaOnly value for this DFUBrowseDataRequest.
     * 
     * @return schemaOnly
     */
    public java.lang.Boolean getSchemaOnly() {
        return schemaOnly;
    }


    /**
     * Sets the schemaOnly value for this DFUBrowseDataRequest.
     * 
     * @param schemaOnly
     */
    public void setSchemaOnly(java.lang.Boolean schemaOnly) {
        this.schemaOnly = schemaOnly;
    }


    /**
     * Gets the startForGoback value for this DFUBrowseDataRequest.
     * 
     * @return startForGoback
     */
    public java.lang.Long getStartForGoback() {
        return startForGoback;
    }


    /**
     * Sets the startForGoback value for this DFUBrowseDataRequest.
     * 
     * @param startForGoback
     */
    public void setStartForGoback(java.lang.Long startForGoback) {
        this.startForGoback = startForGoback;
    }


    /**
     * Gets the countForGoback value for this DFUBrowseDataRequest.
     * 
     * @return countForGoback
     */
    public java.lang.Integer getCountForGoback() {
        return countForGoback;
    }


    /**
     * Sets the countForGoback value for this DFUBrowseDataRequest.
     * 
     * @param countForGoback
     */
    public void setCountForGoback(java.lang.Integer countForGoback) {
        this.countForGoback = countForGoback;
    }


    /**
     * Gets the chooseFile value for this DFUBrowseDataRequest.
     * 
     * @return chooseFile
     */
    public java.lang.Integer getChooseFile() {
        return chooseFile;
    }


    /**
     * Sets the chooseFile value for this DFUBrowseDataRequest.
     * 
     * @param chooseFile
     */
    public void setChooseFile(java.lang.Integer chooseFile) {
        this.chooseFile = chooseFile;
    }


    /**
     * Gets the cluster value for this DFUBrowseDataRequest.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this DFUBrowseDataRequest.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the clusterType value for this DFUBrowseDataRequest.
     * 
     * @return clusterType
     */
    public java.lang.String getClusterType() {
        return clusterType;
    }


    /**
     * Sets the clusterType value for this DFUBrowseDataRequest.
     * 
     * @param clusterType
     */
    public void setClusterType(java.lang.String clusterType) {
        this.clusterType = clusterType;
    }


    /**
     * Gets the parentName value for this DFUBrowseDataRequest.
     * 
     * @return parentName
     */
    public java.lang.String getParentName() {
        return parentName;
    }


    /**
     * Sets the parentName value for this DFUBrowseDataRequest.
     * 
     * @param parentName
     */
    public void setParentName(java.lang.String parentName) {
        this.parentName = parentName;
    }


    /**
     * Gets the start value for this DFUBrowseDataRequest.
     * 
     * @return start
     */
    public java.lang.Long getStart() {
        return start;
    }


    /**
     * Sets the start value for this DFUBrowseDataRequest.
     * 
     * @param start
     */
    public void setStart(java.lang.Long start) {
        this.start = start;
    }


    /**
     * Gets the count value for this DFUBrowseDataRequest.
     * 
     * @return count
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this DFUBrowseDataRequest.
     * 
     * @param count
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }


    /**
     * Gets the disableUppercaseTranslation value for this DFUBrowseDataRequest.
     * 
     * @return disableUppercaseTranslation
     */
    public java.lang.Boolean getDisableUppercaseTranslation() {
        return disableUppercaseTranslation;
    }


    /**
     * Sets the disableUppercaseTranslation value for this DFUBrowseDataRequest.
     * 
     * @param disableUppercaseTranslation
     */
    public void setDisableUppercaseTranslation(java.lang.Boolean disableUppercaseTranslation) {
        this.disableUppercaseTranslation = disableUppercaseTranslation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUBrowseDataRequest)) return false;
        DFUBrowseDataRequest other = (DFUBrowseDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logicalName==null && other.getLogicalName()==null) || 
             (this.logicalName!=null &&
              this.logicalName.equals(other.getLogicalName()))) &&
            ((this.filterBy==null && other.getFilterBy()==null) || 
             (this.filterBy!=null &&
              this.filterBy.equals(other.getFilterBy()))) &&
            ((this.showColumns==null && other.getShowColumns()==null) || 
             (this.showColumns!=null &&
              this.showColumns.equals(other.getShowColumns()))) &&
            ((this.schemaOnly==null && other.getSchemaOnly()==null) || 
             (this.schemaOnly!=null &&
              this.schemaOnly.equals(other.getSchemaOnly()))) &&
            ((this.startForGoback==null && other.getStartForGoback()==null) || 
             (this.startForGoback!=null &&
              this.startForGoback.equals(other.getStartForGoback()))) &&
            ((this.countForGoback==null && other.getCountForGoback()==null) || 
             (this.countForGoback!=null &&
              this.countForGoback.equals(other.getCountForGoback()))) &&
            ((this.chooseFile==null && other.getChooseFile()==null) || 
             (this.chooseFile!=null &&
              this.chooseFile.equals(other.getChooseFile()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.clusterType==null && other.getClusterType()==null) || 
             (this.clusterType!=null &&
              this.clusterType.equals(other.getClusterType()))) &&
            ((this.parentName==null && other.getParentName()==null) || 
             (this.parentName!=null &&
              this.parentName.equals(other.getParentName()))) &&
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.disableUppercaseTranslation==null && other.getDisableUppercaseTranslation()==null) || 
             (this.disableUppercaseTranslation!=null &&
              this.disableUppercaseTranslation.equals(other.getDisableUppercaseTranslation())));
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
        if (getLogicalName() != null) {
            _hashCode += getLogicalName().hashCode();
        }
        if (getFilterBy() != null) {
            _hashCode += getFilterBy().hashCode();
        }
        if (getShowColumns() != null) {
            _hashCode += getShowColumns().hashCode();
        }
        if (getSchemaOnly() != null) {
            _hashCode += getSchemaOnly().hashCode();
        }
        if (getStartForGoback() != null) {
            _hashCode += getStartForGoback().hashCode();
        }
        if (getCountForGoback() != null) {
            _hashCode += getCountForGoback().hashCode();
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
        if (getParentName() != null) {
            _hashCode += getParentName().hashCode();
        }
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getDisableUppercaseTranslation() != null) {
            _hashCode += getDisableUppercaseTranslation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUBrowseDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUBrowseDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("schemaOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SchemaOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startForGoback");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartForGoback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countForGoback");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CountForGoback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("parentName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ParentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableUppercaseTranslation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DisableUppercaseTranslation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
