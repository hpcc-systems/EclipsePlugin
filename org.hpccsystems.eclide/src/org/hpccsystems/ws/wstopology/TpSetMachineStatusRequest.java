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
 * TpSetMachineStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpSetMachineStatusRequest  implements java.io.Serializable {
	private java.lang.String machinePath;

	private java.lang.String statusValue;

	public TpSetMachineStatusRequest() {
	}

	public TpSetMachineStatusRequest(
			java.lang.String machinePath,
			java.lang.String statusValue) {
		this.machinePath = machinePath;
		this.statusValue = statusValue;
	}


	/**
	 * Gets the machinePath value for this TpSetMachineStatusRequest.
	 * 
	 * @return machinePath
	 */
	public java.lang.String getMachinePath() {
		return machinePath;
	}


	/**
	 * Sets the machinePath value for this TpSetMachineStatusRequest.
	 * 
	 * @param machinePath
	 */
	public void setMachinePath(java.lang.String machinePath) {
		this.machinePath = machinePath;
	}


	/**
	 * Gets the statusValue value for this TpSetMachineStatusRequest.
	 * 
	 * @return statusValue
	 */
	public java.lang.String getStatusValue() {
		return statusValue;
	}


	/**
	 * Sets the statusValue value for this TpSetMachineStatusRequest.
	 * 
	 * @param statusValue
	 */
	public void setStatusValue(java.lang.String statusValue) {
		this.statusValue = statusValue;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof TpSetMachineStatusRequest)) {
			return false;
		}
		TpSetMachineStatusRequest other = (TpSetMachineStatusRequest) obj;
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
				((this.machinePath==null && other.getMachinePath()==null) || 
						(this.machinePath!=null &&
						this.machinePath.equals(other.getMachinePath()))) &&
						((this.statusValue==null && other.getStatusValue()==null) || 
								(this.statusValue!=null &&
								this.statusValue.equals(other.getStatusValue())));
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
		if (getMachinePath() != null) {
			_hashCode += getMachinePath().hashCode();
		}
		if (getStatusValue() != null) {
			_hashCode += getStatusValue().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(TpSetMachineStatusRequest.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpSetMachineStatusRequest"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("machinePath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "MachinePath"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("statusValue");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "StatusValue"));
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
