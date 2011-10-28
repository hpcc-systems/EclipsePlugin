/**
 * WUSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsworkunits.ws.hpccsystems;

public class WUSchedule  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.String cluster;

    private java.lang.String queue;

    private java.lang.String snapshot;

    private java.util.Calendar when;

    private java.lang.Integer maxRunTime;

    public WUSchedule() {
    }

    public WUSchedule(
           java.lang.String wuid,
           java.lang.String cluster,
           java.lang.String queue,
           java.lang.String snapshot,
           java.util.Calendar when,
           java.lang.Integer maxRunTime) {
           this.wuid = wuid;
           this.cluster = cluster;
           this.queue = queue;
           this.snapshot = snapshot;
           this.when = when;
           this.maxRunTime = maxRunTime;
    }


    /**
     * Gets the wuid value for this WUSchedule.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUSchedule.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the cluster value for this WUSchedule.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this WUSchedule.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the queue value for this WUSchedule.
     * 
     * @return queue
     */
    public java.lang.String getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this WUSchedule.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }


    /**
     * Gets the snapshot value for this WUSchedule.
     * 
     * @return snapshot
     */
    public java.lang.String getSnapshot() {
        return snapshot;
    }


    /**
     * Sets the snapshot value for this WUSchedule.
     * 
     * @param snapshot
     */
    public void setSnapshot(java.lang.String snapshot) {
        this.snapshot = snapshot;
    }


    /**
     * Gets the when value for this WUSchedule.
     * 
     * @return when
     */
    public java.util.Calendar getWhen() {
        return when;
    }


    /**
     * Sets the when value for this WUSchedule.
     * 
     * @param when
     */
    public void setWhen(java.util.Calendar when) {
        this.when = when;
    }


    /**
     * Gets the maxRunTime value for this WUSchedule.
     * 
     * @return maxRunTime
     */
    public java.lang.Integer getMaxRunTime() {
        return maxRunTime;
    }


    /**
     * Sets the maxRunTime value for this WUSchedule.
     * 
     * @param maxRunTime
     */
    public void setMaxRunTime(java.lang.Integer maxRunTime) {
        this.maxRunTime = maxRunTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUSchedule)) return false;
        WUSchedule other = (WUSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              this.queue.equals(other.getQueue()))) &&
            ((this.snapshot==null && other.getSnapshot()==null) || 
             (this.snapshot!=null &&
              this.snapshot.equals(other.getSnapshot()))) &&
            ((this.when==null && other.getWhen()==null) || 
             (this.when!=null &&
              this.when.equals(other.getWhen()))) &&
            ((this.maxRunTime==null && other.getMaxRunTime()==null) || 
             (this.maxRunTime!=null &&
              this.maxRunTime.equals(other.getMaxRunTime())));
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
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getQueue() != null) {
            _hashCode += getQueue().hashCode();
        }
        if (getSnapshot() != null) {
            _hashCode += getSnapshot().hashCode();
        }
        if (getWhen() != null) {
            _hashCode += getWhen().hashCode();
        }
        if (getMaxRunTime() != null) {
            _hashCode += getMaxRunTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Snapshot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("when");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "When"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRunTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MaxRunTime"));
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
