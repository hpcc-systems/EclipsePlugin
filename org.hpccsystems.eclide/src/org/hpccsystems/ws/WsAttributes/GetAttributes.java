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
 * GetAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class GetAttributes  implements java.io.Serializable {
	private java.lang.String moduleName;

	private java.lang.String[] typeList;

	private java.lang.String label;

	public GetAttributes() {
	}

	public GetAttributes(
			java.lang.String moduleName,
			java.lang.String[] typeList,
			java.lang.String label) {
		this.moduleName = moduleName;
		this.typeList = typeList;
		this.label = label;
	}


	/**
	 * Gets the moduleName value for this GetAttributes.
	 * 
	 * @return moduleName
	 */
	public java.lang.String getModuleName() {
		return moduleName;
	}


	/**
	 * Sets the moduleName value for this GetAttributes.
	 * 
	 * @param moduleName
	 */
	public void setModuleName(java.lang.String moduleName) {
		this.moduleName = moduleName;
	}


	/**
	 * Gets the typeList value for this GetAttributes.
	 * 
	 * @return typeList
	 */
	public java.lang.String[] getTypeList() {
		return typeList;
	}


	/**
	 * Sets the typeList value for this GetAttributes.
	 * 
	 * @param typeList
	 */
	public void setTypeList(java.lang.String[] typeList) {
		this.typeList = typeList;
	}


	/**
	 * Gets the label value for this GetAttributes.
	 * 
	 * @return label
	 */
	public java.lang.String getLabel() {
		return label;
	}


	/**
	 * Sets the label value for this GetAttributes.
	 * 
	 * @param label
	 */
	public void setLabel(java.lang.String label) {
		this.label = label;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof GetAttributes)) return false;
		GetAttributes other = (GetAttributes) obj;
		if (obj == null) return false;
		if (this == obj) return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && 
				((this.moduleName==null && other.getModuleName()==null) || 
						(this.moduleName!=null &&
						this.moduleName.equals(other.getModuleName()))) &&
						((this.typeList==null && other.getTypeList()==null) || 
								(this.typeList!=null &&
								java.util.Arrays.equals(this.typeList, other.getTypeList()))) &&
								((this.label==null && other.getLabel()==null) || 
										(this.label!=null &&
										this.label.equals(other.getLabel())));
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
		if (getTypeList() != null) {
			for (int i=0;
					i<java.lang.reflect.Array.getLength(getTypeList());
					i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getTypeList(), i);
				if (obj != null &&
						!obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getLabel() != null) {
			_hashCode += getLabel().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(GetAttributes.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributes"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("moduleName");
		elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ModuleName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("typeList");
		elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "TypeList"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Item"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("label");
		elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Label"));
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
