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
 * WUGetDependancyTreesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUGetDependancyTreesResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions;

	private org.hpccsystems.ws.wsworkunits.ECLException[] errors;

	private byte[] dependancyTrees;

	public WUGetDependancyTreesResponse() {
	}

	public WUGetDependancyTreesResponse(
			org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions,
			org.hpccsystems.ws.wsworkunits.ECLException[] errors,
			byte[] dependancyTrees) {
		this.exceptions = exceptions;
		this.errors = errors;
		this.dependancyTrees = dependancyTrees;
	}


	/**
	 * Gets the exceptions value for this WUGetDependancyTreesResponse.
	 * 
	 * @return exceptions
	 */
	public org.hpccsystems.ws.wsworkunits.ArrayOfEspException getExceptions() {
		return exceptions;
	}


	/**
	 * Sets the exceptions value for this WUGetDependancyTreesResponse.
	 * 
	 * @param exceptions
	 */
	public void setExceptions(org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions) {
		this.exceptions = exceptions;
	}


	/**
	 * Gets the errors value for this WUGetDependancyTreesResponse.
	 * 
	 * @return errors
	 */
	public org.hpccsystems.ws.wsworkunits.ECLException[] getErrors() {
		return errors;
	}


	/**
	 * Sets the errors value for this WUGetDependancyTreesResponse.
	 * 
	 * @param errors
	 */
	public void setErrors(org.hpccsystems.ws.wsworkunits.ECLException[] errors) {
		this.errors = errors;
	}


	/**
	 * Gets the dependancyTrees value for this WUGetDependancyTreesResponse.
	 * 
	 * @return dependancyTrees
	 */
	public byte[] getDependancyTrees() {
		return dependancyTrees;
	}


	/**
	 * Sets the dependancyTrees value for this WUGetDependancyTreesResponse.
	 * 
	 * @param dependancyTrees
	 */
	public void setDependancyTrees(byte[] dependancyTrees) {
		this.dependancyTrees = dependancyTrees;
	}

	private java.lang.Object __equalsCalc = null;
	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof WUGetDependancyTreesResponse)) {
			return false;
		}
		WUGetDependancyTreesResponse other = (WUGetDependancyTreesResponse) obj;
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
						((this.errors==null && other.getErrors()==null) || 
								(this.errors!=null &&
								java.util.Arrays.equals(this.errors, other.getErrors()))) &&
								((this.dependancyTrees==null && other.getDependancyTrees()==null) || 
										(this.dependancyTrees!=null &&
										java.util.Arrays.equals(this.dependancyTrees, other.getDependancyTrees())));
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
		if (getErrors() != null) {
			for (int i=0;
					i<java.lang.reflect.Array.getLength(getErrors());
					i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
				if (obj != null &&
						!obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDependancyTrees() != null) {
			for (int i=0;
					i<java.lang.reflect.Array.getLength(getDependancyTrees());
					i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getDependancyTrees(), i);
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
	new org.apache.axis.description.TypeDesc(WUGetDependancyTreesResponse.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetDependancyTreesResponse"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("exceptions");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("errors");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Errors"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLException"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLException"));
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dependancyTrees");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DependancyTrees"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
