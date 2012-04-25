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
 * TpTargetClusterQueryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpTargetClusterQueryRequest  implements java.io.Serializable {
	private java.lang.String type;

	private java.lang.String name;

	private java.lang.Boolean showDetails;

	public TpTargetClusterQueryRequest() {
	}

	public TpTargetClusterQueryRequest(
			java.lang.String type,
			java.lang.String name,
			java.lang.Boolean showDetails) {
		this.type = type;
		this.name = name;
		this.showDetails = showDetails;
	}


	/**
	 * Gets the type value for this TpTargetClusterQueryRequest.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}


	/**
	 * Sets the type value for this TpTargetClusterQueryRequest.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}


	/**
	 * Gets the name value for this TpTargetClusterQueryRequest.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}


	/**
	 * Sets the name value for this TpTargetClusterQueryRequest.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}


	/**
	 * Gets the showDetails value for this TpTargetClusterQueryRequest.
	 * 
	 * @return showDetails
	 */
	public java.lang.Boolean getShowDetails() {
		return showDetails;
	}


	/**
	 * Sets the showDetails value for this TpTargetClusterQueryRequest.
	 * 
	 * @param showDetails
	 */
	public void setShowDetails(java.lang.Boolean showDetails) {
		this.showDetails = showDetails;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof TpTargetClusterQueryRequest)) {
			return false;
		}
		TpTargetClusterQueryRequest other = (TpTargetClusterQueryRequest) obj;
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
						((this.name==null && other.getName()==null) || 
								(this.name!=null &&
								this.name.equals(other.getName()))) &&
								((this.showDetails==null && other.getShowDetails()==null) || 
										(this.showDetails!=null &&
										this.showDetails.equals(other.getShowDetails())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getShowDetails() != null) {
			_hashCode += getShowDetails().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(TpTargetClusterQueryRequest.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpTargetClusterQueryRequest"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Type"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("showDetails");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ShowDetails"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
