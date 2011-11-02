/**
 * WUQuerysetActionQueries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUQuerysetActionQueries  implements java.io.Serializable {
    private java.lang.String querySetName;

    private java.lang.Boolean remove;

    private java.lang.Boolean toggleSuspend;

    private org.hpccsystems.ws.wsworkunits.QuerySetQueryAction[] querysetQueryActions;

    public WUQuerysetActionQueries() {
    }

    public WUQuerysetActionQueries(
           java.lang.String querySetName,
           java.lang.Boolean remove,
           java.lang.Boolean toggleSuspend,
           org.hpccsystems.ws.wsworkunits.QuerySetQueryAction[] querysetQueryActions) {
           this.querySetName = querySetName;
           this.remove = remove;
           this.toggleSuspend = toggleSuspend;
           this.querysetQueryActions = querysetQueryActions;
    }


    /**
     * Gets the querySetName value for this WUQuerysetActionQueries.
     * 
     * @return querySetName
     */
    public java.lang.String getQuerySetName() {
        return querySetName;
    }


    /**
     * Sets the querySetName value for this WUQuerysetActionQueries.
     * 
     * @param querySetName
     */
    public void setQuerySetName(java.lang.String querySetName) {
        this.querySetName = querySetName;
    }


    /**
     * Gets the remove value for this WUQuerysetActionQueries.
     * 
     * @return remove
     */
    public java.lang.Boolean getRemove() {
        return remove;
    }


    /**
     * Sets the remove value for this WUQuerysetActionQueries.
     * 
     * @param remove
     */
    public void setRemove(java.lang.Boolean remove) {
        this.remove = remove;
    }


    /**
     * Gets the toggleSuspend value for this WUQuerysetActionQueries.
     * 
     * @return toggleSuspend
     */
    public java.lang.Boolean getToggleSuspend() {
        return toggleSuspend;
    }


    /**
     * Sets the toggleSuspend value for this WUQuerysetActionQueries.
     * 
     * @param toggleSuspend
     */
    public void setToggleSuspend(java.lang.Boolean toggleSuspend) {
        this.toggleSuspend = toggleSuspend;
    }


    /**
     * Gets the querysetQueryActions value for this WUQuerysetActionQueries.
     * 
     * @return querysetQueryActions
     */
    public org.hpccsystems.ws.wsworkunits.QuerySetQueryAction[] getQuerysetQueryActions() {
        return querysetQueryActions;
    }


    /**
     * Sets the querysetQueryActions value for this WUQuerysetActionQueries.
     * 
     * @param querysetQueryActions
     */
    public void setQuerysetQueryActions(org.hpccsystems.ws.wsworkunits.QuerySetQueryAction[] querysetQueryActions) {
        this.querysetQueryActions = querysetQueryActions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUQuerysetActionQueries)) return false;
        WUQuerysetActionQueries other = (WUQuerysetActionQueries) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.querySetName==null && other.getQuerySetName()==null) || 
             (this.querySetName!=null &&
              this.querySetName.equals(other.getQuerySetName()))) &&
            ((this.remove==null && other.getRemove()==null) || 
             (this.remove!=null &&
              this.remove.equals(other.getRemove()))) &&
            ((this.toggleSuspend==null && other.getToggleSuspend()==null) || 
             (this.toggleSuspend!=null &&
              this.toggleSuspend.equals(other.getToggleSuspend()))) &&
            ((this.querysetQueryActions==null && other.getQuerysetQueryActions()==null) || 
             (this.querysetQueryActions!=null &&
              java.util.Arrays.equals(this.querysetQueryActions, other.getQuerysetQueryActions())));
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
        if (getQuerySetName() != null) {
            _hashCode += getQuerySetName().hashCode();
        }
        if (getRemove() != null) {
            _hashCode += getRemove().hashCode();
        }
        if (getToggleSuspend() != null) {
            _hashCode += getToggleSuspend().hashCode();
        }
        if (getQuerysetQueryActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuerysetQueryActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuerysetQueryActions(), i);
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
        new org.apache.axis.description.TypeDesc(WUQuerysetActionQueries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetActionQueries"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("toggleSuspend");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ToggleSuspend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querysetQueryActions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerysetQueryActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryAction"));
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
