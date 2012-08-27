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
 * WUSyntaxCheckECL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUSyntaxCheckECL  implements java.io.Serializable {
	private java.lang.String ECL;

	private java.lang.String moduleName;

	private java.lang.String attributeName;

	private java.lang.String queue;

	private java.lang.String cluster;

	private java.lang.String snapshot;

	private java.lang.Integer timeToWait;

	private org.hpccsystems.ws.wsworkunits.DebugValue[] debugValues;

	public WUSyntaxCheckECL() {
	}

	public WUSyntaxCheckECL(
			java.lang.String ECL,
			java.lang.String moduleName,
			java.lang.String attributeName,
			java.lang.String queue,
			java.lang.String cluster,
			java.lang.String snapshot,
			java.lang.Integer timeToWait,
			org.hpccsystems.ws.wsworkunits.DebugValue[] debugValues) {
		this.ECL = ECL;
		this.moduleName = moduleName;
		this.attributeName = attributeName;
		this.queue = queue;
		this.cluster = cluster;
		this.snapshot = snapshot;
		this.timeToWait = timeToWait;
		this.debugValues = debugValues;
	}


	/**
	 * Gets the ECL value for this WUSyntaxCheckECL.
	 * 
	 * @return ECL
	 */
	 public java.lang.String getECL() {
		 return ECL;
	 }


	/**
	 * Sets the ECL value for this WUSyntaxCheckECL.
	 * 
	 * @param ECL
	 */
	 public void setECL(java.lang.String ECL) {
		 this.ECL = ECL;
	 }


	 /**
	  * Gets the moduleName value for this WUSyntaxCheckECL.
	  * 
	  * @return moduleName
	  */
	 public java.lang.String getModuleName() {
		 return moduleName;
	 }


	 /**
	  * Sets the moduleName value for this WUSyntaxCheckECL.
	  * 
	  * @param moduleName
	  */
	 public void setModuleName(java.lang.String moduleName) {
		 this.moduleName = moduleName;
	 }


	 /**
	  * Gets the attributeName value for this WUSyntaxCheckECL.
	  * 
	  * @return attributeName
	  */
	 public java.lang.String getAttributeName() {
		 return attributeName;
	 }


	 /**
	  * Sets the attributeName value for this WUSyntaxCheckECL.
	  * 
	  * @param attributeName
	  */
	 public void setAttributeName(java.lang.String attributeName) {
		 this.attributeName = attributeName;
	 }


	 /**
	  * Gets the queue value for this WUSyntaxCheckECL.
	  * 
	  * @return queue
	  */
	 public java.lang.String getQueue() {
		 return queue;
	 }


	 /**
	  * Sets the queue value for this WUSyntaxCheckECL.
	  * 
	  * @param queue
	  */
	 public void setQueue(java.lang.String queue) {
		 this.queue = queue;
	 }


	 /**
	  * Gets the cluster value for this WUSyntaxCheckECL.
	  * 
	  * @return cluster
	  */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this WUSyntaxCheckECL.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the snapshot value for this WUSyntaxCheckECL.
	  * 
	  * @return snapshot
	  */
	 public java.lang.String getSnapshot() {
		 return snapshot;
	 }


	 /**
	  * Sets the snapshot value for this WUSyntaxCheckECL.
	  * 
	  * @param snapshot
	  */
	 public void setSnapshot(java.lang.String snapshot) {
		 this.snapshot = snapshot;
	 }


	 /**
	  * Gets the timeToWait value for this WUSyntaxCheckECL.
	  * 
	  * @return timeToWait
	  */
	 public java.lang.Integer getTimeToWait() {
		 return timeToWait;
	 }


	 /**
	  * Sets the timeToWait value for this WUSyntaxCheckECL.
	  * 
	  * @param timeToWait
	  */
	 public void setTimeToWait(java.lang.Integer timeToWait) {
		 this.timeToWait = timeToWait;
	 }


	 /**
	  * Gets the debugValues value for this WUSyntaxCheckECL.
	  * 
	  * @return debugValues
	  */
	 public org.hpccsystems.ws.wsworkunits.DebugValue[] getDebugValues() {
		 return debugValues;
	 }


	 /**
	  * Sets the debugValues value for this WUSyntaxCheckECL.
	  * 
	  * @param debugValues
	  */
	 public void setDebugValues(org.hpccsystems.ws.wsworkunits.DebugValue[] debugValues) {
		 this.debugValues = debugValues;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof WUSyntaxCheckECL)) {
			return false;
		}
		 WUSyntaxCheckECL other = (WUSyntaxCheckECL) obj;
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
				 ((this.ECL==null && other.getECL()==null) || 
						 (this.ECL!=null &&
						 this.ECL.equals(other.getECL()))) &&
						 ((this.moduleName==null && other.getModuleName()==null) || 
								 (this.moduleName!=null &&
								 this.moduleName.equals(other.getModuleName()))) &&
								 ((this.attributeName==null && other.getAttributeName()==null) || 
										 (this.attributeName!=null &&
										 this.attributeName.equals(other.getAttributeName()))) &&
										 ((this.queue==null && other.getQueue()==null) || 
												 (this.queue!=null &&
												 this.queue.equals(other.getQueue()))) &&
												 ((this.cluster==null && other.getCluster()==null) || 
														 (this.cluster!=null &&
														 this.cluster.equals(other.getCluster()))) &&
														 ((this.snapshot==null && other.getSnapshot()==null) || 
																 (this.snapshot!=null &&
																 this.snapshot.equals(other.getSnapshot()))) &&
																 ((this.timeToWait==null && other.getTimeToWait()==null) || 
																		 (this.timeToWait!=null &&
																		 this.timeToWait.equals(other.getTimeToWait()))) &&
																		 ((this.debugValues==null && other.getDebugValues()==null) || 
																				 (this.debugValues!=null &&
																				 java.util.Arrays.equals(this.debugValues, other.getDebugValues())));
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
		 if (getECL() != null) {
			 _hashCode += getECL().hashCode();
		 }
		 if (getModuleName() != null) {
			 _hashCode += getModuleName().hashCode();
		 }
		 if (getAttributeName() != null) {
			 _hashCode += getAttributeName().hashCode();
		 }
		 if (getQueue() != null) {
			 _hashCode += getQueue().hashCode();
		 }
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getSnapshot() != null) {
			 _hashCode += getSnapshot().hashCode();
		 }
		 if (getTimeToWait() != null) {
			 _hashCode += getTimeToWait().hashCode();
		 }
		 if (getDebugValues() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDebugValues());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDebugValues(), i);
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
	 new org.apache.axis.description.TypeDesc(WUSyntaxCheckECL.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSyntaxCheckECL"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("ECL");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECL"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("moduleName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ModuleName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("attributeName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AttributeName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("queue");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Queue"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("cluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("snapshot");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Snapshot"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("timeToWait");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeToWait"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("debugValues");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValues"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue"));
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
