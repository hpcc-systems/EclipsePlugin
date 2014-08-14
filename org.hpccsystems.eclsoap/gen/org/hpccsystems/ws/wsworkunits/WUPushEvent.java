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
 * WUPushEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUPushEvent  implements java.io.Serializable {
	private java.lang.String eventName;

	private java.lang.String eventText;

	public WUPushEvent() {
	}

	public WUPushEvent(
			java.lang.String eventName,
			java.lang.String eventText) {
		this.eventName = eventName;
		this.eventText = eventText;
	}


	/**
	 * Gets the eventName value for this WUPushEvent.
	 * 
	 * @return eventName
	 */
	public java.lang.String getEventName() {
		return eventName;
	}


	/**
	 * Sets the eventName value for this WUPushEvent.
	 * 
	 * @param eventName
	 */
	public void setEventName(java.lang.String eventName) {
		this.eventName = eventName;
	}


	/**
	 * Gets the eventText value for this WUPushEvent.
	 * 
	 * @return eventText
	 */
	public java.lang.String getEventText() {
		return eventText;
	}


	/**
	 * Sets the eventText value for this WUPushEvent.
	 * 
	 * @param eventText
	 */
	public void setEventText(java.lang.String eventText) {
		this.eventText = eventText;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof WUPushEvent)) {
			return false;
		}
		WUPushEvent other = (WUPushEvent) obj;
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
				((this.eventName==null && other.getEventName()==null) || 
						(this.eventName!=null &&
						this.eventName.equals(other.getEventName()))) &&
						((this.eventText==null && other.getEventText()==null) || 
								(this.eventText!=null &&
								this.eventText.equals(other.getEventText())));
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
		if (getEventName() != null) {
			_hashCode += getEventName().hashCode();
		}
		if (getEventText() != null) {
			_hashCode += getEventText().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(WUPushEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPushEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("eventName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EventName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("eventText");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EventText"));
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
