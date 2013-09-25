/**
 * GetThorQueueAvailabilityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wssmc;

public class GetThorQueueAvailabilityResponse  implements java.io.Serializable {
    private ArrayOfEspException exceptions;

    private ThorCluster[] thorClusters;

    public GetThorQueueAvailabilityResponse() {
    }

    public GetThorQueueAvailabilityResponse(
           ArrayOfEspException exceptions,
           ThorCluster[] thorClusters) {
           this.exceptions = exceptions;
           this.thorClusters = thorClusters;
    }


    /**
     * Gets the exceptions value for this GetThorQueueAvailabilityResponse.
     * 
     * @return exceptions
     */
    public ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this GetThorQueueAvailabilityResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the thorClusters value for this GetThorQueueAvailabilityResponse.
     * 
     * @return thorClusters
     */
    public ThorCluster[] getThorClusters() {
        return thorClusters;
    }


    /**
     * Sets the thorClusters value for this GetThorQueueAvailabilityResponse.
     * 
     * @param thorClusters
     */
    public void setThorClusters(ThorCluster[] thorClusters) {
        this.thorClusters = thorClusters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetThorQueueAvailabilityResponse)) return false;
        GetThorQueueAvailabilityResponse other = (GetThorQueueAvailabilityResponse) obj;
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
            ((this.thorClusters==null && other.getThorClusters()==null) || 
             (this.thorClusters!=null &&
              java.util.Arrays.equals(this.thorClusters, other.getThorClusters())));
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
        if (getThorClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThorClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThorClusters(), i);
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
        new org.apache.axis.description.TypeDesc(GetThorQueueAvailabilityResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">GetThorQueueAvailabilityResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thorClusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorClusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorCluster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorCluster"));
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
