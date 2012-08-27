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
 * TpGetComponentFileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpGetComponentFileResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions;

	private byte[] fileContents;

	public TpGetComponentFileResponse() {
	}

	public TpGetComponentFileResponse(
			org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions,
			byte[] fileContents) {
		this.exceptions = exceptions;
		this.fileContents = fileContents;
	}


	/**
	 * Gets the exceptions value for this TpGetComponentFileResponse.
	 * 
	 * @return exceptions
	 */
	public org.hpccsystems.ws.wstopology.ArrayOfEspException getExceptions() {
		return exceptions;
	}


	/**
	 * Sets the exceptions value for this TpGetComponentFileResponse.
	 * 
	 * @param exceptions
	 */
	public void setExceptions(org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions) {
		this.exceptions = exceptions;
	}


	/**
	 * Gets the fileContents value for this TpGetComponentFileResponse.
	 * 
	 * @return fileContents
	 */
	public byte[] getFileContents() {
		return fileContents;
	}


	/**
	 * Sets the fileContents value for this TpGetComponentFileResponse.
	 * 
	 * @param fileContents
	 */
	public void setFileContents(byte[] fileContents) {
		this.fileContents = fileContents;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof TpGetComponentFileResponse)) {
			return false;
		}
		TpGetComponentFileResponse other = (TpGetComponentFileResponse) obj;
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
				((this.exceptions==null && other.getExceptions()==null) || 
						(this.exceptions!=null &&
						this.exceptions.equals(other.getExceptions()))) &&
						((this.fileContents==null && other.getFileContents()==null) || 
								(this.fileContents!=null &&
								java.util.Arrays.equals(this.fileContents, other.getFileContents())));
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
		if (getExceptions() != null) {
			_hashCode += getExceptions().hashCode();
		}
		if (getFileContents() != null) {
			for (int i=0;
					i<java.lang.reflect.Array.getLength(getFileContents());
					i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getFileContents(), i);
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
	new org.apache.axis.description.TypeDesc(TpGetComponentFileResponse.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpGetComponentFileResponse"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("exceptions");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fileContents");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "FileContents"));
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
