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
 * TpLogicalCluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpLogicalCluster  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String queue;

	private java.lang.String languageVersion;

	private java.lang.String process;

	public TpLogicalCluster() {
	}

	public TpLogicalCluster(
			java.lang.String name,
			java.lang.String queue,
			java.lang.String languageVersion,
			java.lang.String process) {
		this.name = name;
		this.queue = queue;
		this.languageVersion = languageVersion;
		this.process = process;
	}


	/**
	 * Gets the name value for this TpLogicalCluster.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}


	/**
	 * Sets the name value for this TpLogicalCluster.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}


	/**
	 * Gets the queue value for this TpLogicalCluster.
	 * 
	 * @return queue
	 */
	public java.lang.String getQueue() {
		return queue;
	}


	/**
	 * Sets the queue value for this TpLogicalCluster.
	 * 
	 * @param queue
	 */
	public void setQueue(java.lang.String queue) {
		this.queue = queue;
	}


	/**
	 * Gets the languageVersion value for this TpLogicalCluster.
	 * 
	 * @return languageVersion
	 */
	public java.lang.String getLanguageVersion() {
		return languageVersion;
	}


	/**
	 * Sets the languageVersion value for this TpLogicalCluster.
	 * 
	 * @param languageVersion
	 */
	public void setLanguageVersion(java.lang.String languageVersion) {
		this.languageVersion = languageVersion;
	}


	/**
	 * Gets the process value for this TpLogicalCluster.
	 * 
	 * @return process
	 */
	public java.lang.String getProcess() {
		return process;
	}


	/**
	 * Sets the process value for this TpLogicalCluster.
	 * 
	 * @param process
	 */
	public void setProcess(java.lang.String process) {
		this.process = process;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof TpLogicalCluster)) {
			return false;
		}
		TpLogicalCluster other = (TpLogicalCluster) obj;
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
				((this.name==null && other.getName()==null) || 
						(this.name!=null &&
						this.name.equals(other.getName()))) &&
						((this.queue==null && other.getQueue()==null) || 
								(this.queue!=null &&
								this.queue.equals(other.getQueue()))) &&
								((this.languageVersion==null && other.getLanguageVersion()==null) || 
										(this.languageVersion!=null &&
										this.languageVersion.equals(other.getLanguageVersion()))) &&
										((this.process==null && other.getProcess()==null) || 
												(this.process!=null &&
												this.process.equals(other.getProcess())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getQueue() != null) {
			_hashCode += getQueue().hashCode();
		}
		if (getLanguageVersion() != null) {
			_hashCode += getLanguageVersion().hashCode();
		}
		if (getProcess() != null) {
			_hashCode += getProcess().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(TpLogicalCluster.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogicalCluster"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("queue");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Queue"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("languageVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LanguageVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("process");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Process"));
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
