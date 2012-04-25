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
 * TpSwapNodeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpSwapNodeRequest  implements java.io.Serializable {
	private java.lang.String cluster;

	private java.lang.String oldIP;

	private java.lang.String newIP;

	public TpSwapNodeRequest() {
	}

	public TpSwapNodeRequest(
			java.lang.String cluster,
			java.lang.String oldIP,
			java.lang.String newIP) {
		this.cluster = cluster;
		this.oldIP = oldIP;
		this.newIP = newIP;
	}


	/**
	 * Gets the cluster value for this TpSwapNodeRequest.
	 * 
	 * @return cluster
	 */
	public java.lang.String getCluster() {
		return cluster;
	}


	/**
	 * Sets the cluster value for this TpSwapNodeRequest.
	 * 
	 * @param cluster
	 */
	public void setCluster(java.lang.String cluster) {
		this.cluster = cluster;
	}


	/**
	 * Gets the oldIP value for this TpSwapNodeRequest.
	 * 
	 * @return oldIP
	 */
	public java.lang.String getOldIP() {
		return oldIP;
	}


	/**
	 * Sets the oldIP value for this TpSwapNodeRequest.
	 * 
	 * @param oldIP
	 */
	public void setOldIP(java.lang.String oldIP) {
		this.oldIP = oldIP;
	}


	/**
	 * Gets the newIP value for this TpSwapNodeRequest.
	 * 
	 * @return newIP
	 */
	public java.lang.String getNewIP() {
		return newIP;
	}


	/**
	 * Sets the newIP value for this TpSwapNodeRequest.
	 * 
	 * @param newIP
	 */
	public void setNewIP(java.lang.String newIP) {
		this.newIP = newIP;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof TpSwapNodeRequest)) {
			return false;
		}
		TpSwapNodeRequest other = (TpSwapNodeRequest) obj;
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
				((this.cluster==null && other.getCluster()==null) || 
						(this.cluster!=null &&
						this.cluster.equals(other.getCluster()))) &&
						((this.oldIP==null && other.getOldIP()==null) || 
								(this.oldIP!=null &&
								this.oldIP.equals(other.getOldIP()))) &&
								((this.newIP==null && other.getNewIP()==null) || 
										(this.newIP!=null &&
										this.newIP.equals(other.getNewIP())));
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
		if (getOldIP() != null) {
			_hashCode += getOldIP().hashCode();
		}
		if (getNewIP() != null) {
			_hashCode += getNewIP().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(TpSwapNodeRequest.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpSwapNodeRequest"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cluster");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Cluster"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("oldIP");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "OldIP"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("newIP");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "NewIP"));
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
