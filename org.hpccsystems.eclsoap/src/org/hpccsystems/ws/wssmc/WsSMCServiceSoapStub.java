/**
 * WsSMCServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wssmc;

public class WsSMCServiceSoapStub extends org.apache.axis.client.Stub implements WsSMCServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[16];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Activity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Activity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">Activity"), Activity.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ActivityResponse"));
        oper.setReturnClass(ActivityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActivityResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BrowseResources");
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">BrowseResourcesResponse"));
        oper.setReturnClass(BrowseResourcesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BrowseResourcesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ClearQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClearQueue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ClearQueue"), ClearQueue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCQueueResponse"));
        oper.setReturnClass(SMCQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCQueueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetThorQueueAvailability");
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">GetThorQueueAvailabilityResponse"));
        oper.setReturnClass(GetThorQueueAvailabilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "GetThorQueueAvailabilityResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Index");
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCIndexResponse"));
        oper.setReturnClass(SMCIndexResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCIndexResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MoveJobBack");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "MoveJobBack"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobBack"), MoveJobBack.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse"));
        oper.setReturnClass(SMCJobResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJobResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MoveJobDown");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "MoveJobDown"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobDown"), MoveJobDown.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse"));
        oper.setReturnClass(SMCJobResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJobResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MoveJobFront");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "MoveJobFront"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobFront"), MoveJobFront.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse"));
        oper.setReturnClass(SMCJobResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJobResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MoveJobUp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "MoveJobUp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobUp"), MoveJobUp.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse"));
        oper.setReturnClass(SMCJobResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJobResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NotInCommunityEdition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "NotInCommunityEdition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">NotInCommunityEdition"), NotInCommunityEdition.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">NotInCommunityEditionResponse"));
        oper.setReturnClass(NotInCommunityEditionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "NotInCommunityEditionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PauseQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "PauseQueue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">PauseQueue"), PauseQueue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCQueueResponse"));
        oper.setReturnClass(SMCQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCQueueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RemoveJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">RemoveJob"), RemoveJob.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse"));
        oper.setReturnClass(SMCJobResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCJobResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResumeQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ResumeQueue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ResumeQueue"), ResumeQueue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCQueueResponse"));
        oper.setReturnClass(SMCQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCQueueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetBanner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SetBanner"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetBanner"), SetBanner.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetBannerResponse"));
        oper.setReturnClass(SetBannerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SetBannerResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetJobPriority");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SetJobPriority"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetJobPriority"), SetJobPriority.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCPriorityResponse"));
        oper.setReturnClass(SMCPriorityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCPriorityResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StopQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "StopQueue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">StopQueue"), StopQueue.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCQueueResponse"));
        oper.setReturnClass(SMCQueueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SMCQueueResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"),
                      "ArrayOfEspException",
                      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"), 
                      true
                     ));
        _operations[15] = oper;

    }

    public WsSMCServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WsSMCServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WsSMCServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">Activity");
            cachedSerQNames.add(qName);
            cls = Activity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ActivityResponse");
            cachedSerQNames.add(qName);
            cls = ActivityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">BrowseResourcesResponse");
            cachedSerQNames.add(qName);
            cls = BrowseResourcesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ClearQueue");
            cachedSerQNames.add(qName);
            cls = ClearQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">GetThorQueueAvailabilityResponse");
            cachedSerQNames.add(qName);
            cls = GetThorQueueAvailabilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobBack");
            cachedSerQNames.add(qName);
            cls = MoveJobBack.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobDown");
            cachedSerQNames.add(qName);
            cls = MoveJobDown.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobFront");
            cachedSerQNames.add(qName);
            cls = MoveJobFront.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">MoveJobUp");
            cachedSerQNames.add(qName);
            cls = MoveJobUp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">NotInCommunityEdition");
            cachedSerQNames.add(qName);
            cls = NotInCommunityEdition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">NotInCommunityEditionResponse");
            cachedSerQNames.add(qName);
            cls = NotInCommunityEditionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">PauseQueue");
            cachedSerQNames.add(qName);
            cls = PauseQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">RemoveJob");
            cachedSerQNames.add(qName);
            cls = RemoveJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ResumeQueue");
            cachedSerQNames.add(qName);
            cls = ResumeQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetBanner");
            cachedSerQNames.add(qName);
            cls = SetBanner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetBannerResponse");
            cachedSerQNames.add(qName);
            cls = SetBannerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetJobPriority");
            cachedSerQNames.add(qName);
            cls = SetJobPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCIndexResponse");
            cachedSerQNames.add(qName);
            cls = SMCIndexResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCJobResponse");
            cachedSerQNames.add(qName);
            cls = SMCJobResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCPriorityResponse");
            cachedSerQNames.add(qName);
            cls = SMCPriorityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCQueueResponse");
            cachedSerQNames.add(qName);
            cls = SMCQueueResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">StopQueue");
            cachedSerQNames.add(qName);
            cls = StopQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActiveWorkunit");
            cachedSerQNames.add(qName);
            cls = ActiveWorkunit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfActiveWorkunit");
            cachedSerQNames.add(qName);
            cls = ActiveWorkunit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActiveWorkunit");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActiveWorkunit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfDFUJob");
            cachedSerQNames.add(qName);
            cls = DFUJob[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJob");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJob");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException");
            cachedSerQNames.add(qName);
            cls = ArrayOfEspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfHPCCResource");
            cachedSerQNames.add(qName);
            cls = HPCCResource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResource");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResource");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfHPCCResourceRepository");
            cachedSerQNames.add(qName);
            cls = HPCCResourceRepository[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResourceRepository");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResourceRepository");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfHThorCluster");
            cachedSerQNames.add(qName);
            cls = HThorCluster[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HThorCluster");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HThorCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfRoxieCluster");
            cachedSerQNames.add(qName);
            cls = RoxieCluster[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieCluster");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfServerJobQueue");
            cachedSerQNames.add(qName);
            cls = ServerJobQueue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueue");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfThorCluster");
            cachedSerQNames.add(qName);
            cls = ThorCluster[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorCluster");
            qName2 = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorCluster");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJob");
            cachedSerQNames.add(qName);
            cls = DFUJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "EspException");
            cachedSerQNames.add(qName);
            cls = EspException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResource");
            cachedSerQNames.add(qName);
            cls = HPCCResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HPCCResourceRepository");
            cachedSerQNames.add(qName);
            cls = HPCCResourceRepository.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HThorCluster");
            cachedSerQNames.add(qName);
            cls = HThorCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieCluster");
            cachedSerQNames.add(qName);
            cls = RoxieCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueue");
            cachedSerQNames.add(qName);
            cls = ServerJobQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorCluster");
            cachedSerQNames.add(qName);
            cls = ThorCluster.class;
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

    public ActivityResponse activity(Activity parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/Activity?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Activity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ActivityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (ActivityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ActivityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public BrowseResourcesResponse browseResources() throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/BrowseResources?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BrowseResources"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (BrowseResourcesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (BrowseResourcesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, BrowseResourcesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SMCQueueResponse clearQueue(ClearQueue parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/ClearQueue?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ClearQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMCQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SMCQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SMCQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public GetThorQueueAvailabilityResponse getThorQueueAvailability() throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/GetThorQueueAvailability?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetThorQueueAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetThorQueueAvailabilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (GetThorQueueAvailabilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, GetThorQueueAvailabilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SMCIndexResponse index() throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/Index?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Index"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMCIndexResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SMCIndexResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SMCIndexResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SMCJobResponse moveJobBack(MoveJobBack parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/MoveJobBack?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MoveJobBack"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMCJobResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SMCJobResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SMCJobResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SMCJobResponse moveJobDown(MoveJobDown parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/MoveJobDown?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MoveJobDown"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMCJobResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SMCJobResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SMCJobResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SMCJobResponse moveJobFront(MoveJobFront parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/MoveJobFront?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MoveJobFront"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMCJobResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SMCJobResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SMCJobResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SMCJobResponse moveJobUp(MoveJobUp parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/MoveJobUp?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MoveJobUp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMCJobResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SMCJobResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SMCJobResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public NotInCommunityEditionResponse notInCommunityEdition(NotInCommunityEdition parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/NotInCommunityEdition?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "NotInCommunityEdition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (NotInCommunityEditionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (NotInCommunityEditionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, NotInCommunityEditionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SMCQueueResponse pauseQueue(PauseQueue parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/PauseQueue?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "PauseQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMCQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SMCQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SMCQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SMCJobResponse removeJob(RemoveJob parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/RemoveJob?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RemoveJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMCJobResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SMCJobResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SMCJobResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SMCQueueResponse resumeQueue(ResumeQueue parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/ResumeQueue?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ResumeQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMCQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SMCQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SMCQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SetBannerResponse setBanner(SetBanner parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/SetBanner?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetBanner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SetBannerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SetBannerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SetBannerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SMCPriorityResponse setJobPriority(SetJobPriority parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/SetJobPriority?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetJobPriority"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMCPriorityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SMCPriorityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SMCPriorityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SMCQueueResponse stopQueue(StopQueue parameters) throws java.rmi.RemoteException, ArrayOfEspException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WsSMC/StopQueue?ver_=1.15");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "StopQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMCQueueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (SMCQueueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, SMCQueueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ArrayOfEspException) {
              throw (ArrayOfEspException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
