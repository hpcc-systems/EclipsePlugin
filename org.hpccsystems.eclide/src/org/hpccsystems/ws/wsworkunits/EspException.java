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
 * EspException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class EspException  implements java.io.Serializable {
	private java.lang.String code;

	private java.lang.String audience;

	private java.lang.String source;

	private java.lang.String message;

	public EspException() {
	}

	public EspException(
			java.lang.String code,
			java.lang.String audience,
			java.lang.String source,
			java.lang.String message) {
		this.code = code;
		this.audience = audience;
		this.source = source;
		this.message = message;
	}


	/**
	 * Gets the code value for this EspException.
	 * 
	 * @return code
	 */
	 public java.lang.String getCode() {
		 return code;
	 }


	 /**
	  * Sets the code value for this EspException.
	  * 
	  * @param code
	  */
	 public void setCode(java.lang.String code) {
		 this.code = code;
	 }


	 /**
	  * Gets the audience value for this EspException.
	  * 
	  * @return audience
	  */
	 public java.lang.String getAudience() {
		 return audience;
	 }


	 /**
	  * Sets the audience value for this EspException.
	  * 
	  * @param audience
	  */
	 public void setAudience(java.lang.String audience) {
		 this.audience = audience;
	 }


	 /**
	  * Gets the source value for this EspException.
	  * 
	  * @return source
	  */
	 public java.lang.String getSource() {
		 return source;
	 }


	 /**
	  * Sets the source value for this EspException.
	  * 
	  * @param source
	  */
	 public void setSource(java.lang.String source) {
		 this.source = source;
	 }


	 /**
	  * Gets the message value for this EspException.
	  * 
	  * @return message
	  */
	 public java.lang.String getMessage() {
		 return message;
	 }


	 /**
	  * Sets the message value for this EspException.
	  * 
	  * @param message
	  */
	 public void setMessage(java.lang.String message) {
		 this.message = message;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof EspException)) return false;
		 EspException other = (EspException) obj;
		 if (obj == null) return false;
		 if (this == obj) return true;
		 if (__equalsCalc != null) {
			 return (__equalsCalc == obj);
		 }
		 __equalsCalc = obj;
		 boolean _equals;
		 _equals = true && 
				 ((this.code==null && other.getCode()==null) || 
						 (this.code!=null &&
						 this.code.equals(other.getCode()))) &&
						 ((this.audience==null && other.getAudience()==null) || 
								 (this.audience!=null &&
								 this.audience.equals(other.getAudience()))) &&
								 ((this.source==null && other.getSource()==null) || 
										 (this.source!=null &&
										 this.source.equals(other.getSource()))) &&
										 ((this.message==null && other.getMessage()==null) || 
												 (this.message!=null &&
												 this.message.equals(other.getMessage())));
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
		 if (getCode() != null) {
			 _hashCode += getCode().hashCode();
		 }
		 if (getAudience() != null) {
			 _hashCode += getAudience().hashCode();
		 }
		 if (getSource() != null) {
			 _hashCode += getSource().hashCode();
		 }
		 if (getMessage() != null) {
			 _hashCode += getMessage().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(EspException.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EspException"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("code");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Code"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("audience");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Audience"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("source");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Source"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("message");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Message"));
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
