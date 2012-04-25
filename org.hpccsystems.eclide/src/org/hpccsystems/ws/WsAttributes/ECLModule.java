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
 * ECLModule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class ECLModule  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.Integer flags;

	private java.lang.Integer access;

	private java.lang.Long timestamp;

	private java.lang.Boolean isPlugin;

	private java.lang.Integer rank;

	private java.lang.String fileName;

	private java.lang.String fileCRC;

	private java.lang.String version;

	private java.lang.String checksum;

	public ECLModule() {
	}

	public ECLModule(
			java.lang.String name,
			java.lang.Integer flags,
			java.lang.Integer access,
			java.lang.Long timestamp,
			java.lang.Boolean isPlugin,
			java.lang.Integer rank,
			java.lang.String fileName,
			java.lang.String fileCRC,
			java.lang.String version,
			java.lang.String checksum) {
		this.name = name;
		this.flags = flags;
		this.access = access;
		this.timestamp = timestamp;
		this.isPlugin = isPlugin;
		this.rank = rank;
		this.fileName = fileName;
		this.fileCRC = fileCRC;
		this.version = version;
		this.checksum = checksum;
	}


	/**
	 * Gets the name value for this ECLModule.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	/**
	 * Sets the name value for this ECLModule.
	 * 
	 * @param name
	 */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the flags value for this ECLModule.
	  * 
	  * @return flags
	  */
	 public java.lang.Integer getFlags() {
		 return flags;
	 }


	 /**
	  * Sets the flags value for this ECLModule.
	  * 
	  * @param flags
	  */
	 public void setFlags(java.lang.Integer flags) {
		 this.flags = flags;
	 }


	 /**
	  * Gets the access value for this ECLModule.
	  * 
	  * @return access
	  */
	 public java.lang.Integer getAccess() {
		 return access;
	 }


	 /**
	  * Sets the access value for this ECLModule.
	  * 
	  * @param access
	  */
	 public void setAccess(java.lang.Integer access) {
		 this.access = access;
	 }


	 /**
	  * Gets the timestamp value for this ECLModule.
	  * 
	  * @return timestamp
	  */
	 public java.lang.Long getTimestamp() {
		 return timestamp;
	 }


	 /**
	  * Sets the timestamp value for this ECLModule.
	  * 
	  * @param timestamp
	  */
	 public void setTimestamp(java.lang.Long timestamp) {
		 this.timestamp = timestamp;
	 }


	 /**
	  * Gets the isPlugin value for this ECLModule.
	  * 
	  * @return isPlugin
	  */
	 public java.lang.Boolean getIsPlugin() {
		 return isPlugin;
	 }


	 /**
	  * Sets the isPlugin value for this ECLModule.
	  * 
	  * @param isPlugin
	  */
	 public void setIsPlugin(java.lang.Boolean isPlugin) {
		 this.isPlugin = isPlugin;
	 }


	 /**
	  * Gets the rank value for this ECLModule.
	  * 
	  * @return rank
	  */
	 public java.lang.Integer getRank() {
		 return rank;
	 }


	 /**
	  * Sets the rank value for this ECLModule.
	  * 
	  * @param rank
	  */
	 public void setRank(java.lang.Integer rank) {
		 this.rank = rank;
	 }


	 /**
	  * Gets the fileName value for this ECLModule.
	  * 
	  * @return fileName
	  */
	 public java.lang.String getFileName() {
		 return fileName;
	 }


	 /**
	  * Sets the fileName value for this ECLModule.
	  * 
	  * @param fileName
	  */
	 public void setFileName(java.lang.String fileName) {
		 this.fileName = fileName;
	 }


	 /**
	  * Gets the fileCRC value for this ECLModule.
	  * 
	  * @return fileCRC
	  */
	 public java.lang.String getFileCRC() {
		 return fileCRC;
	 }


	 /**
	  * Sets the fileCRC value for this ECLModule.
	  * 
	  * @param fileCRC
	  */
	 public void setFileCRC(java.lang.String fileCRC) {
		 this.fileCRC = fileCRC;
	 }


	 /**
	  * Gets the version value for this ECLModule.
	  * 
	  * @return version
	  */
	 public java.lang.String getVersion() {
		 return version;
	 }


	 /**
	  * Sets the version value for this ECLModule.
	  * 
	  * @param version
	  */
	 public void setVersion(java.lang.String version) {
		 this.version = version;
	 }


	 /**
	  * Gets the checksum value for this ECLModule.
	  * 
	  * @return checksum
	  */
	 public java.lang.String getChecksum() {
		 return checksum;
	 }


	 /**
	  * Sets the checksum value for this ECLModule.
	  * 
	  * @param checksum
	  */
	 public void setChecksum(java.lang.String checksum) {
		 this.checksum = checksum;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof ECLModule)) {
			return false;
		}
		 ECLModule other = (ECLModule) obj;
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
				 ((this.name==null && other.getName()==null) || 
						 (this.name!=null &&
						 this.name.equals(other.getName()))) &&
						 ((this.flags==null && other.getFlags()==null) || 
								 (this.flags!=null &&
								 this.flags.equals(other.getFlags()))) &&
								 ((this.access==null && other.getAccess()==null) || 
										 (this.access!=null &&
										 this.access.equals(other.getAccess()))) &&
										 ((this.timestamp==null && other.getTimestamp()==null) || 
												 (this.timestamp!=null &&
												 this.timestamp.equals(other.getTimestamp()))) &&
												 ((this.isPlugin==null && other.getIsPlugin()==null) || 
														 (this.isPlugin!=null &&
														 this.isPlugin.equals(other.getIsPlugin()))) &&
														 ((this.rank==null && other.getRank()==null) || 
																 (this.rank!=null &&
																 this.rank.equals(other.getRank()))) &&
																 ((this.fileName==null && other.getFileName()==null) || 
																		 (this.fileName!=null &&
																		 this.fileName.equals(other.getFileName()))) &&
																		 ((this.fileCRC==null && other.getFileCRC()==null) || 
																				 (this.fileCRC!=null &&
																				 this.fileCRC.equals(other.getFileCRC()))) &&
																				 ((this.version==null && other.getVersion()==null) || 
																						 (this.version!=null &&
																						 this.version.equals(other.getVersion()))) &&
																						 ((this.checksum==null && other.getChecksum()==null) || 
																								 (this.checksum!=null &&
																								 this.checksum.equals(other.getChecksum())));
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
		 if (getName() != null) {
			 _hashCode += getName().hashCode();
		 }
		 if (getFlags() != null) {
			 _hashCode += getFlags().hashCode();
		 }
		 if (getAccess() != null) {
			 _hashCode += getAccess().hashCode();
		 }
		 if (getTimestamp() != null) {
			 _hashCode += getTimestamp().hashCode();
		 }
		 if (getIsPlugin() != null) {
			 _hashCode += getIsPlugin().hashCode();
		 }
		 if (getRank() != null) {
			 _hashCode += getRank().hashCode();
		 }
		 if (getFileName() != null) {
			 _hashCode += getFileName().hashCode();
		 }
		 if (getFileCRC() != null) {
			 _hashCode += getFileCRC().hashCode();
		 }
		 if (getVersion() != null) {
			 _hashCode += getVersion().hashCode();
		 }
		 if (getChecksum() != null) {
			 _hashCode += getChecksum().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(ECLModule.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLModule"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("flags");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Flags"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("access");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Access"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("timestamp");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Timestamp"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isPlugin");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "IsPlugin"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("rank");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Rank"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("fileName");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "FileName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("fileCRC");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "FileCRC"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("version");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Version"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("checksum");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Checksum"));
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
