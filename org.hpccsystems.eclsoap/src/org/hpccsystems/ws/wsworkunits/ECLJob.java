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
 * ECLJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class ECLJob  implements java.io.Serializable {
	private java.lang.String wuid;

	private java.lang.String graph;

	private java.lang.String state;

	private java.lang.String startedDate;

	private java.lang.String finishedDate;

	private java.lang.String cluster;

	private java.lang.String graphNum;

	private java.lang.String subGraphNum;

	private java.lang.String numOfRuns;

	private java.lang.Integer duration;

	public ECLJob() {
	}

	public ECLJob(
			java.lang.String wuid,
			java.lang.String graph,
			java.lang.String state,
			java.lang.String startedDate,
			java.lang.String finishedDate,
			java.lang.String cluster,
			java.lang.String graphNum,
			java.lang.String subGraphNum,
			java.lang.String numOfRuns,
			java.lang.Integer duration) {
		this.wuid = wuid;
		this.graph = graph;
		this.state = state;
		this.startedDate = startedDate;
		this.finishedDate = finishedDate;
		this.cluster = cluster;
		this.graphNum = graphNum;
		this.subGraphNum = subGraphNum;
		this.numOfRuns = numOfRuns;
		this.duration = duration;
	}


	/**
	 * Gets the wuid value for this ECLJob.
	 * 
	 * @return wuid
	 */
	 public java.lang.String getWuid() {
		 return wuid;
	 }


	/**
	 * Sets the wuid value for this ECLJob.
	 * 
	 * @param wuid
	 */
	 public void setWuid(java.lang.String wuid) {
		 this.wuid = wuid;
	 }


	 /**
	  * Gets the graph value for this ECLJob.
	  * 
	  * @return graph
	  */
	 public java.lang.String getGraph() {
		 return graph;
	 }


	 /**
	  * Sets the graph value for this ECLJob.
	  * 
	  * @param graph
	  */
	 public void setGraph(java.lang.String graph) {
		 this.graph = graph;
	 }


	 /**
	  * Gets the state value for this ECLJob.
	  * 
	  * @return state
	  */
	 public java.lang.String getState() {
		 return state;
	 }


	 /**
	  * Sets the state value for this ECLJob.
	  * 
	  * @param state
	  */
	 public void setState(java.lang.String state) {
		 this.state = state;
	 }


	 /**
	  * Gets the startedDate value for this ECLJob.
	  * 
	  * @return startedDate
	  */
	 public java.lang.String getStartedDate() {
		 return startedDate;
	 }


	 /**
	  * Sets the startedDate value for this ECLJob.
	  * 
	  * @param startedDate
	  */
	 public void setStartedDate(java.lang.String startedDate) {
		 this.startedDate = startedDate;
	 }


	 /**
	  * Gets the finishedDate value for this ECLJob.
	  * 
	  * @return finishedDate
	  */
	 public java.lang.String getFinishedDate() {
		 return finishedDate;
	 }


	 /**
	  * Sets the finishedDate value for this ECLJob.
	  * 
	  * @param finishedDate
	  */
	 public void setFinishedDate(java.lang.String finishedDate) {
		 this.finishedDate = finishedDate;
	 }


	 /**
	  * Gets the cluster value for this ECLJob.
	  * 
	  * @return cluster
	  */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this ECLJob.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the graphNum value for this ECLJob.
	  * 
	  * @return graphNum
	  */
	 public java.lang.String getGraphNum() {
		 return graphNum;
	 }


	 /**
	  * Sets the graphNum value for this ECLJob.
	  * 
	  * @param graphNum
	  */
	 public void setGraphNum(java.lang.String graphNum) {
		 this.graphNum = graphNum;
	 }


	 /**
	  * Gets the subGraphNum value for this ECLJob.
	  * 
	  * @return subGraphNum
	  */
	 public java.lang.String getSubGraphNum() {
		 return subGraphNum;
	 }


	 /**
	  * Sets the subGraphNum value for this ECLJob.
	  * 
	  * @param subGraphNum
	  */
	 public void setSubGraphNum(java.lang.String subGraphNum) {
		 this.subGraphNum = subGraphNum;
	 }


	 /**
	  * Gets the numOfRuns value for this ECLJob.
	  * 
	  * @return numOfRuns
	  */
	 public java.lang.String getNumOfRuns() {
		 return numOfRuns;
	 }


	 /**
	  * Sets the numOfRuns value for this ECLJob.
	  * 
	  * @param numOfRuns
	  */
	 public void setNumOfRuns(java.lang.String numOfRuns) {
		 this.numOfRuns = numOfRuns;
	 }


	 /**
	  * Gets the duration value for this ECLJob.
	  * 
	  * @return duration
	  */
	 public java.lang.Integer getDuration() {
		 return duration;
	 }


	 /**
	  * Sets the duration value for this ECLJob.
	  * 
	  * @param duration
	  */
	 public void setDuration(java.lang.Integer duration) {
		 this.duration = duration;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof ECLJob)) {
			return false;
		}
		 ECLJob other = (ECLJob) obj;
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
						 ((this.graph==null && other.getGraph()==null) || 
								 (this.graph!=null &&
								 this.graph.equals(other.getGraph()))) &&
								 ((this.state==null && other.getState()==null) || 
										 (this.state!=null &&
										 this.state.equals(other.getState()))) &&
										 ((this.startedDate==null && other.getStartedDate()==null) || 
												 (this.startedDate!=null &&
												 this.startedDate.equals(other.getStartedDate()))) &&
												 ((this.finishedDate==null && other.getFinishedDate()==null) || 
														 (this.finishedDate!=null &&
														 this.finishedDate.equals(other.getFinishedDate()))) &&
														 ((this.cluster==null && other.getCluster()==null) || 
																 (this.cluster!=null &&
																 this.cluster.equals(other.getCluster()))) &&
																 ((this.graphNum==null && other.getGraphNum()==null) || 
																		 (this.graphNum!=null &&
																		 this.graphNum.equals(other.getGraphNum()))) &&
																		 ((this.subGraphNum==null && other.getSubGraphNum()==null) || 
																				 (this.subGraphNum!=null &&
																				 this.subGraphNum.equals(other.getSubGraphNum()))) &&
																				 ((this.numOfRuns==null && other.getNumOfRuns()==null) || 
																						 (this.numOfRuns!=null &&
																						 this.numOfRuns.equals(other.getNumOfRuns()))) &&
																						 ((this.duration==null && other.getDuration()==null) || 
																								 (this.duration!=null &&
																								 this.duration.equals(other.getDuration())));
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
		 if (getGraph() != null) {
			 _hashCode += getGraph().hashCode();
		 }
		 if (getState() != null) {
			 _hashCode += getState().hashCode();
		 }
		 if (getStartedDate() != null) {
			 _hashCode += getStartedDate().hashCode();
		 }
		 if (getFinishedDate() != null) {
			 _hashCode += getFinishedDate().hashCode();
		 }
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getGraphNum() != null) {
			 _hashCode += getGraphNum().hashCode();
		 }
		 if (getSubGraphNum() != null) {
			 _hashCode += getSubGraphNum().hashCode();
		 }
		 if (getNumOfRuns() != null) {
			 _hashCode += getNumOfRuns().hashCode();
		 }
		 if (getDuration() != null) {
			 _hashCode += getDuration().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(ECLJob.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLJob"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wuid");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("graph");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Graph"));
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
		 elemField.setFieldName("startedDate");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StartedDate"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("finishedDate");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FinishedDate"));
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
		 elemField.setFieldName("graphNum");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphNum"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("subGraphNum");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SubGraphNum"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("numOfRuns");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NumOfRuns"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("duration");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Duration"));
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
