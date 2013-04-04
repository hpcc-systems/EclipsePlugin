/**
 * ServerJobQueue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wssmc;

public class ServerJobQueue  implements java.io.Serializable {
    private java.lang.String queueName;

    private java.lang.String serverName;

    private java.lang.String serverType;

    private java.lang.String queueStatus;

    public ServerJobQueue() {
    }

    public ServerJobQueue(
           java.lang.String queueName,
           java.lang.String serverName,
           java.lang.String serverType,
           java.lang.String queueStatus) {
           this.queueName = queueName;
           this.serverName = serverName;
           this.serverType = serverType;
           this.queueStatus = queueStatus;
    }


    /**
     * Gets the queueName value for this ServerJobQueue.
     * 
     * @return queueName
     */
    public java.lang.String getQueueName() {
        return queueName;
    }


    /**
     * Sets the queueName value for this ServerJobQueue.
     * 
     * @param queueName
     */
    public void setQueueName(java.lang.String queueName) {
        this.queueName = queueName;
    }


    /**
     * Gets the serverName value for this ServerJobQueue.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this ServerJobQueue.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }


    /**
     * Gets the serverType value for this ServerJobQueue.
     * 
     * @return serverType
     */
    public java.lang.String getServerType() {
        return serverType;
    }


    /**
     * Sets the serverType value for this ServerJobQueue.
     * 
     * @param serverType
     */
    public void setServerType(java.lang.String serverType) {
        this.serverType = serverType;
    }


    /**
     * Gets the queueStatus value for this ServerJobQueue.
     * 
     * @return queueStatus
     */
    public java.lang.String getQueueStatus() {
        return queueStatus;
    }


    /**
     * Sets the queueStatus value for this ServerJobQueue.
     * 
     * @param queueStatus
     */
    public void setQueueStatus(java.lang.String queueStatus) {
        this.queueStatus = queueStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServerJobQueue)) return false;
        ServerJobQueue other = (ServerJobQueue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queueName==null && other.getQueueName()==null) || 
             (this.queueName!=null &&
              this.queueName.equals(other.getQueueName()))) &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName()))) &&
            ((this.serverType==null && other.getServerType()==null) || 
             (this.serverType!=null &&
              this.serverType.equals(other.getServerType()))) &&
            ((this.queueStatus==null && other.getQueueStatus()==null) || 
             (this.queueStatus!=null &&
              this.queueStatus.equals(other.getQueueStatus())));
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
        if (getQueueName() != null) {
            _hashCode += getQueueName().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        if (getServerType() != null) {
            _hashCode += getServerType().hashCode();
        }
        if (getQueueStatus() != null) {
            _hashCode += getQueueStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServerJobQueue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerType"));
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
