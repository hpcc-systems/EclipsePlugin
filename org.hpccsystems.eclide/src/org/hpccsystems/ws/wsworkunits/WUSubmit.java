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
 * WUSubmit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUSubmit  implements java.io.Serializable {
	private java.lang.String wuid;

	private java.lang.String cluster;

	private java.lang.String queue;

	private java.lang.String snapshot;

	private java.lang.Integer maxRunTime;

	private java.lang.Integer blockTillFinishTimer;

	private java.lang.Boolean syntaxCheck;

	private java.lang.Boolean notifyCluster;

	public WUSubmit() {
	}

	public WUSubmit(
			java.lang.String wuid,
			java.lang.String cluster,
			java.lang.String queue,
			java.lang.String snapshot,
			java.lang.Integer maxRunTime,
			java.lang.Integer blockTillFinishTimer,
			java.lang.Boolean syntaxCheck,
			java.lang.Boolean notifyCluster) {
		this.wuid = wuid;
		this.cluster = cluster;
		this.queue = queue;
		this.snapshot = snapshot;
		this.maxRunTime = maxRunTime;
		this.blockTillFinishTimer = blockTillFinishTimer;
		this.syntaxCheck = syntaxCheck;
		this.notifyCluster = notifyCluster;
	}


	/**
	 * Gets the wuid value for this WUSubmit.
	 * 
	 * @return wuid
	 */
	 public java.lang.String getWuid() {
		 return wuid;
	 }


	/**
	 * Sets the wuid value for this WUSubmit.
	 * 
	 * @param wuid
	 */
	 public void setWuid(java.lang.String wuid) {
		 this.wuid = wuid;
	 }


	 /**
	  * Gets the cluster value for this WUSubmit.
	  * 
	  * @return cluster
	  */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this WUSubmit.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the queue value for this WUSubmit.
	  * 
	  * @return queue
	  */
	 public java.lang.String getQueue() {
		 return queue;
	 }


	 /**
	  * Sets the queue value for this WUSubmit.
	  * 
	  * @param queue
	  */
	 public void setQueue(java.lang.String queue) {
		 this.queue = queue;
	 }


	 /**
	  * Gets the snapshot value for this WUSubmit.
	  * 
	  * @return snapshot
	  */
	 public java.lang.String getSnapshot() {
		 return snapshot;
	 }


	 /**
	  * Sets the snapshot value for this WUSubmit.
	  * 
	  * @param snapshot
	  */
	 public void setSnapshot(java.lang.String snapshot) {
		 this.snapshot = snapshot;
	 }


	 /**
	  * Gets the maxRunTime value for this WUSubmit.
	  * 
	  * @return maxRunTime
	  */
	 public java.lang.Integer getMaxRunTime() {
		 return maxRunTime;
	 }


	 /**
	  * Sets the maxRunTime value for this WUSubmit.
	  * 
	  * @param maxRunTime
	  */
	 public void setMaxRunTime(java.lang.Integer maxRunTime) {
		 this.maxRunTime = maxRunTime;
	 }


	 /**
	  * Gets the blockTillFinishTimer value for this WUSubmit.
	  * 
	  * @return blockTillFinishTimer
	  */
	 public java.lang.Integer getBlockTillFinishTimer() {
		 return blockTillFinishTimer;
	 }


	 /**
	  * Sets the blockTillFinishTimer value for this WUSubmit.
	  * 
	  * @param blockTillFinishTimer
	  */
	 public void setBlockTillFinishTimer(java.lang.Integer blockTillFinishTimer) {
		 this.blockTillFinishTimer = blockTillFinishTimer;
	 }


	 /**
	  * Gets the syntaxCheck value for this WUSubmit.
	  * 
	  * @return syntaxCheck
	  */
	 public java.lang.Boolean getSyntaxCheck() {
		 return syntaxCheck;
	 }


	 /**
	  * Sets the syntaxCheck value for this WUSubmit.
	  * 
	  * @param syntaxCheck
	  */
	 public void setSyntaxCheck(java.lang.Boolean syntaxCheck) {
		 this.syntaxCheck = syntaxCheck;
	 }


	 /**
	  * Gets the notifyCluster value for this WUSubmit.
	  * 
	  * @return notifyCluster
	  */
	 public java.lang.Boolean getNotifyCluster() {
		 return notifyCluster;
	 }


	 /**
	  * Sets the notifyCluster value for this WUSubmit.
	  * 
	  * @param notifyCluster
	  */
	 public void setNotifyCluster(java.lang.Boolean notifyCluster) {
		 this.notifyCluster = notifyCluster;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof WUSubmit)) {
			return false;
		}
		 WUSubmit other = (WUSubmit) obj;
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
						 ((this.cluster==null && other.getCluster()==null) || 
								 (this.cluster!=null &&
								 this.cluster.equals(other.getCluster()))) &&
								 ((this.queue==null && other.getQueue()==null) || 
										 (this.queue!=null &&
										 this.queue.equals(other.getQueue()))) &&
										 ((this.snapshot==null && other.getSnapshot()==null) || 
												 (this.snapshot!=null &&
												 this.snapshot.equals(other.getSnapshot()))) &&
												 ((this.maxRunTime==null && other.getMaxRunTime()==null) || 
														 (this.maxRunTime!=null &&
														 this.maxRunTime.equals(other.getMaxRunTime()))) &&
														 ((this.blockTillFinishTimer==null && other.getBlockTillFinishTimer()==null) || 
																 (this.blockTillFinishTimer!=null &&
																 this.blockTillFinishTimer.equals(other.getBlockTillFinishTimer()))) &&
																 ((this.syntaxCheck==null && other.getSyntaxCheck()==null) || 
																		 (this.syntaxCheck!=null &&
																		 this.syntaxCheck.equals(other.getSyntaxCheck()))) &&
																		 ((this.notifyCluster==null && other.getNotifyCluster()==null) || 
																				 (this.notifyCluster!=null &&
																				 this.notifyCluster.equals(other.getNotifyCluster())));
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
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getQueue() != null) {
			 _hashCode += getQueue().hashCode();
		 }
		 if (getSnapshot() != null) {
			 _hashCode += getSnapshot().hashCode();
		 }
		 if (getMaxRunTime() != null) {
			 _hashCode += getMaxRunTime().hashCode();
		 }
		 if (getBlockTillFinishTimer() != null) {
			 _hashCode += getBlockTillFinishTimer().hashCode();
		 }
		 if (getSyntaxCheck() != null) {
			 _hashCode += getSyntaxCheck().hashCode();
		 }
		 if (getNotifyCluster() != null) {
			 _hashCode += getNotifyCluster().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(WUSubmit.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSubmit"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wuid");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
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
		 elemField.setFieldName("queue");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Queue"));
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
		 elemField.setFieldName("maxRunTime");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MaxRunTime"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("blockTillFinishTimer");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BlockTillFinishTimer"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("syntaxCheck");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SyntaxCheck"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("notifyCluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NotifyCluster"));
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
