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
 * DFUPart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUPart  implements java.io.Serializable {
	private java.lang.Integer id;

	private java.lang.Integer copy;

	private java.lang.String actualSize;

	private java.lang.String ip;

	private java.lang.String partsize;

	public DFUPart() {
	}

	public DFUPart(
			java.lang.Integer id,
			java.lang.Integer copy,
			java.lang.String actualSize,
			java.lang.String ip,
			java.lang.String partsize) {
		this.id = id;
		this.copy = copy;
		this.actualSize = actualSize;
		this.ip = ip;
		this.partsize = partsize;
	}


	/**
	 * Gets the id value for this DFUPart.
	 * 
	 * @return id
	 */
	 public java.lang.Integer getId() {
		 return id;
	 }


	 /**
	  * Sets the id value for this DFUPart.
	  * 
	  * @param id
	  */
	 public void setId(java.lang.Integer id) {
		 this.id = id;
	 }


	 /**
	  * Gets the copy value for this DFUPart.
	  * 
	  * @return copy
	  */
	 public java.lang.Integer getCopy() {
		 return copy;
	 }


	 /**
	  * Sets the copy value for this DFUPart.
	  * 
	  * @param copy
	  */
	 public void setCopy(java.lang.Integer copy) {
		 this.copy = copy;
	 }


	 /**
	  * Gets the actualSize value for this DFUPart.
	  * 
	  * @return actualSize
	  */
	 public java.lang.String getActualSize() {
		 return actualSize;
	 }


	 /**
	  * Sets the actualSize value for this DFUPart.
	  * 
	  * @param actualSize
	  */
	 public void setActualSize(java.lang.String actualSize) {
		 this.actualSize = actualSize;
	 }


	 /**
	  * Gets the ip value for this DFUPart.
	  * 
	  * @return ip
	  */
	 public java.lang.String getIp() {
		 return ip;
	 }


	 /**
	  * Sets the ip value for this DFUPart.
	  * 
	  * @param ip
	  */
	 public void setIp(java.lang.String ip) {
		 this.ip = ip;
	 }


	 /**
	  * Gets the partsize value for this DFUPart.
	  * 
	  * @return partsize
	  */
	 public java.lang.String getPartsize() {
		 return partsize;
	 }


	 /**
	  * Sets the partsize value for this DFUPart.
	  * 
	  * @param partsize
	  */
	 public void setPartsize(java.lang.String partsize) {
		 this.partsize = partsize;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DFUPart)) {
			return false;
		}
		 DFUPart other = (DFUPart) obj;
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
				 ((this.id==null && other.getId()==null) || 
						 (this.id!=null &&
						 this.id.equals(other.getId()))) &&
						 ((this.copy==null && other.getCopy()==null) || 
								 (this.copy!=null &&
								 this.copy.equals(other.getCopy()))) &&
								 ((this.actualSize==null && other.getActualSize()==null) || 
										 (this.actualSize!=null &&
										 this.actualSize.equals(other.getActualSize()))) &&
										 ((this.ip==null && other.getIp()==null) || 
												 (this.ip!=null &&
												 this.ip.equals(other.getIp()))) &&
												 ((this.partsize==null && other.getPartsize()==null) || 
														 (this.partsize!=null &&
														 this.partsize.equals(other.getPartsize())));
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
		 if (getId() != null) {
			 _hashCode += getId().hashCode();
		 }
		 if (getCopy() != null) {
			 _hashCode += getCopy().hashCode();
		 }
		 if (getActualSize() != null) {
			 _hashCode += getActualSize().hashCode();
		 }
		 if (getIp() != null) {
			 _hashCode += getIp().hashCode();
		 }
		 if (getPartsize() != null) {
			 _hashCode += getPartsize().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(DFUPart.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPart"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("id");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Id"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("copy");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Copy"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("actualSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ActualSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("ip");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Ip"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("partsize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Partsize"));
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
