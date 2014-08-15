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
 * AddtoSuperfileRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class AddtoSuperfileRequest  implements java.io.Serializable {
	private java.lang.String superfile;

	private java.lang.String subfiles;

	private java.lang.String[] names;

	private java.lang.Boolean existingFile;

	private java.lang.String backToPage;

	public AddtoSuperfileRequest() {
	}

	public AddtoSuperfileRequest(
			java.lang.String superfile,
			java.lang.String subfiles,
			java.lang.String[] names,
			java.lang.Boolean existingFile,
			java.lang.String backToPage) {
		this.superfile = superfile;
		this.subfiles = subfiles;
		this.names = names;
		this.existingFile = existingFile;
		this.backToPage = backToPage;
	}


	/**
	 * Gets the superfile value for this AddtoSuperfileRequest.
	 * 
	 * @return superfile
	 */
	 public java.lang.String getSuperfile() {
		 return superfile;
	 }


	 /**
	  * Sets the superfile value for this AddtoSuperfileRequest.
	  * 
	  * @param superfile
	  */
	 public void setSuperfile(java.lang.String superfile) {
		 this.superfile = superfile;
	 }


	 /**
	  * Gets the subfiles value for this AddtoSuperfileRequest.
	  * 
	  * @return subfiles
	  */
	 public java.lang.String getSubfiles() {
		 return subfiles;
	 }


	 /**
	  * Sets the subfiles value for this AddtoSuperfileRequest.
	  * 
	  * @param subfiles
	  */
	 public void setSubfiles(java.lang.String subfiles) {
		 this.subfiles = subfiles;
	 }


	 /**
	  * Gets the names value for this AddtoSuperfileRequest.
	  * 
	  * @return names
	  */
	 public java.lang.String[] getNames() {
		 return names;
	 }


	 /**
	  * Sets the names value for this AddtoSuperfileRequest.
	  * 
	  * @param names
	  */
	 public void setNames(java.lang.String[] names) {
		 this.names = names;
	 }


	 /**
	  * Gets the existingFile value for this AddtoSuperfileRequest.
	  * 
	  * @return existingFile
	  */
	 public java.lang.Boolean getExistingFile() {
		 return existingFile;
	 }


	 /**
	  * Sets the existingFile value for this AddtoSuperfileRequest.
	  * 
	  * @param existingFile
	  */
	 public void setExistingFile(java.lang.Boolean existingFile) {
		 this.existingFile = existingFile;
	 }


	 /**
	  * Gets the backToPage value for this AddtoSuperfileRequest.
	  * 
	  * @return backToPage
	  */
	 public java.lang.String getBackToPage() {
		 return backToPage;
	 }


	 /**
	  * Sets the backToPage value for this AddtoSuperfileRequest.
	  * 
	  * @param backToPage
	  */
	 public void setBackToPage(java.lang.String backToPage) {
		 this.backToPage = backToPage;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof AddtoSuperfileRequest)) {
			return false;
		}
		 AddtoSuperfileRequest other = (AddtoSuperfileRequest) obj;
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
				 ((this.superfile==null && other.getSuperfile()==null) || 
						 (this.superfile!=null &&
						 this.superfile.equals(other.getSuperfile()))) &&
						 ((this.subfiles==null && other.getSubfiles()==null) || 
								 (this.subfiles!=null &&
								 this.subfiles.equals(other.getSubfiles()))) &&
								 ((this.names==null && other.getNames()==null) || 
										 (this.names!=null &&
										 java.util.Arrays.equals(this.names, other.getNames()))) &&
										 ((this.existingFile==null && other.getExistingFile()==null) || 
												 (this.existingFile!=null &&
												 this.existingFile.equals(other.getExistingFile()))) &&
												 ((this.backToPage==null && other.getBackToPage()==null) || 
														 (this.backToPage!=null &&
														 this.backToPage.equals(other.getBackToPage())));
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
		 if (getSuperfile() != null) {
			 _hashCode += getSuperfile().hashCode();
		 }
		 if (getSubfiles() != null) {
			 _hashCode += getSubfiles().hashCode();
		 }
		 if (getNames() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getNames());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getNames(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getExistingFile() != null) {
			 _hashCode += getExistingFile().hashCode();
		 }
		 if (getBackToPage() != null) {
			 _hashCode += getBackToPage().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(AddtoSuperfileRequest.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddtoSuperfileRequest"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("superfile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Superfile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("subfiles");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Subfiles"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("names");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "names"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Item"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("existingFile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ExistingFile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("backToPage");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "BackToPage"));
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
