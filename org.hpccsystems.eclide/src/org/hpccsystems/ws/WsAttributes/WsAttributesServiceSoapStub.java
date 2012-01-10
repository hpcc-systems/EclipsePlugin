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
 * WsAttributesServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.WsAttributes;

public class WsAttributesServiceSoapStub extends org.apache.axis.client.Stub implements org.hpccsystems.ws.WsAttributes.WsAttributesServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[23];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckinAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CheckinAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CheckinAttributes"), org.hpccsystems.ws.WsAttributes.CheckinAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckoutAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CheckoutAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CheckoutAttributes"), org.hpccsystems.ws.WsAttributes.CheckoutAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CreateAttribute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateAttribute"), org.hpccsystems.ws.WsAttributes.CreateAttribute.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateAttributeResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.CreateAttributeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CreateAttributeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CreateLabel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateLabel"), org.hpccsystems.ws.WsAttributes.CreateLabel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateLabelResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.CreateLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CreateLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CreateModule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateModule"), org.hpccsystems.ws.WsAttributes.CreateModule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateModuleResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.CreateModuleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CreateModuleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "DeleteAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">DeleteAttributes"), org.hpccsystems.ws.WsAttributes.DeleteAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "DeleteLabel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">DeleteLabel"), org.hpccsystems.ws.WsAttributes.DeleteLabel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">DeleteLabelResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.DeleteLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "DeleteLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "DeleteModule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">DeleteModule"), org.hpccsystems.ws.WsAttributes.DeleteModule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">DeleteModuleResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.DeleteModuleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "DeleteModuleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "FindAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">FindAttributes"), org.hpccsystems.ws.WsAttributes.FindAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">FindAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.FindAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "FindAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetAttribute"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttribute"), org.hpccsystems.ws.WsAttributes.GetAttribute.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributeResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.GetAttributeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetAttributeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAttributeHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetAttributeHistory"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributeHistory"), org.hpccsystems.ws.WsAttributes.GetAttributeHistory.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributeHistoryResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.GetAttributeHistoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetAttributeHistoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAttributeLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetAttributeLabels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributeLabels"), org.hpccsystems.ws.WsAttributes.GetAttributeLabels.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributeLabelsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.GetAttributeLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetAttributeLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributes"), org.hpccsystems.ws.WsAttributes.GetAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.GetAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLabels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetLabels"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetLabels"), org.hpccsystems.ws.WsAttributes.GetLabels.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetLabelsResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.GetLabelsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetLabelsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetModules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetModules"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetModules"), org.hpccsystems.ws.WsAttributes.GetModules.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetModulesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.GetModulesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "GetModulesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ImportAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ImportAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">ImportAttributes"), org.hpccsystems.ws.WsAttributes.ImportAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListAttributeTypes");
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">ListAttributeTypesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.ListAttributeTypesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ListAttributeTypesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RenameAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "RenameAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">RenameAttributes"), org.hpccsystems.ws.WsAttributes.RenameAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RenameModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "RenameModule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">RenameModule"), org.hpccsystems.ws.WsAttributes.RenameModule.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">RenameModuleResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.RenameModuleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "RenameModuleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RollbackAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "RollbackAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">RollbackAttributes"), org.hpccsystems.ws.WsAttributes.RollbackAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "SaveAttributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">SaveAttributes"), org.hpccsystems.ws.WsAttributes.SaveAttributes.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateAttributesResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "UpdateAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SupportsEarMark");
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">SupportsEarMarkResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.SupportsEarMarkResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "SupportsEarMarkResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateLabel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "UpdateLabel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateLabel"), org.hpccsystems.ws.WsAttributes.UpdateLabel.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateLabelResponse"));
        oper.setReturnClass(org.hpccsystems.ws.WsAttributes.UpdateLabelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "UpdateLabelResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Exceptions"),
                      "com.seisint.webservices.WsAttributes.ArrayOfEspException",
                      new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException"), 
                      true
                     ));
        _operations[22] = oper;

    }

    public WsAttributesServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WsAttributesServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WsAttributesServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">>ListAttributeTypesResponse>Types");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.AttributeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "AttributeType");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Type");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CheckinAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CheckinAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CheckoutAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CheckoutAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateAttribute");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CreateAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateAttributeResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CreateAttributeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CreateLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateLabelResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CreateLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateModule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CreateModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">CreateModuleResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CreateModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">DeleteAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.DeleteAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">DeleteLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.DeleteLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">DeleteLabelResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.DeleteLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">DeleteModule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.DeleteModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">DeleteModuleResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.DeleteModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">ECLAttribute>MatchedLines");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ECLTextLine[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLTextLine");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Line");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">FindAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.FindAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">FindAttributesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.FindAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttribute");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributeHistory");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetAttributeHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributeHistoryResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetAttributeHistoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributeLabels");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetAttributeLabels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributeLabelsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetAttributeLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributeResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetAttributeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetAttributesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetLabels");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetLabels.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetLabelsResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetLabelsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetModules");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetModules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">GetModulesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.GetModulesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">ImportAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ImportAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">ListAttributeTypesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ListAttributeTypesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">RenameAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.RenameAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">RenameModule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.RenameModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">RenameModuleResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.RenameModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">RollbackAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.RollbackAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">SaveAttributes");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.SaveAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">SupportsEarMarkResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.SupportsEarMarkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateAttributesResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.UpdateLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", ">UpdateLabelResponse");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.UpdateLabelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfCheckinAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CheckinAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CheckinAttributeRequest");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CheckinAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfCheckoutAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CheckoutAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CheckoutAttributeRequest");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CheckoutAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfDeleteAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.DeleteAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "DeleteAttributeRequest");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "DeleteAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfECLAttribute");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ECLAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLAttribute");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLAttribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfECLAttributeLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ECLAttributeLabel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLAttributeLabel");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLAttributeLabel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfECLLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ECLLabel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLLabel");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLLabel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfECLModule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ECLModule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLModule");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLModule");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfEspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ArrayOfEspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfImportAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ImportAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ImportAttributeRequest");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ImportAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfRenameAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.RenameAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "RenameAttributeRequest");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "RenameAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfRollbackAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.RollbackAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "RollbackAttributeRequest");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "RollbackAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ArrayOfSaveAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.SaveAttributeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "SaveAttributeRequest");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "SaveAttributeRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "AttributeType");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.AttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CheckinAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CheckinAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "CheckoutAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.CheckoutAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "DeleteAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.DeleteAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLAttribute");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ECLAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLAttributeLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ECLAttributeLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLLabel");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ECLLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLModule");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ECLModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ECLTextLine");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ECLTextLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "EspException");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.EspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "EspStringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "ImportAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.ImportAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "RenameAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.RenameAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "RollbackAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.RollbackAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.seisint.com/WsAttributes", "SaveAttributeRequest");
            cachedSerQNames.add(qName);
            cls = org.hpccsystems.ws.WsAttributes.SaveAttributeRequest.class;
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
	public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse checkinAttributes(org.hpccsystems.ws.WsAttributes.CheckinAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/CheckinAttributes?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckinAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse checkoutAttributes(org.hpccsystems.ws.WsAttributes.CheckoutAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/CheckoutAttributes?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckoutAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.CreateAttributeResponse createAttribute(org.hpccsystems.ws.WsAttributes.CreateAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/CreateAttribute?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.CreateAttributeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.CreateAttributeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.CreateAttributeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.CreateLabelResponse createLabel(org.hpccsystems.ws.WsAttributes.CreateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/CreateLabel?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.CreateLabelResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.CreateLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.CreateLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.CreateModuleResponse createModule(org.hpccsystems.ws.WsAttributes.CreateModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/CreateModule?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.CreateModuleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.CreateModuleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.CreateModuleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse deleteAttributes(org.hpccsystems.ws.WsAttributes.DeleteAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/DeleteAttributes?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.DeleteLabelResponse deleteLabel(org.hpccsystems.ws.WsAttributes.DeleteLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/DeleteLabel?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.DeleteLabelResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.DeleteLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.DeleteLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.DeleteModuleResponse deleteModule(org.hpccsystems.ws.WsAttributes.DeleteModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/DeleteModule?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.DeleteModuleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.DeleteModuleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.DeleteModuleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.FindAttributesResponse findAttributes(org.hpccsystems.ws.WsAttributes.FindAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/FindAttributes?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FindAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.FindAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.FindAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.FindAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.GetAttributeResponse getAttribute(org.hpccsystems.ws.WsAttributes.GetAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetAttribute?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.GetAttributeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.GetAttributeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.GetAttributeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.GetAttributeHistoryResponse getAttributeHistory(org.hpccsystems.ws.WsAttributes.GetAttributeHistory parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetAttributeHistory?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAttributeHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.GetAttributeHistoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.GetAttributeHistoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.GetAttributeHistoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.GetAttributeLabelsResponse getAttributeLabels(org.hpccsystems.ws.WsAttributes.GetAttributeLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetAttributeLabels?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAttributeLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.GetAttributeLabelsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.GetAttributeLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.GetAttributeLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.GetAttributesResponse getAttributes(org.hpccsystems.ws.WsAttributes.GetAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetAttributes?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.GetAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.GetAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.GetAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.GetLabelsResponse getLabels(org.hpccsystems.ws.WsAttributes.GetLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetLabels?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetLabels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.GetLabelsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.GetLabelsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.GetLabelsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.GetModulesResponse getModules(org.hpccsystems.ws.WsAttributes.GetModules parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/GetModules?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetModules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.GetModulesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.GetModulesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.GetModulesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse importAttributes(org.hpccsystems.ws.WsAttributes.ImportAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/ImportAttributes?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ImportAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.ListAttributeTypesResponse listAttributeTypes() throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/ListAttributeTypes?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ListAttributeTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.ListAttributeTypesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.ListAttributeTypesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.ListAttributeTypesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse renameAttributes(org.hpccsystems.ws.WsAttributes.RenameAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/RenameAttributes?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RenameAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.RenameModuleResponse renameModule(org.hpccsystems.ws.WsAttributes.RenameModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/RenameModule?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RenameModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.RenameModuleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.RenameModuleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.RenameModuleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse rollbackAttributes(org.hpccsystems.ws.WsAttributes.RollbackAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/RollbackAttributes?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RollbackAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse saveAttributes(org.hpccsystems.ws.WsAttributes.SaveAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/SaveAttributes?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SaveAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.UpdateAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.SupportsEarMarkResponse supportsEarMark() throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/SupportsEarMark?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SupportsEarMark"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.SupportsEarMarkResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.SupportsEarMarkResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.SupportsEarMarkResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    @Override
	public org.hpccsystems.ws.WsAttributes.UpdateLabelResponse updateLabel(org.hpccsystems.ws.WsAttributes.UpdateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.WsAttributes.ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsAttributes/UpdateLabel?ver_=1.2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateLabel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.hpccsystems.ws.WsAttributes.UpdateLabelResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.hpccsystems.ws.WsAttributes.UpdateLabelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.hpccsystems.ws.WsAttributes.UpdateLabelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.hpccsystems.ws.WsAttributes.ArrayOfEspException) {
              throw (org.hpccsystems.ws.WsAttributes.ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
