/**
 * WULogicalFileCopyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsworkunits.ws.hpccsystems;

public class WULogicalFileCopyInfo  implements java.io.Serializable {
    private java.lang.Boolean isIndex;

    private java.lang.String logicalName;

    private java.lang.String dfuCopyWuid;

    private java.lang.String dfuCopyError;

    private java.lang.String[] clusters;

    public WULogicalFileCopyInfo() {
    }

    public WULogicalFileCopyInfo(
           java.lang.Boolean isIndex,
           java.lang.String logicalName,
           java.lang.String dfuCopyWuid,
           java.lang.String dfuCopyError,
           java.lang.String[] clusters) {
           this.isIndex = isIndex;
           this.logicalName = logicalName;
           this.dfuCopyWuid = dfuCopyWuid;
           this.dfuCopyError = dfuCopyError;
           this.clusters = clusters;
    }


    /**
     * Gets the isIndex value for this WULogicalFileCopyInfo.
     * 
     * @return isIndex
     */
    public java.lang.Boolean getIsIndex() {
        return isIndex;
    }


    /**
     * Sets the isIndex value for this WULogicalFileCopyInfo.
     * 
     * @param isIndex
     */
    public void setIsIndex(java.lang.Boolean isIndex) {
        this.isIndex = isIndex;
    }


    /**
     * Gets the logicalName value for this WULogicalFileCopyInfo.
     * 
     * @return logicalName
     */
    public java.lang.String getLogicalName() {
        return logicalName;
    }


    /**
     * Sets the logicalName value for this WULogicalFileCopyInfo.
     * 
     * @param logicalName
     */
    public void setLogicalName(java.lang.String logicalName) {
        this.logicalName = logicalName;
    }


    /**
     * Gets the dfuCopyWuid value for this WULogicalFileCopyInfo.
     * 
     * @return dfuCopyWuid
     */
    public java.lang.String getDfuCopyWuid() {
        return dfuCopyWuid;
    }


    /**
     * Sets the dfuCopyWuid value for this WULogicalFileCopyInfo.
     * 
     * @param dfuCopyWuid
     */
    public void setDfuCopyWuid(java.lang.String dfuCopyWuid) {
        this.dfuCopyWuid = dfuCopyWuid;
    }


    /**
     * Gets the dfuCopyError value for this WULogicalFileCopyInfo.
     * 
     * @return dfuCopyError
     */
    public java.lang.String getDfuCopyError() {
        return dfuCopyError;
    }


    /**
     * Sets the dfuCopyError value for this WULogicalFileCopyInfo.
     * 
     * @param dfuCopyError
     */
    public void setDfuCopyError(java.lang.String dfuCopyError) {
        this.dfuCopyError = dfuCopyError;
    }


    /**
     * Gets the clusters value for this WULogicalFileCopyInfo.
     * 
     * @return clusters
     */
    public java.lang.String[] getClusters() {
        return clusters;
    }


    /**
     * Sets the clusters value for this WULogicalFileCopyInfo.
     * 
     * @param clusters
     */
    public void setClusters(java.lang.String[] clusters) {
        this.clusters = clusters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WULogicalFileCopyInfo)) return false;
        WULogicalFileCopyInfo other = (WULogicalFileCopyInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isIndex==null && other.getIsIndex()==null) || 
             (this.isIndex!=null &&
              this.isIndex.equals(other.getIsIndex()))) &&
            ((this.logicalName==null && other.getLogicalName()==null) || 
             (this.logicalName!=null &&
              this.logicalName.equals(other.getLogicalName()))) &&
            ((this.dfuCopyWuid==null && other.getDfuCopyWuid()==null) || 
             (this.dfuCopyWuid!=null &&
              this.dfuCopyWuid.equals(other.getDfuCopyWuid()))) &&
            ((this.dfuCopyError==null && other.getDfuCopyError()==null) || 
             (this.dfuCopyError!=null &&
              this.dfuCopyError.equals(other.getDfuCopyError()))) &&
            ((this.clusters==null && other.getClusters()==null) || 
             (this.clusters!=null &&
              java.util.Arrays.equals(this.clusters, other.getClusters())));
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
        if (getIsIndex() != null) {
            _hashCode += getIsIndex().hashCode();
        }
        if (getLogicalName() != null) {
            _hashCode += getLogicalName().hashCode();
        }
        if (getDfuCopyWuid() != null) {
            _hashCode += getDfuCopyWuid().hashCode();
        }
        if (getDfuCopyError() != null) {
            _hashCode += getDfuCopyError().hashCode();
        }
        if (getClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusters(), i);
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
        new org.apache.axis.description.TypeDesc(WULogicalFileCopyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfuCopyWuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DfuCopyWuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfuCopyError");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DfuCopyError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Clusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Item"));
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
