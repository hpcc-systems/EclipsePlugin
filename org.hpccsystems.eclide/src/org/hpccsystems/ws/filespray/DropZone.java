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
 * DropZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class DropZone  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String netAddress;

	private java.lang.String path;

	private java.lang.String computer;

	private java.lang.String linux;

	public DropZone() {
	}

	public DropZone(
			java.lang.String name,
			java.lang.String netAddress,
			java.lang.String path,
			java.lang.String computer,
			java.lang.String linux) {
		this.name = name;
		this.netAddress = netAddress;
		this.path = path;
		this.computer = computer;
		this.linux = linux;
	}


	/**
	 * Gets the name value for this DropZone.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this DropZone.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the netAddress value for this DropZone.
	  * 
	  * @return netAddress
	  */
	 public java.lang.String getNetAddress() {
		 return netAddress;
	 }


	 /**
	  * Sets the netAddress value for this DropZone.
	  * 
	  * @param netAddress
	  */
	 public void setNetAddress(java.lang.String netAddress) {
		 this.netAddress = netAddress;
	 }


	 /**
	  * Gets the path value for this DropZone.
	  * 
	  * @return path
	  */
	 public java.lang.String getPath() {
		 return path;
	 }


	 /**
	  * Sets the path value for this DropZone.
	  * 
	  * @param path
	  */
	 public void setPath(java.lang.String path) {
		 this.path = path;
	 }


	 /**
	  * Gets the computer value for this DropZone.
	  * 
	  * @return computer
	  */
	 public java.lang.String getComputer() {
		 return computer;
	 }


	 /**
	  * Sets the computer value for this DropZone.
	  * 
	  * @param computer
	  */
	 public void setComputer(java.lang.String computer) {
		 this.computer = computer;
	 }


	 /**
	  * Gets the linux value for this DropZone.
	  * 
	  * @return linux
	  */
	 public java.lang.String getLinux() {
		 return linux;
	 }


	 /**
	  * Sets the linux value for this DropZone.
	  * 
	  * @param linux
	  */
	 public void setLinux(java.lang.String linux) {
		 this.linux = linux;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DropZone)) return false;
		 DropZone other = (DropZone) obj;
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
						 ((this.netAddress==null && other.getNetAddress()==null) || 
								 (this.netAddress!=null &&
								 this.netAddress.equals(other.getNetAddress()))) &&
								 ((this.path==null && other.getPath()==null) || 
										 (this.path!=null &&
										 this.path.equals(other.getPath()))) &&
										 ((this.computer==null && other.getComputer()==null) || 
												 (this.computer!=null &&
												 this.computer.equals(other.getComputer()))) &&
												 ((this.linux==null && other.getLinux()==null) || 
														 (this.linux!=null &&
														 this.linux.equals(other.getLinux())));
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
		 if (getNetAddress() != null) {
			 _hashCode += getNetAddress().hashCode();
		 }
		 if (getPath() != null) {
			 _hashCode += getPath().hashCode();
		 }
		 if (getComputer() != null) {
			 _hashCode += getComputer().hashCode();
		 }
		 if (getLinux() != null) {
			 _hashCode += getLinux().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(DropZone.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DropZone"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("netAddress");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "NetAddress"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("path");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Path"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("computer");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Computer"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("linux");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Linux"));
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
