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
 * WUCopyLogicalClusterFileSections.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUCopyLogicalClusterFileSections  implements java.io.Serializable {
	private java.lang.String clusterName;

	private org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] onCluster;

	private org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] notOnCluster;

	private org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] foreign;

	private org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] notFound;

	public WUCopyLogicalClusterFileSections() {
	}

	public WUCopyLogicalClusterFileSections(
			java.lang.String clusterName,
			org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] onCluster,
			org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] notOnCluster,
			org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] foreign,
			org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] notFound) {
		this.clusterName = clusterName;
		this.onCluster = onCluster;
		this.notOnCluster = notOnCluster;
		this.foreign = foreign;
		this.notFound = notFound;
	}


	/**
	 * Gets the clusterName value for this WUCopyLogicalClusterFileSections.
	 * 
	 * @return clusterName
	 */
	public java.lang.String getClusterName() {
		return clusterName;
	}


	/**
	 * Sets the clusterName value for this WUCopyLogicalClusterFileSections.
	 * 
	 * @param clusterName
	 */
	public void setClusterName(java.lang.String clusterName) {
		this.clusterName = clusterName;
	}


	/**
	 * Gets the onCluster value for this WUCopyLogicalClusterFileSections.
	 * 
	 * @return onCluster
	 */
	public org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] getOnCluster() {
		return onCluster;
	}


	/**
	 * Sets the onCluster value for this WUCopyLogicalClusterFileSections.
	 * 
	 * @param onCluster
	 */
	public void setOnCluster(org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] onCluster) {
		this.onCluster = onCluster;
	}


	/**
	 * Gets the notOnCluster value for this WUCopyLogicalClusterFileSections.
	 * 
	 * @return notOnCluster
	 */
	public org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] getNotOnCluster() {
		return notOnCluster;
	}


	/**
	 * Sets the notOnCluster value for this WUCopyLogicalClusterFileSections.
	 * 
	 * @param notOnCluster
	 */
	public void setNotOnCluster(org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] notOnCluster) {
		this.notOnCluster = notOnCluster;
	}


	/**
	 * Gets the foreign value for this WUCopyLogicalClusterFileSections.
	 * 
	 * @return foreign
	 */
	public org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] getForeign() {
		return foreign;
	}


	/**
	 * Sets the foreign value for this WUCopyLogicalClusterFileSections.
	 * 
	 * @param foreign
	 */
	public void setForeign(org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] foreign) {
		this.foreign = foreign;
	}


	/**
	 * Gets the notFound value for this WUCopyLogicalClusterFileSections.
	 * 
	 * @return notFound
	 */
	public org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] getNotFound() {
		return notFound;
	}


	/**
	 * Sets the notFound value for this WUCopyLogicalClusterFileSections.
	 * 
	 * @param notFound
	 */
	public void setNotFound(org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[] notFound) {
		this.notFound = notFound;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof WUCopyLogicalClusterFileSections)) return false;
		WUCopyLogicalClusterFileSections other = (WUCopyLogicalClusterFileSections) obj;
		if (obj == null) return false;
		if (this == obj) return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && 
				((this.clusterName==null && other.getClusterName()==null) || 
						(this.clusterName!=null &&
						this.clusterName.equals(other.getClusterName()))) &&
						((this.onCluster==null && other.getOnCluster()==null) || 
								(this.onCluster!=null &&
								java.util.Arrays.equals(this.onCluster, other.getOnCluster()))) &&
								((this.notOnCluster==null && other.getNotOnCluster()==null) || 
										(this.notOnCluster!=null &&
										java.util.Arrays.equals(this.notOnCluster, other.getNotOnCluster()))) &&
										((this.foreign==null && other.getForeign()==null) || 
												(this.foreign!=null &&
												java.util.Arrays.equals(this.foreign, other.getForeign()))) &&
												((this.notFound==null && other.getNotFound()==null) || 
														(this.notFound!=null &&
														java.util.Arrays.equals(this.notFound, other.getNotFound())));
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
		if (getClusterName() != null) {
			_hashCode += getClusterName().hashCode();
		}
		if (getOnCluster() != null) {
			for (int i=0;
					i<java.lang.reflect.Array.getLength(getOnCluster());
					i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getOnCluster(), i);
				if (obj != null &&
						!obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getNotOnCluster() != null) {
			for (int i=0;
					i<java.lang.reflect.Array.getLength(getNotOnCluster());
					i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getNotOnCluster(), i);
				if (obj != null &&
						!obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getForeign() != null) {
			for (int i=0;
					i<java.lang.reflect.Array.getLength(getForeign());
					i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getForeign(), i);
				if (obj != null &&
						!obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getNotFound() != null) {
			for (int i=0;
					i<java.lang.reflect.Array.getLength(getNotFound());
					i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getNotFound(), i);
				if (obj != null &&
						!obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(WUCopyLogicalClusterFileSections.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalClusterFileSections"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("clusterName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("onCluster");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "OnCluster"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("notOnCluster");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NotOnCluster"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("foreign");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Foreign"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("notFound");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NotFound"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo"));
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
