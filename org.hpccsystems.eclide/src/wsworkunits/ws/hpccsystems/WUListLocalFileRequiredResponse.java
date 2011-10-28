/**
 * WUListLocalFileRequiredResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsworkunits.ws.hpccsystems;

public class WUListLocalFileRequiredResponse  implements java.io.Serializable {
    private wsworkunits.ws.hpccsystems.ArrayOfEspException exceptions;

    private wsworkunits.ws.hpccsystems.LogicalFileUpload[] localFileUploads;

    public WUListLocalFileRequiredResponse() {
    }

    public WUListLocalFileRequiredResponse(
           wsworkunits.ws.hpccsystems.ArrayOfEspException exceptions,
           wsworkunits.ws.hpccsystems.LogicalFileUpload[] localFileUploads) {
           this.exceptions = exceptions;
           this.localFileUploads = localFileUploads;
    }


    /**
     * Gets the exceptions value for this WUListLocalFileRequiredResponse.
     * 
     * @return exceptions
     */
    public wsworkunits.ws.hpccsystems.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUListLocalFileRequiredResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(wsworkunits.ws.hpccsystems.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the localFileUploads value for this WUListLocalFileRequiredResponse.
     * 
     * @return localFileUploads
     */
    public wsworkunits.ws.hpccsystems.LogicalFileUpload[] getLocalFileUploads() {
        return localFileUploads;
    }


    /**
     * Sets the localFileUploads value for this WUListLocalFileRequiredResponse.
     * 
     * @param localFileUploads
     */
    public void setLocalFileUploads(wsworkunits.ws.hpccsystems.LogicalFileUpload[] localFileUploads) {
        this.localFileUploads = localFileUploads;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUListLocalFileRequiredResponse)) return false;
        WUListLocalFileRequiredResponse other = (WUListLocalFileRequiredResponse) obj;
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
            ((this.localFileUploads==null && other.getLocalFileUploads()==null) || 
             (this.localFileUploads!=null &&
              java.util.Arrays.equals(this.localFileUploads, other.getLocalFileUploads())));
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
        if (getLocalFileUploads() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalFileUploads());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalFileUploads(), i);
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
        new org.apache.axis.description.TypeDesc(WUListLocalFileRequiredResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListLocalFileRequiredResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localFileUploads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LocalFileUploads"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileUpload"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileUpload"));
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
