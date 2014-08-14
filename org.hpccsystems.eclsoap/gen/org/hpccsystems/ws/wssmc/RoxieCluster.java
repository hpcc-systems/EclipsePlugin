/**
 * RoxieCluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wssmc;

public class RoxieCluster  implements java.io.Serializable {
    private java.lang.String clusterName;

    private java.lang.String queueName;

    private java.lang.String queueStatus;

    private java.lang.Integer jobsRunning;

    private java.lang.Integer jobsInQueue;

    private java.lang.Integer queueStatus2;

    private java.lang.Integer clusterSize;

    public RoxieCluster() {
    }

    public RoxieCluster(
           java.lang.String clusterName,
           java.lang.String queueName,
           java.lang.String queueStatus,
           java.lang.Integer jobsRunning,
           java.lang.Integer jobsInQueue,
           java.lang.Integer queueStatus2,
           java.lang.Integer clusterSize) {
           this.clusterName = clusterName;
           this.queueName = queueName;
           this.queueStatus = queueStatus;
           this.jobsRunning = jobsRunning;
           this.jobsInQueue = jobsInQueue;
           this.queueStatus2 = queueStatus2;
           this.clusterSize = clusterSize;
    }


    /**
     * Gets the clusterName value for this RoxieCluster.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this RoxieCluster.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * Gets the queueName value for this RoxieCluster.
     * 
     * @return queueName
     */
    public java.lang.String getQueueName() {
        return queueName;
    }


    /**
     * Sets the queueName value for this RoxieCluster.
     * 
     * @param queueName
     */
    public void setQueueName(java.lang.String queueName) {
        this.queueName = queueName;
    }


    /**
     * Gets the queueStatus value for this RoxieCluster.
     * 
     * @return queueStatus
     */
    public java.lang.String getQueueStatus() {
        return queueStatus;
    }


    /**
     * Sets the queueStatus value for this RoxieCluster.
     * 
     * @param queueStatus
     */
    public void setQueueStatus(java.lang.String queueStatus) {
        this.queueStatus = queueStatus;
    }


    /**
     * Gets the jobsRunning value for this RoxieCluster.
     * 
     * @return jobsRunning
     */
    public java.lang.Integer getJobsRunning() {
        return jobsRunning;
    }


    /**
     * Sets the jobsRunning value for this RoxieCluster.
     * 
     * @param jobsRunning
     */
    public void setJobsRunning(java.lang.Integer jobsRunning) {
        this.jobsRunning = jobsRunning;
    }


    /**
     * Gets the jobsInQueue value for this RoxieCluster.
     * 
     * @return jobsInQueue
     */
    public java.lang.Integer getJobsInQueue() {
        return jobsInQueue;
    }


    /**
     * Sets the jobsInQueue value for this RoxieCluster.
     * 
     * @param jobsInQueue
     */
    public void setJobsInQueue(java.lang.Integer jobsInQueue) {
        this.jobsInQueue = jobsInQueue;
    }


    /**
     * Gets the queueStatus2 value for this RoxieCluster.
     * 
     * @return queueStatus2
     */
    public java.lang.Integer getQueueStatus2() {
        return queueStatus2;
    }


    /**
     * Sets the queueStatus2 value for this RoxieCluster.
     * 
     * @param queueStatus2
     */
    public void setQueueStatus2(java.lang.Integer queueStatus2) {
        this.queueStatus2 = queueStatus2;
    }


    /**
     * Gets the clusterSize value for this RoxieCluster.
     * 
     * @return clusterSize
     */
    public java.lang.Integer getClusterSize() {
        return clusterSize;
    }


    /**
     * Sets the clusterSize value for this RoxieCluster.
     * 
     * @param clusterSize
     */
    public void setClusterSize(java.lang.Integer clusterSize) {
        this.clusterSize = clusterSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoxieCluster)) return false;
        RoxieCluster other = (RoxieCluster) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterName==null && other.getClusterName()==null) || 
             (this.clusterName!=null &&
              this.clusterName.equals(other.getClusterName()))) &&
            ((this.queueName==null && other.getQueueName()==null) || 
             (this.queueName!=null &&
              this.queueName.equals(other.getQueueName()))) &&
            ((this.queueStatus==null && other.getQueueStatus()==null) || 
             (this.queueStatus!=null &&
              this.queueStatus.equals(other.getQueueStatus()))) &&
            ((this.jobsRunning==null && other.getJobsRunning()==null) || 
             (this.jobsRunning!=null &&
              this.jobsRunning.equals(other.getJobsRunning()))) &&
            ((this.jobsInQueue==null && other.getJobsInQueue()==null) || 
             (this.jobsInQueue!=null &&
              this.jobsInQueue.equals(other.getJobsInQueue()))) &&
            ((this.queueStatus2==null && other.getQueueStatus2()==null) || 
             (this.queueStatus2!=null &&
              this.queueStatus2.equals(other.getQueueStatus2()))) &&
            ((this.clusterSize==null && other.getClusterSize()==null) || 
             (this.clusterSize!=null &&
              this.clusterSize.equals(other.getClusterSize())));
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
        if (getClusterName() != null) {
            _hashCode += getClusterName().hashCode();
        }
        if (getQueueName() != null) {
            _hashCode += getQueueName().hashCode();
        }
        if (getQueueStatus() != null) {
            _hashCode += getQueueStatus().hashCode();
        }
        if (getJobsRunning() != null) {
            _hashCode += getJobsRunning().hashCode();
        }
        if (getJobsInQueue() != null) {
            _hashCode += getJobsInQueue().hashCode();
        }
        if (getQueueStatus2() != null) {
            _hashCode += getQueueStatus2().hashCode();
        }
        if (getClusterSize() != null) {
            _hashCode += getClusterSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoxieCluster.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieCluster"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClusterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobsRunning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "JobsRunning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobsInQueue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "JobsInQueue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueStatus2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueStatus2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClusterSize"));
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
