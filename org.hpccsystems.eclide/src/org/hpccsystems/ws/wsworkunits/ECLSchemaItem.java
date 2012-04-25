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
 * ECLSchemaItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class ECLSchemaItem  implements java.io.Serializable {
	private java.lang.String columnName;

	private java.lang.String columnType;

	private java.lang.Integer columnTypeCode;

	private java.lang.Boolean isConditional;

	public ECLSchemaItem() {
	}

	public ECLSchemaItem(
			java.lang.String columnName,
			java.lang.String columnType,
			java.lang.Integer columnTypeCode,
			java.lang.Boolean isConditional) {
		this.columnName = columnName;
		this.columnType = columnType;
		this.columnTypeCode = columnTypeCode;
		this.isConditional = isConditional;
	}


	/**
	 * Gets the columnName value for this ECLSchemaItem.
	 * 
	 * @return columnName
	 */
	public java.lang.String getColumnName() {
		return columnName;
	}


	/**
	 * Sets the columnName value for this ECLSchemaItem.
	 * 
	 * @param columnName
	 */
	public void setColumnName(java.lang.String columnName) {
		this.columnName = columnName;
	}


	/**
	 * Gets the columnType value for this ECLSchemaItem.
	 * 
	 * @return columnType
	 */
	public java.lang.String getColumnType() {
		return columnType;
	}


	/**
	 * Sets the columnType value for this ECLSchemaItem.
	 * 
	 * @param columnType
	 */
	public void setColumnType(java.lang.String columnType) {
		this.columnType = columnType;
	}


	/**
	 * Gets the columnTypeCode value for this ECLSchemaItem.
	 * 
	 * @return columnTypeCode
	 */
	public java.lang.Integer getColumnTypeCode() {
		return columnTypeCode;
	}


	/**
	 * Sets the columnTypeCode value for this ECLSchemaItem.
	 * 
	 * @param columnTypeCode
	 */
	public void setColumnTypeCode(java.lang.Integer columnTypeCode) {
		this.columnTypeCode = columnTypeCode;
	}


	/**
	 * Gets the isConditional value for this ECLSchemaItem.
	 * 
	 * @return isConditional
	 */
	public java.lang.Boolean getIsConditional() {
		return isConditional;
	}


	/**
	 * Sets the isConditional value for this ECLSchemaItem.
	 * 
	 * @param isConditional
	 */
	public void setIsConditional(java.lang.Boolean isConditional) {
		this.isConditional = isConditional;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ECLSchemaItem)) {
			return false;
		}
		ECLSchemaItem other = (ECLSchemaItem) obj;
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
				((this.columnName==null && other.getColumnName()==null) || 
						(this.columnName!=null &&
						this.columnName.equals(other.getColumnName()))) &&
						((this.columnType==null && other.getColumnType()==null) || 
								(this.columnType!=null &&
								this.columnType.equals(other.getColumnType()))) &&
								((this.columnTypeCode==null && other.getColumnTypeCode()==null) || 
										(this.columnTypeCode!=null &&
										this.columnTypeCode.equals(other.getColumnTypeCode()))) &&
										((this.isConditional==null && other.getIsConditional()==null) || 
												(this.isConditional!=null &&
												this.isConditional.equals(other.getIsConditional())));
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
		if (getColumnName() != null) {
			_hashCode += getColumnName().hashCode();
		}
		if (getColumnType() != null) {
			_hashCode += getColumnType().hashCode();
		}
		if (getColumnTypeCode() != null) {
			_hashCode += getColumnTypeCode().hashCode();
		}
		if (getIsConditional() != null) {
			_hashCode += getIsConditional().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
	new org.apache.axis.description.TypeDesc(ECLSchemaItem.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSchemaItem"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("columnName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ColumnName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("columnType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ColumnType"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("columnTypeCode");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ColumnTypeCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isConditional");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "isConditional"));
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
