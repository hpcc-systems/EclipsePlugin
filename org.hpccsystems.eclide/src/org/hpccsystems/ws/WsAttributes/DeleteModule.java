/**
 * DeleteModule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class DeleteModule  implements java.io.Serializable {
    private java.lang.String moduleName;

    public DeleteModule() {
    }

    public DeleteModule(
           java.lang.String moduleName) {
           this.moduleName = moduleName;
    }


    /**
     * Gets the moduleName value for this DeleteModule.
     * 
     * @return moduleName
     */
    public java.lang.String getModuleName() {
        return moduleName;
    }


    /**
     * Sets the moduleName value for this DeleteModule.
     * 
     * @param moduleName
     */
    public void setModuleName(java.lang.String moduleName) {
        this.moduleName = moduleName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteModule)) return false;
        DeleteModule other = (DeleteModule) obj;
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
              this.moduleName.equals(other.getModuleName())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteModule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">DeleteModule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ModuleName"));
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
