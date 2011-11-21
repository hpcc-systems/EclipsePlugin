/**
 * RenameAttributeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class RenameAttributeRequest  implements java.io.Serializable {
    private java.lang.String moduleName;

    private java.lang.String attributeName;

    private java.lang.String newModuleName;

    private java.lang.String newAttributeName;

    public RenameAttributeRequest() {
    }

    public RenameAttributeRequest(
           java.lang.String moduleName,
           java.lang.String attributeName,
           java.lang.String newModuleName,
           java.lang.String newAttributeName) {
           this.moduleName = moduleName;
           this.attributeName = attributeName;
           this.newModuleName = newModuleName;
           this.newAttributeName = newAttributeName;
    }


    /**
     * Gets the moduleName value for this RenameAttributeRequest.
     * 
     * @return moduleName
     */
    public java.lang.String getModuleName() {
        return moduleName;
    }


    /**
     * Sets the moduleName value for this RenameAttributeRequest.
     * 
     * @param moduleName
     */
    public void setModuleName(java.lang.String moduleName) {
        this.moduleName = moduleName;
    }


    /**
     * Gets the attributeName value for this RenameAttributeRequest.
     * 
     * @return attributeName
     */
    public java.lang.String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this RenameAttributeRequest.
     * 
     * @param attributeName
     */
    public void setAttributeName(java.lang.String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the newModuleName value for this RenameAttributeRequest.
     * 
     * @return newModuleName
     */
    public java.lang.String getNewModuleName() {
        return newModuleName;
    }


    /**
     * Sets the newModuleName value for this RenameAttributeRequest.
     * 
     * @param newModuleName
     */
    public void setNewModuleName(java.lang.String newModuleName) {
        this.newModuleName = newModuleName;
    }


    /**
     * Gets the newAttributeName value for this RenameAttributeRequest.
     * 
     * @return newAttributeName
     */
    public java.lang.String getNewAttributeName() {
        return newAttributeName;
    }


    /**
     * Sets the newAttributeName value for this RenameAttributeRequest.
     * 
     * @param newAttributeName
     */
    public void setNewAttributeName(java.lang.String newAttributeName) {
        this.newAttributeName = newAttributeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RenameAttributeRequest)) return false;
        RenameAttributeRequest other = (RenameAttributeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moduleName==null && other.getModuleName()==null) || 
             (this.moduleName!=null &&
              this.moduleName.equals(other.getModuleName()))) &&
            ((this.attributeName==null && other.getAttributeName()==null) || 
             (this.attributeName!=null &&
              this.attributeName.equals(other.getAttributeName()))) &&
            ((this.newModuleName==null && other.getNewModuleName()==null) || 
             (this.newModuleName!=null &&
              this.newModuleName.equals(other.getNewModuleName()))) &&
            ((this.newAttributeName==null && other.getNewAttributeName()==null) || 
             (this.newAttributeName!=null &&
              this.newAttributeName.equals(other.getNewAttributeName())));
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
        if (getModuleName() != null) {
            _hashCode += getModuleName().hashCode();
        }
        if (getAttributeName() != null) {
            _hashCode += getAttributeName().hashCode();
        }
        if (getNewModuleName() != null) {
            _hashCode += getNewModuleName().hashCode();
        }
        if (getNewAttributeName() != null) {
            _hashCode += getNewAttributeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RenameAttributeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "RenameAttributeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ModuleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "AttributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newModuleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "NewModuleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAttributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "NewAttributeName"));
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
