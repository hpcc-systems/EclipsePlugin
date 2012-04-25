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
 * GetDFUWorkunitsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class GetDFUWorkunitsResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.filespray.ArrayOfEspException exceptions;

	private org.hpccsystems.ws.filespray.DFUWorkunit[] results;

	private java.lang.String type;

	private java.lang.String owner;

	private java.lang.String cluster;

	private java.lang.String stateReq;

	private java.lang.Long pageSize;

	private java.lang.Long prevPage;

	private java.lang.Long nextPage;

	private java.lang.Long lastPage;

	private java.lang.Long numWUs;

	private java.lang.Long pageStartFrom;

	private java.lang.Long pageEndAt;

	private java.lang.Boolean first;

	private java.lang.String sortby;

	private java.lang.Boolean descending;

	private java.lang.String basicQuery;

	private java.lang.String filters;

	public GetDFUWorkunitsResponse() {
	}

	public GetDFUWorkunitsResponse(
			org.hpccsystems.ws.filespray.ArrayOfEspException exceptions,
			org.hpccsystems.ws.filespray.DFUWorkunit[] results,
			java.lang.String type,
			java.lang.String owner,
			java.lang.String cluster,
			java.lang.String stateReq,
			java.lang.Long pageSize,
			java.lang.Long prevPage,
			java.lang.Long nextPage,
			java.lang.Long lastPage,
			java.lang.Long numWUs,
			java.lang.Long pageStartFrom,
			java.lang.Long pageEndAt,
			java.lang.Boolean first,
			java.lang.String sortby,
			java.lang.Boolean descending,
			java.lang.String basicQuery,
			java.lang.String filters) {
		this.exceptions = exceptions;
		this.results = results;
		this.type = type;
		this.owner = owner;
		this.cluster = cluster;
		this.stateReq = stateReq;
		this.pageSize = pageSize;
		this.prevPage = prevPage;
		this.nextPage = nextPage;
		this.lastPage = lastPage;
		this.numWUs = numWUs;
		this.pageStartFrom = pageStartFrom;
		this.pageEndAt = pageEndAt;
		this.first = first;
		this.sortby = sortby;
		this.descending = descending;
		this.basicQuery = basicQuery;
		this.filters = filters;
	}


	/**
	 * Gets the exceptions value for this GetDFUWorkunitsResponse.
	 * 
	 * @return exceptions
	 */
	 public org.hpccsystems.ws.filespray.ArrayOfEspException getExceptions() {
		 return exceptions;
	 }


	/**
	 * Sets the exceptions value for this GetDFUWorkunitsResponse.
	 * 
	 * @param exceptions
	 */
	 public void setExceptions(org.hpccsystems.ws.filespray.ArrayOfEspException exceptions) {
		 this.exceptions = exceptions;
	 }


	 /**
	  * Gets the results value for this GetDFUWorkunitsResponse.
	  * 
	  * @return results
	  */
	 public org.hpccsystems.ws.filespray.DFUWorkunit[] getResults() {
		 return results;
	 }


	 /**
	  * Sets the results value for this GetDFUWorkunitsResponse.
	  * 
	  * @param results
	  */
	 public void setResults(org.hpccsystems.ws.filespray.DFUWorkunit[] results) {
		 this.results = results;
	 }


	 /**
	  * Gets the type value for this GetDFUWorkunitsResponse.
	  * 
	  * @return type
	  */
	 public java.lang.String getType() {
		 return type;
	 }


	 /**
	  * Sets the type value for this GetDFUWorkunitsResponse.
	  * 
	  * @param type
	  */
	 public void setType(java.lang.String type) {
		 this.type = type;
	 }


	 /**
	  * Gets the owner value for this GetDFUWorkunitsResponse.
	  * 
	  * @return owner
	  */
	 public java.lang.String getOwner() {
		 return owner;
	 }


	 /**
	  * Sets the owner value for this GetDFUWorkunitsResponse.
	  * 
	  * @param owner
	  */
	 public void setOwner(java.lang.String owner) {
		 this.owner = owner;
	 }


	 /**
	  * Gets the cluster value for this GetDFUWorkunitsResponse.
	  * 
	  * @return cluster
	  */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this GetDFUWorkunitsResponse.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the stateReq value for this GetDFUWorkunitsResponse.
	  * 
	  * @return stateReq
	  */
	 public java.lang.String getStateReq() {
		 return stateReq;
	 }


	 /**
	  * Sets the stateReq value for this GetDFUWorkunitsResponse.
	  * 
	  * @param stateReq
	  */
	 public void setStateReq(java.lang.String stateReq) {
		 this.stateReq = stateReq;
	 }


	 /**
	  * Gets the pageSize value for this GetDFUWorkunitsResponse.
	  * 
	  * @return pageSize
	  */
	 public java.lang.Long getPageSize() {
		 return pageSize;
	 }


	 /**
	  * Sets the pageSize value for this GetDFUWorkunitsResponse.
	  * 
	  * @param pageSize
	  */
	 public void setPageSize(java.lang.Long pageSize) {
		 this.pageSize = pageSize;
	 }


	 /**
	  * Gets the prevPage value for this GetDFUWorkunitsResponse.
	  * 
	  * @return prevPage
	  */
	 public java.lang.Long getPrevPage() {
		 return prevPage;
	 }


	 /**
	  * Sets the prevPage value for this GetDFUWorkunitsResponse.
	  * 
	  * @param prevPage
	  */
	 public void setPrevPage(java.lang.Long prevPage) {
		 this.prevPage = prevPage;
	 }


	 /**
	  * Gets the nextPage value for this GetDFUWorkunitsResponse.
	  * 
	  * @return nextPage
	  */
	 public java.lang.Long getNextPage() {
		 return nextPage;
	 }


	 /**
	  * Sets the nextPage value for this GetDFUWorkunitsResponse.
	  * 
	  * @param nextPage
	  */
	 public void setNextPage(java.lang.Long nextPage) {
		 this.nextPage = nextPage;
	 }


	 /**
	  * Gets the lastPage value for this GetDFUWorkunitsResponse.
	  * 
	  * @return lastPage
	  */
	 public java.lang.Long getLastPage() {
		 return lastPage;
	 }


	 /**
	  * Sets the lastPage value for this GetDFUWorkunitsResponse.
	  * 
	  * @param lastPage
	  */
	 public void setLastPage(java.lang.Long lastPage) {
		 this.lastPage = lastPage;
	 }


	 /**
	  * Gets the numWUs value for this GetDFUWorkunitsResponse.
	  * 
	  * @return numWUs
	  */
	 public java.lang.Long getNumWUs() {
		 return numWUs;
	 }


	 /**
	  * Sets the numWUs value for this GetDFUWorkunitsResponse.
	  * 
	  * @param numWUs
	  */
	 public void setNumWUs(java.lang.Long numWUs) {
		 this.numWUs = numWUs;
	 }


	 /**
	  * Gets the pageStartFrom value for this GetDFUWorkunitsResponse.
	  * 
	  * @return pageStartFrom
	  */
	 public java.lang.Long getPageStartFrom() {
		 return pageStartFrom;
	 }


	 /**
	  * Sets the pageStartFrom value for this GetDFUWorkunitsResponse.
	  * 
	  * @param pageStartFrom
	  */
	 public void setPageStartFrom(java.lang.Long pageStartFrom) {
		 this.pageStartFrom = pageStartFrom;
	 }


	 /**
	  * Gets the pageEndAt value for this GetDFUWorkunitsResponse.
	  * 
	  * @return pageEndAt
	  */
	 public java.lang.Long getPageEndAt() {
		 return pageEndAt;
	 }


	 /**
	  * Sets the pageEndAt value for this GetDFUWorkunitsResponse.
	  * 
	  * @param pageEndAt
	  */
	 public void setPageEndAt(java.lang.Long pageEndAt) {
		 this.pageEndAt = pageEndAt;
	 }


	 /**
	  * Gets the first value for this GetDFUWorkunitsResponse.
	  * 
	  * @return first
	  */
	 public java.lang.Boolean getFirst() {
		 return first;
	 }


	 /**
	  * Sets the first value for this GetDFUWorkunitsResponse.
	  * 
	  * @param first
	  */
	 public void setFirst(java.lang.Boolean first) {
		 this.first = first;
	 }


	 /**
	  * Gets the sortby value for this GetDFUWorkunitsResponse.
	  * 
	  * @return sortby
	  */
	 public java.lang.String getSortby() {
		 return sortby;
	 }


	 /**
	  * Sets the sortby value for this GetDFUWorkunitsResponse.
	  * 
	  * @param sortby
	  */
	 public void setSortby(java.lang.String sortby) {
		 this.sortby = sortby;
	 }


	 /**
	  * Gets the descending value for this GetDFUWorkunitsResponse.
	  * 
	  * @return descending
	  */
	 public java.lang.Boolean getDescending() {
		 return descending;
	 }


	 /**
	  * Sets the descending value for this GetDFUWorkunitsResponse.
	  * 
	  * @param descending
	  */
	 public void setDescending(java.lang.Boolean descending) {
		 this.descending = descending;
	 }


	 /**
	  * Gets the basicQuery value for this GetDFUWorkunitsResponse.
	  * 
	  * @return basicQuery
	  */
	 public java.lang.String getBasicQuery() {
		 return basicQuery;
	 }


	 /**
	  * Sets the basicQuery value for this GetDFUWorkunitsResponse.
	  * 
	  * @param basicQuery
	  */
	 public void setBasicQuery(java.lang.String basicQuery) {
		 this.basicQuery = basicQuery;
	 }


	 /**
	  * Gets the filters value for this GetDFUWorkunitsResponse.
	  * 
	  * @return filters
	  */
	 public java.lang.String getFilters() {
		 return filters;
	 }


	 /**
	  * Sets the filters value for this GetDFUWorkunitsResponse.
	  * 
	  * @param filters
	  */
	 public void setFilters(java.lang.String filters) {
		 this.filters = filters;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof GetDFUWorkunitsResponse)) return false;
		 GetDFUWorkunitsResponse other = (GetDFUWorkunitsResponse) obj;
		 if (obj == null) return false;
		 if (this == obj) return true;
		 if (__equalsCalc != null) {
			 return (__equalsCalc == obj);
		 }
		 __equalsCalc = obj;
		 boolean _equals;
		 _equals = true && 
				 ((this.exceptions==null && other.getExceptions()==null) || 
						 (this.exceptions!=null &&
						 this.exceptions.equals(other.getExceptions()))) &&
						 ((this.results==null && other.getResults()==null) || 
								 (this.results!=null &&
								 java.util.Arrays.equals(this.results, other.getResults()))) &&
								 ((this.type==null && other.getType()==null) || 
										 (this.type!=null &&
										 this.type.equals(other.getType()))) &&
										 ((this.owner==null && other.getOwner()==null) || 
												 (this.owner!=null &&
												 this.owner.equals(other.getOwner()))) &&
												 ((this.cluster==null && other.getCluster()==null) || 
														 (this.cluster!=null &&
														 this.cluster.equals(other.getCluster()))) &&
														 ((this.stateReq==null && other.getStateReq()==null) || 
																 (this.stateReq!=null &&
																 this.stateReq.equals(other.getStateReq()))) &&
																 ((this.pageSize==null && other.getPageSize()==null) || 
																		 (this.pageSize!=null &&
																		 this.pageSize.equals(other.getPageSize()))) &&
																		 ((this.prevPage==null && other.getPrevPage()==null) || 
																				 (this.prevPage!=null &&
																				 this.prevPage.equals(other.getPrevPage()))) &&
																				 ((this.nextPage==null && other.getNextPage()==null) || 
																						 (this.nextPage!=null &&
																						 this.nextPage.equals(other.getNextPage()))) &&
																						 ((this.lastPage==null && other.getLastPage()==null) || 
																								 (this.lastPage!=null &&
																								 this.lastPage.equals(other.getLastPage()))) &&
																								 ((this.numWUs==null && other.getNumWUs()==null) || 
																										 (this.numWUs!=null &&
																										 this.numWUs.equals(other.getNumWUs()))) &&
																										 ((this.pageStartFrom==null && other.getPageStartFrom()==null) || 
																												 (this.pageStartFrom!=null &&
																												 this.pageStartFrom.equals(other.getPageStartFrom()))) &&
																												 ((this.pageEndAt==null && other.getPageEndAt()==null) || 
																														 (this.pageEndAt!=null &&
																														 this.pageEndAt.equals(other.getPageEndAt()))) &&
																														 ((this.first==null && other.getFirst()==null) || 
																																 (this.first!=null &&
																																 this.first.equals(other.getFirst()))) &&
																																 ((this.sortby==null && other.getSortby()==null) || 
																																		 (this.sortby!=null &&
																																		 this.sortby.equals(other.getSortby()))) &&
																																		 ((this.descending==null && other.getDescending()==null) || 
																																				 (this.descending!=null &&
																																				 this.descending.equals(other.getDescending()))) &&
																																				 ((this.basicQuery==null && other.getBasicQuery()==null) || 
																																						 (this.basicQuery!=null &&
																																						 this.basicQuery.equals(other.getBasicQuery()))) &&
																																						 ((this.filters==null && other.getFilters()==null) || 
																																								 (this.filters!=null &&
																																								 this.filters.equals(other.getFilters())));
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
		 if (getResults() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getResults());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getResults(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getType() != null) {
			 _hashCode += getType().hashCode();
		 }
		 if (getOwner() != null) {
			 _hashCode += getOwner().hashCode();
		 }
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getStateReq() != null) {
			 _hashCode += getStateReq().hashCode();
		 }
		 if (getPageSize() != null) {
			 _hashCode += getPageSize().hashCode();
		 }
		 if (getPrevPage() != null) {
			 _hashCode += getPrevPage().hashCode();
		 }
		 if (getNextPage() != null) {
			 _hashCode += getNextPage().hashCode();
		 }
		 if (getLastPage() != null) {
			 _hashCode += getLastPage().hashCode();
		 }
		 if (getNumWUs() != null) {
			 _hashCode += getNumWUs().hashCode();
		 }
		 if (getPageStartFrom() != null) {
			 _hashCode += getPageStartFrom().hashCode();
		 }
		 if (getPageEndAt() != null) {
			 _hashCode += getPageEndAt().hashCode();
		 }
		 if (getFirst() != null) {
			 _hashCode += getFirst().hashCode();
		 }
		 if (getSortby() != null) {
			 _hashCode += getSortby().hashCode();
		 }
		 if (getDescending() != null) {
			 _hashCode += getDescending().hashCode();
		 }
		 if (getBasicQuery() != null) {
			 _hashCode += getBasicQuery().hashCode();
		 }
		 if (getFilters() != null) {
			 _hashCode += getFilters().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
			 new org.apache.axis.description.TypeDesc(GetDFUWorkunitsResponse.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUWorkunitsResponse"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("exceptions");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("results");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "results"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWorkunit"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWorkunit"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("type");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Type"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("owner");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Owner"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("cluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Cluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("stateReq");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "StateReq"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pageSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PageSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("prevPage");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PrevPage"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("nextPage");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "NextPage"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("lastPage");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "LastPage"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("numWUs");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "NumWUs"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pageStartFrom");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PageStartFrom"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pageEndAt");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PageEndAt"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("first");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "First"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sortby");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Sortby"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("descending");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Descending"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("basicQuery");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "BasicQuery"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("filters");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Filters"));
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
