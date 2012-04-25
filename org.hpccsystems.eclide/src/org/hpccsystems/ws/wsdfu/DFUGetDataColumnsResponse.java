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
 * DFUGetDataColumnsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class DFUGetDataColumnsResponse  implements java.io.Serializable {
	private org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions;

	private java.lang.String logicalName;

	private java.lang.Long startIndex;

	private java.lang.Long endIndex;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns1;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns2;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns3;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns4;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns5;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns6;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns7;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns8;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns9;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns10;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns11;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns12;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns13;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns14;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns15;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns16;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns17;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns18;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns19;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns20;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns1;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns2;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns3;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns4;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns5;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns6;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns7;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns8;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns9;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns10;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns11;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns12;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns13;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns14;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns15;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns16;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns17;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns18;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns19;

	private org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns20;

	private java.lang.Long rowCount;

	private java.lang.String showColumns;

	private java.lang.Integer chooseFile;

	private java.lang.String cluster;

	private java.lang.String clusterType;

	public DFUGetDataColumnsResponse() {
	}

	public DFUGetDataColumnsResponse(
			org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions,
			java.lang.String logicalName,
			java.lang.Long startIndex,
			java.lang.Long endIndex,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns1,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns2,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns3,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns4,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns5,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns6,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns7,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns8,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns9,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns10,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns11,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns12,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns13,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns14,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns15,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns16,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns17,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns18,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns19,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns20,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns1,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns2,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns3,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns4,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns5,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns6,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns7,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns8,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns9,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns10,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns11,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns12,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns13,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns14,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns15,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns16,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns17,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns18,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns19,
			org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns20,
			java.lang.Long rowCount,
			java.lang.String showColumns,
			java.lang.Integer chooseFile,
			java.lang.String cluster,
			java.lang.String clusterType) {
		this.exceptions = exceptions;
		this.logicalName = logicalName;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.DFUDataKeyedColumns1 = DFUDataKeyedColumns1;
		this.DFUDataKeyedColumns2 = DFUDataKeyedColumns2;
		this.DFUDataKeyedColumns3 = DFUDataKeyedColumns3;
		this.DFUDataKeyedColumns4 = DFUDataKeyedColumns4;
		this.DFUDataKeyedColumns5 = DFUDataKeyedColumns5;
		this.DFUDataKeyedColumns6 = DFUDataKeyedColumns6;
		this.DFUDataKeyedColumns7 = DFUDataKeyedColumns7;
		this.DFUDataKeyedColumns8 = DFUDataKeyedColumns8;
		this.DFUDataKeyedColumns9 = DFUDataKeyedColumns9;
		this.DFUDataKeyedColumns10 = DFUDataKeyedColumns10;
		this.DFUDataKeyedColumns11 = DFUDataKeyedColumns11;
		this.DFUDataKeyedColumns12 = DFUDataKeyedColumns12;
		this.DFUDataKeyedColumns13 = DFUDataKeyedColumns13;
		this.DFUDataKeyedColumns14 = DFUDataKeyedColumns14;
		this.DFUDataKeyedColumns15 = DFUDataKeyedColumns15;
		this.DFUDataKeyedColumns16 = DFUDataKeyedColumns16;
		this.DFUDataKeyedColumns17 = DFUDataKeyedColumns17;
		this.DFUDataKeyedColumns18 = DFUDataKeyedColumns18;
		this.DFUDataKeyedColumns19 = DFUDataKeyedColumns19;
		this.DFUDataKeyedColumns20 = DFUDataKeyedColumns20;
		this.DFUDataNonKeyedColumns1 = DFUDataNonKeyedColumns1;
		this.DFUDataNonKeyedColumns2 = DFUDataNonKeyedColumns2;
		this.DFUDataNonKeyedColumns3 = DFUDataNonKeyedColumns3;
		this.DFUDataNonKeyedColumns4 = DFUDataNonKeyedColumns4;
		this.DFUDataNonKeyedColumns5 = DFUDataNonKeyedColumns5;
		this.DFUDataNonKeyedColumns6 = DFUDataNonKeyedColumns6;
		this.DFUDataNonKeyedColumns7 = DFUDataNonKeyedColumns7;
		this.DFUDataNonKeyedColumns8 = DFUDataNonKeyedColumns8;
		this.DFUDataNonKeyedColumns9 = DFUDataNonKeyedColumns9;
		this.DFUDataNonKeyedColumns10 = DFUDataNonKeyedColumns10;
		this.DFUDataNonKeyedColumns11 = DFUDataNonKeyedColumns11;
		this.DFUDataNonKeyedColumns12 = DFUDataNonKeyedColumns12;
		this.DFUDataNonKeyedColumns13 = DFUDataNonKeyedColumns13;
		this.DFUDataNonKeyedColumns14 = DFUDataNonKeyedColumns14;
		this.DFUDataNonKeyedColumns15 = DFUDataNonKeyedColumns15;
		this.DFUDataNonKeyedColumns16 = DFUDataNonKeyedColumns16;
		this.DFUDataNonKeyedColumns17 = DFUDataNonKeyedColumns17;
		this.DFUDataNonKeyedColumns18 = DFUDataNonKeyedColumns18;
		this.DFUDataNonKeyedColumns19 = DFUDataNonKeyedColumns19;
		this.DFUDataNonKeyedColumns20 = DFUDataNonKeyedColumns20;
		this.rowCount = rowCount;
		this.showColumns = showColumns;
		this.chooseFile = chooseFile;
		this.cluster = cluster;
		this.clusterType = clusterType;
	}


	/**
	 * Gets the exceptions value for this DFUGetDataColumnsResponse.
	 * 
	 * @return exceptions
	 */
	 public org.hpccsystems.ws.wsdfu.ArrayOfEspException getExceptions() {
		 return exceptions;
	 }


	/**
	 * Sets the exceptions value for this DFUGetDataColumnsResponse.
	 * 
	 * @param exceptions
	 */
	 public void setExceptions(org.hpccsystems.ws.wsdfu.ArrayOfEspException exceptions) {
		 this.exceptions = exceptions;
	 }


	/**
	 * Gets the logicalName value for this DFUGetDataColumnsResponse.
	 * 
	 * @return logicalName
	 */
	 public java.lang.String getLogicalName() {
		 return logicalName;
	 }


	/**
	 * Sets the logicalName value for this DFUGetDataColumnsResponse.
	 * 
	 * @param logicalName
	 */
	 public void setLogicalName(java.lang.String logicalName) {
		 this.logicalName = logicalName;
	 }


	/**
	 * Gets the startIndex value for this DFUGetDataColumnsResponse.
	 * 
	 * @return startIndex
	 */
	 public java.lang.Long getStartIndex() {
		 return startIndex;
	 }


	 /**
	  * Sets the startIndex value for this DFUGetDataColumnsResponse.
	  * 
	  * @param startIndex
	  */
	 public void setStartIndex(java.lang.Long startIndex) {
		 this.startIndex = startIndex;
	 }


	 /**
	  * Gets the endIndex value for this DFUGetDataColumnsResponse.
	  * 
	  * @return endIndex
	  */
	 public java.lang.Long getEndIndex() {
		 return endIndex;
	 }


	 /**
	  * Sets the endIndex value for this DFUGetDataColumnsResponse.
	  * 
	  * @param endIndex
	  */
	 public void setEndIndex(java.lang.Long endIndex) {
		 this.endIndex = endIndex;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns1 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns1
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns1() {
		 return DFUDataKeyedColumns1;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns1 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns1
	  */
	 public void setDFUDataKeyedColumns1(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns1) {
		 this.DFUDataKeyedColumns1 = DFUDataKeyedColumns1;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns2 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns2
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns2() {
		 return DFUDataKeyedColumns2;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns2 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns2
	  */
	 public void setDFUDataKeyedColumns2(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns2) {
		 this.DFUDataKeyedColumns2 = DFUDataKeyedColumns2;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns3 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns3
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns3() {
		 return DFUDataKeyedColumns3;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns3 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns3
	  */
	 public void setDFUDataKeyedColumns3(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns3) {
		 this.DFUDataKeyedColumns3 = DFUDataKeyedColumns3;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns4 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns4
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns4() {
		 return DFUDataKeyedColumns4;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns4 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns4
	  */
	 public void setDFUDataKeyedColumns4(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns4) {
		 this.DFUDataKeyedColumns4 = DFUDataKeyedColumns4;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns5 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns5
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns5() {
		 return DFUDataKeyedColumns5;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns5 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns5
	  */
	 public void setDFUDataKeyedColumns5(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns5) {
		 this.DFUDataKeyedColumns5 = DFUDataKeyedColumns5;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns6 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns6
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns6() {
		 return DFUDataKeyedColumns6;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns6 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns6
	  */
	 public void setDFUDataKeyedColumns6(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns6) {
		 this.DFUDataKeyedColumns6 = DFUDataKeyedColumns6;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns7 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns7
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns7() {
		 return DFUDataKeyedColumns7;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns7 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns7
	  */
	 public void setDFUDataKeyedColumns7(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns7) {
		 this.DFUDataKeyedColumns7 = DFUDataKeyedColumns7;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns8 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns8
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns8() {
		 return DFUDataKeyedColumns8;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns8 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns8
	  */
	 public void setDFUDataKeyedColumns8(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns8) {
		 this.DFUDataKeyedColumns8 = DFUDataKeyedColumns8;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns9 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns9
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns9() {
		 return DFUDataKeyedColumns9;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns9 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns9
	  */
	 public void setDFUDataKeyedColumns9(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns9) {
		 this.DFUDataKeyedColumns9 = DFUDataKeyedColumns9;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns10 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns10
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns10() {
		 return DFUDataKeyedColumns10;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns10 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns10
	  */
	 public void setDFUDataKeyedColumns10(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns10) {
		 this.DFUDataKeyedColumns10 = DFUDataKeyedColumns10;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns11 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns11
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns11() {
		 return DFUDataKeyedColumns11;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns11 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns11
	  */
	 public void setDFUDataKeyedColumns11(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns11) {
		 this.DFUDataKeyedColumns11 = DFUDataKeyedColumns11;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns12 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns12
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns12() {
		 return DFUDataKeyedColumns12;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns12 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns12
	  */
	 public void setDFUDataKeyedColumns12(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns12) {
		 this.DFUDataKeyedColumns12 = DFUDataKeyedColumns12;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns13 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns13
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns13() {
		 return DFUDataKeyedColumns13;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns13 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns13
	  */
	 public void setDFUDataKeyedColumns13(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns13) {
		 this.DFUDataKeyedColumns13 = DFUDataKeyedColumns13;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns14 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns14
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns14() {
		 return DFUDataKeyedColumns14;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns14 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns14
	  */
	 public void setDFUDataKeyedColumns14(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns14) {
		 this.DFUDataKeyedColumns14 = DFUDataKeyedColumns14;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns15 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns15
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns15() {
		 return DFUDataKeyedColumns15;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns15 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns15
	  */
	 public void setDFUDataKeyedColumns15(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns15) {
		 this.DFUDataKeyedColumns15 = DFUDataKeyedColumns15;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns16 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns16
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns16() {
		 return DFUDataKeyedColumns16;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns16 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns16
	  */
	 public void setDFUDataKeyedColumns16(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns16) {
		 this.DFUDataKeyedColumns16 = DFUDataKeyedColumns16;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns17 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns17
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns17() {
		 return DFUDataKeyedColumns17;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns17 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns17
	  */
	 public void setDFUDataKeyedColumns17(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns17) {
		 this.DFUDataKeyedColumns17 = DFUDataKeyedColumns17;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns18 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns18
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns18() {
		 return DFUDataKeyedColumns18;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns18 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns18
	  */
	 public void setDFUDataKeyedColumns18(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns18) {
		 this.DFUDataKeyedColumns18 = DFUDataKeyedColumns18;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns19 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns19
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns19() {
		 return DFUDataKeyedColumns19;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns19 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns19
	  */
	 public void setDFUDataKeyedColumns19(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns19) {
		 this.DFUDataKeyedColumns19 = DFUDataKeyedColumns19;
	 }


	 /**
	  * Gets the DFUDataKeyedColumns20 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataKeyedColumns20
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataKeyedColumns20() {
		 return DFUDataKeyedColumns20;
	 }


	 /**
	  * Sets the DFUDataKeyedColumns20 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataKeyedColumns20
	  */
	 public void setDFUDataKeyedColumns20(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataKeyedColumns20) {
		 this.DFUDataKeyedColumns20 = DFUDataKeyedColumns20;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns1 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns1
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns1() {
		 return DFUDataNonKeyedColumns1;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns1 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns1
	  */
	 public void setDFUDataNonKeyedColumns1(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns1) {
		 this.DFUDataNonKeyedColumns1 = DFUDataNonKeyedColumns1;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns2 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns2
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns2() {
		 return DFUDataNonKeyedColumns2;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns2 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns2
	  */
	 public void setDFUDataNonKeyedColumns2(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns2) {
		 this.DFUDataNonKeyedColumns2 = DFUDataNonKeyedColumns2;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns3 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns3
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns3() {
		 return DFUDataNonKeyedColumns3;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns3 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns3
	  */
	 public void setDFUDataNonKeyedColumns3(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns3) {
		 this.DFUDataNonKeyedColumns3 = DFUDataNonKeyedColumns3;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns4 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns4
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns4() {
		 return DFUDataNonKeyedColumns4;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns4 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns4
	  */
	 public void setDFUDataNonKeyedColumns4(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns4) {
		 this.DFUDataNonKeyedColumns4 = DFUDataNonKeyedColumns4;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns5 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns5
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns5() {
		 return DFUDataNonKeyedColumns5;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns5 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns5
	  */
	 public void setDFUDataNonKeyedColumns5(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns5) {
		 this.DFUDataNonKeyedColumns5 = DFUDataNonKeyedColumns5;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns6 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns6
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns6() {
		 return DFUDataNonKeyedColumns6;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns6 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns6
	  */
	 public void setDFUDataNonKeyedColumns6(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns6) {
		 this.DFUDataNonKeyedColumns6 = DFUDataNonKeyedColumns6;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns7 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns7
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns7() {
		 return DFUDataNonKeyedColumns7;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns7 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns7
	  */
	 public void setDFUDataNonKeyedColumns7(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns7) {
		 this.DFUDataNonKeyedColumns7 = DFUDataNonKeyedColumns7;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns8 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns8
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns8() {
		 return DFUDataNonKeyedColumns8;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns8 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns8
	  */
	 public void setDFUDataNonKeyedColumns8(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns8) {
		 this.DFUDataNonKeyedColumns8 = DFUDataNonKeyedColumns8;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns9 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns9
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns9() {
		 return DFUDataNonKeyedColumns9;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns9 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns9
	  */
	 public void setDFUDataNonKeyedColumns9(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns9) {
		 this.DFUDataNonKeyedColumns9 = DFUDataNonKeyedColumns9;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns10 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns10
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns10() {
		 return DFUDataNonKeyedColumns10;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns10 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns10
	  */
	 public void setDFUDataNonKeyedColumns10(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns10) {
		 this.DFUDataNonKeyedColumns10 = DFUDataNonKeyedColumns10;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns11 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns11
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns11() {
		 return DFUDataNonKeyedColumns11;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns11 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns11
	  */
	 public void setDFUDataNonKeyedColumns11(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns11) {
		 this.DFUDataNonKeyedColumns11 = DFUDataNonKeyedColumns11;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns12 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns12
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns12() {
		 return DFUDataNonKeyedColumns12;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns12 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns12
	  */
	 public void setDFUDataNonKeyedColumns12(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns12) {
		 this.DFUDataNonKeyedColumns12 = DFUDataNonKeyedColumns12;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns13 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns13
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns13() {
		 return DFUDataNonKeyedColumns13;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns13 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns13
	  */
	 public void setDFUDataNonKeyedColumns13(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns13) {
		 this.DFUDataNonKeyedColumns13 = DFUDataNonKeyedColumns13;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns14 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns14
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns14() {
		 return DFUDataNonKeyedColumns14;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns14 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns14
	  */
	 public void setDFUDataNonKeyedColumns14(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns14) {
		 this.DFUDataNonKeyedColumns14 = DFUDataNonKeyedColumns14;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns15 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns15
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns15() {
		 return DFUDataNonKeyedColumns15;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns15 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns15
	  */
	 public void setDFUDataNonKeyedColumns15(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns15) {
		 this.DFUDataNonKeyedColumns15 = DFUDataNonKeyedColumns15;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns16 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns16
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns16() {
		 return DFUDataNonKeyedColumns16;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns16 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns16
	  */
	 public void setDFUDataNonKeyedColumns16(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns16) {
		 this.DFUDataNonKeyedColumns16 = DFUDataNonKeyedColumns16;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns17 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns17
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns17() {
		 return DFUDataNonKeyedColumns17;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns17 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns17
	  */
	 public void setDFUDataNonKeyedColumns17(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns17) {
		 this.DFUDataNonKeyedColumns17 = DFUDataNonKeyedColumns17;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns18 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns18
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns18() {
		 return DFUDataNonKeyedColumns18;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns18 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns18
	  */
	 public void setDFUDataNonKeyedColumns18(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns18) {
		 this.DFUDataNonKeyedColumns18 = DFUDataNonKeyedColumns18;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns19 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns19
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns19() {
		 return DFUDataNonKeyedColumns19;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns19 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns19
	  */
	 public void setDFUDataNonKeyedColumns19(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns19) {
		 this.DFUDataNonKeyedColumns19 = DFUDataNonKeyedColumns19;
	 }


	 /**
	  * Gets the DFUDataNonKeyedColumns20 value for this DFUGetDataColumnsResponse.
	  * 
	  * @return DFUDataNonKeyedColumns20
	  */
	 public org.hpccsystems.ws.wsdfu.DFUDataColumn[] getDFUDataNonKeyedColumns20() {
		 return DFUDataNonKeyedColumns20;
	 }


	 /**
	  * Sets the DFUDataNonKeyedColumns20 value for this DFUGetDataColumnsResponse.
	  * 
	  * @param DFUDataNonKeyedColumns20
	  */
	 public void setDFUDataNonKeyedColumns20(org.hpccsystems.ws.wsdfu.DFUDataColumn[] DFUDataNonKeyedColumns20) {
		 this.DFUDataNonKeyedColumns20 = DFUDataNonKeyedColumns20;
	 }


	 /**
	  * Gets the rowCount value for this DFUGetDataColumnsResponse.
	  * 
	  * @return rowCount
	  */
	 public java.lang.Long getRowCount() {
		 return rowCount;
	 }


	 /**
	  * Sets the rowCount value for this DFUGetDataColumnsResponse.
	  * 
	  * @param rowCount
	  */
	 public void setRowCount(java.lang.Long rowCount) {
		 this.rowCount = rowCount;
	 }


	 /**
	  * Gets the showColumns value for this DFUGetDataColumnsResponse.
	  * 
	  * @return showColumns
	  */
	 public java.lang.String getShowColumns() {
		 return showColumns;
	 }


	 /**
	  * Sets the showColumns value for this DFUGetDataColumnsResponse.
	  * 
	  * @param showColumns
	  */
	 public void setShowColumns(java.lang.String showColumns) {
		 this.showColumns = showColumns;
	 }


	 /**
	  * Gets the chooseFile value for this DFUGetDataColumnsResponse.
	  * 
	  * @return chooseFile
	  */
	 public java.lang.Integer getChooseFile() {
		 return chooseFile;
	 }


	 /**
	  * Sets the chooseFile value for this DFUGetDataColumnsResponse.
	  * 
	  * @param chooseFile
	  */
	 public void setChooseFile(java.lang.Integer chooseFile) {
		 this.chooseFile = chooseFile;
	 }


	 /**
	  * Gets the cluster value for this DFUGetDataColumnsResponse.
	  * 
	  * @return cluster
	  */
	 public java.lang.String getCluster() {
		 return cluster;
	 }


	 /**
	  * Sets the cluster value for this DFUGetDataColumnsResponse.
	  * 
	  * @param cluster
	  */
	 public void setCluster(java.lang.String cluster) {
		 this.cluster = cluster;
	 }


	 /**
	  * Gets the clusterType value for this DFUGetDataColumnsResponse.
	  * 
	  * @return clusterType
	  */
	 public java.lang.String getClusterType() {
		 return clusterType;
	 }


	 /**
	  * Sets the clusterType value for this DFUGetDataColumnsResponse.
	  * 
	  * @param clusterType
	  */
	 public void setClusterType(java.lang.String clusterType) {
		 this.clusterType = clusterType;
	 }

	 private java.lang.Object __equalsCalc = null;
	 @Override
	 public synchronized boolean equals(java.lang.Object obj) {
		 if (!(obj instanceof DFUGetDataColumnsResponse)) {
			return false;
		}
		 DFUGetDataColumnsResponse other = (DFUGetDataColumnsResponse) obj;
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
						 ((this.logicalName==null && other.getLogicalName()==null) || 
								 (this.logicalName!=null &&
								 this.logicalName.equals(other.getLogicalName()))) &&
								 ((this.startIndex==null && other.getStartIndex()==null) || 
										 (this.startIndex!=null &&
										 this.startIndex.equals(other.getStartIndex()))) &&
										 ((this.endIndex==null && other.getEndIndex()==null) || 
												 (this.endIndex!=null &&
												 this.endIndex.equals(other.getEndIndex()))) &&
												 ((this.DFUDataKeyedColumns1==null && other.getDFUDataKeyedColumns1()==null) || 
														 (this.DFUDataKeyedColumns1!=null &&
														 java.util.Arrays.equals(this.DFUDataKeyedColumns1, other.getDFUDataKeyedColumns1()))) &&
														 ((this.DFUDataKeyedColumns2==null && other.getDFUDataKeyedColumns2()==null) || 
																 (this.DFUDataKeyedColumns2!=null &&
																 java.util.Arrays.equals(this.DFUDataKeyedColumns2, other.getDFUDataKeyedColumns2()))) &&
																 ((this.DFUDataKeyedColumns3==null && other.getDFUDataKeyedColumns3()==null) || 
																		 (this.DFUDataKeyedColumns3!=null &&
																		 java.util.Arrays.equals(this.DFUDataKeyedColumns3, other.getDFUDataKeyedColumns3()))) &&
																		 ((this.DFUDataKeyedColumns4==null && other.getDFUDataKeyedColumns4()==null) || 
																				 (this.DFUDataKeyedColumns4!=null &&
																				 java.util.Arrays.equals(this.DFUDataKeyedColumns4, other.getDFUDataKeyedColumns4()))) &&
																				 ((this.DFUDataKeyedColumns5==null && other.getDFUDataKeyedColumns5()==null) || 
																						 (this.DFUDataKeyedColumns5!=null &&
																						 java.util.Arrays.equals(this.DFUDataKeyedColumns5, other.getDFUDataKeyedColumns5()))) &&
																						 ((this.DFUDataKeyedColumns6==null && other.getDFUDataKeyedColumns6()==null) || 
																								 (this.DFUDataKeyedColumns6!=null &&
																								 java.util.Arrays.equals(this.DFUDataKeyedColumns6, other.getDFUDataKeyedColumns6()))) &&
																								 ((this.DFUDataKeyedColumns7==null && other.getDFUDataKeyedColumns7()==null) || 
																										 (this.DFUDataKeyedColumns7!=null &&
																										 java.util.Arrays.equals(this.DFUDataKeyedColumns7, other.getDFUDataKeyedColumns7()))) &&
																										 ((this.DFUDataKeyedColumns8==null && other.getDFUDataKeyedColumns8()==null) || 
																												 (this.DFUDataKeyedColumns8!=null &&
																												 java.util.Arrays.equals(this.DFUDataKeyedColumns8, other.getDFUDataKeyedColumns8()))) &&
																												 ((this.DFUDataKeyedColumns9==null && other.getDFUDataKeyedColumns9()==null) || 
																														 (this.DFUDataKeyedColumns9!=null &&
																														 java.util.Arrays.equals(this.DFUDataKeyedColumns9, other.getDFUDataKeyedColumns9()))) &&
																														 ((this.DFUDataKeyedColumns10==null && other.getDFUDataKeyedColumns10()==null) || 
																																 (this.DFUDataKeyedColumns10!=null &&
																																 java.util.Arrays.equals(this.DFUDataKeyedColumns10, other.getDFUDataKeyedColumns10()))) &&
																																 ((this.DFUDataKeyedColumns11==null && other.getDFUDataKeyedColumns11()==null) || 
																																		 (this.DFUDataKeyedColumns11!=null &&
																																		 java.util.Arrays.equals(this.DFUDataKeyedColumns11, other.getDFUDataKeyedColumns11()))) &&
																																		 ((this.DFUDataKeyedColumns12==null && other.getDFUDataKeyedColumns12()==null) || 
																																				 (this.DFUDataKeyedColumns12!=null &&
																																				 java.util.Arrays.equals(this.DFUDataKeyedColumns12, other.getDFUDataKeyedColumns12()))) &&
																																				 ((this.DFUDataKeyedColumns13==null && other.getDFUDataKeyedColumns13()==null) || 
																																						 (this.DFUDataKeyedColumns13!=null &&
																																						 java.util.Arrays.equals(this.DFUDataKeyedColumns13, other.getDFUDataKeyedColumns13()))) &&
																																						 ((this.DFUDataKeyedColumns14==null && other.getDFUDataKeyedColumns14()==null) || 
																																								 (this.DFUDataKeyedColumns14!=null &&
																																								 java.util.Arrays.equals(this.DFUDataKeyedColumns14, other.getDFUDataKeyedColumns14()))) &&
																																								 ((this.DFUDataKeyedColumns15==null && other.getDFUDataKeyedColumns15()==null) || 
																																										 (this.DFUDataKeyedColumns15!=null &&
																																										 java.util.Arrays.equals(this.DFUDataKeyedColumns15, other.getDFUDataKeyedColumns15()))) &&
																																										 ((this.DFUDataKeyedColumns16==null && other.getDFUDataKeyedColumns16()==null) || 
																																												 (this.DFUDataKeyedColumns16!=null &&
																																												 java.util.Arrays.equals(this.DFUDataKeyedColumns16, other.getDFUDataKeyedColumns16()))) &&
																																												 ((this.DFUDataKeyedColumns17==null && other.getDFUDataKeyedColumns17()==null) || 
																																														 (this.DFUDataKeyedColumns17!=null &&
																																														 java.util.Arrays.equals(this.DFUDataKeyedColumns17, other.getDFUDataKeyedColumns17()))) &&
																																														 ((this.DFUDataKeyedColumns18==null && other.getDFUDataKeyedColumns18()==null) || 
																																																 (this.DFUDataKeyedColumns18!=null &&
																																																 java.util.Arrays.equals(this.DFUDataKeyedColumns18, other.getDFUDataKeyedColumns18()))) &&
																																																 ((this.DFUDataKeyedColumns19==null && other.getDFUDataKeyedColumns19()==null) || 
																																																		 (this.DFUDataKeyedColumns19!=null &&
																																																		 java.util.Arrays.equals(this.DFUDataKeyedColumns19, other.getDFUDataKeyedColumns19()))) &&
																																																		 ((this.DFUDataKeyedColumns20==null && other.getDFUDataKeyedColumns20()==null) || 
																																																				 (this.DFUDataKeyedColumns20!=null &&
																																																				 java.util.Arrays.equals(this.DFUDataKeyedColumns20, other.getDFUDataKeyedColumns20()))) &&
																																																				 ((this.DFUDataNonKeyedColumns1==null && other.getDFUDataNonKeyedColumns1()==null) || 
																																																						 (this.DFUDataNonKeyedColumns1!=null &&
																																																						 java.util.Arrays.equals(this.DFUDataNonKeyedColumns1, other.getDFUDataNonKeyedColumns1()))) &&
																																																						 ((this.DFUDataNonKeyedColumns2==null && other.getDFUDataNonKeyedColumns2()==null) || 
																																																								 (this.DFUDataNonKeyedColumns2!=null &&
																																																								 java.util.Arrays.equals(this.DFUDataNonKeyedColumns2, other.getDFUDataNonKeyedColumns2()))) &&
																																																								 ((this.DFUDataNonKeyedColumns3==null && other.getDFUDataNonKeyedColumns3()==null) || 
																																																										 (this.DFUDataNonKeyedColumns3!=null &&
																																																										 java.util.Arrays.equals(this.DFUDataNonKeyedColumns3, other.getDFUDataNonKeyedColumns3()))) &&
																																																										 ((this.DFUDataNonKeyedColumns4==null && other.getDFUDataNonKeyedColumns4()==null) || 
																																																												 (this.DFUDataNonKeyedColumns4!=null &&
																																																												 java.util.Arrays.equals(this.DFUDataNonKeyedColumns4, other.getDFUDataNonKeyedColumns4()))) &&
																																																												 ((this.DFUDataNonKeyedColumns5==null && other.getDFUDataNonKeyedColumns5()==null) || 
																																																														 (this.DFUDataNonKeyedColumns5!=null &&
																																																														 java.util.Arrays.equals(this.DFUDataNonKeyedColumns5, other.getDFUDataNonKeyedColumns5()))) &&
																																																														 ((this.DFUDataNonKeyedColumns6==null && other.getDFUDataNonKeyedColumns6()==null) || 
																																																																 (this.DFUDataNonKeyedColumns6!=null &&
																																																																 java.util.Arrays.equals(this.DFUDataNonKeyedColumns6, other.getDFUDataNonKeyedColumns6()))) &&
																																																																 ((this.DFUDataNonKeyedColumns7==null && other.getDFUDataNonKeyedColumns7()==null) || 
																																																																		 (this.DFUDataNonKeyedColumns7!=null &&
																																																																		 java.util.Arrays.equals(this.DFUDataNonKeyedColumns7, other.getDFUDataNonKeyedColumns7()))) &&
																																																																		 ((this.DFUDataNonKeyedColumns8==null && other.getDFUDataNonKeyedColumns8()==null) || 
																																																																				 (this.DFUDataNonKeyedColumns8!=null &&
																																																																				 java.util.Arrays.equals(this.DFUDataNonKeyedColumns8, other.getDFUDataNonKeyedColumns8()))) &&
																																																																				 ((this.DFUDataNonKeyedColumns9==null && other.getDFUDataNonKeyedColumns9()==null) || 
																																																																						 (this.DFUDataNonKeyedColumns9!=null &&
																																																																						 java.util.Arrays.equals(this.DFUDataNonKeyedColumns9, other.getDFUDataNonKeyedColumns9()))) &&
																																																																						 ((this.DFUDataNonKeyedColumns10==null && other.getDFUDataNonKeyedColumns10()==null) || 
																																																																								 (this.DFUDataNonKeyedColumns10!=null &&
																																																																								 java.util.Arrays.equals(this.DFUDataNonKeyedColumns10, other.getDFUDataNonKeyedColumns10()))) &&
																																																																								 ((this.DFUDataNonKeyedColumns11==null && other.getDFUDataNonKeyedColumns11()==null) || 
																																																																										 (this.DFUDataNonKeyedColumns11!=null &&
																																																																										 java.util.Arrays.equals(this.DFUDataNonKeyedColumns11, other.getDFUDataNonKeyedColumns11()))) &&
																																																																										 ((this.DFUDataNonKeyedColumns12==null && other.getDFUDataNonKeyedColumns12()==null) || 
																																																																												 (this.DFUDataNonKeyedColumns12!=null &&
																																																																												 java.util.Arrays.equals(this.DFUDataNonKeyedColumns12, other.getDFUDataNonKeyedColumns12()))) &&
																																																																												 ((this.DFUDataNonKeyedColumns13==null && other.getDFUDataNonKeyedColumns13()==null) || 
																																																																														 (this.DFUDataNonKeyedColumns13!=null &&
																																																																														 java.util.Arrays.equals(this.DFUDataNonKeyedColumns13, other.getDFUDataNonKeyedColumns13()))) &&
																																																																														 ((this.DFUDataNonKeyedColumns14==null && other.getDFUDataNonKeyedColumns14()==null) || 
																																																																																 (this.DFUDataNonKeyedColumns14!=null &&
																																																																																 java.util.Arrays.equals(this.DFUDataNonKeyedColumns14, other.getDFUDataNonKeyedColumns14()))) &&
																																																																																 ((this.DFUDataNonKeyedColumns15==null && other.getDFUDataNonKeyedColumns15()==null) || 
																																																																																		 (this.DFUDataNonKeyedColumns15!=null &&
																																																																																		 java.util.Arrays.equals(this.DFUDataNonKeyedColumns15, other.getDFUDataNonKeyedColumns15()))) &&
																																																																																		 ((this.DFUDataNonKeyedColumns16==null && other.getDFUDataNonKeyedColumns16()==null) || 
																																																																																				 (this.DFUDataNonKeyedColumns16!=null &&
																																																																																				 java.util.Arrays.equals(this.DFUDataNonKeyedColumns16, other.getDFUDataNonKeyedColumns16()))) &&
																																																																																				 ((this.DFUDataNonKeyedColumns17==null && other.getDFUDataNonKeyedColumns17()==null) || 
																																																																																						 (this.DFUDataNonKeyedColumns17!=null &&
																																																																																						 java.util.Arrays.equals(this.DFUDataNonKeyedColumns17, other.getDFUDataNonKeyedColumns17()))) &&
																																																																																						 ((this.DFUDataNonKeyedColumns18==null && other.getDFUDataNonKeyedColumns18()==null) || 
																																																																																								 (this.DFUDataNonKeyedColumns18!=null &&
																																																																																								 java.util.Arrays.equals(this.DFUDataNonKeyedColumns18, other.getDFUDataNonKeyedColumns18()))) &&
																																																																																								 ((this.DFUDataNonKeyedColumns19==null && other.getDFUDataNonKeyedColumns19()==null) || 
																																																																																										 (this.DFUDataNonKeyedColumns19!=null &&
																																																																																										 java.util.Arrays.equals(this.DFUDataNonKeyedColumns19, other.getDFUDataNonKeyedColumns19()))) &&
																																																																																										 ((this.DFUDataNonKeyedColumns20==null && other.getDFUDataNonKeyedColumns20()==null) || 
																																																																																												 (this.DFUDataNonKeyedColumns20!=null &&
																																																																																												 java.util.Arrays.equals(this.DFUDataNonKeyedColumns20, other.getDFUDataNonKeyedColumns20()))) &&
																																																																																												 ((this.rowCount==null && other.getRowCount()==null) || 
																																																																																														 (this.rowCount!=null &&
																																																																																														 this.rowCount.equals(other.getRowCount()))) &&
																																																																																														 ((this.showColumns==null && other.getShowColumns()==null) || 
																																																																																																 (this.showColumns!=null &&
																																																																																																 this.showColumns.equals(other.getShowColumns()))) &&
																																																																																																 ((this.chooseFile==null && other.getChooseFile()==null) || 
																																																																																																		 (this.chooseFile!=null &&
																																																																																																		 this.chooseFile.equals(other.getChooseFile()))) &&
																																																																																																		 ((this.cluster==null && other.getCluster()==null) || 
																																																																																																				 (this.cluster!=null &&
																																																																																																				 this.cluster.equals(other.getCluster()))) &&
																																																																																																				 ((this.clusterType==null && other.getClusterType()==null) || 
																																																																																																						 (this.clusterType!=null &&
																																																																																																						 this.clusterType.equals(other.getClusterType())));
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
		 if (getLogicalName() != null) {
			 _hashCode += getLogicalName().hashCode();
		 }
		 if (getStartIndex() != null) {
			 _hashCode += getStartIndex().hashCode();
		 }
		 if (getEndIndex() != null) {
			 _hashCode += getEndIndex().hashCode();
		 }
		 if (getDFUDataKeyedColumns1() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns1());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns1(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns2() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns2());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns2(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns3() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns3());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns3(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns4() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns4());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns4(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns5() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns5());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns5(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns6() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns6());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns6(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns7() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns7());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns7(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns8() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns8());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns8(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns9() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns9());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns9(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns10() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns10());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns10(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns11() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns11());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns11(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns12() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns12());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns12(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns13() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns13());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns13(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns14() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns14());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns14(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns15() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns15());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns15(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns16() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns16());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns16(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns17() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns17());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns17(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns18() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns18());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns18(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns19() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns19());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns19(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataKeyedColumns20() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataKeyedColumns20());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataKeyedColumns20(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns1() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns1());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns1(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns2() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns2());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns2(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns3() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns3());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns3(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns4() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns4());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns4(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns5() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns5());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns5(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns6() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns6());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns6(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns7() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns7());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns7(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns8() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns8());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns8(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns9() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns9());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns9(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns10() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns10());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns10(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns11() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns11());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns11(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns12() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns12());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns12(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns13() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns13());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns13(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns14() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns14());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns14(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns15() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns15());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns15(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns16() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns16());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns16(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns17() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns17());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns17(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns18() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns18());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns18(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns19() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns19());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns19(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getDFUDataNonKeyedColumns20() != null) {
			 for (int i=0;
					 i<java.lang.reflect.Array.getLength(getDFUDataNonKeyedColumns20());
					 i++) {
				 java.lang.Object obj = java.lang.reflect.Array.get(getDFUDataNonKeyedColumns20(), i);
				 if (obj != null &&
						 !obj.getClass().isArray()) {
					 _hashCode += obj.hashCode();
				 }
			 }
		 }
		 if (getRowCount() != null) {
			 _hashCode += getRowCount().hashCode();
		 }
		 if (getShowColumns() != null) {
			 _hashCode += getShowColumns().hashCode();
		 }
		 if (getChooseFile() != null) {
			 _hashCode += getChooseFile().hashCode();
		 }
		 if (getCluster() != null) {
			 _hashCode += getCluster().hashCode();
		 }
		 if (getClusterType() != null) {
			 _hashCode += getClusterType().hashCode();
		 }
		 __hashCodeCalc = false;
		 return _hashCode;
	 }

	 // Type metadata
	 private static org.apache.axis.description.TypeDesc typeDesc =
	 new org.apache.axis.description.TypeDesc(DFUGetDataColumnsResponse.class, true);

	 static {
		 typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUGetDataColumnsResponse"));
		 org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("exceptions");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("logicalName");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalName"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("startIndex");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartIndex"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("endIndex");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EndIndex"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns1");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns1"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns2");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns2"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns3");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns3"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns4");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns4"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns5");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns5"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns6");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns6"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns7");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns7"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns8");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns8"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns9");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns9"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns10");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns10"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns11");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns11"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns12");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns12"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns13");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns13"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns14");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns14"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns15");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns15"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns16");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns16"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns17");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns17"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns18");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns18"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns19");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns19"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataKeyedColumns20");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns20"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns1");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns1"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns2");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns2"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns3");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns3"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns4");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns4"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns5");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns5"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns6");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns6"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns7");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns7"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns8");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns8"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns9");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns9"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns10");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns10"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns11");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns11"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns12");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns12"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns13");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns13"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns14");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns14"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns15");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns15"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns16");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns16"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns17");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns17"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns18");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns18"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns19");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns19"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("DFUDataNonKeyedColumns20");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns20"));
		 elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("rowCount");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RowCount"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("showColumns");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ShowColumns"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("chooseFile");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ChooseFile"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("cluster");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Cluster"));
		 elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		 elemField.setMinOccurs(0);
		 elemField.setNillable(false);
		 typeDesc.addFieldDesc(elemField);
		 elemField = new org.apache.axis.description.ElementDesc();
		 elemField.setFieldName("clusterType");
		 elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ClusterType"));
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
