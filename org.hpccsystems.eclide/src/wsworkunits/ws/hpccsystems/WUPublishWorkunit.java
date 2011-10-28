/**
 * WUPublishWorkunit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsworkunits.ws.hpccsystems;

public class WUPublishWorkunit  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.String cluster;

    private java.lang.String jobName;

    private java.lang.Integer activate;

    private java.lang.Boolean notifyCluster;

    private java.lang.Boolean showFiles;

    private java.lang.Boolean copyLocal;

    public WUPublishWorkunit() {
    }

    public WUPublishWorkunit(
           java.lang.String wuid,
           java.lang.String cluster,
           java.lang.String jobName,
           java.lang.Integer activate,
           java.lang.Boolean notifyCluster,
           java.lang.Boolean showFiles,
           java.lang.Boolean copyLocal) {
           this.wuid = wuid;
           this.cluster = cluster;
           this.jobName = jobName;
           this.activate = activate;
           this.notifyCluster = notifyCluster;
           this.showFiles = showFiles;
           this.copyLocal = copyLocal;
    }


    /**
     * Gets the wuid value for this WUPublishWorkunit.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUPublishWorkunit.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the cluster value for this WUPublishWorkunit.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this WUPublishWorkunit.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the jobName value for this WUPublishWorkunit.
     * 
     * @return jobName
     */
    public java.lang.String getJobName() {
        return jobName;
    }


    /**
     * Sets the jobName value for this WUPublishWorkunit.
     * 
     * @param jobName
     */
    public void setJobName(java.lang.String jobName) {
        this.jobName = jobName;
    }


    /**
     * Gets the activate value for this WUPublishWorkunit.
     * 
     * @return activate
     */
    public java.lang.Integer getActivate() {
        return activate;
    }


    /**
     * Sets the activate value for this WUPublishWorkunit.
     * 
     * @param activate
     */
    public void setActivate(java.lang.Integer activate) {
        this.activate = activate;
    }


    /**
     * Gets the notifyCluster value for this WUPublishWorkunit.
     * 
     * @return notifyCluster
     */
    public java.lang.Boolean getNotifyCluster() {
        return notifyCluster;
    }


    /**
     * Sets the notifyCluster value for this WUPublishWorkunit.
     * 
     * @param notifyCluster
     */
    public void setNotifyCluster(java.lang.Boolean notifyCluster) {
        this.notifyCluster = notifyCluster;
    }


    /**
     * Gets the showFiles value for this WUPublishWorkunit.
     * 
     * @return showFiles
     */
    public java.lang.Boolean getShowFiles() {
        return showFiles;
    }


    /**
     * Sets the showFiles value for this WUPublishWorkunit.
     * 
     * @param showFiles
     */
    public void setShowFiles(java.lang.Boolean showFiles) {
        this.showFiles = showFiles;
    }


    /**
     * Gets the copyLocal value for this WUPublishWorkunit.
     * 
     * @return copyLocal
     */
    public java.lang.Boolean getCopyLocal() {
        return copyLocal;
    }


    /**
     * Sets the copyLocal value for this WUPublishWorkunit.
     * 
     * @param copyLocal
     */
    public void setCopyLocal(java.lang.Boolean copyLocal) {
        this.copyLocal = copyLocal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUPublishWorkunit)) return false;
        WUPublishWorkunit other = (WUPublishWorkunit) obj;
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
            ((this.jobName==null && other.getJobName()==null) || 
             (this.jobName!=null &&
              this.jobName.equals(other.getJobName()))) &&
            ((this.activate==null && other.getActivate()==null) || 
             (this.activate!=null &&
              this.activate.equals(other.getActivate()))) &&
            ((this.notifyCluster==null && other.getNotifyCluster()==null) || 
             (this.notifyCluster!=null &&
              this.notifyCluster.equals(other.getNotifyCluster()))) &&
            ((this.showFiles==null && other.getShowFiles()==null) || 
             (this.showFiles!=null &&
              this.showFiles.equals(other.getShowFiles()))) &&
            ((this.copyLocal==null && other.getCopyLocal()==null) || 
             (this.copyLocal!=null &&
              this.copyLocal.equals(other.getCopyLocal())));
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
        if (getJobName() != null) {
            _hashCode += getJobName().hashCode();
        }
        if (getActivate() != null) {
            _hashCode += getActivate().hashCode();
        }
        if (getNotifyCluster() != null) {
            _hashCode += getNotifyCluster().hashCode();
        }
        if (getShowFiles() != null) {
            _hashCode += getShowFiles().hashCode();
        }
        if (getCopyLocal() != null) {
            _hashCode += getCopyLocal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUPublishWorkunit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPublishWorkunit"));
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
        elemField.setFieldName("jobName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "JobName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NotifyCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "showFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CopyLocal"));
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
