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
 * TpLogFileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public class TpLogFileResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions;

    private java.lang.String name;

    private java.lang.String type;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.Integer lastHours;

    private java.lang.Integer firstRows;

    private java.lang.Integer lastRows;

    private java.lang.Boolean reversely;

    private java.lang.Boolean zip;

    private java.lang.Integer filterType;

    private java.lang.String logData;

    private java.lang.Boolean hasDate;

    private java.lang.Long fileSize;

    private java.lang.Long pageFrom;

    private java.lang.Long pageTo;

    private java.lang.Integer pageNumber;

    private java.lang.Integer prevPage;

    private java.lang.Integer nextPage;

    private java.lang.Integer totalPages;

    private byte[] thefile;

    public TpLogFileResponse() {
    }

    public TpLogFileResponse(
           org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions,
           java.lang.String name,
           java.lang.String type,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.Integer lastHours,
           java.lang.Integer firstRows,
           java.lang.Integer lastRows,
           java.lang.Boolean reversely,
           java.lang.Boolean zip,
           java.lang.Integer filterType,
           java.lang.String logData,
           java.lang.Boolean hasDate,
           java.lang.Long fileSize,
           java.lang.Long pageFrom,
           java.lang.Long pageTo,
           java.lang.Integer pageNumber,
           java.lang.Integer prevPage,
           java.lang.Integer nextPage,
           java.lang.Integer totalPages,
           byte[] thefile) {
           this.exceptions = exceptions;
           this.name = name;
           this.type = type;
           this.startDate = startDate;
           this.endDate = endDate;
           this.lastHours = lastHours;
           this.firstRows = firstRows;
           this.lastRows = lastRows;
           this.reversely = reversely;
           this.zip = zip;
           this.filterType = filterType;
           this.logData = logData;
           this.hasDate = hasDate;
           this.fileSize = fileSize;
           this.pageFrom = pageFrom;
           this.pageTo = pageTo;
           this.pageNumber = pageNumber;
           this.prevPage = prevPage;
           this.nextPage = nextPage;
           this.totalPages = totalPages;
           this.thefile = thefile;
    }


    /**
     * Gets the exceptions value for this TpLogFileResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wstopology.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this TpLogFileResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wstopology.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the name value for this TpLogFileResponse.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TpLogFileResponse.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this TpLogFileResponse.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TpLogFileResponse.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the startDate value for this TpLogFileResponse.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TpLogFileResponse.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TpLogFileResponse.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TpLogFileResponse.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the lastHours value for this TpLogFileResponse.
     * 
     * @return lastHours
     */
    public java.lang.Integer getLastHours() {
        return lastHours;
    }


    /**
     * Sets the lastHours value for this TpLogFileResponse.
     * 
     * @param lastHours
     */
    public void setLastHours(java.lang.Integer lastHours) {
        this.lastHours = lastHours;
    }


    /**
     * Gets the firstRows value for this TpLogFileResponse.
     * 
     * @return firstRows
     */
    public java.lang.Integer getFirstRows() {
        return firstRows;
    }


    /**
     * Sets the firstRows value for this TpLogFileResponse.
     * 
     * @param firstRows
     */
    public void setFirstRows(java.lang.Integer firstRows) {
        this.firstRows = firstRows;
    }


    /**
     * Gets the lastRows value for this TpLogFileResponse.
     * 
     * @return lastRows
     */
    public java.lang.Integer getLastRows() {
        return lastRows;
    }


    /**
     * Sets the lastRows value for this TpLogFileResponse.
     * 
     * @param lastRows
     */
    public void setLastRows(java.lang.Integer lastRows) {
        this.lastRows = lastRows;
    }


    /**
     * Gets the reversely value for this TpLogFileResponse.
     * 
     * @return reversely
     */
    public java.lang.Boolean getReversely() {
        return reversely;
    }


    /**
     * Sets the reversely value for this TpLogFileResponse.
     * 
     * @param reversely
     */
    public void setReversely(java.lang.Boolean reversely) {
        this.reversely = reversely;
    }


    /**
     * Gets the zip value for this TpLogFileResponse.
     * 
     * @return zip
     */
    public java.lang.Boolean getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this TpLogFileResponse.
     * 
     * @param zip
     */
    public void setZip(java.lang.Boolean zip) {
        this.zip = zip;
    }


    /**
     * Gets the filterType value for this TpLogFileResponse.
     * 
     * @return filterType
     */
    public java.lang.Integer getFilterType() {
        return filterType;
    }


    /**
     * Sets the filterType value for this TpLogFileResponse.
     * 
     * @param filterType
     */
    public void setFilterType(java.lang.Integer filterType) {
        this.filterType = filterType;
    }


    /**
     * Gets the logData value for this TpLogFileResponse.
     * 
     * @return logData
     */
    public java.lang.String getLogData() {
        return logData;
    }


    /**
     * Sets the logData value for this TpLogFileResponse.
     * 
     * @param logData
     */
    public void setLogData(java.lang.String logData) {
        this.logData = logData;
    }


    /**
     * Gets the hasDate value for this TpLogFileResponse.
     * 
     * @return hasDate
     */
    public java.lang.Boolean getHasDate() {
        return hasDate;
    }


    /**
     * Sets the hasDate value for this TpLogFileResponse.
     * 
     * @param hasDate
     */
    public void setHasDate(java.lang.Boolean hasDate) {
        this.hasDate = hasDate;
    }


    /**
     * Gets the fileSize value for this TpLogFileResponse.
     * 
     * @return fileSize
     */
    public java.lang.Long getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this TpLogFileResponse.
     * 
     * @param fileSize
     */
    public void setFileSize(java.lang.Long fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the pageFrom value for this TpLogFileResponse.
     * 
     * @return pageFrom
     */
    public java.lang.Long getPageFrom() {
        return pageFrom;
    }


    /**
     * Sets the pageFrom value for this TpLogFileResponse.
     * 
     * @param pageFrom
     */
    public void setPageFrom(java.lang.Long pageFrom) {
        this.pageFrom = pageFrom;
    }


    /**
     * Gets the pageTo value for this TpLogFileResponse.
     * 
     * @return pageTo
     */
    public java.lang.Long getPageTo() {
        return pageTo;
    }


    /**
     * Sets the pageTo value for this TpLogFileResponse.
     * 
     * @param pageTo
     */
    public void setPageTo(java.lang.Long pageTo) {
        this.pageTo = pageTo;
    }


    /**
     * Gets the pageNumber value for this TpLogFileResponse.
     * 
     * @return pageNumber
     */
    public java.lang.Integer getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this TpLogFileResponse.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.lang.Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the prevPage value for this TpLogFileResponse.
     * 
     * @return prevPage
     */
    public java.lang.Integer getPrevPage() {
        return prevPage;
    }


    /**
     * Sets the prevPage value for this TpLogFileResponse.
     * 
     * @param prevPage
     */
    public void setPrevPage(java.lang.Integer prevPage) {
        this.prevPage = prevPage;
    }


    /**
     * Gets the nextPage value for this TpLogFileResponse.
     * 
     * @return nextPage
     */
    public java.lang.Integer getNextPage() {
        return nextPage;
    }


    /**
     * Sets the nextPage value for this TpLogFileResponse.
     * 
     * @param nextPage
     */
    public void setNextPage(java.lang.Integer nextPage) {
        this.nextPage = nextPage;
    }


    /**
     * Gets the totalPages value for this TpLogFileResponse.
     * 
     * @return totalPages
     */
    public java.lang.Integer getTotalPages() {
        return totalPages;
    }


    /**
     * Sets the totalPages value for this TpLogFileResponse.
     * 
     * @param totalPages
     */
    public void setTotalPages(java.lang.Integer totalPages) {
        this.totalPages = totalPages;
    }


    /**
     * Gets the thefile value for this TpLogFileResponse.
     * 
     * @return thefile
     */
    public byte[] getThefile() {
        return thefile;
    }


    /**
     * Sets the thefile value for this TpLogFileResponse.
     * 
     * @param thefile
     */
    public void setThefile(byte[] thefile) {
        this.thefile = thefile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpLogFileResponse)) return false;
        TpLogFileResponse other = (TpLogFileResponse) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.lastHours==null && other.getLastHours()==null) || 
             (this.lastHours!=null &&
              this.lastHours.equals(other.getLastHours()))) &&
            ((this.firstRows==null && other.getFirstRows()==null) || 
             (this.firstRows!=null &&
              this.firstRows.equals(other.getFirstRows()))) &&
            ((this.lastRows==null && other.getLastRows()==null) || 
             (this.lastRows!=null &&
              this.lastRows.equals(other.getLastRows()))) &&
            ((this.reversely==null && other.getReversely()==null) || 
             (this.reversely!=null &&
              this.reversely.equals(other.getReversely()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.filterType==null && other.getFilterType()==null) || 
             (this.filterType!=null &&
              this.filterType.equals(other.getFilterType()))) &&
            ((this.logData==null && other.getLogData()==null) || 
             (this.logData!=null &&
              this.logData.equals(other.getLogData()))) &&
            ((this.hasDate==null && other.getHasDate()==null) || 
             (this.hasDate!=null &&
              this.hasDate.equals(other.getHasDate()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize()))) &&
            ((this.pageFrom==null && other.getPageFrom()==null) || 
             (this.pageFrom!=null &&
              this.pageFrom.equals(other.getPageFrom()))) &&
            ((this.pageTo==null && other.getPageTo()==null) || 
             (this.pageTo!=null &&
              this.pageTo.equals(other.getPageTo()))) &&
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            ((this.prevPage==null && other.getPrevPage()==null) || 
             (this.prevPage!=null &&
              this.prevPage.equals(other.getPrevPage()))) &&
            ((this.nextPage==null && other.getNextPage()==null) || 
             (this.nextPage!=null &&
              this.nextPage.equals(other.getNextPage()))) &&
            ((this.totalPages==null && other.getTotalPages()==null) || 
             (this.totalPages!=null &&
              this.totalPages.equals(other.getTotalPages()))) &&
            ((this.thefile==null && other.getThefile()==null) || 
             (this.thefile!=null &&
              java.util.Arrays.equals(this.thefile, other.getThefile())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExceptions() != null) {
            _hashCode += getExceptions().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getLastHours() != null) {
            _hashCode += getLastHours().hashCode();
        }
        if (getFirstRows() != null) {
            _hashCode += getFirstRows().hashCode();
        }
        if (getLastRows() != null) {
            _hashCode += getLastRows().hashCode();
        }
        if (getReversely() != null) {
            _hashCode += getReversely().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getFilterType() != null) {
            _hashCode += getFilterType().hashCode();
        }
        if (getLogData() != null) {
            _hashCode += getLogData().hashCode();
        }
        if (getHasDate() != null) {
            _hashCode += getHasDate().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        if (getPageFrom() != null) {
            _hashCode += getPageFrom().hashCode();
        }
        if (getPageTo() != null) {
            _hashCode += getPageTo().hashCode();
        }
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getPrevPage() != null) {
            _hashCode += getPrevPage().hashCode();
        }
        if (getNextPage() != null) {
            _hashCode += getNextPage().hashCode();
        }
        if (getTotalPages() != null) {
            _hashCode += getTotalPages().hashCode();
        }
        if (getThefile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThefile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThefile(), i);
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
        new org.apache.axis.description.TypeDesc(TpLogFileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpLogFileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LastHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstRows");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "FirstRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRows");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LastRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversely");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Reversely"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "FilterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "LogData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "HasDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "FileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "PageFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "PageTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "PageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevPage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "PrevPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextPage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "NextPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TotalPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thefile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "thefile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
