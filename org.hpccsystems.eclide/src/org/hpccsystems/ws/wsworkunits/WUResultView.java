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
 * WUResultView.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUResultView  implements java.io.Serializable {
	private java.lang.String wuid;

	private java.lang.String viewName;

	private java.lang.Integer sequence;

	private java.lang.String resultName;

	public WUResultView() {
	}

	public WUResultView(
			java.lang.String wuid,
			java.lang.String viewName,
			java.lang.Integer sequence,
			java.lang.String resultName) {
		this.wuid = wuid;
		this.viewName = viewName;
		this.sequence = sequence;
		this.resultName = resultName;
	}


	/**
	 * Gets the wuid value for this WUResultView.
	 * 
	 * @return wuid
	 */
	 public java.lang.String getWuid() {
		 return wuid;
	 }


	 /**
	  * Sets the wuid value for this WUResultView.
	  * 
	  * @param wuid
	  */
	 public void setWuid(java.lang.String wuid) {
		 this.wuid = wuid;
	 }


	 /**
	  * Gets the viewName value for this WUResultView.
	  * 
	  * @return viewName
	  */
	 public java.lang.String getViewName() {
		 return viewName;
	 }


	 /**
	  * Sets the viewName value for this WUResultView.
	  * 
	  * @param viewName
	  */
	 public void setViewName(java.lang.String viewName) {
		 this.viewName = viewName;
	 }


	 /**
	  * Gets the sequence value for this WUResultView.
	  * 
	  * @return sequence
	  */
	 public java.lang.Integer getSequence() {
		 return sequence;
	 }


	 /**
	  * Sets the sequence value for this WUResultView.
	  * 
	  * @param sequence
	  */
	 public void setSequence(java.lang.Integer sequence) {
		 this.sequence = sequence;
	 }


	 /**
	  * Gets the resultName value for this WUResultView.
	  * 
	  * @return resultName
	  */
	 public java.lang.String getResultName() {
		 return resultName;
	 }


	 /**
	  * Sets the resultName value for this WUResultView.
	  * 
	  * @param resultName
	  */
	 public void setResultName(java.lang.String resultName) {
		 this.resultName = resultName;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof WUResultView)) return false;
		 WUResultView other = (WUResultView) obj;
		 if (obj == null) return false;
		 if (this == obj) return true;
		 if (__equalsCalc != null) {
			 return (__equalsCalc == obj);
		 }
		 __equalsCalc = obj;
		 boolean _equals;
		 _equals = true && 
				 ((this.wuid==null && other.getWuid()==null) || 
						 (this.wuid!=null &&
						 this.wuid.equals(other.getWuid()))) &&
						 ((this.viewName==null && other.getViewName()==null) || 
								 (this.viewName!=null &&
								 this.viewName.equals(other.getViewName()))) &&
								 ((this.sequence==null && other.getSequence()==null) || 
										 (this.sequence!=null &&
										 this.sequence.equals(other.getSequence()))) &&
										 ((this.resultName==null && other.getResultName()==null) || 
												 (this.resultName!=null &&
												 this.resultName.equals(other.getResultName())));
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
		 if (getViewName() != null) {
			 _hashCode += getViewName().hashCode();
		 }
		 if (getSequence() != null) {
			 _hashCode += getSequence().hashCode();
		 }
		 if (getResultName() != null) {
			 _hashCode += getResultName().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(WUResultView.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultView"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wuid");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("viewName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ViewName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sequence");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Sequence"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("resultName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultName"));
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
