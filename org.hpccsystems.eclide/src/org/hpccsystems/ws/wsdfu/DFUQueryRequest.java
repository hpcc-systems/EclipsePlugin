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
 * DFUQueryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUQueryRequest  implements java.io.Serializable {
	private java.lang.String prefix;

	private java.lang.String clusterName;

	private java.lang.String logicalName;

	private java.lang.String description;

	private java.lang.String owner;

	private java.lang.String startDate;

	private java.lang.String endDate;

	private java.lang.String fileType;

	private java.lang.Long fileSizeFrom;

	private java.lang.Long fileSizeTo;

	private java.lang.Integer firstN;

	private java.lang.String firstNType;

	private java.lang.Integer pageSize;

	private java.lang.Integer pageStartFrom;

	private java.lang.String sortby;

	private java.lang.Boolean descending;

	private java.lang.Boolean oneLevelDirFileReturn;

	public DFUQueryRequest() {
	}

	public DFUQueryRequest(
			java.lang.String prefix,
			java.lang.String clusterName,
			java.lang.String logicalName,
			java.lang.String description,
			java.lang.String owner,
			java.lang.String startDate,
			java.lang.String endDate,
			java.lang.String fileType,
			java.lang.Long fileSizeFrom,
			java.lang.Long fileSizeTo,
			java.lang.Integer firstN,
			java.lang.String firstNType,
			java.lang.Integer pageSize,
			java.lang.Integer pageStartFrom,
			java.lang.String sortby,
			java.lang.Boolean descending,
			java.lang.Boolean oneLevelDirFileReturn) {
		this.prefix = prefix;
		this.clusterName = clusterName;
		this.logicalName = logicalName;
		this.description = description;
		this.owner = owner;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fileType = fileType;
		this.fileSizeFrom = fileSizeFrom;
		this.fileSizeTo = fileSizeTo;
		this.firstN = firstN;
		this.firstNType = firstNType;
		this.pageSize = pageSize;
		this.pageStartFrom = pageStartFrom;
		this.sortby = sortby;
		this.descending = descending;
		this.oneLevelDirFileReturn = oneLevelDirFileReturn;
	}


	/**
	 * Gets the prefix value for this DFUQueryRequest.
	 * 
	 * @return prefix
	 */
	 public java.lang.String getPrefix() {
		 return prefix;
	 }


	/**
	 * Sets the prefix value for this DFUQueryRequest.
	 * 
	 * @param prefix
	 */
	 public void setPrefix(java.lang.String prefix) {
		 this.prefix = prefix;
	 }


	/**
	 * Gets the clusterName value for this DFUQueryRequest.
	 * 
	 * @return clusterName
	 */
	 public java.lang.String getClusterName() {
		 return clusterName;
	 }


	 /**
	  * Sets the clusterName value for this DFUQueryRequest.
	  * 
	  * @param clusterName
	  */
	 public void setClusterName(java.lang.String clusterName) {
		 this.clusterName = clusterName;
	 }


	 /**
	  * Gets the logicalName value for this DFUQueryRequest.
	  * 
	  * @return logicalName
	  */
	 public java.lang.String getLogicalName() {
		 return logicalName;
	 }


	 /**
	  * Sets the logicalName value for this DFUQueryRequest.
	  * 
	  * @param logicalName
	  */
	 public void setLogicalName(java.lang.String logicalName) {
		 this.logicalName = logicalName;
	 }


	 /**
	  * Gets the description value for this DFUQueryRequest.
	  * 
	  * @return description
	  */
	 public java.lang.String getDescription() {
		 return description;
	 }


	 /**
	  * Sets the description value for this DFUQueryRequest.
	  * 
	  * @param description
	  */
	 public void setDescription(java.lang.String description) {
		 this.description = description;
	 }


	 /**
	  * Gets the owner value for this DFUQueryRequest.
	  * 
	  * @return owner
	  */
	 public java.lang.String getOwner() {
		 return owner;
	 }


	 /**
	  * Sets the owner value for this DFUQueryRequest.
	  * 
	  * @param owner
	  */
	 public void setOwner(java.lang.String owner) {
		 this.owner = owner;
	 }


	 /**
	  * Gets the startDate value for this DFUQueryRequest.
	  * 
	  * @return startDate
	  */
	 public java.lang.String getStartDate() {
		 return startDate;
	 }


	 /**
	  * Sets the startDate value for this DFUQueryRequest.
	  * 
	  * @param startDate
	  */
	 public void setStartDate(java.lang.String startDate) {
		 this.startDate = startDate;
	 }


	 /**
	  * Gets the endDate value for this DFUQueryRequest.
	  * 
	  * @return endDate
	  */
	 public java.lang.String getEndDate() {
		 return endDate;
	 }


	 /**
	  * Sets the endDate value for this DFUQueryRequest.
	  * 
	  * @param endDate
	  */
	 public void setEndDate(java.lang.String endDate) {
		 this.endDate = endDate;
	 }


	 /**
	  * Gets the fileType value for this DFUQueryRequest.
	  * 
	  * @return fileType
	  */
	 public java.lang.String getFileType() {
		 return fileType;
	 }


	 /**
	  * Sets the fileType value for this DFUQueryRequest.
	  * 
	  * @param fileType
	  */
	 public void setFileType(java.lang.String fileType) {
		 this.fileType = fileType;
	 }


	 /**
	  * Gets the fileSizeFrom value for this DFUQueryRequest.
	  * 
	  * @return fileSizeFrom
	  */
	 public java.lang.Long getFileSizeFrom() {
		 return fileSizeFrom;
	 }


	 /**
	  * Sets the fileSizeFrom value for this DFUQueryRequest.
	  * 
	  * @param fileSizeFrom
	  */
	 public void setFileSizeFrom(java.lang.Long fileSizeFrom) {
		 this.fileSizeFrom = fileSizeFrom;
	 }


	 /**
	  * Gets the fileSizeTo value for this DFUQueryRequest.
	  * 
	  * @return fileSizeTo
	  */
	 public java.lang.Long getFileSizeTo() {
		 return fileSizeTo;
	 }


	 /**
	  * Sets the fileSizeTo value for this DFUQueryRequest.
	  * 
	  * @param fileSizeTo
	  */
	 public void setFileSizeTo(java.lang.Long fileSizeTo) {
		 this.fileSizeTo = fileSizeTo;
	 }


	 /**
	  * Gets the firstN value for this DFUQueryRequest.
	  * 
	  * @return firstN
	  */
	 public java.lang.Integer getFirstN() {
		 return firstN;
	 }


	 /**
	  * Sets the firstN value for this DFUQueryRequest.
	  * 
	  * @param firstN
	  */
	 public void setFirstN(java.lang.Integer firstN) {
		 this.firstN = firstN;
	 }


	 /**
	  * Gets the firstNType value for this DFUQueryRequest.
	  * 
	  * @return firstNType
	  */
	 public java.lang.String getFirstNType() {
		 return firstNType;
	 }


	 /**
	  * Sets the firstNType value for this DFUQueryRequest.
	  * 
	  * @param firstNType
	  */
	 public void setFirstNType(java.lang.String firstNType) {
		 this.firstNType = firstNType;
	 }


	 /**
	  * Gets the pageSize value for this DFUQueryRequest.
	  * 
	  * @return pageSize
	  */
	 public java.lang.Integer getPageSize() {
		 return pageSize;
	 }


	 /**
	  * Sets the pageSize value for this DFUQueryRequest.
	  * 
	  * @param pageSize
	  */
	 public void setPageSize(java.lang.Integer pageSize) {
		 this.pageSize = pageSize;
	 }


	 /**
	  * Gets the pageStartFrom value for this DFUQueryRequest.
	  * 
	  * @return pageStartFrom
	  */
	 public java.lang.Integer getPageStartFrom() {
		 return pageStartFrom;
	 }


	 /**
	  * Sets the pageStartFrom value for this DFUQueryRequest.
	  * 
	  * @param pageStartFrom
	  */
	 public void setPageStartFrom(java.lang.Integer pageStartFrom) {
		 this.pageStartFrom = pageStartFrom;
	 }


	 /**
	  * Gets the sortby value for this DFUQueryRequest.
	  * 
	  * @return sortby
	  */
	 public java.lang.String getSortby() {
		 return sortby;
	 }


	 /**
	  * Sets the sortby value for this DFUQueryRequest.
	  * 
	  * @param sortby
	  */
	 public void setSortby(java.lang.String sortby) {
		 this.sortby = sortby;
	 }


	 /**
	  * Gets the descending value for this DFUQueryRequest.
	  * 
	  * @return descending
	  */
	 public java.lang.Boolean getDescending() {
		 return descending;
	 }


	 /**
	  * Sets the descending value for this DFUQueryRequest.
	  * 
	  * @param descending
	  */
	 public void setDescending(java.lang.Boolean descending) {
		 this.descending = descending;
	 }


	 /**
	  * Gets the oneLevelDirFileReturn value for this DFUQueryRequest.
	  * 
	  * @return oneLevelDirFileReturn
	  */
	 public java.lang.Boolean getOneLevelDirFileReturn() {
		 return oneLevelDirFileReturn;
	 }


	 /**
	  * Sets the oneLevelDirFileReturn value for this DFUQueryRequest.
	  * 
	  * @param oneLevelDirFileReturn
	  */
	 public void setOneLevelDirFileReturn(java.lang.Boolean oneLevelDirFileReturn) {
		 this.oneLevelDirFileReturn = oneLevelDirFileReturn;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DFUQueryRequest)) return false;
		 DFUQueryRequest other = (DFUQueryRequest) obj;
		 if (obj == null) return false;
		 if (this == obj) return true;
		 if (__equalsCalc != null) {
			 return (__equalsCalc == obj);
		 }
		 __equalsCalc = obj;
		 boolean _equals;
		 _equals = true && 
				 ((this.prefix==null && other.getPrefix()==null) || 
						 (this.prefix!=null &&
						 this.prefix.equals(other.getPrefix()))) &&
						 ((this.clusterName==null && other.getClusterName()==null) || 
								 (this.clusterName!=null &&
								 this.clusterName.equals(other.getClusterName()))) &&
								 ((this.logicalName==null && other.getLogicalName()==null) || 
										 (this.logicalName!=null &&
										 this.logicalName.equals(other.getLogicalName()))) &&
										 ((this.description==null && other.getDescription()==null) || 
												 (this.description!=null &&
												 this.description.equals(other.getDescription()))) &&
												 ((this.owner==null && other.getOwner()==null) || 
														 (this.owner!=null &&
														 this.owner.equals(other.getOwner()))) &&
														 ((this.startDate==null && other.getStartDate()==null) || 
																 (this.startDate!=null &&
																 this.startDate.equals(other.getStartDate()))) &&
																 ((this.endDate==null && other.getEndDate()==null) || 
																		 (this.endDate!=null &&
																		 this.endDate.equals(other.getEndDate()))) &&
																		 ((this.fileType==null && other.getFileType()==null) || 
																				 (this.fileType!=null &&
																				 this.fileType.equals(other.getFileType()))) &&
																				 ((this.fileSizeFrom==null && other.getFileSizeFrom()==null) || 
																						 (this.fileSizeFrom!=null &&
																						 this.fileSizeFrom.equals(other.getFileSizeFrom()))) &&
																						 ((this.fileSizeTo==null && other.getFileSizeTo()==null) || 
																								 (this.fileSizeTo!=null &&
																								 this.fileSizeTo.equals(other.getFileSizeTo()))) &&
																								 ((this.firstN==null && other.getFirstN()==null) || 
																										 (this.firstN!=null &&
																										 this.firstN.equals(other.getFirstN()))) &&
																										 ((this.firstNType==null && other.getFirstNType()==null) || 
																												 (this.firstNType!=null &&
																												 this.firstNType.equals(other.getFirstNType()))) &&
																												 ((this.pageSize==null && other.getPageSize()==null) || 
																														 (this.pageSize!=null &&
																														 this.pageSize.equals(other.getPageSize()))) &&
																														 ((this.pageStartFrom==null && other.getPageStartFrom()==null) || 
																																 (this.pageStartFrom!=null &&
																																 this.pageStartFrom.equals(other.getPageStartFrom()))) &&
																																 ((this.sortby==null && other.getSortby()==null) || 
																																		 (this.sortby!=null &&
																																		 this.sortby.equals(other.getSortby()))) &&
																																		 ((this.descending==null && other.getDescending()==null) || 
																																				 (this.descending!=null &&
																																				 this.descending.equals(other.getDescending()))) &&
																																				 ((this.oneLevelDirFileReturn==null && other.getOneLevelDirFileReturn()==null) || 
																																						 (this.oneLevelDirFileReturn!=null &&
																																						 this.oneLevelDirFileReturn.equals(other.getOneLevelDirFileReturn())));
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
		 if (getPrefix() != null) {
			 _hashCode += getPrefix().hashCode();
		 }
		 if (getClusterName() != null) {
			 _hashCode += getClusterName().hashCode();
		 }
		 if (getLogicalName() != null) {
			 _hashCode += getLogicalName().hashCode();
		 }
		 if (getDescription() != null) {
			 _hashCode += getDescription().hashCode();
		 }
		 if (getOwner() != null) {
			 _hashCode += getOwner().hashCode();
		 }
		 if (getStartDate() != null) {
			 _hashCode += getStartDate().hashCode();
		 }
		 if (getEndDate() != null) {
			 _hashCode += getEndDate().hashCode();
		 }
		 if (getFileType() != null) {
			 _hashCode += getFileType().hashCode();
		 }
		 if (getFileSizeFrom() != null) {
			 _hashCode += getFileSizeFrom().hashCode();
		 }
		 if (getFileSizeTo() != null) {
			 _hashCode += getFileSizeTo().hashCode();
		 }
		 if (getFirstN() != null) {
			 _hashCode += getFirstN().hashCode();
		 }
		 if (getFirstNType() != null) {
			 _hashCode += getFirstNType().hashCode();
		 }
		 if (getPageSize() != null) {
			 _hashCode += getPageSize().hashCode();
		 }
		 if (getPageStartFrom() != null) {
			 _hashCode += getPageStartFrom().hashCode();
		 }
		 if (getSortby() != null) {
			 _hashCode += getSortby().hashCode();
		 }
		 if (getDescending() != null) {
			 _hashCode += getDescending().hashCode();
		 }
		 if (getOneLevelDirFileReturn() != null) {
			 _hashCode += getOneLevelDirFileReturn().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
			 new org.apache.axis.description.TypeDesc(DFUQueryRequest.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUQueryRequest"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("prefix");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Prefix"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("clusterName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ClusterName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("logicalName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("description");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Description"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("owner");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Owner"));
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
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("fileType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("fileSizeFrom");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileSizeFrom"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("fileSizeTo");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileSizeTo"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("firstN");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FirstN"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("firstNType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FirstNType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pageSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PageSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pageStartFrom");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PageStartFrom"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sortby");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Sortby"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("descending");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Descending"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("oneLevelDirFileReturn");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "OneLevelDirFileReturn"));
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
