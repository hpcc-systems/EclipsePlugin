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
 * Replicate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class Replicate  implements java.io.Serializable {
	private java.lang.String sourceLogicalName;

	private java.lang.Integer replicateOffset;

	private java.lang.String cluster;

	private java.lang.Boolean repeatLast;

	private java.lang.Boolean onlyRepeated;

	public Replicate() {
	}

	public Replicate(
			java.lang.String sourceLogicalName,
			java.lang.Integer replicateOffset,
			java.lang.String cluster,
			java.lang.Boolean repeatLast,
			java.lang.Boolean onlyRepeated) {
		this.sourceLogicalName = sourceLogicalName;
		this.replicateOffset = replicateOffset;
		this.cluster = cluster;
		this.repeatLast = repeatLast;
		this.onlyRepeated = onlyRepeated;
	}


	/**
	 * Gets the sourceLogicalName value for this Replicate.
	 * 
	 * @return sourceLogicalName
	 */
	public java.lang.String getSourceLogicalName() {
		return sourceLogicalName;
	}


	/**
	 * Sets the sourceLogicalName value for this Replicate.
	 * 
	 * @param sourceLogicalName
	 */
	public void setSourceLogicalName(java.lang.String sourceLogicalName) {
		this.sourceLogicalName = sourceLogicalName;
	}


	/**
	 * Gets the replicateOffset value for this Replicate.
	 * 
	 * @return replicateOffset
	 */
	public java.lang.Integer getReplicateOffset() {
		return replicateOffset;
	}


	/**
	 * Sets the replicateOffset value for this Replicate.
	 * 
	 * @param replicateOffset
	 */
	public void setReplicateOffset(java.lang.Integer replicateOffset) {
		this.replicateOffset = replicateOffset;
	}


	/**
	 * Gets the cluster value for this Replicate.
	 * 
	 * @return cluster
	 */
	public java.lang.String getCluster() {
		return cluster;
	}


	/**
	 * Sets the cluster value for this Replicate.
	 * 
	 * @param cluster
	 */
	public void setCluster(java.lang.String cluster) {
		this.cluster = cluster;
	}


	/**
	 * Gets the repeatLast value for this Replicate.
	 * 
	 * @return repeatLast
	 */
	public java.lang.Boolean getRepeatLast() {
		return repeatLast;
	}


	/**
	 * Sets the repeatLast value for this Replicate.
	 * 
	 * @param repeatLast
	 */
	public void setRepeatLast(java.lang.Boolean repeatLast) {
		this.repeatLast = repeatLast;
	}


	/**
	 * Gets the onlyRepeated value for this Replicate.
	 * 
	 * @return onlyRepeated
	 */
	public java.lang.Boolean getOnlyRepeated() {
		return onlyRepeated;
	}


	/**
	 * Sets the onlyRepeated value for this Replicate.
	 * 
	 * @param onlyRepeated
	 */
	public void setOnlyRepeated(java.lang.Boolean onlyRepeated) {
		this.onlyRepeated = onlyRepeated;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Replicate)) return false;
		Replicate other = (Replicate) obj;
		if (obj == null) return false;
		if (this == obj) return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && 
				((this.sourceLogicalName==null && other.getSourceLogicalName()==null) || 
						(this.sourceLogicalName!=null &&
						this.sourceLogicalName.equals(other.getSourceLogicalName()))) &&
						((this.replicateOffset==null && other.getReplicateOffset()==null) || 
								(this.replicateOffset!=null &&
								this.replicateOffset.equals(other.getReplicateOffset()))) &&
								((this.cluster==null && other.getCluster()==null) || 
										(this.cluster!=null &&
										this.cluster.equals(other.getCluster()))) &&
										((this.repeatLast==null && other.getRepeatLast()==null) || 
												(this.repeatLast!=null &&
												this.repeatLast.equals(other.getRepeatLast()))) &&
												((this.onlyRepeated==null && other.getOnlyRepeated()==null) || 
														(this.onlyRepeated!=null &&
														this.onlyRepeated.equals(other.getOnlyRepeated())));
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
		if (getSourceLogicalName() != null) {
			_hashCode += getSourceLogicalName().hashCode();
		}
		if (getReplicateOffset() != null) {
			_hashCode += getReplicateOffset().hashCode();
		}
		if (getCluster() != null) {
			_hashCode += getCluster().hashCode();
		}
		if (getRepeatLast() != null) {
			_hashCode += getRepeatLast().hashCode();
		}
		if (getOnlyRepeated() != null) {
			_hashCode += getOnlyRepeated().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(Replicate.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">Replicate"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceLogicalName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceLogicalName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("replicateOffset");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "replicateOffset"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cluster");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "cluster"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("repeatLast");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "repeatLast"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("onlyRepeated");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "onlyRepeated"));
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
