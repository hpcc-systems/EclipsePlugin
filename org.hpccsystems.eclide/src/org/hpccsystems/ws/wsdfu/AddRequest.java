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
 * AddRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class AddRequest  implements java.io.Serializable {
	private java.lang.String dstname;

	private byte[] xmlmap;

	public AddRequest() {
	}

	public AddRequest(
			java.lang.String dstname,
			byte[] xmlmap) {
		this.dstname = dstname;
		this.xmlmap = xmlmap;
	}


	/**
	 * Gets the dstname value for this AddRequest.
	 * 
	 * @return dstname
	 */
	public java.lang.String getDstname() {
		return dstname;
	}


	/**
	 * Sets the dstname value for this AddRequest.
	 * 
	 * @param dstname
	 */
	public void setDstname(java.lang.String dstname) {
		this.dstname = dstname;
	}


	/**
	 * Gets the xmlmap value for this AddRequest.
	 * 
	 * @return xmlmap
	 */
	public byte[] getXmlmap() {
		return xmlmap;
	}


	/**
	 * Sets the xmlmap value for this AddRequest.
	 * 
	 * @param xmlmap
	 */
	public void setXmlmap(byte[] xmlmap) {
		this.xmlmap = xmlmap;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AddRequest)) {
			return false;
		}
		AddRequest other = (AddRequest) obj;
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
				((this.dstname==null && other.getDstname()==null) || 
						(this.dstname!=null &&
						this.dstname.equals(other.getDstname()))) &&
						((this.xmlmap==null && other.getXmlmap()==null) || 
								(this.xmlmap!=null &&
								java.util.Arrays.equals(this.xmlmap, other.getXmlmap())));
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
		if (getDstname() != null) {
			_hashCode += getDstname().hashCode();
		}
		if (getXmlmap() != null) {
			for (int i=0;
					i<java.lang.reflect.Array.getLength(getXmlmap());
					i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getXmlmap(), i);
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
	new org.apache.axis.description.TypeDesc(AddRequest.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddRequest"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dstname");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dstname"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("xmlmap");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "xmlmap"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
