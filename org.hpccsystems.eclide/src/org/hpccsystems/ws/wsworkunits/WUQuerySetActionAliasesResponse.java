/**
 * WUQuerySetActionAliasesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUQuerySetActionAliasesResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions;

    private java.lang.String querySetName;

    private java.lang.Boolean remove;

    private org.hpccsystems.ws.wsworkunits.QuerySetAliasAction[] querysetAliasActions;

    public WUQuerySetActionAliasesResponse() {
    }

    public WUQuerySetActionAliasesResponse(
           org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions,
           java.lang.String querySetName,
           java.lang.Boolean remove,
           org.hpccsystems.ws.wsworkunits.QuerySetAliasAction[] querysetAliasActions) {
           this.exceptions = exceptions;
           this.querySetName = querySetName;
           this.remove = remove;
           this.querysetAliasActions = querysetAliasActions;
    }


    /**
     * Gets the exceptions value for this WUQuerySetActionAliasesResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wsworkunits.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUQuerySetActionAliasesResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the querySetName value for this WUQuerySetActionAliasesResponse.
     * 
     * @return querySetName
     */
    public java.lang.String getQuerySetName() {
        return querySetName;
    }


    /**
     * Sets the querySetName value for this WUQuerySetActionAliasesResponse.
     * 
     * @param querySetName
     */
    public void setQuerySetName(java.lang.String querySetName) {
        this.querySetName = querySetName;
    }


    /**
     * Gets the remove value for this WUQuerySetActionAliasesResponse.
     * 
     * @return remove
     */
    public java.lang.Boolean getRemove() {
        return remove;
    }


    /**
     * Sets the remove value for this WUQuerySetActionAliasesResponse.
     * 
     * @param remove
     */
    public void setRemove(java.lang.Boolean remove) {
        this.remove = remove;
    }


    /**
     * Gets the querysetAliasActions value for this WUQuerySetActionAliasesResponse.
     * 
     * @return querysetAliasActions
     */
    public org.hpccsystems.ws.wsworkunits.QuerySetAliasAction[] getQuerysetAliasActions() {
        return querysetAliasActions;
    }


    /**
     * Sets the querysetAliasActions value for this WUQuerySetActionAliasesResponse.
     * 
     * @param querysetAliasActions
     */
    public void setQuerysetAliasActions(org.hpccsystems.ws.wsworkunits.QuerySetAliasAction[] querysetAliasActions) {
        this.querysetAliasActions = querysetAliasActions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUQuerySetActionAliasesResponse)) return false;
        WUQuerySetActionAliasesResponse other = (WUQuerySetActionAliasesResponse) obj;
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
            ((this.querySetName==null && other.getQuerySetName()==null) || 
             (this.querySetName!=null &&
              this.querySetName.equals(other.getQuerySetName()))) &&
            ((this.remove==null && other.getRemove()==null) || 
             (this.remove!=null &&
              this.remove.equals(other.getRemove()))) &&
            ((this.querysetAliasActions==null && other.getQuerysetAliasActions()==null) || 
             (this.querysetAliasActions!=null &&
              java.util.Arrays.equals(this.querysetAliasActions, other.getQuerysetAliasActions())));
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
        if (getQuerySetName() != null) {
            _hashCode += getQuerySetName().hashCode();
        }
        if (getRemove() != null) {
            _hashCode += getRemove().hashCode();
        }
        if (getQuerysetAliasActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuerysetAliasActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuerysetAliasActions(), i);
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
        new org.apache.axis.description.TypeDesc(WUQuerySetActionAliasesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetActionAliasesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySetName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remove");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Remove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querysetAliasActions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerysetAliasActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAliasAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAliasAction"));
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
