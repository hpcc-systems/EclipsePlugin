/**
 * AddtoSuperfileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class AddtoSuperfileResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions;

    private java.lang.String subfiles;

    private java.lang.String backToPage;

    private java.lang.String[] subfileNames;

    public AddtoSuperfileResponse() {
    }

    public AddtoSuperfileResponse(
           org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions,
           java.lang.String subfiles,
           java.lang.String backToPage,
           java.lang.String[] subfileNames) {
           this.exceptions = exceptions;
           this.subfiles = subfiles;
           this.backToPage = backToPage;
           this.subfileNames = subfileNames;
    }


    /**
     * Gets the exceptions value for this AddtoSuperfileResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wsdfu.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this AddtoSuperfileResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the subfiles value for this AddtoSuperfileResponse.
     * 
     * @return subfiles
     */
    public java.lang.String getSubfiles() {
        return subfiles;
    }


    /**
     * Sets the subfiles value for this AddtoSuperfileResponse.
     * 
     * @param subfiles
     */
    public void setSubfiles(java.lang.String subfiles) {
        this.subfiles = subfiles;
    }


    /**
     * Gets the backToPage value for this AddtoSuperfileResponse.
     * 
     * @return backToPage
     */
    public java.lang.String getBackToPage() {
        return backToPage;
    }


    /**
     * Sets the backToPage value for this AddtoSuperfileResponse.
     * 
     * @param backToPage
     */
    public void setBackToPage(java.lang.String backToPage) {
        this.backToPage = backToPage;
    }


    /**
     * Gets the subfileNames value for this AddtoSuperfileResponse.
     * 
     * @return subfileNames
     */
    public java.lang.String[] getSubfileNames() {
        return subfileNames;
    }


    /**
     * Sets the subfileNames value for this AddtoSuperfileResponse.
     * 
     * @param subfileNames
     */
    public void setSubfileNames(java.lang.String[] subfileNames) {
        this.subfileNames = subfileNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddtoSuperfileResponse)) return false;
        AddtoSuperfileResponse other = (AddtoSuperfileResponse) obj;
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
            ((this.subfiles==null && other.getSubfiles()==null) || 
             (this.subfiles!=null &&
              this.subfiles.equals(other.getSubfiles()))) &&
            ((this.backToPage==null && other.getBackToPage()==null) || 
             (this.backToPage!=null &&
              this.backToPage.equals(other.getBackToPage()))) &&
            ((this.subfileNames==null && other.getSubfileNames()==null) || 
             (this.subfileNames!=null &&
              java.util.Arrays.equals(this.subfileNames, other.getSubfileNames())));
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
        if (getSubfiles() != null) {
            _hashCode += getSubfiles().hashCode();
        }
        if (getBackToPage() != null) {
            _hashCode += getBackToPage().hashCode();
        }
        if (getSubfileNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubfileNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubfileNames(), i);
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
        new org.apache.axis.description.TypeDesc(AddtoSuperfileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddtoSuperfileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Subfiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backToPage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "BackToPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subfileNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SubfileNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SubfileName"));
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
