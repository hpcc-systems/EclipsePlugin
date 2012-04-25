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
 * WUShowScheduled.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUShowScheduled  implements java.io.Serializable {
	private java.lang.String cluster;

	private java.lang.String eventName;

	private java.lang.String pushEventName;

	private java.lang.String pushEventText;

	public WUShowScheduled() {
	}

	public WUShowScheduled(
			java.lang.String cluster,
			java.lang.String eventName,
			java.lang.String pushEventName,
			java.lang.String pushEventText) {
		this.cluster = cluster;
		this.eventName = eventName;
		this.pushEventName = pushEventName;
		this.pushEventText = pushEventText;
	}


	/**
	 * Gets the cluster value for this WUShowScheduled.
	 * 
	 * @return cluster
	 */
	public java.lang.String getCluster() {
		return cluster;
	}


	/**
	 * Sets the cluster value for this WUShowScheduled.
	 * 
	 * @param cluster
	 */
	public void setCluster(java.lang.String cluster) {
		this.cluster = cluster;
	}


	/**
	 * Gets the eventName value for this WUShowScheduled.
	 * 
	 * @return eventName
	 */
	public java.lang.String getEventName() {
		return eventName;
	}


	/**
	 * Sets the eventName value for this WUShowScheduled.
	 * 
	 * @param eventName
	 */
	public void setEventName(java.lang.String eventName) {
		this.eventName = eventName;
	}


	/**
	 * Gets the pushEventName value for this WUShowScheduled.
	 * 
	 * @return pushEventName
	 */
	public java.lang.String getPushEventName() {
		return pushEventName;
	}


	/**
	 * Sets the pushEventName value for this WUShowScheduled.
	 * 
	 * @param pushEventName
	 */
	public void setPushEventName(java.lang.String pushEventName) {
		this.pushEventName = pushEventName;
	}


	/**
	 * Gets the pushEventText value for this WUShowScheduled.
	 * 
	 * @return pushEventText
	 */
	public java.lang.String getPushEventText() {
		return pushEventText;
	}


	/**
	 * Sets the pushEventText value for this WUShowScheduled.
	 * 
	 * @param pushEventText
	 */
	public void setPushEventText(java.lang.String pushEventText) {
		this.pushEventText = pushEventText;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof WUShowScheduled)) return false;
		WUShowScheduled other = (WUShowScheduled) obj;
		if (obj == null) return false;
		if (this == obj) return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && 
				((this.cluster==null && other.getCluster()==null) || 
						(this.cluster!=null &&
						this.cluster.equals(other.getCluster()))) &&
						((this.eventName==null && other.getEventName()==null) || 
								(this.eventName!=null &&
								this.eventName.equals(other.getEventName()))) &&
								((this.pushEventName==null && other.getPushEventName()==null) || 
										(this.pushEventName!=null &&
										this.pushEventName.equals(other.getPushEventName()))) &&
										((this.pushEventText==null && other.getPushEventText()==null) || 
												(this.pushEventText!=null &&
												this.pushEventText.equals(other.getPushEventText())));
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
		if (getCluster() != null) {
			_hashCode += getCluster().hashCode();
		}
		if (getEventName() != null) {
			_hashCode += getEventName().hashCode();
		}
		if (getPushEventName() != null) {
			_hashCode += getPushEventName().hashCode();
		}
		if (getPushEventText() != null) {
			_hashCode += getPushEventText().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(WUShowScheduled.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUShowScheduled"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cluster");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("eventName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EventName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pushEventName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PushEventName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pushEventText");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PushEventText"));
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
