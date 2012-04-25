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
 * ECLAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class ECLAttribute  implements java.io.Serializable {
	private java.lang.String moduleName;

	private java.lang.String name;

	private java.lang.String type;

	private java.lang.Integer version;

	private java.lang.Integer latestVersion;

	private java.lang.Integer sandboxVersion;

	private java.lang.Integer flags;

	private java.lang.Integer access;

	private java.lang.Boolean isLocked;

	private java.lang.Boolean isCheckedOut;

	private java.lang.Boolean isSandbox;

	private java.lang.Boolean isOrphaned;

	private java.lang.Integer resultType;

	private java.lang.String lockedBy;

	private java.lang.String modifiedBy;

	private java.lang.String modifiedDate;

	private java.lang.String description;

	private java.lang.String checksum;

	private java.lang.String text;

	private org.hpccsystems.ws.WsAttributes.ECLTextLine[] matchedLines;

	public ECLAttribute() {
	}

	public ECLAttribute(
			java.lang.String moduleName,
			java.lang.String name,
			java.lang.String type,
			java.lang.Integer version,
			java.lang.Integer latestVersion,
			java.lang.Integer sandboxVersion,
			java.lang.Integer flags,
			java.lang.Integer access,
			java.lang.Boolean isLocked,
			java.lang.Boolean isCheckedOut,
			java.lang.Boolean isSandbox,
			java.lang.Boolean isOrphaned,
			java.lang.Integer resultType,
			java.lang.String lockedBy,
			java.lang.String modifiedBy,
			java.lang.String modifiedDate,
			java.lang.String description,
			java.lang.String checksum,
			java.lang.String text,
			org.hpccsystems.ws.WsAttributes.ECLTextLine[] matchedLines) {
		this.moduleName = moduleName;
		this.name = name;
		this.type = type;
		this.version = version;
		this.latestVersion = latestVersion;
		this.sandboxVersion = sandboxVersion;
		this.flags = flags;
		this.access = access;
		this.isLocked = isLocked;
		this.isCheckedOut = isCheckedOut;
		this.isSandbox = isSandbox;
		this.isOrphaned = isOrphaned;
		this.resultType = resultType;
		this.lockedBy = lockedBy;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.description = description;
		this.checksum = checksum;
		this.text = text;
		this.matchedLines = matchedLines;
	}


	/**
	 * Gets the moduleName value for this ECLAttribute.
	 * 
	 * @return moduleName
	 */
	 public java.lang.String getModuleName() {
		 return moduleName;
	 }


	/**
	 * Sets the moduleName value for this ECLAttribute.
	 * 
	 * @param moduleName
	 */
	 public void setModuleName(java.lang.String moduleName) {
		 this.moduleName = moduleName;
	 }


	/**
	 * Gets the name value for this ECLAttribute.
	 * 
	 * @return name
	 */
	 public java.lang.String getName() {
		 return name;
	 }


	 /**
	  * Sets the name value for this ECLAttribute.
	  * 
	  * @param name
	  */
	 public void setName(java.lang.String name) {
		 this.name = name;
	 }


	 /**
	  * Gets the type value for this ECLAttribute.
	  * 
	  * @return type
	  */
	 public java.lang.String getType() {
		 return type;
	 }


	 /**
	  * Sets the type value for this ECLAttribute.
	  * 
	  * @param type
	  */
	 public void setType(java.lang.String type) {
		 this.type = type;
	 }


	 /**
	  * Gets the version value for this ECLAttribute.
	  * 
	  * @return version
	  */
	 public java.lang.Integer getVersion() {
		 return version;
	 }


	 /**
	  * Sets the version value for this ECLAttribute.
	  * 
	  * @param version
	  */
	 public void setVersion(java.lang.Integer version) {
		 this.version = version;
	 }


	 /**
	  * Gets the latestVersion value for this ECLAttribute.
	  * 
	  * @return latestVersion
	  */
	 public java.lang.Integer getLatestVersion() {
		 return latestVersion;
	 }


	 /**
	  * Sets the latestVersion value for this ECLAttribute.
	  * 
	  * @param latestVersion
	  */
	 public void setLatestVersion(java.lang.Integer latestVersion) {
		 this.latestVersion = latestVersion;
	 }


	 /**
	  * Gets the sandboxVersion value for this ECLAttribute.
	  * 
	  * @return sandboxVersion
	  */
	 public java.lang.Integer getSandboxVersion() {
		 return sandboxVersion;
	 }


	 /**
	  * Sets the sandboxVersion value for this ECLAttribute.
	  * 
	  * @param sandboxVersion
	  */
	 public void setSandboxVersion(java.lang.Integer sandboxVersion) {
		 this.sandboxVersion = sandboxVersion;
	 }


	 /**
	  * Gets the flags value for this ECLAttribute.
	  * 
	  * @return flags
	  */
	 public java.lang.Integer getFlags() {
		 return flags;
	 }


	 /**
	  * Sets the flags value for this ECLAttribute.
	  * 
	  * @param flags
	  */
	 public void setFlags(java.lang.Integer flags) {
		 this.flags = flags;
	 }


	 /**
	  * Gets the access value for this ECLAttribute.
	  * 
	  * @return access
	  */
	 public java.lang.Integer getAccess() {
		 return access;
	 }


	 /**
	  * Sets the access value for this ECLAttribute.
	  * 
	  * @param access
	  */
	 public void setAccess(java.lang.Integer access) {
		 this.access = access;
	 }


	 /**
	  * Gets the isLocked value for this ECLAttribute.
	  * 
	  * @return isLocked
	  */
	 public java.lang.Boolean getIsLocked() {
		 return isLocked;
	 }


	 /**
	  * Sets the isLocked value for this ECLAttribute.
	  * 
	  * @param isLocked
	  */
	 public void setIsLocked(java.lang.Boolean isLocked) {
		 this.isLocked = isLocked;
	 }


	 /**
	  * Gets the isCheckedOut value for this ECLAttribute.
	  * 
	  * @return isCheckedOut
	  */
	 public java.lang.Boolean getIsCheckedOut() {
		 return isCheckedOut;
	 }


	 /**
	  * Sets the isCheckedOut value for this ECLAttribute.
	  * 
	  * @param isCheckedOut
	  */
	 public void setIsCheckedOut(java.lang.Boolean isCheckedOut) {
		 this.isCheckedOut = isCheckedOut;
	 }


	 /**
	  * Gets the isSandbox value for this ECLAttribute.
	  * 
	  * @return isSandbox
	  */
	 public java.lang.Boolean getIsSandbox() {
		 return isSandbox;
	 }


	 /**
	  * Sets the isSandbox value for this ECLAttribute.
	  * 
	  * @param isSandbox
	  */
	 public void setIsSandbox(java.lang.Boolean isSandbox) {
		 this.isSandbox = isSandbox;
	 }


	 /**
	  * Gets the isOrphaned value for this ECLAttribute.
	  * 
	  * @return isOrphaned
	  */
	 public java.lang.Boolean getIsOrphaned() {
		 return isOrphaned;
	 }


	 /**
	  * Sets the isOrphaned value for this ECLAttribute.
	  * 
	  * @param isOrphaned
	  */
	 public void setIsOrphaned(java.lang.Boolean isOrphaned) {
		 this.isOrphaned = isOrphaned;
	 }


	 /**
	  * Gets the resultType value for this ECLAttribute.
	  * 
	  * @return resultType
	  */
	 public java.lang.Integer getResultType() {
		 return resultType;
	 }


	 /**
	  * Sets the resultType value for this ECLAttribute.
	  * 
	  * @param resultType
	  */
	 public void setResultType(java.lang.Integer resultType) {
		 this.resultType = resultType;
	 }


	 /**
	  * Gets the lockedBy value for this ECLAttribute.
	  * 
	  * @return lockedBy
	  */
	 public java.lang.String getLockedBy() {
		 return lockedBy;
	 }


	 /**
	  * Sets the lockedBy value for this ECLAttribute.
	  * 
	  * @param lockedBy
	  */
	 public void setLockedBy(java.lang.String lockedBy) {
		 this.lockedBy = lockedBy;
	 }


	 /**
	  * Gets the modifiedBy value for this ECLAttribute.
	  * 
	  * @return modifiedBy
	  */
	 public java.lang.String getModifiedBy() {
		 return modifiedBy;
	 }


	 /**
	  * Sets the modifiedBy value for this ECLAttribute.
	  * 
	  * @param modifiedBy
	  */
	 public void setModifiedBy(java.lang.String modifiedBy) {
		 this.modifiedBy = modifiedBy;
	 }


	 /**
	  * Gets the modifiedDate value for this ECLAttribute.
	  * 
	  * @return modifiedDate
	  */
	 public java.lang.String getModifiedDate() {
		 return modifiedDate;
	 }


	 /**
	  * Sets the modifiedDate value for this ECLAttribute.
	  * 
	  * @param modifiedDate
	  */
	 public void setModifiedDate(java.lang.String modifiedDate) {
		 this.modifiedDate = modifiedDate;
	 }


	 /**
	  * Gets the description value for this ECLAttribute.
	  * 
	  * @return description
	  */
	 public java.lang.String getDescription() {
		 return description;
	 }


	 /**
	  * Sets the description value for this ECLAttribute.
	  * 
	  * @param description
	  */
	 public void setDescription(java.lang.String description) {
		 this.description = description;
	 }


	 /**
	  * Gets the checksum value for this ECLAttribute.
	  * 
	  * @return checksum
	  */
	 public java.lang.String getChecksum() {
		 return checksum;
	 }


	 /**
	  * Sets the checksum value for this ECLAttribute.
	  * 
	  * @param checksum
	  */
	 public void setChecksum(java.lang.String checksum) {
		 this.checksum = checksum;
	 }


	 /**
	  * Gets the text value for this ECLAttribute.
	  * 
	  * @return text
	  */
	 public java.lang.String getText() {
		 return text;
	 }


	 /**
	  * Sets the text value for this ECLAttribute.
	  * 
	  * @param text
	  */
	 public void setText(java.lang.String text) {
		 this.text = text;
	 }


	 /**
	  * Gets the matchedLines value for this ECLAttribute.
	  * 
	  * @return matchedLines
	  */
	 public org.hpccsystems.ws.WsAttributes.ECLTextLine[] getMatchedLines() {
		 return matchedLines;
	 }


	 /**
	  * Sets the matchedLines value for this ECLAttribute.
	  * 
	  * @param matchedLines
	  */
	 public void setMatchedLines(org.hpccsystems.ws.WsAttributes.ECLTextLine[] matchedLines) {
		 this.matchedLines = matchedLines;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof ECLAttribute)) return false;
		 ECLAttribute other = (ECLAttribute) obj;
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
						 ((this.name==null && other.getName()==null) || 
								 (this.name!=null &&
								 this.name.equals(other.getName()))) &&
								 ((this.type==null && other.getType()==null) || 
										 (this.type!=null &&
										 this.type.equals(other.getType()))) &&
										 ((this.version==null && other.getVersion()==null) || 
												 (this.version!=null &&
												 this.version.equals(other.getVersion()))) &&
												 ((this.latestVersion==null && other.getLatestVersion()==null) || 
														 (this.latestVersion!=null &&
														 this.latestVersion.equals(other.getLatestVersion()))) &&
														 ((this.sandboxVersion==null && other.getSandboxVersion()==null) || 
																 (this.sandboxVersion!=null &&
																 this.sandboxVersion.equals(other.getSandboxVersion()))) &&
																 ((this.flags==null && other.getFlags()==null) || 
																		 (this.flags!=null &&
																		 this.flags.equals(other.getFlags()))) &&
																		 ((this.access==null && other.getAccess()==null) || 
																				 (this.access!=null &&
																				 this.access.equals(other.getAccess()))) &&
																				 ((this.isLocked==null && other.getIsLocked()==null) || 
																						 (this.isLocked!=null &&
																						 this.isLocked.equals(other.getIsLocked()))) &&
																						 ((this.isCheckedOut==null && other.getIsCheckedOut()==null) || 
																								 (this.isCheckedOut!=null &&
																								 this.isCheckedOut.equals(other.getIsCheckedOut()))) &&
																								 ((this.isSandbox==null && other.getIsSandbox()==null) || 
																										 (this.isSandbox!=null &&
																										 this.isSandbox.equals(other.getIsSandbox()))) &&
																										 ((this.isOrphaned==null && other.getIsOrphaned()==null) || 
																												 (this.isOrphaned!=null &&
																												 this.isOrphaned.equals(other.getIsOrphaned()))) &&
																												 ((this.resultType==null && other.getResultType()==null) || 
																														 (this.resultType!=null &&
																														 this.resultType.equals(other.getResultType()))) &&
																														 ((this.lockedBy==null && other.getLockedBy()==null) || 
																																 (this.lockedBy!=null &&
																																 this.lockedBy.equals(other.getLockedBy()))) &&
																																 ((this.modifiedBy==null && other.getModifiedBy()==null) || 
																																		 (this.modifiedBy!=null &&
																																		 this.modifiedBy.equals(other.getModifiedBy()))) &&
																																		 ((this.modifiedDate==null && other.getModifiedDate()==null) || 
																																				 (this.modifiedDate!=null &&
																																				 this.modifiedDate.equals(other.getModifiedDate()))) &&
																																				 ((this.description==null && other.getDescription()==null) || 
																																						 (this.description!=null &&
																																						 this.description.equals(other.getDescription()))) &&
																																						 ((this.checksum==null && other.getChecksum()==null) || 
																																								 (this.checksum!=null &&
																																								 this.checksum.equals(other.getChecksum()))) &&
																																								 ((this.text==null && other.getText()==null) || 
																																										 (this.text!=null &&
																																										 this.text.equals(other.getText()))) &&
																																										 ((this.matchedLines==null && other.getMatchedLines()==null) || 
																																												 (this.matchedLines!=null &&
																																												 java.util.Arrays.equals(this.matchedLines, other.getMatchedLines())));
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
		 if (getName() != null) {
			 _hashCode += getName().hashCode();
		 }
		 if (getType() != null) {
			 _hashCode += getType().hashCode();
		 }
		 if (getVersion() != null) {
			 _hashCode += getVersion().hashCode();
		 }
		 if (getLatestVersion() != null) {
			 _hashCode += getLatestVersion().hashCode();
		 }
		 if (getSandboxVersion() != null) {
			 _hashCode += getSandboxVersion().hashCode();
		 }
		 if (getFlags() != null) {
			 _hashCode += getFlags().hashCode();
		 }
		 if (getAccess() != null) {
			 _hashCode += getAccess().hashCode();
		 }
		 if (getIsLocked() != null) {
			 _hashCode += getIsLocked().hashCode();
		 }
		 if (getIsCheckedOut() != null) {
			 _hashCode += getIsCheckedOut().hashCode();
		 }
		 if (getIsSandbox() != null) {
			 _hashCode += getIsSandbox().hashCode();
		 }
		 if (getIsOrphaned() != null) {
			 _hashCode += getIsOrphaned().hashCode();
		 }
		 if (getResultType() != null) {
			 _hashCode += getResultType().hashCode();
		 }
		 if (getLockedBy() != null) {
			 _hashCode += getLockedBy().hashCode();
		 }
		 if (getModifiedBy() != null) {
			 _hashCode += getModifiedBy().hashCode();
		 }
		 if (getModifiedDate() != null) {
			 _hashCode += getModifiedDate().hashCode();
		 }
		 if (getDescription() != null) {
			 _hashCode += getDescription().hashCode();
		 }
		 if (getChecksum() != null) {
			 _hashCode += getChecksum().hashCode();
		 }
		 if (getText() != null) {
			 _hashCode += getText().hashCode();
		 }
		 if (getMatchedLines() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getMatchedLines());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getMatchedLines(), i);
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
			 new org.apache.axis.description.TypeDesc(ECLAttribute.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLAttribute"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("moduleName");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ModuleName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("name");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Name"));
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
		 elemField.setFieldName("latestVersion");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "LatestVersion"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sandboxVersion");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "SandboxVersion"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("flags");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Flags"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("access");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Access"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isLocked");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "IsLocked"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isCheckedOut");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "IsCheckedOut"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isSandbox");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "IsSandbox"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("isOrphaned");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "IsOrphaned"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("resultType");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ResultType"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("lockedBy");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "LockedBy"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("modifiedBy");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ModifiedBy"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("modifiedDate");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ModifiedDate"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("description");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Description"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("checksum");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Checksum"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("text");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Text"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("matchedLines");
		 elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "MatchedLines"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLTextLine"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Line"));
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
