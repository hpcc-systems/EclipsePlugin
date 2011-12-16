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
 * TpTargetClusterQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpTargetClusterQueryResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions;

    private java.lang.Boolean showDetails;

    private java.lang.Integer memThreshold;

    private java.lang.Integer diskThreshold;

    private java.lang.Integer cpuThreshold;

    private java.lang.String memThresholdType;

    private java.lang.String diskThresholdType;

    private java.lang.String preflightProcessFilter;

    private org.hpccsystems.ws.wstopology.TpTargetCluster[] tpTargetClusters;

    public TpTargetClusterQueryResponse() {
    }

    public TpTargetClusterQueryResponse(
           org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions,
           java.lang.Boolean showDetails,
           java.lang.Integer memThreshold,
           java.lang.Integer diskThreshold,
           java.lang.Integer cpuThreshold,
           java.lang.String memThresholdType,
           java.lang.String diskThresholdType,
           java.lang.String preflightProcessFilter,
           org.hpccsystems.ws.wstopology.TpTargetCluster[] tpTargetClusters) {
           this.exceptions = exceptions;
           this.showDetails = showDetails;
           this.memThreshold = memThreshold;
           this.diskThreshold = diskThreshold;
           this.cpuThreshold = cpuThreshold;
           this.memThresholdType = memThresholdType;
           this.diskThresholdType = diskThresholdType;
           this.preflightProcessFilter = preflightProcessFilter;
           this.tpTargetClusters = tpTargetClusters;
    }


    /**
     * Gets the exceptions value for this TpTargetClusterQueryResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wstopology.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this TpTargetClusterQueryResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the showDetails value for this TpTargetClusterQueryResponse.
     * 
     * @return showDetails
     */
    public java.lang.Boolean getShowDetails() {
        return showDetails;
    }


    /**
     * Sets the showDetails value for this TpTargetClusterQueryResponse.
     * 
     * @param showDetails
     */
    public void setShowDetails(java.lang.Boolean showDetails) {
        this.showDetails = showDetails;
    }


    /**
     * Gets the memThreshold value for this TpTargetClusterQueryResponse.
     * 
     * @return memThreshold
     */
    public java.lang.Integer getMemThreshold() {
        return memThreshold;
    }


    /**
     * Sets the memThreshold value for this TpTargetClusterQueryResponse.
     * 
     * @param memThreshold
     */
    public void setMemThreshold(java.lang.Integer memThreshold) {
        this.memThreshold = memThreshold;
    }


    /**
     * Gets the diskThreshold value for this TpTargetClusterQueryResponse.
     * 
     * @return diskThreshold
     */
    public java.lang.Integer getDiskThreshold() {
        return diskThreshold;
    }


    /**
     * Sets the diskThreshold value for this TpTargetClusterQueryResponse.
     * 
     * @param diskThreshold
     */
    public void setDiskThreshold(java.lang.Integer diskThreshold) {
        this.diskThreshold = diskThreshold;
    }


    /**
     * Gets the cpuThreshold value for this TpTargetClusterQueryResponse.
     * 
     * @return cpuThreshold
     */
    public java.lang.Integer getCpuThreshold() {
        return cpuThreshold;
    }


    /**
     * Sets the cpuThreshold value for this TpTargetClusterQueryResponse.
     * 
     * @param cpuThreshold
     */
    public void setCpuThreshold(java.lang.Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }


    /**
     * Gets the memThresholdType value for this TpTargetClusterQueryResponse.
     * 
     * @return memThresholdType
     */
    public java.lang.String getMemThresholdType() {
        return memThresholdType;
    }


    /**
     * Sets the memThresholdType value for this TpTargetClusterQueryResponse.
     * 
     * @param memThresholdType
     */
    public void setMemThresholdType(java.lang.String memThresholdType) {
        this.memThresholdType = memThresholdType;
    }


    /**
     * Gets the diskThresholdType value for this TpTargetClusterQueryResponse.
     * 
     * @return diskThresholdType
     */
    public java.lang.String getDiskThresholdType() {
        return diskThresholdType;
    }


    /**
     * Sets the diskThresholdType value for this TpTargetClusterQueryResponse.
     * 
     * @param diskThresholdType
     */
    public void setDiskThresholdType(java.lang.String diskThresholdType) {
        this.diskThresholdType = diskThresholdType;
    }


    /**
     * Gets the preflightProcessFilter value for this TpTargetClusterQueryResponse.
     * 
     * @return preflightProcessFilter
     */
    public java.lang.String getPreflightProcessFilter() {
        return preflightProcessFilter;
    }


    /**
     * Sets the preflightProcessFilter value for this TpTargetClusterQueryResponse.
     * 
     * @param preflightProcessFilter
     */
    public void setPreflightProcessFilter(java.lang.String preflightProcessFilter) {
        this.preflightProcessFilter = preflightProcessFilter;
    }


    /**
     * Gets the tpTargetClusters value for this TpTargetClusterQueryResponse.
     * 
     * @return tpTargetClusters
     */
    public org.hpccsystems.ws.wstopology.TpTargetCluster[] getTpTargetClusters() {
        return tpTargetClusters;
    }


    /**
     * Sets the tpTargetClusters value for this TpTargetClusterQueryResponse.
     * 
     * @param tpTargetClusters
     */
    public void setTpTargetClusters(org.hpccsystems.ws.wstopology.TpTargetCluster[] tpTargetClusters) {
        this.tpTargetClusters = tpTargetClusters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpTargetClusterQueryResponse)) return false;
        TpTargetClusterQueryResponse other = (TpTargetClusterQueryResponse) obj;
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
            ((this.showDetails==null && other.getShowDetails()==null) || 
             (this.showDetails!=null &&
              this.showDetails.equals(other.getShowDetails()))) &&
            ((this.memThreshold==null && other.getMemThreshold()==null) || 
             (this.memThreshold!=null &&
              this.memThreshold.equals(other.getMemThreshold()))) &&
            ((this.diskThreshold==null && other.getDiskThreshold()==null) || 
             (this.diskThreshold!=null &&
              this.diskThreshold.equals(other.getDiskThreshold()))) &&
            ((this.cpuThreshold==null && other.getCpuThreshold()==null) || 
             (this.cpuThreshold!=null &&
              this.cpuThreshold.equals(other.getCpuThreshold()))) &&
            ((this.memThresholdType==null && other.getMemThresholdType()==null) || 
             (this.memThresholdType!=null &&
              this.memThresholdType.equals(other.getMemThresholdType()))) &&
            ((this.diskThresholdType==null && other.getDiskThresholdType()==null) || 
             (this.diskThresholdType!=null &&
              this.diskThresholdType.equals(other.getDiskThresholdType()))) &&
            ((this.preflightProcessFilter==null && other.getPreflightProcessFilter()==null) || 
             (this.preflightProcessFilter!=null &&
              this.preflightProcessFilter.equals(other.getPreflightProcessFilter()))) &&
            ((this.tpTargetClusters==null && other.getTpTargetClusters()==null) || 
             (this.tpTargetClusters!=null &&
              java.util.Arrays.equals(this.tpTargetClusters, other.getTpTargetClusters())));
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
        if (getShowDetails() != null) {
            _hashCode += getShowDetails().hashCode();
        }
        if (getMemThreshold() != null) {
            _hashCode += getMemThreshold().hashCode();
        }
        if (getDiskThreshold() != null) {
            _hashCode += getDiskThreshold().hashCode();
        }
        if (getCpuThreshold() != null) {
            _hashCode += getCpuThreshold().hashCode();
        }
        if (getMemThresholdType() != null) {
            _hashCode += getMemThresholdType().hashCode();
        }
        if (getDiskThresholdType() != null) {
            _hashCode += getDiskThresholdType().hashCode();
        }
        if (getPreflightProcessFilter() != null) {
            _hashCode += getPreflightProcessFilter().hashCode();
        }
        if (getTpTargetClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTpTargetClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTpTargetClusters(), i);
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
        new org.apache.axis.description.TypeDesc(TpTargetClusterQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpTargetClusterQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ShowDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "MemThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "DiskThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuThreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "CpuThreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memThresholdType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "MemThresholdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskThresholdType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "DiskThresholdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preflightProcessFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "PreflightProcessFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpTargetClusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpTargetClusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpTargetCluster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpTargetCluster"));
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
