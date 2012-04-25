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
 * WUActionResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUActionResult  implements java.io.Serializable {
	private java.lang.String wuid;

	private java.lang.String action;

	private java.lang.String result;

	public WUActionResult() {
	}

	public WUActionResult(
			java.lang.String wuid,
			java.lang.String action,
			java.lang.String result) {
		this.wuid = wuid;
		this.action = action;
		this.result = result;
	}


	/**
	 * Gets the wuid value for this WUActionResult.
	 * 
	 * @return wuid
	 */
	public java.lang.String getWuid() {
		return wuid;
	}


	/**
	 * Sets the wuid value for this WUActionResult.
	 * 
	 * @param wuid
	 */
	public void setWuid(java.lang.String wuid) {
		this.wuid = wuid;
	}


	/**
	 * Gets the action value for this WUActionResult.
	 * 
	 * @return action
	 */
	public java.lang.String getAction() {
		return action;
	}


	/**
	 * Sets the action value for this WUActionResult.
	 * 
	 * @param action
	 */
	public void setAction(java.lang.String action) {
		this.action = action;
	}


	/**
	 * Gets the result value for this WUActionResult.
	 * 
	 * @return result
	 */
	public java.lang.String getResult() {
		return result;
	}


	/**
	 * Sets the result value for this WUActionResult.
	 * 
	 * @param result
	 */
	public void setResult(java.lang.String result) {
		this.result = result;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof WUActionResult)) return false;
		WUActionResult other = (WUActionResult) obj;
		if (obj == null) return false;
		if (this == obj) return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && 
				((this.wuid==null && other.getWuid()==null) || 
						(this.wuid!=null &&
						this.wuid.equals(other.getWuid()))) &&
						((this.action==null && other.getAction()==null) || 
								(this.action!=null &&
								this.action.equals(other.getAction()))) &&
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
		if (getWuid() != null) {
			_hashCode += getWuid().hashCode();
		}
		if (getAction() != null) {
			_hashCode += getAction().hashCode();
		}
		if (getResult() != null) {
			_hashCode += getResult().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(WUActionResult.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUActionResult"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("wuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("action");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Action"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("result");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Result"));
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
