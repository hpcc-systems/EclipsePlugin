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
 * ProgressResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class ProgressResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.filespray.ArrayOfEspException exceptions;

	private java.lang.String wuid;

	private java.lang.Integer percentDone;

	private java.lang.Integer secsLeft;

	private java.lang.Integer kbPerSecAve;

	private java.lang.Integer kbPerSec;

	private java.lang.Integer slavesDone;

	private java.lang.String timeTaken;

	private java.lang.String progressMessage;

	private java.lang.String summaryMessage;

	private java.lang.String state;

	public ProgressResponse() {
	}

	public ProgressResponse(
			org.hpccsystems.ws.filespray.ArrayOfEspException exceptions,
			java.lang.String wuid,
			java.lang.Integer percentDone,
			java.lang.Integer secsLeft,
			java.lang.Integer kbPerSecAve,
			java.lang.Integer kbPerSec,
			java.lang.Integer slavesDone,
			java.lang.String timeTaken,
			java.lang.String progressMessage,
			java.lang.String summaryMessage,
			java.lang.String state) {
		this.exceptions = exceptions;
		this.wuid = wuid;
		this.percentDone = percentDone;
		this.secsLeft = secsLeft;
		this.kbPerSecAve = kbPerSecAve;
		this.kbPerSec = kbPerSec;
		this.slavesDone = slavesDone;
		this.timeTaken = timeTaken;
		this.progressMessage = progressMessage;
		this.summaryMessage = summaryMessage;
		this.state = state;
	}


	/**
	 * Gets the exceptions value for this ProgressResponse.
	 * 
	 * @return exceptions
	 */
	 public org.hpccsystems.ws.filespray.ArrayOfEspException getExceptions() {
		 return exceptions;
	 }


	/**
	 * Sets the exceptions value for this ProgressResponse.
	 * 
	 * @param exceptions
	 */
	 public void setExceptions(org.hpccsystems.ws.filespray.ArrayOfEspException exceptions) {
		 this.exceptions = exceptions;
	 }


	 /**
	  * Gets the wuid value for this ProgressResponse.
	  * 
	  * @return wuid
	  */
	 public java.lang.String getWuid() {
		 return wuid;
	 }


	 /**
	  * Sets the wuid value for this ProgressResponse.
	  * 
	  * @param wuid
	  */
	 public void setWuid(java.lang.String wuid) {
		 this.wuid = wuid;
	 }


	 /**
	  * Gets the percentDone value for this ProgressResponse.
	  * 
	  * @return percentDone
	  */
	 public java.lang.Integer getPercentDone() {
		 return percentDone;
	 }


	 /**
	  * Sets the percentDone value for this ProgressResponse.
	  * 
	  * @param percentDone
	  */
	 public void setPercentDone(java.lang.Integer percentDone) {
		 this.percentDone = percentDone;
	 }


	 /**
	  * Gets the secsLeft value for this ProgressResponse.
	  * 
	  * @return secsLeft
	  */
	 public java.lang.Integer getSecsLeft() {
		 return secsLeft;
	 }


	 /**
	  * Sets the secsLeft value for this ProgressResponse.
	  * 
	  * @param secsLeft
	  */
	 public void setSecsLeft(java.lang.Integer secsLeft) {
		 this.secsLeft = secsLeft;
	 }


	 /**
	  * Gets the kbPerSecAve value for this ProgressResponse.
	  * 
	  * @return kbPerSecAve
	  */
	 public java.lang.Integer getKbPerSecAve() {
		 return kbPerSecAve;
	 }


	 /**
	  * Sets the kbPerSecAve value for this ProgressResponse.
	  * 
	  * @param kbPerSecAve
	  */
	 public void setKbPerSecAve(java.lang.Integer kbPerSecAve) {
		 this.kbPerSecAve = kbPerSecAve;
	 }


	 /**
	  * Gets the kbPerSec value for this ProgressResponse.
	  * 
	  * @return kbPerSec
	  */
	 public java.lang.Integer getKbPerSec() {
		 return kbPerSec;
	 }


	 /**
	  * Sets the kbPerSec value for this ProgressResponse.
	  * 
	  * @param kbPerSec
	  */
	 public void setKbPerSec(java.lang.Integer kbPerSec) {
		 this.kbPerSec = kbPerSec;
	 }


	 /**
	  * Gets the slavesDone value for this ProgressResponse.
	  * 
	  * @return slavesDone
	  */
	 public java.lang.Integer getSlavesDone() {
		 return slavesDone;
	 }


	 /**
	  * Sets the slavesDone value for this ProgressResponse.
	  * 
	  * @param slavesDone
	  */
	 public void setSlavesDone(java.lang.Integer slavesDone) {
		 this.slavesDone = slavesDone;
	 }


	 /**
	  * Gets the timeTaken value for this ProgressResponse.
	  * 
	  * @return timeTaken
	  */
	 public java.lang.String getTimeTaken() {
		 return timeTaken;
	 }


	 /**
	  * Sets the timeTaken value for this ProgressResponse.
	  * 
	  * @param timeTaken
	  */
	 public void setTimeTaken(java.lang.String timeTaken) {
		 this.timeTaken = timeTaken;
	 }


	 /**
	  * Gets the progressMessage value for this ProgressResponse.
	  * 
	  * @return progressMessage
	  */
	 public java.lang.String getProgressMessage() {
		 return progressMessage;
	 }


	 /**
	  * Sets the progressMessage value for this ProgressResponse.
	  * 
	  * @param progressMessage
	  */
	 public void setProgressMessage(java.lang.String progressMessage) {
		 this.progressMessage = progressMessage;
	 }


	 /**
	  * Gets the summaryMessage value for this ProgressResponse.
	  * 
	  * @return summaryMessage
	  */
	 public java.lang.String getSummaryMessage() {
		 return summaryMessage;
	 }


	 /**
	  * Sets the summaryMessage value for this ProgressResponse.
	  * 
	  * @param summaryMessage
	  */
	 public void setSummaryMessage(java.lang.String summaryMessage) {
		 this.summaryMessage = summaryMessage;
	 }


	 /**
	  * Gets the state value for this ProgressResponse.
	  * 
	  * @return state
	  */
	 public java.lang.String getState() {
		 return state;
	 }


	 /**
	  * Sets the state value for this ProgressResponse.
	  * 
	  * @param state
	  */
	 public void setState(java.lang.String state) {
		 this.state = state;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof ProgressResponse)) {
			return false;
		}
		 ProgressResponse other = (ProgressResponse) obj;
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
						 ((this.wuid==null && other.getWuid()==null) || 
								 (this.wuid!=null &&
								 this.wuid.equals(other.getWuid()))) &&
								 ((this.percentDone==null && other.getPercentDone()==null) || 
										 (this.percentDone!=null &&
										 this.percentDone.equals(other.getPercentDone()))) &&
										 ((this.secsLeft==null && other.getSecsLeft()==null) || 
												 (this.secsLeft!=null &&
												 this.secsLeft.equals(other.getSecsLeft()))) &&
												 ((this.kbPerSecAve==null && other.getKbPerSecAve()==null) || 
														 (this.kbPerSecAve!=null &&
														 this.kbPerSecAve.equals(other.getKbPerSecAve()))) &&
														 ((this.kbPerSec==null && other.getKbPerSec()==null) || 
																 (this.kbPerSec!=null &&
																 this.kbPerSec.equals(other.getKbPerSec()))) &&
																 ((this.slavesDone==null && other.getSlavesDone()==null) || 
																		 (this.slavesDone!=null &&
																		 this.slavesDone.equals(other.getSlavesDone()))) &&
																		 ((this.timeTaken==null && other.getTimeTaken()==null) || 
																				 (this.timeTaken!=null &&
																				 this.timeTaken.equals(other.getTimeTaken()))) &&
																				 ((this.progressMessage==null && other.getProgressMessage()==null) || 
																						 (this.progressMessage!=null &&
																						 this.progressMessage.equals(other.getProgressMessage()))) &&
																						 ((this.summaryMessage==null && other.getSummaryMessage()==null) || 
																								 (this.summaryMessage!=null &&
																								 this.summaryMessage.equals(other.getSummaryMessage()))) &&
																								 ((this.state==null && other.getState()==null) || 
																										 (this.state!=null &&
																										 this.state.equals(other.getState())));
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
		 if (getWuid() != null) {
			 _hashCode += getWuid().hashCode();
		 }
		 if (getPercentDone() != null) {
			 _hashCode += getPercentDone().hashCode();
		 }
		 if (getSecsLeft() != null) {
			 _hashCode += getSecsLeft().hashCode();
		 }
		 if (getKbPerSecAve() != null) {
			 _hashCode += getKbPerSecAve().hashCode();
		 }
		 if (getKbPerSec() != null) {
			 _hashCode += getKbPerSec().hashCode();
		 }
		 if (getSlavesDone() != null) {
			 _hashCode += getSlavesDone().hashCode();
		 }
		 if (getTimeTaken() != null) {
			 _hashCode += getTimeTaken().hashCode();
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
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(ProgressResponse.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">ProgressResponse"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("exceptions");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wuid");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "wuid"));
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
		 elemField.setFieldName("kbPerSecAve");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "KbPerSecAve"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("kbPerSec");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "KbPerSec"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("slavesDone");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SlavesDone"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("timeTaken");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "TimeTaken"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
