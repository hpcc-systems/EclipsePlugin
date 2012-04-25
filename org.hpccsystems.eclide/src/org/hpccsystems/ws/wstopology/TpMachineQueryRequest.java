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
 * TpMachineQueryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpMachineQueryRequest  implements java.io.Serializable {
	private java.lang.String type;

	private java.lang.String cluster;

	private java.lang.String oldIP;

	private java.lang.String path;

	private java.lang.String directory;

	private java.lang.String logDirectory;

	public TpMachineQueryRequest() {
	}

	public TpMachineQueryRequest(
			java.lang.String type,
			java.lang.String cluster,
			java.lang.String oldIP,
			java.lang.String path,
			java.lang.String directory,
			java.lang.String logDirectory) {
		this.type = type;
		this.cluster = cluster;
		this.oldIP = oldIP;
		this.path = path;
		this.directory = directory;
		this.logDirectory = logDirectory;
	}


	/**
	 * Gets the type value for this TpMachineQueryRequest.
	 * 
	 * @return type
	 */
	 public java.lang.String getType() {
		 return type;
	 }


	 /**
	  * Sets the type value for this TpMachineQueryRequest.
	  * 
	  * @param type
	  */
	 public void setType(java.lang.String type) {
		 this.type = type;
	 }


	 /**
	  * Gets the cluster value for this TpMachineQueryRequest.
	  * 
	  * @return cluster
	  */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this TpMachineQueryRequest.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the oldIP value for this TpMachineQueryRequest.
	  * 
	  * @return oldIP
	  */
	 public java.lang.String getOldIP() {
		 return oldIP;
	 }


	 /**
	  * Sets the oldIP value for this TpMachineQueryRequest.
	  * 
	  * @param oldIP
	  */
	 public void setOldIP(java.lang.String oldIP) {
		 this.oldIP = oldIP;
	 }


	 /**
	  * Gets the path value for this TpMachineQueryRequest.
	  * 
	  * @return path
	  */
	 public java.lang.String getPath() {
		 return path;
	 }


	 /**
	  * Sets the path value for this TpMachineQueryRequest.
	  * 
	  * @param path
	  */
	 public void setPath(java.lang.String path) {
		 this.path = path;
	 }


	 /**
	  * Gets the directory value for this TpMachineQueryRequest.
	  * 
	  * @return directory
	  */
	 public java.lang.String getDirectory() {
		 return directory;
	 }


	 /**
	  * Sets the directory value for this TpMachineQueryRequest.
	  * 
	  * @param directory
	  */
	 public void setDirectory(java.lang.String directory) {
		 this.directory = directory;
	 }


	 /**
	  * Gets the logDirectory value for this TpMachineQueryRequest.
	  * 
	  * @return logDirectory
	  */
	 public java.lang.String getLogDirectory() {
		 return logDirectory;
	 }


	 /**
	  * Sets the logDirectory value for this TpMachineQueryRequest.
	  * 
	  * @param logDirectory
	  */
	 public void setLogDirectory(java.lang.String logDirectory) {
		 this.logDirectory = logDirectory;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof TpMachineQueryRequest)) return false;
		 TpMachineQueryRequest other = (TpMachineQueryRequest) obj;
		 if (obj == null) return false;
		 if (this == obj) return true;
		 if (__equalsCalc != null) {
			 return (__equalsCalc == obj);
		 }
		 __equalsCalc = obj;
		 boolean _equals;
		 _equals = true && 
				 ((this.type==null && other.getType()==null) || 
						 (this.type!=null &&
						 this.type.equals(other.getType()))) &&
						 ((this.cluster==null && other.getCluster()==null) || 
								 (this.cluster!=null &&
								 this.cluster.equals(other.getCluster()))) &&
								 ((this.oldIP==null && other.getOldIP()==null) || 
										 (this.oldIP!=null &&
										 this.oldIP.equals(other.getOldIP()))) &&
										 ((this.path==null && other.getPath()==null) || 
												 (this.path!=null &&
												 this.path.equals(other.getPath()))) &&
												 ((this.directory==null && other.getDirectory()==null) || 
														 (this.directory!=null &&
														 this.directory.equals(other.getDirectory()))) &&
														 ((this.logDirectory==null && other.getLogDirectory()==null) || 
																 (this.logDirectory!=null &&
																 this.logDirectory.equals(other.getLogDirectory())));
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
		 if (getType() != null) {
			 _hashCode += getType().hashCode();
		 }
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getOldIP() != null) {
			 _hashCode += getOldIP().hashCode();
		 }
		 if (getPath() != null) {
			 _hashCode += getPath().hashCode();
		 }
		 if (getDirectory() != null) {
			 _hashCode += getDirectory().hashCode();
		 }
		 if (getLogDirectory() != null) {
			 _hashCode += getLogDirectory().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(TpMachineQueryRequest.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpMachineQueryRequest"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("type");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Type"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("cluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Cluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("oldIP");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "OldIP"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
		 elemField.setFieldName("directory");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Directory"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("logDirectory");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LogDirectory"));
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
