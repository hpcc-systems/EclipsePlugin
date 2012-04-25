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
 * WUResultSummaryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUResultSummaryResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions;

	private java.lang.String wuid;

	private java.lang.Integer sequence;

	private java.lang.Integer format;

	private org.hpccsystems.ws.wsworkunits.ECLResult result;

	public WUResultSummaryResponse() {
	}

	public WUResultSummaryResponse(
			org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions,
			java.lang.String wuid,
			java.lang.Integer sequence,
			java.lang.Integer format,
			org.hpccsystems.ws.wsworkunits.ECLResult result) {
		this.exceptions = exceptions;
		this.wuid = wuid;
		this.sequence = sequence;
		this.format = format;
		this.result = result;
	}


	/**
	 * Gets the exceptions value for this WUResultSummaryResponse.
	 * 
	 * @return exceptions
	 */
	public org.hpccsystems.ws.wsworkunits.ArrayOfEspException getExceptions() {
		return exceptions;
	}


	/**
	 * Sets the exceptions value for this WUResultSummaryResponse.
	 * 
	 * @param exceptions
	 */
	public void setExceptions(org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions) {
		this.exceptions = exceptions;
	}


	/**
	 * Gets the wuid value for this WUResultSummaryResponse.
	 * 
	 * @return wuid
	 */
	public java.lang.String getWuid() {
		return wuid;
	}


	/**
	 * Sets the wuid value for this WUResultSummaryResponse.
	 * 
	 * @param wuid
	 */
	public void setWuid(java.lang.String wuid) {
		this.wuid = wuid;
	}


	/**
	 * Gets the sequence value for this WUResultSummaryResponse.
	 * 
	 * @return sequence
	 */
	public java.lang.Integer getSequence() {
		return sequence;
	}


	/**
	 * Sets the sequence value for this WUResultSummaryResponse.
	 * 
	 * @param sequence
	 */
	public void setSequence(java.lang.Integer sequence) {
		this.sequence = sequence;
	}


	/**
	 * Gets the format value for this WUResultSummaryResponse.
	 * 
	 * @return format
	 */
	public java.lang.Integer getFormat() {
		return format;
	}


	/**
	 * Sets the format value for this WUResultSummaryResponse.
	 * 
	 * @param format
	 */
	public void setFormat(java.lang.Integer format) {
		this.format = format;
	}


	/**
	 * Gets the result value for this WUResultSummaryResponse.
	 * 
	 * @return result
	 */
	public org.hpccsystems.ws.wsworkunits.ECLResult getResult() {
		return result;
	}


	/**
	 * Sets the result value for this WUResultSummaryResponse.
	 * 
	 * @param result
	 */
	public void setResult(org.hpccsystems.ws.wsworkunits.ECLResult result) {
		this.result = result;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof WUResultSummaryResponse)) {
			return false;
		}
		WUResultSummaryResponse other = (WUResultSummaryResponse) obj;
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
						((this.wuid==null && other.getWuid()==null) || 
								(this.wuid!=null &&
								this.wuid.equals(other.getWuid()))) &&
								((this.sequence==null && other.getSequence()==null) || 
										(this.sequence!=null &&
										this.sequence.equals(other.getSequence()))) &&
										((this.format==null && other.getFormat()==null) || 
												(this.format!=null &&
												this.format.equals(other.getFormat()))) &&
												((this.result==null && other.getResult()==null) || 
														(this.result!=null &&
														this.result.equals(other.getResult())));
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
		if (getWuid() != null) {
			_hashCode += getWuid().hashCode();
		}
		if (getSequence() != null) {
			_hashCode += getSequence().hashCode();
		}
		if (getFormat() != null) {
			_hashCode += getFormat().hashCode();
		}
		if (getResult() != null) {
			_hashCode += getResult().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(WUResultSummaryResponse.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultSummaryResponse"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("exceptions");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("wuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sequence");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Sequence"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("format");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Format"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("result");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Result"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult"));
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
