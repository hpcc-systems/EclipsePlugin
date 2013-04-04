/**
 * BrowseResourcesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wssmc;

public class BrowseResourcesResponse  implements java.io.Serializable {
    private ArrayOfEspException exceptions;

    private java.lang.String portalURL;

    private java.lang.String netAddress;

    private java.lang.Integer OS;

    private java.lang.Boolean useResource;

    private HPCCResourceRepository[] HPCCResourceRepositories;

    public BrowseResourcesResponse() {
    }

    public BrowseResourcesResponse(
           ArrayOfEspException exceptions,
           java.lang.String portalURL,
           java.lang.String netAddress,
           java.lang.Integer OS,
           java.lang.Boolean useResource,
           HPCCResourceRepository[] HPCCResourceRepositories) {
           this.exceptions = exceptions;
           this.portalURL = portalURL;
           this.netAddress = netAddress;
           this.OS = OS;
           this.useResource = useResource;
           this.HPCCResourceRepositories = HPCCResourceRepositories;
    }


    /**
     * Gets the exceptions value for this BrowseResourcesResponse.
     * 
     * @return exceptions
     */
    public ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this BrowseResourcesResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the portalURL value for this BrowseResourcesResponse.
     * 
     * @return portalURL
     */
    public java.lang.String getPortalURL() {
        return portalURL;
    }


    /**
     * Sets the portalURL value for this BrowseResourcesResponse.
     * 
     * @param portalURL
     */
    public void setPortalURL(java.lang.String portalURL) {
        this.portalURL = portalURL;
    }


    /**
     * Gets the netAddress value for this BrowseResourcesResponse.
     * 
     * @return netAddress
     */
    public java.lang.String getNetAddress() {
        return netAddress;
    }


    /**
     * Sets the netAddress value for this BrowseResourcesResponse.
     * 
     * @param netAddress
     */
    public void setNetAddress(java.lang.String netAddress) {
        this.netAddress = netAddress;
    }


    /**
     * Gets the OS value for this BrowseResourcesResponse.
     * 
     * @return OS
     */
    public java.lang.Integer getOS() {
        return OS;
    }


    /**
     * Sets the OS value for this BrowseResourcesResponse.
     * 
     * @param OS
     */
    public void setOS(java.lang.Integer OS) {
        this.OS = OS;
    }


    /**
     * Gets the useResource value for this BrowseResourcesResponse.
     * 
     * @return useResource
     */
    public java.lang.Boolean getUseResource() {
        return useResource;
    }


    /**
     * Sets the useResource value for this BrowseResourcesResponse.
     * 
     * @param useResource
     */
    public void setUseResource(java.lang.Boolean useResource) {
        this.useResource = useResource;
    }


    /**
     * Gets the HPCCResourceRepositories value for this BrowseResourcesResponse.
     * 
     * @return HPCCResourceRepositories
     */
    public HPCCResourceRepository[] getHPCCResourceRepositories() {
        return HPCCResourceRepositories;
    }


    /**
     * Sets the HPCCResourceRepositories value for this BrowseResourcesResponse.
     * 
     * @param HPCCResourceRepositories
     */
    public void setHPCCResourceRepositories(HPCCResourceRepository[] HPCCResourceRepositories) {
        this.HPCCResourceRepositories = HPCCResourceRepositories;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrowseResourcesResponse)) return false;
        BrowseResourcesResponse other = (BrowseResourcesResponse) obj;
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
            ((this.portalURL==null && other.getPortalURL()==null) || 
             (this.portalURL!=null &&
              this.portalURL.equals(other.getPortalURL()))) &&
            ((this.netAddress==null && other.getNetAddress()==null) || 
             (this.netAddress!=null &&
              this.netAddress.equals(other.getNetAddress()))) &&
            ((this.OS==null && other.getOS()==null) || 
             (this.OS!=null &&
              this.OS.equals(other.getOS()))) &&
            ((this.useResource==null && other.getUseResource()==null) || 
             (this.useResource!=null &&
              this.useResource.equals(other.getUseResource()))) &&
            ((this.HPCCResourceRepositories==null && other.getHPCCResourceRepositories()==null) || 
             (this.HPCCResourceRepositories!=null &&
              java.util.Arrays.equals(this.HPCCResourceRepositories, other.getHPCCResourceRepositories())));
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
        if (getPortalURL() != null) {
            _hashCode += getPortalURL().hashCode();
        }
        if (getNetAddress() != null) {
            _hashCode += getNetAddress().hashCode();
        }
        if (getOS() != null) {
            _hashCode += getOS().hashCode();
        }
        if (getUseResource() != null) {
            _hashCode += getUseResource().hashCode();
        }
        if (getHPCCResourceRepositories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHPCCResourceRepositories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHPCCResourceRepositories(), i);
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
        new org.apache.axis.description.TypeDesc(BrowseResourcesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">BrowseResourcesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "PortalURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "NetAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "OS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "UseResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HPCCResourceRepositories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResourceRepositories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResourceRepository"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResourceRepository"));
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
