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
 * FileListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class FileListRequest  implements java.io.Serializable {
	private java.lang.String netaddr;

	private java.lang.String path;

	private java.lang.String mask;

	private java.lang.String OS;

	private java.lang.Boolean directoryOnly;

	public FileListRequest() {
	}

	public FileListRequest(
			java.lang.String netaddr,
			java.lang.String path,
			java.lang.String mask,
			java.lang.String OS,
			java.lang.Boolean directoryOnly) {
		this.netaddr = netaddr;
		this.path = path;
		this.mask = mask;
		this.OS = OS;
		this.directoryOnly = directoryOnly;
	}


	/**
	 * Gets the netaddr value for this FileListRequest.
	 * 
	 * @return netaddr
	 */
	 public java.lang.String getNetaddr() {
		 return netaddr;
	 }


	 /**
	  * Sets the netaddr value for this FileListRequest.
	  * 
	  * @param netaddr
	  */
	 public void setNetaddr(java.lang.String netaddr) {
		 this.netaddr = netaddr;
	 }


	 /**
	  * Gets the path value for this FileListRequest.
	  * 
	  * @return path
	  */
	 public java.lang.String getPath() {
		 return path;
	 }


	 /**
	  * Sets the path value for this FileListRequest.
	  * 
	  * @param path
	  */
	 public void setPath(java.lang.String path) {
		 this.path = path;
	 }


	 /**
	  * Gets the mask value for this FileListRequest.
	  * 
	  * @return mask
	  */
	 public java.lang.String getMask() {
		 return mask;
	 }


	 /**
	  * Sets the mask value for this FileListRequest.
	  * 
	  * @param mask
	  */
	 public void setMask(java.lang.String mask) {
		 this.mask = mask;
	 }


	 /**
	  * Gets the OS value for this FileListRequest.
	  * 
	  * @return OS
	  */
	 public java.lang.String getOS() {
		 return OS;
	 }


	 /**
	  * Sets the OS value for this FileListRequest.
	  * 
	  * @param OS
	  */
	 public void setOS(java.lang.String OS) {
		 this.OS = OS;
	 }


	 /**
	  * Gets the directoryOnly value for this FileListRequest.
	  * 
	  * @return directoryOnly
	  */
	 public java.lang.Boolean getDirectoryOnly() {
		 return directoryOnly;
	 }


	 /**
	  * Sets the directoryOnly value for this FileListRequest.
	  * 
	  * @param directoryOnly
	  */
	 public void setDirectoryOnly(java.lang.Boolean directoryOnly) {
		 this.directoryOnly = directoryOnly;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof FileListRequest)) {
			return false;
		}
		 FileListRequest other = (FileListRequest) obj;
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
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(FileListRequest.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">FileListRequest"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
