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
 * WUInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUInfoResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions;

	private org.hpccsystems.ws.wsworkunits.ECLWorkunit workunit;

	private java.lang.Integer autoRefresh;

	private java.lang.Boolean canCompile;

	private java.lang.String thorSlaveIP;

	private java.lang.String[] resultViews;

	public WUInfoResponse() {
	}

	public WUInfoResponse(
			org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions,
			org.hpccsystems.ws.wsworkunits.ECLWorkunit workunit,
			java.lang.Integer autoRefresh,
			java.lang.Boolean canCompile,
			java.lang.String thorSlaveIP,
			java.lang.String[] resultViews) {
		this.exceptions = exceptions;
		this.workunit = workunit;
		this.autoRefresh = autoRefresh;
		this.canCompile = canCompile;
		this.thorSlaveIP = thorSlaveIP;
		this.resultViews = resultViews;
	}


	/**
	 * Gets the exceptions value for this WUInfoResponse.
	 * 
	 * @return exceptions
	 */
	 public org.hpccsystems.ws.wsworkunits.ArrayOfEspException getExceptions() {
		 return exceptions;
	 }


	 /**
	  * Sets the exceptions value for this WUInfoResponse.
	  * 
	  * @param exceptions
	  */
	 public void setExceptions(org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions) {
		 this.exceptions = exceptions;
	 }


	 /**
	  * Gets the workunit value for this WUInfoResponse.
	  * 
	  * @return workunit
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLWorkunit getWorkunit() {
		 return workunit;
	 }


	 /**
	  * Sets the workunit value for this WUInfoResponse.
	  * 
	  * @param workunit
	  */
	 public void setWorkunit(org.hpccsystems.ws.wsworkunits.ECLWorkunit workunit) {
		 this.workunit = workunit;
	 }


	 /**
	  * Gets the autoRefresh value for this WUInfoResponse.
	  * 
	  * @return autoRefresh
	  */
	 public java.lang.Integer getAutoRefresh() {
		 return autoRefresh;
	 }


	 /**
	  * Sets the autoRefresh value for this WUInfoResponse.
	  * 
	  * @param autoRefresh
	  */
	 public void setAutoRefresh(java.lang.Integer autoRefresh) {
		 this.autoRefresh = autoRefresh;
	 }


	 /**
	  * Gets the canCompile value for this WUInfoResponse.
	  * 
	  * @return canCompile
	  */
	 public java.lang.Boolean getCanCompile() {
		 return canCompile;
	 }


	 /**
	  * Sets the canCompile value for this WUInfoResponse.
	  * 
	  * @param canCompile
	  */
	 public void setCanCompile(java.lang.Boolean canCompile) {
		 this.canCompile = canCompile;
	 }


	 /**
	  * Gets the thorSlaveIP value for this WUInfoResponse.
	  * 
	  * @return thorSlaveIP
	  */
	 public java.lang.String getThorSlaveIP() {
		 return thorSlaveIP;
	 }


	 /**
	  * Sets the thorSlaveIP value for this WUInfoResponse.
	  * 
	  * @param thorSlaveIP
	  */
	 public void setThorSlaveIP(java.lang.String thorSlaveIP) {
		 this.thorSlaveIP = thorSlaveIP;
	 }


	 /**
	  * Gets the resultViews value for this WUInfoResponse.
	  * 
	  * @return resultViews
	  */
	 public java.lang.String[] getResultViews() {
		 return resultViews;
	 }


	 /**
	  * Sets the resultViews value for this WUInfoResponse.
	  * 
	  * @param resultViews
	  */
	 public void setResultViews(java.lang.String[] resultViews) {
		 this.resultViews = resultViews;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof WUInfoResponse)) {
			return false;
		}
		 WUInfoResponse other = (WUInfoResponse) obj;
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
						 ((this.workunit==null && other.getWorkunit()==null) || 
								 (this.workunit!=null &&
								 this.workunit.equals(other.getWorkunit()))) &&
								 ((this.autoRefresh==null && other.getAutoRefresh()==null) || 
										 (this.autoRefresh!=null &&
										 this.autoRefresh.equals(other.getAutoRefresh()))) &&
										 ((this.canCompile==null && other.getCanCompile()==null) || 
												 (this.canCompile!=null &&
												 this.canCompile.equals(other.getCanCompile()))) &&
												 ((this.thorSlaveIP==null && other.getThorSlaveIP()==null) || 
														 (this.thorSlaveIP!=null &&
														 this.thorSlaveIP.equals(other.getThorSlaveIP()))) &&
														 ((this.resultViews==null && other.getResultViews()==null) || 
																 (this.resultViews!=null &&
																 java.util.Arrays.equals(this.resultViews, other.getResultViews())));
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
		 if (getWorkunit() != null) {
			 _hashCode += getWorkunit().hashCode();
		 }
		 if (getAutoRefresh() != null) {
			 _hashCode += getAutoRefresh().hashCode();
		 }
		 if (getCanCompile() != null) {
			 _hashCode += getCanCompile().hashCode();
		 }
		 if (getThorSlaveIP() != null) {
			 _hashCode += getThorSlaveIP().hashCode();
		 }
		 if (getResultViews() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getResultViews());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getResultViews(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(WUInfoResponse.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfoResponse"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("exceptions");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("workunit");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Workunit"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunit"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("autoRefresh");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AutoRefresh"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("canCompile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CanCompile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("thorSlaveIP");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorSlaveIP"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("resultViews");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultViews"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "View"));
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
