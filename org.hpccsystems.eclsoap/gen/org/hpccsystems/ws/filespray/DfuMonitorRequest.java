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
 * DfuMonitorRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class DfuMonitorRequest  implements java.io.Serializable {
	private java.lang.String eventName;

	private java.lang.String logicalName;

	private java.lang.String ip;

	private java.lang.String filename;

	private java.lang.Boolean sub;

	private java.lang.Integer shotLimit;

	public DfuMonitorRequest() {
	}

	public DfuMonitorRequest(
			java.lang.String eventName,
			java.lang.String logicalName,
			java.lang.String ip,
			java.lang.String filename,
			java.lang.Boolean sub,
			java.lang.Integer shotLimit) {
		this.eventName = eventName;
		this.logicalName = logicalName;
		this.ip = ip;
		this.filename = filename;
		this.sub = sub;
		this.shotLimit = shotLimit;
	}


	/**
	 * Gets the eventName value for this DfuMonitorRequest.
	 * 
	 * @return eventName
	 */
	 public java.lang.String getEventName() {
		 return eventName;
	 }


	 /**
	  * Sets the eventName value for this DfuMonitorRequest.
	  * 
	  * @param eventName
	  */
	 public void setEventName(java.lang.String eventName) {
		 this.eventName = eventName;
	 }


	 /**
	  * Gets the logicalName value for this DfuMonitorRequest.
	  * 
	  * @return logicalName
	  */
	 public java.lang.String getLogicalName() {
		 return logicalName;
	 }


	 /**
	  * Sets the logicalName value for this DfuMonitorRequest.
	  * 
	  * @param logicalName
	  */
	 public void setLogicalName(java.lang.String logicalName) {
		 this.logicalName = logicalName;
	 }


	 /**
	  * Gets the ip value for this DfuMonitorRequest.
	  * 
	  * @return ip
	  */
	 public java.lang.String getIp() {
		 return ip;
	 }


	 /**
	  * Sets the ip value for this DfuMonitorRequest.
	  * 
	  * @param ip
	  */
	 public void setIp(java.lang.String ip) {
		 this.ip = ip;
	 }


	 /**
	  * Gets the filename value for this DfuMonitorRequest.
	  * 
	  * @return filename
	  */
	 public java.lang.String getFilename() {
		 return filename;
	 }


	 /**
	  * Sets the filename value for this DfuMonitorRequest.
	  * 
	  * @param filename
	  */
	 public void setFilename(java.lang.String filename) {
		 this.filename = filename;
	 }


	 /**
	  * Gets the sub value for this DfuMonitorRequest.
	  * 
	  * @return sub
	  */
	 public java.lang.Boolean getSub() {
		 return sub;
	 }


	 /**
	  * Sets the sub value for this DfuMonitorRequest.
	  * 
	  * @param sub
	  */
	 public void setSub(java.lang.Boolean sub) {
		 this.sub = sub;
	 }


	 /**
	  * Gets the shotLimit value for this DfuMonitorRequest.
	  * 
	  * @return shotLimit
	  */
	 public java.lang.Integer getShotLimit() {
		 return shotLimit;
	 }


	 /**
	  * Sets the shotLimit value for this DfuMonitorRequest.
	  * 
	  * @param shotLimit
	  */
	 public void setShotLimit(java.lang.Integer shotLimit) {
		 this.shotLimit = shotLimit;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DfuMonitorRequest)) {
			return false;
		}
		 DfuMonitorRequest other = (DfuMonitorRequest) obj;
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
				 ((this.eventName==null && other.getEventName()==null) || 
						 (this.eventName!=null &&
						 this.eventName.equals(other.getEventName()))) &&
						 ((this.logicalName==null && other.getLogicalName()==null) || 
								 (this.logicalName!=null &&
								 this.logicalName.equals(other.getLogicalName()))) &&
								 ((this.ip==null && other.getIp()==null) || 
										 (this.ip!=null &&
										 this.ip.equals(other.getIp()))) &&
										 ((this.filename==null && other.getFilename()==null) || 
												 (this.filename!=null &&
												 this.filename.equals(other.getFilename()))) &&
												 ((this.sub==null && other.getSub()==null) || 
														 (this.sub!=null &&
														 this.sub.equals(other.getSub()))) &&
														 ((this.shotLimit==null && other.getShotLimit()==null) || 
																 (this.shotLimit!=null &&
																 this.shotLimit.equals(other.getShotLimit())));
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
		 if (getEventName() != null) {
			 _hashCode += getEventName().hashCode();
		 }
		 if (getLogicalName() != null) {
			 _hashCode += getLogicalName().hashCode();
		 }
		 if (getIp() != null) {
			 _hashCode += getIp().hashCode();
		 }
		 if (getFilename() != null) {
			 _hashCode += getFilename().hashCode();
		 }
		 if (getSub() != null) {
			 _hashCode += getSub().hashCode();
		 }
		 if (getShotLimit() != null) {
			 _hashCode += getShotLimit().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(DfuMonitorRequest.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DfuMonitorRequest"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("eventName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "EventName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("logicalName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "LogicalName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("ip");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Ip"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("filename");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Filename"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sub");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Sub"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("shotLimit");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ShotLimit"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
