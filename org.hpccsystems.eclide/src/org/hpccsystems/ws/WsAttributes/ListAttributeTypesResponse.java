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
 * ListAttributeTypesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class ListAttributeTypesResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.WsAttributes.AttributeType[] types;

	public ListAttributeTypesResponse() {
	}

	public ListAttributeTypesResponse(
			org.hpccsystems.ws.WsAttributes.AttributeType[] types) {
		this.types = types;
	}


	/**
	 * Gets the types value for this ListAttributeTypesResponse.
	 * 
	 * @return types
	 */
	public org.hpccsystems.ws.WsAttributes.AttributeType[] getTypes() {
		return types;
	}


	/**
	 * Sets the types value for this ListAttributeTypesResponse.
	 * 
	 * @param types
	 */
	public void setTypes(org.hpccsystems.ws.WsAttributes.AttributeType[] types) {
		this.types = types;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ListAttributeTypesResponse)) return false;
		ListAttributeTypesResponse other = (ListAttributeTypesResponse) obj;
		if (obj == null) return false;
		if (this == obj) return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && 
				((this.types==null && other.getTypes()==null) || 
						(this.types!=null &&
						java.util.Arrays.equals(this.types, other.getTypes())));
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
		if (getTypes() != null) {
			for (int i=0;
					i<java.lang.reflect.Array.getLength(getTypes());
					i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getTypes(), i);
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
	new org.apache.axis.description.TypeDesc(ListAttributeTypesResponse.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">ListAttributeTypesResponse"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("types");
		elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Types"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "AttributeType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Type"));
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
