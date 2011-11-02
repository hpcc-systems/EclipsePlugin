/**
 * TpLdapServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpLdapServer  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String build;

    private java.lang.String path;

    private org.hpccsystems.ws.wstopology.TpMachine[] tpMachines;

    public TpLdapServer() {
    }

    public TpLdapServer(
           java.lang.String name,
           java.lang.String description,
           java.lang.String build,
           java.lang.String path,
           org.hpccsystems.ws.wstopology.TpMachine[] tpMachines) {
           this.name = name;
           this.description = description;
           this.build = build;
           this.path = path;
           this.tpMachines = tpMachines;
    }


    /**
     * Gets the name value for this TpLdapServer.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TpLdapServer.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TpLdapServer.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TpLdapServer.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the build value for this TpLdapServer.
     * 
     * @return build
     */
    public java.lang.String getBuild() {
        return build;
    }


    /**
     * Sets the build value for this TpLdapServer.
     * 
     * @param build
     */
    public void setBuild(java.lang.String build) {
        this.build = build;
    }


    /**
     * Gets the path value for this TpLdapServer.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TpLdapServer.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the tpMachines value for this TpLdapServer.
     * 
     * @return tpMachines
     */
    public org.hpccsystems.ws.wstopology.TpMachine[] getTpMachines() {
        return tpMachines;
    }


    /**
     * Sets the tpMachines value for this TpLdapServer.
     * 
     * @param tpMachines
     */
    public void setTpMachines(org.hpccsystems.ws.wstopology.TpMachine[] tpMachines) {
        this.tpMachines = tpMachines;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpLdapServer)) return false;
        TpLdapServer other = (TpLdapServer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.build==null && other.getBuild()==null) || 
             (this.build!=null &&
              this.build.equals(other.getBuild()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.tpMachines==null && other.getTpMachines()==null) || 
             (this.tpMachines!=null &&
              java.util.Arrays.equals(this.tpMachines, other.getTpMachines())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBuild() != null) {
            _hashCode += getBuild().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getTpMachines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTpMachines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTpMachines(), i);
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
        new org.apache.axis.description.TypeDesc(TpLdapServer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLdapServer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("build");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpMachines");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachines"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachine"));
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
