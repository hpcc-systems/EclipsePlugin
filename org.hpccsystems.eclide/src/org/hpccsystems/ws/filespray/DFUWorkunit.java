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
 * DFUWorkunit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class DFUWorkunit  implements java.io.Serializable {
	private java.lang.String ID;

	private java.lang.String clusterName;

	private java.lang.String jobName;

	private java.lang.String queue;

	private java.lang.String user;

	private java.lang.Boolean isProtected;

	private java.lang.Integer command;

	private java.lang.String commandMessage;

	private java.lang.Integer percentDone;

	private java.lang.Integer secsLeft;

	private java.lang.String progressMessage;

	private java.lang.String summaryMessage;

	private java.lang.Integer state;

	private java.lang.String sourceLogicalName;

	private java.lang.String sourceIP;

	private java.lang.String sourceFilePath;

	private java.lang.String sourceDali;

	private java.lang.Integer sourceRecordSize;

	private java.lang.Integer sourceFormat;

	private java.lang.String rowTag;

	private java.lang.Integer sourceNumParts;

	private java.lang.String sourceDirectory;

	private java.lang.String destLogicalName;

	private java.lang.String destGroupName;

	private java.lang.String destDirectory;

	private java.lang.String destIP;

	private java.lang.String destFilePath;

	private java.lang.Integer destFormat;

	private java.lang.Integer destNumParts;

	private java.lang.Integer destRecordSize;

	private java.lang.Boolean replicate;

	private java.lang.Boolean overwrite;

	private java.lang.Boolean compress;

	private java.lang.String timeStarted;

	private java.lang.String timeStopped;

	private java.lang.String stateMessage;

	private java.lang.String monitorEventName;

	private java.lang.Boolean monitorSub;

	private java.lang.Integer monitorShotLimit;

	private java.lang.String sourceDiffKeyName;

	private java.lang.String destDiffKeyName;

	private java.lang.Boolean archived;

	private java.lang.String encrypt;

	private java.lang.String decrypt;

	public DFUWorkunit() {
	}

	public DFUWorkunit(
			java.lang.String ID,
			java.lang.String clusterName,
			java.lang.String jobName,
			java.lang.String queue,
			java.lang.String user,
			java.lang.Boolean isProtected,
			java.lang.Integer command,
			java.lang.String commandMessage,
			java.lang.Integer percentDone,
			java.lang.Integer secsLeft,
			java.lang.String progressMessage,
			java.lang.String summaryMessage,
			java.lang.Integer state,
			java.lang.String sourceLogicalName,
			java.lang.String sourceIP,
			java.lang.String sourceFilePath,
			java.lang.String sourceDali,
			java.lang.Integer sourceRecordSize,
			java.lang.Integer sourceFormat,
			java.lang.String rowTag,
			java.lang.Integer sourceNumParts,
			java.lang.String sourceDirectory,
			java.lang.String destLogicalName,
			java.lang.String destGroupName,
			java.lang.String destDirectory,
			java.lang.String destIP,
			java.lang.String destFilePath,
			java.lang.Integer destFormat,
			java.lang.Integer destNumParts,
			java.lang.Integer destRecordSize,
			java.lang.Boolean replicate,
			java.lang.Boolean overwrite,
			java.lang.Boolean compress,
			java.lang.String timeStarted,
			java.lang.String timeStopped,
			java.lang.String stateMessage,
			java.lang.String monitorEventName,
			java.lang.Boolean monitorSub,
			java.lang.Integer monitorShotLimit,
			java.lang.String sourceDiffKeyName,
			java.lang.String destDiffKeyName,
			java.lang.Boolean archived,
			java.lang.String encrypt,
			java.lang.String decrypt) {
		this.ID = ID;
		this.clusterName = clusterName;
		this.jobName = jobName;
		this.queue = queue;
		this.user = user;
		this.isProtected = isProtected;
		this.command = command;
		this.commandMessage = commandMessage;
		this.percentDone = percentDone;
		this.secsLeft = secsLeft;
		this.progressMessage = progressMessage;
		this.summaryMessage = summaryMessage;
		this.state = state;
		this.sourceLogicalName = sourceLogicalName;
		this.sourceIP = sourceIP;
		this.sourceFilePath = sourceFilePath;
		this.sourceDali = sourceDali;
		this.sourceRecordSize = sourceRecordSize;
		this.sourceFormat = sourceFormat;
		this.rowTag = rowTag;
		this.sourceNumParts = sourceNumParts;
		this.sourceDirectory = sourceDirectory;
		this.destLogicalName = destLogicalName;
		this.destGroupName = destGroupName;
		this.destDirectory = destDirectory;
		this.destIP = destIP;
		this.destFilePath = destFilePath;
		this.destFormat = destFormat;
		this.destNumParts = destNumParts;
		this.destRecordSize = destRecordSize;
		this.replicate = replicate;
		this.overwrite = overwrite;
		this.compress = compress;
		this.timeStarted = timeStarted;
		this.timeStopped = timeStopped;
		this.stateMessage = stateMessage;
		this.monitorEventName = monitorEventName;
		this.monitorSub = monitorSub;
		this.monitorShotLimit = monitorShotLimit;
		this.sourceDiffKeyName = sourceDiffKeyName;
		this.destDiffKeyName = destDiffKeyName;
		this.archived = archived;
		this.encrypt = encrypt;
		this.decrypt = decrypt;
	}


	/**
	 * Gets the ID value for this DFUWorkunit.
	 * 
	 * @return ID
	 */
	 public java.lang.String getID() {
		 return ID;
	 }


	/**
	 * Sets the ID value for this DFUWorkunit.
	 * 
	 * @param ID
	 */
	 public void setID(java.lang.String ID) {
		 this.ID = ID;
	 }


	/**
	 * Gets the clusterName value for this DFUWorkunit.
	 * 
	 * @return clusterName
	 */
	 public java.lang.String getClusterName() {
		 return clusterName;
	 }


	/**
	 * Sets the clusterName value for this DFUWorkunit.
	 * 
	 * @param clusterName
	 */
	 public void setClusterName(java.lang.String clusterName) {
		 this.clusterName = clusterName;
	 }


	/**
	 * Gets the jobName value for this DFUWorkunit.
	 * 
	 * @return jobName
	 */
	 public java.lang.String getJobName() {
		 return jobName;
	 }


	/**
	 * Sets the jobName value for this DFUWorkunit.
	 * 
	 * @param jobName
	 */
	 public void setJobName(java.lang.String jobName) {
		 this.jobName = jobName;
	 }


	 /**
	  * Gets the queue value for this DFUWorkunit.
	  * 
	  * @return queue
	  */
	 public java.lang.String getQueue() {
		 return queue;
	 }


	 /**
	  * Sets the queue value for this DFUWorkunit.
	  * 
	  * @param queue
	  */
	 public void setQueue(java.lang.String queue) {
		 this.queue = queue;
	 }


	 /**
	  * Gets the user value for this DFUWorkunit.
	  * 
	  * @return user
	  */
	 public java.lang.String getUser() {
		 return user;
	 }


	 /**
	  * Sets the user value for this DFUWorkunit.
	  * 
	  * @param user
	  */
	 public void setUser(java.lang.String user) {
		 this.user = user;
	 }


	 /**
	  * Gets the isProtected value for this DFUWorkunit.
	  * 
	  * @return isProtected
	  */
	 public java.lang.Boolean getIsProtected() {
		 return isProtected;
	 }


	 /**
	  * Sets the isProtected value for this DFUWorkunit.
	  * 
	  * @param isProtected
	  */
	 public void setIsProtected(java.lang.Boolean isProtected) {
		 this.isProtected = isProtected;
	 }


	 /**
	  * Gets the command value for this DFUWorkunit.
	  * 
	  * @return command
	  */
	 public java.lang.Integer getCommand() {
		 return command;
	 }


	 /**
	  * Sets the command value for this DFUWorkunit.
	  * 
	  * @param command
	  */
	 public void setCommand(java.lang.Integer command) {
		 this.command = command;
	 }


	 /**
	  * Gets the commandMessage value for this DFUWorkunit.
	  * 
	  * @return commandMessage
	  */
	 public java.lang.String getCommandMessage() {
		 return commandMessage;
	 }


	 /**
	  * Sets the commandMessage value for this DFUWorkunit.
	  * 
	  * @param commandMessage
	  */
	 public void setCommandMessage(java.lang.String commandMessage) {
		 this.commandMessage = commandMessage;
	 }


	 /**
	  * Gets the percentDone value for this DFUWorkunit.
	  * 
	  * @return percentDone
	  */
	 public java.lang.Integer getPercentDone() {
		 return percentDone;
	 }


	 /**
	  * Sets the percentDone value for this DFUWorkunit.
	  * 
	  * @param percentDone
	  */
	 public void setPercentDone(java.lang.Integer percentDone) {
		 this.percentDone = percentDone;
	 }


	 /**
	  * Gets the secsLeft value for this DFUWorkunit.
	  * 
	  * @return secsLeft
	  */
	 public java.lang.Integer getSecsLeft() {
		 return secsLeft;
	 }


	 /**
	  * Sets the secsLeft value for this DFUWorkunit.
	  * 
	  * @param secsLeft
	  */
	 public void setSecsLeft(java.lang.Integer secsLeft) {
		 this.secsLeft = secsLeft;
	 }


	 /**
	  * Gets the progressMessage value for this DFUWorkunit.
	  * 
	  * @return progressMessage
	  */
	 public java.lang.String getProgressMessage() {
		 return progressMessage;
	 }


	 /**
	  * Sets the progressMessage value for this DFUWorkunit.
	  * 
	  * @param progressMessage
	  */
	 public void setProgressMessage(java.lang.String progressMessage) {
		 this.progressMessage = progressMessage;
	 }


	 /**
	  * Gets the summaryMessage value for this DFUWorkunit.
	  * 
	  * @return summaryMessage
	  */
	 public java.lang.String getSummaryMessage() {
		 return summaryMessage;
	 }


	 /**
	  * Sets the summaryMessage value for this DFUWorkunit.
	  * 
	  * @param summaryMessage
	  */
	 public void setSummaryMessage(java.lang.String summaryMessage) {
		 this.summaryMessage = summaryMessage;
	 }


	 /**
	  * Gets the state value for this DFUWorkunit.
	  * 
	  * @return state
	  */
	 public java.lang.Integer getState() {
		 return state;
	 }


	 /**
	  * Sets the state value for this DFUWorkunit.
	  * 
	  * @param state
	  */
	 public void setState(java.lang.Integer state) {
		 this.state = state;
	 }


	 /**
	  * Gets the sourceLogicalName value for this DFUWorkunit.
	  * 
	  * @return sourceLogicalName
	  */
	 public java.lang.String getSourceLogicalName() {
		 return sourceLogicalName;
	 }


	 /**
	  * Sets the sourceLogicalName value for this DFUWorkunit.
	  * 
	  * @param sourceLogicalName
	  */
	 public void setSourceLogicalName(java.lang.String sourceLogicalName) {
		 this.sourceLogicalName = sourceLogicalName;
	 }


	 /**
	  * Gets the sourceIP value for this DFUWorkunit.
	  * 
	  * @return sourceIP
	  */
	 public java.lang.String getSourceIP() {
		 return sourceIP;
	 }


	 /**
	  * Sets the sourceIP value for this DFUWorkunit.
	  * 
	  * @param sourceIP
	  */
	 public void setSourceIP(java.lang.String sourceIP) {
		 this.sourceIP = sourceIP;
	 }


	 /**
	  * Gets the sourceFilePath value for this DFUWorkunit.
	  * 
	  * @return sourceFilePath
	  */
	 public java.lang.String getSourceFilePath() {
		 return sourceFilePath;
	 }


	 /**
	  * Sets the sourceFilePath value for this DFUWorkunit.
	  * 
	  * @param sourceFilePath
	  */
	 public void setSourceFilePath(java.lang.String sourceFilePath) {
		 this.sourceFilePath = sourceFilePath;
	 }


	 /**
	  * Gets the sourceDali value for this DFUWorkunit.
	  * 
	  * @return sourceDali
	  */
	 public java.lang.String getSourceDali() {
		 return sourceDali;
	 }


	 /**
	  * Sets the sourceDali value for this DFUWorkunit.
	  * 
	  * @param sourceDali
	  */
	 public void setSourceDali(java.lang.String sourceDali) {
		 this.sourceDali = sourceDali;
	 }


	 /**
	  * Gets the sourceRecordSize value for this DFUWorkunit.
	  * 
	  * @return sourceRecordSize
	  */
	 public java.lang.Integer getSourceRecordSize() {
		 return sourceRecordSize;
	 }


	 /**
	  * Sets the sourceRecordSize value for this DFUWorkunit.
	  * 
	  * @param sourceRecordSize
	  */
	 public void setSourceRecordSize(java.lang.Integer sourceRecordSize) {
		 this.sourceRecordSize = sourceRecordSize;
	 }


	 /**
	  * Gets the sourceFormat value for this DFUWorkunit.
	  * 
	  * @return sourceFormat
	  */
	 public java.lang.Integer getSourceFormat() {
		 return sourceFormat;
	 }


	 /**
	  * Sets the sourceFormat value for this DFUWorkunit.
	  * 
	  * @param sourceFormat
	  */
	 public void setSourceFormat(java.lang.Integer sourceFormat) {
		 this.sourceFormat = sourceFormat;
	 }


	 /**
	  * Gets the rowTag value for this DFUWorkunit.
	  * 
	  * @return rowTag
	  */
	 public java.lang.String getRowTag() {
		 return rowTag;
	 }


	 /**
	  * Sets the rowTag value for this DFUWorkunit.
	  * 
	  * @param rowTag
	  */
	 public void setRowTag(java.lang.String rowTag) {
		 this.rowTag = rowTag;
	 }


	 /**
	  * Gets the sourceNumParts value for this DFUWorkunit.
	  * 
	  * @return sourceNumParts
	  */
	 public java.lang.Integer getSourceNumParts() {
		 return sourceNumParts;
	 }


	 /**
	  * Sets the sourceNumParts value for this DFUWorkunit.
	  * 
	  * @param sourceNumParts
	  */
	 public void setSourceNumParts(java.lang.Integer sourceNumParts) {
		 this.sourceNumParts = sourceNumParts;
	 }


	 /**
	  * Gets the sourceDirectory value for this DFUWorkunit.
	  * 
	  * @return sourceDirectory
	  */
	 public java.lang.String getSourceDirectory() {
		 return sourceDirectory;
	 }


	 /**
	  * Sets the sourceDirectory value for this DFUWorkunit.
	  * 
	  * @param sourceDirectory
	  */
	 public void setSourceDirectory(java.lang.String sourceDirectory) {
		 this.sourceDirectory = sourceDirectory;
	 }


	 /**
	  * Gets the destLogicalName value for this DFUWorkunit.
	  * 
	  * @return destLogicalName
	  */
	 public java.lang.String getDestLogicalName() {
		 return destLogicalName;
	 }


	 /**
	  * Sets the destLogicalName value for this DFUWorkunit.
	  * 
	  * @param destLogicalName
	  */
	 public void setDestLogicalName(java.lang.String destLogicalName) {
		 this.destLogicalName = destLogicalName;
	 }


	 /**
	  * Gets the destGroupName value for this DFUWorkunit.
	  * 
	  * @return destGroupName
	  */
	 public java.lang.String getDestGroupName() {
		 return destGroupName;
	 }


	 /**
	  * Sets the destGroupName value for this DFUWorkunit.
	  * 
	  * @param destGroupName
	  */
	 public void setDestGroupName(java.lang.String destGroupName) {
		 this.destGroupName = destGroupName;
	 }


	 /**
	  * Gets the destDirectory value for this DFUWorkunit.
	  * 
	  * @return destDirectory
	  */
	 public java.lang.String getDestDirectory() {
		 return destDirectory;
	 }


	 /**
	  * Sets the destDirectory value for this DFUWorkunit.
	  * 
	  * @param destDirectory
	  */
	 public void setDestDirectory(java.lang.String destDirectory) {
		 this.destDirectory = destDirectory;
	 }


	 /**
	  * Gets the destIP value for this DFUWorkunit.
	  * 
	  * @return destIP
	  */
	 public java.lang.String getDestIP() {
		 return destIP;
	 }


	 /**
	  * Sets the destIP value for this DFUWorkunit.
	  * 
	  * @param destIP
	  */
	 public void setDestIP(java.lang.String destIP) {
		 this.destIP = destIP;
	 }


	 /**
	  * Gets the destFilePath value for this DFUWorkunit.
	  * 
	  * @return destFilePath
	  */
	 public java.lang.String getDestFilePath() {
		 return destFilePath;
	 }


	 /**
	  * Sets the destFilePath value for this DFUWorkunit.
	  * 
	  * @param destFilePath
	  */
	 public void setDestFilePath(java.lang.String destFilePath) {
		 this.destFilePath = destFilePath;
	 }


	 /**
	  * Gets the destFormat value for this DFUWorkunit.
	  * 
	  * @return destFormat
	  */
	 public java.lang.Integer getDestFormat() {
		 return destFormat;
	 }


	 /**
	  * Sets the destFormat value for this DFUWorkunit.
	  * 
	  * @param destFormat
	  */
	 public void setDestFormat(java.lang.Integer destFormat) {
		 this.destFormat = destFormat;
	 }


	 /**
	  * Gets the destNumParts value for this DFUWorkunit.
	  * 
	  * @return destNumParts
	  */
	 public java.lang.Integer getDestNumParts() {
		 return destNumParts;
	 }


	 /**
	  * Sets the destNumParts value for this DFUWorkunit.
	  * 
	  * @param destNumParts
	  */
	 public void setDestNumParts(java.lang.Integer destNumParts) {
		 this.destNumParts = destNumParts;
	 }


	 /**
	  * Gets the destRecordSize value for this DFUWorkunit.
	  * 
	  * @return destRecordSize
	  */
	 public java.lang.Integer getDestRecordSize() {
		 return destRecordSize;
	 }


	 /**
	  * Sets the destRecordSize value for this DFUWorkunit.
	  * 
	  * @param destRecordSize
	  */
	 public void setDestRecordSize(java.lang.Integer destRecordSize) {
		 this.destRecordSize = destRecordSize;
	 }


	 /**
	  * Gets the replicate value for this DFUWorkunit.
	  * 
	  * @return replicate
	  */
	 public java.lang.Boolean getReplicate() {
		 return replicate;
	 }


	 /**
	  * Sets the replicate value for this DFUWorkunit.
	  * 
	  * @param replicate
	  */
	 public void setReplicate(java.lang.Boolean replicate) {
		 this.replicate = replicate;
	 }


	 /**
	  * Gets the overwrite value for this DFUWorkunit.
	  * 
	  * @return overwrite
	  */
	 public java.lang.Boolean getOverwrite() {
		 return overwrite;
	 }


	 /**
	  * Sets the overwrite value for this DFUWorkunit.
	  * 
	  * @param overwrite
	  */
	 public void setOverwrite(java.lang.Boolean overwrite) {
		 this.overwrite = overwrite;
	 }


	 /**
	  * Gets the compress value for this DFUWorkunit.
	  * 
	  * @return compress
	  */
	 public java.lang.Boolean getCompress() {
		 return compress;
	 }


	 /**
	  * Sets the compress value for this DFUWorkunit.
	  * 
	  * @param compress
	  */
	 public void setCompress(java.lang.Boolean compress) {
		 this.compress = compress;
	 }


	 /**
	  * Gets the timeStarted value for this DFUWorkunit.
	  * 
	  * @return timeStarted
	  */
	 public java.lang.String getTimeStarted() {
		 return timeStarted;
	 }


	 /**
	  * Sets the timeStarted value for this DFUWorkunit.
	  * 
	  * @param timeStarted
	  */
	 public void setTimeStarted(java.lang.String timeStarted) {
		 this.timeStarted = timeStarted;
	 }


	 /**
	  * Gets the timeStopped value for this DFUWorkunit.
	  * 
	  * @return timeStopped
	  */
	 public java.lang.String getTimeStopped() {
		 return timeStopped;
	 }


	 /**
	  * Sets the timeStopped value for this DFUWorkunit.
	  * 
	  * @param timeStopped
	  */
	 public void setTimeStopped(java.lang.String timeStopped) {
		 this.timeStopped = timeStopped;
	 }


	 /**
	  * Gets the stateMessage value for this DFUWorkunit.
	  * 
	  * @return stateMessage
	  */
	 public java.lang.String getStateMessage() {
		 return stateMessage;
	 }


	 /**
	  * Sets the stateMessage value for this DFUWorkunit.
	  * 
	  * @param stateMessage
	  */
	 public void setStateMessage(java.lang.String stateMessage) {
		 this.stateMessage = stateMessage;
	 }


	 /**
	  * Gets the monitorEventName value for this DFUWorkunit.
	  * 
	  * @return monitorEventName
	  */
	 public java.lang.String getMonitorEventName() {
		 return monitorEventName;
	 }


	 /**
	  * Sets the monitorEventName value for this DFUWorkunit.
	  * 
	  * @param monitorEventName
	  */
	 public void setMonitorEventName(java.lang.String monitorEventName) {
		 this.monitorEventName = monitorEventName;
	 }


	 /**
	  * Gets the monitorSub value for this DFUWorkunit.
	  * 
	  * @return monitorSub
	  */
	 public java.lang.Boolean getMonitorSub() {
		 return monitorSub;
	 }


	 /**
	  * Sets the monitorSub value for this DFUWorkunit.
	  * 
	  * @param monitorSub
	  */
	 public void setMonitorSub(java.lang.Boolean monitorSub) {
		 this.monitorSub = monitorSub;
	 }


	 /**
	  * Gets the monitorShotLimit value for this DFUWorkunit.
	  * 
	  * @return monitorShotLimit
	  */
	 public java.lang.Integer getMonitorShotLimit() {
		 return monitorShotLimit;
	 }


	 /**
	  * Sets the monitorShotLimit value for this DFUWorkunit.
	  * 
	  * @param monitorShotLimit
	  */
	 public void setMonitorShotLimit(java.lang.Integer monitorShotLimit) {
		 this.monitorShotLimit = monitorShotLimit;
	 }


	 /**
	  * Gets the sourceDiffKeyName value for this DFUWorkunit.
	  * 
	  * @return sourceDiffKeyName
	  */
	 public java.lang.String getSourceDiffKeyName() {
		 return sourceDiffKeyName;
	 }


	 /**
	  * Sets the sourceDiffKeyName value for this DFUWorkunit.
	  * 
	  * @param sourceDiffKeyName
	  */
	 public void setSourceDiffKeyName(java.lang.String sourceDiffKeyName) {
		 this.sourceDiffKeyName = sourceDiffKeyName;
	 }


	 /**
	  * Gets the destDiffKeyName value for this DFUWorkunit.
	  * 
	  * @return destDiffKeyName
	  */
	 public java.lang.String getDestDiffKeyName() {
		 return destDiffKeyName;
	 }


	 /**
	  * Sets the destDiffKeyName value for this DFUWorkunit.
	  * 
	  * @param destDiffKeyName
	  */
	 public void setDestDiffKeyName(java.lang.String destDiffKeyName) {
		 this.destDiffKeyName = destDiffKeyName;
	 }


	 /**
	  * Gets the archived value for this DFUWorkunit.
	  * 
	  * @return archived
	  */
	 public java.lang.Boolean getArchived() {
		 return archived;
	 }


	 /**
	  * Sets the archived value for this DFUWorkunit.
	  * 
	  * @param archived
	  */
	 public void setArchived(java.lang.Boolean archived) {
		 this.archived = archived;
	 }


	 /**
	  * Gets the encrypt value for this DFUWorkunit.
	  * 
	  * @return encrypt
	  */
	 public java.lang.String getEncrypt() {
		 return encrypt;
	 }


	 /**
	  * Sets the encrypt value for this DFUWorkunit.
	  * 
	  * @param encrypt
	  */
	 public void setEncrypt(java.lang.String encrypt) {
		 this.encrypt = encrypt;
	 }


	 /**
	  * Gets the decrypt value for this DFUWorkunit.
	  * 
	  * @return decrypt
	  */
	 public java.lang.String getDecrypt() {
		 return decrypt;
	 }


	 /**
	  * Sets the decrypt value for this DFUWorkunit.
	  * 
	  * @param decrypt
	  */
	 public void setDecrypt(java.lang.String decrypt) {
		 this.decrypt = decrypt;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DFUWorkunit)) {
			return false;
		}
		 DFUWorkunit other = (DFUWorkunit) obj;
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
				 ((this.ID==null && other.getID()==null) || 
						 (this.ID!=null &&
						 this.ID.equals(other.getID()))) &&
						 ((this.clusterName==null && other.getClusterName()==null) || 
								 (this.clusterName!=null &&
								 this.clusterName.equals(other.getClusterName()))) &&
								 ((this.jobName==null && other.getJobName()==null) || 
										 (this.jobName!=null &&
										 this.jobName.equals(other.getJobName()))) &&
										 ((this.queue==null && other.getQueue()==null) || 
												 (this.queue!=null &&
												 this.queue.equals(other.getQueue()))) &&
												 ((this.user==null && other.getUser()==null) || 
														 (this.user!=null &&
														 this.user.equals(other.getUser()))) &&
														 ((this.isProtected==null && other.getIsProtected()==null) || 
																 (this.isProtected!=null &&
																 this.isProtected.equals(other.getIsProtected()))) &&
																 ((this.command==null && other.getCommand()==null) || 
																		 (this.command!=null &&
																		 this.command.equals(other.getCommand()))) &&
																		 ((this.commandMessage==null && other.getCommandMessage()==null) || 
																				 (this.commandMessage!=null &&
																				 this.commandMessage.equals(other.getCommandMessage()))) &&
																				 ((this.percentDone==null && other.getPercentDone()==null) || 
																						 (this.percentDone!=null &&
																						 this.percentDone.equals(other.getPercentDone()))) &&
																						 ((this.secsLeft==null && other.getSecsLeft()==null) || 
																								 (this.secsLeft!=null &&
																								 this.secsLeft.equals(other.getSecsLeft()))) &&
																								 ((this.progressMessage==null && other.getProgressMessage()==null) || 
																										 (this.progressMessage!=null &&
																										 this.progressMessage.equals(other.getProgressMessage()))) &&
																										 ((this.summaryMessage==null && other.getSummaryMessage()==null) || 
																												 (this.summaryMessage!=null &&
																												 this.summaryMessage.equals(other.getSummaryMessage()))) &&
																												 ((this.state==null && other.getState()==null) || 
																														 (this.state!=null &&
																														 this.state.equals(other.getState()))) &&
																														 ((this.sourceLogicalName==null && other.getSourceLogicalName()==null) || 
																																 (this.sourceLogicalName!=null &&
																																 this.sourceLogicalName.equals(other.getSourceLogicalName()))) &&
																																 ((this.sourceIP==null && other.getSourceIP()==null) || 
																																		 (this.sourceIP!=null &&
																																		 this.sourceIP.equals(other.getSourceIP()))) &&
																																		 ((this.sourceFilePath==null && other.getSourceFilePath()==null) || 
																																				 (this.sourceFilePath!=null &&
																																				 this.sourceFilePath.equals(other.getSourceFilePath()))) &&
																																				 ((this.sourceDali==null && other.getSourceDali()==null) || 
																																						 (this.sourceDali!=null &&
																																						 this.sourceDali.equals(other.getSourceDali()))) &&
																																						 ((this.sourceRecordSize==null && other.getSourceRecordSize()==null) || 
																																								 (this.sourceRecordSize!=null &&
																																								 this.sourceRecordSize.equals(other.getSourceRecordSize()))) &&
																																								 ((this.sourceFormat==null && other.getSourceFormat()==null) || 
																																										 (this.sourceFormat!=null &&
																																										 this.sourceFormat.equals(other.getSourceFormat()))) &&
																																										 ((this.rowTag==null && other.getRowTag()==null) || 
																																												 (this.rowTag!=null &&
																																												 this.rowTag.equals(other.getRowTag()))) &&
																																												 ((this.sourceNumParts==null && other.getSourceNumParts()==null) || 
																																														 (this.sourceNumParts!=null &&
																																														 this.sourceNumParts.equals(other.getSourceNumParts()))) &&
																																														 ((this.sourceDirectory==null && other.getSourceDirectory()==null) || 
																																																 (this.sourceDirectory!=null &&
																																																 this.sourceDirectory.equals(other.getSourceDirectory()))) &&
																																																 ((this.destLogicalName==null && other.getDestLogicalName()==null) || 
																																																		 (this.destLogicalName!=null &&
																																																		 this.destLogicalName.equals(other.getDestLogicalName()))) &&
																																																		 ((this.destGroupName==null && other.getDestGroupName()==null) || 
																																																				 (this.destGroupName!=null &&
																																																				 this.destGroupName.equals(other.getDestGroupName()))) &&
																																																				 ((this.destDirectory==null && other.getDestDirectory()==null) || 
																																																						 (this.destDirectory!=null &&
																																																						 this.destDirectory.equals(other.getDestDirectory()))) &&
																																																						 ((this.destIP==null && other.getDestIP()==null) || 
																																																								 (this.destIP!=null &&
																																																								 this.destIP.equals(other.getDestIP()))) &&
																																																								 ((this.destFilePath==null && other.getDestFilePath()==null) || 
																																																										 (this.destFilePath!=null &&
																																																										 this.destFilePath.equals(other.getDestFilePath()))) &&
																																																										 ((this.destFormat==null && other.getDestFormat()==null) || 
																																																												 (this.destFormat!=null &&
																																																												 this.destFormat.equals(other.getDestFormat()))) &&
																																																												 ((this.destNumParts==null && other.getDestNumParts()==null) || 
																																																														 (this.destNumParts!=null &&
																																																														 this.destNumParts.equals(other.getDestNumParts()))) &&
																																																														 ((this.destRecordSize==null && other.getDestRecordSize()==null) || 
																																																																 (this.destRecordSize!=null &&
																																																																 this.destRecordSize.equals(other.getDestRecordSize()))) &&
																																																																 ((this.replicate==null && other.getReplicate()==null) || 
																																																																		 (this.replicate!=null &&
																																																																		 this.replicate.equals(other.getReplicate()))) &&
																																																																		 ((this.overwrite==null && other.getOverwrite()==null) || 
																																																																				 (this.overwrite!=null &&
																																																																				 this.overwrite.equals(other.getOverwrite()))) &&
																																																																				 ((this.compress==null && other.getCompress()==null) || 
																																																																						 (this.compress!=null &&
																																																																						 this.compress.equals(other.getCompress()))) &&
																																																																						 ((this.timeStarted==null && other.getTimeStarted()==null) || 
																																																																								 (this.timeStarted!=null &&
																																																																								 this.timeStarted.equals(other.getTimeStarted()))) &&
																																																																								 ((this.timeStopped==null && other.getTimeStopped()==null) || 
																																																																										 (this.timeStopped!=null &&
																																																																										 this.timeStopped.equals(other.getTimeStopped()))) &&
																																																																										 ((this.stateMessage==null && other.getStateMessage()==null) || 
																																																																												 (this.stateMessage!=null &&
																																																																												 this.stateMessage.equals(other.getStateMessage()))) &&
																																																																												 ((this.monitorEventName==null && other.getMonitorEventName()==null) || 
																																																																														 (this.monitorEventName!=null &&
																																																																														 this.monitorEventName.equals(other.getMonitorEventName()))) &&
																																																																														 ((this.monitorSub==null && other.getMonitorSub()==null) || 
																																																																																 (this.monitorSub!=null &&
																																																																																 this.monitorSub.equals(other.getMonitorSub()))) &&
																																																																																 ((this.monitorShotLimit==null && other.getMonitorShotLimit()==null) || 
																																																																																		 (this.monitorShotLimit!=null &&
																																																																																		 this.monitorShotLimit.equals(other.getMonitorShotLimit()))) &&
																																																																																		 ((this.sourceDiffKeyName==null && other.getSourceDiffKeyName()==null) || 
																																																																																				 (this.sourceDiffKeyName!=null &&
																																																																																				 this.sourceDiffKeyName.equals(other.getSourceDiffKeyName()))) &&
																																																																																				 ((this.destDiffKeyName==null && other.getDestDiffKeyName()==null) || 
																																																																																						 (this.destDiffKeyName!=null &&
																																																																																						 this.destDiffKeyName.equals(other.getDestDiffKeyName()))) &&
																																																																																						 ((this.archived==null && other.getArchived()==null) || 
																																																																																								 (this.archived!=null &&
																																																																																								 this.archived.equals(other.getArchived()))) &&
																																																																																								 ((this.encrypt==null && other.getEncrypt()==null) || 
																																																																																										 (this.encrypt!=null &&
																																																																																										 this.encrypt.equals(other.getEncrypt()))) &&
																																																																																										 ((this.decrypt==null && other.getDecrypt()==null) || 
																																																																																												 (this.decrypt!=null &&
																																																																																												 this.decrypt.equals(other.getDecrypt())));
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
		 if (getID() != null) {
			 _hashCode += getID().hashCode();
		 }
		 if (getClusterName() != null) {
			 _hashCode += getClusterName().hashCode();
		 }
		 if (getJobName() != null) {
			 _hashCode += getJobName().hashCode();
		 }
		 if (getQueue() != null) {
			 _hashCode += getQueue().hashCode();
		 }
		 if (getUser() != null) {
			 _hashCode += getUser().hashCode();
		 }
		 if (getIsProtected() != null) {
			 _hashCode += getIsProtected().hashCode();
		 }
		 if (getCommand() != null) {
			 _hashCode += getCommand().hashCode();
		 }
		 if (getCommandMessage() != null) {
			 _hashCode += getCommandMessage().hashCode();
		 }
		 if (getPercentDone() != null) {
			 _hashCode += getPercentDone().hashCode();
		 }
		 if (getSecsLeft() != null) {
			 _hashCode += getSecsLeft().hashCode();
		 }
		 if (getProgressMessage() != null) {
			 _hashCode += getProgressMessage().hashCode();
		 }
		 if (getSummaryMessage() != null) {
			 _hashCode += getSummaryMessage().hashCode();
		 }
		 if (getState() != null) {
			 _hashCode += getState().hashCode();
		 }
		 if (getSourceLogicalName() != null) {
			 _hashCode += getSourceLogicalName().hashCode();
		 }
		 if (getSourceIP() != null) {
			 _hashCode += getSourceIP().hashCode();
		 }
		 if (getSourceFilePath() != null) {
			 _hashCode += getSourceFilePath().hashCode();
		 }
		 if (getSourceDali() != null) {
			 _hashCode += getSourceDali().hashCode();
		 }
		 if (getSourceRecordSize() != null) {
			 _hashCode += getSourceRecordSize().hashCode();
		 }
		 if (getSourceFormat() != null) {
			 _hashCode += getSourceFormat().hashCode();
		 }
		 if (getRowTag() != null) {
			 _hashCode += getRowTag().hashCode();
		 }
		 if (getSourceNumParts() != null) {
			 _hashCode += getSourceNumParts().hashCode();
		 }
		 if (getSourceDirectory() != null) {
			 _hashCode += getSourceDirectory().hashCode();
		 }
		 if (getDestLogicalName() != null) {
			 _hashCode += getDestLogicalName().hashCode();
		 }
		 if (getDestGroupName() != null) {
			 _hashCode += getDestGroupName().hashCode();
		 }
		 if (getDestDirectory() != null) {
			 _hashCode += getDestDirectory().hashCode();
		 }
		 if (getDestIP() != null) {
			 _hashCode += getDestIP().hashCode();
		 }
		 if (getDestFilePath() != null) {
			 _hashCode += getDestFilePath().hashCode();
		 }
		 if (getDestFormat() != null) {
			 _hashCode += getDestFormat().hashCode();
		 }
		 if (getDestNumParts() != null) {
			 _hashCode += getDestNumParts().hashCode();
		 }
		 if (getDestRecordSize() != null) {
			 _hashCode += getDestRecordSize().hashCode();
		 }
		 if (getReplicate() != null) {
			 _hashCode += getReplicate().hashCode();
		 }
		 if (getOverwrite() != null) {
			 _hashCode += getOverwrite().hashCode();
		 }
		 if (getCompress() != null) {
			 _hashCode += getCompress().hashCode();
		 }
		 if (getTimeStarted() != null) {
			 _hashCode += getTimeStarted().hashCode();
		 }
		 if (getTimeStopped() != null) {
			 _hashCode += getTimeStopped().hashCode();
		 }
		 if (getStateMessage() != null) {
			 _hashCode += getStateMessage().hashCode();
		 }
		 if (getMonitorEventName() != null) {
			 _hashCode += getMonitorEventName().hashCode();
		 }
		 if (getMonitorSub() != null) {
			 _hashCode += getMonitorSub().hashCode();
		 }
		 if (getMonitorShotLimit() != null) {
			 _hashCode += getMonitorShotLimit().hashCode();
		 }
		 if (getSourceDiffKeyName() != null) {
			 _hashCode += getSourceDiffKeyName().hashCode();
		 }
		 if (getDestDiffKeyName() != null) {
			 _hashCode += getDestDiffKeyName().hashCode();
		 }
		 if (getArchived() != null) {
			 _hashCode += getArchived().hashCode();
		 }
		 if (getEncrypt() != null) {
			 _hashCode += getEncrypt().hashCode();
		 }
		 if (getDecrypt() != null) {
			 _hashCode += getDecrypt().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(DFUWorkunit.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUWorkunit"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("ID");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ID"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("clusterName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ClusterName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("jobName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "JobName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("queue");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Queue"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("user");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "User"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isProtected");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "isProtected"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("command");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Command"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("commandMessage");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "CommandMessage"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("percentDone");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PercentDone"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("secsLeft");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SecsLeft"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("progressMessage");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ProgressMessage"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("summaryMessage");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SummaryMessage"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("state");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "State"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceLogicalName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceLogicalName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceIP");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceIP"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceFilePath");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceFilePath"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceDali");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceDali"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceRecordSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceRecordSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceFormat");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceFormat"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("rowTag");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "RowTag"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceNumParts");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceNumParts"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceDirectory");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceDirectory"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("destLogicalName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestLogicalName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("destGroupName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestGroupName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("destDirectory");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestDirectory"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("destIP");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestIP"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("destFilePath");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestFilePath"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("destFormat");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestFormat"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("destNumParts");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestNumParts"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("destRecordSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestRecordSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("replicate");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Replicate"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("overwrite");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Overwrite"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("compress");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Compress"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("timeStarted");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "TimeStarted"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("timeStopped");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "TimeStopped"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("stateMessage");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "StateMessage"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("monitorEventName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "MonitorEventName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("monitorSub");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "MonitorSub"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("monitorShotLimit");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "MonitorShotLimit"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceDiffKeyName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceDiffKeyName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("destDiffKeyName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestDiffKeyName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("archived");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Archived"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("encrypt");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "encrypt"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("decrypt");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "decrypt"));
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
