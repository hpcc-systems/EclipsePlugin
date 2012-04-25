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
 * AddRemoteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class AddRemoteRequest  implements java.io.Serializable {
	private java.lang.String dstname;

	private java.lang.String srcname;

	private java.lang.String srcdali;

	private java.lang.String srcusername;

	private java.lang.String srcpassword;

	public AddRemoteRequest() {
	}

	public AddRemoteRequest(
			java.lang.String dstname,
			java.lang.String srcname,
			java.lang.String srcdali,
			java.lang.String srcusername,
			java.lang.String srcpassword) {
		this.dstname = dstname;
		this.srcname = srcname;
		this.srcdali = srcdali;
		this.srcusername = srcusername;
		this.srcpassword = srcpassword;
	}


	/**
	 * Gets the dstname value for this AddRemoteRequest.
	 * 
	 * @return dstname
	 */
	 public java.lang.String getDstname() {
		 return dstname;
	 }


	 /**
	  * Sets the dstname value for this AddRemoteRequest.
	  * 
	  * @param dstname
	  */
	 public void setDstname(java.lang.String dstname) {
		 this.dstname = dstname;
	 }


	 /**
	  * Gets the srcname value for this AddRemoteRequest.
	  * 
	  * @return srcname
	  */
	 public java.lang.String getSrcname() {
		 return srcname;
	 }


	 /**
	  * Sets the srcname value for this AddRemoteRequest.
	  * 
	  * @param srcname
	  */
	 public void setSrcname(java.lang.String srcname) {
		 this.srcname = srcname;
	 }


	 /**
	  * Gets the srcdali value for this AddRemoteRequest.
	  * 
	  * @return srcdali
	  */
	 public java.lang.String getSrcdali() {
		 return srcdali;
	 }


	 /**
	  * Sets the srcdali value for this AddRemoteRequest.
	  * 
	  * @param srcdali
	  */
	 public void setSrcdali(java.lang.String srcdali) {
		 this.srcdali = srcdali;
	 }


	 /**
	  * Gets the srcusername value for this AddRemoteRequest.
	  * 
	  * @return srcusername
	  */
	 public java.lang.String getSrcusername() {
		 return srcusername;
	 }


	 /**
	  * Sets the srcusername value for this AddRemoteRequest.
	  * 
	  * @param srcusername
	  */
	 public void setSrcusername(java.lang.String srcusername) {
		 this.srcusername = srcusername;
	 }


	 /**
	  * Gets the srcpassword value for this AddRemoteRequest.
	  * 
	  * @return srcpassword
	  */
	 public java.lang.String getSrcpassword() {
		 return srcpassword;
	 }


	 /**
	  * Sets the srcpassword value for this AddRemoteRequest.
	  * 
	  * @param srcpassword
	  */
	 public void setSrcpassword(java.lang.String srcpassword) {
		 this.srcpassword = srcpassword;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof AddRemoteRequest)) {
			return false;
		}
		 AddRemoteRequest other = (AddRemoteRequest) obj;
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
				 ((this.dstname==null && other.getDstname()==null) || 
						 (this.dstname!=null &&
						 this.dstname.equals(other.getDstname()))) &&
						 ((this.srcname==null && other.getSrcname()==null) || 
								 (this.srcname!=null &&
								 this.srcname.equals(other.getSrcname()))) &&
								 ((this.srcdali==null && other.getSrcdali()==null) || 
										 (this.srcdali!=null &&
										 this.srcdali.equals(other.getSrcdali()))) &&
										 ((this.srcusername==null && other.getSrcusername()==null) || 
												 (this.srcusername!=null &&
												 this.srcusername.equals(other.getSrcusername()))) &&
												 ((this.srcpassword==null && other.getSrcpassword()==null) || 
														 (this.srcpassword!=null &&
														 this.srcpassword.equals(other.getSrcpassword())));
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
		 if (getDstname() != null) {
			 _hashCode += getDstname().hashCode();
		 }
		 if (getSrcname() != null) {
			 _hashCode += getSrcname().hashCode();
		 }
		 if (getSrcdali() != null) {
			 _hashCode += getSrcdali().hashCode();
		 }
		 if (getSrcusername() != null) {
			 _hashCode += getSrcusername().hashCode();
		 }
		 if (getSrcpassword() != null) {
			 _hashCode += getSrcpassword().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(AddRemoteRequest.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddRemoteRequest"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("dstname");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dstname"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("srcname");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "srcname"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("srcdali");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "srcdali"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("srcusername");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "srcusername"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("srcpassword");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "srcpassword"));
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
