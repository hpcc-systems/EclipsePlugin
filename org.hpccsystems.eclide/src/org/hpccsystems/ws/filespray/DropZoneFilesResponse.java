/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
/**
 * DropZoneFilesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class DropZoneFilesResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.filespray.ArrayOfEspException exceptions;

    private java.lang.String netAddress;

    private java.lang.String path;

    private java.lang.Integer OS;

    private org.hpccsystems.ws.filespray.DropZone[] dropZones;

    private org.hpccsystems.ws.filespray.PhysicalFileStruct[] files;

    public DropZoneFilesResponse() {
    }

    public DropZoneFilesResponse(
           org.hpccsystems.ws.filespray.ArrayOfEspException exceptions,
           java.lang.String netAddress,
           java.lang.String path,
           java.lang.Integer OS,
           org.hpccsystems.ws.filespray.DropZone[] dropZones,
           org.hpccsystems.ws.filespray.PhysicalFileStruct[] files) {
           this.exceptions = exceptions;
           this.netAddress = netAddress;
           this.path = path;
           this.OS = OS;
           this.dropZones = dropZones;
           this.files = files;
    }


    /**
     * Gets the exceptions value for this DropZoneFilesResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.filespray.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DropZoneFilesResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.filespray.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the netAddress value for this DropZoneFilesResponse.
     * 
     * @return netAddress
     */
    public java.lang.String getNetAddress() {
        return netAddress;
    }


    /**
     * Sets the netAddress value for this DropZoneFilesResponse.
     * 
     * @param netAddress
     */
    public void setNetAddress(java.lang.String netAddress) {
        this.netAddress = netAddress;
    }


    /**
     * Gets the path value for this DropZoneFilesResponse.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this DropZoneFilesResponse.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the OS value for this DropZoneFilesResponse.
     * 
     * @return OS
     */
    public java.lang.Integer getOS() {
        return OS;
    }


    /**
     * Sets the OS value for this DropZoneFilesResponse.
     * 
     * @param OS
     */
    public void setOS(java.lang.Integer OS) {
        this.OS = OS;
    }


    /**
     * Gets the dropZones value for this DropZoneFilesResponse.
     * 
     * @return dropZones
     */
    public org.hpccsystems.ws.filespray.DropZone[] getDropZones() {
        return dropZones;
    }


    /**
     * Sets the dropZones value for this DropZoneFilesResponse.
     * 
     * @param dropZones
     */
    public void setDropZones(org.hpccsystems.ws.filespray.DropZone[] dropZones) {
        this.dropZones = dropZones;
    }


    /**
     * Gets the files value for this DropZoneFilesResponse.
     * 
     * @return files
     */
    public org.hpccsystems.ws.filespray.PhysicalFileStruct[] getFiles() {
        return files;
    }


    /**
     * Sets the files value for this DropZoneFilesResponse.
     * 
     * @param files
     */
    public void setFiles(org.hpccsystems.ws.filespray.PhysicalFileStruct[] files) {
        this.files = files;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DropZoneFilesResponse)) return false;
        DropZoneFilesResponse other = (DropZoneFilesResponse) obj;
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
            ((this.netAddress==null && other.getNetAddress()==null) || 
             (this.netAddress!=null &&
              this.netAddress.equals(other.getNetAddress()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.OS==null && other.getOS()==null) || 
             (this.OS!=null &&
              this.OS.equals(other.getOS()))) &&
            ((this.dropZones==null && other.getDropZones()==null) || 
             (this.dropZones!=null &&
              java.util.Arrays.equals(this.dropZones, other.getDropZones()))) &&
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
        if (getNetAddress() != null) {
            _hashCode += getNetAddress().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getOS() != null) {
            _hashCode += getOS().hashCode();
        }
        if (getDropZones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDropZones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDropZones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(DropZoneFilesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DropZoneFilesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "NetAddress"));
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
        elemField.setFieldName("OS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "OS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropZones");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DropZones"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DropZone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DropZone"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Files"));
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
