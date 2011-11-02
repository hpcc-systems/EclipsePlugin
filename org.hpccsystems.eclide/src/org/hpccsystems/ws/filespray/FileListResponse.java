/**
 * FileListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class FileListResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.filespray.ArrayOfEspException exceptions;

    private java.lang.String netaddr;

    private java.lang.String path;

    private java.lang.String mask;

    private java.lang.Integer OS;

    private java.lang.Boolean directoryOnly;

    private org.hpccsystems.ws.filespray.PhysicalFileStruct[] files;

    public FileListResponse() {
    }

    public FileListResponse(
           org.hpccsystems.ws.filespray.ArrayOfEspException exceptions,
           java.lang.String netaddr,
           java.lang.String path,
           java.lang.String mask,
           java.lang.Integer OS,
           java.lang.Boolean directoryOnly,
           org.hpccsystems.ws.filespray.PhysicalFileStruct[] files) {
           this.exceptions = exceptions;
           this.netaddr = netaddr;
           this.path = path;
           this.mask = mask;
           this.OS = OS;
           this.directoryOnly = directoryOnly;
           this.files = files;
    }


    /**
     * Gets the exceptions value for this FileListResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.filespray.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this FileListResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.filespray.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the netaddr value for this FileListResponse.
     * 
     * @return netaddr
     */
    public java.lang.String getNetaddr() {
        return netaddr;
    }


    /**
     * Sets the netaddr value for this FileListResponse.
     * 
     * @param netaddr
     */
    public void setNetaddr(java.lang.String netaddr) {
        this.netaddr = netaddr;
    }


    /**
     * Gets the path value for this FileListResponse.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this FileListResponse.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the mask value for this FileListResponse.
     * 
     * @return mask
     */
    public java.lang.String getMask() {
        return mask;
    }


    /**
     * Sets the mask value for this FileListResponse.
     * 
     * @param mask
     */
    public void setMask(java.lang.String mask) {
        this.mask = mask;
    }


    /**
     * Gets the OS value for this FileListResponse.
     * 
     * @return OS
     */
    public java.lang.Integer getOS() {
        return OS;
    }


    /**
     * Sets the OS value for this FileListResponse.
     * 
     * @param OS
     */
    public void setOS(java.lang.Integer OS) {
        this.OS = OS;
    }


    /**
     * Gets the directoryOnly value for this FileListResponse.
     * 
     * @return directoryOnly
     */
    public java.lang.Boolean getDirectoryOnly() {
        return directoryOnly;
    }


    /**
     * Sets the directoryOnly value for this FileListResponse.
     * 
     * @param directoryOnly
     */
    public void setDirectoryOnly(java.lang.Boolean directoryOnly) {
        this.directoryOnly = directoryOnly;
    }


    /**
     * Gets the files value for this FileListResponse.
     * 
     * @return files
     */
    public org.hpccsystems.ws.filespray.PhysicalFileStruct[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this FileListResponse.
     * 
     * @param files
     */
    public void setFiles(org.hpccsystems.ws.filespray.PhysicalFileStruct[] files) {
        this.files = files;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileListResponse)) return false;
        FileListResponse other = (FileListResponse) obj;
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
            ((this.netaddr==null && other.getNetaddr()==null) || 
             (this.netaddr!=null &&
              this.netaddr.equals(other.getNetaddr()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.mask==null && other.getMask()==null) || 
             (this.mask!=null &&
              this.mask.equals(other.getMask()))) &&
            ((this.OS==null && other.getOS()==null) || 
             (this.OS!=null &&
              this.OS.equals(other.getOS()))) &&
            ((this.directoryOnly==null && other.getDirectoryOnly()==null) || 
             (this.directoryOnly!=null &&
              this.directoryOnly.equals(other.getDirectoryOnly()))) &&
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              java.util.Arrays.equals(this.files, other.getFiles())));
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
        if (getNetaddr() != null) {
            _hashCode += getNetaddr().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getMask() != null) {
            _hashCode += getMask().hashCode();
        }
        if (getOS() != null) {
            _hashCode += getOS().hashCode();
        }
        if (getDirectoryOnly() != null) {
            _hashCode += getDirectoryOnly().hashCode();
        }
        if (getFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFiles(), i);
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
        new org.apache.axis.description.TypeDesc(FileListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">FileListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netaddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Netaddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Mask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "OS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directoryOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DirectoryOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "files"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PhysicalFileStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PhysicalFileStruct"));
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
