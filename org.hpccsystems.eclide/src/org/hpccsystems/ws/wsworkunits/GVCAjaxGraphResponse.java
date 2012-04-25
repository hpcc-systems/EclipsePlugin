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
 * GVCAjaxGraphResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class GVCAjaxGraphResponse  implements java.io.Serializable {
	private java.lang.String name;

	private java.lang.String graphName;

	private java.lang.String graphType;

	private java.lang.Integer subGraphId;

	private java.lang.Boolean subGraphOnly;

	public GVCAjaxGraphResponse() {
	}

	public GVCAjaxGraphResponse(
			java.lang.String name,
			java.lang.String graphName,
			java.lang.String graphType,
			java.lang.Integer subGraphId,
			java.lang.Boolean subGraphOnly) {
		this.name = name;
		this.graphName = graphName;
		this.graphType = graphType;
		this.subGraphId = subGraphId;
		this.subGraphOnly = subGraphOnly;
	}


	/**
	 * Gets the name value for this GVCAjaxGraphResponse.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this GVCAjaxGraphResponse.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the graphName value for this GVCAjaxGraphResponse.
	  * 
	  * @return graphName
	  */
	 public java.lang.String getGraphName() {
		 return graphName;
	 }


	 /**
	  * Sets the graphName value for this GVCAjaxGraphResponse.
	  * 
	  * @param graphName
	  */
	 public void setGraphName(java.lang.String graphName) {
		 this.graphName = graphName;
	 }


	 /**
	  * Gets the graphType value for this GVCAjaxGraphResponse.
	  * 
	  * @return graphType
	  */
	 public java.lang.String getGraphType() {
		 return graphType;
	 }


	 /**
	  * Sets the graphType value for this GVCAjaxGraphResponse.
	  * 
	  * @param graphType
	  */
	 public void setGraphType(java.lang.String graphType) {
		 this.graphType = graphType;
	 }


	 /**
	  * Gets the subGraphId value for this GVCAjaxGraphResponse.
	  * 
	  * @return subGraphId
	  */
	 public java.lang.Integer getSubGraphId() {
		 return subGraphId;
	 }


	 /**
	  * Sets the subGraphId value for this GVCAjaxGraphResponse.
	  * 
	  * @param subGraphId
	  */
	 public void setSubGraphId(java.lang.Integer subGraphId) {
		 this.subGraphId = subGraphId;
	 }


	 /**
	  * Gets the subGraphOnly value for this GVCAjaxGraphResponse.
	  * 
	  * @return subGraphOnly
	  */
	 public java.lang.Boolean getSubGraphOnly() {
		 return subGraphOnly;
	 }


	 /**
	  * Sets the subGraphOnly value for this GVCAjaxGraphResponse.
	  * 
	  * @param subGraphOnly
	  */
	 public void setSubGraphOnly(java.lang.Boolean subGraphOnly) {
		 this.subGraphOnly = subGraphOnly;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof GVCAjaxGraphResponse)) return false;
		 GVCAjaxGraphResponse other = (GVCAjaxGraphResponse) obj;
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
						 ((this.graphName==null && other.getGraphName()==null) || 
								 (this.graphName!=null &&
								 this.graphName.equals(other.getGraphName()))) &&
								 ((this.graphType==null && other.getGraphType()==null) || 
										 (this.graphType!=null &&
										 this.graphType.equals(other.getGraphType()))) &&
										 ((this.subGraphId==null && other.getSubGraphId()==null) || 
												 (this.subGraphId!=null &&
												 this.subGraphId.equals(other.getSubGraphId()))) &&
												 ((this.subGraphOnly==null && other.getSubGraphOnly()==null) || 
														 (this.subGraphOnly!=null &&
														 this.subGraphOnly.equals(other.getSubGraphOnly())));
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
		 if (getGraphName() != null) {
			 _hashCode += getGraphName().hashCode();
		 }
		 if (getGraphType() != null) {
			 _hashCode += getGraphType().hashCode();
		 }
		 if (getSubGraphId() != null) {
			 _hashCode += getSubGraphId().hashCode();
		 }
		 if (getSubGraphOnly() != null) {
			 _hashCode += getSubGraphOnly().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(GVCAjaxGraphResponse.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">GVCAjaxGraphResponse"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("graphName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("graphType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("subGraphId");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SubGraphId"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("subGraphOnly");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SubGraphOnly"));
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
