/**
 * WUGraphInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUGraphInfoResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions;

    private java.lang.String wuid;

    private java.lang.String name;

    private java.lang.String GID;

    private java.lang.Integer batchWU;

    private java.lang.Boolean running;

    public WUGraphInfoResponse() {
    }

    public WUGraphInfoResponse(
           org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions,
           java.lang.String wuid,
           java.lang.String name,
           java.lang.String GID,
           java.lang.Integer batchWU,
           java.lang.Boolean running) {
           this.exceptions = exceptions;
           this.wuid = wuid;
           this.name = name;
           this.GID = GID;
           this.batchWU = batchWU;
           this.running = running;
    }


    /**
     * Gets the exceptions value for this WUGraphInfoResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wsworkunits.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUGraphInfoResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the wuid value for this WUGraphInfoResponse.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUGraphInfoResponse.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the name value for this WUGraphInfoResponse.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WUGraphInfoResponse.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the GID value for this WUGraphInfoResponse.
     * 
     * @return GID
     */
    public java.lang.String getGID() {
        return GID;
    }


    /**
     * Sets the GID value for this WUGraphInfoResponse.
     * 
     * @param GID
     */
    public void setGID(java.lang.String GID) {
        this.GID = GID;
    }


    /**
     * Gets the batchWU value for this WUGraphInfoResponse.
     * 
     * @return batchWU
     */
    public java.lang.Integer getBatchWU() {
        return batchWU;
    }


    /**
     * Sets the batchWU value for this WUGraphInfoResponse.
     * 
     * @param batchWU
     */
    public void setBatchWU(java.lang.Integer batchWU) {
        this.batchWU = batchWU;
    }


    /**
     * Gets the running value for this WUGraphInfoResponse.
     * 
     * @return running
     */
    public java.lang.Boolean getRunning() {
        return running;
    }


    /**
     * Sets the running value for this WUGraphInfoResponse.
     * 
     * @param running
     */
    public void setRunning(java.lang.Boolean running) {
        this.running = running;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUGraphInfoResponse)) return false;
        WUGraphInfoResponse other = (WUGraphInfoResponse) obj;
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
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.GID==null && other.getGID()==null) || 
             (this.GID!=null &&
              this.GID.equals(other.getGID()))) &&
            ((this.batchWU==null && other.getBatchWU()==null) || 
             (this.batchWU!=null &&
              this.batchWU.equals(other.getBatchWU()))) &&
            ((this.running==null && other.getRunning()==null) || 
             (this.running!=null &&
              this.running.equals(other.getRunning())));
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
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getGID() != null) {
            _hashCode += getGID().hashCode();
        }
        if (getBatchWU() != null) {
            _hashCode += getBatchWU().hashCode();
        }
        if (getRunning() != null) {
            _hashCode += getRunning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUGraphInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchWU");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BatchWU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("running");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Running"));
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
