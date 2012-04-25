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
 * Despray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class Despray  implements java.io.Serializable {
	private java.lang.String sourceLogicalName;

	private java.lang.String destIP;

	private java.lang.String destPath;

	private byte[] dstxml;

	private java.lang.Boolean overwrite;

	private java.lang.Integer maxConnections;

	private java.lang.Integer throttle;

	private java.lang.Integer transferBufferSize;

	private java.lang.String splitprefix;

	private java.lang.Boolean norecover;

	private java.lang.Boolean wrap;

	private java.lang.Boolean multiCopy;

	private java.lang.Boolean singleConnection;

	private java.lang.Boolean compress;

	private java.lang.String encrypt;

	private java.lang.String decrypt;

	public Despray() {
	}

	public Despray(
			java.lang.String sourceLogicalName,
			java.lang.String destIP,
			java.lang.String destPath,
			byte[] dstxml,
			java.lang.Boolean overwrite,
			java.lang.Integer maxConnections,
			java.lang.Integer throttle,
			java.lang.Integer transferBufferSize,
			java.lang.String splitprefix,
			java.lang.Boolean norecover,
			java.lang.Boolean wrap,
			java.lang.Boolean multiCopy,
			java.lang.Boolean singleConnection,
			java.lang.Boolean compress,
			java.lang.String encrypt,
			java.lang.String decrypt) {
		this.sourceLogicalName = sourceLogicalName;
		this.destIP = destIP;
		this.destPath = destPath;
		this.dstxml = dstxml;
		this.overwrite = overwrite;
		this.maxConnections = maxConnections;
		this.throttle = throttle;
		this.transferBufferSize = transferBufferSize;
		this.splitprefix = splitprefix;
		this.norecover = norecover;
		this.wrap = wrap;
		this.multiCopy = multiCopy;
		this.singleConnection = singleConnection;
		this.compress = compress;
		this.encrypt = encrypt;
		this.decrypt = decrypt;
	}


	/**
	 * Gets the sourceLogicalName value for this Despray.
	 * 
	 * @return sourceLogicalName
	 */
	 public java.lang.String getSourceLogicalName() {
		 return sourceLogicalName;
	 }


	/**
	 * Sets the sourceLogicalName value for this Despray.
	 * 
	 * @param sourceLogicalName
	 */
	 public void setSourceLogicalName(java.lang.String sourceLogicalName) {
		 this.sourceLogicalName = sourceLogicalName;
	 }


	 /**
	  * Gets the destIP value for this Despray.
	  * 
	  * @return destIP
	  */
	 public java.lang.String getDestIP() {
		 return destIP;
	 }


	 /**
	  * Sets the destIP value for this Despray.
	  * 
	  * @param destIP
	  */
	 public void setDestIP(java.lang.String destIP) {
		 this.destIP = destIP;
	 }


	 /**
	  * Gets the destPath value for this Despray.
	  * 
	  * @return destPath
	  */
	 public java.lang.String getDestPath() {
		 return destPath;
	 }


	 /**
	  * Sets the destPath value for this Despray.
	  * 
	  * @param destPath
	  */
	 public void setDestPath(java.lang.String destPath) {
		 this.destPath = destPath;
	 }


	 /**
	  * Gets the dstxml value for this Despray.
	  * 
	  * @return dstxml
	  */
	 public byte[] getDstxml() {
		 return dstxml;
	 }


	 /**
	  * Sets the dstxml value for this Despray.
	  * 
	  * @param dstxml
	  */
	 public void setDstxml(byte[] dstxml) {
		 this.dstxml = dstxml;
	 }


	 /**
	  * Gets the overwrite value for this Despray.
	  * 
	  * @return overwrite
	  */
	 public java.lang.Boolean getOverwrite() {
		 return overwrite;
	 }


	 /**
	  * Sets the overwrite value for this Despray.
	  * 
	  * @param overwrite
	  */
	 public void setOverwrite(java.lang.Boolean overwrite) {
		 this.overwrite = overwrite;
	 }


	 /**
	  * Gets the maxConnections value for this Despray.
	  * 
	  * @return maxConnections
	  */
	 public java.lang.Integer getMaxConnections() {
		 return maxConnections;
	 }


	 /**
	  * Sets the maxConnections value for this Despray.
	  * 
	  * @param maxConnections
	  */
	 public void setMaxConnections(java.lang.Integer maxConnections) {
		 this.maxConnections = maxConnections;
	 }


	 /**
	  * Gets the throttle value for this Despray.
	  * 
	  * @return throttle
	  */
	 public java.lang.Integer getThrottle() {
		 return throttle;
	 }


	 /**
	  * Sets the throttle value for this Despray.
	  * 
	  * @param throttle
	  */
	 public void setThrottle(java.lang.Integer throttle) {
		 this.throttle = throttle;
	 }


	 /**
	  * Gets the transferBufferSize value for this Despray.
	  * 
	  * @return transferBufferSize
	  */
	 public java.lang.Integer getTransferBufferSize() {
		 return transferBufferSize;
	 }


	 /**
	  * Sets the transferBufferSize value for this Despray.
	  * 
	  * @param transferBufferSize
	  */
	 public void setTransferBufferSize(java.lang.Integer transferBufferSize) {
		 this.transferBufferSize = transferBufferSize;
	 }


	 /**
	  * Gets the splitprefix value for this Despray.
	  * 
	  * @return splitprefix
	  */
	 public java.lang.String getSplitprefix() {
		 return splitprefix;
	 }


	 /**
	  * Sets the splitprefix value for this Despray.
	  * 
	  * @param splitprefix
	  */
	 public void setSplitprefix(java.lang.String splitprefix) {
		 this.splitprefix = splitprefix;
	 }


	 /**
	  * Gets the norecover value for this Despray.
	  * 
	  * @return norecover
	  */
	 public java.lang.Boolean getNorecover() {
		 return norecover;
	 }


	 /**
	  * Sets the norecover value for this Despray.
	  * 
	  * @param norecover
	  */
	 public void setNorecover(java.lang.Boolean norecover) {
		 this.norecover = norecover;
	 }


	 /**
	  * Gets the wrap value for this Despray.
	  * 
	  * @return wrap
	  */
	 public java.lang.Boolean getWrap() {
		 return wrap;
	 }


	 /**
	  * Sets the wrap value for this Despray.
	  * 
	  * @param wrap
	  */
	 public void setWrap(java.lang.Boolean wrap) {
		 this.wrap = wrap;
	 }


	 /**
	  * Gets the multiCopy value for this Despray.
	  * 
	  * @return multiCopy
	  */
	 public java.lang.Boolean getMultiCopy() {
		 return multiCopy;
	 }


	 /**
	  * Sets the multiCopy value for this Despray.
	  * 
	  * @param multiCopy
	  */
	 public void setMultiCopy(java.lang.Boolean multiCopy) {
		 this.multiCopy = multiCopy;
	 }


	 /**
	  * Gets the singleConnection value for this Despray.
	  * 
	  * @return singleConnection
	  */
	 public java.lang.Boolean getSingleConnection() {
		 return singleConnection;
	 }


	 /**
	  * Sets the singleConnection value for this Despray.
	  * 
	  * @param singleConnection
	  */
	 public void setSingleConnection(java.lang.Boolean singleConnection) {
		 this.singleConnection = singleConnection;
	 }


	 /**
	  * Gets the compress value for this Despray.
	  * 
	  * @return compress
	  */
	 public java.lang.Boolean getCompress() {
		 return compress;
	 }


	 /**
	  * Sets the compress value for this Despray.
	  * 
	  * @param compress
	  */
	 public void setCompress(java.lang.Boolean compress) {
		 this.compress = compress;
	 }


	 /**
	  * Gets the encrypt value for this Despray.
	  * 
	  * @return encrypt
	  */
	 public java.lang.String getEncrypt() {
		 return encrypt;
	 }


	 /**
	  * Sets the encrypt value for this Despray.
	  * 
	  * @param encrypt
	  */
	 public void setEncrypt(java.lang.String encrypt) {
		 this.encrypt = encrypt;
	 }


	 /**
	  * Gets the decrypt value for this Despray.
	  * 
	  * @return decrypt
	  */
	 public java.lang.String getDecrypt() {
		 return decrypt;
	 }


	 /**
	  * Sets the decrypt value for this Despray.
	  * 
	  * @param decrypt
	  */
	 public void setDecrypt(java.lang.String decrypt) {
		 this.decrypt = decrypt;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof Despray)) {
			return false;
		}
		 Despray other = (Despray) obj;
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
				 ((this.sourceLogicalName==null && other.getSourceLogicalName()==null) || 
						 (this.sourceLogicalName!=null &&
						 this.sourceLogicalName.equals(other.getSourceLogicalName()))) &&
						 ((this.destIP==null && other.getDestIP()==null) || 
								 (this.destIP!=null &&
								 this.destIP.equals(other.getDestIP()))) &&
								 ((this.destPath==null && other.getDestPath()==null) || 
										 (this.destPath!=null &&
										 this.destPath.equals(other.getDestPath()))) &&
										 ((this.dstxml==null && other.getDstxml()==null) || 
												 (this.dstxml!=null &&
												 java.util.Arrays.equals(this.dstxml, other.getDstxml()))) &&
												 ((this.overwrite==null && other.getOverwrite()==null) || 
														 (this.overwrite!=null &&
														 this.overwrite.equals(other.getOverwrite()))) &&
														 ((this.maxConnections==null && other.getMaxConnections()==null) || 
																 (this.maxConnections!=null &&
																 this.maxConnections.equals(other.getMaxConnections()))) &&
																 ((this.throttle==null && other.getThrottle()==null) || 
																		 (this.throttle!=null &&
																		 this.throttle.equals(other.getThrottle()))) &&
																		 ((this.transferBufferSize==null && other.getTransferBufferSize()==null) || 
																				 (this.transferBufferSize!=null &&
																				 this.transferBufferSize.equals(other.getTransferBufferSize()))) &&
																				 ((this.splitprefix==null && other.getSplitprefix()==null) || 
																						 (this.splitprefix!=null &&
																						 this.splitprefix.equals(other.getSplitprefix()))) &&
																						 ((this.norecover==null && other.getNorecover()==null) || 
																								 (this.norecover!=null &&
																								 this.norecover.equals(other.getNorecover()))) &&
																								 ((this.wrap==null && other.getWrap()==null) || 
																										 (this.wrap!=null &&
																										 this.wrap.equals(other.getWrap()))) &&
																										 ((this.multiCopy==null && other.getMultiCopy()==null) || 
																												 (this.multiCopy!=null &&
																												 this.multiCopy.equals(other.getMultiCopy()))) &&
																												 ((this.singleConnection==null && other.getSingleConnection()==null) || 
																														 (this.singleConnection!=null &&
																														 this.singleConnection.equals(other.getSingleConnection()))) &&
																														 ((this.compress==null && other.getCompress()==null) || 
																																 (this.compress!=null &&
																																 this.compress.equals(other.getCompress()))) &&
																																 ((this.encrypt==null && other.getEncrypt()==null) || 
																																		 (this.encrypt!=null &&
																																		 this.encrypt.equals(other.getEncrypt()))) &&
																																		 ((this.decrypt==null && other.getDecrypt()==null) || 
																																				 (this.decrypt!=null &&
																																				 this.decrypt.equals(other.getDecrypt())));
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
		 if (getSourceLogicalName() != null) {
			 _hashCode += getSourceLogicalName().hashCode();
		 }
		 if (getDestIP() != null) {
			 _hashCode += getDestIP().hashCode();
		 }
		 if (getDestPath() != null) {
			 _hashCode += getDestPath().hashCode();
		 }
		 if (getDstxml() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDstxml());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDstxml(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getOverwrite() != null) {
			 _hashCode += getOverwrite().hashCode();
		 }
		 if (getMaxConnections() != null) {
			 _hashCode += getMaxConnections().hashCode();
		 }
		 if (getThrottle() != null) {
			 _hashCode += getThrottle().hashCode();
		 }
		 if (getTransferBufferSize() != null) {
			 _hashCode += getTransferBufferSize().hashCode();
		 }
		 if (getSplitprefix() != null) {
			 _hashCode += getSplitprefix().hashCode();
		 }
		 if (getNorecover() != null) {
			 _hashCode += getNorecover().hashCode();
		 }
		 if (getWrap() != null) {
			 _hashCode += getWrap().hashCode();
		 }
		 if (getMultiCopy() != null) {
			 _hashCode += getMultiCopy().hashCode();
		 }
		 if (getSingleConnection() != null) {
			 _hashCode += getSingleConnection().hashCode();
		 }
		 if (getCompress() != null) {
			 _hashCode += getCompress().hashCode();
		 }
		 if (getEncrypt() != null) {
			 _hashCode += getEncrypt().hashCode();
		 }
		 if (getDecrypt() != null) {
			 _hashCode += getDecrypt().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
			 new org.apache.axis.description.TypeDesc(Despray.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">Despray"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("sourceLogicalName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceLogicalName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("destIP");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destIP"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("destPath");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destPath"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("dstxml");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "dstxml"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("overwrite");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "overwrite"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("maxConnections");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "maxConnections"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("throttle");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "throttle"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("transferBufferSize");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "transferBufferSize"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("splitprefix");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "splitprefix"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("norecover");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "norecover"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("wrap");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "wrap"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("multiCopy");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "multiCopy"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("singleConnection");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SingleConnection"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("compress");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "compress"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("encrypt");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "encrypt"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("decrypt");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "decrypt"));
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
