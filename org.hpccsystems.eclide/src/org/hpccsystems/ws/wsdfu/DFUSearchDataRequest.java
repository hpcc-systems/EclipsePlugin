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
 * DFUSearchDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUSearchDataRequest  implements java.io.Serializable {
    private java.lang.String cluster;

    private java.lang.String clusterType;

    private java.lang.String openLogicalName;

    private java.lang.String filterBy;

    private java.lang.String showColumns;

    private java.lang.Integer chooseFile;

    private java.lang.Long startIndex;

    private java.lang.Long endIndex;

    private java.lang.String logicalName;

    private java.lang.String parentName;

    private java.lang.Long startForGoback;

    private java.lang.Integer countForGoback;

    private java.lang.Long start;

    private java.lang.Integer count;

    private java.lang.String file;

    private java.lang.String key;

    private java.lang.Boolean schemaOnly;

    private java.lang.Boolean roxieSelections;

    private java.lang.Boolean disableUppercaseTranslation;

    private java.lang.String selectedKey;

    public DFUSearchDataRequest() {
    }

    public DFUSearchDataRequest(
           java.lang.String cluster,
           java.lang.String clusterType,
           java.lang.String openLogicalName,
           java.lang.String filterBy,
           java.lang.String showColumns,
           java.lang.Integer chooseFile,
           java.lang.Long startIndex,
           java.lang.Long endIndex,
           java.lang.String logicalName,
           java.lang.String parentName,
           java.lang.Long startForGoback,
           java.lang.Integer countForGoback,
           java.lang.Long start,
           java.lang.Integer count,
           java.lang.String file,
           java.lang.String key,
           java.lang.Boolean schemaOnly,
           java.lang.Boolean roxieSelections,
           java.lang.Boolean disableUppercaseTranslation,
           java.lang.String selectedKey) {
           this.cluster = cluster;
           this.clusterType = clusterType;
           this.openLogicalName = openLogicalName;
           this.filterBy = filterBy;
           this.showColumns = showColumns;
           this.chooseFile = chooseFile;
           this.startIndex = startIndex;
           this.endIndex = endIndex;
           this.logicalName = logicalName;
           this.parentName = parentName;
           this.startForGoback = startForGoback;
           this.countForGoback = countForGoback;
           this.start = start;
           this.count = count;
           this.file = file;
           this.key = key;
           this.schemaOnly = schemaOnly;
           this.roxieSelections = roxieSelections;
           this.disableUppercaseTranslation = disableUppercaseTranslation;
           this.selectedKey = selectedKey;
    }


    /**
     * Gets the cluster value for this DFUSearchDataRequest.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this DFUSearchDataRequest.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the clusterType value for this DFUSearchDataRequest.
     * 
     * @return clusterType
     */
    public java.lang.String getClusterType() {
        return clusterType;
    }


    /**
     * Sets the clusterType value for this DFUSearchDataRequest.
     * 
     * @param clusterType
     */
    public void setClusterType(java.lang.String clusterType) {
        this.clusterType = clusterType;
    }


    /**
     * Gets the openLogicalName value for this DFUSearchDataRequest.
     * 
     * @return openLogicalName
     */
    public java.lang.String getOpenLogicalName() {
        return openLogicalName;
    }


    /**
     * Sets the openLogicalName value for this DFUSearchDataRequest.
     * 
     * @param openLogicalName
     */
    public void setOpenLogicalName(java.lang.String openLogicalName) {
        this.openLogicalName = openLogicalName;
    }


    /**
     * Gets the filterBy value for this DFUSearchDataRequest.
     * 
     * @return filterBy
     */
    public java.lang.String getFilterBy() {
        return filterBy;
    }


    /**
     * Sets the filterBy value for this DFUSearchDataRequest.
     * 
     * @param filterBy
     */
    public void setFilterBy(java.lang.String filterBy) {
        this.filterBy = filterBy;
    }


    /**
     * Gets the showColumns value for this DFUSearchDataRequest.
     * 
     * @return showColumns
     */
    public java.lang.String getShowColumns() {
        return showColumns;
    }


    /**
     * Sets the showColumns value for this DFUSearchDataRequest.
     * 
     * @param showColumns
     */
    public void setShowColumns(java.lang.String showColumns) {
        this.showColumns = showColumns;
    }


    /**
     * Gets the chooseFile value for this DFUSearchDataRequest.
     * 
     * @return chooseFile
     */
    public java.lang.Integer getChooseFile() {
        return chooseFile;
    }


    /**
     * Sets the chooseFile value for this DFUSearchDataRequest.
     * 
     * @param chooseFile
     */
    public void setChooseFile(java.lang.Integer chooseFile) {
        this.chooseFile = chooseFile;
    }


    /**
     * Gets the startIndex value for this DFUSearchDataRequest.
     * 
     * @return startIndex
     */
    public java.lang.Long getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this DFUSearchDataRequest.
     * 
     * @param startIndex
     */
    public void setStartIndex(java.lang.Long startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the endIndex value for this DFUSearchDataRequest.
     * 
     * @return endIndex
     */
    public java.lang.Long getEndIndex() {
        return endIndex;
    }


    /**
     * Sets the endIndex value for this DFUSearchDataRequest.
     * 
     * @param endIndex
     */
    public void setEndIndex(java.lang.Long endIndex) {
        this.endIndex = endIndex;
    }


    /**
     * Gets the logicalName value for this DFUSearchDataRequest.
     * 
     * @return logicalName
     */
    public java.lang.String getLogicalName() {
        return logicalName;
    }


    /**
     * Sets the logicalName value for this DFUSearchDataRequest.
     * 
     * @param logicalName
     */
    public void setLogicalName(java.lang.String logicalName) {
        this.logicalName = logicalName;
    }


    /**
     * Gets the parentName value for this DFUSearchDataRequest.
     * 
     * @return parentName
     */
    public java.lang.String getParentName() {
        return parentName;
    }


    /**
     * Sets the parentName value for this DFUSearchDataRequest.
     * 
     * @param parentName
     */
    public void setParentName(java.lang.String parentName) {
        this.parentName = parentName;
    }


    /**
     * Gets the startForGoback value for this DFUSearchDataRequest.
     * 
     * @return startForGoback
     */
    public java.lang.Long getStartForGoback() {
        return startForGoback;
    }


    /**
     * Sets the startForGoback value for this DFUSearchDataRequest.
     * 
     * @param startForGoback
     */
    public void setStartForGoback(java.lang.Long startForGoback) {
        this.startForGoback = startForGoback;
    }


    /**
     * Gets the countForGoback value for this DFUSearchDataRequest.
     * 
     * @return countForGoback
     */
    public java.lang.Integer getCountForGoback() {
        return countForGoback;
    }


    /**
     * Sets the countForGoback value for this DFUSearchDataRequest.
     * 
     * @param countForGoback
     */
    public void setCountForGoback(java.lang.Integer countForGoback) {
        this.countForGoback = countForGoback;
    }


    /**
     * Gets the start value for this DFUSearchDataRequest.
     * 
     * @return start
     */
    public java.lang.Long getStart() {
        return start;
    }


    /**
     * Sets the start value for this DFUSearchDataRequest.
     * 
     * @param start
     */
    public void setStart(java.lang.Long start) {
        this.start = start;
    }


    /**
     * Gets the count value for this DFUSearchDataRequest.
     * 
     * @return count
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this DFUSearchDataRequest.
     * 
     * @param count
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }


    /**
     * Gets the file value for this DFUSearchDataRequest.
     * 
     * @return file
     */
    public java.lang.String getFile() {
        return file;
    }


    /**
     * Sets the file value for this DFUSearchDataRequest.
     * 
     * @param file
     */
    public void setFile(java.lang.String file) {
        this.file = file;
    }


    /**
     * Gets the key value for this DFUSearchDataRequest.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this DFUSearchDataRequest.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the schemaOnly value for this DFUSearchDataRequest.
     * 
     * @return schemaOnly
     */
    public java.lang.Boolean getSchemaOnly() {
        return schemaOnly;
    }


    /**
     * Sets the schemaOnly value for this DFUSearchDataRequest.
     * 
     * @param schemaOnly
     */
    public void setSchemaOnly(java.lang.Boolean schemaOnly) {
        this.schemaOnly = schemaOnly;
    }


    /**
     * Gets the roxieSelections value for this DFUSearchDataRequest.
     * 
     * @return roxieSelections
     */
    public java.lang.Boolean getRoxieSelections() {
        return roxieSelections;
    }


    /**
     * Sets the roxieSelections value for this DFUSearchDataRequest.
     * 
     * @param roxieSelections
     */
    public void setRoxieSelections(java.lang.Boolean roxieSelections) {
        this.roxieSelections = roxieSelections;
    }


    /**
     * Gets the disableUppercaseTranslation value for this DFUSearchDataRequest.
     * 
     * @return disableUppercaseTranslation
     */
    public java.lang.Boolean getDisableUppercaseTranslation() {
        return disableUppercaseTranslation;
    }


    /**
     * Sets the disableUppercaseTranslation value for this DFUSearchDataRequest.
     * 
     * @param disableUppercaseTranslation
     */
    public void setDisableUppercaseTranslation(java.lang.Boolean disableUppercaseTranslation) {
        this.disableUppercaseTranslation = disableUppercaseTranslation;
    }


    /**
     * Gets the selectedKey value for this DFUSearchDataRequest.
     * 
     * @return selectedKey
     */
    public java.lang.String getSelectedKey() {
        return selectedKey;
    }


    /**
     * Sets the selectedKey value for this DFUSearchDataRequest.
     * 
     * @param selectedKey
     */
    public void setSelectedKey(java.lang.String selectedKey) {
        this.selectedKey = selectedKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUSearchDataRequest)) return false;
        DFUSearchDataRequest other = (DFUSearchDataRequest) obj;
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
            ((this.clusterType==null && other.getClusterType()==null) || 
             (this.clusterType!=null &&
              this.clusterType.equals(other.getClusterType()))) &&
            ((this.openLogicalName==null && other.getOpenLogicalName()==null) || 
             (this.openLogicalName!=null &&
              this.openLogicalName.equals(other.getOpenLogicalName()))) &&
            ((this.filterBy==null && other.getFilterBy()==null) || 
             (this.filterBy!=null &&
              this.filterBy.equals(other.getFilterBy()))) &&
            ((this.showColumns==null && other.getShowColumns()==null) || 
             (this.showColumns!=null &&
              this.showColumns.equals(other.getShowColumns()))) &&
            ((this.chooseFile==null && other.getChooseFile()==null) || 
             (this.chooseFile!=null &&
              this.chooseFile.equals(other.getChooseFile()))) &&
            ((this.startIndex==null && other.getStartIndex()==null) || 
             (this.startIndex!=null &&
              this.startIndex.equals(other.getStartIndex()))) &&
            ((this.endIndex==null && other.getEndIndex()==null) || 
             (this.endIndex!=null &&
              this.endIndex.equals(other.getEndIndex()))) &&
            ((this.logicalName==null && other.getLogicalName()==null) || 
             (this.logicalName!=null &&
              this.logicalName.equals(other.getLogicalName()))) &&
            ((this.parentName==null && other.getParentName()==null) || 
             (this.parentName!=null &&
              this.parentName.equals(other.getParentName()))) &&
            ((this.startForGoback==null && other.getStartForGoback()==null) || 
             (this.startForGoback!=null &&
              this.startForGoback.equals(other.getStartForGoback()))) &&
            ((this.countForGoback==null && other.getCountForGoback()==null) || 
             (this.countForGoback!=null &&
              this.countForGoback.equals(other.getCountForGoback()))) &&
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              this.file.equals(other.getFile()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.schemaOnly==null && other.getSchemaOnly()==null) || 
             (this.schemaOnly!=null &&
              this.schemaOnly.equals(other.getSchemaOnly()))) &&
            ((this.roxieSelections==null && other.getRoxieSelections()==null) || 
             (this.roxieSelections!=null &&
              this.roxieSelections.equals(other.getRoxieSelections()))) &&
            ((this.disableUppercaseTranslation==null && other.getDisableUppercaseTranslation()==null) || 
             (this.disableUppercaseTranslation!=null &&
              this.disableUppercaseTranslation.equals(other.getDisableUppercaseTranslation()))) &&
            ((this.selectedKey==null && other.getSelectedKey()==null) || 
             (this.selectedKey!=null &&
              this.selectedKey.equals(other.getSelectedKey())));
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
        if (getClusterType() != null) {
            _hashCode += getClusterType().hashCode();
        }
        if (getOpenLogicalName() != null) {
            _hashCode += getOpenLogicalName().hashCode();
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
        if (getStartIndex() != null) {
            _hashCode += getStartIndex().hashCode();
        }
        if (getEndIndex() != null) {
            _hashCode += getEndIndex().hashCode();
        }
        if (getLogicalName() != null) {
            _hashCode += getLogicalName().hashCode();
        }
        if (getParentName() != null) {
            _hashCode += getParentName().hashCode();
        }
        if (getStartForGoback() != null) {
            _hashCode += getStartForGoback().hashCode();
        }
        if (getCountForGoback() != null) {
            _hashCode += getCountForGoback().hashCode();
        }
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getFile() != null) {
            _hashCode += getFile().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getSchemaOnly() != null) {
            _hashCode += getSchemaOnly().hashCode();
        }
        if (getRoxieSelections() != null) {
            _hashCode += getRoxieSelections().hashCode();
        }
        if (getDisableUppercaseTranslation() != null) {
            _hashCode += getDisableUppercaseTranslation().hashCode();
        }
        if (getSelectedKey() != null) {
            _hashCode += getSelectedKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUSearchDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSearchDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("openLogicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "OpenLogicalName"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalName"));
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
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "File"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Key"));
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
        elemField.setFieldName("roxieSelections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RoxieSelections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SelectedKey"));
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
