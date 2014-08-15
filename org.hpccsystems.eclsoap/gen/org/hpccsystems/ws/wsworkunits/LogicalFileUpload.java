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
 * LogicalFileUpload.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class LogicalFileUpload  implements java.io.Serializable {
	private java.lang.Integer type;

	private java.lang.String source;

	private java.lang.String destination;

	private java.lang.String eventTag;

	public LogicalFileUpload() {
	}

	public LogicalFileUpload(
			java.lang.Integer type,
			java.lang.String source,
			java.lang.String destination,
			java.lang.String eventTag) {
		this.type = type;
		this.source = source;
		this.destination = destination;
		this.eventTag = eventTag;
	}


	/**
	 * Gets the type value for this LogicalFileUpload.
	 * 
	 * @return type
	 */
	public java.lang.Integer getType() {
		return type;
	}


	/**
	 * Sets the type value for this LogicalFileUpload.
	 * 
	 * @param type
	 */
	public void setType(java.lang.Integer type) {
		this.type = type;
	}


	/**
	 * Gets the source value for this LogicalFileUpload.
	 * 
	 * @return source
	 */
	public java.lang.String getSource() {
		return source;
	}


	/**
	 * Sets the source value for this LogicalFileUpload.
	 * 
	 * @param source
	 */
	public void setSource(java.lang.String source) {
		this.source = source;
	}


	/**
	 * Gets the destination value for this LogicalFileUpload.
	 * 
	 * @return destination
	 */
	public java.lang.String getDestination() {
		return destination;
	}


	/**
	 * Sets the destination value for this LogicalFileUpload.
	 * 
	 * @param destination
	 */
	public void setDestination(java.lang.String destination) {
		this.destination = destination;
	}


	/**
	 * Gets the eventTag value for this LogicalFileUpload.
	 * 
	 * @return eventTag
	 */
	public java.lang.String getEventTag() {
		return eventTag;
	}


	/**
	 * Sets the eventTag value for this LogicalFileUpload.
	 * 
	 * @param eventTag
	 */
	public void setEventTag(java.lang.String eventTag) {
		this.eventTag = eventTag;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LogicalFileUpload)) {
			return false;
		}
		LogicalFileUpload other = (LogicalFileUpload) obj;
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
				((this.type==null && other.getType()==null) || 
						(this.type!=null &&
						this.type.equals(other.getType()))) &&
						((this.source==null && other.getSource()==null) || 
								(this.source!=null &&
								this.source.equals(other.getSource()))) &&
								((this.destination==null && other.getDestination()==null) || 
										(this.destination!=null &&
										this.destination.equals(other.getDestination()))) &&
										((this.eventTag==null && other.getEventTag()==null) || 
												(this.eventTag!=null &&
												this.eventTag.equals(other.getEventTag())));
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
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getSource() != null) {
			_hashCode += getSource().hashCode();
		}
		if (getDestination() != null) {
			_hashCode += getDestination().hashCode();
		}
		if (getEventTag() != null) {
			_hashCode += getEventTag().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(LogicalFileUpload.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileUpload"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Type"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("source");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Source"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("destination");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Destination"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("eventTag");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EventTag"));
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
