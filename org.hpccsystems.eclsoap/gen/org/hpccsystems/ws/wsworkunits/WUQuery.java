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
 * WUQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUQuery  implements java.io.Serializable {
	private java.lang.String wuid;

	private java.lang.String type;

	private java.lang.String cluster;

	private java.lang.String roxieCluster;

	private java.lang.String owner;

	private java.lang.String state;

	private java.lang.String startDate;

	private java.lang.String endDate;

	private java.lang.String ECL;

	private java.lang.String jobname;

	private java.lang.String logicalFile;

	private java.lang.String logicalFileSearchType;

	private java.lang.String applicationName;

	private java.lang.String applicationKey;

	private java.lang.String applicationData;

	private java.lang.String after;

	private java.lang.String before;

	private java.lang.Integer count;

	private java.lang.Long pageSize;

	private java.lang.Long pageStartFrom;

	private java.lang.Long pageEndAt;

	private java.lang.Integer lastNDays;

	private java.lang.String sortby;

	private java.lang.Boolean descending;

	public WUQuery() {
	}

	public WUQuery(
			java.lang.String wuid,
			java.lang.String type,
			java.lang.String cluster,
			java.lang.String roxieCluster,
			java.lang.String owner,
			java.lang.String state,
			java.lang.String startDate,
			java.lang.String endDate,
			java.lang.String ECL,
			java.lang.String jobname,
			java.lang.String logicalFile,
			java.lang.String logicalFileSearchType,
			java.lang.String applicationName,
			java.lang.String applicationKey,
			java.lang.String applicationData,
			java.lang.String after,
			java.lang.String before,
			java.lang.Integer count,
			java.lang.Long pageSize,
			java.lang.Long pageStartFrom,
			java.lang.Long pageEndAt,
			java.lang.Integer lastNDays,
			java.lang.String sortby,
			java.lang.Boolean descending) {
		this.wuid = wuid;
		this.type = type;
		this.cluster = cluster;
		this.roxieCluster = roxieCluster;
		this.owner = owner;
		this.state = state;
		this.startDate = startDate;
		this.endDate = endDate;
		this.ECL = ECL;
		this.jobname = jobname;
		this.logicalFile = logicalFile;
		this.logicalFileSearchType = logicalFileSearchType;
		this.applicationName = applicationName;
		this.applicationKey = applicationKey;
		this.applicationData = applicationData;
		this.after = after;
		this.before = before;
		this.count = count;
		this.pageSize = pageSize;
		this.pageStartFrom = pageStartFrom;
		this.pageEndAt = pageEndAt;
		this.lastNDays = lastNDays;
		this.sortby = sortby;
		this.descending = descending;
	}


	/**
	 * Gets the wuid value for this WUQuery.
	 * 
	 * @return wuid
	 */
	 public java.lang.String getWuid() {
		 return wuid;
	 }


	/**
	 * Sets the wuid value for this WUQuery.
	 * 
	 * @param wuid
	 */
	 public void setWuid(java.lang.String wuid) {
		 this.wuid = wuid;
	 }


	/**
	 * Gets the type value for this WUQuery.
	 * 
	 * @return type
	 */
	 public java.lang.String getType() {
		 return type;
	 }


	/**
	 * Sets the type value for this WUQuery.
	 * 
	 * @param type
	 */
	 public void setType(java.lang.String type) {
		 this.type = type;
	 }


	 /**
	  * Gets the cluster value for this WUQuery.
	  * 
	  * @return cluster
	  */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this WUQuery.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the roxieCluster value for this WUQuery.
	  * 
	  * @return roxieCluster
	  */
	 public java.lang.String getRoxieCluster() {
		 return roxieCluster;
	 }


	 /**
	  * Sets the roxieCluster value for this WUQuery.
	  * 
	  * @param roxieCluster
	  */
	 public void setRoxieCluster(java.lang.String roxieCluster) {
		 this.roxieCluster = roxieCluster;
	 }


	 /**
	  * Gets the owner value for this WUQuery.
	  * 
	  * @return owner
	  */
	 public java.lang.String getOwner() {
		 return owner;
	 }


	 /**
	  * Sets the owner value for this WUQuery.
	  * 
	  * @param owner
	  */
	 public void setOwner(java.lang.String owner) {
		 this.owner = owner;
	 }


	 /**
	  * Gets the state value for this WUQuery.
	  * 
	  * @return state
	  */
	 public java.lang.String getState() {
		 return state;
	 }


	 /**
	  * Sets the state value for this WUQuery.
	  * 
	  * @param state
	  */
	 public void setState(java.lang.String state) {
		 this.state = state;
	 }


	 /**
	  * Gets the startDate value for this WUQuery.
	  * 
	  * @return startDate
	  */
	 public java.lang.String getStartDate() {
		 return startDate;
	 }


	 /**
	  * Sets the startDate value for this WUQuery.
	  * 
	  * @param startDate
	  */
	 public void setStartDate(java.lang.String startDate) {
		 this.startDate = startDate;
	 }


	 /**
	  * Gets the endDate value for this WUQuery.
	  * 
	  * @return endDate
	  */
	 public java.lang.String getEndDate() {
		 return endDate;
	 }


	 /**
	  * Sets the endDate value for this WUQuery.
	  * 
	  * @param endDate
	  */
	 public void setEndDate(java.lang.String endDate) {
		 this.endDate = endDate;
	 }


	 /**
	  * Gets the ECL value for this WUQuery.
	  * 
	  * @return ECL
	  */
	 public java.lang.String getECL() {
		 return ECL;
	 }


	 /**
	  * Sets the ECL value for this WUQuery.
	  * 
	  * @param ECL
	  */
	 public void setECL(java.lang.String ECL) {
		 this.ECL = ECL;
	 }


	 /**
	  * Gets the jobname value for this WUQuery.
	  * 
	  * @return jobname
	  */
	 public java.lang.String getJobname() {
		 return jobname;
	 }


	 /**
	  * Sets the jobname value for this WUQuery.
	  * 
	  * @param jobname
	  */
	 public void setJobname(java.lang.String jobname) {
		 this.jobname = jobname;
	 }


	 /**
	  * Gets the logicalFile value for this WUQuery.
	  * 
	  * @return logicalFile
	  */
	 public java.lang.String getLogicalFile() {
		 return logicalFile;
	 }


	 /**
	  * Sets the logicalFile value for this WUQuery.
	  * 
	  * @param logicalFile
	  */
	 public void setLogicalFile(java.lang.String logicalFile) {
		 this.logicalFile = logicalFile;
	 }


	 /**
	  * Gets the logicalFileSearchType value for this WUQuery.
	  * 
	  * @return logicalFileSearchType
	  */
	 public java.lang.String getLogicalFileSearchType() {
		 return logicalFileSearchType;
	 }


	 /**
	  * Sets the logicalFileSearchType value for this WUQuery.
	  * 
	  * @param logicalFileSearchType
	  */
	 public void setLogicalFileSearchType(java.lang.String logicalFileSearchType) {
		 this.logicalFileSearchType = logicalFileSearchType;
	 }


	 /**
	  * Gets the applicationName value for this WUQuery.
	  * 
	  * @return applicationName
	  */
	 public java.lang.String getApplicationName() {
		 return applicationName;
	 }


	 /**
	  * Sets the applicationName value for this WUQuery.
	  * 
	  * @param applicationName
	  */
	 public void setApplicationName(java.lang.String applicationName) {
		 this.applicationName = applicationName;
	 }


	 /**
	  * Gets the applicationKey value for this WUQuery.
	  * 
	  * @return applicationKey
	  */
	 public java.lang.String getApplicationKey() {
		 return applicationKey;
	 }


	 /**
	  * Sets the applicationKey value for this WUQuery.
	  * 
	  * @param applicationKey
	  */
	 public void setApplicationKey(java.lang.String applicationKey) {
		 this.applicationKey = applicationKey;
	 }


	 /**
	  * Gets the applicationData value for this WUQuery.
	  * 
	  * @return applicationData
	  */
	 public java.lang.String getApplicationData() {
		 return applicationData;
	 }


	 /**
	  * Sets the applicationData value for this WUQuery.
	  * 
	  * @param applicationData
	  */
	 public void setApplicationData(java.lang.String applicationData) {
		 this.applicationData = applicationData;
	 }


	 /**
	  * Gets the after value for this WUQuery.
	  * 
	  * @return after
	  */
	 public java.lang.String getAfter() {
		 return after;
	 }


	 /**
	  * Sets the after value for this WUQuery.
	  * 
	  * @param after
	  */
	 public void setAfter(java.lang.String after) {
		 this.after = after;
	 }


	 /**
	  * Gets the before value for this WUQuery.
	  * 
	  * @return before
	  */
	 public java.lang.String getBefore() {
		 return before;
	 }


	 /**
	  * Sets the before value for this WUQuery.
	  * 
	  * @param before
	  */
	 public void setBefore(java.lang.String before) {
		 this.before = before;
	 }


	 /**
	  * Gets the count value for this WUQuery.
	  * 
	  * @return count
	  */
	 public java.lang.Integer getCount() {
		 return count;
	 }


	 /**
	  * Sets the count value for this WUQuery.
	  * 
	  * @param count
	  */
	 public void setCount(java.lang.Integer count) {
		 this.count = count;
	 }


	 /**
	  * Gets the pageSize value for this WUQuery.
	  * 
	  * @return pageSize
	  */
	 public java.lang.Long getPageSize() {
		 return pageSize;
	 }


	 /**
	  * Sets the pageSize value for this WUQuery.
	  * 
	  * @param pageSize
	  */
	 public void setPageSize(java.lang.Long pageSize) {
		 this.pageSize = pageSize;
	 }


	 /**
	  * Gets the pageStartFrom value for this WUQuery.
	  * 
	  * @return pageStartFrom
	  */
	 public java.lang.Long getPageStartFrom() {
		 return pageStartFrom;
	 }


	 /**
	  * Sets the pageStartFrom value for this WUQuery.
	  * 
	  * @param pageStartFrom
	  */
	 public void setPageStartFrom(java.lang.Long pageStartFrom) {
		 this.pageStartFrom = pageStartFrom;
	 }


	 /**
	  * Gets the pageEndAt value for this WUQuery.
	  * 
	  * @return pageEndAt
	  */
	 public java.lang.Long getPageEndAt() {
		 return pageEndAt;
	 }


	 /**
	  * Sets the pageEndAt value for this WUQuery.
	  * 
	  * @param pageEndAt
	  */
	 public void setPageEndAt(java.lang.Long pageEndAt) {
		 this.pageEndAt = pageEndAt;
	 }


	 /**
	  * Gets the lastNDays value for this WUQuery.
	  * 
	  * @return lastNDays
	  */
	 public java.lang.Integer getLastNDays() {
		 return lastNDays;
	 }


	 /**
	  * Sets the lastNDays value for this WUQuery.
	  * 
	  * @param lastNDays
	  */
	 public void setLastNDays(java.lang.Integer lastNDays) {
		 this.lastNDays = lastNDays;
	 }


	 /**
	  * Gets the sortby value for this WUQuery.
	  * 
	  * @return sortby
	  */
	 public java.lang.String getSortby() {
		 return sortby;
	 }


	 /**
	  * Sets the sortby value for this WUQuery.
	  * 
	  * @param sortby
	  */
	 public void setSortby(java.lang.String sortby) {
		 this.sortby = sortby;
	 }


	 /**
	  * Gets the descending value for this WUQuery.
	  * 
	  * @return descending
	  */
	 public java.lang.Boolean getDescending() {
		 return descending;
	 }


	 /**
	  * Sets the descending value for this WUQuery.
	  * 
	  * @param descending
	  */
	 public void setDescending(java.lang.Boolean descending) {
		 this.descending = descending;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof WUQuery)) {
			return false;
		}
		 WUQuery other = (WUQuery) obj;
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
				 ((this.wuid==null && other.getWuid()==null) || 
						 (this.wuid!=null &&
						 this.wuid.equals(other.getWuid()))) &&
						 ((this.type==null && other.getType()==null) || 
								 (this.type!=null &&
								 this.type.equals(other.getType()))) &&
								 ((this.cluster==null && other.getCluster()==null) || 
										 (this.cluster!=null &&
										 this.cluster.equals(other.getCluster()))) &&
										 ((this.roxieCluster==null && other.getRoxieCluster()==null) || 
												 (this.roxieCluster!=null &&
												 this.roxieCluster.equals(other.getRoxieCluster()))) &&
												 ((this.owner==null && other.getOwner()==null) || 
														 (this.owner!=null &&
														 this.owner.equals(other.getOwner()))) &&
														 ((this.state==null && other.getState()==null) || 
																 (this.state!=null &&
																 this.state.equals(other.getState()))) &&
																 ((this.startDate==null && other.getStartDate()==null) || 
																		 (this.startDate!=null &&
																		 this.startDate.equals(other.getStartDate()))) &&
																		 ((this.endDate==null && other.getEndDate()==null) || 
																				 (this.endDate!=null &&
																				 this.endDate.equals(other.getEndDate()))) &&
																				 ((this.ECL==null && other.getECL()==null) || 
																						 (this.ECL!=null &&
																						 this.ECL.equals(other.getECL()))) &&
																						 ((this.jobname==null && other.getJobname()==null) || 
																								 (this.jobname!=null &&
																								 this.jobname.equals(other.getJobname()))) &&
																								 ((this.logicalFile==null && other.getLogicalFile()==null) || 
																										 (this.logicalFile!=null &&
																										 this.logicalFile.equals(other.getLogicalFile()))) &&
																										 ((this.logicalFileSearchType==null && other.getLogicalFileSearchType()==null) || 
																												 (this.logicalFileSearchType!=null &&
																												 this.logicalFileSearchType.equals(other.getLogicalFileSearchType()))) &&
																												 ((this.applicationName==null && other.getApplicationName()==null) || 
																														 (this.applicationName!=null &&
																														 this.applicationName.equals(other.getApplicationName()))) &&
																														 ((this.applicationKey==null && other.getApplicationKey()==null) || 
																																 (this.applicationKey!=null &&
																																 this.applicationKey.equals(other.getApplicationKey()))) &&
																																 ((this.applicationData==null && other.getApplicationData()==null) || 
																																		 (this.applicationData!=null &&
																																		 this.applicationData.equals(other.getApplicationData()))) &&
																																		 ((this.after==null && other.getAfter()==null) || 
																																				 (this.after!=null &&
																																				 this.after.equals(other.getAfter()))) &&
																																				 ((this.before==null && other.getBefore()==null) || 
																																						 (this.before!=null &&
																																						 this.before.equals(other.getBefore()))) &&
																																						 ((this.count==null && other.getCount()==null) || 
																																								 (this.count!=null &&
																																								 this.count.equals(other.getCount()))) &&
																																								 ((this.pageSize==null && other.getPageSize()==null) || 
																																										 (this.pageSize!=null &&
																																										 this.pageSize.equals(other.getPageSize()))) &&
																																										 ((this.pageStartFrom==null && other.getPageStartFrom()==null) || 
																																												 (this.pageStartFrom!=null &&
																																												 this.pageStartFrom.equals(other.getPageStartFrom()))) &&
																																												 ((this.pageEndAt==null && other.getPageEndAt()==null) || 
																																														 (this.pageEndAt!=null &&
																																														 this.pageEndAt.equals(other.getPageEndAt()))) &&
																																														 ((this.lastNDays==null && other.getLastNDays()==null) || 
																																																 (this.lastNDays!=null &&
																																																 this.lastNDays.equals(other.getLastNDays()))) &&
																																																 ((this.sortby==null && other.getSortby()==null) || 
																																																		 (this.sortby!=null &&
																																																		 this.sortby.equals(other.getSortby()))) &&
																																																		 ((this.descending==null && other.getDescending()==null) || 
																																																				 (this.descending!=null &&
																																																				 this.descending.equals(other.getDescending())));
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
		 if (getType() != null) {
			 _hashCode += getType().hashCode();
		 }
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getRoxieCluster() != null) {
			 _hashCode += getRoxieCluster().hashCode();
		 }
		 if (getOwner() != null) {
			 _hashCode += getOwner().hashCode();
		 }
		 if (getState() != null) {
			 _hashCode += getState().hashCode();
		 }
		 if (getStartDate() != null) {
			 _hashCode += getStartDate().hashCode();
		 }
		 if (getEndDate() != null) {
			 _hashCode += getEndDate().hashCode();
		 }
		 if (getECL() != null) {
			 _hashCode += getECL().hashCode();
		 }
		 if (getJobname() != null) {
			 _hashCode += getJobname().hashCode();
		 }
		 if (getLogicalFile() != null) {
			 _hashCode += getLogicalFile().hashCode();
		 }
		 if (getLogicalFileSearchType() != null) {
			 _hashCode += getLogicalFileSearchType().hashCode();
		 }
		 if (getApplicationName() != null) {
			 _hashCode += getApplicationName().hashCode();
		 }
		 if (getApplicationKey() != null) {
			 _hashCode += getApplicationKey().hashCode();
		 }
		 if (getApplicationData() != null) {
			 _hashCode += getApplicationData().hashCode();
		 }
		 if (getAfter() != null) {
			 _hashCode += getAfter().hashCode();
		 }
		 if (getBefore() != null) {
			 _hashCode += getBefore().hashCode();
		 }
		 if (getCount() != null) {
			 _hashCode += getCount().hashCode();
		 }
		 if (getPageSize() != null) {
			 _hashCode += getPageSize().hashCode();
		 }
		 if (getPageStartFrom() != null) {
			 _hashCode += getPageStartFrom().hashCode();
		 }
		 if (getPageEndAt() != null) {
			 _hashCode += getPageEndAt().hashCode();
		 }
		 if (getLastNDays() != null) {
			 _hashCode += getLastNDays().hashCode();
		 }
		 if (getSortby() != null) {
			 _hashCode += getSortby().hashCode();
		 }
		 if (getDescending() != null) {
			 _hashCode += getDescending().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(WUQuery.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuery"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wuid");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("type");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Type"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("cluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("roxieCluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RoxieCluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("owner");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Owner"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("state");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "State"));
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
		 elemField.setFieldName("ECL");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECL"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("jobname");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Jobname"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("logicalFile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("logicalFileSearchType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileSearchType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("applicationName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("applicationKey");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationKey"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("applicationData");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationData"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("after");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "After"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("before");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Before"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("count");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Count"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pageSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pageStartFrom");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageStartFrom"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pageEndAt");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageEndAt"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("lastNDays");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LastNDays"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sortby");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Sortby"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("descending");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Descending"));
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
