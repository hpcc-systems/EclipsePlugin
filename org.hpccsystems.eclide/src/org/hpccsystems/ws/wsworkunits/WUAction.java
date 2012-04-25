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
 * WUAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUAction  implements java.io.Serializable {
	private java.lang.String[] wuids;

	private java.lang.String actionType;

	private java.lang.String cluster;

	private java.lang.String owner;

	private java.lang.String state;

	private java.lang.String startDate;

	private java.lang.String endDate;

	private java.lang.String ECL;

	private java.lang.String jobname;

	private java.lang.String test;

	private java.lang.String currentPage;

	private java.lang.String pageSize;

	private java.lang.String sortby;

	private java.lang.Boolean descending;

	private java.lang.String eventServer;

	private java.lang.String eventName;

	private java.lang.String pageFrom;

	private java.lang.Integer blockTillFinishTimer;

	public WUAction() {
	}

	public WUAction(
			java.lang.String[] wuids,
			java.lang.String actionType,
			java.lang.String cluster,
			java.lang.String owner,
			java.lang.String state,
			java.lang.String startDate,
			java.lang.String endDate,
			java.lang.String ECL,
			java.lang.String jobname,
			java.lang.String test,
			java.lang.String currentPage,
			java.lang.String pageSize,
			java.lang.String sortby,
			java.lang.Boolean descending,
			java.lang.String eventServer,
			java.lang.String eventName,
			java.lang.String pageFrom,
			java.lang.Integer blockTillFinishTimer) {
		this.wuids = wuids;
		this.actionType = actionType;
		this.cluster = cluster;
		this.owner = owner;
		this.state = state;
		this.startDate = startDate;
		this.endDate = endDate;
		this.ECL = ECL;
		this.jobname = jobname;
		this.test = test;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.sortby = sortby;
		this.descending = descending;
		this.eventServer = eventServer;
		this.eventName = eventName;
		this.pageFrom = pageFrom;
		this.blockTillFinishTimer = blockTillFinishTimer;
	}


	/**
	 * Gets the wuids value for this WUAction.
	 * 
	 * @return wuids
	 */
	 public java.lang.String[] getWuids() {
		 return wuids;
	 }


	/**
	 * Sets the wuids value for this WUAction.
	 * 
	 * @param wuids
	 */
	 public void setWuids(java.lang.String[] wuids) {
		 this.wuids = wuids;
	 }


	/**
	 * Gets the actionType value for this WUAction.
	 * 
	 * @return actionType
	 */
	 public java.lang.String getActionType() {
		 return actionType;
	 }


	 /**
	  * Sets the actionType value for this WUAction.
	  * 
	  * @param actionType
	  */
	 public void setActionType(java.lang.String actionType) {
		 this.actionType = actionType;
	 }


	 /**
	  * Gets the cluster value for this WUAction.
	  * 
	  * @return cluster
	  */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this WUAction.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the owner value for this WUAction.
	  * 
	  * @return owner
	  */
	 public java.lang.String getOwner() {
		 return owner;
	 }


	 /**
	  * Sets the owner value for this WUAction.
	  * 
	  * @param owner
	  */
	 public void setOwner(java.lang.String owner) {
		 this.owner = owner;
	 }


	 /**
	  * Gets the state value for this WUAction.
	  * 
	  * @return state
	  */
	 public java.lang.String getState() {
		 return state;
	 }


	 /**
	  * Sets the state value for this WUAction.
	  * 
	  * @param state
	  */
	 public void setState(java.lang.String state) {
		 this.state = state;
	 }


	 /**
	  * Gets the startDate value for this WUAction.
	  * 
	  * @return startDate
	  */
	 public java.lang.String getStartDate() {
		 return startDate;
	 }


	 /**
	  * Sets the startDate value for this WUAction.
	  * 
	  * @param startDate
	  */
	 public void setStartDate(java.lang.String startDate) {
		 this.startDate = startDate;
	 }


	 /**
	  * Gets the endDate value for this WUAction.
	  * 
	  * @return endDate
	  */
	 public java.lang.String getEndDate() {
		 return endDate;
	 }


	 /**
	  * Sets the endDate value for this WUAction.
	  * 
	  * @param endDate
	  */
	 public void setEndDate(java.lang.String endDate) {
		 this.endDate = endDate;
	 }


	 /**
	  * Gets the ECL value for this WUAction.
	  * 
	  * @return ECL
	  */
	 public java.lang.String getECL() {
		 return ECL;
	 }


	 /**
	  * Sets the ECL value for this WUAction.
	  * 
	  * @param ECL
	  */
	 public void setECL(java.lang.String ECL) {
		 this.ECL = ECL;
	 }


	 /**
	  * Gets the jobname value for this WUAction.
	  * 
	  * @return jobname
	  */
	 public java.lang.String getJobname() {
		 return jobname;
	 }


	 /**
	  * Sets the jobname value for this WUAction.
	  * 
	  * @param jobname
	  */
	 public void setJobname(java.lang.String jobname) {
		 this.jobname = jobname;
	 }


	 /**
	  * Gets the test value for this WUAction.
	  * 
	  * @return test
	  */
	 public java.lang.String getTest() {
		 return test;
	 }


	 /**
	  * Sets the test value for this WUAction.
	  * 
	  * @param test
	  */
	 public void setTest(java.lang.String test) {
		 this.test = test;
	 }


	 /**
	  * Gets the currentPage value for this WUAction.
	  * 
	  * @return currentPage
	  */
	 public java.lang.String getCurrentPage() {
		 return currentPage;
	 }


	 /**
	  * Sets the currentPage value for this WUAction.
	  * 
	  * @param currentPage
	  */
	 public void setCurrentPage(java.lang.String currentPage) {
		 this.currentPage = currentPage;
	 }


	 /**
	  * Gets the pageSize value for this WUAction.
	  * 
	  * @return pageSize
	  */
	 public java.lang.String getPageSize() {
		 return pageSize;
	 }


	 /**
	  * Sets the pageSize value for this WUAction.
	  * 
	  * @param pageSize
	  */
	 public void setPageSize(java.lang.String pageSize) {
		 this.pageSize = pageSize;
	 }


	 /**
	  * Gets the sortby value for this WUAction.
	  * 
	  * @return sortby
	  */
	 public java.lang.String getSortby() {
		 return sortby;
	 }


	 /**
	  * Sets the sortby value for this WUAction.
	  * 
	  * @param sortby
	  */
	 public void setSortby(java.lang.String sortby) {
		 this.sortby = sortby;
	 }


	 /**
	  * Gets the descending value for this WUAction.
	  * 
	  * @return descending
	  */
	 public java.lang.Boolean getDescending() {
		 return descending;
	 }


	 /**
	  * Sets the descending value for this WUAction.
	  * 
	  * @param descending
	  */
	 public void setDescending(java.lang.Boolean descending) {
		 this.descending = descending;
	 }


	 /**
	  * Gets the eventServer value for this WUAction.
	  * 
	  * @return eventServer
	  */
	 public java.lang.String getEventServer() {
		 return eventServer;
	 }


	 /**
	  * Sets the eventServer value for this WUAction.
	  * 
	  * @param eventServer
	  */
	 public void setEventServer(java.lang.String eventServer) {
		 this.eventServer = eventServer;
	 }


	 /**
	  * Gets the eventName value for this WUAction.
	  * 
	  * @return eventName
	  */
	 public java.lang.String getEventName() {
		 return eventName;
	 }


	 /**
	  * Sets the eventName value for this WUAction.
	  * 
	  * @param eventName
	  */
	 public void setEventName(java.lang.String eventName) {
		 this.eventName = eventName;
	 }


	 /**
	  * Gets the pageFrom value for this WUAction.
	  * 
	  * @return pageFrom
	  */
	 public java.lang.String getPageFrom() {
		 return pageFrom;
	 }


	 /**
	  * Sets the pageFrom value for this WUAction.
	  * 
	  * @param pageFrom
	  */
	 public void setPageFrom(java.lang.String pageFrom) {
		 this.pageFrom = pageFrom;
	 }


	 /**
	  * Gets the blockTillFinishTimer value for this WUAction.
	  * 
	  * @return blockTillFinishTimer
	  */
	 public java.lang.Integer getBlockTillFinishTimer() {
		 return blockTillFinishTimer;
	 }


	 /**
	  * Sets the blockTillFinishTimer value for this WUAction.
	  * 
	  * @param blockTillFinishTimer
	  */
	 public void setBlockTillFinishTimer(java.lang.Integer blockTillFinishTimer) {
		 this.blockTillFinishTimer = blockTillFinishTimer;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof WUAction)) return false;
		 WUAction other = (WUAction) obj;
		 if (obj == null) return false;
		 if (this == obj) return true;
		 if (__equalsCalc != null) {
			 return (__equalsCalc == obj);
		 }
		 __equalsCalc = obj;
		 boolean _equals;
		 _equals = true && 
				 ((this.wuids==null && other.getWuids()==null) || 
						 (this.wuids!=null &&
						 java.util.Arrays.equals(this.wuids, other.getWuids()))) &&
						 ((this.actionType==null && other.getActionType()==null) || 
								 (this.actionType!=null &&
								 this.actionType.equals(other.getActionType()))) &&
								 ((this.cluster==null && other.getCluster()==null) || 
										 (this.cluster!=null &&
										 this.cluster.equals(other.getCluster()))) &&
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
																						 ((this.test==null && other.getTest()==null) || 
																								 (this.test!=null &&
																								 this.test.equals(other.getTest()))) &&
																								 ((this.currentPage==null && other.getCurrentPage()==null) || 
																										 (this.currentPage!=null &&
																										 this.currentPage.equals(other.getCurrentPage()))) &&
																										 ((this.pageSize==null && other.getPageSize()==null) || 
																												 (this.pageSize!=null &&
																												 this.pageSize.equals(other.getPageSize()))) &&
																												 ((this.sortby==null && other.getSortby()==null) || 
																														 (this.sortby!=null &&
																														 this.sortby.equals(other.getSortby()))) &&
																														 ((this.descending==null && other.getDescending()==null) || 
																																 (this.descending!=null &&
																																 this.descending.equals(other.getDescending()))) &&
																																 ((this.eventServer==null && other.getEventServer()==null) || 
																																		 (this.eventServer!=null &&
																																		 this.eventServer.equals(other.getEventServer()))) &&
																																		 ((this.eventName==null && other.getEventName()==null) || 
																																				 (this.eventName!=null &&
																																				 this.eventName.equals(other.getEventName()))) &&
																																				 ((this.pageFrom==null && other.getPageFrom()==null) || 
																																						 (this.pageFrom!=null &&
																																						 this.pageFrom.equals(other.getPageFrom()))) &&
																																						 ((this.blockTillFinishTimer==null && other.getBlockTillFinishTimer()==null) || 
																																								 (this.blockTillFinishTimer!=null &&
																																								 this.blockTillFinishTimer.equals(other.getBlockTillFinishTimer())));
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
		 if (getWuids() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getWuids());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getWuids(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getActionType() != null) {
			 _hashCode += getActionType().hashCode();
		 }
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
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
		 if (getTest() != null) {
			 _hashCode += getTest().hashCode();
		 }
		 if (getCurrentPage() != null) {
			 _hashCode += getCurrentPage().hashCode();
		 }
		 if (getPageSize() != null) {
			 _hashCode += getPageSize().hashCode();
		 }
		 if (getSortby() != null) {
			 _hashCode += getSortby().hashCode();
		 }
		 if (getDescending() != null) {
			 _hashCode += getDescending().hashCode();
		 }
		 if (getEventServer() != null) {
			 _hashCode += getEventServer().hashCode();
		 }
		 if (getEventName() != null) {
			 _hashCode += getEventName().hashCode();
		 }
		 if (getPageFrom() != null) {
			 _hashCode += getPageFrom().hashCode();
		 }
		 if (getBlockTillFinishTimer() != null) {
			 _hashCode += getBlockTillFinishTimer().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
			 new org.apache.axis.description.TypeDesc(WUAction.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAction"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wuids");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuids"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Item"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("actionType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ActionType"));
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
		 elemField.setFieldName("test");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Test"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("currentPage");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CurrentPage"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pageSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("eventServer");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EventServer"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("eventName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EventName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pageFrom");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageFrom"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("blockTillFinishTimer");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BlockTillFinishTimer"));
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
