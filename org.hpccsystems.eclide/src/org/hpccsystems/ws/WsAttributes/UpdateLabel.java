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
 * UpdateLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class UpdateLabel  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String moduleName;

	private java.lang.String atributeName;

	private java.lang.Integer attrbuteVersion;

	public UpdateLabel() {
	}

	public UpdateLabel(
			java.lang.String name,
			java.lang.String moduleName,
			java.lang.String atributeName,
			java.lang.Integer attrbuteVersion) {
		this.name = name;
		this.moduleName = moduleName;
		this.atributeName = atributeName;
		this.attrbuteVersion = attrbuteVersion;
	}


	/**
	 * Gets the name value for this UpdateLabel.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this UpdateLabel.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the moduleName value for this UpdateLabel.
	  * 
	  * @return moduleName
	  */
	 public java.lang.String getModuleName() {
		 return moduleName;
	 }


	 /**
	  * Sets the moduleName value for this UpdateLabel.
	  * 
	  * @param moduleName
	  */
	 public void setModuleName(java.lang.String moduleName) {
		 this.moduleName = moduleName;
	 }


	 /**
	  * Gets the atributeName value for this UpdateLabel.
	  * 
	  * @return atributeName
	  */
	 public java.lang.String getAtributeName() {
		 return atributeName;
	 }


	 /**
	  * Sets the atributeName value for this UpdateLabel.
	  * 
	  * @param atributeName
	  */
	 public void setAtributeName(java.lang.String atributeName) {
		 this.atributeName = atributeName;
	 }


	 /**
	  * Gets the attrbuteVersion value for this UpdateLabel.
	  * 
	  * @return attrbuteVersion
	  */
	 public java.lang.Integer getAttrbuteVersion() {
		 return attrbuteVersion;
	 }


	 /**
	  * Sets the attrbuteVersion value for this UpdateLabel.
	  * 
	  * @param attrbuteVersion
	  */
	 public void setAttrbuteVersion(java.lang.Integer attrbuteVersion) {
		 this.attrbuteVersion = attrbuteVersion;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof UpdateLabel)) return false;
		 UpdateLabel other = (UpdateLabel) obj;
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
						 ((this.moduleName==null && other.getModuleName()==null) || 
								 (this.moduleName!=null &&
								 this.moduleName.equals(other.getModuleName()))) &&
								 ((this.atributeName==null && other.getAtributeName()==null) || 
										 (this.atributeName!=null &&
										 this.atributeName.equals(other.getAtributeName()))) &&
										 ((this.attrbuteVersion==null && other.getAttrbuteVersion()==null) || 
												 (this.attrbuteVersion!=null &&
												 this.attrbuteVersion.equals(other.getAttrbuteVersion())));
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
		 if (getModuleName() != null) {
			 _hashCode += getModuleName().hashCode();
		 }
		 if (getAtributeName() != null) {
			 _hashCode += getAtributeName().hashCode();
		 }
		 if (getAttrbuteVersion() != null) {
			 _hashCode += getAttrbuteVersion().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(UpdateLabel.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateLabel"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("moduleName");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ModuleName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("atributeName");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "AtributeName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("attrbuteVersion");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "AttrbuteVersion"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
