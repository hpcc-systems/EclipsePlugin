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
 * WsWorkunitsServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WsWorkunitsServiceSoapStub extends org.apache.axis.client.Stub implements org.hpccsystems.ws.wsworkunits.WsWorkunitsServiceSoap {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc [] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[47];
		_initOperationDesc1();
		_initOperationDesc2();
		_initOperationDesc3();
		_initOperationDesc4();
		_initOperationDesc5();
	}

	private static void _initOperationDesc1(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("GVCAjaxGraph");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GVCAjaxGraph"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">GVCAjaxGraph"), org.hpccsystems.ws.wsworkunits.GVCAjaxGraph.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">GVCAjaxGraphResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.GVCAjaxGraphResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GVCAjaxGraphResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUAbort");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAbort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAbort"), org.hpccsystems.ws.wsworkunits.WUAbort.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAbortResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUAbortResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAbortResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUAction");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAction"), org.hpccsystems.ws.wsworkunits.WUAction.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUActionResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUActionResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUActionResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUAddLocalFileToWorkunit");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAddLocalFileToWorkunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAddLocalFileToWorkunit"), org.hpccsystems.ws.wsworkunits.WUAddLocalFileToWorkunit.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAddLocalFileToWorkunitResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUAddLocalFileToWorkunitResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAddLocalFileToWorkunitResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUCDebug");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCDebug"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCDebug"), org.hpccsystems.ws.wsworkunits.WUCDebug.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDebugResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUDebugResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDebugResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUClusterJobQueueLOG");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueLOG"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueLOG"), org.hpccsystems.ws.wsworkunits.WUClusterJobQueueLOG.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueLOGResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUClusterJobQueueLOGResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueLOGResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUClusterJobQueueXLS");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueXLS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueXLS"), org.hpccsystems.ws.wsworkunits.WUClusterJobQueueXLS.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueXLSResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUClusterJobQueueXLSResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueXLSResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUClusterJobSummaryXLS");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobSummaryXLS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobSummaryXLS"), org.hpccsystems.ws.wsworkunits.WUClusterJobSummaryXLS.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobSummaryXLSResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUClusterJobSummaryXLSResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobSummaryXLSResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUClusterJobXLS");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobXLS"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobXLS"), org.hpccsystems.ws.wsworkunits.WUClusterJobXLS.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobXLSResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUClusterJobXLSResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobXLSResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[8] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUCompileECL");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCompileECL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCompileECL"), org.hpccsystems.ws.wsworkunits.WUCompileECL.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCompileECLResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUCompileECLResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCompileECLResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[9] = oper;

	}

	private static void _initOperationDesc2(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUCopyLogicalFiles");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalFiles"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyLogicalFiles"), org.hpccsystems.ws.wsworkunits.WUCopyLogicalFiles.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyLogicalFilesResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUCopyLogicalFilesResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalFilesResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[10] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUCreate");
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUCreateResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCreateResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[11] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUCreateAndUpdate");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCreateAndUpdate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateAndUpdate"), org.hpccsystems.ws.wsworkunits.WUCreateAndUpdate.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUUpdateResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUUpdateResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUUpdateResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[12] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUDelete");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDelete"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDelete"), org.hpccsystems.ws.wsworkunits.WUDelete.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeleteResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUDeleteResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDeleteResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[13] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUDeployWorkunit");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDeployWorkunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeployWorkunit"), org.hpccsystems.ws.wsworkunits.WUDeployWorkunit.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeployWorkunitResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUDeployWorkunitResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDeployWorkunitResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[14] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUExport");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUExport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUExport"), org.hpccsystems.ws.wsworkunits.WUExport.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUExportResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUExportResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUExportResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[15] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUFile");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFile"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUFile"), org.hpccsystems.ws.wsworkunits.WUFile.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WULogFileResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WULogFileResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogFileResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[16] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUGVCGraphInfo");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGVCGraphInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGVCGraphInfo"), org.hpccsystems.ws.wsworkunits.WUGVCGraphInfo.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGVCGraphInfoResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUGVCGraphInfoResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGVCGraphInfoResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[17] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUGetDependancyTrees");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetDependancyTrees"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetDependancyTrees"), org.hpccsystems.ws.wsworkunits.WUGetDependancyTrees.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetDependancyTreesResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUGetDependancyTreesResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetDependancyTreesResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[18] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUGetGraph");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetGraph"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraph"), org.hpccsystems.ws.wsworkunits.WUGetGraph.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraphResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUGetGraphResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetGraphResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[19] = oper;

	}

	private static void _initOperationDesc3(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUGraphInfo");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGraphInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphInfo"), org.hpccsystems.ws.wsworkunits.WUGraphInfo.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphInfoResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUGraphInfoResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGraphInfoResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[20] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUGraphTiming");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGraphTiming"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphTiming"), org.hpccsystems.ws.wsworkunits.WUGraphTiming.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphTimingResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUGraphTimingResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGraphTimingResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[21] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUInfo");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfo"), org.hpccsystems.ws.wsworkunits.WUInfo.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfoResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUInfoResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUInfoResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[22] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUInfoDetails");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUInfoDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfoDetails"), org.hpccsystems.ws.wsworkunits.WUInfoDetails.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfoResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUInfoResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUInfoResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[23] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUJobList");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUJobList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUJobList"), org.hpccsystems.ws.wsworkunits.WUJobList.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUJobListResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUJobListResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUJobListResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[24] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUListLocalFileRequired");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListLocalFileRequired"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListLocalFileRequired"), org.hpccsystems.ws.wsworkunits.WUListLocalFileRequired.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListLocalFileRequiredResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUListLocalFileRequiredResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListLocalFileRequiredResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[25] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUProcessGraph");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUProcessGraph"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProcessGraph"), org.hpccsystems.ws.wsworkunits.WUProcessGraph.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProcessGraphResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUProcessGraphResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUProcessGraphResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[26] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUProtect");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUProtect"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProtect"), org.hpccsystems.ws.wsworkunits.WUProtect.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProtectResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUProtectResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUProtectResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[27] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUPublishWorkunit");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPublishWorkunit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPublishWorkunit"), org.hpccsystems.ws.wsworkunits.WUPublishWorkunit.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPublishWorkunitResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUPublishWorkunitResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPublishWorkunitResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[28] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUPushEvent");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPushEvent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPushEvent"), org.hpccsystems.ws.wsworkunits.WUPushEvent.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPushEventResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUPushEventResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPushEventResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[29] = oper;

	}

	private static void _initOperationDesc4(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUQuery");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuery"), org.hpccsystems.ws.wsworkunits.WUQuery.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUQueryResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[30] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUQuerysetActionAliases");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysetActionAliases"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetActionAliases"), org.hpccsystems.ws.wsworkunits.WUQuerysetActionAliases.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetActionAliasesResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUQuerySetActionAliasesResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetActionAliasesResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[31] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUQuerysetActionQueries");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysetActionQueries"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetActionQueries"), org.hpccsystems.ws.wsworkunits.WUQuerysetActionQueries.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetActionQueriesResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUQuerySetActionQueriesResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetActionQueriesResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[32] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUQuerysetDetails");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysetDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetDetails"), org.hpccsystems.ws.wsworkunits.WUQuerysetDetails.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetDetailsResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUQuerySetDetailsResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetDetailsResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[33] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUQuerysets");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysets"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysets"), org.hpccsystems.ws.wsworkunits.WUQuerysets.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetsResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUQuerysetsResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysetsResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[34] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUResubmit");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResubmit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResubmit"), org.hpccsystems.ws.wsworkunits.WUResubmit.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResubmitResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUResubmitResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResubmitResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[35] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUResult");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResult"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResult"), org.hpccsystems.ws.wsworkunits.WUResult.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUResultResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[36] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUResultBin");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultBin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultBin"), org.hpccsystems.ws.wsworkunits.WUResultBin.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultBinResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUResultBinResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultBinResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[37] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUResultSummary");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultSummary"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultSummary"), org.hpccsystems.ws.wsworkunits.WUResultSummary.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultSummaryResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUResultSummaryResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultSummaryResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[38] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUResultView");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultView"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultView"), org.hpccsystems.ws.wsworkunits.WUResultView.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultViewResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUResultViewResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultViewResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[39] = oper;

	}

	private static void _initOperationDesc5(){
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUSchedule");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSchedule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSchedule"), org.hpccsystems.ws.wsworkunits.WUSchedule.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUScheduleResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUScheduleResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUScheduleResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[40] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUShowScheduled");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUShowScheduled"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUShowScheduled"), org.hpccsystems.ws.wsworkunits.WUShowScheduled.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUShowScheduledResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUShowScheduledResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUShowScheduledResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[41] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUSubmit");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSubmit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSubmit"), org.hpccsystems.ws.wsworkunits.WUSubmit.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSubmitResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUSubmitResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSubmitResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[42] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUSyntaxCheckECL");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSyntaxCheckECL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSyntaxCheckECL"), org.hpccsystems.ws.wsworkunits.WUSyntaxCheckECL.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSyntaxCheckResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUSyntaxCheckResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSyntaxCheckResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[43] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUUpdate");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUUpdate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUUpdate"), org.hpccsystems.ws.wsworkunits.WUUpdate.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUUpdateResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUUpdateResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUUpdateResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[44] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUWaitCompiled");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUWaitCompiled"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitCompiled"), org.hpccsystems.ws.wsworkunits.WUWaitCompiled.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUWaitResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUWaitResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[45] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("WUWaitComplete");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUWaitComplete"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitComplete"), org.hpccsystems.ws.wsworkunits.WUWaitComplete.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitResponse"));
		oper.setReturnClass(org.hpccsystems.ws.wsworkunits.WUWaitResponse.class);
		oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUWaitResponse"));
		oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
				"wsworkunits.ws.hpccsystems.ArrayOfEspException",
				new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"), 
				true
				));
		_operations[46] = oper;

	}

	public WsWorkunitsServiceSoapStub() throws org.apache.axis.AxisFault {
		this(null);
	}

	public WsWorkunitsServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public WsWorkunitsServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
		addBindings0();
		addBindings1();
	}

	private void addBindings0() {
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
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUCompileECLResponse>Dependencies");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUECLAttribute[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUECLAttribute");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLAttribute");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUCopyLogicalFilesResponse>ClusterFiles");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUCopyLogicalClusterFileSections[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalClusterFileSections");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUInfoResponse>ResultViews");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "View");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">>WUPublishWorkunitResponse>ClusterFiles");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUCopyLogicalClusterFileSections[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalClusterFileSections");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">ECLWorkunit>AllowedClusters");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllowedCluster");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">GVCAjaxGraph");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.GVCAjaxGraph.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">GVCAjaxGraphResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.GVCAjaxGraphResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAbort");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUAbort.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAbortResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUAbortResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAction");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUAction.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUActionResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUActionResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAddLocalFileToWorkunit");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUAddLocalFileToWorkunit.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUAddLocalFileToWorkunitResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUAddLocalFileToWorkunitResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCDebug");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUCDebug.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueLOG");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUClusterJobQueueLOG.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueLOGResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUClusterJobQueueLOGResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueXLS");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUClusterJobQueueXLS.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobQueueXLSResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUClusterJobQueueXLSResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobSummaryXLS");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUClusterJobSummaryXLS.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobSummaryXLSResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUClusterJobSummaryXLSResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobXLS");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUClusterJobXLS.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUClusterJobXLSResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUClusterJobXLSResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCompileECL");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUCompileECL.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCompileECLResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUCompileECLResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyLogicalFiles");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUCopyLogicalFiles.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCopyLogicalFilesResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUCopyLogicalFilesResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateAndUpdate");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUCreateAndUpdate.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUCreateResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDebugResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUDebugResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDelete");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUDelete.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeleteResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUDeleteResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeployWorkunit");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUDeployWorkunit.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUDeployWorkunitResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUDeployWorkunitResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUExport");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUExport.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUExportResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUExportResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUFile");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUFile.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetDependancyTrees");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUGetDependancyTrees.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetDependancyTreesResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUGetDependancyTreesResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraph");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUGetGraph.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetGraphResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUGetGraphResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphInfo");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUGraphInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphInfoResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUGraphInfoResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphTiming");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUGraphTiming.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGraphTimingResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUGraphTimingResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGVCGraphInfo");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUGVCGraphInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGVCGraphInfoResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUGVCGraphInfoResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfo");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfoDetails");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUInfoDetails.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfoResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUInfoResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUJobList");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUJobList.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUJobListResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUJobListResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListLocalFileRequired");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUListLocalFileRequired.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListLocalFileRequiredResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUListLocalFileRequiredResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WULogFileResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WULogFileResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProcessGraph");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUProcessGraph.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProcessGraphResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUProcessGraphResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProtect");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUProtect.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUProtectResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUProtectResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPublishWorkunit");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUPublishWorkunit.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPublishWorkunitResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUPublishWorkunitResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPushEvent");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUPushEvent.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUPushEventResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUPushEventResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuery");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUQuery.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUQueryResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetActionAliases");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUQuerysetActionAliases.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetActionAliasesResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUQuerySetActionAliasesResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetActionQueries");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUQuerysetActionQueries.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetActionQueriesResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUQuerySetActionQueriesResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetDetails");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUQuerysetDetails.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetDetailsResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUQuerySetDetailsResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysets");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUQuerysets.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerysetsResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUQuerysetsResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResubmit");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUResubmit.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResubmitResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUResubmitResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResult");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUResult.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultBin");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUResultBin.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultBinResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUResultBinResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUResultResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultSummary");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUResultSummary.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultSummaryResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUResultSummaryResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultView");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUResultView.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUResultViewResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUResultViewResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSchedule");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUSchedule.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUScheduleResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUScheduleResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUShowScheduled");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUShowScheduled.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUShowScheduledResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUShowScheduledResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSubmit");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUSubmit.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSubmitResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUSubmitResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSyntaxCheckECL");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUSyntaxCheckECL.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUSyntaxCheckResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUSyntaxCheckResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUUpdate");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUUpdate.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUUpdateResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUUpdateResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitCompiled");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUWaitCompiled.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitComplete");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUWaitComplete.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUWaitResponse");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUWaitResponse.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ApplicationValue.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfApplicationValue");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ApplicationValue[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfDebugValue");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.DebugValue[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLException");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLException[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLException");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLException");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLGraph");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLGraph[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraph");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraph");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	}
	private void addBindings1() {
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
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLGraphEx");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLGraphEx[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraphEx");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraphEx");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLHelpFile");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLHelpFile[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLHelpFile");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLHelpFile");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLJob");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLJob[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLJob");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLJob");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLResult");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLResult[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLSchemaItem");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLSchemaItem[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSchemaItem");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSchemaItem");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLSourceFile");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLSourceFile[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFile");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFile");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLTimer");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLTimer[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimer");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimer");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLTimingData");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLTimingData[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimingData");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimingData");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLWorkflow");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLWorkflow[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkflow");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkflow");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfECLWorkunit");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLWorkunit[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunit");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunit");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ArrayOfEspException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfLogicalFileUpload");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.LogicalFileUpload[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileUpload");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileUpload");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfQuerySet");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.QuerySet[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfQuerySetAlias");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.QuerySetAlias[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAlias");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAlias");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfQuerySetAliasAction");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.QuerySetAliasAction[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAliasAction");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAliasAction");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfQuerySetQuery");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.QuerySetQuery[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQuery");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQuery");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfQuerySetQueryAction");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.QuerySetQueryAction[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryAction");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryAction");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfScheduledWU");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ScheduledWU[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScheduledWU");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScheduledWU");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfServerInfo");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ServerInfo[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ServerInfo");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ServerInfo");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfWUActionResult");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUActionResult[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUActionResult");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUActionResult");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfWULogicalFileCopyInfo");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.DebugValue.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLException");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraph");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLGraph.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraphEx");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLGraphEx.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLHelpFile");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLHelpFile.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLJob");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLJob.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLQuery");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLQuery.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLResult");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLResult.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSchemaItem");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLSchemaItem.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLSourceFile");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLSourceFile.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimer");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLTimer.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLTimingData");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLTimingData.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkflow");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLWorkflow.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunit");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ECLWorkunit.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EspException");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.EspException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EspStringArray");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
		qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Item");
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileUpload");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.LogicalFileUpload.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.QuerySet.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAlias");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.QuerySetAlias.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAliasAction");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.QuerySetAliasAction.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQuery");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.QuerySetQuery.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQueryAction");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.QuerySetQueryAction.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScheduledWU");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ScheduledWU.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ServerInfo");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.ServerInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUActionResult");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUActionResult.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalClusterFileSections");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUCopyLogicalClusterFileSections.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUECLAttribute");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WUECLAttribute.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WULogicalFileCopyInfo");
		cachedSerQNames.add(qName);
		cls = org.hpccsystems.ws.wsworkunits.WULogicalFileCopyInfo.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

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
	public org.hpccsystems.ws.wsworkunits.GVCAjaxGraphResponse GVCAjaxGraph(org.hpccsystems.ws.wsworkunits.GVCAjaxGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/GVCAjaxGraph?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "GVCAjaxGraph"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.GVCAjaxGraphResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.GVCAjaxGraphResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.GVCAjaxGraphResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUAbortResponse WUAbort(org.hpccsystems.ws.wsworkunits.WUAbort parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUAbort?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUAbort"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUAbortResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUAbortResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUAbortResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUActionResponse WUAction(org.hpccsystems.ws.wsworkunits.WUAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUAction?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUAction"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUActionResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUActionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUActionResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUAddLocalFileToWorkunitResponse WUAddLocalFileToWorkunit(org.hpccsystems.ws.wsworkunits.WUAddLocalFileToWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUAddLocalFileToWorkunit?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUAddLocalFileToWorkunit"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUAddLocalFileToWorkunitResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUAddLocalFileToWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUAddLocalFileToWorkunitResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUDebugResponse WUCDebug(org.hpccsystems.ws.wsworkunits.WUCDebug parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUCDebug?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUCDebug"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUDebugResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUDebugResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUDebugResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUClusterJobQueueLOGResponse WUClusterJobQueueLOG(org.hpccsystems.ws.wsworkunits.WUClusterJobQueueLOG parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUClusterJobQueueLOG?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUClusterJobQueueLOG"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUClusterJobQueueLOGResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUClusterJobQueueLOGResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUClusterJobQueueLOGResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUClusterJobQueueXLSResponse WUClusterJobQueueXLS(org.hpccsystems.ws.wsworkunits.WUClusterJobQueueXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUClusterJobQueueXLS?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUClusterJobQueueXLS"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUClusterJobQueueXLSResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUClusterJobQueueXLSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUClusterJobQueueXLSResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUClusterJobSummaryXLSResponse WUClusterJobSummaryXLS(org.hpccsystems.ws.wsworkunits.WUClusterJobSummaryXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUClusterJobSummaryXLS?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUClusterJobSummaryXLS"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUClusterJobSummaryXLSResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUClusterJobSummaryXLSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUClusterJobSummaryXLSResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUClusterJobXLSResponse WUClusterJobXLS(org.hpccsystems.ws.wsworkunits.WUClusterJobXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUClusterJobXLS?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUClusterJobXLS"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUClusterJobXLSResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUClusterJobXLSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUClusterJobXLSResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUCompileECLResponse WUCompileECL(org.hpccsystems.ws.wsworkunits.WUCompileECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUCompileECL?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUCompileECL"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUCompileECLResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUCompileECLResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUCompileECLResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUCopyLogicalFilesResponse WUCopyLogicalFiles(org.hpccsystems.ws.wsworkunits.WUCopyLogicalFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[10]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUCopyLogicalFiles?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUCopyLogicalFiles"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUCopyLogicalFilesResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUCopyLogicalFilesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUCopyLogicalFilesResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUCreateResponse WUCreate() throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[11]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUCreate?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUCreate"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUCreateResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUCreateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUCreateResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUUpdateResponse WUCreateAndUpdate(org.hpccsystems.ws.wsworkunits.WUCreateAndUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[12]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUCreateAndUpdate?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUCreateAndUpdate"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUUpdateResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUUpdateResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUDeleteResponse WUDelete(org.hpccsystems.ws.wsworkunits.WUDelete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[13]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUDelete?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUDelete"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUDeleteResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUDeleteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUDeleteResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUDeployWorkunitResponse WUDeployWorkunit(org.hpccsystems.ws.wsworkunits.WUDeployWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[14]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUDeployWorkunit?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUDeployWorkunit"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUDeployWorkunitResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUDeployWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUDeployWorkunitResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUExportResponse WUExport(org.hpccsystems.ws.wsworkunits.WUExport parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[15]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUExport?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUExport"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUExportResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUExportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUExportResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WULogFileResponse WUFile(org.hpccsystems.ws.wsworkunits.WUFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[16]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUFile?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUFile"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WULogFileResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WULogFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WULogFileResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUGVCGraphInfoResponse WUGVCGraphInfo(org.hpccsystems.ws.wsworkunits.WUGVCGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[17]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUGVCGraphInfo?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUGVCGraphInfo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUGVCGraphInfoResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUGVCGraphInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUGVCGraphInfoResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUGetDependancyTreesResponse WUGetDependancyTrees(org.hpccsystems.ws.wsworkunits.WUGetDependancyTrees parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[18]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUGetDependancyTrees?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUGetDependancyTrees"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUGetDependancyTreesResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUGetDependancyTreesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUGetDependancyTreesResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUGetGraphResponse WUGetGraph(org.hpccsystems.ws.wsworkunits.WUGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[19]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUGetGraph?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUGetGraph"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUGetGraphResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUGetGraphResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUGetGraphResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUGraphInfoResponse WUGraphInfo(org.hpccsystems.ws.wsworkunits.WUGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[20]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUGraphInfo?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUGraphInfo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUGraphInfoResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUGraphInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUGraphInfoResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUGraphTimingResponse WUGraphTiming(org.hpccsystems.ws.wsworkunits.WUGraphTiming parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[21]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUGraphTiming?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUGraphTiming"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUGraphTimingResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUGraphTimingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUGraphTimingResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUInfoResponse WUInfo(org.hpccsystems.ws.wsworkunits.WUInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[22]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUInfo?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUInfo"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUInfoResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUInfoResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUInfoResponse WUInfoDetails(org.hpccsystems.ws.wsworkunits.WUInfoDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[23]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUInfoDetails?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUInfoDetails"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUInfoResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUInfoResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUJobListResponse WUJobList(org.hpccsystems.ws.wsworkunits.WUJobList parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[24]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUJobList?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUJobList"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUJobListResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUJobListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUJobListResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUListLocalFileRequiredResponse WUListLocalFileRequired(org.hpccsystems.ws.wsworkunits.WUListLocalFileRequired parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[25]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUListLocalFileRequired?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUListLocalFileRequired"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUListLocalFileRequiredResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUListLocalFileRequiredResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUListLocalFileRequiredResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUProcessGraphResponse WUProcessGraph(org.hpccsystems.ws.wsworkunits.WUProcessGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[26]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUProcessGraph?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUProcessGraph"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUProcessGraphResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUProcessGraphResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUProcessGraphResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUProtectResponse WUProtect(org.hpccsystems.ws.wsworkunits.WUProtect parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[27]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUProtect?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUProtect"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUProtectResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUProtectResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUProtectResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUPublishWorkunitResponse WUPublishWorkunit(org.hpccsystems.ws.wsworkunits.WUPublishWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[28]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUPublishWorkunit?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUPublishWorkunit"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUPublishWorkunitResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUPublishWorkunitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUPublishWorkunitResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUPushEventResponse WUPushEvent(org.hpccsystems.ws.wsworkunits.WUPushEvent parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[29]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUPushEvent?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUPushEvent"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUPushEventResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUPushEventResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUPushEventResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUQueryResponse WUQuery(org.hpccsystems.ws.wsworkunits.WUQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[30]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUQuery?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUQuery"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUQueryResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUQueryResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUQuerySetActionAliasesResponse WUQuerysetActionAliases(org.hpccsystems.ws.wsworkunits.WUQuerysetActionAliases parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[31]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUQuerysetActionAliases?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUQuerysetActionAliases"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUQuerySetActionAliasesResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUQuerySetActionAliasesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUQuerySetActionAliasesResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUQuerySetActionQueriesResponse WUQuerysetActionQueries(org.hpccsystems.ws.wsworkunits.WUQuerysetActionQueries parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[32]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUQuerysetActionQueries?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUQuerysetActionQueries"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUQuerySetActionQueriesResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUQuerySetActionQueriesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUQuerySetActionQueriesResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUQuerySetDetailsResponse WUQuerysetDetails(org.hpccsystems.ws.wsworkunits.WUQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[33]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUQuerysetDetails?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUQuerysetDetails"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUQuerySetDetailsResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUQuerySetDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUQuerySetDetailsResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUQuerysetsResponse WUQuerysets(org.hpccsystems.ws.wsworkunits.WUQuerysets parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[34]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUQuerysets?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUQuerysets"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUQuerysetsResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUQuerysetsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUQuerysetsResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUResubmitResponse WUResubmit(org.hpccsystems.ws.wsworkunits.WUResubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[35]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUResubmit?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUResubmit"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUResubmitResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUResubmitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUResubmitResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUResultResponse WUResult(org.hpccsystems.ws.wsworkunits.WUResult parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[36]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUResult?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUResult"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUResultResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUResultResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUResultResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUResultBinResponse WUResultBin(org.hpccsystems.ws.wsworkunits.WUResultBin parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[37]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUResultBin?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUResultBin"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUResultBinResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUResultBinResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUResultBinResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUResultSummaryResponse WUResultSummary(org.hpccsystems.ws.wsworkunits.WUResultSummary parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[38]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUResultSummary?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUResultSummary"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUResultSummaryResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUResultSummaryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUResultSummaryResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUResultViewResponse WUResultView(org.hpccsystems.ws.wsworkunits.WUResultView parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[39]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUResultView?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUResultView"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUResultViewResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUResultViewResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUResultViewResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUScheduleResponse WUSchedule(org.hpccsystems.ws.wsworkunits.WUSchedule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[40]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUSchedule?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUSchedule"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUScheduleResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUScheduleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUScheduleResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUShowScheduledResponse WUShowScheduled(org.hpccsystems.ws.wsworkunits.WUShowScheduled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[41]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUShowScheduled?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUShowScheduled"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUShowScheduledResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUShowScheduledResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUShowScheduledResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUSubmitResponse WUSubmit(org.hpccsystems.ws.wsworkunits.WUSubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[42]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUSubmit?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUSubmit"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUSubmitResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUSubmitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUSubmitResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUSyntaxCheckResponse WUSyntaxCheckECL(org.hpccsystems.ws.wsworkunits.WUSyntaxCheckECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[43]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUSyntaxCheckECL?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUSyntaxCheckECL"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUSyntaxCheckResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUSyntaxCheckResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUSyntaxCheckResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUUpdateResponse WUUpdate(org.hpccsystems.ws.wsworkunits.WUUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[44]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUUpdate?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUUpdate"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUUpdateResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUUpdateResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUWaitResponse WUWaitCompiled(org.hpccsystems.ws.wsworkunits.WUWaitCompiled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[45]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUWaitCompiled?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUWaitCompiled"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUWaitResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUWaitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUWaitResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

	@Override
	public org.hpccsystems.ws.wsworkunits.WUWaitResponse WUWaitComplete(org.hpccsystems.ws.wsworkunits.WUWaitComplete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.wsworkunits.ArrayOfEspException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[46]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("WsWorkunits/WUWaitComplete?ver_=1.34");
		_call.setEncodingStyle(null);
		_call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		_call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName("", "WUWaitComplete"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

		if (_resp instanceof java.rmi.RemoteException) {
			throw (java.rmi.RemoteException)_resp;
		}
		else {
			extractAttachments(_call);
			try {
				return (org.hpccsystems.ws.wsworkunits.WUWaitResponse) _resp;
			} catch (java.lang.Exception _exception) {
				return (org.hpccsystems.ws.wsworkunits.WUWaitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.wsworkunits.WUWaitResponse.class);
			}
		}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof org.hpccsystems.ws.wsworkunits.ArrayOfEspException) {
					throw (org.hpccsystems.ws.wsworkunits.ArrayOfEspException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}

}
