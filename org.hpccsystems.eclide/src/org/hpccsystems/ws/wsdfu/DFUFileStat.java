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
 * DFUFileStat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUFileStat  implements java.io.Serializable {
	private java.lang.String minSkew;

	private java.lang.String maxSkew;

	public DFUFileStat() {
	}

	public DFUFileStat(
			java.lang.String minSkew,
			java.lang.String maxSkew) {
		this.minSkew = minSkew;
		this.maxSkew = maxSkew;
	}


	/**
	 * Gets the minSkew value for this DFUFileStat.
	 * 
	 * @return minSkew
	 */
	public java.lang.String getMinSkew() {
		return minSkew;
	}


	/**
	 * Sets the minSkew value for this DFUFileStat.
	 * 
	 * @param minSkew
	 */
	public void setMinSkew(java.lang.String minSkew) {
		this.minSkew = minSkew;
	}


	/**
	 * Gets the maxSkew value for this DFUFileStat.
	 * 
	 * @return maxSkew
	 */
	public java.lang.String getMaxSkew() {
		return maxSkew;
	}


	/**
	 * Sets the maxSkew value for this DFUFileStat.
	 * 
	 * @param maxSkew
	 */
	public void setMaxSkew(java.lang.String maxSkew) {
		this.maxSkew = maxSkew;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DFUFileStat)) return false;
		DFUFileStat other = (DFUFileStat) obj;
		if (obj == null) return false;
		if (this == obj) return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && 
				((this.minSkew==null && other.getMinSkew()==null) || 
						(this.minSkew!=null &&
						this.minSkew.equals(other.getMinSkew()))) &&
						((this.maxSkew==null && other.getMaxSkew()==null) || 
								(this.maxSkew!=null &&
								this.maxSkew.equals(other.getMaxSkew())));
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
		if (getMinSkew() != null) {
			_hashCode += getMinSkew().hashCode();
		}
		if (getMaxSkew() != null) {
			_hashCode += getMaxSkew().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(DFUFileStat.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileStat"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("minSkew");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MinSkew"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxSkew");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxSkew"));
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
