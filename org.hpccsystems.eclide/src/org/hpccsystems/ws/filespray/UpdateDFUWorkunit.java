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
 * UpdateDFUWorkunit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class UpdateDFUWorkunit  implements java.io.Serializable {
	private org.hpccsystems.ws.filespray.DFUWorkunit wu;

	private java.lang.String clusterOrig;

	private java.lang.String jobNameOrig;

	private java.lang.Boolean isProtectedOrig;

	private java.lang.Integer stateOrig;

	public UpdateDFUWorkunit() {
	}

	public UpdateDFUWorkunit(
			org.hpccsystems.ws.filespray.DFUWorkunit wu,
			java.lang.String clusterOrig,
			java.lang.String jobNameOrig,
			java.lang.Boolean isProtectedOrig,
			java.lang.Integer stateOrig) {
		this.wu = wu;
		this.clusterOrig = clusterOrig;
		this.jobNameOrig = jobNameOrig;
		this.isProtectedOrig = isProtectedOrig;
		this.stateOrig = stateOrig;
	}


	/**
	 * Gets the wu value for this UpdateDFUWorkunit.
	 * 
	 * @return wu
	 */
	 public org.hpccsystems.ws.filespray.DFUWorkunit getWu() {
		 return wu;
	 }


	 /**
	  * Sets the wu value for this UpdateDFUWorkunit.
	  * 
	  * @param wu
	  */
	 public void setWu(org.hpccsystems.ws.filespray.DFUWorkunit wu) {
		 this.wu = wu;
	 }


	 /**
	  * Gets the clusterOrig value for this UpdateDFUWorkunit.
	  * 
	  * @return clusterOrig
	  */
	 public java.lang.String getClusterOrig() {
		 return clusterOrig;
	 }


	 /**
	  * Sets the clusterOrig value for this UpdateDFUWorkunit.
	  * 
	  * @param clusterOrig
	  */
	 public void setClusterOrig(java.lang.String clusterOrig) {
		 this.clusterOrig = clusterOrig;
	 }


	 /**
	  * Gets the jobNameOrig value for this UpdateDFUWorkunit.
	  * 
	  * @return jobNameOrig
	  */
	 public java.lang.String getJobNameOrig() {
		 return jobNameOrig;
	 }


	 /**
	  * Sets the jobNameOrig value for this UpdateDFUWorkunit.
	  * 
	  * @param jobNameOrig
	  */
	 public void setJobNameOrig(java.lang.String jobNameOrig) {
		 this.jobNameOrig = jobNameOrig;
	 }


	 /**
	  * Gets the isProtectedOrig value for this UpdateDFUWorkunit.
	  * 
	  * @return isProtectedOrig
	  */
	 public java.lang.Boolean getIsProtectedOrig() {
		 return isProtectedOrig;
	 }


	 /**
	  * Sets the isProtectedOrig value for this UpdateDFUWorkunit.
	  * 
	  * @param isProtectedOrig
	  */
	 public void setIsProtectedOrig(java.lang.Boolean isProtectedOrig) {
		 this.isProtectedOrig = isProtectedOrig;
	 }


	 /**
	  * Gets the stateOrig value for this UpdateDFUWorkunit.
	  * 
	  * @return stateOrig
	  */
	 public java.lang.Integer getStateOrig() {
		 return stateOrig;
	 }


	 /**
	  * Sets the stateOrig value for this UpdateDFUWorkunit.
	  * 
	  * @param stateOrig
	  */
	 public void setStateOrig(java.lang.Integer stateOrig) {
		 this.stateOrig = stateOrig;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof UpdateDFUWorkunit)) {
			return false;
		}
		 UpdateDFUWorkunit other = (UpdateDFUWorkunit) obj;
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
				 ((this.wu==null && other.getWu()==null) || 
						 (this.wu!=null &&
						 this.wu.equals(other.getWu()))) &&
						 ((this.clusterOrig==null && other.getClusterOrig()==null) || 
								 (this.clusterOrig!=null &&
								 this.clusterOrig.equals(other.getClusterOrig()))) &&
								 ((this.jobNameOrig==null && other.getJobNameOrig()==null) || 
										 (this.jobNameOrig!=null &&
										 this.jobNameOrig.equals(other.getJobNameOrig()))) &&
										 ((this.isProtectedOrig==null && other.getIsProtectedOrig()==null) || 
												 (this.isProtectedOrig!=null &&
												 this.isProtectedOrig.equals(other.getIsProtectedOrig()))) &&
												 ((this.stateOrig==null && other.getStateOrig()==null) || 
														 (this.stateOrig!=null &&
														 this.stateOrig.equals(other.getStateOrig())));
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
		 if (getWu() != null) {
			 _hashCode += getWu().hashCode();
		 }
		 if (getClusterOrig() != null) {
			 _hashCode += getClusterOrig().hashCode();
		 }
		 if (getJobNameOrig() != null) {
			 _hashCode += getJobNameOrig().hashCode();
		 }
		 if (getIsProtectedOrig() != null) {
			 _hashCode += getIsProtectedOrig().hashCode();
		 }
		 if (getStateOrig() != null) {
			 _hashCode += getStateOrig().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(UpdateDFUWorkunit.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">UpdateDFUWorkunit"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wu");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "wu"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWorkunit"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("clusterOrig");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ClusterOrig"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("jobNameOrig");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "JobNameOrig"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isProtectedOrig");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "isProtectedOrig"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("stateOrig");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "StateOrig"));
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
