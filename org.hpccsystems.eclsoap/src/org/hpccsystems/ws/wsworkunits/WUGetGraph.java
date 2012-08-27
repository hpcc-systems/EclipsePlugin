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
 * WUGetGraph.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUGetGraph  implements java.io.Serializable {
	private java.lang.String wuid;

	private java.lang.String graphName;

	private java.lang.String subGraphId;

	public WUGetGraph() {
	}

	public WUGetGraph(
			java.lang.String wuid,
			java.lang.String graphName,
			java.lang.String subGraphId) {
		this.wuid = wuid;
		this.graphName = graphName;
		this.subGraphId = subGraphId;
	}


	/**
	 * Gets the wuid value for this WUGetGraph.
	 * 
	 * @return wuid
	 */
	public java.lang.String getWuid() {
		return wuid;
	}


	/**
	 * Sets the wuid value for this WUGetGraph.
	 * 
	 * @param wuid
	 */
	public void setWuid(java.lang.String wuid) {
		this.wuid = wuid;
	}


	/**
	 * Gets the graphName value for this WUGetGraph.
	 * 
	 * @return graphName
	 */
	public java.lang.String getGraphName() {
		return graphName;
	}


	/**
	 * Sets the graphName value for this WUGetGraph.
	 * 
	 * @param graphName
	 */
	public void setGraphName(java.lang.String graphName) {
		this.graphName = graphName;
	}


	/**
	 * Gets the subGraphId value for this WUGetGraph.
	 * 
	 * @return subGraphId
	 */
	public java.lang.String getSubGraphId() {
		return subGraphId;
	}


	/**
	 * Sets the subGraphId value for this WUGetGraph.
	 * 
	 * @param subGraphId
	 */
	public void setSubGraphId(java.lang.String subGraphId) {
		this.subGraphId = subGraphId;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof WUGetGraph)) {
			return false;
		}
		WUGetGraph other = (WUGetGraph) obj;
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
				((this.wuid==null && other.getWuid()==null) || 
						(this.wuid!=null &&
						this.wuid.equals(other.getWuid()))) &&
						((this.graphName==null && other.getGraphName()==null) || 
								(this.graphName!=null &&
								this.graphName.equals(other.getGraphName()))) &&
								((this.subGraphId==null && other.getSubGraphId()==null) || 
										(this.subGraphId!=null &&
										this.subGraphId.equals(other.getSubGraphId())));
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
		if (getGraphName() != null) {
			_hashCode += getGraphName().hashCode();
		}
		if (getSubGraphId() != null) {
			_hashCode += getSubGraphId().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(WUGetGraph.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraph"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("wuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("graphName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("subGraphId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SubGraphId"));
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
