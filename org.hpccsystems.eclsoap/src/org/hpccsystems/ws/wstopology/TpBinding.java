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
 * TpBinding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpBinding  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String service;

	private java.lang.String serviceType;

	private java.lang.String port;

	private java.lang.String protocol;

	public TpBinding() {
	}

	public TpBinding(
			java.lang.String name,
			java.lang.String service,
			java.lang.String serviceType,
			java.lang.String port,
			java.lang.String protocol) {
		this.name = name;
		this.service = service;
		this.serviceType = serviceType;
		this.port = port;
		this.protocol = protocol;
	}


	/**
	 * Gets the name value for this TpBinding.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this TpBinding.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the service value for this TpBinding.
	  * 
	  * @return service
	  */
	 public java.lang.String getService() {
		 return service;
	 }


	 /**
	  * Sets the service value for this TpBinding.
	  * 
	  * @param service
	  */
	 public void setService(java.lang.String service) {
		 this.service = service;
	 }


	 /**
	  * Gets the serviceType value for this TpBinding.
	  * 
	  * @return serviceType
	  */
	 public java.lang.String getServiceType() {
		 return serviceType;
	 }


	 /**
	  * Sets the serviceType value for this TpBinding.
	  * 
	  * @param serviceType
	  */
	 public void setServiceType(java.lang.String serviceType) {
		 this.serviceType = serviceType;
	 }


	 /**
	  * Gets the port value for this TpBinding.
	  * 
	  * @return port
	  */
	 public java.lang.String getPort() {
		 return port;
	 }


	 /**
	  * Sets the port value for this TpBinding.
	  * 
	  * @param port
	  */
	 public void setPort(java.lang.String port) {
		 this.port = port;
	 }


	 /**
	  * Gets the protocol value for this TpBinding.
	  * 
	  * @return protocol
	  */
	 public java.lang.String getProtocol() {
		 return protocol;
	 }


	 /**
	  * Sets the protocol value for this TpBinding.
	  * 
	  * @param protocol
	  */
	 public void setProtocol(java.lang.String protocol) {
		 this.protocol = protocol;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof TpBinding)) {
			return false;
		}
		 TpBinding other = (TpBinding) obj;
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
				 ((this.name==null && other.getName()==null) || 
						 (this.name!=null &&
						 this.name.equals(other.getName()))) &&
						 ((this.service==null && other.getService()==null) || 
								 (this.service!=null &&
								 this.service.equals(other.getService()))) &&
								 ((this.serviceType==null && other.getServiceType()==null) || 
										 (this.serviceType!=null &&
										 this.serviceType.equals(other.getServiceType()))) &&
										 ((this.port==null && other.getPort()==null) || 
												 (this.port!=null &&
												 this.port.equals(other.getPort()))) &&
												 ((this.protocol==null && other.getProtocol()==null) || 
														 (this.protocol!=null &&
														 this.protocol.equals(other.getProtocol())));
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
		 if (getService() != null) {
			 _hashCode += getService().hashCode();
		 }
		 if (getServiceType() != null) {
			 _hashCode += getServiceType().hashCode();
		 }
		 if (getPort() != null) {
			 _hashCode += getPort().hashCode();
		 }
		 if (getProtocol() != null) {
			 _hashCode += getProtocol().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(TpBinding.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpBinding"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("service");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Service"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("serviceType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ServiceType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("port");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Port"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("protocol");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Protocol"));
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
