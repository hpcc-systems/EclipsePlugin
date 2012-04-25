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
 * CreateAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class CreateAttribute  implements java.io.Serializable {
	private java.lang.String moduleName;

	private java.lang.String attributeName;

	private java.lang.String type;

	public CreateAttribute() {
	}

	public CreateAttribute(
			java.lang.String moduleName,
			java.lang.String attributeName,
			java.lang.String type) {
		this.moduleName = moduleName;
		this.attributeName = attributeName;
		this.type = type;
	}


	/**
	 * Gets the moduleName value for this CreateAttribute.
	 * 
	 * @return moduleName
	 */
	public java.lang.String getModuleName() {
		return moduleName;
	}


	/**
	 * Sets the moduleName value for this CreateAttribute.
	 * 
	 * @param moduleName
	 */
	public void setModuleName(java.lang.String moduleName) {
		this.moduleName = moduleName;
	}


	/**
	 * Gets the attributeName value for this CreateAttribute.
	 * 
	 * @return attributeName
	 */
	public java.lang.String getAttributeName() {
		return attributeName;
	}


	/**
	 * Sets the attributeName value for this CreateAttribute.
	 * 
	 * @param attributeName
	 */
	public void setAttributeName(java.lang.String attributeName) {
		this.attributeName = attributeName;
	}


	/**
	 * Gets the type value for this CreateAttribute.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}


	/**
	 * Sets the type value for this CreateAttribute.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CreateAttribute)) {
			return false;
		}
		CreateAttribute other = (CreateAttribute) obj;
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
								((this.type==null && other.getType()==null) || 
										(this.type!=null &&
										this.type.equals(other.getType())));
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
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(CreateAttribute.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateAttribute"));
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
		elemField.setFieldName("type");
		elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Type"));
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
