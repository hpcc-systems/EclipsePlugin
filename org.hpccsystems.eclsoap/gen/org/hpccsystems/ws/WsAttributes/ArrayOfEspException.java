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
 * ArrayOfEspException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class ArrayOfEspException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
	private java.lang.String source;

	private org.hpccsystems.ws.WsAttributes.EspException[] exception;

	public ArrayOfEspException() {
	}

	public ArrayOfEspException(
			java.lang.String source,
			org.hpccsystems.ws.WsAttributes.EspException[] exception) {
		this.source = source;
		this.exception = exception;
	}


	/**
	 * Gets the source value for this ArrayOfEspException.
	 * 
	 * @return source
	 */
	public java.lang.String getSource() {
		return source;
	}


	/**
	 * Sets the source value for this ArrayOfEspException.
	 * 
	 * @param source
	 */
	public void setSource(java.lang.String source) {
		this.source = source;
	}


	/**
	 * Gets the exception value for this ArrayOfEspException.
	 * 
	 * @return exception
	 */
	public org.hpccsystems.ws.WsAttributes.EspException[] getException() {
		return exception;
	}


	/**
	 * Sets the exception value for this ArrayOfEspException.
	 * 
	 * @param exception
	 */
	public void setException(org.hpccsystems.ws.WsAttributes.EspException[] exception) {
		this.exception = exception;
	}

	public org.hpccsystems.ws.WsAttributes.EspException getException(int i) {
		return this.exception[i];
	}

	public void setException(int i, org.hpccsystems.ws.WsAttributes.EspException _value) {
		this.exception[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfEspException)) {
			return false;
		}
		ArrayOfEspException other = (ArrayOfEspException) obj;
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
				((this.source==null && other.getSource()==null) || 
						(this.source!=null &&
						this.source.equals(other.getSource()))) &&
						((this.exception==null && other.getException()==null) || 
								(this.exception!=null &&
								java.util.Arrays.equals(this.exception, other.getException())));
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
		if (getSource() != null) {
			_hashCode += getSource().hashCode();
		}
		if (getException() != null) {
			for (int i=0;
					i<java.lang.reflect.Array.getLength(getException());
					i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getException(), i);
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
	new org.apache.axis.description.TypeDesc(ArrayOfEspException.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("source");
		elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Source"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("exception");
		elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exception"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "EspException"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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


	/**
	 * Writes the exception data to the faultDetails
	 */
	@Override
	public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
		context.serialize(qname, null, this);
	}
}
