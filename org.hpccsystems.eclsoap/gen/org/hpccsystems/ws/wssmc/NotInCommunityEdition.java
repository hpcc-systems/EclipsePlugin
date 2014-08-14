/**
 * NotInCommunityEdition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wssmc;

public class NotInCommunityEdition  implements java.io.Serializable {
    private java.lang.String EEPortal;

    public NotInCommunityEdition() {
    }

    public NotInCommunityEdition(
           java.lang.String EEPortal) {
           this.EEPortal = EEPortal;
    }


    /**
     * Gets the EEPortal value for this NotInCommunityEdition.
     * 
     * @return EEPortal
     */
    public java.lang.String getEEPortal() {
        return EEPortal;
    }


    /**
     * Sets the EEPortal value for this NotInCommunityEdition.
     * 
     * @param EEPortal
     */
    public void setEEPortal(java.lang.String EEPortal) {
        this.EEPortal = EEPortal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotInCommunityEdition)) return false;
        NotInCommunityEdition other = (NotInCommunityEdition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EEPortal==null && other.getEEPortal()==null) || 
             (this.EEPortal!=null &&
              this.EEPortal.equals(other.getEEPortal())));
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
        if (getEEPortal() != null) {
            _hashCode += getEEPortal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotInCommunityEdition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">NotInCommunityEdition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EEPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "EEPortal"));
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
