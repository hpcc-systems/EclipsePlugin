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
 * ECLTimingData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class ECLTimingData  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.Integer graphNum;

	private java.lang.Integer subGraphNum;

	private java.lang.Integer GID;

	private java.lang.Integer min;

	private java.lang.Integer MS;

	public ECLTimingData() {
	}

	public ECLTimingData(
			java.lang.String name,
			java.lang.Integer graphNum,
			java.lang.Integer subGraphNum,
			java.lang.Integer GID,
			java.lang.Integer min,
			java.lang.Integer MS) {
		this.name = name;
		this.graphNum = graphNum;
		this.subGraphNum = subGraphNum;
		this.GID = GID;
		this.min = min;
		this.MS = MS;
	}


	/**
	 * Gets the name value for this ECLTimingData.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this ECLTimingData.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the graphNum value for this ECLTimingData.
	  * 
	  * @return graphNum
	  */
	 public java.lang.Integer getGraphNum() {
		 return graphNum;
	 }


	 /**
	  * Sets the graphNum value for this ECLTimingData.
	  * 
	  * @param graphNum
	  */
	 public void setGraphNum(java.lang.Integer graphNum) {
		 this.graphNum = graphNum;
	 }


	 /**
	  * Gets the subGraphNum value for this ECLTimingData.
	  * 
	  * @return subGraphNum
	  */
	 public java.lang.Integer getSubGraphNum() {
		 return subGraphNum;
	 }


	 /**
	  * Sets the subGraphNum value for this ECLTimingData.
	  * 
	  * @param subGraphNum
	  */
	 public void setSubGraphNum(java.lang.Integer subGraphNum) {
		 this.subGraphNum = subGraphNum;
	 }


	 /**
	  * Gets the GID value for this ECLTimingData.
	  * 
	  * @return GID
	  */
	 public java.lang.Integer getGID() {
		 return GID;
	 }


	 /**
	  * Sets the GID value for this ECLTimingData.
	  * 
	  * @param GID
	  */
	 public void setGID(java.lang.Integer GID) {
		 this.GID = GID;
	 }


	 /**
	  * Gets the min value for this ECLTimingData.
	  * 
	  * @return min
	  */
	 public java.lang.Integer getMin() {
		 return min;
	 }


	 /**
	  * Sets the min value for this ECLTimingData.
	  * 
	  * @param min
	  */
	 public void setMin(java.lang.Integer min) {
		 this.min = min;
	 }


	 /**
	  * Gets the MS value for this ECLTimingData.
	  * 
	  * @return MS
	  */
	 public java.lang.Integer getMS() {
		 return MS;
	 }


	 /**
	  * Sets the MS value for this ECLTimingData.
	  * 
	  * @param MS
	  */
	 public void setMS(java.lang.Integer MS) {
		 this.MS = MS;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof ECLTimingData)) return false;
		 ECLTimingData other = (ECLTimingData) obj;
		 if (obj == null) return false;
		 if (this == obj) return true;
		 if (__equalsCalc != null) {
			 return (__equalsCalc == obj);
		 }
		 __equalsCalc = obj;
		 boolean _equals;
		 _equals = true && 
				 ((this.name==null && other.getName()==null) || 
						 (this.name!=null &&
						 this.name.equals(other.getName()))) &&
						 ((this.graphNum==null && other.getGraphNum()==null) || 
								 (this.graphNum!=null &&
								 this.graphNum.equals(other.getGraphNum()))) &&
								 ((this.subGraphNum==null && other.getSubGraphNum()==null) || 
										 (this.subGraphNum!=null &&
										 this.subGraphNum.equals(other.getSubGraphNum()))) &&
										 ((this.GID==null && other.getGID()==null) || 
												 (this.GID!=null &&
												 this.GID.equals(other.getGID()))) &&
												 ((this.min==null && other.getMin()==null) || 
														 (this.min!=null &&
														 this.min.equals(other.getMin()))) &&
														 ((this.MS==null && other.getMS()==null) || 
																 (this.MS!=null &&
																 this.MS.equals(other.getMS())));
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
		 if (getGraphNum() != null) {
			 _hashCode += getGraphNum().hashCode();
		 }
		 if (getSubGraphNum() != null) {
			 _hashCode += getSubGraphNum().hashCode();
		 }
		 if (getGID() != null) {
			 _hashCode += getGID().hashCode();
		 }
		 if (getMin() != null) {
			 _hashCode += getMin().hashCode();
		 }
		 if (getMS() != null) {
			 _hashCode += getMS().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(ECLTimingData.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimingData"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("graphNum");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphNum"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("subGraphNum");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SubGraphNum"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("GID");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GID"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("min");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Min"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("MS");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MS"));
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
