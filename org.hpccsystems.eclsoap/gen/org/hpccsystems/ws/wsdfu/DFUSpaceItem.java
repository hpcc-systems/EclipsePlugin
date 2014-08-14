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
 * DFUSpaceItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUSpaceItem  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String numOfFiles;

	private java.lang.String numOfFilesUnknown;

	private java.lang.String totalSize;

	private java.lang.String largestFile;

	private java.lang.String largestSize;

	private java.lang.String smallestFile;

	private java.lang.String smallestSize;

	public DFUSpaceItem() {
	}

	public DFUSpaceItem(
			java.lang.String name,
			java.lang.String numOfFiles,
			java.lang.String numOfFilesUnknown,
			java.lang.String totalSize,
			java.lang.String largestFile,
			java.lang.String largestSize,
			java.lang.String smallestFile,
			java.lang.String smallestSize) {
		this.name = name;
		this.numOfFiles = numOfFiles;
		this.numOfFilesUnknown = numOfFilesUnknown;
		this.totalSize = totalSize;
		this.largestFile = largestFile;
		this.largestSize = largestSize;
		this.smallestFile = smallestFile;
		this.smallestSize = smallestSize;
	}


	/**
	 * Gets the name value for this DFUSpaceItem.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	/**
	 * Sets the name value for this DFUSpaceItem.
	 * 
	 * @param name
	 */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the numOfFiles value for this DFUSpaceItem.
	  * 
	  * @return numOfFiles
	  */
	 public java.lang.String getNumOfFiles() {
		 return numOfFiles;
	 }


	 /**
	  * Sets the numOfFiles value for this DFUSpaceItem.
	  * 
	  * @param numOfFiles
	  */
	 public void setNumOfFiles(java.lang.String numOfFiles) {
		 this.numOfFiles = numOfFiles;
	 }


	 /**
	  * Gets the numOfFilesUnknown value for this DFUSpaceItem.
	  * 
	  * @return numOfFilesUnknown
	  */
	 public java.lang.String getNumOfFilesUnknown() {
		 return numOfFilesUnknown;
	 }


	 /**
	  * Sets the numOfFilesUnknown value for this DFUSpaceItem.
	  * 
	  * @param numOfFilesUnknown
	  */
	 public void setNumOfFilesUnknown(java.lang.String numOfFilesUnknown) {
		 this.numOfFilesUnknown = numOfFilesUnknown;
	 }


	 /**
	  * Gets the totalSize value for this DFUSpaceItem.
	  * 
	  * @return totalSize
	  */
	 public java.lang.String getTotalSize() {
		 return totalSize;
	 }


	 /**
	  * Sets the totalSize value for this DFUSpaceItem.
	  * 
	  * @param totalSize
	  */
	 public void setTotalSize(java.lang.String totalSize) {
		 this.totalSize = totalSize;
	 }


	 /**
	  * Gets the largestFile value for this DFUSpaceItem.
	  * 
	  * @return largestFile
	  */
	 public java.lang.String getLargestFile() {
		 return largestFile;
	 }


	 /**
	  * Sets the largestFile value for this DFUSpaceItem.
	  * 
	  * @param largestFile
	  */
	 public void setLargestFile(java.lang.String largestFile) {
		 this.largestFile = largestFile;
	 }


	 /**
	  * Gets the largestSize value for this DFUSpaceItem.
	  * 
	  * @return largestSize
	  */
	 public java.lang.String getLargestSize() {
		 return largestSize;
	 }


	 /**
	  * Sets the largestSize value for this DFUSpaceItem.
	  * 
	  * @param largestSize
	  */
	 public void setLargestSize(java.lang.String largestSize) {
		 this.largestSize = largestSize;
	 }


	 /**
	  * Gets the smallestFile value for this DFUSpaceItem.
	  * 
	  * @return smallestFile
	  */
	 public java.lang.String getSmallestFile() {
		 return smallestFile;
	 }


	 /**
	  * Sets the smallestFile value for this DFUSpaceItem.
	  * 
	  * @param smallestFile
	  */
	 public void setSmallestFile(java.lang.String smallestFile) {
		 this.smallestFile = smallestFile;
	 }


	 /**
	  * Gets the smallestSize value for this DFUSpaceItem.
	  * 
	  * @return smallestSize
	  */
	 public java.lang.String getSmallestSize() {
		 return smallestSize;
	 }


	 /**
	  * Sets the smallestSize value for this DFUSpaceItem.
	  * 
	  * @param smallestSize
	  */
	 public void setSmallestSize(java.lang.String smallestSize) {
		 this.smallestSize = smallestSize;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DFUSpaceItem)) {
			return false;
		}
		 DFUSpaceItem other = (DFUSpaceItem) obj;
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
						 ((this.numOfFiles==null && other.getNumOfFiles()==null) || 
								 (this.numOfFiles!=null &&
								 this.numOfFiles.equals(other.getNumOfFiles()))) &&
								 ((this.numOfFilesUnknown==null && other.getNumOfFilesUnknown()==null) || 
										 (this.numOfFilesUnknown!=null &&
										 this.numOfFilesUnknown.equals(other.getNumOfFilesUnknown()))) &&
										 ((this.totalSize==null && other.getTotalSize()==null) || 
												 (this.totalSize!=null &&
												 this.totalSize.equals(other.getTotalSize()))) &&
												 ((this.largestFile==null && other.getLargestFile()==null) || 
														 (this.largestFile!=null &&
														 this.largestFile.equals(other.getLargestFile()))) &&
														 ((this.largestSize==null && other.getLargestSize()==null) || 
																 (this.largestSize!=null &&
																 this.largestSize.equals(other.getLargestSize()))) &&
																 ((this.smallestFile==null && other.getSmallestFile()==null) || 
																		 (this.smallestFile!=null &&
																		 this.smallestFile.equals(other.getSmallestFile()))) &&
																		 ((this.smallestSize==null && other.getSmallestSize()==null) || 
																				 (this.smallestSize!=null &&
																				 this.smallestSize.equals(other.getSmallestSize())));
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
		 if (getNumOfFiles() != null) {
			 _hashCode += getNumOfFiles().hashCode();
		 }
		 if (getNumOfFilesUnknown() != null) {
			 _hashCode += getNumOfFilesUnknown().hashCode();
		 }
		 if (getTotalSize() != null) {
			 _hashCode += getTotalSize().hashCode();
		 }
		 if (getLargestFile() != null) {
			 _hashCode += getLargestFile().hashCode();
		 }
		 if (getLargestSize() != null) {
			 _hashCode += getLargestSize().hashCode();
		 }
		 if (getSmallestFile() != null) {
			 _hashCode += getSmallestFile().hashCode();
		 }
		 if (getSmallestSize() != null) {
			 _hashCode += getSmallestSize().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(DFUSpaceItem.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSpaceItem"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("numOfFiles");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NumOfFiles"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("numOfFilesUnknown");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NumOfFilesUnknown"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("totalSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "TotalSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("largestFile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LargestFile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("largestSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LargestSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("smallestFile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SmallestFile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("smallestSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SmallestSize"));
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
