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
 * WUShowScheduledResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUShowScheduledResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions;

    private java.lang.Integer clusterSelected;

    private java.lang.String eventName;

    private java.lang.String pushEventName;

    private java.lang.String pushEventText;

    private java.lang.String query;

    private org.hpccsystems.ws.wsworkunits.ServerInfo[] clusters;

    private org.hpccsystems.ws.wsworkunits.ScheduledWU[] workunits;

    public WUShowScheduledResponse() {
    }

    public WUShowScheduledResponse(
           org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions,
           java.lang.Integer clusterSelected,
           java.lang.String eventName,
           java.lang.String pushEventName,
           java.lang.String pushEventText,
           java.lang.String query,
           org.hpccsystems.ws.wsworkunits.ServerInfo[] clusters,
           org.hpccsystems.ws.wsworkunits.ScheduledWU[] workunits) {
           this.exceptions = exceptions;
           this.clusterSelected = clusterSelected;
           this.eventName = eventName;
           this.pushEventName = pushEventName;
           this.pushEventText = pushEventText;
           this.query = query;
           this.clusters = clusters;
           this.workunits = workunits;
    }


    /**
     * Gets the exceptions value for this WUShowScheduledResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wsworkunits.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUShowScheduledResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the clusterSelected value for this WUShowScheduledResponse.
     * 
     * @return clusterSelected
     */
    public java.lang.Integer getClusterSelected() {
        return clusterSelected;
    }


    /**
     * Sets the clusterSelected value for this WUShowScheduledResponse.
     * 
     * @param clusterSelected
     */
    public void setClusterSelected(java.lang.Integer clusterSelected) {
        this.clusterSelected = clusterSelected;
    }


    /**
     * Gets the eventName value for this WUShowScheduledResponse.
     * 
     * @return eventName
     */
    public java.lang.String getEventName() {
        return eventName;
    }


    /**
     * Sets the eventName value for this WUShowScheduledResponse.
     * 
     * @param eventName
     */
    public void setEventName(java.lang.String eventName) {
        this.eventName = eventName;
    }


    /**
     * Gets the pushEventName value for this WUShowScheduledResponse.
     * 
     * @return pushEventName
     */
    public java.lang.String getPushEventName() {
        return pushEventName;
    }


    /**
     * Sets the pushEventName value for this WUShowScheduledResponse.
     * 
     * @param pushEventName
     */
    public void setPushEventName(java.lang.String pushEventName) {
        this.pushEventName = pushEventName;
    }


    /**
     * Gets the pushEventText value for this WUShowScheduledResponse.
     * 
     * @return pushEventText
     */
    public java.lang.String getPushEventText() {
        return pushEventText;
    }


    /**
     * Sets the pushEventText value for this WUShowScheduledResponse.
     * 
     * @param pushEventText
     */
    public void setPushEventText(java.lang.String pushEventText) {
        this.pushEventText = pushEventText;
    }


    /**
     * Gets the query value for this WUShowScheduledResponse.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this WUShowScheduledResponse.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the clusters value for this WUShowScheduledResponse.
     * 
     * @return clusters
     */
    public org.hpccsystems.ws.wsworkunits.ServerInfo[] getClusters() {
        return clusters;
    }


    /**
     * Sets the clusters value for this WUShowScheduledResponse.
     * 
     * @param clusters
     */
    public void setClusters(org.hpccsystems.ws.wsworkunits.ServerInfo[] clusters) {
        this.clusters = clusters;
    }


    /**
     * Gets the workunits value for this WUShowScheduledResponse.
     * 
     * @return workunits
     */
    public org.hpccsystems.ws.wsworkunits.ScheduledWU[] getWorkunits() {
        return workunits;
    }


    /**
     * Sets the workunits value for this WUShowScheduledResponse.
     * 
     * @param workunits
     */
    public void setWorkunits(org.hpccsystems.ws.wsworkunits.ScheduledWU[] workunits) {
        this.workunits = workunits;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUShowScheduledResponse)) return false;
        WUShowScheduledResponse other = (WUShowScheduledResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exceptions==null && other.getExceptions()==null) || 
             (this.exceptions!=null &&
              this.exceptions.equals(other.getExceptions()))) &&
            ((this.clusterSelected==null && other.getClusterSelected()==null) || 
             (this.clusterSelected!=null &&
              this.clusterSelected.equals(other.getClusterSelected()))) &&
            ((this.eventName==null && other.getEventName()==null) || 
             (this.eventName!=null &&
              this.eventName.equals(other.getEventName()))) &&
            ((this.pushEventName==null && other.getPushEventName()==null) || 
             (this.pushEventName!=null &&
              this.pushEventName.equals(other.getPushEventName()))) &&
            ((this.pushEventText==null && other.getPushEventText()==null) || 
             (this.pushEventText!=null &&
              this.pushEventText.equals(other.getPushEventText()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.clusters==null && other.getClusters()==null) || 
             (this.clusters!=null &&
              java.util.Arrays.equals(this.clusters, other.getClusters()))) &&
            ((this.workunits==null && other.getWorkunits()==null) || 
             (this.workunits!=null &&
              java.util.Arrays.equals(this.workunits, other.getWorkunits())));
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
        if (getClusterSelected() != null) {
            _hashCode += getClusterSelected().hashCode();
        }
        if (getEventName() != null) {
            _hashCode += getEventName().hashCode();
        }
        if (getPushEventName() != null) {
            _hashCode += getPushEventName().hashCode();
        }
        if (getPushEventText() != null) {
            _hashCode += getPushEventText().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkunits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkunits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkunits(), i);
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
        new org.apache.axis.description.TypeDesc(WUShowScheduledResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUShowScheduledResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushEventName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PushEventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushEventText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PushEventText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Clusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ServerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ServerInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workunits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Workunits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScheduledWU"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScheduledWU"));
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
