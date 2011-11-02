/**
 * DFUSearchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUSearchResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions;

    private java.lang.String showExample;

    private java.lang.String[] clusterNames;

    private java.lang.String[] fileTypes;

    public DFUSearchResponse() {
    }

    public DFUSearchResponse(
           org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions,
           java.lang.String showExample,
           java.lang.String[] clusterNames,
           java.lang.String[] fileTypes) {
           this.exceptions = exceptions;
           this.showExample = showExample;
           this.clusterNames = clusterNames;
           this.fileTypes = fileTypes;
    }


    /**
     * Gets the exceptions value for this DFUSearchResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wsdfu.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DFUSearchResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the showExample value for this DFUSearchResponse.
     * 
     * @return showExample
     */
    public java.lang.String getShowExample() {
        return showExample;
    }


    /**
     * Sets the showExample value for this DFUSearchResponse.
     * 
     * @param showExample
     */
    public void setShowExample(java.lang.String showExample) {
        this.showExample = showExample;
    }


    /**
     * Gets the clusterNames value for this DFUSearchResponse.
     * 
     * @return clusterNames
     */
    public java.lang.String[] getClusterNames() {
        return clusterNames;
    }


    /**
     * Sets the clusterNames value for this DFUSearchResponse.
     * 
     * @param clusterNames
     */
    public void setClusterNames(java.lang.String[] clusterNames) {
        this.clusterNames = clusterNames;
    }


    /**
     * Gets the fileTypes value for this DFUSearchResponse.
     * 
     * @return fileTypes
     */
    public java.lang.String[] getFileTypes() {
        return fileTypes;
    }


    /**
     * Sets the fileTypes value for this DFUSearchResponse.
     * 
     * @param fileTypes
     */
    public void setFileTypes(java.lang.String[] fileTypes) {
        this.fileTypes = fileTypes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUSearchResponse)) return false;
        DFUSearchResponse other = (DFUSearchResponse) obj;
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
            ((this.showExample==null && other.getShowExample()==null) || 
             (this.showExample!=null &&
              this.showExample.equals(other.getShowExample()))) &&
            ((this.clusterNames==null && other.getClusterNames()==null) || 
             (this.clusterNames!=null &&
              java.util.Arrays.equals(this.clusterNames, other.getClusterNames()))) &&
            ((this.fileTypes==null && other.getFileTypes()==null) || 
             (this.fileTypes!=null &&
              java.util.Arrays.equals(this.fileTypes, other.getFileTypes())));
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
        if (getShowExample() != null) {
            _hashCode += getShowExample().hashCode();
        }
        if (getClusterNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFileTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileTypes(), i);
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
        new org.apache.axis.description.TypeDesc(DFUSearchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSearchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showExample");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ShowExample"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ClusterNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ClusterName"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileType"));
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
