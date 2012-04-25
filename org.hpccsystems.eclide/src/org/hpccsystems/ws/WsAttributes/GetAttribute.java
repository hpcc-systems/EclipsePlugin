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
 * GetAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class GetAttribute  implements java.io.Serializable {
	private java.lang.String moduleName;

	private java.lang.String attributeName;

	private java.lang.String type;

	private java.lang.Integer version;

	private java.lang.Boolean getSandbox;

	private java.lang.Boolean getText;

	private java.lang.String label;

	private java.lang.Boolean sandboxForLabel;

	public GetAttribute() {
	}

	public GetAttribute(
			java.lang.String moduleName,
			java.lang.String attributeName,
			java.lang.String type,
			java.lang.Integer version,
			java.lang.Boolean getSandbox,
			java.lang.Boolean getText,
			java.lang.String label,
			java.lang.Boolean sandboxForLabel) {
		this.moduleName = moduleName;
		this.attributeName = attributeName;
		this.type = type;
		this.version = version;
		this.getSandbox = getSandbox;
		this.getText = getText;
		this.label = label;
		this.sandboxForLabel = sandboxForLabel;
	}


	/**
	 * Gets the moduleName value for this GetAttribute.
	 * 
	 * @return moduleName
	 */
	 public java.lang.String getModuleName() {
		 return moduleName;
	 }


	 /**
	  * Sets the moduleName value for this GetAttribute.
	  * 
	  * @param moduleName
	  */
	 public void setModuleName(java.lang.String moduleName) {
		 this.moduleName = moduleName;
	 }


	 /**
	  * Gets the attributeName value for this GetAttribute.
	  * 
	  * @return attributeName
	  */
	 public java.lang.String getAttributeName() {
		 return attributeName;
	 }


	 /**
	  * Sets the attributeName value for this GetAttribute.
	  * 
	  * @param attributeName
	  */
	 public void setAttributeName(java.lang.String attributeName) {
		 this.attributeName = attributeName;
	 }


	 /**
	  * Gets the type value for this GetAttribute.
	  * 
	  * @return type
	  */
	 public java.lang.String getType() {
		 return type;
	 }


	 /**
	  * Sets the type value for this GetAttribute.
	  * 
	  * @param type
	  */
	 public void setType(java.lang.String type) {
		 this.type = type;
	 }


	 /**
	  * Gets the version value for this GetAttribute.
	  * 
	  * @return version
	  */
	 public java.lang.Integer getVersion() {
		 return version;
	 }


	 /**
	  * Sets the version value for this GetAttribute.
	  * 
	  * @param version
	  */
	 public void setVersion(java.lang.Integer version) {
		 this.version = version;
	 }


	 /**
	  * Gets the getSandbox value for this GetAttribute.
	  * 
	  * @return getSandbox
	  */
	 public java.lang.Boolean getGetSandbox() {
		 return getSandbox;
	 }


	 /**
	  * Sets the getSandbox value for this GetAttribute.
	  * 
	  * @param getSandbox
	  */
	 public void setGetSandbox(java.lang.Boolean getSandbox) {
		 this.getSandbox = getSandbox;
	 }


	 /**
	  * Gets the getText value for this GetAttribute.
	  * 
	  * @return getText
	  */
	 public java.lang.Boolean getGetText() {
		 return getText;
	 }


	 /**
	  * Sets the getText value for this GetAttribute.
	  * 
	  * @param getText
	  */
	 public void setGetText(java.lang.Boolean getText) {
		 this.getText = getText;
	 }


	 /**
	  * Gets the label value for this GetAttribute.
	  * 
	  * @return label
	  */
	 public java.lang.String getLabel() {
		 return label;
	 }


	 /**
	  * Sets the label value for this GetAttribute.
	  * 
	  * @param label
	  */
	 public void setLabel(java.lang.String label) {
		 this.label = label;
	 }


	 /**
	  * Gets the sandboxForLabel value for this GetAttribute.
	  * 
	  * @return sandboxForLabel
	  */
	 public java.lang.Boolean getSandboxForLabel() {
		 return sandboxForLabel;
	 }


	 /**
	  * Sets the sandboxForLabel value for this GetAttribute.
	  * 
	  * @param sandboxForLabel
	  */
	 public void setSandboxForLabel(java.lang.Boolean sandboxForLabel) {
		 this.sandboxForLabel = sandboxForLabel;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof GetAttribute)) {
			return false;
		}
		 GetAttribute other = (GetAttribute) obj;
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
				 ((this.moduleName==null && other.getModuleName()==null) || 
						 (this.moduleName!=null &&
						 this.moduleName.equals(other.getModuleName()))) &&
						 ((this.attributeName==null && other.getAttributeName()==null) || 
								 (this.attributeName!=null &&
								 this.attributeName.equals(other.getAttributeName()))) &&
								 ((this.type==null && other.getType()==null) || 
										 (this.type!=null &&
										 this.type.equals(other.getType()))) &&
										 ((this.version==null && other.getVersion()==null) || 
												 (this.version!=null &&
												 this.version.equals(other.getVersion()))) &&
												 ((this.getSandbox==null && other.getGetSandbox()==null) || 
														 (this.getSandbox!=null &&
														 this.getSandbox.equals(other.getGetSandbox()))) &&
														 ((this.getText==null && other.getGetText()==null) || 
																 (this.getText!=null &&
																 this.getText.equals(other.getGetText()))) &&
																 ((this.label==null && other.getLabel()==null) || 
																		 (this.label!=null &&
																		 this.label.equals(other.getLabel()))) &&
																		 ((this.sandboxForLabel==null && other.getSandboxForLabel()==null) || 
																				 (this.sandboxForLabel!=null &&
																				 this.sandboxForLabel.equals(other.getSandboxForLabel())));
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
		 if (getModuleName() != null) {
			 _hashCode += getModuleName().hashCode();
		 }
		 if (getAttributeName() != null) {
			 _hashCode += getAttributeName().hashCode();
		 }
		 if (getType() != null) {
			 _hashCode += getType().hashCode();
		 }
		 if (getVersion() != null) {
			 _hashCode += getVersion().hashCode();
		 }
		 if (getGetSandbox() != null) {
			 _hashCode += getGetSandbox().hashCode();
		 }
		 if (getGetText() != null) {
			 _hashCode += getGetText().hashCode();
		 }
		 if (getLabel() != null) {
			 _hashCode += getLabel().hashCode();
		 }
		 if (getSandboxForLabel() != null) {
			 _hashCode += getSandboxForLabel().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(GetAttribute.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttribute"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("moduleName");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ModuleName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("attributeName");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "AttributeName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("type");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Type"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("version");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Version"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("getSandbox");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetSandbox"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("getText");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetText"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("label");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Label"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sandboxForLabel");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "SandboxForLabel"));
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
