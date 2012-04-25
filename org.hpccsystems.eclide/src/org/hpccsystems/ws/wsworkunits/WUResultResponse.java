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
 * WUResultResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUResultResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions;

	private java.lang.String wuid;

	private java.lang.Integer sequence;

	private java.lang.String logicalName;

	private java.lang.String cluster;

	private java.lang.String name;

	private java.lang.Long start;

	private java.lang.Integer requested;

	private java.lang.Integer count;

	private java.lang.Long total;

	private java.lang.String result;

	public WUResultResponse() {
	}

	public WUResultResponse(
			org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions,
			java.lang.String wuid,
			java.lang.Integer sequence,
			java.lang.String logicalName,
			java.lang.String cluster,
			java.lang.String name,
			java.lang.Long start,
			java.lang.Integer requested,
			java.lang.Integer count,
			java.lang.Long total,
			java.lang.String result) {
		this.exceptions = exceptions;
		this.wuid = wuid;
		this.sequence = sequence;
		this.logicalName = logicalName;
		this.cluster = cluster;
		this.name = name;
		this.start = start;
		this.requested = requested;
		this.count = count;
		this.total = total;
		this.result = result;
	}


	/**
	 * Gets the exceptions value for this WUResultResponse.
	 * 
	 * @return exceptions
	 */
	 public org.hpccsystems.ws.wsworkunits.ArrayOfEspException getExceptions() {
		 return exceptions;
	 }


	/**
	 * Sets the exceptions value for this WUResultResponse.
	 * 
	 * @param exceptions
	 */
	 public void setExceptions(org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions) {
		 this.exceptions = exceptions;
	 }


	 /**
	  * Gets the wuid value for this WUResultResponse.
	  * 
	  * @return wuid
	  */
	 public java.lang.String getWuid() {
		 return wuid;
	 }


	 /**
	  * Sets the wuid value for this WUResultResponse.
	  * 
	  * @param wuid
	  */
	 public void setWuid(java.lang.String wuid) {
		 this.wuid = wuid;
	 }


	 /**
	  * Gets the sequence value for this WUResultResponse.
	  * 
	  * @return sequence
	  */
	 public java.lang.Integer getSequence() {
		 return sequence;
	 }


	 /**
	  * Sets the sequence value for this WUResultResponse.
	  * 
	  * @param sequence
	  */
	 public void setSequence(java.lang.Integer sequence) {
		 this.sequence = sequence;
	 }


	 /**
	  * Gets the logicalName value for this WUResultResponse.
	  * 
	  * @return logicalName
	  */
	 public java.lang.String getLogicalName() {
		 return logicalName;
	 }


	 /**
	  * Sets the logicalName value for this WUResultResponse.
	  * 
	  * @param logicalName
	  */
	 public void setLogicalName(java.lang.String logicalName) {
		 this.logicalName = logicalName;
	 }


	 /**
	  * Gets the cluster value for this WUResultResponse.
	  * 
	  * @return cluster
	  */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this WUResultResponse.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the name value for this WUResultResponse.
	  * 
	  * @return name
	  */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this WUResultResponse.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the start value for this WUResultResponse.
	  * 
	  * @return start
	  */
	 public java.lang.Long getStart() {
		 return start;
	 }


	 /**
	  * Sets the start value for this WUResultResponse.
	  * 
	  * @param start
	  */
	 public void setStart(java.lang.Long start) {
		 this.start = start;
	 }


	 /**
	  * Gets the requested value for this WUResultResponse.
	  * 
	  * @return requested
	  */
	 public java.lang.Integer getRequested() {
		 return requested;
	 }


	 /**
	  * Sets the requested value for this WUResultResponse.
	  * 
	  * @param requested
	  */
	 public void setRequested(java.lang.Integer requested) {
		 this.requested = requested;
	 }


	 /**
	  * Gets the count value for this WUResultResponse.
	  * 
	  * @return count
	  */
	 public java.lang.Integer getCount() {
		 return count;
	 }


	 /**
	  * Sets the count value for this WUResultResponse.
	  * 
	  * @param count
	  */
	 public void setCount(java.lang.Integer count) {
		 this.count = count;
	 }


	 /**
	  * Gets the total value for this WUResultResponse.
	  * 
	  * @return total
	  */
	 public java.lang.Long getTotal() {
		 return total;
	 }


	 /**
	  * Sets the total value for this WUResultResponse.
	  * 
	  * @param total
	  */
	 public void setTotal(java.lang.Long total) {
		 this.total = total;
	 }


	 /**
	  * Gets the result value for this WUResultResponse.
	  * 
	  * @return result
	  */
	 public java.lang.String getResult() {
		 return result;
	 }


	 /**
	  * Sets the result value for this WUResultResponse.
	  * 
	  * @param result
	  */
	 public void setResult(java.lang.String result) {
		 this.result = result;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof WUResultResponse)) return false;
		 WUResultResponse other = (WUResultResponse) obj;
		 if (obj == null) return false;
		 if (this == obj) return true;
		 if (__equalsCalc != null) {
			 return (__equalsCalc == obj);
		 }
		 __equalsCalc = obj;
		 boolean _equals;
		 _equals = true && 
				 ((this.exceptions==null && other.getExceptions()==null) || 
						 (this.exceptions!=null &&
						 this.exceptions.equals(other.getExceptions()))) &&
						 ((this.wuid==null && other.getWuid()==null) || 
								 (this.wuid!=null &&
								 this.wuid.equals(other.getWuid()))) &&
								 ((this.sequence==null && other.getSequence()==null) || 
										 (this.sequence!=null &&
										 this.sequence.equals(other.getSequence()))) &&
										 ((this.logicalName==null && other.getLogicalName()==null) || 
												 (this.logicalName!=null &&
												 this.logicalName.equals(other.getLogicalName()))) &&
												 ((this.cluster==null && other.getCluster()==null) || 
														 (this.cluster!=null &&
														 this.cluster.equals(other.getCluster()))) &&
														 ((this.name==null && other.getName()==null) || 
																 (this.name!=null &&
																 this.name.equals(other.getName()))) &&
																 ((this.start==null && other.getStart()==null) || 
																		 (this.start!=null &&
																		 this.start.equals(other.getStart()))) &&
																		 ((this.requested==null && other.getRequested()==null) || 
																				 (this.requested!=null &&
																				 this.requested.equals(other.getRequested()))) &&
																				 ((this.count==null && other.getCount()==null) || 
																						 (this.count!=null &&
																						 this.count.equals(other.getCount()))) &&
																						 ((this.total==null && other.getTotal()==null) || 
																								 (this.total!=null &&
																								 this.total.equals(other.getTotal()))) &&
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
		 if (getExceptions() != null) {
			 _hashCode += getExceptions().hashCode();
		 }
		 if (getWuid() != null) {
			 _hashCode += getWuid().hashCode();
		 }
		 if (getSequence() != null) {
			 _hashCode += getSequence().hashCode();
		 }
		 if (getLogicalName() != null) {
			 _hashCode += getLogicalName().hashCode();
		 }
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getName() != null) {
			 _hashCode += getName().hashCode();
		 }
		 if (getStart() != null) {
			 _hashCode += getStart().hashCode();
		 }
		 if (getRequested() != null) {
			 _hashCode += getRequested().hashCode();
		 }
		 if (getCount() != null) {
			 _hashCode += getCount().hashCode();
		 }
		 if (getTotal() != null) {
			 _hashCode += getTotal().hashCode();
		 }
		 if (getResult() != null) {
			 _hashCode += getResult().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(WUResultResponse.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultResponse"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("exceptions");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wuid");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sequence");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Sequence"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("logicalName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalName"));
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
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("start");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Start"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("requested");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Requested"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("count");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Count"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("total");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Total"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
