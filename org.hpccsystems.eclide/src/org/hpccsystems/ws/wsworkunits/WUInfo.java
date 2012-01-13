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
 * WUInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUInfo  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.Boolean truncateEclTo64K;

    private java.lang.String type;

    private java.lang.Boolean includeExceptions;

    private java.lang.Boolean includeGraphs;

    private java.lang.Boolean includeSourceFiles;

    private java.lang.Boolean includeResults;

    private java.lang.Boolean includeResultsViewNames;

    private java.lang.Boolean includeVariables;

    private java.lang.Boolean includeTimers;

    private java.lang.Boolean includeDebugValues;

    private java.lang.Boolean includeApplicationValues;

    private java.lang.Boolean includeWorkflows;

    private java.lang.Boolean suppressResultSchemas;

    private java.lang.String thorSlaveIP;

    public WUInfo() {
    }

    public WUInfo(
           java.lang.String wuid,
           java.lang.Boolean truncateEclTo64K,
           java.lang.String type,
           java.lang.Boolean includeExceptions,
           java.lang.Boolean includeGraphs,
           java.lang.Boolean includeSourceFiles,
           java.lang.Boolean includeResults,
           java.lang.Boolean includeResultsViewNames,
           java.lang.Boolean includeVariables,
           java.lang.Boolean includeTimers,
           java.lang.Boolean includeDebugValues,
           java.lang.Boolean includeApplicationValues,
           java.lang.Boolean includeWorkflows,
           java.lang.Boolean suppressResultSchemas,
           java.lang.String thorSlaveIP) {
           this.wuid = wuid;
           this.truncateEclTo64K = truncateEclTo64K;
           this.type = type;
           this.includeExceptions = includeExceptions;
           this.includeGraphs = includeGraphs;
           this.includeSourceFiles = includeSourceFiles;
           this.includeResults = includeResults;
           this.includeResultsViewNames = includeResultsViewNames;
           this.includeVariables = includeVariables;
           this.includeTimers = includeTimers;
           this.includeDebugValues = includeDebugValues;
           this.includeApplicationValues = includeApplicationValues;
           this.includeWorkflows = includeWorkflows;
           this.suppressResultSchemas = suppressResultSchemas;
           this.thorSlaveIP = thorSlaveIP;
    }


    /**
     * Gets the wuid value for this WUInfo.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WUInfo.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the truncateEclTo64K value for this WUInfo.
     * 
     * @return truncateEclTo64K
     */
    public java.lang.Boolean getTruncateEclTo64K() {
        return truncateEclTo64K;
    }


    /**
     * Sets the truncateEclTo64K value for this WUInfo.
     * 
     * @param truncateEclTo64K
     */
    public void setTruncateEclTo64K(java.lang.Boolean truncateEclTo64K) {
        this.truncateEclTo64K = truncateEclTo64K;
    }


    /**
     * Gets the type value for this WUInfo.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this WUInfo.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the includeExceptions value for this WUInfo.
     * 
     * @return includeExceptions
     */
    public java.lang.Boolean getIncludeExceptions() {
        return includeExceptions;
    }


    /**
     * Sets the includeExceptions value for this WUInfo.
     * 
     * @param includeExceptions
     */
    public void setIncludeExceptions(java.lang.Boolean includeExceptions) {
        this.includeExceptions = includeExceptions;
    }


    /**
     * Gets the includeGraphs value for this WUInfo.
     * 
     * @return includeGraphs
     */
    public java.lang.Boolean getIncludeGraphs() {
        return includeGraphs;
    }


    /**
     * Sets the includeGraphs value for this WUInfo.
     * 
     * @param includeGraphs
     */
    public void setIncludeGraphs(java.lang.Boolean includeGraphs) {
        this.includeGraphs = includeGraphs;
    }


    /**
     * Gets the includeSourceFiles value for this WUInfo.
     * 
     * @return includeSourceFiles
     */
    public java.lang.Boolean getIncludeSourceFiles() {
        return includeSourceFiles;
    }


    /**
     * Sets the includeSourceFiles value for this WUInfo.
     * 
     * @param includeSourceFiles
     */
    public void setIncludeSourceFiles(java.lang.Boolean includeSourceFiles) {
        this.includeSourceFiles = includeSourceFiles;
    }


    /**
     * Gets the includeResults value for this WUInfo.
     * 
     * @return includeResults
     */
    public java.lang.Boolean getIncludeResults() {
        return includeResults;
    }


    /**
     * Sets the includeResults value for this WUInfo.
     * 
     * @param includeResults
     */
    public void setIncludeResults(java.lang.Boolean includeResults) {
        this.includeResults = includeResults;
    }


    /**
     * Gets the includeResultsViewNames value for this WUInfo.
     * 
     * @return includeResultsViewNames
     */
    public java.lang.Boolean getIncludeResultsViewNames() {
        return includeResultsViewNames;
    }


    /**
     * Sets the includeResultsViewNames value for this WUInfo.
     * 
     * @param includeResultsViewNames
     */
    public void setIncludeResultsViewNames(java.lang.Boolean includeResultsViewNames) {
        this.includeResultsViewNames = includeResultsViewNames;
    }


    /**
     * Gets the includeVariables value for this WUInfo.
     * 
     * @return includeVariables
     */
    public java.lang.Boolean getIncludeVariables() {
        return includeVariables;
    }


    /**
     * Sets the includeVariables value for this WUInfo.
     * 
     * @param includeVariables
     */
    public void setIncludeVariables(java.lang.Boolean includeVariables) {
        this.includeVariables = includeVariables;
    }


    /**
     * Gets the includeTimers value for this WUInfo.
     * 
     * @return includeTimers
     */
    public java.lang.Boolean getIncludeTimers() {
        return includeTimers;
    }


    /**
     * Sets the includeTimers value for this WUInfo.
     * 
     * @param includeTimers
     */
    public void setIncludeTimers(java.lang.Boolean includeTimers) {
        this.includeTimers = includeTimers;
    }


    /**
     * Gets the includeDebugValues value for this WUInfo.
     * 
     * @return includeDebugValues
     */
    public java.lang.Boolean getIncludeDebugValues() {
        return includeDebugValues;
    }


    /**
     * Sets the includeDebugValues value for this WUInfo.
     * 
     * @param includeDebugValues
     */
    public void setIncludeDebugValues(java.lang.Boolean includeDebugValues) {
        this.includeDebugValues = includeDebugValues;
    }


    /**
     * Gets the includeApplicationValues value for this WUInfo.
     * 
     * @return includeApplicationValues
     */
    public java.lang.Boolean getIncludeApplicationValues() {
        return includeApplicationValues;
    }


    /**
     * Sets the includeApplicationValues value for this WUInfo.
     * 
     * @param includeApplicationValues
     */
    public void setIncludeApplicationValues(java.lang.Boolean includeApplicationValues) {
        this.includeApplicationValues = includeApplicationValues;
    }


    /**
     * Gets the includeWorkflows value for this WUInfo.
     * 
     * @return includeWorkflows
     */
    public java.lang.Boolean getIncludeWorkflows() {
        return includeWorkflows;
    }


    /**
     * Sets the includeWorkflows value for this WUInfo.
     * 
     * @param includeWorkflows
     */
    public void setIncludeWorkflows(java.lang.Boolean includeWorkflows) {
        this.includeWorkflows = includeWorkflows;
    }


    /**
     * Gets the suppressResultSchemas value for this WUInfo.
     * 
     * @return suppressResultSchemas
     */
    public java.lang.Boolean getSuppressResultSchemas() {
        return suppressResultSchemas;
    }


    /**
     * Sets the suppressResultSchemas value for this WUInfo.
     * 
     * @param suppressResultSchemas
     */
    public void setSuppressResultSchemas(java.lang.Boolean suppressResultSchemas) {
        this.suppressResultSchemas = suppressResultSchemas;
    }


    /**
     * Gets the thorSlaveIP value for this WUInfo.
     * 
     * @return thorSlaveIP
     */
    public java.lang.String getThorSlaveIP() {
        return thorSlaveIP;
    }


    /**
     * Sets the thorSlaveIP value for this WUInfo.
     * 
     * @param thorSlaveIP
     */
    public void setThorSlaveIP(java.lang.String thorSlaveIP) {
        this.thorSlaveIP = thorSlaveIP;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUInfo)) return false;
        WUInfo other = (WUInfo) obj;
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
            ((this.truncateEclTo64K==null && other.getTruncateEclTo64K()==null) || 
             (this.truncateEclTo64K!=null &&
              this.truncateEclTo64K.equals(other.getTruncateEclTo64K()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.includeExceptions==null && other.getIncludeExceptions()==null) || 
             (this.includeExceptions!=null &&
              this.includeExceptions.equals(other.getIncludeExceptions()))) &&
            ((this.includeGraphs==null && other.getIncludeGraphs()==null) || 
             (this.includeGraphs!=null &&
              this.includeGraphs.equals(other.getIncludeGraphs()))) &&
            ((this.includeSourceFiles==null && other.getIncludeSourceFiles()==null) || 
             (this.includeSourceFiles!=null &&
              this.includeSourceFiles.equals(other.getIncludeSourceFiles()))) &&
            ((this.includeResults==null && other.getIncludeResults()==null) || 
             (this.includeResults!=null &&
              this.includeResults.equals(other.getIncludeResults()))) &&
            ((this.includeResultsViewNames==null && other.getIncludeResultsViewNames()==null) || 
             (this.includeResultsViewNames!=null &&
              this.includeResultsViewNames.equals(other.getIncludeResultsViewNames()))) &&
            ((this.includeVariables==null && other.getIncludeVariables()==null) || 
             (this.includeVariables!=null &&
              this.includeVariables.equals(other.getIncludeVariables()))) &&
            ((this.includeTimers==null && other.getIncludeTimers()==null) || 
             (this.includeTimers!=null &&
              this.includeTimers.equals(other.getIncludeTimers()))) &&
            ((this.includeDebugValues==null && other.getIncludeDebugValues()==null) || 
             (this.includeDebugValues!=null &&
              this.includeDebugValues.equals(other.getIncludeDebugValues()))) &&
            ((this.includeApplicationValues==null && other.getIncludeApplicationValues()==null) || 
             (this.includeApplicationValues!=null &&
              this.includeApplicationValues.equals(other.getIncludeApplicationValues()))) &&
            ((this.includeWorkflows==null && other.getIncludeWorkflows()==null) || 
             (this.includeWorkflows!=null &&
              this.includeWorkflows.equals(other.getIncludeWorkflows()))) &&
            ((this.suppressResultSchemas==null && other.getSuppressResultSchemas()==null) || 
             (this.suppressResultSchemas!=null &&
              this.suppressResultSchemas.equals(other.getSuppressResultSchemas()))) &&
            ((this.thorSlaveIP==null && other.getThorSlaveIP()==null) || 
             (this.thorSlaveIP!=null &&
              this.thorSlaveIP.equals(other.getThorSlaveIP())));
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
        if (getTruncateEclTo64K() != null) {
            _hashCode += getTruncateEclTo64K().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIncludeExceptions() != null) {
            _hashCode += getIncludeExceptions().hashCode();
        }
        if (getIncludeGraphs() != null) {
            _hashCode += getIncludeGraphs().hashCode();
        }
        if (getIncludeSourceFiles() != null) {
            _hashCode += getIncludeSourceFiles().hashCode();
        }
        if (getIncludeResults() != null) {
            _hashCode += getIncludeResults().hashCode();
        }
        if (getIncludeResultsViewNames() != null) {
            _hashCode += getIncludeResultsViewNames().hashCode();
        }
        if (getIncludeVariables() != null) {
            _hashCode += getIncludeVariables().hashCode();
        }
        if (getIncludeTimers() != null) {
            _hashCode += getIncludeTimers().hashCode();
        }
        if (getIncludeDebugValues() != null) {
            _hashCode += getIncludeDebugValues().hashCode();
        }
        if (getIncludeApplicationValues() != null) {
            _hashCode += getIncludeApplicationValues().hashCode();
        }
        if (getIncludeWorkflows() != null) {
            _hashCode += getIncludeWorkflows().hashCode();
        }
        if (getSuppressResultSchemas() != null) {
            _hashCode += getSuppressResultSchemas().hashCode();
        }
        if (getThorSlaveIP() != null) {
            _hashCode += getThorSlaveIP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("truncateEclTo64K");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TruncateEclTo64k"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("includeExceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeExceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeGraphs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeGraphs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSourceFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeSourceFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeResultsViewNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeResultsViewNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeVariables");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeVariables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeTimers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeTimers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDebugValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeDebugValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeApplicationValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeApplicationValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeWorkflows");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeWorkflows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppressResultSchemas");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SuppressResultSchemas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
