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
 * ECLResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class ECLResult  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.Integer sequence;

	private java.lang.String value;

	private java.lang.String link;

	private java.lang.String fileName;

	private java.lang.Boolean isSupplied;

	private java.lang.Boolean showFileContent;

	private java.lang.Long total;

	private org.hpccsystems.ws.wsworkunits.ECLSchemaItem[] ECLSchemas;

	public ECLResult() {
	}

	public ECLResult(
			java.lang.String name,
			java.lang.Integer sequence,
			java.lang.String value,
			java.lang.String link,
			java.lang.String fileName,
			java.lang.Boolean isSupplied,
			java.lang.Boolean showFileContent,
			java.lang.Long total,
			org.hpccsystems.ws.wsworkunits.ECLSchemaItem[] ECLSchemas) {
		this.name = name;
		this.sequence = sequence;
		this.value = value;
		this.link = link;
		this.fileName = fileName;
		this.isSupplied = isSupplied;
		this.showFileContent = showFileContent;
		this.total = total;
		this.ECLSchemas = ECLSchemas;
	}


	/**
	 * Gets the name value for this ECLResult.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	/**
	 * Sets the name value for this ECLResult.
	 * 
	 * @param name
	 */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the sequence value for this ECLResult.
	  * 
	  * @return sequence
	  */
	 public java.lang.Integer getSequence() {
		 return sequence;
	 }


	 /**
	  * Sets the sequence value for this ECLResult.
	  * 
	  * @param sequence
	  */
	 public void setSequence(java.lang.Integer sequence) {
		 this.sequence = sequence;
	 }


	 /**
	  * Gets the value value for this ECLResult.
	  * 
	  * @return value
	  */
	 public java.lang.String getValue() {
		 return value;
	 }


	 /**
	  * Sets the value value for this ECLResult.
	  * 
	  * @param value
	  */
	 public void setValue(java.lang.String value) {
		 this.value = value;
	 }


	 /**
	  * Gets the link value for this ECLResult.
	  * 
	  * @return link
	  */
	 public java.lang.String getLink() {
		 return link;
	 }


	 /**
	  * Sets the link value for this ECLResult.
	  * 
	  * @param link
	  */
	 public void setLink(java.lang.String link) {
		 this.link = link;
	 }


	 /**
	  * Gets the fileName value for this ECLResult.
	  * 
	  * @return fileName
	  */
	 public java.lang.String getFileName() {
		 return fileName;
	 }


	 /**
	  * Sets the fileName value for this ECLResult.
	  * 
	  * @param fileName
	  */
	 public void setFileName(java.lang.String fileName) {
		 this.fileName = fileName;
	 }


	 /**
	  * Gets the isSupplied value for this ECLResult.
	  * 
	  * @return isSupplied
	  */
	 public java.lang.Boolean getIsSupplied() {
		 return isSupplied;
	 }


	 /**
	  * Sets the isSupplied value for this ECLResult.
	  * 
	  * @param isSupplied
	  */
	 public void setIsSupplied(java.lang.Boolean isSupplied) {
		 this.isSupplied = isSupplied;
	 }


	 /**
	  * Gets the showFileContent value for this ECLResult.
	  * 
	  * @return showFileContent
	  */
	 public java.lang.Boolean getShowFileContent() {
		 return showFileContent;
	 }


	 /**
	  * Sets the showFileContent value for this ECLResult.
	  * 
	  * @param showFileContent
	  */
	 public void setShowFileContent(java.lang.Boolean showFileContent) {
		 this.showFileContent = showFileContent;
	 }


	 /**
	  * Gets the total value for this ECLResult.
	  * 
	  * @return total
	  */
	 public java.lang.Long getTotal() {
		 return total;
	 }


	 /**
	  * Sets the total value for this ECLResult.
	  * 
	  * @param total
	  */
	 public void setTotal(java.lang.Long total) {
		 this.total = total;
	 }


	 /**
	  * Gets the ECLSchemas value for this ECLResult.
	  * 
	  * @return ECLSchemas
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLSchemaItem[] getECLSchemas() {
		 return ECLSchemas;
	 }


	 /**
	  * Sets the ECLSchemas value for this ECLResult.
	  * 
	  * @param ECLSchemas
	  */
	 public void setECLSchemas(org.hpccsystems.ws.wsworkunits.ECLSchemaItem[] ECLSchemas) {
		 this.ECLSchemas = ECLSchemas;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof ECLResult)) return false;
		 ECLResult other = (ECLResult) obj;
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
						 ((this.sequence==null && other.getSequence()==null) || 
								 (this.sequence!=null &&
								 this.sequence.equals(other.getSequence()))) &&
								 ((this.value==null && other.getValue()==null) || 
										 (this.value!=null &&
										 this.value.equals(other.getValue()))) &&
										 ((this.link==null && other.getLink()==null) || 
												 (this.link!=null &&
												 this.link.equals(other.getLink()))) &&
												 ((this.fileName==null && other.getFileName()==null) || 
														 (this.fileName!=null &&
														 this.fileName.equals(other.getFileName()))) &&
														 ((this.isSupplied==null && other.getIsSupplied()==null) || 
																 (this.isSupplied!=null &&
																 this.isSupplied.equals(other.getIsSupplied()))) &&
																 ((this.showFileContent==null && other.getShowFileContent()==null) || 
																		 (this.showFileContent!=null &&
																		 this.showFileContent.equals(other.getShowFileContent()))) &&
																		 ((this.total==null && other.getTotal()==null) || 
																				 (this.total!=null &&
																				 this.total.equals(other.getTotal()))) &&
																				 ((this.ECLSchemas==null && other.getECLSchemas()==null) || 
																						 (this.ECLSchemas!=null &&
																						 java.util.Arrays.equals(this.ECLSchemas, other.getECLSchemas())));
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
		 if (getSequence() != null) {
			 _hashCode += getSequence().hashCode();
		 }
		 if (getValue() != null) {
			 _hashCode += getValue().hashCode();
		 }
		 if (getLink() != null) {
			 _hashCode += getLink().hashCode();
		 }
		 if (getFileName() != null) {
			 _hashCode += getFileName().hashCode();
		 }
		 if (getIsSupplied() != null) {
			 _hashCode += getIsSupplied().hashCode();
		 }
		 if (getShowFileContent() != null) {
			 _hashCode += getShowFileContent().hashCode();
		 }
		 if (getTotal() != null) {
			 _hashCode += getTotal().hashCode();
		 }
		 if (getECLSchemas() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getECLSchemas());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getECLSchemas(), i);
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
	 new org.apache.axis.description.TypeDesc(ECLResult.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sequence");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Sequence"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("value");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Value"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("link");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Link"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("fileName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isSupplied");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsSupplied"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("showFileContent");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ShowFileContent"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("total");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Total"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("ECLSchemas");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSchemas"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSchemaItem"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSchemaItem"));
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
