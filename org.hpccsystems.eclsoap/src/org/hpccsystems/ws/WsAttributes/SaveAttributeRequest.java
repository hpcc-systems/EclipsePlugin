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
 * SaveAttributeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class SaveAttributeRequest  implements java.io.Serializable {
	private java.lang.String moduleName;

	private java.lang.String attributeName;

	private java.lang.Integer flags;

	private java.lang.Integer resultType;

	private java.lang.String description;

	private java.lang.String text;

	public SaveAttributeRequest() {
	}

	public SaveAttributeRequest(
			java.lang.String moduleName,
			java.lang.String attributeName,
			java.lang.Integer flags,
			java.lang.Integer resultType,
			java.lang.String description,
			java.lang.String text) {
		this.moduleName = moduleName;
		this.attributeName = attributeName;
		this.flags = flags;
		this.resultType = resultType;
		this.description = description;
		this.text = text;
	}


	/**
	 * Gets the moduleName value for this SaveAttributeRequest.
	 * 
	 * @return moduleName
	 */
	 public java.lang.String getModuleName() {
		 return moduleName;
	 }


	 /**
	  * Sets the moduleName value for this SaveAttributeRequest.
	  * 
	  * @param moduleName
	  */
	 public void setModuleName(java.lang.String moduleName) {
		 this.moduleName = moduleName;
	 }


	 /**
	  * Gets the attributeName value for this SaveAttributeRequest.
	  * 
	  * @return attributeName
	  */
	 public java.lang.String getAttributeName() {
		 return attributeName;
	 }


	 /**
	  * Sets the attributeName value for this SaveAttributeRequest.
	  * 
	  * @param attributeName
	  */
	 public void setAttributeName(java.lang.String attributeName) {
		 this.attributeName = attributeName;
	 }


	 /**
	  * Gets the flags value for this SaveAttributeRequest.
	  * 
	  * @return flags
	  */
	 public java.lang.Integer getFlags() {
		 return flags;
	 }


	 /**
	  * Sets the flags value for this SaveAttributeRequest.
	  * 
	  * @param flags
	  */
	 public void setFlags(java.lang.Integer flags) {
		 this.flags = flags;
	 }


	 /**
	  * Gets the resultType value for this SaveAttributeRequest.
	  * 
	  * @return resultType
	  */
	 public java.lang.Integer getResultType() {
		 return resultType;
	 }


	 /**
	  * Sets the resultType value for this SaveAttributeRequest.
	  * 
	  * @param resultType
	  */
	 public void setResultType(java.lang.Integer resultType) {
		 this.resultType = resultType;
	 }


	 /**
	  * Gets the description value for this SaveAttributeRequest.
	  * 
	  * @return description
	  */
	 public java.lang.String getDescription() {
		 return description;
	 }


	 /**
	  * Sets the description value for this SaveAttributeRequest.
	  * 
	  * @param description
	  */
	 public void setDescription(java.lang.String description) {
		 this.description = description;
	 }


	 /**
	  * Gets the text value for this SaveAttributeRequest.
	  * 
	  * @return text
	  */
	 public java.lang.String getText() {
		 return text;
	 }


	 /**
	  * Sets the text value for this SaveAttributeRequest.
	  * 
	  * @param text
	  */
	 public void setText(java.lang.String text) {
		 this.text = text;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof SaveAttributeRequest)) {
			return false;
		}
		 SaveAttributeRequest other = (SaveAttributeRequest) obj;
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
				 ((this.moduleName==null && other.getModuleName()==null) || 
						 (this.moduleName!=null &&
						 this.moduleName.equals(other.getModuleName()))) &&
						 ((this.attributeName==null && other.getAttributeName()==null) || 
								 (this.attributeName!=null &&
								 this.attributeName.equals(other.getAttributeName()))) &&
								 ((this.flags==null && other.getFlags()==null) || 
										 (this.flags!=null &&
										 this.flags.equals(other.getFlags()))) &&
										 ((this.resultType==null && other.getResultType()==null) || 
												 (this.resultType!=null &&
												 this.resultType.equals(other.getResultType()))) &&
												 ((this.description==null && other.getDescription()==null) || 
														 (this.description!=null &&
														 this.description.equals(other.getDescription()))) &&
														 ((this.text==null && other.getText()==null) || 
																 (this.text!=null &&
																 this.text.equals(other.getText())));
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
		 if (getModuleName() != null) {
			 _hashCode += getModuleName().hashCode();
		 }
		 if (getAttributeName() != null) {
			 _hashCode += getAttributeName().hashCode();
		 }
		 if (getFlags() != null) {
			 _hashCode += getFlags().hashCode();
		 }
		 if (getResultType() != null) {
			 _hashCode += getResultType().hashCode();
		 }
		 if (getDescription() != null) {
			 _hashCode += getDescription().hashCode();
		 }
		 if (getText() != null) {
			 _hashCode += getText().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(SaveAttributeRequest.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "SaveAttributeRequest"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("moduleName");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ModuleName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("attributeName");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "AttributeName"));
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
		 elemField.setFieldName("resultType");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ResultType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("description");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Description"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("text");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Text"));
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
