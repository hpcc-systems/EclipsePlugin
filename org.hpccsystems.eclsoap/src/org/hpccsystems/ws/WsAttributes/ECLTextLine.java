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
 * ECLTextLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class ECLTextLine  implements java.io.Serializable {
	private java.lang.Integer lineNumber;

	private java.lang.String lineText;

	public ECLTextLine() {
	}

	public ECLTextLine(
			java.lang.Integer lineNumber,
			java.lang.String lineText) {
		this.lineNumber = lineNumber;
		this.lineText = lineText;
	}


	/**
	 * Gets the lineNumber value for this ECLTextLine.
	 * 
	 * @return lineNumber
	 */
	public java.lang.Integer getLineNumber() {
		return lineNumber;
	}


	/**
	 * Sets the lineNumber value for this ECLTextLine.
	 * 
	 * @param lineNumber
	 */
	public void setLineNumber(java.lang.Integer lineNumber) {
		this.lineNumber = lineNumber;
	}


	/**
	 * Gets the lineText value for this ECLTextLine.
	 * 
	 * @return lineText
	 */
	public java.lang.String getLineText() {
		return lineText;
	}


	/**
	 * Sets the lineText value for this ECLTextLine.
	 * 
	 * @param lineText
	 */
	public void setLineText(java.lang.String lineText) {
		this.lineText = lineText;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ECLTextLine)) {
			return false;
		}
		ECLTextLine other = (ECLTextLine) obj;
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
				((this.lineNumber==null && other.getLineNumber()==null) || 
						(this.lineNumber!=null &&
						this.lineNumber.equals(other.getLineNumber()))) &&
						((this.lineText==null && other.getLineText()==null) || 
								(this.lineText!=null &&
								this.lineText.equals(other.getLineText())));
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
		if (getLineNumber() != null) {
			_hashCode += getLineNumber().hashCode();
		}
		if (getLineText() != null) {
			_hashCode += getLineText().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(ECLTextLine.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLTextLine"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lineNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "LineNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lineText");
		elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "LineText"));
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
