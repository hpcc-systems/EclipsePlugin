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
 * OpenSaveResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class OpenSaveResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.filespray.ArrayOfEspException exceptions;

	private java.lang.String location;

	private java.lang.String path;

	private java.lang.String name;

	private java.lang.String type;

	private java.lang.String dateTime;

	private java.lang.Boolean viewable;

	public OpenSaveResponse() {
	}

	public OpenSaveResponse(
			org.hpccsystems.ws.filespray.ArrayOfEspException exceptions,
			java.lang.String location,
			java.lang.String path,
			java.lang.String name,
			java.lang.String type,
			java.lang.String dateTime,
			java.lang.Boolean viewable) {
		this.exceptions = exceptions;
		this.location = location;
		this.path = path;
		this.name = name;
		this.type = type;
		this.dateTime = dateTime;
		this.viewable = viewable;
	}


	/**
	 * Gets the exceptions value for this OpenSaveResponse.
	 * 
	 * @return exceptions
	 */
	 public org.hpccsystems.ws.filespray.ArrayOfEspException getExceptions() {
		 return exceptions;
	 }


	 /**
	  * Sets the exceptions value for this OpenSaveResponse.
	  * 
	  * @param exceptions
	  */
	 public void setExceptions(org.hpccsystems.ws.filespray.ArrayOfEspException exceptions) {
		 this.exceptions = exceptions;
	 }


	 /**
	  * Gets the location value for this OpenSaveResponse.
	  * 
	  * @return location
	  */
	 public java.lang.String getLocation() {
		 return location;
	 }


	 /**
	  * Sets the location value for this OpenSaveResponse.
	  * 
	  * @param location
	  */
	 public void setLocation(java.lang.String location) {
		 this.location = location;
	 }


	 /**
	  * Gets the path value for this OpenSaveResponse.
	  * 
	  * @return path
	  */
	 public java.lang.String getPath() {
		 return path;
	 }


	 /**
	  * Sets the path value for this OpenSaveResponse.
	  * 
	  * @param path
	  */
	 public void setPath(java.lang.String path) {
		 this.path = path;
	 }


	 /**
	  * Gets the name value for this OpenSaveResponse.
	  * 
	  * @return name
	  */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this OpenSaveResponse.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the type value for this OpenSaveResponse.
	  * 
	  * @return type
	  */
	 public java.lang.String getType() {
		 return type;
	 }


	 /**
	  * Sets the type value for this OpenSaveResponse.
	  * 
	  * @param type
	  */
	 public void setType(java.lang.String type) {
		 this.type = type;
	 }


	 /**
	  * Gets the dateTime value for this OpenSaveResponse.
	  * 
	  * @return dateTime
	  */
	 public java.lang.String getDateTime() {
		 return dateTime;
	 }


	 /**
	  * Sets the dateTime value for this OpenSaveResponse.
	  * 
	  * @param dateTime
	  */
	 public void setDateTime(java.lang.String dateTime) {
		 this.dateTime = dateTime;
	 }


	 /**
	  * Gets the viewable value for this OpenSaveResponse.
	  * 
	  * @return viewable
	  */
	 public java.lang.Boolean getViewable() {
		 return viewable;
	 }


	 /**
	  * Sets the viewable value for this OpenSaveResponse.
	  * 
	  * @param viewable
	  */
	 public void setViewable(java.lang.Boolean viewable) {
		 this.viewable = viewable;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof OpenSaveResponse)) {
			return false;
		}
		 OpenSaveResponse other = (OpenSaveResponse) obj;
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
				 ((this.exceptions==null && other.getExceptions()==null) || 
						 (this.exceptions!=null &&
						 this.exceptions.equals(other.getExceptions()))) &&
						 ((this.location==null && other.getLocation()==null) || 
								 (this.location!=null &&
								 this.location.equals(other.getLocation()))) &&
								 ((this.path==null && other.getPath()==null) || 
										 (this.path!=null &&
										 this.path.equals(other.getPath()))) &&
										 ((this.name==null && other.getName()==null) || 
												 (this.name!=null &&
												 this.name.equals(other.getName()))) &&
												 ((this.type==null && other.getType()==null) || 
														 (this.type!=null &&
														 this.type.equals(other.getType()))) &&
														 ((this.dateTime==null && other.getDateTime()==null) || 
																 (this.dateTime!=null &&
																 this.dateTime.equals(other.getDateTime()))) &&
																 ((this.viewable==null && other.getViewable()==null) || 
																		 (this.viewable!=null &&
																		 this.viewable.equals(other.getViewable())));
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
		 if (getExceptions() != null) {
			 _hashCode += getExceptions().hashCode();
		 }
		 if (getLocation() != null) {
			 _hashCode += getLocation().hashCode();
		 }
		 if (getPath() != null) {
			 _hashCode += getPath().hashCode();
		 }
		 if (getName() != null) {
			 _hashCode += getName().hashCode();
		 }
		 if (getType() != null) {
			 _hashCode += getType().hashCode();
		 }
		 if (getDateTime() != null) {
			 _hashCode += getDateTime().hashCode();
		 }
		 if (getViewable() != null) {
			 _hashCode += getViewable().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(OpenSaveResponse.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">OpenSaveResponse"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("exceptions");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("location");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Location"));
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
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("type");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Type"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("dateTime");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DateTime"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("viewable");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Viewable"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
