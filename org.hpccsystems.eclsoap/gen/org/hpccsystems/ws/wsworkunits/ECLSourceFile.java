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
 * ECLSourceFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class ECLSourceFile  implements java.io.Serializable {
	private java.lang.String fileCluster;

	private java.lang.String name;

	private java.lang.Boolean isSuperFile;

	private java.lang.Integer subs;

	private java.lang.Integer count;

	private org.hpccsystems.ws.wsworkunits.ECLSourceFile[] ECLSourceFiles;

	public ECLSourceFile() {
	}

	public ECLSourceFile(
			java.lang.String fileCluster,
			java.lang.String name,
			java.lang.Boolean isSuperFile,
			java.lang.Integer subs,
			java.lang.Integer count,
			org.hpccsystems.ws.wsworkunits.ECLSourceFile[] ECLSourceFiles) {
		this.fileCluster = fileCluster;
		this.name = name;
		this.isSuperFile = isSuperFile;
		this.subs = subs;
		this.count = count;
		this.ECLSourceFiles = ECLSourceFiles;
	}


	/**
	 * Gets the fileCluster value for this ECLSourceFile.
	 * 
	 * @return fileCluster
	 */
	 public java.lang.String getFileCluster() {
		 return fileCluster;
	 }


	 /**
	  * Sets the fileCluster value for this ECLSourceFile.
	  * 
	  * @param fileCluster
	  */
	 public void setFileCluster(java.lang.String fileCluster) {
		 this.fileCluster = fileCluster;
	 }


	 /**
	  * Gets the name value for this ECLSourceFile.
	  * 
	  * @return name
	  */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this ECLSourceFile.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the isSuperFile value for this ECLSourceFile.
	  * 
	  * @return isSuperFile
	  */
	 public java.lang.Boolean getIsSuperFile() {
		 return isSuperFile;
	 }


	 /**
	  * Sets the isSuperFile value for this ECLSourceFile.
	  * 
	  * @param isSuperFile
	  */
	 public void setIsSuperFile(java.lang.Boolean isSuperFile) {
		 this.isSuperFile = isSuperFile;
	 }


	 /**
	  * Gets the subs value for this ECLSourceFile.
	  * 
	  * @return subs
	  */
	 public java.lang.Integer getSubs() {
		 return subs;
	 }


	 /**
	  * Sets the subs value for this ECLSourceFile.
	  * 
	  * @param subs
	  */
	 public void setSubs(java.lang.Integer subs) {
		 this.subs = subs;
	 }


	 /**
	  * Gets the count value for this ECLSourceFile.
	  * 
	  * @return count
	  */
	 public java.lang.Integer getCount() {
		 return count;
	 }


	 /**
	  * Sets the count value for this ECLSourceFile.
	  * 
	  * @param count
	  */
	 public void setCount(java.lang.Integer count) {
		 this.count = count;
	 }


	 /**
	  * Gets the ECLSourceFiles value for this ECLSourceFile.
	  * 
	  * @return ECLSourceFiles
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLSourceFile[] getECLSourceFiles() {
		 return ECLSourceFiles;
	 }


	 /**
	  * Sets the ECLSourceFiles value for this ECLSourceFile.
	  * 
	  * @param ECLSourceFiles
	  */
	 public void setECLSourceFiles(org.hpccsystems.ws.wsworkunits.ECLSourceFile[] ECLSourceFiles) {
		 this.ECLSourceFiles = ECLSourceFiles;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof ECLSourceFile)) {
			return false;
		}
		 ECLSourceFile other = (ECLSourceFile) obj;
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
				 ((this.fileCluster==null && other.getFileCluster()==null) || 
						 (this.fileCluster!=null &&
						 this.fileCluster.equals(other.getFileCluster()))) &&
						 ((this.name==null && other.getName()==null) || 
								 (this.name!=null &&
								 this.name.equals(other.getName()))) &&
								 ((this.isSuperFile==null && other.getIsSuperFile()==null) || 
										 (this.isSuperFile!=null &&
										 this.isSuperFile.equals(other.getIsSuperFile()))) &&
										 ((this.subs==null && other.getSubs()==null) || 
												 (this.subs!=null &&
												 this.subs.equals(other.getSubs()))) &&
												 ((this.count==null && other.getCount()==null) || 
														 (this.count!=null &&
														 this.count.equals(other.getCount()))) &&
														 ((this.ECLSourceFiles==null && other.getECLSourceFiles()==null) || 
																 (this.ECLSourceFiles!=null &&
																 java.util.Arrays.equals(this.ECLSourceFiles, other.getECLSourceFiles())));
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
		 if (getFileCluster() != null) {
			 _hashCode += getFileCluster().hashCode();
		 }
		 if (getName() != null) {
			 _hashCode += getName().hashCode();
		 }
		 if (getIsSuperFile() != null) {
			 _hashCode += getIsSuperFile().hashCode();
		 }
		 if (getSubs() != null) {
			 _hashCode += getSubs().hashCode();
		 }
		 if (getCount() != null) {
			 _hashCode += getCount().hashCode();
		 }
		 if (getECLSourceFiles() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getECLSourceFiles());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getECLSourceFiles(), i);
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
	 new org.apache.axis.description.TypeDesc(ECLSourceFile.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFile"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("fileCluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileCluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isSuperFile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsSuperFile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("subs");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Subs"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("count");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Count"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("ECLSourceFiles");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFiles"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFile"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFile"));
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
