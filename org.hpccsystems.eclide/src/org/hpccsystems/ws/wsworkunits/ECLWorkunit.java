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
 * ECLWorkunit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class ECLWorkunit  implements java.io.Serializable {
	private java.lang.String wuid;

	private java.lang.String owner;

	private java.lang.String cluster;

	private java.lang.String roxieCluster;

	private java.lang.String jobname;

	private java.lang.String queue;

	private java.lang.Integer stateID;

	private java.lang.String state;

	private java.lang.String stateEx;

	private java.lang.String description;

	private java.lang.Boolean _protected;

	private java.lang.Boolean active;

	private java.lang.Integer action;

	private java.lang.String actionEx;

	private java.util.Calendar dateTimeScheduled;

	private java.lang.Integer priorityClass;

	private java.lang.Integer priorityLevel;

	private java.lang.String scope;

	private java.lang.String snapshot;

	private java.lang.Integer resultLimit;

	private java.lang.Boolean archived;

	private java.lang.Boolean isPausing;

	private java.lang.Boolean thorLCR;

	private java.lang.Integer eventSchedule;

	private java.lang.Boolean haveSubGraphTimings;

	private java.lang.String totalThorTime;

	private org.hpccsystems.ws.wsworkunits.ECLQuery query;

	private org.hpccsystems.ws.wsworkunits.ECLHelpFile[] helpers;

	private org.hpccsystems.ws.wsworkunits.ECLException[] exceptions;

	private org.hpccsystems.ws.wsworkunits.ECLGraph[] graphs;

	private org.hpccsystems.ws.wsworkunits.ECLSourceFile[] sourceFiles;

	private org.hpccsystems.ws.wsworkunits.ECLResult[] results;

	private org.hpccsystems.ws.wsworkunits.ECLResult[] variables;

	private org.hpccsystems.ws.wsworkunits.ECLTimer[] timers;

	private org.hpccsystems.ws.wsworkunits.DebugValue[] debugValues;

	private org.hpccsystems.ws.wsworkunits.ApplicationValue[] applicationValues;

	private org.hpccsystems.ws.wsworkunits.ECLWorkflow[] workflows;

	private org.hpccsystems.ws.wsworkunits.ECLTimingData[] timingData;

	private java.lang.String[] allowedClusters;

	private java.lang.Integer errorCount;

	private java.lang.Integer warningCount;

	private java.lang.Integer infoCount;

	private java.lang.Integer graphCount;

	private java.lang.Integer sourceFileCount;

	private java.lang.Integer resultCount;

	private java.lang.Integer variableCount;

	private java.lang.Integer timerCount;

	private java.lang.Boolean hasDebugValue;

	private java.lang.Integer applicationValueCount;

	private java.lang.String xmlParams;

	private java.lang.Integer accessFlag;

	private java.lang.Integer clusterFlag;

	private java.lang.String helpersDesc;

	private java.lang.String graphsDesc;

	private java.lang.String sourceFilesDesc;

	private java.lang.String resultsDesc;

	private java.lang.String variablesDesc;

	private java.lang.String timersDesc;

	private java.lang.String debugValuesDesc;

	private java.lang.String applicationValuesDesc;

	private java.lang.String workflowsDesc;

	private java.lang.Boolean hasArchiveQuery;

	public ECLWorkunit() {
	}

	public ECLWorkunit(
			java.lang.String wuid,
			java.lang.String owner,
			java.lang.String cluster,
			java.lang.String roxieCluster,
			java.lang.String jobname,
			java.lang.String queue,
			java.lang.Integer stateID,
			java.lang.String state,
			java.lang.String stateEx,
			java.lang.String description,
			java.lang.Boolean _protected,
			java.lang.Boolean active,
			java.lang.Integer action,
			java.lang.String actionEx,
			java.util.Calendar dateTimeScheduled,
			java.lang.Integer priorityClass,
			java.lang.Integer priorityLevel,
			java.lang.String scope,
			java.lang.String snapshot,
			java.lang.Integer resultLimit,
			java.lang.Boolean archived,
			java.lang.Boolean isPausing,
			java.lang.Boolean thorLCR,
			java.lang.Integer eventSchedule,
			java.lang.Boolean haveSubGraphTimings,
			java.lang.String totalThorTime,
			org.hpccsystems.ws.wsworkunits.ECLQuery query,
			org.hpccsystems.ws.wsworkunits.ECLHelpFile[] helpers,
			org.hpccsystems.ws.wsworkunits.ECLException[] exceptions,
			org.hpccsystems.ws.wsworkunits.ECLGraph[] graphs,
			org.hpccsystems.ws.wsworkunits.ECLSourceFile[] sourceFiles,
			org.hpccsystems.ws.wsworkunits.ECLResult[] results,
			org.hpccsystems.ws.wsworkunits.ECLResult[] variables,
			org.hpccsystems.ws.wsworkunits.ECLTimer[] timers,
			org.hpccsystems.ws.wsworkunits.DebugValue[] debugValues,
			org.hpccsystems.ws.wsworkunits.ApplicationValue[] applicationValues,
			org.hpccsystems.ws.wsworkunits.ECLWorkflow[] workflows,
			org.hpccsystems.ws.wsworkunits.ECLTimingData[] timingData,
			java.lang.String[] allowedClusters,
			java.lang.Integer errorCount,
			java.lang.Integer warningCount,
			java.lang.Integer infoCount,
			java.lang.Integer graphCount,
			java.lang.Integer sourceFileCount,
			java.lang.Integer resultCount,
			java.lang.Integer variableCount,
			java.lang.Integer timerCount,
			java.lang.Boolean hasDebugValue,
			java.lang.Integer applicationValueCount,
			java.lang.String xmlParams,
			java.lang.Integer accessFlag,
			java.lang.Integer clusterFlag,
			java.lang.String helpersDesc,
			java.lang.String graphsDesc,
			java.lang.String sourceFilesDesc,
			java.lang.String resultsDesc,
			java.lang.String variablesDesc,
			java.lang.String timersDesc,
			java.lang.String debugValuesDesc,
			java.lang.String applicationValuesDesc,
			java.lang.String workflowsDesc,
			java.lang.Boolean hasArchiveQuery) {
		this.wuid = wuid;
		this.owner = owner;
		this.cluster = cluster;
		this.roxieCluster = roxieCluster;
		this.jobname = jobname;
		this.queue = queue;
		this.stateID = stateID;
		this.state = state;
		this.stateEx = stateEx;
		this.description = description;
		this._protected = _protected;
		this.active = active;
		this.action = action;
		this.actionEx = actionEx;
		this.dateTimeScheduled = dateTimeScheduled;
		this.priorityClass = priorityClass;
		this.priorityLevel = priorityLevel;
		this.scope = scope;
		this.snapshot = snapshot;
		this.resultLimit = resultLimit;
		this.archived = archived;
		this.isPausing = isPausing;
		this.thorLCR = thorLCR;
		this.eventSchedule = eventSchedule;
		this.haveSubGraphTimings = haveSubGraphTimings;
		this.totalThorTime = totalThorTime;
		this.query = query;
		this.helpers = helpers;
		this.exceptions = exceptions;
		this.graphs = graphs;
		this.sourceFiles = sourceFiles;
		this.results = results;
		this.variables = variables;
		this.timers = timers;
		this.debugValues = debugValues;
		this.applicationValues = applicationValues;
		this.workflows = workflows;
		this.timingData = timingData;
		this.allowedClusters = allowedClusters;
		this.errorCount = errorCount;
		this.warningCount = warningCount;
		this.infoCount = infoCount;
		this.graphCount = graphCount;
		this.sourceFileCount = sourceFileCount;
		this.resultCount = resultCount;
		this.variableCount = variableCount;
		this.timerCount = timerCount;
		this.hasDebugValue = hasDebugValue;
		this.applicationValueCount = applicationValueCount;
		this.xmlParams = xmlParams;
		this.accessFlag = accessFlag;
		this.clusterFlag = clusterFlag;
		this.helpersDesc = helpersDesc;
		this.graphsDesc = graphsDesc;
		this.sourceFilesDesc = sourceFilesDesc;
		this.resultsDesc = resultsDesc;
		this.variablesDesc = variablesDesc;
		this.timersDesc = timersDesc;
		this.debugValuesDesc = debugValuesDesc;
		this.applicationValuesDesc = applicationValuesDesc;
		this.workflowsDesc = workflowsDesc;
		this.hasArchiveQuery = hasArchiveQuery;
	}


	/**
	 * Gets the wuid value for this ECLWorkunit.
	 * 
	 * @return wuid
	 */
	 public java.lang.String getWuid() {
		 return wuid;
	 }


	/**
	 * Sets the wuid value for this ECLWorkunit.
	 * 
	 * @param wuid
	 */
	 public void setWuid(java.lang.String wuid) {
		 this.wuid = wuid;
	 }


	/**
	 * Gets the owner value for this ECLWorkunit.
	 * 
	 * @return owner
	 */
	 public java.lang.String getOwner() {
		 return owner;
	 }


	/**
	 * Sets the owner value for this ECLWorkunit.
	 * 
	 * @param owner
	 */
	 public void setOwner(java.lang.String owner) {
		 this.owner = owner;
	 }


	/**
	 * Gets the cluster value for this ECLWorkunit.
	 * 
	 * @return cluster
	 */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	/**
	 * Sets the cluster value for this ECLWorkunit.
	 * 
	 * @param cluster
	 */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	/**
	 * Gets the roxieCluster value for this ECLWorkunit.
	 * 
	 * @return roxieCluster
	 */
	 public java.lang.String getRoxieCluster() {
		 return roxieCluster;
	 }


	/**
	 * Sets the roxieCluster value for this ECLWorkunit.
	 * 
	 * @param roxieCluster
	 */
	 public void setRoxieCluster(java.lang.String roxieCluster) {
		 this.roxieCluster = roxieCluster;
	 }


	 /**
	  * Gets the jobname value for this ECLWorkunit.
	  * 
	  * @return jobname
	  */
	 public java.lang.String getJobname() {
		 return jobname;
	 }


	 /**
	  * Sets the jobname value for this ECLWorkunit.
	  * 
	  * @param jobname
	  */
	 public void setJobname(java.lang.String jobname) {
		 this.jobname = jobname;
	 }


	 /**
	  * Gets the queue value for this ECLWorkunit.
	  * 
	  * @return queue
	  */
	 public java.lang.String getQueue() {
		 return queue;
	 }


	 /**
	  * Sets the queue value for this ECLWorkunit.
	  * 
	  * @param queue
	  */
	 public void setQueue(java.lang.String queue) {
		 this.queue = queue;
	 }


	 /**
	  * Gets the stateID value for this ECLWorkunit.
	  * 
	  * @return stateID
	  */
	 public java.lang.Integer getStateID() {
		 return stateID;
	 }


	 /**
	  * Sets the stateID value for this ECLWorkunit.
	  * 
	  * @param stateID
	  */
	 public void setStateID(java.lang.Integer stateID) {
		 this.stateID = stateID;
	 }


	 /**
	  * Gets the state value for this ECLWorkunit.
	  * 
	  * @return state
	  */
	 public java.lang.String getState() {
		 return state;
	 }


	 /**
	  * Sets the state value for this ECLWorkunit.
	  * 
	  * @param state
	  */
	 public void setState(java.lang.String state) {
		 this.state = state;
	 }


	 /**
	  * Gets the stateEx value for this ECLWorkunit.
	  * 
	  * @return stateEx
	  */
	 public java.lang.String getStateEx() {
		 return stateEx;
	 }


	 /**
	  * Sets the stateEx value for this ECLWorkunit.
	  * 
	  * @param stateEx
	  */
	 public void setStateEx(java.lang.String stateEx) {
		 this.stateEx = stateEx;
	 }


	 /**
	  * Gets the description value for this ECLWorkunit.
	  * 
	  * @return description
	  */
	 public java.lang.String getDescription() {
		 return description;
	 }


	 /**
	  * Sets the description value for this ECLWorkunit.
	  * 
	  * @param description
	  */
	 public void setDescription(java.lang.String description) {
		 this.description = description;
	 }


	 /**
	  * Gets the _protected value for this ECLWorkunit.
	  * 
	  * @return _protected
	  */
	 public java.lang.Boolean get_protected() {
		 return _protected;
	 }


	 /**
	  * Sets the _protected value for this ECLWorkunit.
	  * 
	  * @param _protected
	  */
	 public void set_protected(java.lang.Boolean _protected) {
		 this._protected = _protected;
	 }


	 /**
	  * Gets the active value for this ECLWorkunit.
	  * 
	  * @return active
	  */
	 public java.lang.Boolean getActive() {
		 return active;
	 }


	 /**
	  * Sets the active value for this ECLWorkunit.
	  * 
	  * @param active
	  */
	 public void setActive(java.lang.Boolean active) {
		 this.active = active;
	 }


	 /**
	  * Gets the action value for this ECLWorkunit.
	  * 
	  * @return action
	  */
	 public java.lang.Integer getAction() {
		 return action;
	 }


	 /**
	  * Sets the action value for this ECLWorkunit.
	  * 
	  * @param action
	  */
	 public void setAction(java.lang.Integer action) {
		 this.action = action;
	 }


	 /**
	  * Gets the actionEx value for this ECLWorkunit.
	  * 
	  * @return actionEx
	  */
	 public java.lang.String getActionEx() {
		 return actionEx;
	 }


	 /**
	  * Sets the actionEx value for this ECLWorkunit.
	  * 
	  * @param actionEx
	  */
	 public void setActionEx(java.lang.String actionEx) {
		 this.actionEx = actionEx;
	 }


	 /**
	  * Gets the dateTimeScheduled value for this ECLWorkunit.
	  * 
	  * @return dateTimeScheduled
	  */
	 public java.util.Calendar getDateTimeScheduled() {
		 return dateTimeScheduled;
	 }


	 /**
	  * Sets the dateTimeScheduled value for this ECLWorkunit.
	  * 
	  * @param dateTimeScheduled
	  */
	 public void setDateTimeScheduled(java.util.Calendar dateTimeScheduled) {
		 this.dateTimeScheduled = dateTimeScheduled;
	 }


	 /**
	  * Gets the priorityClass value for this ECLWorkunit.
	  * 
	  * @return priorityClass
	  */
	 public java.lang.Integer getPriorityClass() {
		 return priorityClass;
	 }


	 /**
	  * Sets the priorityClass value for this ECLWorkunit.
	  * 
	  * @param priorityClass
	  */
	 public void setPriorityClass(java.lang.Integer priorityClass) {
		 this.priorityClass = priorityClass;
	 }


	 /**
	  * Gets the priorityLevel value for this ECLWorkunit.
	  * 
	  * @return priorityLevel
	  */
	 public java.lang.Integer getPriorityLevel() {
		 return priorityLevel;
	 }


	 /**
	  * Sets the priorityLevel value for this ECLWorkunit.
	  * 
	  * @param priorityLevel
	  */
	 public void setPriorityLevel(java.lang.Integer priorityLevel) {
		 this.priorityLevel = priorityLevel;
	 }


	 /**
	  * Gets the scope value for this ECLWorkunit.
	  * 
	  * @return scope
	  */
	 public java.lang.String getScope() {
		 return scope;
	 }


	 /**
	  * Sets the scope value for this ECLWorkunit.
	  * 
	  * @param scope
	  */
	 public void setScope(java.lang.String scope) {
		 this.scope = scope;
	 }


	 /**
	  * Gets the snapshot value for this ECLWorkunit.
	  * 
	  * @return snapshot
	  */
	 public java.lang.String getSnapshot() {
		 return snapshot;
	 }


	 /**
	  * Sets the snapshot value for this ECLWorkunit.
	  * 
	  * @param snapshot
	  */
	 public void setSnapshot(java.lang.String snapshot) {
		 this.snapshot = snapshot;
	 }


	 /**
	  * Gets the resultLimit value for this ECLWorkunit.
	  * 
	  * @return resultLimit
	  */
	 public java.lang.Integer getResultLimit() {
		 return resultLimit;
	 }


	 /**
	  * Sets the resultLimit value for this ECLWorkunit.
	  * 
	  * @param resultLimit
	  */
	 public void setResultLimit(java.lang.Integer resultLimit) {
		 this.resultLimit = resultLimit;
	 }


	 /**
	  * Gets the archived value for this ECLWorkunit.
	  * 
	  * @return archived
	  */
	 public java.lang.Boolean getArchived() {
		 return archived;
	 }


	 /**
	  * Sets the archived value for this ECLWorkunit.
	  * 
	  * @param archived
	  */
	 public void setArchived(java.lang.Boolean archived) {
		 this.archived = archived;
	 }


	 /**
	  * Gets the isPausing value for this ECLWorkunit.
	  * 
	  * @return isPausing
	  */
	 public java.lang.Boolean getIsPausing() {
		 return isPausing;
	 }


	 /**
	  * Sets the isPausing value for this ECLWorkunit.
	  * 
	  * @param isPausing
	  */
	 public void setIsPausing(java.lang.Boolean isPausing) {
		 this.isPausing = isPausing;
	 }


	 /**
	  * Gets the thorLCR value for this ECLWorkunit.
	  * 
	  * @return thorLCR
	  */
	 public java.lang.Boolean getThorLCR() {
		 return thorLCR;
	 }


	 /**
	  * Sets the thorLCR value for this ECLWorkunit.
	  * 
	  * @param thorLCR
	  */
	 public void setThorLCR(java.lang.Boolean thorLCR) {
		 this.thorLCR = thorLCR;
	 }


	 /**
	  * Gets the eventSchedule value for this ECLWorkunit.
	  * 
	  * @return eventSchedule
	  */
	 public java.lang.Integer getEventSchedule() {
		 return eventSchedule;
	 }


	 /**
	  * Sets the eventSchedule value for this ECLWorkunit.
	  * 
	  * @param eventSchedule
	  */
	 public void setEventSchedule(java.lang.Integer eventSchedule) {
		 this.eventSchedule = eventSchedule;
	 }


	 /**
	  * Gets the haveSubGraphTimings value for this ECLWorkunit.
	  * 
	  * @return haveSubGraphTimings
	  */
	 public java.lang.Boolean getHaveSubGraphTimings() {
		 return haveSubGraphTimings;
	 }


	 /**
	  * Sets the haveSubGraphTimings value for this ECLWorkunit.
	  * 
	  * @param haveSubGraphTimings
	  */
	 public void setHaveSubGraphTimings(java.lang.Boolean haveSubGraphTimings) {
		 this.haveSubGraphTimings = haveSubGraphTimings;
	 }


	 /**
	  * Gets the totalThorTime value for this ECLWorkunit.
	  * 
	  * @return totalThorTime
	  */
	 public java.lang.String getTotalThorTime() {
		 return totalThorTime;
	 }


	 /**
	  * Sets the totalThorTime value for this ECLWorkunit.
	  * 
	  * @param totalThorTime
	  */
	 public void setTotalThorTime(java.lang.String totalThorTime) {
		 this.totalThorTime = totalThorTime;
	 }


	 /**
	  * Gets the query value for this ECLWorkunit.
	  * 
	  * @return query
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLQuery getQuery() {
		 return query;
	 }


	 /**
	  * Sets the query value for this ECLWorkunit.
	  * 
	  * @param query
	  */
	 public void setQuery(org.hpccsystems.ws.wsworkunits.ECLQuery query) {
		 this.query = query;
	 }


	 /**
	  * Gets the helpers value for this ECLWorkunit.
	  * 
	  * @return helpers
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLHelpFile[] getHelpers() {
		 return helpers;
	 }


	 /**
	  * Sets the helpers value for this ECLWorkunit.
	  * 
	  * @param helpers
	  */
	 public void setHelpers(org.hpccsystems.ws.wsworkunits.ECLHelpFile[] helpers) {
		 this.helpers = helpers;
	 }


	 /**
	  * Gets the exceptions value for this ECLWorkunit.
	  * 
	  * @return exceptions
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLException[] getExceptions() {
		 return exceptions;
	 }


	 /**
	  * Sets the exceptions value for this ECLWorkunit.
	  * 
	  * @param exceptions
	  */
	 public void setExceptions(org.hpccsystems.ws.wsworkunits.ECLException[] exceptions) {
		 this.exceptions = exceptions;
	 }


	 /**
	  * Gets the graphs value for this ECLWorkunit.
	  * 
	  * @return graphs
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLGraph[] getGraphs() {
		 return graphs;
	 }


	 /**
	  * Sets the graphs value for this ECLWorkunit.
	  * 
	  * @param graphs
	  */
	 public void setGraphs(org.hpccsystems.ws.wsworkunits.ECLGraph[] graphs) {
		 this.graphs = graphs;
	 }


	 /**
	  * Gets the sourceFiles value for this ECLWorkunit.
	  * 
	  * @return sourceFiles
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLSourceFile[] getSourceFiles() {
		 return sourceFiles;
	 }


	 /**
	  * Sets the sourceFiles value for this ECLWorkunit.
	  * 
	  * @param sourceFiles
	  */
	 public void setSourceFiles(org.hpccsystems.ws.wsworkunits.ECLSourceFile[] sourceFiles) {
		 this.sourceFiles = sourceFiles;
	 }


	 /**
	  * Gets the results value for this ECLWorkunit.
	  * 
	  * @return results
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLResult[] getResults() {
		 return results;
	 }


	 /**
	  * Sets the results value for this ECLWorkunit.
	  * 
	  * @param results
	  */
	 public void setResults(org.hpccsystems.ws.wsworkunits.ECLResult[] results) {
		 this.results = results;
	 }


	 /**
	  * Gets the variables value for this ECLWorkunit.
	  * 
	  * @return variables
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLResult[] getVariables() {
		 return variables;
	 }


	 /**
	  * Sets the variables value for this ECLWorkunit.
	  * 
	  * @param variables
	  */
	 public void setVariables(org.hpccsystems.ws.wsworkunits.ECLResult[] variables) {
		 this.variables = variables;
	 }


	 /**
	  * Gets the timers value for this ECLWorkunit.
	  * 
	  * @return timers
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLTimer[] getTimers() {
		 return timers;
	 }


	 /**
	  * Sets the timers value for this ECLWorkunit.
	  * 
	  * @param timers
	  */
	 public void setTimers(org.hpccsystems.ws.wsworkunits.ECLTimer[] timers) {
		 this.timers = timers;
	 }


	 /**
	  * Gets the debugValues value for this ECLWorkunit.
	  * 
	  * @return debugValues
	  */
	 public org.hpccsystems.ws.wsworkunits.DebugValue[] getDebugValues() {
		 return debugValues;
	 }


	 /**
	  * Sets the debugValues value for this ECLWorkunit.
	  * 
	  * @param debugValues
	  */
	 public void setDebugValues(org.hpccsystems.ws.wsworkunits.DebugValue[] debugValues) {
		 this.debugValues = debugValues;
	 }


	 /**
	  * Gets the applicationValues value for this ECLWorkunit.
	  * 
	  * @return applicationValues
	  */
	 public org.hpccsystems.ws.wsworkunits.ApplicationValue[] getApplicationValues() {
		 return applicationValues;
	 }


	 /**
	  * Sets the applicationValues value for this ECLWorkunit.
	  * 
	  * @param applicationValues
	  */
	 public void setApplicationValues(org.hpccsystems.ws.wsworkunits.ApplicationValue[] applicationValues) {
		 this.applicationValues = applicationValues;
	 }


	 /**
	  * Gets the workflows value for this ECLWorkunit.
	  * 
	  * @return workflows
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLWorkflow[] getWorkflows() {
		 return workflows;
	 }


	 /**
	  * Sets the workflows value for this ECLWorkunit.
	  * 
	  * @param workflows
	  */
	 public void setWorkflows(org.hpccsystems.ws.wsworkunits.ECLWorkflow[] workflows) {
		 this.workflows = workflows;
	 }


	 /**
	  * Gets the timingData value for this ECLWorkunit.
	  * 
	  * @return timingData
	  */
	 public org.hpccsystems.ws.wsworkunits.ECLTimingData[] getTimingData() {
		 return timingData;
	 }


	 /**
	  * Sets the timingData value for this ECLWorkunit.
	  * 
	  * @param timingData
	  */
	 public void setTimingData(org.hpccsystems.ws.wsworkunits.ECLTimingData[] timingData) {
		 this.timingData = timingData;
	 }


	 /**
	  * Gets the allowedClusters value for this ECLWorkunit.
	  * 
	  * @return allowedClusters
	  */
	 public java.lang.String[] getAllowedClusters() {
		 return allowedClusters;
	 }


	 /**
	  * Sets the allowedClusters value for this ECLWorkunit.
	  * 
	  * @param allowedClusters
	  */
	 public void setAllowedClusters(java.lang.String[] allowedClusters) {
		 this.allowedClusters = allowedClusters;
	 }


	 /**
	  * Gets the errorCount value for this ECLWorkunit.
	  * 
	  * @return errorCount
	  */
	 public java.lang.Integer getErrorCount() {
		 return errorCount;
	 }


	 /**
	  * Sets the errorCount value for this ECLWorkunit.
	  * 
	  * @param errorCount
	  */
	 public void setErrorCount(java.lang.Integer errorCount) {
		 this.errorCount = errorCount;
	 }


	 /**
	  * Gets the warningCount value for this ECLWorkunit.
	  * 
	  * @return warningCount
	  */
	 public java.lang.Integer getWarningCount() {
		 return warningCount;
	 }


	 /**
	  * Sets the warningCount value for this ECLWorkunit.
	  * 
	  * @param warningCount
	  */
	 public void setWarningCount(java.lang.Integer warningCount) {
		 this.warningCount = warningCount;
	 }


	 /**
	  * Gets the infoCount value for this ECLWorkunit.
	  * 
	  * @return infoCount
	  */
	 public java.lang.Integer getInfoCount() {
		 return infoCount;
	 }


	 /**
	  * Sets the infoCount value for this ECLWorkunit.
	  * 
	  * @param infoCount
	  */
	 public void setInfoCount(java.lang.Integer infoCount) {
		 this.infoCount = infoCount;
	 }


	 /**
	  * Gets the graphCount value for this ECLWorkunit.
	  * 
	  * @return graphCount
	  */
	 public java.lang.Integer getGraphCount() {
		 return graphCount;
	 }


	 /**
	  * Sets the graphCount value for this ECLWorkunit.
	  * 
	  * @param graphCount
	  */
	 public void setGraphCount(java.lang.Integer graphCount) {
		 this.graphCount = graphCount;
	 }


	 /**
	  * Gets the sourceFileCount value for this ECLWorkunit.
	  * 
	  * @return sourceFileCount
	  */
	 public java.lang.Integer getSourceFileCount() {
		 return sourceFileCount;
	 }


	 /**
	  * Sets the sourceFileCount value for this ECLWorkunit.
	  * 
	  * @param sourceFileCount
	  */
	 public void setSourceFileCount(java.lang.Integer sourceFileCount) {
		 this.sourceFileCount = sourceFileCount;
	 }


	 /**
	  * Gets the resultCount value for this ECLWorkunit.
	  * 
	  * @return resultCount
	  */
	 public java.lang.Integer getResultCount() {
		 return resultCount;
	 }


	 /**
	  * Sets the resultCount value for this ECLWorkunit.
	  * 
	  * @param resultCount
	  */
	 public void setResultCount(java.lang.Integer resultCount) {
		 this.resultCount = resultCount;
	 }


	 /**
	  * Gets the variableCount value for this ECLWorkunit.
	  * 
	  * @return variableCount
	  */
	 public java.lang.Integer getVariableCount() {
		 return variableCount;
	 }


	 /**
	  * Sets the variableCount value for this ECLWorkunit.
	  * 
	  * @param variableCount
	  */
	 public void setVariableCount(java.lang.Integer variableCount) {
		 this.variableCount = variableCount;
	 }


	 /**
	  * Gets the timerCount value for this ECLWorkunit.
	  * 
	  * @return timerCount
	  */
	 public java.lang.Integer getTimerCount() {
		 return timerCount;
	 }


	 /**
	  * Sets the timerCount value for this ECLWorkunit.
	  * 
	  * @param timerCount
	  */
	 public void setTimerCount(java.lang.Integer timerCount) {
		 this.timerCount = timerCount;
	 }


	 /**
	  * Gets the hasDebugValue value for this ECLWorkunit.
	  * 
	  * @return hasDebugValue
	  */
	 public java.lang.Boolean getHasDebugValue() {
		 return hasDebugValue;
	 }


	 /**
	  * Sets the hasDebugValue value for this ECLWorkunit.
	  * 
	  * @param hasDebugValue
	  */
	 public void setHasDebugValue(java.lang.Boolean hasDebugValue) {
		 this.hasDebugValue = hasDebugValue;
	 }


	 /**
	  * Gets the applicationValueCount value for this ECLWorkunit.
	  * 
	  * @return applicationValueCount
	  */
	 public java.lang.Integer getApplicationValueCount() {
		 return applicationValueCount;
	 }


	 /**
	  * Sets the applicationValueCount value for this ECLWorkunit.
	  * 
	  * @param applicationValueCount
	  */
	 public void setApplicationValueCount(java.lang.Integer applicationValueCount) {
		 this.applicationValueCount = applicationValueCount;
	 }


	 /**
	  * Gets the xmlParams value for this ECLWorkunit.
	  * 
	  * @return xmlParams
	  */
	 public java.lang.String getXmlParams() {
		 return xmlParams;
	 }


	 /**
	  * Sets the xmlParams value for this ECLWorkunit.
	  * 
	  * @param xmlParams
	  */
	 public void setXmlParams(java.lang.String xmlParams) {
		 this.xmlParams = xmlParams;
	 }


	 /**
	  * Gets the accessFlag value for this ECLWorkunit.
	  * 
	  * @return accessFlag
	  */
	 public java.lang.Integer getAccessFlag() {
		 return accessFlag;
	 }


	 /**
	  * Sets the accessFlag value for this ECLWorkunit.
	  * 
	  * @param accessFlag
	  */
	 public void setAccessFlag(java.lang.Integer accessFlag) {
		 this.accessFlag = accessFlag;
	 }


	 /**
	  * Gets the clusterFlag value for this ECLWorkunit.
	  * 
	  * @return clusterFlag
	  */
	 public java.lang.Integer getClusterFlag() {
		 return clusterFlag;
	 }


	 /**
	  * Sets the clusterFlag value for this ECLWorkunit.
	  * 
	  * @param clusterFlag
	  */
	 public void setClusterFlag(java.lang.Integer clusterFlag) {
		 this.clusterFlag = clusterFlag;
	 }


	 /**
	  * Gets the helpersDesc value for this ECLWorkunit.
	  * 
	  * @return helpersDesc
	  */
	 public java.lang.String getHelpersDesc() {
		 return helpersDesc;
	 }


	 /**
	  * Sets the helpersDesc value for this ECLWorkunit.
	  * 
	  * @param helpersDesc
	  */
	 public void setHelpersDesc(java.lang.String helpersDesc) {
		 this.helpersDesc = helpersDesc;
	 }


	 /**
	  * Gets the graphsDesc value for this ECLWorkunit.
	  * 
	  * @return graphsDesc
	  */
	 public java.lang.String getGraphsDesc() {
		 return graphsDesc;
	 }


	 /**
	  * Sets the graphsDesc value for this ECLWorkunit.
	  * 
	  * @param graphsDesc
	  */
	 public void setGraphsDesc(java.lang.String graphsDesc) {
		 this.graphsDesc = graphsDesc;
	 }


	 /**
	  * Gets the sourceFilesDesc value for this ECLWorkunit.
	  * 
	  * @return sourceFilesDesc
	  */
	 public java.lang.String getSourceFilesDesc() {
		 return sourceFilesDesc;
	 }


	 /**
	  * Sets the sourceFilesDesc value for this ECLWorkunit.
	  * 
	  * @param sourceFilesDesc
	  */
	 public void setSourceFilesDesc(java.lang.String sourceFilesDesc) {
		 this.sourceFilesDesc = sourceFilesDesc;
	 }


	 /**
	  * Gets the resultsDesc value for this ECLWorkunit.
	  * 
	  * @return resultsDesc
	  */
	 public java.lang.String getResultsDesc() {
		 return resultsDesc;
	 }


	 /**
	  * Sets the resultsDesc value for this ECLWorkunit.
	  * 
	  * @param resultsDesc
	  */
	 public void setResultsDesc(java.lang.String resultsDesc) {
		 this.resultsDesc = resultsDesc;
	 }


	 /**
	  * Gets the variablesDesc value for this ECLWorkunit.
	  * 
	  * @return variablesDesc
	  */
	 public java.lang.String getVariablesDesc() {
		 return variablesDesc;
	 }


	 /**
	  * Sets the variablesDesc value for this ECLWorkunit.
	  * 
	  * @param variablesDesc
	  */
	 public void setVariablesDesc(java.lang.String variablesDesc) {
		 this.variablesDesc = variablesDesc;
	 }


	 /**
	  * Gets the timersDesc value for this ECLWorkunit.
	  * 
	  * @return timersDesc
	  */
	 public java.lang.String getTimersDesc() {
		 return timersDesc;
	 }


	 /**
	  * Sets the timersDesc value for this ECLWorkunit.
	  * 
	  * @param timersDesc
	  */
	 public void setTimersDesc(java.lang.String timersDesc) {
		 this.timersDesc = timersDesc;
	 }


	 /**
	  * Gets the debugValuesDesc value for this ECLWorkunit.
	  * 
	  * @return debugValuesDesc
	  */
	 public java.lang.String getDebugValuesDesc() {
		 return debugValuesDesc;
	 }


	 /**
	  * Sets the debugValuesDesc value for this ECLWorkunit.
	  * 
	  * @param debugValuesDesc
	  */
	 public void setDebugValuesDesc(java.lang.String debugValuesDesc) {
		 this.debugValuesDesc = debugValuesDesc;
	 }


	 /**
	  * Gets the applicationValuesDesc value for this ECLWorkunit.
	  * 
	  * @return applicationValuesDesc
	  */
	 public java.lang.String getApplicationValuesDesc() {
		 return applicationValuesDesc;
	 }


	 /**
	  * Sets the applicationValuesDesc value for this ECLWorkunit.
	  * 
	  * @param applicationValuesDesc
	  */
	 public void setApplicationValuesDesc(java.lang.String applicationValuesDesc) {
		 this.applicationValuesDesc = applicationValuesDesc;
	 }


	 /**
	  * Gets the workflowsDesc value for this ECLWorkunit.
	  * 
	  * @return workflowsDesc
	  */
	 public java.lang.String getWorkflowsDesc() {
		 return workflowsDesc;
	 }


	 /**
	  * Sets the workflowsDesc value for this ECLWorkunit.
	  * 
	  * @param workflowsDesc
	  */
	 public void setWorkflowsDesc(java.lang.String workflowsDesc) {
		 this.workflowsDesc = workflowsDesc;
	 }


	 /**
	  * Gets the hasArchiveQuery value for this ECLWorkunit.
	  * 
	  * @return hasArchiveQuery
	  */
	 public java.lang.Boolean getHasArchiveQuery() {
		 return hasArchiveQuery;
	 }


	 /**
	  * Sets the hasArchiveQuery value for this ECLWorkunit.
	  * 
	  * @param hasArchiveQuery
	  */
	 public void setHasArchiveQuery(java.lang.Boolean hasArchiveQuery) {
		 this.hasArchiveQuery = hasArchiveQuery;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof ECLWorkunit)) {
			return false;
		}
		 ECLWorkunit other = (ECLWorkunit) obj;
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
						 ((this.owner==null && other.getOwner()==null) || 
								 (this.owner!=null &&
								 this.owner.equals(other.getOwner()))) &&
								 ((this.cluster==null && other.getCluster()==null) || 
										 (this.cluster!=null &&
										 this.cluster.equals(other.getCluster()))) &&
										 ((this.roxieCluster==null && other.getRoxieCluster()==null) || 
												 (this.roxieCluster!=null &&
												 this.roxieCluster.equals(other.getRoxieCluster()))) &&
												 ((this.jobname==null && other.getJobname()==null) || 
														 (this.jobname!=null &&
														 this.jobname.equals(other.getJobname()))) &&
														 ((this.queue==null && other.getQueue()==null) || 
																 (this.queue!=null &&
																 this.queue.equals(other.getQueue()))) &&
																 ((this.stateID==null && other.getStateID()==null) || 
																		 (this.stateID!=null &&
																		 this.stateID.equals(other.getStateID()))) &&
																		 ((this.state==null && other.getState()==null) || 
																				 (this.state!=null &&
																				 this.state.equals(other.getState()))) &&
																				 ((this.stateEx==null && other.getStateEx()==null) || 
																						 (this.stateEx!=null &&
																						 this.stateEx.equals(other.getStateEx()))) &&
																						 ((this.description==null && other.getDescription()==null) || 
																								 (this.description!=null &&
																								 this.description.equals(other.getDescription()))) &&
																								 ((this._protected==null && other.get_protected()==null) || 
																										 (this._protected!=null &&
																										 this._protected.equals(other.get_protected()))) &&
																										 ((this.active==null && other.getActive()==null) || 
																												 (this.active!=null &&
																												 this.active.equals(other.getActive()))) &&
																												 ((this.action==null && other.getAction()==null) || 
																														 (this.action!=null &&
																														 this.action.equals(other.getAction()))) &&
																														 ((this.actionEx==null && other.getActionEx()==null) || 
																																 (this.actionEx!=null &&
																																 this.actionEx.equals(other.getActionEx()))) &&
																																 ((this.dateTimeScheduled==null && other.getDateTimeScheduled()==null) || 
																																		 (this.dateTimeScheduled!=null &&
																																		 this.dateTimeScheduled.equals(other.getDateTimeScheduled()))) &&
																																		 ((this.priorityClass==null && other.getPriorityClass()==null) || 
																																				 (this.priorityClass!=null &&
																																				 this.priorityClass.equals(other.getPriorityClass()))) &&
																																				 ((this.priorityLevel==null && other.getPriorityLevel()==null) || 
																																						 (this.priorityLevel!=null &&
																																						 this.priorityLevel.equals(other.getPriorityLevel()))) &&
																																						 ((this.scope==null && other.getScope()==null) || 
																																								 (this.scope!=null &&
																																								 this.scope.equals(other.getScope()))) &&
																																								 ((this.snapshot==null && other.getSnapshot()==null) || 
																																										 (this.snapshot!=null &&
																																										 this.snapshot.equals(other.getSnapshot()))) &&
																																										 ((this.resultLimit==null && other.getResultLimit()==null) || 
																																												 (this.resultLimit!=null &&
																																												 this.resultLimit.equals(other.getResultLimit()))) &&
																																												 ((this.archived==null && other.getArchived()==null) || 
																																														 (this.archived!=null &&
																																														 this.archived.equals(other.getArchived()))) &&
																																														 ((this.isPausing==null && other.getIsPausing()==null) || 
																																																 (this.isPausing!=null &&
																																																 this.isPausing.equals(other.getIsPausing()))) &&
																																																 ((this.thorLCR==null && other.getThorLCR()==null) || 
																																																		 (this.thorLCR!=null &&
																																																		 this.thorLCR.equals(other.getThorLCR()))) &&
																																																		 ((this.eventSchedule==null && other.getEventSchedule()==null) || 
																																																				 (this.eventSchedule!=null &&
																																																				 this.eventSchedule.equals(other.getEventSchedule()))) &&
																																																				 ((this.haveSubGraphTimings==null && other.getHaveSubGraphTimings()==null) || 
																																																						 (this.haveSubGraphTimings!=null &&
																																																						 this.haveSubGraphTimings.equals(other.getHaveSubGraphTimings()))) &&
																																																						 ((this.totalThorTime==null && other.getTotalThorTime()==null) || 
																																																								 (this.totalThorTime!=null &&
																																																								 this.totalThorTime.equals(other.getTotalThorTime()))) &&
																																																								 ((this.query==null && other.getQuery()==null) || 
																																																										 (this.query!=null &&
																																																										 this.query.equals(other.getQuery()))) &&
																																																										 ((this.helpers==null && other.getHelpers()==null) || 
																																																												 (this.helpers!=null &&
																																																												 java.util.Arrays.equals(this.helpers, other.getHelpers()))) &&
																																																												 ((this.exceptions==null && other.getExceptions()==null) || 
																																																														 (this.exceptions!=null &&
																																																														 java.util.Arrays.equals(this.exceptions, other.getExceptions()))) &&
																																																														 ((this.graphs==null && other.getGraphs()==null) || 
																																																																 (this.graphs!=null &&
																																																																 java.util.Arrays.equals(this.graphs, other.getGraphs()))) &&
																																																																 ((this.sourceFiles==null && other.getSourceFiles()==null) || 
																																																																		 (this.sourceFiles!=null &&
																																																																		 java.util.Arrays.equals(this.sourceFiles, other.getSourceFiles()))) &&
																																																																		 ((this.results==null && other.getResults()==null) || 
																																																																				 (this.results!=null &&
																																																																				 java.util.Arrays.equals(this.results, other.getResults()))) &&
																																																																				 ((this.variables==null && other.getVariables()==null) || 
																																																																						 (this.variables!=null &&
																																																																						 java.util.Arrays.equals(this.variables, other.getVariables()))) &&
																																																																						 ((this.timers==null && other.getTimers()==null) || 
																																																																								 (this.timers!=null &&
																																																																								 java.util.Arrays.equals(this.timers, other.getTimers()))) &&
																																																																								 ((this.debugValues==null && other.getDebugValues()==null) || 
																																																																										 (this.debugValues!=null &&
																																																																										 java.util.Arrays.equals(this.debugValues, other.getDebugValues()))) &&
																																																																										 ((this.applicationValues==null && other.getApplicationValues()==null) || 
																																																																												 (this.applicationValues!=null &&
																																																																												 java.util.Arrays.equals(this.applicationValues, other.getApplicationValues()))) &&
																																																																												 ((this.workflows==null && other.getWorkflows()==null) || 
																																																																														 (this.workflows!=null &&
																																																																														 java.util.Arrays.equals(this.workflows, other.getWorkflows()))) &&
																																																																														 ((this.timingData==null && other.getTimingData()==null) || 
																																																																																 (this.timingData!=null &&
																																																																																 java.util.Arrays.equals(this.timingData, other.getTimingData()))) &&
																																																																																 ((this.allowedClusters==null && other.getAllowedClusters()==null) || 
																																																																																		 (this.allowedClusters!=null &&
																																																																																		 java.util.Arrays.equals(this.allowedClusters, other.getAllowedClusters()))) &&
																																																																																		 ((this.errorCount==null && other.getErrorCount()==null) || 
																																																																																				 (this.errorCount!=null &&
																																																																																				 this.errorCount.equals(other.getErrorCount()))) &&
																																																																																				 ((this.warningCount==null && other.getWarningCount()==null) || 
																																																																																						 (this.warningCount!=null &&
																																																																																						 this.warningCount.equals(other.getWarningCount()))) &&
																																																																																						 ((this.infoCount==null && other.getInfoCount()==null) || 
																																																																																								 (this.infoCount!=null &&
																																																																																								 this.infoCount.equals(other.getInfoCount()))) &&
																																																																																								 ((this.graphCount==null && other.getGraphCount()==null) || 
																																																																																										 (this.graphCount!=null &&
																																																																																										 this.graphCount.equals(other.getGraphCount()))) &&
																																																																																										 ((this.sourceFileCount==null && other.getSourceFileCount()==null) || 
																																																																																												 (this.sourceFileCount!=null &&
																																																																																												 this.sourceFileCount.equals(other.getSourceFileCount()))) &&
																																																																																												 ((this.resultCount==null && other.getResultCount()==null) || 
																																																																																														 (this.resultCount!=null &&
																																																																																														 this.resultCount.equals(other.getResultCount()))) &&
																																																																																														 ((this.variableCount==null && other.getVariableCount()==null) || 
																																																																																																 (this.variableCount!=null &&
																																																																																																 this.variableCount.equals(other.getVariableCount()))) &&
																																																																																																 ((this.timerCount==null && other.getTimerCount()==null) || 
																																																																																																		 (this.timerCount!=null &&
																																																																																																		 this.timerCount.equals(other.getTimerCount()))) &&
																																																																																																		 ((this.hasDebugValue==null && other.getHasDebugValue()==null) || 
																																																																																																				 (this.hasDebugValue!=null &&
																																																																																																				 this.hasDebugValue.equals(other.getHasDebugValue()))) &&
																																																																																																				 ((this.applicationValueCount==null && other.getApplicationValueCount()==null) || 
																																																																																																						 (this.applicationValueCount!=null &&
																																																																																																						 this.applicationValueCount.equals(other.getApplicationValueCount()))) &&
																																																																																																						 ((this.xmlParams==null && other.getXmlParams()==null) || 
																																																																																																								 (this.xmlParams!=null &&
																																																																																																								 this.xmlParams.equals(other.getXmlParams()))) &&
																																																																																																								 ((this.accessFlag==null && other.getAccessFlag()==null) || 
																																																																																																										 (this.accessFlag!=null &&
																																																																																																										 this.accessFlag.equals(other.getAccessFlag()))) &&
																																																																																																										 ((this.clusterFlag==null && other.getClusterFlag()==null) || 
																																																																																																												 (this.clusterFlag!=null &&
																																																																																																												 this.clusterFlag.equals(other.getClusterFlag()))) &&
																																																																																																												 ((this.helpersDesc==null && other.getHelpersDesc()==null) || 
																																																																																																														 (this.helpersDesc!=null &&
																																																																																																														 this.helpersDesc.equals(other.getHelpersDesc()))) &&
																																																																																																														 ((this.graphsDesc==null && other.getGraphsDesc()==null) || 
																																																																																																																 (this.graphsDesc!=null &&
																																																																																																																 this.graphsDesc.equals(other.getGraphsDesc()))) &&
																																																																																																																 ((this.sourceFilesDesc==null && other.getSourceFilesDesc()==null) || 
																																																																																																																		 (this.sourceFilesDesc!=null &&
																																																																																																																		 this.sourceFilesDesc.equals(other.getSourceFilesDesc()))) &&
																																																																																																																		 ((this.resultsDesc==null && other.getResultsDesc()==null) || 
																																																																																																																				 (this.resultsDesc!=null &&
																																																																																																																				 this.resultsDesc.equals(other.getResultsDesc()))) &&
																																																																																																																				 ((this.variablesDesc==null && other.getVariablesDesc()==null) || 
																																																																																																																						 (this.variablesDesc!=null &&
																																																																																																																						 this.variablesDesc.equals(other.getVariablesDesc()))) &&
																																																																																																																						 ((this.timersDesc==null && other.getTimersDesc()==null) || 
																																																																																																																								 (this.timersDesc!=null &&
																																																																																																																								 this.timersDesc.equals(other.getTimersDesc()))) &&
																																																																																																																								 ((this.debugValuesDesc==null && other.getDebugValuesDesc()==null) || 
																																																																																																																										 (this.debugValuesDesc!=null &&
																																																																																																																										 this.debugValuesDesc.equals(other.getDebugValuesDesc()))) &&
																																																																																																																										 ((this.applicationValuesDesc==null && other.getApplicationValuesDesc()==null) || 
																																																																																																																												 (this.applicationValuesDesc!=null &&
																																																																																																																												 this.applicationValuesDesc.equals(other.getApplicationValuesDesc()))) &&
																																																																																																																												 ((this.workflowsDesc==null && other.getWorkflowsDesc()==null) || 
																																																																																																																														 (this.workflowsDesc!=null &&
																																																																																																																														 this.workflowsDesc.equals(other.getWorkflowsDesc()))) &&
																																																																																																																														 ((this.hasArchiveQuery==null && other.getHasArchiveQuery()==null) || 
																																																																																																																																 (this.hasArchiveQuery!=null &&
																																																																																																																																 this.hasArchiveQuery.equals(other.getHasArchiveQuery())));
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
		 if (getOwner() != null) {
			 _hashCode += getOwner().hashCode();
		 }
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getRoxieCluster() != null) {
			 _hashCode += getRoxieCluster().hashCode();
		 }
		 if (getJobname() != null) {
			 _hashCode += getJobname().hashCode();
		 }
		 if (getQueue() != null) {
			 _hashCode += getQueue().hashCode();
		 }
		 if (getStateID() != null) {
			 _hashCode += getStateID().hashCode();
		 }
		 if (getState() != null) {
			 _hashCode += getState().hashCode();
		 }
		 if (getStateEx() != null) {
			 _hashCode += getStateEx().hashCode();
		 }
		 if (getDescription() != null) {
			 _hashCode += getDescription().hashCode();
		 }
		 if (get_protected() != null) {
			 _hashCode += get_protected().hashCode();
		 }
		 if (getActive() != null) {
			 _hashCode += getActive().hashCode();
		 }
		 if (getAction() != null) {
			 _hashCode += getAction().hashCode();
		 }
		 if (getActionEx() != null) {
			 _hashCode += getActionEx().hashCode();
		 }
		 if (getDateTimeScheduled() != null) {
			 _hashCode += getDateTimeScheduled().hashCode();
		 }
		 if (getPriorityClass() != null) {
			 _hashCode += getPriorityClass().hashCode();
		 }
		 if (getPriorityLevel() != null) {
			 _hashCode += getPriorityLevel().hashCode();
		 }
		 if (getScope() != null) {
			 _hashCode += getScope().hashCode();
		 }
		 if (getSnapshot() != null) {
			 _hashCode += getSnapshot().hashCode();
		 }
		 if (getResultLimit() != null) {
			 _hashCode += getResultLimit().hashCode();
		 }
		 if (getArchived() != null) {
			 _hashCode += getArchived().hashCode();
		 }
		 if (getIsPausing() != null) {
			 _hashCode += getIsPausing().hashCode();
		 }
		 if (getThorLCR() != null) {
			 _hashCode += getThorLCR().hashCode();
		 }
		 if (getEventSchedule() != null) {
			 _hashCode += getEventSchedule().hashCode();
		 }
		 if (getHaveSubGraphTimings() != null) {
			 _hashCode += getHaveSubGraphTimings().hashCode();
		 }
		 if (getTotalThorTime() != null) {
			 _hashCode += getTotalThorTime().hashCode();
		 }
		 if (getQuery() != null) {
			 _hashCode += getQuery().hashCode();
		 }
		 if (getHelpers() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getHelpers());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getHelpers(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getExceptions() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getExceptions());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getExceptions(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
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
		 if (getSourceFiles() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getSourceFiles());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getSourceFiles(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
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
		 if (getVariables() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getVariables());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getVariables(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getTimers() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getTimers());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getTimers(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDebugValues() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDebugValues());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDebugValues(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getApplicationValues() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getApplicationValues());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getApplicationValues(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getWorkflows() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getWorkflows());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getWorkflows(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getTimingData() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getTimingData());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getTimingData(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getAllowedClusters() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getAllowedClusters());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getAllowedClusters(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getErrorCount() != null) {
			 _hashCode += getErrorCount().hashCode();
		 }
		 if (getWarningCount() != null) {
			 _hashCode += getWarningCount().hashCode();
		 }
		 if (getInfoCount() != null) {
			 _hashCode += getInfoCount().hashCode();
		 }
		 if (getGraphCount() != null) {
			 _hashCode += getGraphCount().hashCode();
		 }
		 if (getSourceFileCount() != null) {
			 _hashCode += getSourceFileCount().hashCode();
		 }
		 if (getResultCount() != null) {
			 _hashCode += getResultCount().hashCode();
		 }
		 if (getVariableCount() != null) {
			 _hashCode += getVariableCount().hashCode();
		 }
		 if (getTimerCount() != null) {
			 _hashCode += getTimerCount().hashCode();
		 }
		 if (getHasDebugValue() != null) {
			 _hashCode += getHasDebugValue().hashCode();
		 }
		 if (getApplicationValueCount() != null) {
			 _hashCode += getApplicationValueCount().hashCode();
		 }
		 if (getXmlParams() != null) {
			 _hashCode += getXmlParams().hashCode();
		 }
		 if (getAccessFlag() != null) {
			 _hashCode += getAccessFlag().hashCode();
		 }
		 if (getClusterFlag() != null) {
			 _hashCode += getClusterFlag().hashCode();
		 }
		 if (getHelpersDesc() != null) {
			 _hashCode += getHelpersDesc().hashCode();
		 }
		 if (getGraphsDesc() != null) {
			 _hashCode += getGraphsDesc().hashCode();
		 }
		 if (getSourceFilesDesc() != null) {
			 _hashCode += getSourceFilesDesc().hashCode();
		 }
		 if (getResultsDesc() != null) {
			 _hashCode += getResultsDesc().hashCode();
		 }
		 if (getVariablesDesc() != null) {
			 _hashCode += getVariablesDesc().hashCode();
		 }
		 if (getTimersDesc() != null) {
			 _hashCode += getTimersDesc().hashCode();
		 }
		 if (getDebugValuesDesc() != null) {
			 _hashCode += getDebugValuesDesc().hashCode();
		 }
		 if (getApplicationValuesDesc() != null) {
			 _hashCode += getApplicationValuesDesc().hashCode();
		 }
		 if (getWorkflowsDesc() != null) {
			 _hashCode += getWorkflowsDesc().hashCode();
		 }
		 if (getHasArchiveQuery() != null) {
			 _hashCode += getHasArchiveQuery().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(ECLWorkunit.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunit"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wuid");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
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
		 elemField.setFieldName("jobname");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Jobname"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("queue");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Queue"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("stateID");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StateID"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
		 elemField.setFieldName("stateEx");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StateEx"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("description");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Description"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("_protected");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Protected"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("active");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Active"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("action");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Action"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("actionEx");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ActionEx"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("dateTimeScheduled");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DateTimeScheduled"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("priorityClass");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityClass"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("priorityLevel");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityLevel"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("scope");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Scope"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("snapshot");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Snapshot"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("resultLimit");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultLimit"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("archived");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Archived"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isPausing");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsPausing"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("thorLCR");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorLCR"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("eventSchedule");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EventSchedule"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("haveSubGraphTimings");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "HaveSubGraphTimings"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("totalThorTime");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TotalThorTime"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("query");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Query"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLQuery"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("helpers");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Helpers"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLHelpFile"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLHelpFile"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("exceptions");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLException"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLException"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("graphs");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Graphs"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraph"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraph"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceFiles");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SourceFiles"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFile"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFile"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("results");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Results"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("variables");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Variables"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("timers");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Timers"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimer"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimer"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("debugValues");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValues"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("applicationValues");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValues"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("workflows");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Workflows"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkflow"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkflow"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("timingData");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimingData"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimingData"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimingData"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("allowedClusters");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllowedClusters"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllowedCluster"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("errorCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ErrorCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("warningCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WarningCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("infoCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "InfoCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("graphCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceFileCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SourceFileCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("resultCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("variableCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "VariableCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("timerCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimerCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("hasDebugValue");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "HasDebugValue"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("applicationValueCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValueCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("xmlParams");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "XmlParams"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("accessFlag");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AccessFlag"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("clusterFlag");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterFlag"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("helpersDesc");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "HelpersDesc"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("graphsDesc");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphsDesc"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceFilesDesc");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SourceFilesDesc"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("resultsDesc");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultsDesc"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("variablesDesc");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "VariablesDesc"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("timersDesc");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimersDesc"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("debugValuesDesc");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValuesDesc"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("applicationValuesDesc");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValuesDesc"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("workflowsDesc");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WorkflowsDesc"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("hasArchiveQuery");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "HasArchiveQuery"));
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
