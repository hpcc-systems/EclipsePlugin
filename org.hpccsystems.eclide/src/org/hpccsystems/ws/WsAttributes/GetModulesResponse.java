/**
 * GetModulesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class GetModulesResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.WsAttributes.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.WsAttributes.ECLModule[] outModules;

    public GetModulesResponse() {
    }

    public GetModulesResponse(
           org.hpccsystems.ws.WsAttributes.ArrayOfEspException exceptions,
           org.hpccsystems.ws.WsAttributes.ECLModule[] outModules) {
           this.exceptions = exceptions;
           this.outModules = outModules;
    }


    /**
     * Gets the exceptions value for this GetModulesResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.WsAttributes.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this GetModulesResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.WsAttributes.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the outModules value for this GetModulesResponse.
     * 
     * @return outModules
     */
    public org.hpccsystems.ws.WsAttributes.ECLModule[] getOutModules() {
        return outModules;
    }


    /**
     * Sets the outModules value for this GetModulesResponse.
     * 
     * @param outModules
     */
    public void setOutModules(org.hpccsystems.ws.WsAttributes.ECLModule[] outModules) {
        this.outModules = outModules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetModulesResponse)) return false;
        GetModulesResponse other = (GetModulesResponse) obj;
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
            ((this.outModules==null && other.getOutModules()==null) || 
             (this.outModules!=null &&
              java.util.Arrays.equals(this.outModules, other.getOutModules())));
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
        if (getOutModules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutModules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutModules(), i);
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
        new org.apache.axis.description.TypeDesc(GetModulesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetModulesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outModules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "outModules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLModule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLModule"));
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
