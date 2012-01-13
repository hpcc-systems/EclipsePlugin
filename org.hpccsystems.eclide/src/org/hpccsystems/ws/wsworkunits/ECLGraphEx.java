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
 * ECLGraphEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class ECLGraphEx  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String label;

    private java.lang.String type;

    private java.lang.String graph;

    private java.lang.Boolean running;

    private java.lang.Long runningId;

    private java.lang.Boolean complete;

    private java.lang.Boolean failed;

    public ECLGraphEx() {
    }

    public ECLGraphEx(
           java.lang.String name,
           java.lang.String label,
           java.lang.String type,
           java.lang.String graph,
           java.lang.Boolean running,
           java.lang.Long runningId,
           java.lang.Boolean complete,
           java.lang.Boolean failed) {
           this.name = name;
           this.label = label;
           this.type = type;
           this.graph = graph;
           this.running = running;
           this.runningId = runningId;
           this.complete = complete;
           this.failed = failed;
    }


    /**
     * Gets the name value for this ECLGraphEx.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ECLGraphEx.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the label value for this ECLGraphEx.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ECLGraphEx.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the type value for this ECLGraphEx.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ECLGraphEx.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the graph value for this ECLGraphEx.
     * 
     * @return graph
     */
    public java.lang.String getGraph() {
        return graph;
    }


    /**
     * Sets the graph value for this ECLGraphEx.
     * 
     * @param graph
     */
    public void setGraph(java.lang.String graph) {
        this.graph = graph;
    }


    /**
     * Gets the running value for this ECLGraphEx.
     * 
     * @return running
     */
    public java.lang.Boolean getRunning() {
        return running;
    }


    /**
     * Sets the running value for this ECLGraphEx.
     * 
     * @param running
     */
    public void setRunning(java.lang.Boolean running) {
        this.running = running;
    }


    /**
     * Gets the runningId value for this ECLGraphEx.
     * 
     * @return runningId
     */
    public java.lang.Long getRunningId() {
        return runningId;
    }


    /**
     * Sets the runningId value for this ECLGraphEx.
     * 
     * @param runningId
     */
    public void setRunningId(java.lang.Long runningId) {
        this.runningId = runningId;
    }


    /**
     * Gets the complete value for this ECLGraphEx.
     * 
     * @return complete
     */
    public java.lang.Boolean getComplete() {
        return complete;
    }


    /**
     * Sets the complete value for this ECLGraphEx.
     * 
     * @param complete
     */
    public void setComplete(java.lang.Boolean complete) {
        this.complete = complete;
    }


    /**
     * Gets the failed value for this ECLGraphEx.
     * 
     * @return failed
     */
    public java.lang.Boolean getFailed() {
        return failed;
    }


    /**
     * Sets the failed value for this ECLGraphEx.
     * 
     * @param failed
     */
    public void setFailed(java.lang.Boolean failed) {
        this.failed = failed;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ECLGraphEx)) return false;
        ECLGraphEx other = (ECLGraphEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.graph==null && other.getGraph()==null) || 
             (this.graph!=null &&
              this.graph.equals(other.getGraph()))) &&
            ((this.running==null && other.getRunning()==null) || 
             (this.running!=null &&
              this.running.equals(other.getRunning()))) &&
            ((this.runningId==null && other.getRunningId()==null) || 
             (this.runningId!=null &&
              this.runningId.equals(other.getRunningId()))) &&
            ((this.complete==null && other.getComplete()==null) || 
             (this.complete!=null &&
              this.complete.equals(other.getComplete()))) &&
            ((this.failed==null && other.getFailed()==null) || 
             (this.failed!=null &&
              this.failed.equals(other.getFailed())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getGraph() != null) {
            _hashCode += getGraph().hashCode();
        }
        if (getRunning() != null) {
            _hashCode += getRunning().hashCode();
        }
        if (getRunningId() != null) {
            _hashCode += getRunningId().hashCode();
        }
        if (getComplete() != null) {
            _hashCode += getComplete().hashCode();
        }
        if (getFailed() != null) {
            _hashCode += getFailed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ECLGraphEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLGraphEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graph");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Graph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("running");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Running"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RunningId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Complete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Failed"));
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
