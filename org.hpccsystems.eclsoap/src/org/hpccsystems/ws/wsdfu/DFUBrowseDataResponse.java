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
 * DFUBrowseDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUBrowseDataResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions;

	private java.lang.String name;

	private java.lang.String logicalName;

	private java.lang.String filterBy;

	private java.lang.String filterForGoBack;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] columnsHidden;

	private java.lang.Integer columnCount;

	private java.lang.Long startForGoback;

	private java.lang.Integer countForGoback;

	private java.lang.Integer chooseFile;

	private java.lang.Boolean schemaOnly;

	private java.lang.String cluster;

	private java.lang.String clusterType;

	private java.lang.String parentName;

	private java.lang.Long start;

	private java.lang.Long count;

	private java.lang.Long pageSize;

	private java.lang.Long total;

	private java.lang.String result;

	private java.lang.String msgToDisplay;

	private java.lang.Boolean disableUppercaseTranslation;

	public DFUBrowseDataResponse() {
	}

	public DFUBrowseDataResponse(
			org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions,
			java.lang.String name,
			java.lang.String logicalName,
			java.lang.String filterBy,
			java.lang.String filterForGoBack,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] columnsHidden,
			java.lang.Integer columnCount,
			java.lang.Long startForGoback,
			java.lang.Integer countForGoback,
			java.lang.Integer chooseFile,
			java.lang.Boolean schemaOnly,
			java.lang.String cluster,
			java.lang.String clusterType,
			java.lang.String parentName,
			java.lang.Long start,
			java.lang.Long count,
			java.lang.Long pageSize,
			java.lang.Long total,
			java.lang.String result,
			java.lang.String msgToDisplay,
			java.lang.Boolean disableUppercaseTranslation) {
		this.exceptions = exceptions;
		this.name = name;
		this.logicalName = logicalName;
		this.filterBy = filterBy;
		this.filterForGoBack = filterForGoBack;
		this.columnsHidden = columnsHidden;
		this.columnCount = columnCount;
		this.startForGoback = startForGoback;
		this.countForGoback = countForGoback;
		this.chooseFile = chooseFile;
		this.schemaOnly = schemaOnly;
		this.cluster = cluster;
		this.clusterType = clusterType;
		this.parentName = parentName;
		this.start = start;
		this.count = count;
		this.pageSize = pageSize;
		this.total = total;
		this.result = result;
		this.msgToDisplay = msgToDisplay;
		this.disableUppercaseTranslation = disableUppercaseTranslation;
	}


	/**
	 * Gets the exceptions value for this DFUBrowseDataResponse.
	 * 
	 * @return exceptions
	 */
	 public org.hpccsystems.ws.wsdfu.ArrayOfEspException getExceptions() {
		 return exceptions;
	 }


	/**
	 * Sets the exceptions value for this DFUBrowseDataResponse.
	 * 
	 * @param exceptions
	 */
	 public void setExceptions(org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions) {
		 this.exceptions = exceptions;
	 }


	 /**
	  * Gets the name value for this DFUBrowseDataResponse.
	  * 
	  * @return name
	  */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this DFUBrowseDataResponse.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the logicalName value for this DFUBrowseDataResponse.
	  * 
	  * @return logicalName
	  */
	 public java.lang.String getLogicalName() {
		 return logicalName;
	 }


	 /**
	  * Sets the logicalName value for this DFUBrowseDataResponse.
	  * 
	  * @param logicalName
	  */
	 public void setLogicalName(java.lang.String logicalName) {
		 this.logicalName = logicalName;
	 }


	 /**
	  * Gets the filterBy value for this DFUBrowseDataResponse.
	  * 
	  * @return filterBy
	  */
	 public java.lang.String getFilterBy() {
		 return filterBy;
	 }


	 /**
	  * Sets the filterBy value for this DFUBrowseDataResponse.
	  * 
	  * @param filterBy
	  */
	 public void setFilterBy(java.lang.String filterBy) {
		 this.filterBy = filterBy;
	 }


	 /**
	  * Gets the filterForGoBack value for this DFUBrowseDataResponse.
	  * 
	  * @return filterForGoBack
	  */
	 public java.lang.String getFilterForGoBack() {
		 return filterForGoBack;
	 }


	 /**
	  * Sets the filterForGoBack value for this DFUBrowseDataResponse.
	  * 
	  * @param filterForGoBack
	  */
	 public void setFilterForGoBack(java.lang.String filterForGoBack) {
		 this.filterForGoBack = filterForGoBack;
	 }


	 /**
	  * Gets the columnsHidden value for this DFUBrowseDataResponse.
	  * 
	  * @return columnsHidden
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getColumnsHidden() {
		 return columnsHidden;
	 }


	 /**
	  * Sets the columnsHidden value for this DFUBrowseDataResponse.
	  * 
	  * @param columnsHidden
	  */
	 public void setColumnsHidden(org.hpccsystems.ws.wsdfu.DFUDataColumn[] columnsHidden) {
		 this.columnsHidden = columnsHidden;
	 }


	 /**
	  * Gets the columnCount value for this DFUBrowseDataResponse.
	  * 
	  * @return columnCount
	  */
	 public java.lang.Integer getColumnCount() {
		 return columnCount;
	 }


	 /**
	  * Sets the columnCount value for this DFUBrowseDataResponse.
	  * 
	  * @param columnCount
	  */
	 public void setColumnCount(java.lang.Integer columnCount) {
		 this.columnCount = columnCount;
	 }


	 /**
	  * Gets the startForGoback value for this DFUBrowseDataResponse.
	  * 
	  * @return startForGoback
	  */
	 public java.lang.Long getStartForGoback() {
		 return startForGoback;
	 }


	 /**
	  * Sets the startForGoback value for this DFUBrowseDataResponse.
	  * 
	  * @param startForGoback
	  */
	 public void setStartForGoback(java.lang.Long startForGoback) {
		 this.startForGoback = startForGoback;
	 }


	 /**
	  * Gets the countForGoback value for this DFUBrowseDataResponse.
	  * 
	  * @return countForGoback
	  */
	 public java.lang.Integer getCountForGoback() {
		 return countForGoback;
	 }


	 /**
	  * Sets the countForGoback value for this DFUBrowseDataResponse.
	  * 
	  * @param countForGoback
	  */
	 public void setCountForGoback(java.lang.Integer countForGoback) {
		 this.countForGoback = countForGoback;
	 }


	 /**
	  * Gets the chooseFile value for this DFUBrowseDataResponse.
	  * 
	  * @return chooseFile
	  */
	 public java.lang.Integer getChooseFile() {
		 return chooseFile;
	 }


	 /**
	  * Sets the chooseFile value for this DFUBrowseDataResponse.
	  * 
	  * @param chooseFile
	  */
	 public void setChooseFile(java.lang.Integer chooseFile) {
		 this.chooseFile = chooseFile;
	 }


	 /**
	  * Gets the schemaOnly value for this DFUBrowseDataResponse.
	  * 
	  * @return schemaOnly
	  */
	 public java.lang.Boolean getSchemaOnly() {
		 return schemaOnly;
	 }


	 /**
	  * Sets the schemaOnly value for this DFUBrowseDataResponse.
	  * 
	  * @param schemaOnly
	  */
	 public void setSchemaOnly(java.lang.Boolean schemaOnly) {
		 this.schemaOnly = schemaOnly;
	 }


	 /**
	  * Gets the cluster value for this DFUBrowseDataResponse.
	  * 
	  * @return cluster
	  */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this DFUBrowseDataResponse.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the clusterType value for this DFUBrowseDataResponse.
	  * 
	  * @return clusterType
	  */
	 public java.lang.String getClusterType() {
		 return clusterType;
	 }


	 /**
	  * Sets the clusterType value for this DFUBrowseDataResponse.
	  * 
	  * @param clusterType
	  */
	 public void setClusterType(java.lang.String clusterType) {
		 this.clusterType = clusterType;
	 }


	 /**
	  * Gets the parentName value for this DFUBrowseDataResponse.
	  * 
	  * @return parentName
	  */
	 public java.lang.String getParentName() {
		 return parentName;
	 }


	 /**
	  * Sets the parentName value for this DFUBrowseDataResponse.
	  * 
	  * @param parentName
	  */
	 public void setParentName(java.lang.String parentName) {
		 this.parentName = parentName;
	 }


	 /**
	  * Gets the start value for this DFUBrowseDataResponse.
	  * 
	  * @return start
	  */
	 public java.lang.Long getStart() {
		 return start;
	 }


	 /**
	  * Sets the start value for this DFUBrowseDataResponse.
	  * 
	  * @param start
	  */
	 public void setStart(java.lang.Long start) {
		 this.start = start;
	 }


	 /**
	  * Gets the count value for this DFUBrowseDataResponse.
	  * 
	  * @return count
	  */
	 public java.lang.Long getCount() {
		 return count;
	 }


	 /**
	  * Sets the count value for this DFUBrowseDataResponse.
	  * 
	  * @param count
	  */
	 public void setCount(java.lang.Long count) {
		 this.count = count;
	 }


	 /**
	  * Gets the pageSize value for this DFUBrowseDataResponse.
	  * 
	  * @return pageSize
	  */
	 public java.lang.Long getPageSize() {
		 return pageSize;
	 }


	 /**
	  * Sets the pageSize value for this DFUBrowseDataResponse.
	  * 
	  * @param pageSize
	  */
	 public void setPageSize(java.lang.Long pageSize) {
		 this.pageSize = pageSize;
	 }


	 /**
	  * Gets the total value for this DFUBrowseDataResponse.
	  * 
	  * @return total
	  */
	 public java.lang.Long getTotal() {
		 return total;
	 }


	 /**
	  * Sets the total value for this DFUBrowseDataResponse.
	  * 
	  * @param total
	  */
	 public void setTotal(java.lang.Long total) {
		 this.total = total;
	 }


	 /**
	  * Gets the result value for this DFUBrowseDataResponse.
	  * 
	  * @return result
	  */
	 public java.lang.String getResult() {
		 return result;
	 }


	 /**
	  * Sets the result value for this DFUBrowseDataResponse.
	  * 
	  * @param result
	  */
	 public void setResult(java.lang.String result) {
		 this.result = result;
	 }


	 /**
	  * Gets the msgToDisplay value for this DFUBrowseDataResponse.
	  * 
	  * @return msgToDisplay
	  */
	 public java.lang.String getMsgToDisplay() {
		 return msgToDisplay;
	 }


	 /**
	  * Sets the msgToDisplay value for this DFUBrowseDataResponse.
	  * 
	  * @param msgToDisplay
	  */
	 public void setMsgToDisplay(java.lang.String msgToDisplay) {
		 this.msgToDisplay = msgToDisplay;
	 }


	 /**
	  * Gets the disableUppercaseTranslation value for this DFUBrowseDataResponse.
	  * 
	  * @return disableUppercaseTranslation
	  */
	 public java.lang.Boolean getDisableUppercaseTranslation() {
		 return disableUppercaseTranslation;
	 }


	 /**
	  * Sets the disableUppercaseTranslation value for this DFUBrowseDataResponse.
	  * 
	  * @param disableUppercaseTranslation
	  */
	 public void setDisableUppercaseTranslation(java.lang.Boolean disableUppercaseTranslation) {
		 this.disableUppercaseTranslation = disableUppercaseTranslation;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DFUBrowseDataResponse)) {
			return false;
		}
		 DFUBrowseDataResponse other = (DFUBrowseDataResponse) obj;
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
						 ((this.name==null && other.getName()==null) || 
								 (this.name!=null &&
								 this.name.equals(other.getName()))) &&
								 ((this.logicalName==null && other.getLogicalName()==null) || 
										 (this.logicalName!=null &&
										 this.logicalName.equals(other.getLogicalName()))) &&
										 ((this.filterBy==null && other.getFilterBy()==null) || 
												 (this.filterBy!=null &&
												 this.filterBy.equals(other.getFilterBy()))) &&
												 ((this.filterForGoBack==null && other.getFilterForGoBack()==null) || 
														 (this.filterForGoBack!=null &&
														 this.filterForGoBack.equals(other.getFilterForGoBack()))) &&
														 ((this.columnsHidden==null && other.getColumnsHidden()==null) || 
																 (this.columnsHidden!=null &&
																 java.util.Arrays.equals(this.columnsHidden, other.getColumnsHidden()))) &&
																 ((this.columnCount==null && other.getColumnCount()==null) || 
																		 (this.columnCount!=null &&
																		 this.columnCount.equals(other.getColumnCount()))) &&
																		 ((this.startForGoback==null && other.getStartForGoback()==null) || 
																				 (this.startForGoback!=null &&
																				 this.startForGoback.equals(other.getStartForGoback()))) &&
																				 ((this.countForGoback==null && other.getCountForGoback()==null) || 
																						 (this.countForGoback!=null &&
																						 this.countForGoback.equals(other.getCountForGoback()))) &&
																						 ((this.chooseFile==null && other.getChooseFile()==null) || 
																								 (this.chooseFile!=null &&
																								 this.chooseFile.equals(other.getChooseFile()))) &&
																								 ((this.schemaOnly==null && other.getSchemaOnly()==null) || 
																										 (this.schemaOnly!=null &&
																										 this.schemaOnly.equals(other.getSchemaOnly()))) &&
																										 ((this.cluster==null && other.getCluster()==null) || 
																												 (this.cluster!=null &&
																												 this.cluster.equals(other.getCluster()))) &&
																												 ((this.clusterType==null && other.getClusterType()==null) || 
																														 (this.clusterType!=null &&
																														 this.clusterType.equals(other.getClusterType()))) &&
																														 ((this.parentName==null && other.getParentName()==null) || 
																																 (this.parentName!=null &&
																																 this.parentName.equals(other.getParentName()))) &&
																																 ((this.start==null && other.getStart()==null) || 
																																		 (this.start!=null &&
																																		 this.start.equals(other.getStart()))) &&
																																		 ((this.count==null && other.getCount()==null) || 
																																				 (this.count!=null &&
																																				 this.count.equals(other.getCount()))) &&
																																				 ((this.pageSize==null && other.getPageSize()==null) || 
																																						 (this.pageSize!=null &&
																																						 this.pageSize.equals(other.getPageSize()))) &&
																																						 ((this.total==null && other.getTotal()==null) || 
																																								 (this.total!=null &&
																																								 this.total.equals(other.getTotal()))) &&
																																								 ((this.result==null && other.getResult()==null) || 
																																										 (this.result!=null &&
																																										 this.result.equals(other.getResult()))) &&
																																										 ((this.msgToDisplay==null && other.getMsgToDisplay()==null) || 
																																												 (this.msgToDisplay!=null &&
																																												 this.msgToDisplay.equals(other.getMsgToDisplay()))) &&
																																												 ((this.disableUppercaseTranslation==null && other.getDisableUppercaseTranslation()==null) || 
																																														 (this.disableUppercaseTranslation!=null &&
																																														 this.disableUppercaseTranslation.equals(other.getDisableUppercaseTranslation())));
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
		 if (getName() != null) {
			 _hashCode += getName().hashCode();
		 }
		 if (getLogicalName() != null) {
			 _hashCode += getLogicalName().hashCode();
		 }
		 if (getFilterBy() != null) {
			 _hashCode += getFilterBy().hashCode();
		 }
		 if (getFilterForGoBack() != null) {
			 _hashCode += getFilterForGoBack().hashCode();
		 }
		 if (getColumnsHidden() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getColumnsHidden());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getColumnsHidden(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getColumnCount() != null) {
			 _hashCode += getColumnCount().hashCode();
		 }
		 if (getStartForGoback() != null) {
			 _hashCode += getStartForGoback().hashCode();
		 }
		 if (getCountForGoback() != null) {
			 _hashCode += getCountForGoback().hashCode();
		 }
		 if (getChooseFile() != null) {
			 _hashCode += getChooseFile().hashCode();
		 }
		 if (getSchemaOnly() != null) {
			 _hashCode += getSchemaOnly().hashCode();
		 }
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getClusterType() != null) {
			 _hashCode += getClusterType().hashCode();
		 }
		 if (getParentName() != null) {
			 _hashCode += getParentName().hashCode();
		 }
		 if (getStart() != null) {
			 _hashCode += getStart().hashCode();
		 }
		 if (getCount() != null) {
			 _hashCode += getCount().hashCode();
		 }
		 if (getPageSize() != null) {
			 _hashCode += getPageSize().hashCode();
		 }
		 if (getTotal() != null) {
			 _hashCode += getTotal().hashCode();
		 }
		 if (getResult() != null) {
			 _hashCode += getResult().hashCode();
		 }
		 if (getMsgToDisplay() != null) {
			 _hashCode += getMsgToDisplay().hashCode();
		 }
		 if (getDisableUppercaseTranslation() != null) {
			 _hashCode += getDisableUppercaseTranslation().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
			 new org.apache.axis.description.TypeDesc(DFUBrowseDataResponse.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUBrowseDataResponse"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("exceptions");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Name"));
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
		 elemField.setFieldName("filterBy");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FilterBy"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("filterForGoBack");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FilterForGoBack"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("columnsHidden");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnsHidden"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnHidden"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("columnCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("startForGoback");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartForGoback"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("countForGoback");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CountForGoback"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("chooseFile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ChooseFile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("schemaOnly");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SchemaOnly"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("cluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Cluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("clusterType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ClusterType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("parentName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ParentName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("start");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Start"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("count");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Count"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pageSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PageSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("total");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Total"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("result");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Result"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("msgToDisplay");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MsgToDisplay"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("disableUppercaseTranslation");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DisableUppercaseTranslation"));
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
