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
 * TpTargetCluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpTargetCluster  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String prefix;

	private java.lang.String type;

	private org.hpccsystems.ws.wstopology.TpCluster[] tpClusters;

	private org.hpccsystems.ws.wstopology.TpEclServer[] tpEclCCServers;

	private org.hpccsystems.ws.wstopology.TpEclAgent[] tpEclAgents;

	private org.hpccsystems.ws.wstopology.TpEclScheduler[] tpEclSchedulers;

	public TpTargetCluster() {
	}

	public TpTargetCluster(
			java.lang.String name,
			java.lang.String prefix,
			java.lang.String type,
			org.hpccsystems.ws.wstopology.TpCluster[] tpClusters,
			org.hpccsystems.ws.wstopology.TpEclServer[] tpEclCCServers,
			org.hpccsystems.ws.wstopology.TpEclAgent[] tpEclAgents,
			org.hpccsystems.ws.wstopology.TpEclScheduler[] tpEclSchedulers) {
		this.name = name;
		this.prefix = prefix;
		this.type = type;
		this.tpClusters = tpClusters;
		this.tpEclCCServers = tpEclCCServers;
		this.tpEclAgents = tpEclAgents;
		this.tpEclSchedulers = tpEclSchedulers;
	}


	/**
	 * Gets the name value for this TpTargetCluster.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this TpTargetCluster.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the prefix value for this TpTargetCluster.
	  * 
	  * @return prefix
	  */
	 public java.lang.String getPrefix() {
		 return prefix;
	 }


	 /**
	  * Sets the prefix value for this TpTargetCluster.
	  * 
	  * @param prefix
	  */
	 public void setPrefix(java.lang.String prefix) {
		 this.prefix = prefix;
	 }


	 /**
	  * Gets the type value for this TpTargetCluster.
	  * 
	  * @return type
	  */
	 public java.lang.String getType() {
		 return type;
	 }


	 /**
	  * Sets the type value for this TpTargetCluster.
	  * 
	  * @param type
	  */
	 public void setType(java.lang.String type) {
		 this.type = type;
	 }


	 /**
	  * Gets the tpClusters value for this TpTargetCluster.
	  * 
	  * @return tpClusters
	  */
	 public org.hpccsystems.ws.wstopology.TpCluster[] getTpClusters() {
		 return tpClusters;
	 }


	 /**
	  * Sets the tpClusters value for this TpTargetCluster.
	  * 
	  * @param tpClusters
	  */
	 public void setTpClusters(org.hpccsystems.ws.wstopology.TpCluster[] tpClusters) {
		 this.tpClusters = tpClusters;
	 }


	 /**
	  * Gets the tpEclCCServers value for this TpTargetCluster.
	  * 
	  * @return tpEclCCServers
	  */
	 public org.hpccsystems.ws.wstopology.TpEclServer[] getTpEclCCServers() {
		 return tpEclCCServers;
	 }


	 /**
	  * Sets the tpEclCCServers value for this TpTargetCluster.
	  * 
	  * @param tpEclCCServers
	  */
	 public void setTpEclCCServers(org.hpccsystems.ws.wstopology.TpEclServer[] tpEclCCServers) {
		 this.tpEclCCServers = tpEclCCServers;
	 }


	 /**
	  * Gets the tpEclAgents value for this TpTargetCluster.
	  * 
	  * @return tpEclAgents
	  */
	 public org.hpccsystems.ws.wstopology.TpEclAgent[] getTpEclAgents() {
		 return tpEclAgents;
	 }


	 /**
	  * Sets the tpEclAgents value for this TpTargetCluster.
	  * 
	  * @param tpEclAgents
	  */
	 public void setTpEclAgents(org.hpccsystems.ws.wstopology.TpEclAgent[] tpEclAgents) {
		 this.tpEclAgents = tpEclAgents;
	 }


	 /**
	  * Gets the tpEclSchedulers value for this TpTargetCluster.
	  * 
	  * @return tpEclSchedulers
	  */
	 public org.hpccsystems.ws.wstopology.TpEclScheduler[] getTpEclSchedulers() {
		 return tpEclSchedulers;
	 }


	 /**
	  * Sets the tpEclSchedulers value for this TpTargetCluster.
	  * 
	  * @param tpEclSchedulers
	  */
	 public void setTpEclSchedulers(org.hpccsystems.ws.wstopology.TpEclScheduler[] tpEclSchedulers) {
		 this.tpEclSchedulers = tpEclSchedulers;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof TpTargetCluster)) {
			return false;
		}
		 TpTargetCluster other = (TpTargetCluster) obj;
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
				 ((this.name==null && other.getName()==null) || 
						 (this.name!=null &&
						 this.name.equals(other.getName()))) &&
						 ((this.prefix==null && other.getPrefix()==null) || 
								 (this.prefix!=null &&
								 this.prefix.equals(other.getPrefix()))) &&
								 ((this.type==null && other.getType()==null) || 
										 (this.type!=null &&
										 this.type.equals(other.getType()))) &&
										 ((this.tpClusters==null && other.getTpClusters()==null) || 
												 (this.tpClusters!=null &&
												 java.util.Arrays.equals(this.tpClusters, other.getTpClusters()))) &&
												 ((this.tpEclCCServers==null && other.getTpEclCCServers()==null) || 
														 (this.tpEclCCServers!=null &&
														 java.util.Arrays.equals(this.tpEclCCServers, other.getTpEclCCServers()))) &&
														 ((this.tpEclAgents==null && other.getTpEclAgents()==null) || 
																 (this.tpEclAgents!=null &&
																 java.util.Arrays.equals(this.tpEclAgents, other.getTpEclAgents()))) &&
																 ((this.tpEclSchedulers==null && other.getTpEclSchedulers()==null) || 
																		 (this.tpEclSchedulers!=null &&
																		 java.util.Arrays.equals(this.tpEclSchedulers, other.getTpEclSchedulers())));
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
		 if (getPrefix() != null) {
			 _hashCode += getPrefix().hashCode();
		 }
		 if (getType() != null) {
			 _hashCode += getType().hashCode();
		 }
		 if (getTpClusters() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getTpClusters());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getTpClusters(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getTpEclCCServers() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getTpEclCCServers());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getTpEclCCServers(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getTpEclAgents() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getTpEclAgents());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getTpEclAgents(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getTpEclSchedulers() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getTpEclSchedulers());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getTpEclSchedulers(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(TpTargetCluster.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpTargetCluster"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("prefix");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Prefix"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("type");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Type"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("tpClusters");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusters"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpCluster"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpCluster"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("tpEclCCServers");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclCCServers"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclServer"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclServer"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("tpEclAgents");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclAgents"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclAgent"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclAgent"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("tpEclSchedulers");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclSchedulers"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclScheduler"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclScheduler"));
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
