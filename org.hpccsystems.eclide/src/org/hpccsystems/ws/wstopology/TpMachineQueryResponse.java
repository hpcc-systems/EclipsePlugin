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
 * TpMachineQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpMachineQueryResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions;

    private java.lang.Boolean enablePreflightInfo;

    private java.lang.Boolean hasThorSpareProcess;

    private java.lang.String type;

    private java.lang.String cluster;

    private java.lang.String oldIP;

    private java.lang.String logDirectory;

    private java.lang.String path;

    private java.lang.Integer memThreshold;

    private java.lang.Integer diskThreshold;

    private java.lang.Integer cpuThreshold;

    private java.lang.String memThresholdType;

    private java.lang.String diskThresholdType;

    private java.lang.String preflightProcessFilter;

    private java.lang.Boolean enableSNMP;

    private org.hpccsystems.ws.wstopology.TpMachine[] tpMachines;

    public TpMachineQueryResponse() {
    }

    public TpMachineQueryResponse(
           org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions,
           java.lang.Boolean enablePreflightInfo,
           java.lang.Boolean hasThorSpareProcess,
           java.lang.String type,
           java.lang.String cluster,
           java.lang.String oldIP,
           java.lang.String logDirectory,
           java.lang.String path,
           java.lang.Integer memThreshold,
           java.lang.Integer diskThreshold,
           java.lang.Integer cpuThreshold,
           java.lang.String memThresholdType,
           java.lang.String diskThresholdType,
           java.lang.String preflightProcessFilter,
           java.lang.Boolean enableSNMP,
           org.hpccsystems.ws.wstopology.TpMachine[] tpMachines) {
           this.exceptions = exceptions;
           this.enablePreflightInfo = enablePreflightInfo;
           this.hasThorSpareProcess = hasThorSpareProcess;
           this.type = type;
           this.cluster = cluster;
           this.oldIP = oldIP;
           this.logDirectory = logDirectory;
           this.path = path;
           this.memThreshold = memThreshold;
           this.diskThreshold = diskThreshold;
           this.cpuThreshold = cpuThreshold;
           this.memThresholdType = memThresholdType;
           this.diskThresholdType = diskThresholdType;
           this.preflightProcessFilter = preflightProcessFilter;
           this.enableSNMP = enableSNMP;
           this.tpMachines = tpMachines;
    }


    /**
     * Gets the exceptions value for this TpMachineQueryResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wstopology.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this TpMachineQueryResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the enablePreflightInfo value for this TpMachineQueryResponse.
     * 
     * @return enablePreflightInfo
     */
    public java.lang.Boolean getEnablePreflightInfo() {
        return enablePreflightInfo;
    }


    /**
     * Sets the enablePreflightInfo value for this TpMachineQueryResponse.
     * 
     * @param enablePreflightInfo
     */
    public void setEnablePreflightInfo(java.lang.Boolean enablePreflightInfo) {
        this.enablePreflightInfo = enablePreflightInfo;
    }


    /**
     * Gets the hasThorSpareProcess value for this TpMachineQueryResponse.
     * 
     * @return hasThorSpareProcess
     */
    public java.lang.Boolean getHasThorSpareProcess() {
        return hasThorSpareProcess;
    }


    /**
     * Sets the hasThorSpareProcess value for this TpMachineQueryResponse.
     * 
     * @param hasThorSpareProcess
     */
    public void setHasThorSpareProcess(java.lang.Boolean hasThorSpareProcess) {
        this.hasThorSpareProcess = hasThorSpareProcess;
    }


    /**
     * Gets the type value for this TpMachineQueryResponse.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TpMachineQueryResponse.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the cluster value for this TpMachineQueryResponse.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this TpMachineQueryResponse.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the oldIP value for this TpMachineQueryResponse.
     * 
     * @return oldIP
     */
    public java.lang.String getOldIP() {
        return oldIP;
    }


    /**
     * Sets the oldIP value for this TpMachineQueryResponse.
     * 
     * @param oldIP
     */
    public void setOldIP(java.lang.String oldIP) {
        this.oldIP = oldIP;
    }


    /**
     * Gets the logDirectory value for this TpMachineQueryResponse.
     * 
     * @return logDirectory
     */
    public java.lang.String getLogDirectory() {
        return logDirectory;
    }


    /**
     * Sets the logDirectory value for this TpMachineQueryResponse.
     * 
     * @param logDirectory
     */
    public void setLogDirectory(java.lang.String logDirectory) {
        this.logDirectory = logDirectory;
    }


    /**
     * Gets the path value for this TpMachineQueryResponse.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TpMachineQueryResponse.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the memThreshold value for this TpMachineQueryResponse.
     * 
     * @return memThreshold
     */
    public java.lang.Integer getMemThreshold() {
        return memThreshold;
    }


    /**
     * Sets the memThreshold value for this TpMachineQueryResponse.
     * 
     * @param memThreshold
     */
    public void setMemThreshold(java.lang.Integer memThreshold) {
        this.memThreshold = memThreshold;
    }


    /**
     * Gets the diskThreshold value for this TpMachineQueryResponse.
     * 
     * @return diskThreshold
     */
    public java.lang.Integer getDiskThreshold() {
        return diskThreshold;
    }


    /**
     * Sets the diskThreshold value for this TpMachineQueryResponse.
     * 
     * @param diskThreshold
     */
    public void setDiskThreshold(java.lang.Integer diskThreshold) {
        this.diskThreshold = diskThreshold;
    }


    /**
     * Gets the cpuThreshold value for this TpMachineQueryResponse.
     * 
     * @return cpuThreshold
     */
    public java.lang.Integer getCpuThreshold() {
        return cpuThreshold;
    }


    /**
     * Sets the cpuThreshold value for this TpMachineQueryResponse.
     * 
     * @param cpuThreshold
     */
    public void setCpuThreshold(java.lang.Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }


    /**
     * Gets the memThresholdType value for this TpMachineQueryResponse.
     * 
     * @return memThresholdType
     */
    public java.lang.String getMemThresholdType() {
        return memThresholdType;
    }


    /**
     * Sets the memThresholdType value for this TpMachineQueryResponse.
     * 
     * @param memThresholdType
     */
    public void setMemThresholdType(java.lang.String memThresholdType) {
        this.memThresholdType = memThresholdType;
    }


    /**
     * Gets the diskThresholdType value for this TpMachineQueryResponse.
     * 
     * @return diskThresholdType
     */
    public java.lang.String getDiskThresholdType() {
        return diskThresholdType;
    }


    /**
     * Sets the diskThresholdType value for this TpMachineQueryResponse.
     * 
     * @param diskThresholdType
     */
    public void setDiskThresholdType(java.lang.String diskThresholdType) {
        this.diskThresholdType = diskThresholdType;
    }


    /**
     * Gets the preflightProcessFilter value for this TpMachineQueryResponse.
     * 
     * @return preflightProcessFilter
     */
    public java.lang.String getPreflightProcessFilter() {
        return preflightProcessFilter;
    }


    /**
     * Sets the preflightProcessFilter value for this TpMachineQueryResponse.
     * 
     * @param preflightProcessFilter
     */
    public void setPreflightProcessFilter(java.lang.String preflightProcessFilter) {
        this.preflightProcessFilter = preflightProcessFilter;
    }


    /**
     * Gets the enableSNMP value for this TpMachineQueryResponse.
     * 
     * @return enableSNMP
     */
    public java.lang.Boolean getEnableSNMP() {
        return enableSNMP;
    }


    /**
     * Sets the enableSNMP value for this TpMachineQueryResponse.
     * 
     * @param enableSNMP
     */
    public void setEnableSNMP(java.lang.Boolean enableSNMP) {
        this.enableSNMP = enableSNMP;
    }


    /**
     * Gets the tpMachines value for this TpMachineQueryResponse.
     * 
     * @return tpMachines
     */
    public org.hpccsystems.ws.wstopology.TpMachine[] getTpMachines() {
        return tpMachines;
    }


    /**
     * Sets the tpMachines value for this TpMachineQueryResponse.
     * 
     * @param tpMachines
     */
    public void setTpMachines(org.hpccsystems.ws.wstopology.TpMachine[] tpMachines) {
        this.tpMachines = tpMachines;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpMachineQueryResponse)) return false;
        TpMachineQueryResponse other = (TpMachineQueryResponse) obj;
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
            ((this.enablePreflightInfo==null && other.getEnablePreflightInfo()==null) || 
             (this.enablePreflightInfo!=null &&
              this.enablePreflightInfo.equals(other.getEnablePreflightInfo()))) &&
            ((this.hasThorSpareProcess==null && other.getHasThorSpareProcess()==null) || 
             (this.hasThorSpareProcess!=null &&
              this.hasThorSpareProcess.equals(other.getHasThorSpareProcess()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.oldIP==null && other.getOldIP()==null) || 
             (this.oldIP!=null &&
              this.oldIP.equals(other.getOldIP()))) &&
            ((this.logDirectory==null && other.getLogDirectory()==null) || 
             (this.logDirectory!=null &&
              this.logDirectory.equals(other.getLogDirectory()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
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
            ((this.enableSNMP==null && other.getEnableSNMP()==null) || 
             (this.enableSNMP!=null &&
              this.enableSNMP.equals(other.getEnableSNMP()))) &&
            ((this.tpMachines==null && other.getTpMachines()==null) || 
             (this.tpMachines!=null &&
              java.util.Arrays.equals(this.tpMachines, other.getTpMachines())));
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
        if (getEnablePreflightInfo() != null) {
            _hashCode += getEnablePreflightInfo().hashCode();
        }
        if (getHasThorSpareProcess() != null) {
            _hashCode += getHasThorSpareProcess().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getOldIP() != null) {
            _hashCode += getOldIP().hashCode();
        }
        if (getLogDirectory() != null) {
            _hashCode += getLogDirectory().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
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
        if (getEnableSNMP() != null) {
            _hashCode += getEnableSNMP().hashCode();
        }
        if (getTpMachines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTpMachines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTpMachines(), i);
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
        new org.apache.axis.description.TypeDesc(TpMachineQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpMachineQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enablePreflightInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "EnablePreflightInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasThorSpareProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "HasThorSpareProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "OldIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LogDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("enableSNMP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "EnableSNMP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpMachines");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachines"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachine"));
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
