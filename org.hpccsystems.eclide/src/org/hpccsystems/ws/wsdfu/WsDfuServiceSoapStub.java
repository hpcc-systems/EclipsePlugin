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
 * WsDfuServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsdfu;

public class WsDfuServiceSoapStub extends org.apache.axis.client.Stub implements org.hpccsystems.ws.wsdfu.WsDfuServiceSoap {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc [] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[17];
		_initOperationDesc1();
		_initOperationDesc2();
	}

	private static void _initOperationDesc1(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("Add");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddRequest"), org.hpccsystems.ws.wsdfu.AddRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.AddResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("AddRemote");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddRemoteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddRemoteRequest"), org.hpccsystems.ws.wsdfu.AddRemoteRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddRemoteResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.AddRemoteResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddRemoteResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("AddtoSuperfile");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddtoSuperfileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddtoSuperfileRequest"), org.hpccsystems.ws.wsdfu.AddtoSuperfileRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddtoSuperfileResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.AddtoSuperfileResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddtoSuperfileResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DFUArrayAction");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUArrayActionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUArrayActionRequest"), org.hpccsystems.ws.wsdfu.DFUArrayActionRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUArrayActionResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.DFUArrayActionResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUArrayActionResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DFUBrowseData");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUBrowseDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUBrowseDataRequest"), org.hpccsystems.ws.wsdfu.DFUBrowseDataRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUBrowseDataResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.DFUBrowseDataResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUBrowseDataResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DFUDefFile");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDefFileRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUDefFileRequest"), org.hpccsystems.ws.wsdfu.DFUDefFileRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUDefFileResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.DFUDefFileResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDefFileResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DFUFileView");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileViewRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFileViewRequest"), org.hpccsystems.ws.wsdfu.DFUFileViewRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFileViewResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.DFUFileViewResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileViewResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DFUGetDataColumns");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUGetDataColumnsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUGetDataColumnsRequest"), org.hpccsystems.ws.wsdfu.DFUGetDataColumnsRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUGetDataColumnsResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.DFUGetDataColumnsResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUGetDataColumnsResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DFUInfo");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUInfoRequest"), org.hpccsystems.ws.wsdfu.DFUInfoRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUInfoResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.DFUInfoResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUInfoResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[8] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DFUQuery");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUQueryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUQueryRequest"), org.hpccsystems.ws.wsdfu.DFUQueryRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUQueryResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.DFUQueryResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUQueryResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[9] = oper;

	}

	private static void _initOperationDesc2(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DFUSearch");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSearchRequest"), org.hpccsystems.ws.wsdfu.DFUSearchRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSearchResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.DFUSearchResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSearchResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[10] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DFUSearchData");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSearchDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSearchDataRequest"), org.hpccsystems.ws.wsdfu.DFUSearchDataRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSearchDataResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.DFUSearchDataResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSearchDataResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[11] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("DFUSpace");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSpaceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSpaceRequest"), org.hpccsystems.ws.wsdfu.DFUSpaceRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSpaceResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.DFUSpaceResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSpaceResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[12] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("Savexml");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SavexmlRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SavexmlRequest"), org.hpccsystems.ws.wsdfu.SavexmlRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SavexmlResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.SavexmlResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SavexmlResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[13] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SuperfileAction");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SuperfileActionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileActionRequest"), org.hpccsystems.ws.wsdfu.SuperfileActionRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileActionResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.SuperfileActionResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SuperfileActionResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[14] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SuperfileAddRaw");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SuperfileAddRawRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileAddRawRequest"), org.hpccsystems.ws.wsdfu.SuperfileAddRawRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileAddRawResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.SuperfileAddRawResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SuperfileAddRawResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[15] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("SuperfileList");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SuperfileListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileListRequest"), org.hpccsystems.ws.wsdfu.SuperfileListRequest.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileListResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsdfu.SuperfileListResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SuperfileListResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
				"wsdfu.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"), 
				true
				));
		_operations[16] = oper;

	}

	public WsDfuServiceSoapStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public WsDfuServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public WsDfuServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">>AddtoSuperfileResponse>SubfileNames");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SubfileName");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">>DFUBrowseDataResponse>ColumnsHidden");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUDataColumn[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnHidden");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">>DFUSearchDataResponse>ColumnsHidden");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUDataColumn[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnHidden");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">>DFUSearchResponse>ClusterNames");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ClusterName");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">>DFUSearchResponse>FileTypes");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileType");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddRemoteRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.AddRemoteRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddRemoteResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.AddRemoteResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.AddRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.AddResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddtoSuperfileRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.AddtoSuperfileRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">AddtoSuperfileResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.AddtoSuperfileResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUArrayActionRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUArrayActionRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUArrayActionResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUArrayActionResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUBrowseDataRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUBrowseDataRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUBrowseDataResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUBrowseDataResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUDefFileRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUDefFileRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUDefFileResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUDefFileResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFileDetail>Graphs");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ECLGraph");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFileViewRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUFileViewRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFileViewResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUFileViewResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUGetDataColumnsRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUGetDataColumnsRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUGetDataColumnsResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUGetDataColumnsResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUInfoRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUInfoRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUInfoResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUInfoResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUQueryRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUQueryRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUQueryResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUQueryResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSearchDataRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUSearchDataRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSearchDataResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUSearchDataResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSearchRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUSearchRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSearchResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUSearchResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSpaceRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUSpaceRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUSpaceResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUSpaceResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SavexmlRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.SavexmlRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SavexmlResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.SavexmlResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileActionRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.SuperfileActionRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileActionResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.SuperfileActionResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileAddRawRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.SuperfileAddRawRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileAddRawResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.SuperfileAddRawResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileListRequest");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.SuperfileListRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">SuperfileListResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.SuperfileListResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfDFUDataColumn");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUDataColumn[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfDFULogicalFile");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFULogicalFile[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFile");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFile");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfDFUPart");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUPart[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPart");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPart");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfDFUSpaceItem");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUSpaceItem[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSpaceItem");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSpaceItem");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.ArrayOfEspException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUDataColumn.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileDetail");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUFileDetail.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileStat");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUFileStat.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFile");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFULogicalFile.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPart");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUPart.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSpaceItem");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.DFUSpaceItem.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EspException");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsdfu.EspException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EspStringArray");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Item");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	}

	protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setEncodingStyle(null);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
						javax.xml.namespace.QName qName =
								(javax.xml.namespace.QName) cachedSerQNames.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class)
									cachedSerFactories.get(i);
							java.lang.Class df = (java.lang.Class)
									cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
						else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
									cachedSerFactories.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
									cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		}
		catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.AddResponse add(org.hpccsystems.ws.wsdfu.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/Add?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "Add"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.AddResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.AddResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.AddResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.AddRemoteResponse addRemote(org.hpccsystems.ws.wsdfu.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/AddRemote?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "AddRemote"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.AddRemoteResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.AddRemoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.AddRemoteResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.wsdfu.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/AddtoSuperfile?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "AddtoSuperfile"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.AddtoSuperfileResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.AddtoSuperfileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.AddtoSuperfileResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.wsdfu.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/DFUArrayAction?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "DFUArrayAction"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.DFUArrayActionResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.DFUArrayActionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.DFUArrayActionResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.wsdfu.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/DFUBrowseData?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "DFUBrowseData"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.DFUBrowseDataResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.DFUBrowseDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.DFUBrowseDataResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.wsdfu.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/DFUDefFile?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "DFUDefFile"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.DFUDefFileResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.DFUDefFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.DFUDefFileResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.wsdfu.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/DFUFileView?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "DFUFileView"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.DFUFileViewResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.DFUFileViewResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.DFUFileViewResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.wsdfu.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/DFUGetDataColumns?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "DFUGetDataColumns"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.DFUGetDataColumnsResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.DFUGetDataColumnsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.DFUGetDataColumnsResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUInfoResponse DFUInfo(org.hpccsystems.ws.wsdfu.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/DFUInfo?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "DFUInfo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.DFUInfoResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.DFUInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.DFUInfoResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUQueryResponse DFUQuery(org.hpccsystems.ws.wsdfu.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/DFUQuery?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "DFUQuery"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.DFUQueryResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.DFUQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.DFUQueryResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUSearchResponse DFUSearch(org.hpccsystems.ws.wsdfu.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[10]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/DFUSearch?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "DFUSearch"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.DFUSearchResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.DFUSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.DFUSearchResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.wsdfu.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[11]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/DFUSearchData?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "DFUSearchData"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.DFUSearchDataResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.DFUSearchDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.DFUSearchDataResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.wsdfu.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[12]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/DFUSpace?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "DFUSpace"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.DFUSpaceResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.DFUSpaceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.DFUSpaceResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.SavexmlResponse savexml(org.hpccsystems.ws.wsdfu.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[13]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/Savexml?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "Savexml"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.SavexmlResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.SavexmlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.SavexmlResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.SuperfileActionResponse superfileAction(org.hpccsystems.ws.wsdfu.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[14]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/SuperfileAction?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "SuperfileAction"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.SuperfileActionResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.SuperfileActionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.SuperfileActionResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.SuperfileAddRawResponse superfileAddRaw(org.hpccsystems.ws.wsdfu.SuperfileAddRawRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[15]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/SuperfileAddRaw?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "SuperfileAddRaw"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.SuperfileAddRawResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.SuperfileAddRawResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.SuperfileAddRawResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsdfu.SuperfileListResponse superfileList(org.hpccsystems.ws.wsdfu.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsdfu.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[16]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsDfu/SuperfileList?ver_=1.19");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "SuperfileList"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsdfu.SuperfileListResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsdfu.SuperfileListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsdfu.SuperfileListResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsdfu.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsdfu.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

}
