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
 * WUResultBin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUResultBin  implements java.io.Serializable {
	private java.lang.String logicalName;

	private java.lang.String wuid;

	private java.lang.String resultName;

	private java.lang.Integer sequence;

	private java.lang.String format;

	private java.lang.Long start;

	private java.lang.Integer count;

	public WUResultBin() {
	}

	public WUResultBin(
			java.lang.String logicalName,
			java.lang.String wuid,
			java.lang.String resultName,
			java.lang.Integer sequence,
			java.lang.String format,
			java.lang.Long start,
			java.lang.Integer count) {
		this.logicalName = logicalName;
		this.wuid = wuid;
		this.resultName = resultName;
		this.sequence = sequence;
		this.format = format;
		this.start = start;
		this.count = count;
	}


	/**
	 * Gets the logicalName value for this WUResultBin.
	 * 
	 * @return logicalName
	 */
	 public java.lang.String getLogicalName() {
		 return logicalName;
	 }


	 /**
	  * Sets the logicalName value for this WUResultBin.
	  * 
	  * @param logicalName
	  */
	 public void setLogicalName(java.lang.String logicalName) {
		 this.logicalName = logicalName;
	 }


	 /**
	  * Gets the wuid value for this WUResultBin.
	  * 
	  * @return wuid
	  */
	 public java.lang.String getWuid() {
		 return wuid;
	 }


	 /**
	  * Sets the wuid value for this WUResultBin.
	  * 
	  * @param wuid
	  */
	 public void setWuid(java.lang.String wuid) {
		 this.wuid = wuid;
	 }


	 /**
	  * Gets the resultName value for this WUResultBin.
	  * 
	  * @return resultName
	  */
	 public java.lang.String getResultName() {
		 return resultName;
	 }


	 /**
	  * Sets the resultName value for this WUResultBin.
	  * 
	  * @param resultName
	  */
	 public void setResultName(java.lang.String resultName) {
		 this.resultName = resultName;
	 }


	 /**
	  * Gets the sequence value for this WUResultBin.
	  * 
	  * @return sequence
	  */
	 public java.lang.Integer getSequence() {
		 return sequence;
	 }


	 /**
	  * Sets the sequence value for this WUResultBin.
	  * 
	  * @param sequence
	  */
	 public void setSequence(java.lang.Integer sequence) {
		 this.sequence = sequence;
	 }


	 /**
	  * Gets the format value for this WUResultBin.
	  * 
	  * @return format
	  */
	 public java.lang.String getFormat() {
		 return format;
	 }


	 /**
	  * Sets the format value for this WUResultBin.
	  * 
	  * @param format
	  */
	 public void setFormat(java.lang.String format) {
		 this.format = format;
	 }


	 /**
	  * Gets the start value for this WUResultBin.
	  * 
	  * @return start
	  */
	 public java.lang.Long getStart() {
		 return start;
	 }


	 /**
	  * Sets the start value for this WUResultBin.
	  * 
	  * @param start
	  */
	 public void setStart(java.lang.Long start) {
		 this.start = start;
	 }


	 /**
	  * Gets the count value for this WUResultBin.
	  * 
	  * @return count
	  */
	 public java.lang.Integer getCount() {
		 return count;
	 }


	 /**
	  * Sets the count value for this WUResultBin.
	  * 
	  * @param count
	  */
	 public void setCount(java.lang.Integer count) {
		 this.count = count;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof WUResultBin)) {
			return false;
		}
		 WUResultBin other = (WUResultBin) obj;
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
				 ((this.logicalName==null && other.getLogicalName()==null) || 
						 (this.logicalName!=null &&
						 this.logicalName.equals(other.getLogicalName()))) &&
						 ((this.wuid==null && other.getWuid()==null) || 
								 (this.wuid!=null &&
								 this.wuid.equals(other.getWuid()))) &&
								 ((this.resultName==null && other.getResultName()==null) || 
										 (this.resultName!=null &&
										 this.resultName.equals(other.getResultName()))) &&
										 ((this.sequence==null && other.getSequence()==null) || 
												 (this.sequence!=null &&
												 this.sequence.equals(other.getSequence()))) &&
												 ((this.format==null && other.getFormat()==null) || 
														 (this.format!=null &&
														 this.format.equals(other.getFormat()))) &&
														 ((this.start==null && other.getStart()==null) || 
																 (this.start!=null &&
																 this.start.equals(other.getStart()))) &&
																 ((this.count==null && other.getCount()==null) || 
																		 (this.count!=null &&
																		 this.count.equals(other.getCount())));
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
		 if (getLogicalName() != null) {
			 _hashCode += getLogicalName().hashCode();
		 }
		 if (getWuid() != null) {
			 _hashCode += getWuid().hashCode();
		 }
		 if (getResultName() != null) {
			 _hashCode += getResultName().hashCode();
		 }
		 if (getSequence() != null) {
			 _hashCode += getSequence().hashCode();
		 }
		 if (getFormat() != null) {
			 _hashCode += getFormat().hashCode();
		 }
		 if (getStart() != null) {
			 _hashCode += getStart().hashCode();
		 }
		 if (getCount() != null) {
			 _hashCode += getCount().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(WUResultBin.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultBin"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("logicalName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
		 elemField.setFieldName("resultName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultName"));
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
		 elemField.setFieldName("format");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Format"));
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
		 elemField.setFieldName("count");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Count"));
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
