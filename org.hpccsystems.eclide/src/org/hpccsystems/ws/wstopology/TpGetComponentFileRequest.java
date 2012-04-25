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
 * TpGetComponentFileRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpGetComponentFileRequest  implements java.io.Serializable {
	private java.lang.String compType;

	private java.lang.String compName;

	private java.lang.String netAddress;

	private java.lang.String directory;

	private java.lang.String fileType;

	private java.lang.Integer osType;

	private java.lang.String plainText;

	public TpGetComponentFileRequest() {
	}

	public TpGetComponentFileRequest(
			java.lang.String compType,
			java.lang.String compName,
			java.lang.String netAddress,
			java.lang.String directory,
			java.lang.String fileType,
			java.lang.Integer osType,
			java.lang.String plainText) {
		this.compType = compType;
		this.compName = compName;
		this.netAddress = netAddress;
		this.directory = directory;
		this.fileType = fileType;
		this.osType = osType;
		this.plainText = plainText;
	}


	/**
	 * Gets the compType value for this TpGetComponentFileRequest.
	 * 
	 * @return compType
	 */
	 public java.lang.String getCompType() {
		 return compType;
	 }


	 /**
	  * Sets the compType value for this TpGetComponentFileRequest.
	  * 
	  * @param compType
	  */
	 public void setCompType(java.lang.String compType) {
		 this.compType = compType;
	 }


	 /**
	  * Gets the compName value for this TpGetComponentFileRequest.
	  * 
	  * @return compName
	  */
	 public java.lang.String getCompName() {
		 return compName;
	 }


	 /**
	  * Sets the compName value for this TpGetComponentFileRequest.
	  * 
	  * @param compName
	  */
	 public void setCompName(java.lang.String compName) {
		 this.compName = compName;
	 }


	 /**
	  * Gets the netAddress value for this TpGetComponentFileRequest.
	  * 
	  * @return netAddress
	  */
	 public java.lang.String getNetAddress() {
		 return netAddress;
	 }


	 /**
	  * Sets the netAddress value for this TpGetComponentFileRequest.
	  * 
	  * @param netAddress
	  */
	 public void setNetAddress(java.lang.String netAddress) {
		 this.netAddress = netAddress;
	 }


	 /**
	  * Gets the directory value for this TpGetComponentFileRequest.
	  * 
	  * @return directory
	  */
	 public java.lang.String getDirectory() {
		 return directory;
	 }


	 /**
	  * Sets the directory value for this TpGetComponentFileRequest.
	  * 
	  * @param directory
	  */
	 public void setDirectory(java.lang.String directory) {
		 this.directory = directory;
	 }


	 /**
	  * Gets the fileType value for this TpGetComponentFileRequest.
	  * 
	  * @return fileType
	  */
	 public java.lang.String getFileType() {
		 return fileType;
	 }


	 /**
	  * Sets the fileType value for this TpGetComponentFileRequest.
	  * 
	  * @param fileType
	  */
	 public void setFileType(java.lang.String fileType) {
		 this.fileType = fileType;
	 }


	 /**
	  * Gets the osType value for this TpGetComponentFileRequest.
	  * 
	  * @return osType
	  */
	 public java.lang.Integer getOsType() {
		 return osType;
	 }


	 /**
	  * Sets the osType value for this TpGetComponentFileRequest.
	  * 
	  * @param osType
	  */
	 public void setOsType(java.lang.Integer osType) {
		 this.osType = osType;
	 }


	 /**
	  * Gets the plainText value for this TpGetComponentFileRequest.
	  * 
	  * @return plainText
	  */
	 public java.lang.String getPlainText() {
		 return plainText;
	 }


	 /**
	  * Sets the plainText value for this TpGetComponentFileRequest.
	  * 
	  * @param plainText
	  */
	 public void setPlainText(java.lang.String plainText) {
		 this.plainText = plainText;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof TpGetComponentFileRequest)) {
			return false;
		}
		 TpGetComponentFileRequest other = (TpGetComponentFileRequest) obj;
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
				 ((this.compType==null && other.getCompType()==null) || 
						 (this.compType!=null &&
						 this.compType.equals(other.getCompType()))) &&
						 ((this.compName==null && other.getCompName()==null) || 
								 (this.compName!=null &&
								 this.compName.equals(other.getCompName()))) &&
								 ((this.netAddress==null && other.getNetAddress()==null) || 
										 (this.netAddress!=null &&
										 this.netAddress.equals(other.getNetAddress()))) &&
										 ((this.directory==null && other.getDirectory()==null) || 
												 (this.directory!=null &&
												 this.directory.equals(other.getDirectory()))) &&
												 ((this.fileType==null && other.getFileType()==null) || 
														 (this.fileType!=null &&
														 this.fileType.equals(other.getFileType()))) &&
														 ((this.osType==null && other.getOsType()==null) || 
																 (this.osType!=null &&
																 this.osType.equals(other.getOsType()))) &&
																 ((this.plainText==null && other.getPlainText()==null) || 
																		 (this.plainText!=null &&
																		 this.plainText.equals(other.getPlainText())));
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
		 if (getCompType() != null) {
			 _hashCode += getCompType().hashCode();
		 }
		 if (getCompName() != null) {
			 _hashCode += getCompName().hashCode();
		 }
		 if (getNetAddress() != null) {
			 _hashCode += getNetAddress().hashCode();
		 }
		 if (getDirectory() != null) {
			 _hashCode += getDirectory().hashCode();
		 }
		 if (getFileType() != null) {
			 _hashCode += getFileType().hashCode();
		 }
		 if (getOsType() != null) {
			 _hashCode += getOsType().hashCode();
		 }
		 if (getPlainText() != null) {
			 _hashCode += getPlainText().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(TpGetComponentFileRequest.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpGetComponentFileRequest"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("compType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "CompType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("compName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "CompName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("netAddress");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "NetAddress"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("directory");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Directory"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("fileType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "FileType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("osType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "OsType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("plainText");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "PlainText"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
