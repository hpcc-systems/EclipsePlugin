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
 * TpMachine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpMachine  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String netaddress;

	private java.lang.String configNetaddress;

	private java.lang.String domain;

	private java.lang.String directory;

	private java.lang.String type;

	private java.lang.String available;

	private java.lang.Integer OS;

	private java.lang.String path;

	private java.lang.Integer port;

	public TpMachine() {
	}

	public TpMachine(
			java.lang.String name,
			java.lang.String netaddress,
			java.lang.String configNetaddress,
			java.lang.String domain,
			java.lang.String directory,
			java.lang.String type,
			java.lang.String available,
			java.lang.Integer OS,
			java.lang.String path,
			java.lang.Integer port) {
		this.name = name;
		this.netaddress = netaddress;
		this.configNetaddress = configNetaddress;
		this.domain = domain;
		this.directory = directory;
		this.type = type;
		this.available = available;
		this.OS = OS;
		this.path = path;
		this.port = port;
	}


	/**
	 * Gets the name value for this TpMachine.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	/**
	 * Sets the name value for this TpMachine.
	 * 
	 * @param name
	 */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the netaddress value for this TpMachine.
	  * 
	  * @return netaddress
	  */
	 public java.lang.String getNetaddress() {
		 return netaddress;
	 }


	 /**
	  * Sets the netaddress value for this TpMachine.
	  * 
	  * @param netaddress
	  */
	 public void setNetaddress(java.lang.String netaddress) {
		 this.netaddress = netaddress;
	 }


	 /**
	  * Gets the configNetaddress value for this TpMachine.
	  * 
	  * @return configNetaddress
	  */
	 public java.lang.String getConfigNetaddress() {
		 return configNetaddress;
	 }


	 /**
	  * Sets the configNetaddress value for this TpMachine.
	  * 
	  * @param configNetaddress
	  */
	 public void setConfigNetaddress(java.lang.String configNetaddress) {
		 this.configNetaddress = configNetaddress;
	 }


	 /**
	  * Gets the domain value for this TpMachine.
	  * 
	  * @return domain
	  */
	 public java.lang.String getDomain() {
		 return domain;
	 }


	 /**
	  * Sets the domain value for this TpMachine.
	  * 
	  * @param domain
	  */
	 public void setDomain(java.lang.String domain) {
		 this.domain = domain;
	 }


	 /**
	  * Gets the directory value for this TpMachine.
	  * 
	  * @return directory
	  */
	 public java.lang.String getDirectory() {
		 return directory;
	 }


	 /**
	  * Sets the directory value for this TpMachine.
	  * 
	  * @param directory
	  */
	 public void setDirectory(java.lang.String directory) {
		 this.directory = directory;
	 }


	 /**
	  * Gets the type value for this TpMachine.
	  * 
	  * @return type
	  */
	 public java.lang.String getType() {
		 return type;
	 }


	 /**
	  * Sets the type value for this TpMachine.
	  * 
	  * @param type
	  */
	 public void setType(java.lang.String type) {
		 this.type = type;
	 }


	 /**
	  * Gets the available value for this TpMachine.
	  * 
	  * @return available
	  */
	 public java.lang.String getAvailable() {
		 return available;
	 }


	 /**
	  * Sets the available value for this TpMachine.
	  * 
	  * @param available
	  */
	 public void setAvailable(java.lang.String available) {
		 this.available = available;
	 }


	 /**
	  * Gets the OS value for this TpMachine.
	  * 
	  * @return OS
	  */
	 public java.lang.Integer getOS() {
		 return OS;
	 }


	 /**
	  * Sets the OS value for this TpMachine.
	  * 
	  * @param OS
	  */
	 public void setOS(java.lang.Integer OS) {
		 this.OS = OS;
	 }


	 /**
	  * Gets the path value for this TpMachine.
	  * 
	  * @return path
	  */
	 public java.lang.String getPath() {
		 return path;
	 }


	 /**
	  * Sets the path value for this TpMachine.
	  * 
	  * @param path
	  */
	 public void setPath(java.lang.String path) {
		 this.path = path;
	 }


	 /**
	  * Gets the port value for this TpMachine.
	  * 
	  * @return port
	  */
	 public java.lang.Integer getPort() {
		 return port;
	 }


	 /**
	  * Sets the port value for this TpMachine.
	  * 
	  * @param port
	  */
	 public void setPort(java.lang.Integer port) {
		 this.port = port;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof TpMachine)) return false;
		 TpMachine other = (TpMachine) obj;
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
						 ((this.netaddress==null && other.getNetaddress()==null) || 
								 (this.netaddress!=null &&
								 this.netaddress.equals(other.getNetaddress()))) &&
								 ((this.configNetaddress==null && other.getConfigNetaddress()==null) || 
										 (this.configNetaddress!=null &&
										 this.configNetaddress.equals(other.getConfigNetaddress()))) &&
										 ((this.domain==null && other.getDomain()==null) || 
												 (this.domain!=null &&
												 this.domain.equals(other.getDomain()))) &&
												 ((this.directory==null && other.getDirectory()==null) || 
														 (this.directory!=null &&
														 this.directory.equals(other.getDirectory()))) &&
														 ((this.type==null && other.getType()==null) || 
																 (this.type!=null &&
																 this.type.equals(other.getType()))) &&
																 ((this.available==null && other.getAvailable()==null) || 
																		 (this.available!=null &&
																		 this.available.equals(other.getAvailable()))) &&
																		 ((this.OS==null && other.getOS()==null) || 
																				 (this.OS!=null &&
																				 this.OS.equals(other.getOS()))) &&
																				 ((this.path==null && other.getPath()==null) || 
																						 (this.path!=null &&
																						 this.path.equals(other.getPath()))) &&
																						 ((this.port==null && other.getPort()==null) || 
																								 (this.port!=null &&
																								 this.port.equals(other.getPort())));
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
		 if (getNetaddress() != null) {
			 _hashCode += getNetaddress().hashCode();
		 }
		 if (getConfigNetaddress() != null) {
			 _hashCode += getConfigNetaddress().hashCode();
		 }
		 if (getDomain() != null) {
			 _hashCode += getDomain().hashCode();
		 }
		 if (getDirectory() != null) {
			 _hashCode += getDirectory().hashCode();
		 }
		 if (getType() != null) {
			 _hashCode += getType().hashCode();
		 }
		 if (getAvailable() != null) {
			 _hashCode += getAvailable().hashCode();
		 }
		 if (getOS() != null) {
			 _hashCode += getOS().hashCode();
		 }
		 if (getPath() != null) {
			 _hashCode += getPath().hashCode();
		 }
		 if (getPort() != null) {
			 _hashCode += getPort().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(TpMachine.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpMachine"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("netaddress");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Netaddress"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("configNetaddress");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ConfigNetaddress"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("domain");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Domain"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("directory");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Directory"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("type");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Type"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("available");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Available"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("OS");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "OS"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("path");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Path"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("port");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Port"));
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
