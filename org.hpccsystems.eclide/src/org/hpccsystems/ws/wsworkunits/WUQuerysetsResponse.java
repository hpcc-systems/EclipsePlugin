/**
 * WUQuerysetsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUQuerysetsResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.wsworkunits.QuerySet[] querysets;

    public WUQuerysetsResponse() {
    }

    public WUQuerysetsResponse(
           org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions,
           org.hpccsystems.ws.wsworkunits.QuerySet[] querysets) {
           this.exceptions = exceptions;
           this.querysets = querysets;
    }


    /**
     * Gets the exceptions value for this WUQuerysetsResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wsworkunits.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUQuerysetsResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the querysets value for this WUQuerysetsResponse.
     * 
     * @return querysets
     */
    public org.hpccsystems.ws.wsworkunits.QuerySet[] getQuerysets() {
        return querysets;
    }


    /**
     * Sets the querysets value for this WUQuerysetsResponse.
     * 
     * @param querysets
     */
    public void setQuerysets(org.hpccsystems.ws.wsworkunits.QuerySet[] querysets) {
        this.querysets = querysets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUQuerysetsResponse)) return false;
        WUQuerysetsResponse other = (WUQuerysetsResponse) obj;
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
            ((this.querysets==null && other.getQuerysets()==null) || 
             (this.querysets!=null &&
              java.util.Arrays.equals(this.querysets, other.getQuerysets())));
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
        if (getQuerysets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuerysets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuerysets(), i);
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
        new org.apache.axis.description.TypeDesc(WUQuerysetsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querysets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Querysets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet"));
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
