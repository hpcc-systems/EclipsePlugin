/**
 * WUWaitCompiled.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUWaitCompiled  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.Integer wait;

    private java.lang.Boolean returnOnWait;

    public WUWaitCompiled() {
    }

    public WUWaitCompiled(
           java.lang.String wuid,
           java.lang.Integer wait,
           java.lang.Boolean returnOnWait) {
           this.wuid = wuid;
           this.wait = wait;
           this.returnOnWait = returnOnWait;
    }


    /**
     * Gets the wuid value for this WUWaitCompiled.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUWaitCompiled.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the wait value for this WUWaitCompiled.
     * 
     * @return wait
     */
    public java.lang.Integer getWait() {
        return wait;
    }


    /**
     * Sets the wait value for this WUWaitCompiled.
     * 
     * @param wait
     */
    public void setWait(java.lang.Integer wait) {
        this.wait = wait;
    }


    /**
     * Gets the returnOnWait value for this WUWaitCompiled.
     * 
     * @return returnOnWait
     */
    public java.lang.Boolean getReturnOnWait() {
        return returnOnWait;
    }


    /**
     * Sets the returnOnWait value for this WUWaitCompiled.
     * 
     * @param returnOnWait
     */
    public void setReturnOnWait(java.lang.Boolean returnOnWait) {
        this.returnOnWait = returnOnWait;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUWaitCompiled)) return false;
        WUWaitCompiled other = (WUWaitCompiled) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.wait==null && other.getWait()==null) || 
             (this.wait!=null &&
              this.wait.equals(other.getWait()))) &&
            ((this.returnOnWait==null && other.getReturnOnWait()==null) || 
             (this.returnOnWait!=null &&
              this.returnOnWait.equals(other.getReturnOnWait())));
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
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getWait() != null) {
            _hashCode += getWait().hashCode();
        }
        if (getReturnOnWait() != null) {
            _hashCode += getReturnOnWait().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUWaitCompiled.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitCompiled"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wait");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wait"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnOnWait");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ReturnOnWait"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
