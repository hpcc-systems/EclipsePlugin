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
 * WUCreateAndUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUCreateAndUpdate  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.Integer state;

    private java.lang.Integer stateOrig;

    private java.lang.String jobname;

    private java.lang.String jobnameOrig;

    private java.lang.String queryText;

    private java.lang.Integer action;

    private java.lang.String description;

    private java.lang.String descriptionOrig;

    private java.lang.Boolean addDrilldownFields;

    private java.lang.Integer resultLimit;

    private java.lang.Boolean _protected;

    private java.lang.Boolean protectedOrig;

    private java.lang.Integer priorityClass;

    private java.lang.Integer priorityLevel;

    private java.lang.String scope;

    private java.lang.String scopeOrig;

    private java.lang.String clusterSelection;

    private java.lang.String clusterOrig;

    private java.lang.String xmlParams;

    private java.lang.String thorSlaveIP;

    private org.hpccsystems.ws.wsworkunits.DebugValue[] debugValues;

    private org.hpccsystems.ws.wsworkunits.ApplicationValue[] applicationValues;

    public WUCreateAndUpdate() {
    }

    public WUCreateAndUpdate(
           java.lang.String wuid,
           java.lang.Integer state,
           java.lang.Integer stateOrig,
           java.lang.String jobname,
           java.lang.String jobnameOrig,
           java.lang.String queryText,
           java.lang.Integer action,
           java.lang.String description,
           java.lang.String descriptionOrig,
           java.lang.Boolean addDrilldownFields,
           java.lang.Integer resultLimit,
           java.lang.Boolean _protected,
           java.lang.Boolean protectedOrig,
           java.lang.Integer priorityClass,
           java.lang.Integer priorityLevel,
           java.lang.String scope,
           java.lang.String scopeOrig,
           java.lang.String clusterSelection,
           java.lang.String clusterOrig,
           java.lang.String xmlParams,
           java.lang.String thorSlaveIP,
           org.hpccsystems.ws.wsworkunits.DebugValue[] debugValues,
           org.hpccsystems.ws.wsworkunits.ApplicationValue[] applicationValues) {
           this.wuid = wuid;
           this.state = state;
           this.stateOrig = stateOrig;
           this.jobname = jobname;
           this.jobnameOrig = jobnameOrig;
           this.queryText = queryText;
           this.action = action;
           this.description = description;
           this.descriptionOrig = descriptionOrig;
           this.addDrilldownFields = addDrilldownFields;
           this.resultLimit = resultLimit;
           this._protected = _protected;
           this.protectedOrig = protectedOrig;
           this.priorityClass = priorityClass;
           this.priorityLevel = priorityLevel;
           this.scope = scope;
           this.scopeOrig = scopeOrig;
           this.clusterSelection = clusterSelection;
           this.clusterOrig = clusterOrig;
           this.xmlParams = xmlParams;
           this.thorSlaveIP = thorSlaveIP;
           this.debugValues = debugValues;
           this.applicationValues = applicationValues;
    }


    /**
     * Gets the wuid value for this WUCreateAndUpdate.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUCreateAndUpdate.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the state value for this WUCreateAndUpdate.
     * 
     * @return state
     */
    public java.lang.Integer getState() {
        return state;
    }


    /**
     * Sets the state value for this WUCreateAndUpdate.
     * 
     * @param state
     */
    public void setState(java.lang.Integer state) {
        this.state = state;
    }


    /**
     * Gets the stateOrig value for this WUCreateAndUpdate.
     * 
     * @return stateOrig
     */
    public java.lang.Integer getStateOrig() {
        return stateOrig;
    }


    /**
     * Sets the stateOrig value for this WUCreateAndUpdate.
     * 
     * @param stateOrig
     */
    public void setStateOrig(java.lang.Integer stateOrig) {
        this.stateOrig = stateOrig;
    }


    /**
     * Gets the jobname value for this WUCreateAndUpdate.
     * 
     * @return jobname
     */
    public java.lang.String getJobname() {
        return jobname;
    }


    /**
     * Sets the jobname value for this WUCreateAndUpdate.
     * 
     * @param jobname
     */
    public void setJobname(java.lang.String jobname) {
        this.jobname = jobname;
    }


    /**
     * Gets the jobnameOrig value for this WUCreateAndUpdate.
     * 
     * @return jobnameOrig
     */
    public java.lang.String getJobnameOrig() {
        return jobnameOrig;
    }


    /**
     * Sets the jobnameOrig value for this WUCreateAndUpdate.
     * 
     * @param jobnameOrig
     */
    public void setJobnameOrig(java.lang.String jobnameOrig) {
        this.jobnameOrig = jobnameOrig;
    }


    /**
     * Gets the queryText value for this WUCreateAndUpdate.
     * 
     * @return queryText
     */
    public java.lang.String getQueryText() {
        return queryText;
    }


    /**
     * Sets the queryText value for this WUCreateAndUpdate.
     * 
     * @param queryText
     */
    public void setQueryText(java.lang.String queryText) {
        this.queryText = queryText;
    }


    /**
     * Gets the action value for this WUCreateAndUpdate.
     * 
     * @return action
     */
    public java.lang.Integer getAction() {
        return action;
    }


    /**
     * Sets the action value for this WUCreateAndUpdate.
     * 
     * @param action
     */
    public void setAction(java.lang.Integer action) {
        this.action = action;
    }


    /**
     * Gets the description value for this WUCreateAndUpdate.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WUCreateAndUpdate.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the descriptionOrig value for this WUCreateAndUpdate.
     * 
     * @return descriptionOrig
     */
    public java.lang.String getDescriptionOrig() {
        return descriptionOrig;
    }


    /**
     * Sets the descriptionOrig value for this WUCreateAndUpdate.
     * 
     * @param descriptionOrig
     */
    public void setDescriptionOrig(java.lang.String descriptionOrig) {
        this.descriptionOrig = descriptionOrig;
    }


    /**
     * Gets the addDrilldownFields value for this WUCreateAndUpdate.
     * 
     * @return addDrilldownFields
     */
    public java.lang.Boolean getAddDrilldownFields() {
        return addDrilldownFields;
    }


    /**
     * Sets the addDrilldownFields value for this WUCreateAndUpdate.
     * 
     * @param addDrilldownFields
     */
    public void setAddDrilldownFields(java.lang.Boolean addDrilldownFields) {
        this.addDrilldownFields = addDrilldownFields;
    }


    /**
     * Gets the resultLimit value for this WUCreateAndUpdate.
     * 
     * @return resultLimit
     */
    public java.lang.Integer getResultLimit() {
        return resultLimit;
    }


    /**
     * Sets the resultLimit value for this WUCreateAndUpdate.
     * 
     * @param resultLimit
     */
    public void setResultLimit(java.lang.Integer resultLimit) {
        this.resultLimit = resultLimit;
    }


    /**
     * Gets the _protected value for this WUCreateAndUpdate.
     * 
     * @return _protected
     */
    public java.lang.Boolean get_protected() {
        return _protected;
    }


    /**
     * Sets the _protected value for this WUCreateAndUpdate.
     * 
     * @param _protected
     */
    public void set_protected(java.lang.Boolean _protected) {
        this._protected = _protected;
    }


    /**
     * Gets the protectedOrig value for this WUCreateAndUpdate.
     * 
     * @return protectedOrig
     */
    public java.lang.Boolean getProtectedOrig() {
        return protectedOrig;
    }


    /**
     * Sets the protectedOrig value for this WUCreateAndUpdate.
     * 
     * @param protectedOrig
     */
    public void setProtectedOrig(java.lang.Boolean protectedOrig) {
        this.protectedOrig = protectedOrig;
    }


    /**
     * Gets the priorityClass value for this WUCreateAndUpdate.
     * 
     * @return priorityClass
     */
    public java.lang.Integer getPriorityClass() {
        return priorityClass;
    }


    /**
     * Sets the priorityClass value for this WUCreateAndUpdate.
     * 
     * @param priorityClass
     */
    public void setPriorityClass(java.lang.Integer priorityClass) {
        this.priorityClass = priorityClass;
    }


    /**
     * Gets the priorityLevel value for this WUCreateAndUpdate.
     * 
     * @return priorityLevel
     */
    public java.lang.Integer getPriorityLevel() {
        return priorityLevel;
    }


    /**
     * Sets the priorityLevel value for this WUCreateAndUpdate.
     * 
     * @param priorityLevel
     */
    public void setPriorityLevel(java.lang.Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }


    /**
     * Gets the scope value for this WUCreateAndUpdate.
     * 
     * @return scope
     */
    public java.lang.String getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this WUCreateAndUpdate.
     * 
     * @param scope
     */
    public void setScope(java.lang.String scope) {
        this.scope = scope;
    }


    /**
     * Gets the scopeOrig value for this WUCreateAndUpdate.
     * 
     * @return scopeOrig
     */
    public java.lang.String getScopeOrig() {
        return scopeOrig;
    }


    /**
     * Sets the scopeOrig value for this WUCreateAndUpdate.
     * 
     * @param scopeOrig
     */
    public void setScopeOrig(java.lang.String scopeOrig) {
        this.scopeOrig = scopeOrig;
    }


    /**
     * Gets the clusterSelection value for this WUCreateAndUpdate.
     * 
     * @return clusterSelection
     */
    public java.lang.String getClusterSelection() {
        return clusterSelection;
    }


    /**
     * Sets the clusterSelection value for this WUCreateAndUpdate.
     * 
     * @param clusterSelection
     */
    public void setClusterSelection(java.lang.String clusterSelection) {
        this.clusterSelection = clusterSelection;
    }


    /**
     * Gets the clusterOrig value for this WUCreateAndUpdate.
     * 
     * @return clusterOrig
     */
    public java.lang.String getClusterOrig() {
        return clusterOrig;
    }


    /**
     * Sets the clusterOrig value for this WUCreateAndUpdate.
     * 
     * @param clusterOrig
     */
    public void setClusterOrig(java.lang.String clusterOrig) {
        this.clusterOrig = clusterOrig;
    }


    /**
     * Gets the xmlParams value for this WUCreateAndUpdate.
     * 
     * @return xmlParams
     */
    public java.lang.String getXmlParams() {
        return xmlParams;
    }


    /**
     * Sets the xmlParams value for this WUCreateAndUpdate.
     * 
     * @param xmlParams
     */
    public void setXmlParams(java.lang.String xmlParams) {
        this.xmlParams = xmlParams;
    }


    /**
     * Gets the thorSlaveIP value for this WUCreateAndUpdate.
     * 
     * @return thorSlaveIP
     */
    public java.lang.String getThorSlaveIP() {
        return thorSlaveIP;
    }


    /**
     * Sets the thorSlaveIP value for this WUCreateAndUpdate.
     * 
     * @param thorSlaveIP
     */
    public void setThorSlaveIP(java.lang.String thorSlaveIP) {
        this.thorSlaveIP = thorSlaveIP;
    }


    /**
     * Gets the debugValues value for this WUCreateAndUpdate.
     * 
     * @return debugValues
     */
    public org.hpccsystems.ws.wsworkunits.DebugValue[] getDebugValues() {
        return debugValues;
    }


    /**
     * Sets the debugValues value for this WUCreateAndUpdate.
     * 
     * @param debugValues
     */
    public void setDebugValues(org.hpccsystems.ws.wsworkunits.DebugValue[] debugValues) {
        this.debugValues = debugValues;
    }


    /**
     * Gets the applicationValues value for this WUCreateAndUpdate.
     * 
     * @return applicationValues
     */
    public org.hpccsystems.ws.wsworkunits.ApplicationValue[] getApplicationValues() {
        return applicationValues;
    }


    /**
     * Sets the applicationValues value for this WUCreateAndUpdate.
     * 
     * @param applicationValues
     */
    public void setApplicationValues(org.hpccsystems.ws.wsworkunits.ApplicationValue[] applicationValues) {
        this.applicationValues = applicationValues;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUCreateAndUpdate)) return false;
        WUCreateAndUpdate other = (WUCreateAndUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.stateOrig==null && other.getStateOrig()==null) || 
             (this.stateOrig!=null &&
              this.stateOrig.equals(other.getStateOrig()))) &&
            ((this.jobname==null && other.getJobname()==null) || 
             (this.jobname!=null &&
              this.jobname.equals(other.getJobname()))) &&
            ((this.jobnameOrig==null && other.getJobnameOrig()==null) || 
             (this.jobnameOrig!=null &&
              this.jobnameOrig.equals(other.getJobnameOrig()))) &&
            ((this.queryText==null && other.getQueryText()==null) || 
             (this.queryText!=null &&
              this.queryText.equals(other.getQueryText()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.descriptionOrig==null && other.getDescriptionOrig()==null) || 
             (this.descriptionOrig!=null &&
              this.descriptionOrig.equals(other.getDescriptionOrig()))) &&
            ((this.addDrilldownFields==null && other.getAddDrilldownFields()==null) || 
             (this.addDrilldownFields!=null &&
              this.addDrilldownFields.equals(other.getAddDrilldownFields()))) &&
            ((this.resultLimit==null && other.getResultLimit()==null) || 
             (this.resultLimit!=null &&
              this.resultLimit.equals(other.getResultLimit()))) &&
            ((this._protected==null && other.get_protected()==null) || 
             (this._protected!=null &&
              this._protected.equals(other.get_protected()))) &&
            ((this.protectedOrig==null && other.getProtectedOrig()==null) || 
             (this.protectedOrig!=null &&
              this.protectedOrig.equals(other.getProtectedOrig()))) &&
            ((this.priorityClass==null && other.getPriorityClass()==null) || 
             (this.priorityClass!=null &&
              this.priorityClass.equals(other.getPriorityClass()))) &&
            ((this.priorityLevel==null && other.getPriorityLevel()==null) || 
             (this.priorityLevel!=null &&
              this.priorityLevel.equals(other.getPriorityLevel()))) &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope()))) &&
            ((this.scopeOrig==null && other.getScopeOrig()==null) || 
             (this.scopeOrig!=null &&
              this.scopeOrig.equals(other.getScopeOrig()))) &&
            ((this.clusterSelection==null && other.getClusterSelection()==null) || 
             (this.clusterSelection!=null &&
              this.clusterSelection.equals(other.getClusterSelection()))) &&
            ((this.clusterOrig==null && other.getClusterOrig()==null) || 
             (this.clusterOrig!=null &&
              this.clusterOrig.equals(other.getClusterOrig()))) &&
            ((this.xmlParams==null && other.getXmlParams()==null) || 
             (this.xmlParams!=null &&
              this.xmlParams.equals(other.getXmlParams()))) &&
            ((this.thorSlaveIP==null && other.getThorSlaveIP()==null) || 
             (this.thorSlaveIP!=null &&
              this.thorSlaveIP.equals(other.getThorSlaveIP()))) &&
            ((this.debugValues==null && other.getDebugValues()==null) || 
             (this.debugValues!=null &&
              java.util.Arrays.equals(this.debugValues, other.getDebugValues()))) &&
            ((this.applicationValues==null && other.getApplicationValues()==null) || 
             (this.applicationValues!=null &&
              java.util.Arrays.equals(this.applicationValues, other.getApplicationValues())));
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
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStateOrig() != null) {
            _hashCode += getStateOrig().hashCode();
        }
        if (getJobname() != null) {
            _hashCode += getJobname().hashCode();
        }
        if (getJobnameOrig() != null) {
            _hashCode += getJobnameOrig().hashCode();
        }
        if (getQueryText() != null) {
            _hashCode += getQueryText().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDescriptionOrig() != null) {
            _hashCode += getDescriptionOrig().hashCode();
        }
        if (getAddDrilldownFields() != null) {
            _hashCode += getAddDrilldownFields().hashCode();
        }
        if (getResultLimit() != null) {
            _hashCode += getResultLimit().hashCode();
        }
        if (get_protected() != null) {
            _hashCode += get_protected().hashCode();
        }
        if (getProtectedOrig() != null) {
            _hashCode += getProtectedOrig().hashCode();
        }
        if (getPriorityClass() != null) {
            _hashCode += getPriorityClass().hashCode();
        }
        if (getPriorityLevel() != null) {
            _hashCode += getPriorityLevel().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        if (getScopeOrig() != null) {
            _hashCode += getScopeOrig().hashCode();
        }
        if (getClusterSelection() != null) {
            _hashCode += getClusterSelection().hashCode();
        }
        if (getClusterOrig() != null) {
            _hashCode += getClusterOrig().hashCode();
        }
        if (getXmlParams() != null) {
            _hashCode += getXmlParams().hashCode();
        }
        if (getThorSlaveIP() != null) {
            _hashCode += getThorSlaveIP().hashCode();
        }
        if (getDebugValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDebugValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDebugValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplicationValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicationValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicationValues(), i);
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
        new org.apache.axis.description.TypeDesc(WUCreateAndUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUCreateAndUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StateOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobname");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Jobname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobnameOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "JobnameOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DescriptionOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addDrilldownFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AddDrilldownFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_protected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Protected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectedOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ProtectedOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterSelection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterSelection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlParams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "XmlParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thorSlaveIP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorSlaveIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debugValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue"));
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
