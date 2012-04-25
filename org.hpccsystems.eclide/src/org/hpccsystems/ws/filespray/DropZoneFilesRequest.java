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
 * DropZoneFilesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class DropZoneFilesRequest  implements java.io.Serializable {
	private java.lang.String netAddress;

	private java.lang.String path;

	private java.lang.String OS;

	private java.lang.String subfolder;

	private java.lang.Boolean directoryOnly;

	public DropZoneFilesRequest() {
	}

	public DropZoneFilesRequest(
			java.lang.String netAddress,
			java.lang.String path,
			java.lang.String OS,
			java.lang.String subfolder,
			java.lang.Boolean directoryOnly) {
		this.netAddress = netAddress;
		this.path = path;
		this.OS = OS;
		this.subfolder = subfolder;
		this.directoryOnly = directoryOnly;
	}


	/**
	 * Gets the netAddress value for this DropZoneFilesRequest.
	 * 
	 * @return netAddress
	 */
	 public java.lang.String getNetAddress() {
		 return netAddress;
	 }


	 /**
	  * Sets the netAddress value for this DropZoneFilesRequest.
	  * 
	  * @param netAddress
	  */
	 public void setNetAddress(java.lang.String netAddress) {
		 this.netAddress = netAddress;
	 }


	 /**
	  * Gets the path value for this DropZoneFilesRequest.
	  * 
	  * @return path
	  */
	 public java.lang.String getPath() {
		 return path;
	 }


	 /**
	  * Sets the path value for this DropZoneFilesRequest.
	  * 
	  * @param path
	  */
	 public void setPath(java.lang.String path) {
		 this.path = path;
	 }


	 /**
	  * Gets the OS value for this DropZoneFilesRequest.
	  * 
	  * @return OS
	  */
	 public java.lang.String getOS() {
		 return OS;
	 }


	 /**
	  * Sets the OS value for this DropZoneFilesRequest.
	  * 
	  * @param OS
	  */
	 public void setOS(java.lang.String OS) {
		 this.OS = OS;
	 }


	 /**
	  * Gets the subfolder value for this DropZoneFilesRequest.
	  * 
	  * @return subfolder
	  */
	 public java.lang.String getSubfolder() {
		 return subfolder;
	 }


	 /**
	  * Sets the subfolder value for this DropZoneFilesRequest.
	  * 
	  * @param subfolder
	  */
	 public void setSubfolder(java.lang.String subfolder) {
		 this.subfolder = subfolder;
	 }


	 /**
	  * Gets the directoryOnly value for this DropZoneFilesRequest.
	  * 
	  * @return directoryOnly
	  */
	 public java.lang.Boolean getDirectoryOnly() {
		 return directoryOnly;
	 }


	 /**
	  * Sets the directoryOnly value for this DropZoneFilesRequest.
	  * 
	  * @param directoryOnly
	  */
	 public void setDirectoryOnly(java.lang.Boolean directoryOnly) {
		 this.directoryOnly = directoryOnly;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DropZoneFilesRequest)) {
			return false;
		}
		 DropZoneFilesRequest other = (DropZoneFilesRequest) obj;
		 if (obj == null) {
			return false;
		}
		 if (this == obj) {
			return true;
		}
		 if (__equalsCalc != null) {
			 return (__equalsCalc == obj);
		 }
		 __equalsCalc = obj;
		 boolean _equals;
		 _equals = true && 
				 ((this.netAddress==null && other.getNetAddress()==null) || 
						 (this.netAddress!=null &&
						 this.netAddress.equals(other.getNetAddress()))) &&
						 ((this.path==null && other.getPath()==null) || 
								 (this.path!=null &&
								 this.path.equals(other.getPath()))) &&
								 ((this.OS==null && other.getOS()==null) || 
										 (this.OS!=null &&
										 this.OS.equals(other.getOS()))) &&
										 ((this.subfolder==null && other.getSubfolder()==null) || 
												 (this.subfolder!=null &&
												 this.subfolder.equals(other.getSubfolder()))) &&
												 ((this.directoryOnly==null && other.getDirectoryOnly()==null) || 
														 (this.directoryOnly!=null &&
														 this.directoryOnly.equals(other.getDirectoryOnly())));
		 __equalsCalc = null;
		 return _equals;
	 }

	 private boolean __hashCodeCalc = false;
	 @Override
	 public synchronized int hashCode() {
		 if (__hashCodeCalc) {
			 return 0;
		 }
		 __hashCodeCalc = true;
		 int _hashCode = 1;
		 if (getNetAddress() != null) {
			 _hashCode += getNetAddress().hashCode();
		 }
		 if (getPath() != null) {
			 _hashCode += getPath().hashCode();
		 }
		 if (getOS() != null) {
			 _hashCode += getOS().hashCode();
		 }
		 if (getSubfolder() != null) {
			 _hashCode += getSubfolder().hashCode();
		 }
		 if (getDirectoryOnly() != null) {
			 _hashCode += getDirectoryOnly().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(DropZoneFilesRequest.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DropZoneFilesRequest"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("subfolder");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Subfolder"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
