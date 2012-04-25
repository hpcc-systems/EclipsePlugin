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
 * DFUFileDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUFileDetail  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String filename;

	private java.lang.String description;

	private java.lang.String dir;

	private java.lang.String pathMask;

	private java.lang.String filesize;

	private java.lang.String actualSize;

	private java.lang.String recordSize;

	private java.lang.String recordCount;

	private java.lang.String wuid;

	private java.lang.String owner;

	private java.lang.String cluster;

	private java.lang.String jobName;

	private java.lang.String persistent;

	private java.lang.String format;

	private java.lang.String maxRecordSize;

	private java.lang.String csvSeparate;

	private java.lang.String csvQuote;

	private java.lang.String csvTerminate;

	private java.lang.String modified;

	private java.lang.String ecl;

	private java.lang.Boolean zipFile;

	private org.hpccsystems.ws.wsdfu.DFUFileStat stat;

	private org.hpccsystems.ws.wsdfu.DFUPart[] DFUFileParts;

	private java.lang.Boolean isSuperfile;

	private java.lang.Boolean showFileContent;

	private java.lang.String[] subfiles;

	private org.hpccsystems.ws.wsdfu.DFULogicalFile[] superfiles;

	private java.lang.Boolean fromRoxieCluster;

	private java.lang.String[] graphs;

	private java.lang.String userPermission;

	public DFUFileDetail() {
	}

	public DFUFileDetail(
			java.lang.String name,
			java.lang.String filename,
			java.lang.String description,
			java.lang.String dir,
			java.lang.String pathMask,
			java.lang.String filesize,
			java.lang.String actualSize,
			java.lang.String recordSize,
			java.lang.String recordCount,
			java.lang.String wuid,
			java.lang.String owner,
			java.lang.String cluster,
			java.lang.String jobName,
			java.lang.String persistent,
			java.lang.String format,
			java.lang.String maxRecordSize,
			java.lang.String csvSeparate,
			java.lang.String csvQuote,
			java.lang.String csvTerminate,
			java.lang.String modified,
			java.lang.String ecl,
			java.lang.Boolean zipFile,
			org.hpccsystems.ws.wsdfu.DFUFileStat stat,
			org.hpccsystems.ws.wsdfu.DFUPart[] DFUFileParts,
			java.lang.Boolean isSuperfile,
			java.lang.Boolean showFileContent,
			java.lang.String[] subfiles,
			org.hpccsystems.ws.wsdfu.DFULogicalFile[] superfiles,
			java.lang.Boolean fromRoxieCluster,
			java.lang.String[] graphs,
			java.lang.String userPermission) {
		this.name = name;
		this.filename = filename;
		this.description = description;
		this.dir = dir;
		this.pathMask = pathMask;
		this.filesize = filesize;
		this.actualSize = actualSize;
		this.recordSize = recordSize;
		this.recordCount = recordCount;
		this.wuid = wuid;
		this.owner = owner;
		this.cluster = cluster;
		this.jobName = jobName;
		this.persistent = persistent;
		this.format = format;
		this.maxRecordSize = maxRecordSize;
		this.csvSeparate = csvSeparate;
		this.csvQuote = csvQuote;
		this.csvTerminate = csvTerminate;
		this.modified = modified;
		this.ecl = ecl;
		this.zipFile = zipFile;
		this.stat = stat;
		this.DFUFileParts = DFUFileParts;
		this.isSuperfile = isSuperfile;
		this.showFileContent = showFileContent;
		this.subfiles = subfiles;
		this.superfiles = superfiles;
		this.fromRoxieCluster = fromRoxieCluster;
		this.graphs = graphs;
		this.userPermission = userPermission;
	}


	/**
	 * Gets the name value for this DFUFileDetail.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	/**
	 * Sets the name value for this DFUFileDetail.
	 * 
	 * @param name
	 */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	/**
	 * Gets the filename value for this DFUFileDetail.
	 * 
	 * @return filename
	 */
	 public java.lang.String getFilename() {
		 return filename;
	 }


	/**
	 * Sets the filename value for this DFUFileDetail.
	 * 
	 * @param filename
	 */
	 public void setFilename(java.lang.String filename) {
		 this.filename = filename;
	 }


	 /**
	  * Gets the description value for this DFUFileDetail.
	  * 
	  * @return description
	  */
	 public java.lang.String getDescription() {
		 return description;
	 }


	 /**
	  * Sets the description value for this DFUFileDetail.
	  * 
	  * @param description
	  */
	 public void setDescription(java.lang.String description) {
		 this.description = description;
	 }


	 /**
	  * Gets the dir value for this DFUFileDetail.
	  * 
	  * @return dir
	  */
	 public java.lang.String getDir() {
		 return dir;
	 }


	 /**
	  * Sets the dir value for this DFUFileDetail.
	  * 
	  * @param dir
	  */
	 public void setDir(java.lang.String dir) {
		 this.dir = dir;
	 }


	 /**
	  * Gets the pathMask value for this DFUFileDetail.
	  * 
	  * @return pathMask
	  */
	 public java.lang.String getPathMask() {
		 return pathMask;
	 }


	 /**
	  * Sets the pathMask value for this DFUFileDetail.
	  * 
	  * @param pathMask
	  */
	 public void setPathMask(java.lang.String pathMask) {
		 this.pathMask = pathMask;
	 }


	 /**
	  * Gets the filesize value for this DFUFileDetail.
	  * 
	  * @return filesize
	  */
	 public java.lang.String getFilesize() {
		 return filesize;
	 }


	 /**
	  * Sets the filesize value for this DFUFileDetail.
	  * 
	  * @param filesize
	  */
	 public void setFilesize(java.lang.String filesize) {
		 this.filesize = filesize;
	 }


	 /**
	  * Gets the actualSize value for this DFUFileDetail.
	  * 
	  * @return actualSize
	  */
	 public java.lang.String getActualSize() {
		 return actualSize;
	 }


	 /**
	  * Sets the actualSize value for this DFUFileDetail.
	  * 
	  * @param actualSize
	  */
	 public void setActualSize(java.lang.String actualSize) {
		 this.actualSize = actualSize;
	 }


	 /**
	  * Gets the recordSize value for this DFUFileDetail.
	  * 
	  * @return recordSize
	  */
	 public java.lang.String getRecordSize() {
		 return recordSize;
	 }


	 /**
	  * Sets the recordSize value for this DFUFileDetail.
	  * 
	  * @param recordSize
	  */
	 public void setRecordSize(java.lang.String recordSize) {
		 this.recordSize = recordSize;
	 }


	 /**
	  * Gets the recordCount value for this DFUFileDetail.
	  * 
	  * @return recordCount
	  */
	 public java.lang.String getRecordCount() {
		 return recordCount;
	 }


	 /**
	  * Sets the recordCount value for this DFUFileDetail.
	  * 
	  * @param recordCount
	  */
	 public void setRecordCount(java.lang.String recordCount) {
		 this.recordCount = recordCount;
	 }


	 /**
	  * Gets the wuid value for this DFUFileDetail.
	  * 
	  * @return wuid
	  */
	 public java.lang.String getWuid() {
		 return wuid;
	 }


	 /**
	  * Sets the wuid value for this DFUFileDetail.
	  * 
	  * @param wuid
	  */
	 public void setWuid(java.lang.String wuid) {
		 this.wuid = wuid;
	 }


	 /**
	  * Gets the owner value for this DFUFileDetail.
	  * 
	  * @return owner
	  */
	 public java.lang.String getOwner() {
		 return owner;
	 }


	 /**
	  * Sets the owner value for this DFUFileDetail.
	  * 
	  * @param owner
	  */
	 public void setOwner(java.lang.String owner) {
		 this.owner = owner;
	 }


	 /**
	  * Gets the cluster value for this DFUFileDetail.
	  * 
	  * @return cluster
	  */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this DFUFileDetail.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the jobName value for this DFUFileDetail.
	  * 
	  * @return jobName
	  */
	 public java.lang.String getJobName() {
		 return jobName;
	 }


	 /**
	  * Sets the jobName value for this DFUFileDetail.
	  * 
	  * @param jobName
	  */
	 public void setJobName(java.lang.String jobName) {
		 this.jobName = jobName;
	 }


	 /**
	  * Gets the persistent value for this DFUFileDetail.
	  * 
	  * @return persistent
	  */
	 public java.lang.String getPersistent() {
		 return persistent;
	 }


	 /**
	  * Sets the persistent value for this DFUFileDetail.
	  * 
	  * @param persistent
	  */
	 public void setPersistent(java.lang.String persistent) {
		 this.persistent = persistent;
	 }


	 /**
	  * Gets the format value for this DFUFileDetail.
	  * 
	  * @return format
	  */
	 public java.lang.String getFormat() {
		 return format;
	 }


	 /**
	  * Sets the format value for this DFUFileDetail.
	  * 
	  * @param format
	  */
	 public void setFormat(java.lang.String format) {
		 this.format = format;
	 }


	 /**
	  * Gets the maxRecordSize value for this DFUFileDetail.
	  * 
	  * @return maxRecordSize
	  */
	 public java.lang.String getMaxRecordSize() {
		 return maxRecordSize;
	 }


	 /**
	  * Sets the maxRecordSize value for this DFUFileDetail.
	  * 
	  * @param maxRecordSize
	  */
	 public void setMaxRecordSize(java.lang.String maxRecordSize) {
		 this.maxRecordSize = maxRecordSize;
	 }


	 /**
	  * Gets the csvSeparate value for this DFUFileDetail.
	  * 
	  * @return csvSeparate
	  */
	 public java.lang.String getCsvSeparate() {
		 return csvSeparate;
	 }


	 /**
	  * Sets the csvSeparate value for this DFUFileDetail.
	  * 
	  * @param csvSeparate
	  */
	 public void setCsvSeparate(java.lang.String csvSeparate) {
		 this.csvSeparate = csvSeparate;
	 }


	 /**
	  * Gets the csvQuote value for this DFUFileDetail.
	  * 
	  * @return csvQuote
	  */
	 public java.lang.String getCsvQuote() {
		 return csvQuote;
	 }


	 /**
	  * Sets the csvQuote value for this DFUFileDetail.
	  * 
	  * @param csvQuote
	  */
	 public void setCsvQuote(java.lang.String csvQuote) {
		 this.csvQuote = csvQuote;
	 }


	 /**
	  * Gets the csvTerminate value for this DFUFileDetail.
	  * 
	  * @return csvTerminate
	  */
	 public java.lang.String getCsvTerminate() {
		 return csvTerminate;
	 }


	 /**
	  * Sets the csvTerminate value for this DFUFileDetail.
	  * 
	  * @param csvTerminate
	  */
	 public void setCsvTerminate(java.lang.String csvTerminate) {
		 this.csvTerminate = csvTerminate;
	 }


	 /**
	  * Gets the modified value for this DFUFileDetail.
	  * 
	  * @return modified
	  */
	 public java.lang.String getModified() {
		 return modified;
	 }


	 /**
	  * Sets the modified value for this DFUFileDetail.
	  * 
	  * @param modified
	  */
	 public void setModified(java.lang.String modified) {
		 this.modified = modified;
	 }


	 /**
	  * Gets the ecl value for this DFUFileDetail.
	  * 
	  * @return ecl
	  */
	 public java.lang.String getEcl() {
		 return ecl;
	 }


	 /**
	  * Sets the ecl value for this DFUFileDetail.
	  * 
	  * @param ecl
	  */
	 public void setEcl(java.lang.String ecl) {
		 this.ecl = ecl;
	 }


	 /**
	  * Gets the zipFile value for this DFUFileDetail.
	  * 
	  * @return zipFile
	  */
	 public java.lang.Boolean getZipFile() {
		 return zipFile;
	 }


	 /**
	  * Sets the zipFile value for this DFUFileDetail.
	  * 
	  * @param zipFile
	  */
	 public void setZipFile(java.lang.Boolean zipFile) {
		 this.zipFile = zipFile;
	 }


	 /**
	  * Gets the stat value for this DFUFileDetail.
	  * 
	  * @return stat
	  */
	 public org.hpccsystems.ws.wsdfu.DFUFileStat getStat() {
		 return stat;
	 }


	 /**
	  * Sets the stat value for this DFUFileDetail.
	  * 
	  * @param stat
	  */
	 public void setStat(org.hpccsystems.ws.wsdfu.DFUFileStat stat) {
		 this.stat = stat;
	 }


	 /**
	  * Gets the DFUFileParts value for this DFUFileDetail.
	  * 
	  * @return DFUFileParts
	  */
	 public org.hpccsystems.ws.wsdfu.DFUPart[] getDFUFileParts() {
		 return DFUFileParts;
	 }


	 /**
	  * Sets the DFUFileParts value for this DFUFileDetail.
	  * 
	  * @param DFUFileParts
	  */
	 public void setDFUFileParts(org.hpccsystems.ws.wsdfu.DFUPart[] DFUFileParts) {
		 this.DFUFileParts = DFUFileParts;
	 }


	 /**
	  * Gets the isSuperfile value for this DFUFileDetail.
	  * 
	  * @return isSuperfile
	  */
	 public java.lang.Boolean getIsSuperfile() {
		 return isSuperfile;
	 }


	 /**
	  * Sets the isSuperfile value for this DFUFileDetail.
	  * 
	  * @param isSuperfile
	  */
	 public void setIsSuperfile(java.lang.Boolean isSuperfile) {
		 this.isSuperfile = isSuperfile;
	 }


	 /**
	  * Gets the showFileContent value for this DFUFileDetail.
	  * 
	  * @return showFileContent
	  */
	 public java.lang.Boolean getShowFileContent() {
		 return showFileContent;
	 }


	 /**
	  * Sets the showFileContent value for this DFUFileDetail.
	  * 
	  * @param showFileContent
	  */
	 public void setShowFileContent(java.lang.Boolean showFileContent) {
		 this.showFileContent = showFileContent;
	 }


	 /**
	  * Gets the subfiles value for this DFUFileDetail.
	  * 
	  * @return subfiles
	  */
	 public java.lang.String[] getSubfiles() {
		 return subfiles;
	 }


	 /**
	  * Sets the subfiles value for this DFUFileDetail.
	  * 
	  * @param subfiles
	  */
	 public void setSubfiles(java.lang.String[] subfiles) {
		 this.subfiles = subfiles;
	 }


	 /**
	  * Gets the superfiles value for this DFUFileDetail.
	  * 
	  * @return superfiles
	  */
	 public org.hpccsystems.ws.wsdfu.DFULogicalFile[] getSuperfiles() {
		 return superfiles;
	 }


	 /**
	  * Sets the superfiles value for this DFUFileDetail.
	  * 
	  * @param superfiles
	  */
	 public void setSuperfiles(org.hpccsystems.ws.wsdfu.DFULogicalFile[] superfiles) {
		 this.superfiles = superfiles;
	 }


	 /**
	  * Gets the fromRoxieCluster value for this DFUFileDetail.
	  * 
	  * @return fromRoxieCluster
	  */
	 public java.lang.Boolean getFromRoxieCluster() {
		 return fromRoxieCluster;
	 }


	 /**
	  * Sets the fromRoxieCluster value for this DFUFileDetail.
	  * 
	  * @param fromRoxieCluster
	  */
	 public void setFromRoxieCluster(java.lang.Boolean fromRoxieCluster) {
		 this.fromRoxieCluster = fromRoxieCluster;
	 }


	 /**
	  * Gets the graphs value for this DFUFileDetail.
	  * 
	  * @return graphs
	  */
	 public java.lang.String[] getGraphs() {
		 return graphs;
	 }


	 /**
	  * Sets the graphs value for this DFUFileDetail.
	  * 
	  * @param graphs
	  */
	 public void setGraphs(java.lang.String[] graphs) {
		 this.graphs = graphs;
	 }


	 /**
	  * Gets the userPermission value for this DFUFileDetail.
	  * 
	  * @return userPermission
	  */
	 public java.lang.String getUserPermission() {
		 return userPermission;
	 }


	 /**
	  * Sets the userPermission value for this DFUFileDetail.
	  * 
	  * @param userPermission
	  */
	 public void setUserPermission(java.lang.String userPermission) {
		 this.userPermission = userPermission;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DFUFileDetail)) return false;
		 DFUFileDetail other = (DFUFileDetail) obj;
		 if (obj == null) return false;
		 if (this == obj) return true;
		 if (__equalsCalc != null) {
			 return (__equalsCalc == obj);
		 }
		 __equalsCalc = obj;
		 boolean _equals;
		 _equals = true && 
				 ((this.name==null && other.getName()==null) || 
						 (this.name!=null &&
						 this.name.equals(other.getName()))) &&
						 ((this.filename==null && other.getFilename()==null) || 
								 (this.filename!=null &&
								 this.filename.equals(other.getFilename()))) &&
								 ((this.description==null && other.getDescription()==null) || 
										 (this.description!=null &&
										 this.description.equals(other.getDescription()))) &&
										 ((this.dir==null && other.getDir()==null) || 
												 (this.dir!=null &&
												 this.dir.equals(other.getDir()))) &&
												 ((this.pathMask==null && other.getPathMask()==null) || 
														 (this.pathMask!=null &&
														 this.pathMask.equals(other.getPathMask()))) &&
														 ((this.filesize==null && other.getFilesize()==null) || 
																 (this.filesize!=null &&
																 this.filesize.equals(other.getFilesize()))) &&
																 ((this.actualSize==null && other.getActualSize()==null) || 
																		 (this.actualSize!=null &&
																		 this.actualSize.equals(other.getActualSize()))) &&
																		 ((this.recordSize==null && other.getRecordSize()==null) || 
																				 (this.recordSize!=null &&
																				 this.recordSize.equals(other.getRecordSize()))) &&
																				 ((this.recordCount==null && other.getRecordCount()==null) || 
																						 (this.recordCount!=null &&
																						 this.recordCount.equals(other.getRecordCount()))) &&
																						 ((this.wuid==null && other.getWuid()==null) || 
																								 (this.wuid!=null &&
																								 this.wuid.equals(other.getWuid()))) &&
																								 ((this.owner==null && other.getOwner()==null) || 
																										 (this.owner!=null &&
																										 this.owner.equals(other.getOwner()))) &&
																										 ((this.cluster==null && other.getCluster()==null) || 
																												 (this.cluster!=null &&
																												 this.cluster.equals(other.getCluster()))) &&
																												 ((this.jobName==null && other.getJobName()==null) || 
																														 (this.jobName!=null &&
																														 this.jobName.equals(other.getJobName()))) &&
																														 ((this.persistent==null && other.getPersistent()==null) || 
																																 (this.persistent!=null &&
																																 this.persistent.equals(other.getPersistent()))) &&
																																 ((this.format==null && other.getFormat()==null) || 
																																		 (this.format!=null &&
																																		 this.format.equals(other.getFormat()))) &&
																																		 ((this.maxRecordSize==null && other.getMaxRecordSize()==null) || 
																																				 (this.maxRecordSize!=null &&
																																				 this.maxRecordSize.equals(other.getMaxRecordSize()))) &&
																																				 ((this.csvSeparate==null && other.getCsvSeparate()==null) || 
																																						 (this.csvSeparate!=null &&
																																						 this.csvSeparate.equals(other.getCsvSeparate()))) &&
																																						 ((this.csvQuote==null && other.getCsvQuote()==null) || 
																																								 (this.csvQuote!=null &&
																																								 this.csvQuote.equals(other.getCsvQuote()))) &&
																																								 ((this.csvTerminate==null && other.getCsvTerminate()==null) || 
																																										 (this.csvTerminate!=null &&
																																										 this.csvTerminate.equals(other.getCsvTerminate()))) &&
																																										 ((this.modified==null && other.getModified()==null) || 
																																												 (this.modified!=null &&
																																												 this.modified.equals(other.getModified()))) &&
																																												 ((this.ecl==null && other.getEcl()==null) || 
																																														 (this.ecl!=null &&
																																														 this.ecl.equals(other.getEcl()))) &&
																																														 ((this.zipFile==null && other.getZipFile()==null) || 
																																																 (this.zipFile!=null &&
																																																 this.zipFile.equals(other.getZipFile()))) &&
																																																 ((this.stat==null && other.getStat()==null) || 
																																																		 (this.stat!=null &&
																																																		 this.stat.equals(other.getStat()))) &&
																																																		 ((this.DFUFileParts==null && other.getDFUFileParts()==null) || 
																																																				 (this.DFUFileParts!=null &&
																																																				 java.util.Arrays.equals(this.DFUFileParts, other.getDFUFileParts()))) &&
																																																				 ((this.isSuperfile==null && other.getIsSuperfile()==null) || 
																																																						 (this.isSuperfile!=null &&
																																																						 this.isSuperfile.equals(other.getIsSuperfile()))) &&
																																																						 ((this.showFileContent==null && other.getShowFileContent()==null) || 
																																																								 (this.showFileContent!=null &&
																																																								 this.showFileContent.equals(other.getShowFileContent()))) &&
																																																								 ((this.subfiles==null && other.getSubfiles()==null) || 
																																																										 (this.subfiles!=null &&
																																																										 java.util.Arrays.equals(this.subfiles, other.getSubfiles()))) &&
																																																										 ((this.superfiles==null && other.getSuperfiles()==null) || 
																																																												 (this.superfiles!=null &&
																																																												 java.util.Arrays.equals(this.superfiles, other.getSuperfiles()))) &&
																																																												 ((this.fromRoxieCluster==null && other.getFromRoxieCluster()==null) || 
																																																														 (this.fromRoxieCluster!=null &&
																																																														 this.fromRoxieCluster.equals(other.getFromRoxieCluster()))) &&
																																																														 ((this.graphs==null && other.getGraphs()==null) || 
																																																																 (this.graphs!=null &&
																																																																 java.util.Arrays.equals(this.graphs, other.getGraphs()))) &&
																																																																 ((this.userPermission==null && other.getUserPermission()==null) || 
																																																																		 (this.userPermission!=null &&
																																																																		 this.userPermission.equals(other.getUserPermission())));
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
		 if (getName() != null) {
			 _hashCode += getName().hashCode();
		 }
		 if (getFilename() != null) {
			 _hashCode += getFilename().hashCode();
		 }
		 if (getDescription() != null) {
			 _hashCode += getDescription().hashCode();
		 }
		 if (getDir() != null) {
			 _hashCode += getDir().hashCode();
		 }
		 if (getPathMask() != null) {
			 _hashCode += getPathMask().hashCode();
		 }
		 if (getFilesize() != null) {
			 _hashCode += getFilesize().hashCode();
		 }
		 if (getActualSize() != null) {
			 _hashCode += getActualSize().hashCode();
		 }
		 if (getRecordSize() != null) {
			 _hashCode += getRecordSize().hashCode();
		 }
		 if (getRecordCount() != null) {
			 _hashCode += getRecordCount().hashCode();
		 }
		 if (getWuid() != null) {
			 _hashCode += getWuid().hashCode();
		 }
		 if (getOwner() != null) {
			 _hashCode += getOwner().hashCode();
		 }
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getJobName() != null) {
			 _hashCode += getJobName().hashCode();
		 }
		 if (getPersistent() != null) {
			 _hashCode += getPersistent().hashCode();
		 }
		 if (getFormat() != null) {
			 _hashCode += getFormat().hashCode();
		 }
		 if (getMaxRecordSize() != null) {
			 _hashCode += getMaxRecordSize().hashCode();
		 }
		 if (getCsvSeparate() != null) {
			 _hashCode += getCsvSeparate().hashCode();
		 }
		 if (getCsvQuote() != null) {
			 _hashCode += getCsvQuote().hashCode();
		 }
		 if (getCsvTerminate() != null) {
			 _hashCode += getCsvTerminate().hashCode();
		 }
		 if (getModified() != null) {
			 _hashCode += getModified().hashCode();
		 }
		 if (getEcl() != null) {
			 _hashCode += getEcl().hashCode();
		 }
		 if (getZipFile() != null) {
			 _hashCode += getZipFile().hashCode();
		 }
		 if (getStat() != null) {
			 _hashCode += getStat().hashCode();
		 }
		 if (getDFUFileParts() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUFileParts());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUFileParts(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getIsSuperfile() != null) {
			 _hashCode += getIsSuperfile().hashCode();
		 }
		 if (getShowFileContent() != null) {
			 _hashCode += getShowFileContent().hashCode();
		 }
		 if (getSubfiles() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getSubfiles());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getSubfiles(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getSuperfiles() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getSuperfiles());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getSuperfiles(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getFromRoxieCluster() != null) {
			 _hashCode += getFromRoxieCluster().hashCode();
		 }
		 if (getGraphs() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getGraphs());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getGraphs(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getUserPermission() != null) {
			 _hashCode += getUserPermission().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(DFUFileDetail.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileDetail"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("filename");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Filename"));
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
		 elemField.setFieldName("dir");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Dir"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pathMask");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PathMask"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("filesize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Filesize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("actualSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ActualSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("recordSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordSize"));
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
		 elemField.setFieldName("wuid");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Wuid"));
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
		 elemField.setFieldName("cluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Cluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("jobName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "JobName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("persistent");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Persistent"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("format");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Format"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("maxRecordSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxRecordSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("csvSeparate");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CsvSeparate"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("csvQuote");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CsvQuote"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("csvTerminate");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CsvTerminate"));
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
		 elemField.setFieldName("ecl");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Ecl"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("zipFile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ZipFile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("stat");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Stat"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileStat"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUFileParts");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileParts"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPart"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPart"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isSuperfile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "isSuperfile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("showFileContent");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ShowFileContent"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("subfiles");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "subfiles"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Item"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("superfiles");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Superfiles"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFile"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFile"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("fromRoxieCluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FromRoxieCluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("graphs");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Graphs"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ECLGraph"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("userPermission");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "UserPermission"));
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
