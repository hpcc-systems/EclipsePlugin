/**
 * TpClusterQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpClusterQueryResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions;

    private java.lang.Boolean enableSNMP;

    private org.hpccsystems.ws.wstopology.TpCluster[] tpClusters;

    public TpClusterQueryResponse() {
    }

    public TpClusterQueryResponse(
           org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions,
           java.lang.Boolean enableSNMP,
           org.hpccsystems.ws.wstopology.TpCluster[] tpClusters) {
           this.exceptions = exceptions;
           this.enableSNMP = enableSNMP;
           this.tpClusters = tpClusters;
    }


    /**
     * Gets the exceptions value for this TpClusterQueryResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wstopology.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this TpClusterQueryResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the enableSNMP value for this TpClusterQueryResponse.
     * 
     * @return enableSNMP
     */
    public java.lang.Boolean getEnableSNMP() {
        return enableSNMP;
    }


    /**
     * Sets the enableSNMP value for this TpClusterQueryResponse.
     * 
     * @param enableSNMP
     */
    public void setEnableSNMP(java.lang.Boolean enableSNMP) {
        this.enableSNMP = enableSNMP;
    }


    /**
     * Gets the tpClusters value for this TpClusterQueryResponse.
     * 
     * @return tpClusters
     */
    public org.hpccsystems.ws.wstopology.TpCluster[] getTpClusters() {
        return tpClusters;
    }


    /**
     * Sets the tpClusters value for this TpClusterQueryResponse.
     * 
     * @param tpClusters
     */
    public void setTpClusters(org.hpccsystems.ws.wstopology.TpCluster[] tpClusters) {
        this.tpClusters = tpClusters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpClusterQueryResponse)) return false;
        TpClusterQueryResponse other = (TpClusterQueryResponse) obj;
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
            ((this.enableSNMP==null && other.getEnableSNMP()==null) || 
             (this.enableSNMP!=null &&
              this.enableSNMP.equals(other.getEnableSNMP()))) &&
            ((this.tpClusters==null && other.getTpClusters()==null) || 
             (this.tpClusters!=null &&
              java.util.Arrays.equals(this.tpClusters, other.getTpClusters())));
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
        if (getEnableSNMP() != null) {
            _hashCode += getEnableSNMP().hashCode();
        }
        if (getTpClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTpClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTpClusters(), i);
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
        new org.apache.axis.description.TypeDesc(TpClusterQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpClusterQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
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
        elemField.setFieldName("tpClusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpCluster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpCluster"));
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
