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
 * DFUSpaceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUSpaceRequest  implements java.io.Serializable {
	private java.lang.String countBy;

	private java.lang.String scopeUnder;

	private java.lang.String ownerUnder;

	private java.lang.String interval;

	private java.lang.String startDate;

	private java.lang.String endDate;

	public DFUSpaceRequest() {
	}

	public DFUSpaceRequest(
			java.lang.String countBy,
			java.lang.String scopeUnder,
			java.lang.String ownerUnder,
			java.lang.String interval,
			java.lang.String startDate,
			java.lang.String endDate) {
		this.countBy = countBy;
		this.scopeUnder = scopeUnder;
		this.ownerUnder = ownerUnder;
		this.interval = interval;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	/**
	 * Gets the countBy value for this DFUSpaceRequest.
	 * 
	 * @return countBy
	 */
	 public java.lang.String getCountBy() {
		 return countBy;
	 }


	 /**
	  * Sets the countBy value for this DFUSpaceRequest.
	  * 
	  * @param countBy
	  */
	 public void setCountBy(java.lang.String countBy) {
		 this.countBy = countBy;
	 }


	 /**
	  * Gets the scopeUnder value for this DFUSpaceRequest.
	  * 
	  * @return scopeUnder
	  */
	 public java.lang.String getScopeUnder() {
		 return scopeUnder;
	 }


	 /**
	  * Sets the scopeUnder value for this DFUSpaceRequest.
	  * 
	  * @param scopeUnder
	  */
	 public void setScopeUnder(java.lang.String scopeUnder) {
		 this.scopeUnder = scopeUnder;
	 }


	 /**
	  * Gets the ownerUnder value for this DFUSpaceRequest.
	  * 
	  * @return ownerUnder
	  */
	 public java.lang.String getOwnerUnder() {
		 return ownerUnder;
	 }


	 /**
	  * Sets the ownerUnder value for this DFUSpaceRequest.
	  * 
	  * @param ownerUnder
	  */
	 public void setOwnerUnder(java.lang.String ownerUnder) {
		 this.ownerUnder = ownerUnder;
	 }


	 /**
	  * Gets the interval value for this DFUSpaceRequest.
	  * 
	  * @return interval
	  */
	 public java.lang.String getInterval() {
		 return interval;
	 }


	 /**
	  * Sets the interval value for this DFUSpaceRequest.
	  * 
	  * @param interval
	  */
	 public void setInterval(java.lang.String interval) {
		 this.interval = interval;
	 }


	 /**
	  * Gets the startDate value for this DFUSpaceRequest.
	  * 
	  * @return startDate
	  */
	 public java.lang.String getStartDate() {
		 return startDate;
	 }


	 /**
	  * Sets the startDate value for this DFUSpaceRequest.
	  * 
	  * @param startDate
	  */
	 public void setStartDate(java.lang.String startDate) {
		 this.startDate = startDate;
	 }


	 /**
	  * Gets the endDate value for this DFUSpaceRequest.
	  * 
	  * @return endDate
	  */
	 public java.lang.String getEndDate() {
		 return endDate;
	 }


	 /**
	  * Sets the endDate value for this DFUSpaceRequest.
	  * 
	  * @param endDate
	  */
	 public void setEndDate(java.lang.String endDate) {
		 this.endDate = endDate;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DFUSpaceRequest)) {
			return false;
		}
		 DFUSpaceRequest other = (DFUSpaceRequest) obj;
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
				 ((this.countBy==null && other.getCountBy()==null) || 
						 (this.countBy!=null &&
						 this.countBy.equals(other.getCountBy()))) &&
						 ((this.scopeUnder==null && other.getScopeUnder()==null) || 
								 (this.scopeUnder!=null &&
								 this.scopeUnder.equals(other.getScopeUnder()))) &&
								 ((this.ownerUnder==null && other.getOwnerUnder()==null) || 
										 (this.ownerUnder!=null &&
										 this.ownerUnder.equals(other.getOwnerUnder()))) &&
										 ((this.interval==null && other.getInterval()==null) || 
												 (this.interval!=null &&
												 this.interval.equals(other.getInterval()))) &&
												 ((this.startDate==null && other.getStartDate()==null) || 
														 (this.startDate!=null &&
														 this.startDate.equals(other.getStartDate()))) &&
														 ((this.endDate==null && other.getEndDate()==null) || 
																 (this.endDate!=null &&
																 this.endDate.equals(other.getEndDate())));
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
		 if (getCountBy() != null) {
			 _hashCode += getCountBy().hashCode();
		 }
		 if (getScopeUnder() != null) {
			 _hashCode += getScopeUnder().hashCode();
		 }
		 if (getOwnerUnder() != null) {
			 _hashCode += getOwnerUnder().hashCode();
		 }
		 if (getInterval() != null) {
			 _hashCode += getInterval().hashCode();
		 }
		 if (getStartDate() != null) {
			 _hashCode += getStartDate().hashCode();
		 }
		 if (getEndDate() != null) {
			 _hashCode += getEndDate().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(DFUSpaceRequest.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSpaceRequest"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("countBy");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CountBy"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("scopeUnder");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ScopeUnder"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("ownerUnder");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "OwnerUnder"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("interval");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Interval"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("startDate");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartDate"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("endDate");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EndDate"));
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
