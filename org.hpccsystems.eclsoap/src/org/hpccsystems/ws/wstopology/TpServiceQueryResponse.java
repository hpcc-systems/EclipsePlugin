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
 * TpServiceQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpServiceQueryResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions;

	private java.lang.Integer memThreshold;

	private java.lang.Integer diskThreshold;

	private java.lang.Integer cpuThreshold;

	private java.lang.Boolean encapsulatedSystem;

	private java.lang.Boolean enableSNMP;

	private java.lang.String preflightProcessFilter;

	private java.lang.String memThresholdType;

	private java.lang.String diskThresholdType;

	private org.hpccsystems.ws.wstopology.TpServices serviceList;

	public TpServiceQueryResponse() {
	}

	public TpServiceQueryResponse(
			org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions,
			java.lang.Integer memThreshold,
			java.lang.Integer diskThreshold,
			java.lang.Integer cpuThreshold,
			java.lang.Boolean encapsulatedSystem,
			java.lang.Boolean enableSNMP,
			java.lang.String preflightProcessFilter,
			java.lang.String memThresholdType,
			java.lang.String diskThresholdType,
			org.hpccsystems.ws.wstopology.TpServices serviceList) {
		this.exceptions = exceptions;
		this.memThreshold = memThreshold;
		this.diskThreshold = diskThreshold;
		this.cpuThreshold = cpuThreshold;
		this.encapsulatedSystem = encapsulatedSystem;
		this.enableSNMP = enableSNMP;
		this.preflightProcessFilter = preflightProcessFilter;
		this.memThresholdType = memThresholdType;
		this.diskThresholdType = diskThresholdType;
		this.serviceList = serviceList;
	}


	/**
	 * Gets the exceptions value for this TpServiceQueryResponse.
	 * 
	 * @return exceptions
	 */
	 public org.hpccsystems.ws.wstopology.ArrayOfEspException getExceptions() {
		 return exceptions;
	 }


	 /**
	  * Sets the exceptions value for this TpServiceQueryResponse.
	  * 
	  * @param exceptions
	  */
	 public void setExceptions(org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions) {
		 this.exceptions = exceptions;
	 }


	 /**
	  * Gets the memThreshold value for this TpServiceQueryResponse.
	  * 
	  * @return memThreshold
	  */
	 public java.lang.Integer getMemThreshold() {
		 return memThreshold;
	 }


	 /**
	  * Sets the memThreshold value for this TpServiceQueryResponse.
	  * 
	  * @param memThreshold
	  */
	 public void setMemThreshold(java.lang.Integer memThreshold) {
		 this.memThreshold = memThreshold;
	 }


	 /**
	  * Gets the diskThreshold value for this TpServiceQueryResponse.
	  * 
	  * @return diskThreshold
	  */
	 public java.lang.Integer getDiskThreshold() {
		 return diskThreshold;
	 }


	 /**
	  * Sets the diskThreshold value for this TpServiceQueryResponse.
	  * 
	  * @param diskThreshold
	  */
	 public void setDiskThreshold(java.lang.Integer diskThreshold) {
		 this.diskThreshold = diskThreshold;
	 }


	 /**
	  * Gets the cpuThreshold value for this TpServiceQueryResponse.
	  * 
	  * @return cpuThreshold
	  */
	 public java.lang.Integer getCpuThreshold() {
		 return cpuThreshold;
	 }


	 /**
	  * Sets the cpuThreshold value for this TpServiceQueryResponse.
	  * 
	  * @param cpuThreshold
	  */
	 public void setCpuThreshold(java.lang.Integer cpuThreshold) {
		 this.cpuThreshold = cpuThreshold;
	 }


	 /**
	  * Gets the encapsulatedSystem value for this TpServiceQueryResponse.
	  * 
	  * @return encapsulatedSystem
	  */
	 public java.lang.Boolean getEncapsulatedSystem() {
		 return encapsulatedSystem;
	 }


	 /**
	  * Sets the encapsulatedSystem value for this TpServiceQueryResponse.
	  * 
	  * @param encapsulatedSystem
	  */
	 public void setEncapsulatedSystem(java.lang.Boolean encapsulatedSystem) {
		 this.encapsulatedSystem = encapsulatedSystem;
	 }


	 /**
	  * Gets the enableSNMP value for this TpServiceQueryResponse.
	  * 
	  * @return enableSNMP
	  */
	 public java.lang.Boolean getEnableSNMP() {
		 return enableSNMP;
	 }


	 /**
	  * Sets the enableSNMP value for this TpServiceQueryResponse.
	  * 
	  * @param enableSNMP
	  */
	 public void setEnableSNMP(java.lang.Boolean enableSNMP) {
		 this.enableSNMP = enableSNMP;
	 }


	 /**
	  * Gets the preflightProcessFilter value for this TpServiceQueryResponse.
	  * 
	  * @return preflightProcessFilter
	  */
	 public java.lang.String getPreflightProcessFilter() {
		 return preflightProcessFilter;
	 }


	 /**
	  * Sets the preflightProcessFilter value for this TpServiceQueryResponse.
	  * 
	  * @param preflightProcessFilter
	  */
	 public void setPreflightProcessFilter(java.lang.String preflightProcessFilter) {
		 this.preflightProcessFilter = preflightProcessFilter;
	 }


	 /**
	  * Gets the memThresholdType value for this TpServiceQueryResponse.
	  * 
	  * @return memThresholdType
	  */
	 public java.lang.String getMemThresholdType() {
		 return memThresholdType;
	 }


	 /**
	  * Sets the memThresholdType value for this TpServiceQueryResponse.
	  * 
	  * @param memThresholdType
	  */
	 public void setMemThresholdType(java.lang.String memThresholdType) {
		 this.memThresholdType = memThresholdType;
	 }


	 /**
	  * Gets the diskThresholdType value for this TpServiceQueryResponse.
	  * 
	  * @return diskThresholdType
	  */
	 public java.lang.String getDiskThresholdType() {
		 return diskThresholdType;
	 }


	 /**
	  * Sets the diskThresholdType value for this TpServiceQueryResponse.
	  * 
	  * @param diskThresholdType
	  */
	 public void setDiskThresholdType(java.lang.String diskThresholdType) {
		 this.diskThresholdType = diskThresholdType;
	 }


	 /**
	  * Gets the serviceList value for this TpServiceQueryResponse.
	  * 
	  * @return serviceList
	  */
	 public org.hpccsystems.ws.wstopology.TpServices getServiceList() {
		 return serviceList;
	 }


	 /**
	  * Sets the serviceList value for this TpServiceQueryResponse.
	  * 
	  * @param serviceList
	  */
	 public void setServiceList(org.hpccsystems.ws.wstopology.TpServices serviceList) {
		 this.serviceList = serviceList;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof TpServiceQueryResponse)) {
			return false;
		}
		 TpServiceQueryResponse other = (TpServiceQueryResponse) obj;
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
						 ((this.memThreshold==null && other.getMemThreshold()==null) || 
								 (this.memThreshold!=null &&
								 this.memThreshold.equals(other.getMemThreshold()))) &&
								 ((this.diskThreshold==null && other.getDiskThreshold()==null) || 
										 (this.diskThreshold!=null &&
										 this.diskThreshold.equals(other.getDiskThreshold()))) &&
										 ((this.cpuThreshold==null && other.getCpuThreshold()==null) || 
												 (this.cpuThreshold!=null &&
												 this.cpuThreshold.equals(other.getCpuThreshold()))) &&
												 ((this.encapsulatedSystem==null && other.getEncapsulatedSystem()==null) || 
														 (this.encapsulatedSystem!=null &&
														 this.encapsulatedSystem.equals(other.getEncapsulatedSystem()))) &&
														 ((this.enableSNMP==null && other.getEnableSNMP()==null) || 
																 (this.enableSNMP!=null &&
																 this.enableSNMP.equals(other.getEnableSNMP()))) &&
																 ((this.preflightProcessFilter==null && other.getPreflightProcessFilter()==null) || 
																		 (this.preflightProcessFilter!=null &&
																		 this.preflightProcessFilter.equals(other.getPreflightProcessFilter()))) &&
																		 ((this.memThresholdType==null && other.getMemThresholdType()==null) || 
																				 (this.memThresholdType!=null &&
																				 this.memThresholdType.equals(other.getMemThresholdType()))) &&
																				 ((this.diskThresholdType==null && other.getDiskThresholdType()==null) || 
																						 (this.diskThresholdType!=null &&
																						 this.diskThresholdType.equals(other.getDiskThresholdType()))) &&
																						 ((this.serviceList==null && other.getServiceList()==null) || 
																								 (this.serviceList!=null &&
																								 this.serviceList.equals(other.getServiceList())));
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
		 if (getMemThreshold() != null) {
			 _hashCode += getMemThreshold().hashCode();
		 }
		 if (getDiskThreshold() != null) {
			 _hashCode += getDiskThreshold().hashCode();
		 }
		 if (getCpuThreshold() != null) {
			 _hashCode += getCpuThreshold().hashCode();
		 }
		 if (getEncapsulatedSystem() != null) {
			 _hashCode += getEncapsulatedSystem().hashCode();
		 }
		 if (getEnableSNMP() != null) {
			 _hashCode += getEnableSNMP().hashCode();
		 }
		 if (getPreflightProcessFilter() != null) {
			 _hashCode += getPreflightProcessFilter().hashCode();
		 }
		 if (getMemThresholdType() != null) {
			 _hashCode += getMemThresholdType().hashCode();
		 }
		 if (getDiskThresholdType() != null) {
			 _hashCode += getDiskThresholdType().hashCode();
		 }
		 if (getServiceList() != null) {
			 _hashCode += getServiceList().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(TpServiceQueryResponse.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpServiceQueryResponse"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("exceptions");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("memThreshold");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "MemThreshold"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("diskThreshold");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "DiskThreshold"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("cpuThreshold");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "CpuThreshold"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("encapsulatedSystem");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "EncapsulatedSystem"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("enableSNMP");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "EnableSNMP"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("preflightProcessFilter");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "PreflightProcessFilter"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("memThresholdType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "MemThresholdType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("diskThresholdType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "DiskThresholdType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("serviceList");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ServiceList"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpServices"));
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
