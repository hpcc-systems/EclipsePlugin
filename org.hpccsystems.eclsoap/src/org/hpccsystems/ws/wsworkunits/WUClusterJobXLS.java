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
 * WUClusterJobXLS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUClusterJobXLS  implements java.io.Serializable {
	private java.lang.String cluster;

	private java.lang.String startDate;

	private java.lang.String endDate;

	private java.lang.Boolean showAll;

	private java.lang.String businessStartTime;

	private java.lang.String businessEndTime;

	public WUClusterJobXLS() {
	}

	public WUClusterJobXLS(
			java.lang.String cluster,
			java.lang.String startDate,
			java.lang.String endDate,
			java.lang.Boolean showAll,
			java.lang.String businessStartTime,
			java.lang.String businessEndTime) {
		this.cluster = cluster;
		this.startDate = startDate;
		this.endDate = endDate;
		this.showAll = showAll;
		this.businessStartTime = businessStartTime;
		this.businessEndTime = businessEndTime;
	}


	/**
	 * Gets the cluster value for this WUClusterJobXLS.
	 * 
	 * @return cluster
	 */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this WUClusterJobXLS.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the startDate value for this WUClusterJobXLS.
	  * 
	  * @return startDate
	  */
	 public java.lang.String getStartDate() {
		 return startDate;
	 }


	 /**
	  * Sets the startDate value for this WUClusterJobXLS.
	  * 
	  * @param startDate
	  */
	 public void setStartDate(java.lang.String startDate) {
		 this.startDate = startDate;
	 }


	 /**
	  * Gets the endDate value for this WUClusterJobXLS.
	  * 
	  * @return endDate
	  */
	 public java.lang.String getEndDate() {
		 return endDate;
	 }


	 /**
	  * Sets the endDate value for this WUClusterJobXLS.
	  * 
	  * @param endDate
	  */
	 public void setEndDate(java.lang.String endDate) {
		 this.endDate = endDate;
	 }


	 /**
	  * Gets the showAll value for this WUClusterJobXLS.
	  * 
	  * @return showAll
	  */
	 public java.lang.Boolean getShowAll() {
		 return showAll;
	 }


	 /**
	  * Sets the showAll value for this WUClusterJobXLS.
	  * 
	  * @param showAll
	  */
	 public void setShowAll(java.lang.Boolean showAll) {
		 this.showAll = showAll;
	 }


	 /**
	  * Gets the businessStartTime value for this WUClusterJobXLS.
	  * 
	  * @return businessStartTime
	  */
	 public java.lang.String getBusinessStartTime() {
		 return businessStartTime;
	 }


	 /**
	  * Sets the businessStartTime value for this WUClusterJobXLS.
	  * 
	  * @param businessStartTime
	  */
	 public void setBusinessStartTime(java.lang.String businessStartTime) {
		 this.businessStartTime = businessStartTime;
	 }


	 /**
	  * Gets the businessEndTime value for this WUClusterJobXLS.
	  * 
	  * @return businessEndTime
	  */
	 public java.lang.String getBusinessEndTime() {
		 return businessEndTime;
	 }


	 /**
	  * Sets the businessEndTime value for this WUClusterJobXLS.
	  * 
	  * @param businessEndTime
	  */
	 public void setBusinessEndTime(java.lang.String businessEndTime) {
		 this.businessEndTime = businessEndTime;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof WUClusterJobXLS)) {
			return false;
		}
		 WUClusterJobXLS other = (WUClusterJobXLS) obj;
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
				 ((this.cluster==null && other.getCluster()==null) || 
						 (this.cluster!=null &&
						 this.cluster.equals(other.getCluster()))) &&
						 ((this.startDate==null && other.getStartDate()==null) || 
								 (this.startDate!=null &&
								 this.startDate.equals(other.getStartDate()))) &&
								 ((this.endDate==null && other.getEndDate()==null) || 
										 (this.endDate!=null &&
										 this.endDate.equals(other.getEndDate()))) &&
										 ((this.showAll==null && other.getShowAll()==null) || 
												 (this.showAll!=null &&
												 this.showAll.equals(other.getShowAll()))) &&
												 ((this.businessStartTime==null && other.getBusinessStartTime()==null) || 
														 (this.businessStartTime!=null &&
														 this.businessStartTime.equals(other.getBusinessStartTime()))) &&
														 ((this.businessEndTime==null && other.getBusinessEndTime()==null) || 
																 (this.businessEndTime!=null &&
																 this.businessEndTime.equals(other.getBusinessEndTime())));
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
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getStartDate() != null) {
			 _hashCode += getStartDate().hashCode();
		 }
		 if (getEndDate() != null) {
			 _hashCode += getEndDate().hashCode();
		 }
		 if (getShowAll() != null) {
			 _hashCode += getShowAll().hashCode();
		 }
		 if (getBusinessStartTime() != null) {
			 _hashCode += getBusinessStartTime().hashCode();
		 }
		 if (getBusinessEndTime() != null) {
			 _hashCode += getBusinessEndTime().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(WUClusterJobXLS.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobXLS"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("cluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("startDate");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StartDate"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("endDate");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EndDate"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("showAll");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ShowAll"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("businessStartTime");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BusinessStartTime"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("businessEndTime");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BusinessEndTime"));
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
