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
 * WUAddLocalFileToWorkunit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUAddLocalFileToWorkunit  implements java.io.Serializable {
	private java.lang.String wuid;

	private java.lang.String name;

	private java.lang.String val;

	private java.lang.String defVal;

	private java.lang.Integer type;

	private java.lang.Integer length;

	public WUAddLocalFileToWorkunit() {
	}

	public WUAddLocalFileToWorkunit(
			java.lang.String wuid,
			java.lang.String name,
			java.lang.String val,
			java.lang.String defVal,
			java.lang.Integer type,
			java.lang.Integer length) {
		this.wuid = wuid;
		this.name = name;
		this.val = val;
		this.defVal = defVal;
		this.type = type;
		this.length = length;
	}


	/**
	 * Gets the wuid value for this WUAddLocalFileToWorkunit.
	 * 
	 * @return wuid
	 */
	 public java.lang.String getWuid() {
		 return wuid;
	 }


	 /**
	  * Sets the wuid value for this WUAddLocalFileToWorkunit.
	  * 
	  * @param wuid
	  */
	 public void setWuid(java.lang.String wuid) {
		 this.wuid = wuid;
	 }


	 /**
	  * Gets the name value for this WUAddLocalFileToWorkunit.
	  * 
	  * @return name
	  */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this WUAddLocalFileToWorkunit.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the val value for this WUAddLocalFileToWorkunit.
	  * 
	  * @return val
	  */
	 public java.lang.String getVal() {
		 return val;
	 }


	 /**
	  * Sets the val value for this WUAddLocalFileToWorkunit.
	  * 
	  * @param val
	  */
	 public void setVal(java.lang.String val) {
		 this.val = val;
	 }


	 /**
	  * Gets the defVal value for this WUAddLocalFileToWorkunit.
	  * 
	  * @return defVal
	  */
	 public java.lang.String getDefVal() {
		 return defVal;
	 }


	 /**
	  * Sets the defVal value for this WUAddLocalFileToWorkunit.
	  * 
	  * @param defVal
	  */
	 public void setDefVal(java.lang.String defVal) {
		 this.defVal = defVal;
	 }


	 /**
	  * Gets the type value for this WUAddLocalFileToWorkunit.
	  * 
	  * @return type
	  */
	 public java.lang.Integer getType() {
		 return type;
	 }


	 /**
	  * Sets the type value for this WUAddLocalFileToWorkunit.
	  * 
	  * @param type
	  */
	 public void setType(java.lang.Integer type) {
		 this.type = type;
	 }


	 /**
	  * Gets the length value for this WUAddLocalFileToWorkunit.
	  * 
	  * @return length
	  */
	 public java.lang.Integer getLength() {
		 return length;
	 }


	 /**
	  * Sets the length value for this WUAddLocalFileToWorkunit.
	  * 
	  * @param length
	  */
	 public void setLength(java.lang.Integer length) {
		 this.length = length;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof WUAddLocalFileToWorkunit)) {
			return false;
		}
		 WUAddLocalFileToWorkunit other = (WUAddLocalFileToWorkunit) obj;
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
						 ((this.name==null && other.getName()==null) || 
								 (this.name!=null &&
								 this.name.equals(other.getName()))) &&
								 ((this.val==null && other.getVal()==null) || 
										 (this.val!=null &&
										 this.val.equals(other.getVal()))) &&
										 ((this.defVal==null && other.getDefVal()==null) || 
												 (this.defVal!=null &&
												 this.defVal.equals(other.getDefVal()))) &&
												 ((this.type==null && other.getType()==null) || 
														 (this.type!=null &&
														 this.type.equals(other.getType()))) &&
														 ((this.length==null && other.getLength()==null) || 
																 (this.length!=null &&
																 this.length.equals(other.getLength())));
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
		 if (getName() != null) {
			 _hashCode += getName().hashCode();
		 }
		 if (getVal() != null) {
			 _hashCode += getVal().hashCode();
		 }
		 if (getDefVal() != null) {
			 _hashCode += getDefVal().hashCode();
		 }
		 if (getType() != null) {
			 _hashCode += getType().hashCode();
		 }
		 if (getLength() != null) {
			 _hashCode += getLength().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(WUAddLocalFileToWorkunit.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAddLocalFileToWorkunit"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wuid");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
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
		 elemField.setFieldName("val");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Val"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("defVal");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DefVal"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("type");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Type"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("length");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Length"));
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
