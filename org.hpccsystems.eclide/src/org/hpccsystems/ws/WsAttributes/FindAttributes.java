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
 * FindAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class FindAttributes  implements java.io.Serializable {
	private java.lang.String moduleName;

	private java.lang.String attributeName;

	private java.lang.String userName;

	private java.lang.String label;

	private java.lang.String pattern;

	private java.lang.String regexp;

	private java.lang.String changedSince;

	private java.lang.String[] typeList;

	private java.lang.Boolean sandboxed;

	private java.lang.Boolean locked;

	private java.lang.Boolean checkedOut;

	private java.lang.Boolean orphaned;

	private java.lang.Boolean getText;

	private java.lang.Boolean getMatchedLines;

	private java.lang.Boolean includeHistory;

	public FindAttributes() {
	}

	public FindAttributes(
			java.lang.String moduleName,
			java.lang.String attributeName,
			java.lang.String userName,
			java.lang.String label,
			java.lang.String pattern,
			java.lang.String regexp,
			java.lang.String changedSince,
			java.lang.String[] typeList,
			java.lang.Boolean sandboxed,
			java.lang.Boolean locked,
			java.lang.Boolean checkedOut,
			java.lang.Boolean orphaned,
			java.lang.Boolean getText,
			java.lang.Boolean getMatchedLines,
			java.lang.Boolean includeHistory) {
		this.moduleName = moduleName;
		this.attributeName = attributeName;
		this.userName = userName;
		this.label = label;
		this.pattern = pattern;
		this.regexp = regexp;
		this.changedSince = changedSince;
		this.typeList = typeList;
		this.sandboxed = sandboxed;
		this.locked = locked;
		this.checkedOut = checkedOut;
		this.orphaned = orphaned;
		this.getText = getText;
		this.getMatchedLines = getMatchedLines;
		this.includeHistory = includeHistory;
	}


	/**
	 * Gets the moduleName value for this FindAttributes.
	 * 
	 * @return moduleName
	 */
	 public java.lang.String getModuleName() {
		 return moduleName;
	 }


	/**
	 * Sets the moduleName value for this FindAttributes.
	 * 
	 * @param moduleName
	 */
	 public void setModuleName(java.lang.String moduleName) {
		 this.moduleName = moduleName;
	 }


	 /**
	  * Gets the attributeName value for this FindAttributes.
	  * 
	  * @return attributeName
	  */
	 public java.lang.String getAttributeName() {
		 return attributeName;
	 }


	 /**
	  * Sets the attributeName value for this FindAttributes.
	  * 
	  * @param attributeName
	  */
	 public void setAttributeName(java.lang.String attributeName) {
		 this.attributeName = attributeName;
	 }


	 /**
	  * Gets the userName value for this FindAttributes.
	  * 
	  * @return userName
	  */
	 public java.lang.String getUserName() {
		 return userName;
	 }


	 /**
	  * Sets the userName value for this FindAttributes.
	  * 
	  * @param userName
	  */
	 public void setUserName(java.lang.String userName) {
		 this.userName = userName;
	 }


	 /**
	  * Gets the label value for this FindAttributes.
	  * 
	  * @return label
	  */
	 public java.lang.String getLabel() {
		 return label;
	 }


	 /**
	  * Sets the label value for this FindAttributes.
	  * 
	  * @param label
	  */
	 public void setLabel(java.lang.String label) {
		 this.label = label;
	 }


	 /**
	  * Gets the pattern value for this FindAttributes.
	  * 
	  * @return pattern
	  */
	 public java.lang.String getPattern() {
		 return pattern;
	 }


	 /**
	  * Sets the pattern value for this FindAttributes.
	  * 
	  * @param pattern
	  */
	 public void setPattern(java.lang.String pattern) {
		 this.pattern = pattern;
	 }


	 /**
	  * Gets the regexp value for this FindAttributes.
	  * 
	  * @return regexp
	  */
	 public java.lang.String getRegexp() {
		 return regexp;
	 }


	 /**
	  * Sets the regexp value for this FindAttributes.
	  * 
	  * @param regexp
	  */
	 public void setRegexp(java.lang.String regexp) {
		 this.regexp = regexp;
	 }


	 /**
	  * Gets the changedSince value for this FindAttributes.
	  * 
	  * @return changedSince
	  */
	 public java.lang.String getChangedSince() {
		 return changedSince;
	 }


	 /**
	  * Sets the changedSince value for this FindAttributes.
	  * 
	  * @param changedSince
	  */
	 public void setChangedSince(java.lang.String changedSince) {
		 this.changedSince = changedSince;
	 }


	 /**
	  * Gets the typeList value for this FindAttributes.
	  * 
	  * @return typeList
	  */
	 public java.lang.String[] getTypeList() {
		 return typeList;
	 }


	 /**
	  * Sets the typeList value for this FindAttributes.
	  * 
	  * @param typeList
	  */
	 public void setTypeList(java.lang.String[] typeList) {
		 this.typeList = typeList;
	 }


	 /**
	  * Gets the sandboxed value for this FindAttributes.
	  * 
	  * @return sandboxed
	  */
	 public java.lang.Boolean getSandboxed() {
		 return sandboxed;
	 }


	 /**
	  * Sets the sandboxed value for this FindAttributes.
	  * 
	  * @param sandboxed
	  */
	 public void setSandboxed(java.lang.Boolean sandboxed) {
		 this.sandboxed = sandboxed;
	 }


	 /**
	  * Gets the locked value for this FindAttributes.
	  * 
	  * @return locked
	  */
	 public java.lang.Boolean getLocked() {
		 return locked;
	 }


	 /**
	  * Sets the locked value for this FindAttributes.
	  * 
	  * @param locked
	  */
	 public void setLocked(java.lang.Boolean locked) {
		 this.locked = locked;
	 }


	 /**
	  * Gets the checkedOut value for this FindAttributes.
	  * 
	  * @return checkedOut
	  */
	 public java.lang.Boolean getCheckedOut() {
		 return checkedOut;
	 }


	 /**
	  * Sets the checkedOut value for this FindAttributes.
	  * 
	  * @param checkedOut
	  */
	 public void setCheckedOut(java.lang.Boolean checkedOut) {
		 this.checkedOut = checkedOut;
	 }


	 /**
	  * Gets the orphaned value for this FindAttributes.
	  * 
	  * @return orphaned
	  */
	 public java.lang.Boolean getOrphaned() {
		 return orphaned;
	 }


	 /**
	  * Sets the orphaned value for this FindAttributes.
	  * 
	  * @param orphaned
	  */
	 public void setOrphaned(java.lang.Boolean orphaned) {
		 this.orphaned = orphaned;
	 }


	 /**
	  * Gets the getText value for this FindAttributes.
	  * 
	  * @return getText
	  */
	 public java.lang.Boolean getGetText() {
		 return getText;
	 }


	 /**
	  * Sets the getText value for this FindAttributes.
	  * 
	  * @param getText
	  */
	 public void setGetText(java.lang.Boolean getText) {
		 this.getText = getText;
	 }


	 /**
	  * Gets the getMatchedLines value for this FindAttributes.
	  * 
	  * @return getMatchedLines
	  */
	 public java.lang.Boolean getGetMatchedLines() {
		 return getMatchedLines;
	 }


	 /**
	  * Sets the getMatchedLines value for this FindAttributes.
	  * 
	  * @param getMatchedLines
	  */
	 public void setGetMatchedLines(java.lang.Boolean getMatchedLines) {
		 this.getMatchedLines = getMatchedLines;
	 }


	 /**
	  * Gets the includeHistory value for this FindAttributes.
	  * 
	  * @return includeHistory
	  */
	 public java.lang.Boolean getIncludeHistory() {
		 return includeHistory;
	 }


	 /**
	  * Sets the includeHistory value for this FindAttributes.
	  * 
	  * @param includeHistory
	  */
	 public void setIncludeHistory(java.lang.Boolean includeHistory) {
		 this.includeHistory = includeHistory;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof FindAttributes)) return false;
		 FindAttributes other = (FindAttributes) obj;
		 if (obj == null) return false;
		 if (this == obj) return true;
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
								 ((this.userName==null && other.getUserName()==null) || 
										 (this.userName!=null &&
										 this.userName.equals(other.getUserName()))) &&
										 ((this.label==null && other.getLabel()==null) || 
												 (this.label!=null &&
												 this.label.equals(other.getLabel()))) &&
												 ((this.pattern==null && other.getPattern()==null) || 
														 (this.pattern!=null &&
														 this.pattern.equals(other.getPattern()))) &&
														 ((this.regexp==null && other.getRegexp()==null) || 
																 (this.regexp!=null &&
																 this.regexp.equals(other.getRegexp()))) &&
																 ((this.changedSince==null && other.getChangedSince()==null) || 
																		 (this.changedSince!=null &&
																		 this.changedSince.equals(other.getChangedSince()))) &&
																		 ((this.typeList==null && other.getTypeList()==null) || 
																				 (this.typeList!=null &&
																				 java.util.Arrays.equals(this.typeList, other.getTypeList()))) &&
																				 ((this.sandboxed==null && other.getSandboxed()==null) || 
																						 (this.sandboxed!=null &&
																						 this.sandboxed.equals(other.getSandboxed()))) &&
																						 ((this.locked==null && other.getLocked()==null) || 
																								 (this.locked!=null &&
																								 this.locked.equals(other.getLocked()))) &&
																								 ((this.checkedOut==null && other.getCheckedOut()==null) || 
																										 (this.checkedOut!=null &&
																										 this.checkedOut.equals(other.getCheckedOut()))) &&
																										 ((this.orphaned==null && other.getOrphaned()==null) || 
																												 (this.orphaned!=null &&
																												 this.orphaned.equals(other.getOrphaned()))) &&
																												 ((this.getText==null && other.getGetText()==null) || 
																														 (this.getText!=null &&
																														 this.getText.equals(other.getGetText()))) &&
																														 ((this.getMatchedLines==null && other.getGetMatchedLines()==null) || 
																																 (this.getMatchedLines!=null &&
																																 this.getMatchedLines.equals(other.getGetMatchedLines()))) &&
																																 ((this.includeHistory==null && other.getIncludeHistory()==null) || 
																																		 (this.includeHistory!=null &&
																																		 this.includeHistory.equals(other.getIncludeHistory())));
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
		 if (getUserName() != null) {
			 _hashCode += getUserName().hashCode();
		 }
		 if (getLabel() != null) {
			 _hashCode += getLabel().hashCode();
		 }
		 if (getPattern() != null) {
			 _hashCode += getPattern().hashCode();
		 }
		 if (getRegexp() != null) {
			 _hashCode += getRegexp().hashCode();
		 }
		 if (getChangedSince() != null) {
			 _hashCode += getChangedSince().hashCode();
		 }
		 if (getTypeList() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getTypeList());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getTypeList(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getSandboxed() != null) {
			 _hashCode += getSandboxed().hashCode();
		 }
		 if (getLocked() != null) {
			 _hashCode += getLocked().hashCode();
		 }
		 if (getCheckedOut() != null) {
			 _hashCode += getCheckedOut().hashCode();
		 }
		 if (getOrphaned() != null) {
			 _hashCode += getOrphaned().hashCode();
		 }
		 if (getGetText() != null) {
			 _hashCode += getGetText().hashCode();
		 }
		 if (getGetMatchedLines() != null) {
			 _hashCode += getGetMatchedLines().hashCode();
		 }
		 if (getIncludeHistory() != null) {
			 _hashCode += getIncludeHistory().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(FindAttributes.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">FindAttributes"));
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
		 elemField.setFieldName("userName");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "UserName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("label");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "label"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("pattern");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Pattern"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("regexp");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Regexp"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("changedSince");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ChangedSince"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("typeList");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "TypeList"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Item"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sandboxed");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Sandboxed"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("locked");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Locked"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("checkedOut");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CheckedOut"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("orphaned");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Orphaned"));
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
		 elemField.setFieldName("getMatchedLines");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetMatchedLines"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("includeHistory");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "IncludeHistory"));
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
