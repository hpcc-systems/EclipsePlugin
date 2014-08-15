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
 * DFULogicalFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFULogicalFile  implements java.io.Serializable {
	private java.lang.String prefix;

	private java.lang.String clusterName;

	private java.lang.String directory;

	private java.lang.String description;

	private java.lang.String parts;

	private java.lang.String name;

	private java.lang.String owner;

	private java.lang.String totalsize;

	private java.lang.String recordCount;

	private java.lang.String modified;

	private java.lang.String longSize;

	private java.lang.String longRecordCount;

	private java.lang.Boolean isSuperfile;

	private java.lang.Boolean isZipfile;

	private java.lang.Boolean isDirectory;

	private java.lang.Boolean replicate;

	private java.lang.Long intSize;

	private java.lang.Long intRecordCount;

	private java.lang.Boolean fromRoxieCluster;

	private java.lang.Boolean browseData;

	private java.lang.Boolean isKeyFile;

	public DFULogicalFile() {
	}

	public DFULogicalFile(
			java.lang.String prefix,
			java.lang.String clusterName,
			java.lang.String directory,
			java.lang.String description,
			java.lang.String parts,
			java.lang.String name,
			java.lang.String owner,
			java.lang.String totalsize,
			java.lang.String recordCount,
			java.lang.String modified,
			java.lang.String longSize,
			java.lang.String longRecordCount,
			java.lang.Boolean isSuperfile,
			java.lang.Boolean isZipfile,
			java.lang.Boolean isDirectory,
			java.lang.Boolean replicate,
			java.lang.Long intSize,
			java.lang.Long intRecordCount,
			java.lang.Boolean fromRoxieCluster,
			java.lang.Boolean browseData,
			java.lang.Boolean isKeyFile) {
		this.prefix = prefix;
		this.clusterName = clusterName;
		this.directory = directory;
		this.description = description;
		this.parts = parts;
		this.name = name;
		this.owner = owner;
		this.totalsize = totalsize;
		this.recordCount = recordCount;
		this.modified = modified;
		this.longSize = longSize;
		this.longRecordCount = longRecordCount;
		this.isSuperfile = isSuperfile;
		this.isZipfile = isZipfile;
		this.isDirectory = isDirectory;
		this.replicate = replicate;
		this.intSize = intSize;
		this.intRecordCount = intRecordCount;
		this.fromRoxieCluster = fromRoxieCluster;
		this.browseData = browseData;
		this.isKeyFile = isKeyFile;
	}


	/**
	 * Gets the prefix value for this DFULogicalFile.
	 * 
	 * @return prefix
	 */
	 public java.lang.String getPrefix() {
		 return prefix;
	 }


	/**
	 * Sets the prefix value for this DFULogicalFile.
	 * 
	 * @param prefix
	 */
	 public void setPrefix(java.lang.String prefix) {
		 this.prefix = prefix;
	 }


	/**
	 * Gets the clusterName value for this DFULogicalFile.
	 * 
	 * @return clusterName
	 */
	 public java.lang.String getClusterName() {
		 return clusterName;
	 }


	 /**
	  * Sets the clusterName value for this DFULogicalFile.
	  * 
	  * @param clusterName
	  */
	 public void setClusterName(java.lang.String clusterName) {
		 this.clusterName = clusterName;
	 }


	 /**
	  * Gets the directory value for this DFULogicalFile.
	  * 
	  * @return directory
	  */
	 public java.lang.String getDirectory() {
		 return directory;
	 }


	 /**
	  * Sets the directory value for this DFULogicalFile.
	  * 
	  * @param directory
	  */
	 public void setDirectory(java.lang.String directory) {
		 this.directory = directory;
	 }


	 /**
	  * Gets the description value for this DFULogicalFile.
	  * 
	  * @return description
	  */
	 public java.lang.String getDescription() {
		 return description;
	 }


	 /**
	  * Sets the description value for this DFULogicalFile.
	  * 
	  * @param description
	  */
	 public void setDescription(java.lang.String description) {
		 this.description = description;
	 }


	 /**
	  * Gets the parts value for this DFULogicalFile.
	  * 
	  * @return parts
	  */
	 public java.lang.String getParts() {
		 return parts;
	 }


	 /**
	  * Sets the parts value for this DFULogicalFile.
	  * 
	  * @param parts
	  */
	 public void setParts(java.lang.String parts) {
		 this.parts = parts;
	 }


	 /**
	  * Gets the name value for this DFULogicalFile.
	  * 
	  * @return name
	  */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this DFULogicalFile.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the owner value for this DFULogicalFile.
	  * 
	  * @return owner
	  */
	 public java.lang.String getOwner() {
		 return owner;
	 }


	 /**
	  * Sets the owner value for this DFULogicalFile.
	  * 
	  * @param owner
	  */
	 public void setOwner(java.lang.String owner) {
		 this.owner = owner;
	 }


	 /**
	  * Gets the totalsize value for this DFULogicalFile.
	  * 
	  * @return totalsize
	  */
	 public java.lang.String getTotalsize() {
		 return totalsize;
	 }


	 /**
	  * Sets the totalsize value for this DFULogicalFile.
	  * 
	  * @param totalsize
	  */
	 public void setTotalsize(java.lang.String totalsize) {
		 this.totalsize = totalsize;
	 }


	 /**
	  * Gets the recordCount value for this DFULogicalFile.
	  * 
	  * @return recordCount
	  */
	 public java.lang.String getRecordCount() {
		 return recordCount;
	 }


	 /**
	  * Sets the recordCount value for this DFULogicalFile.
	  * 
	  * @param recordCount
	  */
	 public void setRecordCount(java.lang.String recordCount) {
		 this.recordCount = recordCount;
	 }


	 /**
	  * Gets the modified value for this DFULogicalFile.
	  * 
	  * @return modified
	  */
	 public java.lang.String getModified() {
		 return modified;
	 }


	 /**
	  * Sets the modified value for this DFULogicalFile.
	  * 
	  * @param modified
	  */
	 public void setModified(java.lang.String modified) {
		 this.modified = modified;
	 }


	 /**
	  * Gets the longSize value for this DFULogicalFile.
	  * 
	  * @return longSize
	  */
	 public java.lang.String getLongSize() {
		 return longSize;
	 }


	 /**
	  * Sets the longSize value for this DFULogicalFile.
	  * 
	  * @param longSize
	  */
	 public void setLongSize(java.lang.String longSize) {
		 this.longSize = longSize;
	 }


	 /**
	  * Gets the longRecordCount value for this DFULogicalFile.
	  * 
	  * @return longRecordCount
	  */
	 public java.lang.String getLongRecordCount() {
		 return longRecordCount;
	 }


	 /**
	  * Sets the longRecordCount value for this DFULogicalFile.
	  * 
	  * @param longRecordCount
	  */
	 public void setLongRecordCount(java.lang.String longRecordCount) {
		 this.longRecordCount = longRecordCount;
	 }


	 /**
	  * Gets the isSuperfile value for this DFULogicalFile.
	  * 
	  * @return isSuperfile
	  */
	 public java.lang.Boolean getIsSuperfile() {
		 return isSuperfile;
	 }


	 /**
	  * Sets the isSuperfile value for this DFULogicalFile.
	  * 
	  * @param isSuperfile
	  */
	 public void setIsSuperfile(java.lang.Boolean isSuperfile) {
		 this.isSuperfile = isSuperfile;
	 }


	 /**
	  * Gets the isZipfile value for this DFULogicalFile.
	  * 
	  * @return isZipfile
	  */
	 public java.lang.Boolean getIsZipfile() {
		 return isZipfile;
	 }


	 /**
	  * Sets the isZipfile value for this DFULogicalFile.
	  * 
	  * @param isZipfile
	  */
	 public void setIsZipfile(java.lang.Boolean isZipfile) {
		 this.isZipfile = isZipfile;
	 }


	 /**
	  * Gets the isDirectory value for this DFULogicalFile.
	  * 
	  * @return isDirectory
	  */
	 public java.lang.Boolean getIsDirectory() {
		 return isDirectory;
	 }


	 /**
	  * Sets the isDirectory value for this DFULogicalFile.
	  * 
	  * @param isDirectory
	  */
	 public void setIsDirectory(java.lang.Boolean isDirectory) {
		 this.isDirectory = isDirectory;
	 }


	 /**
	  * Gets the replicate value for this DFULogicalFile.
	  * 
	  * @return replicate
	  */
	 public java.lang.Boolean getReplicate() {
		 return replicate;
	 }


	 /**
	  * Sets the replicate value for this DFULogicalFile.
	  * 
	  * @param replicate
	  */
	 public void setReplicate(java.lang.Boolean replicate) {
		 this.replicate = replicate;
	 }


	 /**
	  * Gets the intSize value for this DFULogicalFile.
	  * 
	  * @return intSize
	  */
	 public java.lang.Long getIntSize() {
		 return intSize;
	 }


	 /**
	  * Sets the intSize value for this DFULogicalFile.
	  * 
	  * @param intSize
	  */
	 public void setIntSize(java.lang.Long intSize) {
		 this.intSize = intSize;
	 }


	 /**
	  * Gets the intRecordCount value for this DFULogicalFile.
	  * 
	  * @return intRecordCount
	  */
	 public java.lang.Long getIntRecordCount() {
		 return intRecordCount;
	 }


	 /**
	  * Sets the intRecordCount value for this DFULogicalFile.
	  * 
	  * @param intRecordCount
	  */
	 public void setIntRecordCount(java.lang.Long intRecordCount) {
		 this.intRecordCount = intRecordCount;
	 }


	 /**
	  * Gets the fromRoxieCluster value for this DFULogicalFile.
	  * 
	  * @return fromRoxieCluster
	  */
	 public java.lang.Boolean getFromRoxieCluster() {
		 return fromRoxieCluster;
	 }


	 /**
	  * Sets the fromRoxieCluster value for this DFULogicalFile.
	  * 
	  * @param fromRoxieCluster
	  */
	 public void setFromRoxieCluster(java.lang.Boolean fromRoxieCluster) {
		 this.fromRoxieCluster = fromRoxieCluster;
	 }


	 /**
	  * Gets the browseData value for this DFULogicalFile.
	  * 
	  * @return browseData
	  */
	 public java.lang.Boolean getBrowseData() {
		 return browseData;
	 }


	 /**
	  * Sets the browseData value for this DFULogicalFile.
	  * 
	  * @param browseData
	  */
	 public void setBrowseData(java.lang.Boolean browseData) {
		 this.browseData = browseData;
	 }


	 /**
	  * Gets the isKeyFile value for this DFULogicalFile.
	  * 
	  * @return isKeyFile
	  */
	 public java.lang.Boolean getIsKeyFile() {
		 return isKeyFile;
	 }


	 /**
	  * Sets the isKeyFile value for this DFULogicalFile.
	  * 
	  * @param isKeyFile
	  */
	 public void setIsKeyFile(java.lang.Boolean isKeyFile) {
		 this.isKeyFile = isKeyFile;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DFULogicalFile)) {
			return false;
		}
		 DFULogicalFile other = (DFULogicalFile) obj;
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
				 ((this.prefix==null && other.getPrefix()==null) || 
						 (this.prefix!=null &&
						 this.prefix.equals(other.getPrefix()))) &&
						 ((this.clusterName==null && other.getClusterName()==null) || 
								 (this.clusterName!=null &&
								 this.clusterName.equals(other.getClusterName()))) &&
								 ((this.directory==null && other.getDirectory()==null) || 
										 (this.directory!=null &&
										 this.directory.equals(other.getDirectory()))) &&
										 ((this.description==null && other.getDescription()==null) || 
												 (this.description!=null &&
												 this.description.equals(other.getDescription()))) &&
												 ((this.parts==null && other.getParts()==null) || 
														 (this.parts!=null &&
														 this.parts.equals(other.getParts()))) &&
														 ((this.name==null && other.getName()==null) || 
																 (this.name!=null &&
																 this.name.equals(other.getName()))) &&
																 ((this.owner==null && other.getOwner()==null) || 
																		 (this.owner!=null &&
																		 this.owner.equals(other.getOwner()))) &&
																		 ((this.totalsize==null && other.getTotalsize()==null) || 
																				 (this.totalsize!=null &&
																				 this.totalsize.equals(other.getTotalsize()))) &&
																				 ((this.recordCount==null && other.getRecordCount()==null) || 
																						 (this.recordCount!=null &&
																						 this.recordCount.equals(other.getRecordCount()))) &&
																						 ((this.modified==null && other.getModified()==null) || 
																								 (this.modified!=null &&
																								 this.modified.equals(other.getModified()))) &&
																								 ((this.longSize==null && other.getLongSize()==null) || 
																										 (this.longSize!=null &&
																										 this.longSize.equals(other.getLongSize()))) &&
																										 ((this.longRecordCount==null && other.getLongRecordCount()==null) || 
																												 (this.longRecordCount!=null &&
																												 this.longRecordCount.equals(other.getLongRecordCount()))) &&
																												 ((this.isSuperfile==null && other.getIsSuperfile()==null) || 
																														 (this.isSuperfile!=null &&
																														 this.isSuperfile.equals(other.getIsSuperfile()))) &&
																														 ((this.isZipfile==null && other.getIsZipfile()==null) || 
																																 (this.isZipfile!=null &&
																																 this.isZipfile.equals(other.getIsZipfile()))) &&
																																 ((this.isDirectory==null && other.getIsDirectory()==null) || 
																																		 (this.isDirectory!=null &&
																																		 this.isDirectory.equals(other.getIsDirectory()))) &&
																																		 ((this.replicate==null && other.getReplicate()==null) || 
																																				 (this.replicate!=null &&
																																				 this.replicate.equals(other.getReplicate()))) &&
																																				 ((this.intSize==null && other.getIntSize()==null) || 
																																						 (this.intSize!=null &&
																																						 this.intSize.equals(other.getIntSize()))) &&
																																						 ((this.intRecordCount==null && other.getIntRecordCount()==null) || 
																																								 (this.intRecordCount!=null &&
																																								 this.intRecordCount.equals(other.getIntRecordCount()))) &&
																																								 ((this.fromRoxieCluster==null && other.getFromRoxieCluster()==null) || 
																																										 (this.fromRoxieCluster!=null &&
																																										 this.fromRoxieCluster.equals(other.getFromRoxieCluster()))) &&
																																										 ((this.browseData==null && other.getBrowseData()==null) || 
																																												 (this.browseData!=null &&
																																												 this.browseData.equals(other.getBrowseData()))) &&
																																												 ((this.isKeyFile==null && other.getIsKeyFile()==null) || 
																																														 (this.isKeyFile!=null &&
																																														 this.isKeyFile.equals(other.getIsKeyFile())));
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
		 if (getDirectory() != null) {
			 _hashCode += getDirectory().hashCode();
		 }
		 if (getDescription() != null) {
			 _hashCode += getDescription().hashCode();
		 }
		 if (getParts() != null) {
			 _hashCode += getParts().hashCode();
		 }
		 if (getName() != null) {
			 _hashCode += getName().hashCode();
		 }
		 if (getOwner() != null) {
			 _hashCode += getOwner().hashCode();
		 }
		 if (getTotalsize() != null) {
			 _hashCode += getTotalsize().hashCode();
		 }
		 if (getRecordCount() != null) {
			 _hashCode += getRecordCount().hashCode();
		 }
		 if (getModified() != null) {
			 _hashCode += getModified().hashCode();
		 }
		 if (getLongSize() != null) {
			 _hashCode += getLongSize().hashCode();
		 }
		 if (getLongRecordCount() != null) {
			 _hashCode += getLongRecordCount().hashCode();
		 }
		 if (getIsSuperfile() != null) {
			 _hashCode += getIsSuperfile().hashCode();
		 }
		 if (getIsZipfile() != null) {
			 _hashCode += getIsZipfile().hashCode();
		 }
		 if (getIsDirectory() != null) {
			 _hashCode += getIsDirectory().hashCode();
		 }
		 if (getReplicate() != null) {
			 _hashCode += getReplicate().hashCode();
		 }
		 if (getIntSize() != null) {
			 _hashCode += getIntSize().hashCode();
		 }
		 if (getIntRecordCount() != null) {
			 _hashCode += getIntRecordCount().hashCode();
		 }
		 if (getFromRoxieCluster() != null) {
			 _hashCode += getFromRoxieCluster().hashCode();
		 }
		 if (getBrowseData() != null) {
			 _hashCode += getBrowseData().hashCode();
		 }
		 if (getIsKeyFile() != null) {
			 _hashCode += getIsKeyFile().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
			 new org.apache.axis.description.TypeDesc(DFULogicalFile.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFile"));
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
		 elemField.setFieldName("directory");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Directory"));
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
		 elemField.setFieldName("parts");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Parts"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
		 elemField.setFieldName("owner");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Owner"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("totalsize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Totalsize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("recordCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("modified");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Modified"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("longSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LongSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("longRecordCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LongRecordCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isSuperfile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "isSuperfile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isZipfile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "isZipfile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isDirectory");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "isDirectory"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("replicate");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Replicate"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("intSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IntSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("intRecordCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IntRecordCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("fromRoxieCluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FromRoxieCluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("browseData");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "BrowseData"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isKeyFile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IsKeyFile"));
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
