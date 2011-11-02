/**
 * WUQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class WUQueryResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions;

    private java.lang.String type;

    private java.lang.String cluster;

    private java.lang.String roxieCluster;

    private java.lang.String owner;

    private java.lang.String state;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String ECL;

    private java.lang.String jobname;

    private java.lang.String logicalFile;

    private java.lang.String logicalFileSearchType;

    private java.lang.String current;

    private java.lang.String next;

    private java.lang.Integer count;

    private java.lang.Long pageSize;

    private java.lang.Long prevPage;

    private java.lang.Long nextPage;

    private java.lang.Long lastPage;

    private java.lang.Integer numWUs;

    private java.lang.Boolean first;

    private java.lang.Long pageStartFrom;

    private java.lang.Long pageEndAt;

    private java.lang.Integer lastNDays;

    private java.lang.String sortby;

    private java.lang.Boolean descending;

    private java.lang.String basicQuery;

    private java.lang.String filters;

    private org.hpccsystems.ws.wsworkunits.ECLWorkunit[] workunits;

    public WUQueryResponse() {
    }

    public WUQueryResponse(
           org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions,
           java.lang.String type,
           java.lang.String cluster,
           java.lang.String roxieCluster,
           java.lang.String owner,
           java.lang.String state,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String ECL,
           java.lang.String jobname,
           java.lang.String logicalFile,
           java.lang.String logicalFileSearchType,
           java.lang.String current,
           java.lang.String next,
           java.lang.Integer count,
           java.lang.Long pageSize,
           java.lang.Long prevPage,
           java.lang.Long nextPage,
           java.lang.Long lastPage,
           java.lang.Integer numWUs,
           java.lang.Boolean first,
           java.lang.Long pageStartFrom,
           java.lang.Long pageEndAt,
           java.lang.Integer lastNDays,
           java.lang.String sortby,
           java.lang.Boolean descending,
           java.lang.String basicQuery,
           java.lang.String filters,
           org.hpccsystems.ws.wsworkunits.ECLWorkunit[] workunits) {
           this.exceptions = exceptions;
           this.type = type;
           this.cluster = cluster;
           this.roxieCluster = roxieCluster;
           this.owner = owner;
           this.state = state;
           this.startDate = startDate;
           this.endDate = endDate;
           this.ECL = ECL;
           this.jobname = jobname;
           this.logicalFile = logicalFile;
           this.logicalFileSearchType = logicalFileSearchType;
           this.current = current;
           this.next = next;
           this.count = count;
           this.pageSize = pageSize;
           this.prevPage = prevPage;
           this.nextPage = nextPage;
           this.lastPage = lastPage;
           this.numWUs = numWUs;
           this.first = first;
           this.pageStartFrom = pageStartFrom;
           this.pageEndAt = pageEndAt;
           this.lastNDays = lastNDays;
           this.sortby = sortby;
           this.descending = descending;
           this.basicQuery = basicQuery;
           this.filters = filters;
           this.workunits = workunits;
    }


    /**
     * Gets the exceptions value for this WUQueryResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.wsworkunits.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUQueryResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.wsworkunits.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the type value for this WUQueryResponse.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this WUQueryResponse.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the cluster value for this WUQueryResponse.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this WUQueryResponse.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the roxieCluster value for this WUQueryResponse.
     * 
     * @return roxieCluster
     */
    public java.lang.String getRoxieCluster() {
        return roxieCluster;
    }


    /**
     * Sets the roxieCluster value for this WUQueryResponse.
     * 
     * @param roxieCluster
     */
    public void setRoxieCluster(java.lang.String roxieCluster) {
        this.roxieCluster = roxieCluster;
    }


    /**
     * Gets the owner value for this WUQueryResponse.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this WUQueryResponse.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the state value for this WUQueryResponse.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this WUQueryResponse.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the startDate value for this WUQueryResponse.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this WUQueryResponse.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this WUQueryResponse.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this WUQueryResponse.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the ECL value for this WUQueryResponse.
     * 
     * @return ECL
     */
    public java.lang.String getECL() {
        return ECL;
    }


    /**
     * Sets the ECL value for this WUQueryResponse.
     * 
     * @param ECL
     */
    public void setECL(java.lang.String ECL) {
        this.ECL = ECL;
    }


    /**
     * Gets the jobname value for this WUQueryResponse.
     * 
     * @return jobname
     */
    public java.lang.String getJobname() {
        return jobname;
    }


    /**
     * Sets the jobname value for this WUQueryResponse.
     * 
     * @param jobname
     */
    public void setJobname(java.lang.String jobname) {
        this.jobname = jobname;
    }


    /**
     * Gets the logicalFile value for this WUQueryResponse.
     * 
     * @return logicalFile
     */
    public java.lang.String getLogicalFile() {
        return logicalFile;
    }


    /**
     * Sets the logicalFile value for this WUQueryResponse.
     * 
     * @param logicalFile
     */
    public void setLogicalFile(java.lang.String logicalFile) {
        this.logicalFile = logicalFile;
    }


    /**
     * Gets the logicalFileSearchType value for this WUQueryResponse.
     * 
     * @return logicalFileSearchType
     */
    public java.lang.String getLogicalFileSearchType() {
        return logicalFileSearchType;
    }


    /**
     * Sets the logicalFileSearchType value for this WUQueryResponse.
     * 
     * @param logicalFileSearchType
     */
    public void setLogicalFileSearchType(java.lang.String logicalFileSearchType) {
        this.logicalFileSearchType = logicalFileSearchType;
    }


    /**
     * Gets the current value for this WUQueryResponse.
     * 
     * @return current
     */
    public java.lang.String getCurrent() {
        return current;
    }


    /**
     * Sets the current value for this WUQueryResponse.
     * 
     * @param current
     */
    public void setCurrent(java.lang.String current) {
        this.current = current;
    }


    /**
     * Gets the next value for this WUQueryResponse.
     * 
     * @return next
     */
    public java.lang.String getNext() {
        return next;
    }


    /**
     * Sets the next value for this WUQueryResponse.
     * 
     * @param next
     */
    public void setNext(java.lang.String next) {
        this.next = next;
    }


    /**
     * Gets the count value for this WUQueryResponse.
     * 
     * @return count
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this WUQueryResponse.
     * 
     * @param count
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }


    /**
     * Gets the pageSize value for this WUQueryResponse.
     * 
     * @return pageSize
     */
    public java.lang.Long getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this WUQueryResponse.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Long pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the prevPage value for this WUQueryResponse.
     * 
     * @return prevPage
     */
    public java.lang.Long getPrevPage() {
        return prevPage;
    }


    /**
     * Sets the prevPage value for this WUQueryResponse.
     * 
     * @param prevPage
     */
    public void setPrevPage(java.lang.Long prevPage) {
        this.prevPage = prevPage;
    }


    /**
     * Gets the nextPage value for this WUQueryResponse.
     * 
     * @return nextPage
     */
    public java.lang.Long getNextPage() {
        return nextPage;
    }


    /**
     * Sets the nextPage value for this WUQueryResponse.
     * 
     * @param nextPage
     */
    public void setNextPage(java.lang.Long nextPage) {
        this.nextPage = nextPage;
    }


    /**
     * Gets the lastPage value for this WUQueryResponse.
     * 
     * @return lastPage
     */
    public java.lang.Long getLastPage() {
        return lastPage;
    }


    /**
     * Sets the lastPage value for this WUQueryResponse.
     * 
     * @param lastPage
     */
    public void setLastPage(java.lang.Long lastPage) {
        this.lastPage = lastPage;
    }


    /**
     * Gets the numWUs value for this WUQueryResponse.
     * 
     * @return numWUs
     */
    public java.lang.Integer getNumWUs() {
        return numWUs;
    }


    /**
     * Sets the numWUs value for this WUQueryResponse.
     * 
     * @param numWUs
     */
    public void setNumWUs(java.lang.Integer numWUs) {
        this.numWUs = numWUs;
    }


    /**
     * Gets the first value for this WUQueryResponse.
     * 
     * @return first
     */
    public java.lang.Boolean getFirst() {
        return first;
    }


    /**
     * Sets the first value for this WUQueryResponse.
     * 
     * @param first
     */
    public void setFirst(java.lang.Boolean first) {
        this.first = first;
    }


    /**
     * Gets the pageStartFrom value for this WUQueryResponse.
     * 
     * @return pageStartFrom
     */
    public java.lang.Long getPageStartFrom() {
        return pageStartFrom;
    }


    /**
     * Sets the pageStartFrom value for this WUQueryResponse.
     * 
     * @param pageStartFrom
     */
    public void setPageStartFrom(java.lang.Long pageStartFrom) {
        this.pageStartFrom = pageStartFrom;
    }


    /**
     * Gets the pageEndAt value for this WUQueryResponse.
     * 
     * @return pageEndAt
     */
    public java.lang.Long getPageEndAt() {
        return pageEndAt;
    }


    /**
     * Sets the pageEndAt value for this WUQueryResponse.
     * 
     * @param pageEndAt
     */
    public void setPageEndAt(java.lang.Long pageEndAt) {
        this.pageEndAt = pageEndAt;
    }


    /**
     * Gets the lastNDays value for this WUQueryResponse.
     * 
     * @return lastNDays
     */
    public java.lang.Integer getLastNDays() {
        return lastNDays;
    }


    /**
     * Sets the lastNDays value for this WUQueryResponse.
     * 
     * @param lastNDays
     */
    public void setLastNDays(java.lang.Integer lastNDays) {
        this.lastNDays = lastNDays;
    }


    /**
     * Gets the sortby value for this WUQueryResponse.
     * 
     * @return sortby
     */
    public java.lang.String getSortby() {
        return sortby;
    }


    /**
     * Sets the sortby value for this WUQueryResponse.
     * 
     * @param sortby
     */
    public void setSortby(java.lang.String sortby) {
        this.sortby = sortby;
    }


    /**
     * Gets the descending value for this WUQueryResponse.
     * 
     * @return descending
     */
    public java.lang.Boolean getDescending() {
        return descending;
    }


    /**
     * Sets the descending value for this WUQueryResponse.
     * 
     * @param descending
     */
    public void setDescending(java.lang.Boolean descending) {
        this.descending = descending;
    }


    /**
     * Gets the basicQuery value for this WUQueryResponse.
     * 
     * @return basicQuery
     */
    public java.lang.String getBasicQuery() {
        return basicQuery;
    }


    /**
     * Sets the basicQuery value for this WUQueryResponse.
     * 
     * @param basicQuery
     */
    public void setBasicQuery(java.lang.String basicQuery) {
        this.basicQuery = basicQuery;
    }


    /**
     * Gets the filters value for this WUQueryResponse.
     * 
     * @return filters
     */
    public java.lang.String getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this WUQueryResponse.
     * 
     * @param filters
     */
    public void setFilters(java.lang.String filters) {
        this.filters = filters;
    }


    /**
     * Gets the workunits value for this WUQueryResponse.
     * 
     * @return workunits
     */
    public org.hpccsystems.ws.wsworkunits.ECLWorkunit[] getWorkunits() {
        return workunits;
    }


    /**
     * Sets the workunits value for this WUQueryResponse.
     * 
     * @param workunits
     */
    public void setWorkunits(org.hpccsystems.ws.wsworkunits.ECLWorkunit[] workunits) {
        this.workunits = workunits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUQueryResponse)) return false;
        WUQueryResponse other = (WUQueryResponse) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.roxieCluster==null && other.getRoxieCluster()==null) || 
             (this.roxieCluster!=null &&
              this.roxieCluster.equals(other.getRoxieCluster()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.ECL==null && other.getECL()==null) || 
             (this.ECL!=null &&
              this.ECL.equals(other.getECL()))) &&
            ((this.jobname==null && other.getJobname()==null) || 
             (this.jobname!=null &&
              this.jobname.equals(other.getJobname()))) &&
            ((this.logicalFile==null && other.getLogicalFile()==null) || 
             (this.logicalFile!=null &&
              this.logicalFile.equals(other.getLogicalFile()))) &&
            ((this.logicalFileSearchType==null && other.getLogicalFileSearchType()==null) || 
             (this.logicalFileSearchType!=null &&
              this.logicalFileSearchType.equals(other.getLogicalFileSearchType()))) &&
            ((this.current==null && other.getCurrent()==null) || 
             (this.current!=null &&
              this.current.equals(other.getCurrent()))) &&
            ((this.next==null && other.getNext()==null) || 
             (this.next!=null &&
              this.next.equals(other.getNext()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.prevPage==null && other.getPrevPage()==null) || 
             (this.prevPage!=null &&
              this.prevPage.equals(other.getPrevPage()))) &&
            ((this.nextPage==null && other.getNextPage()==null) || 
             (this.nextPage!=null &&
              this.nextPage.equals(other.getNextPage()))) &&
            ((this.lastPage==null && other.getLastPage()==null) || 
             (this.lastPage!=null &&
              this.lastPage.equals(other.getLastPage()))) &&
            ((this.numWUs==null && other.getNumWUs()==null) || 
             (this.numWUs!=null &&
              this.numWUs.equals(other.getNumWUs()))) &&
            ((this.first==null && other.getFirst()==null) || 
             (this.first!=null &&
              this.first.equals(other.getFirst()))) &&
            ((this.pageStartFrom==null && other.getPageStartFrom()==null) || 
             (this.pageStartFrom!=null &&
              this.pageStartFrom.equals(other.getPageStartFrom()))) &&
            ((this.pageEndAt==null && other.getPageEndAt()==null) || 
             (this.pageEndAt!=null &&
              this.pageEndAt.equals(other.getPageEndAt()))) &&
            ((this.lastNDays==null && other.getLastNDays()==null) || 
             (this.lastNDays!=null &&
              this.lastNDays.equals(other.getLastNDays()))) &&
            ((this.sortby==null && other.getSortby()==null) || 
             (this.sortby!=null &&
              this.sortby.equals(other.getSortby()))) &&
            ((this.descending==null && other.getDescending()==null) || 
             (this.descending!=null &&
              this.descending.equals(other.getDescending()))) &&
            ((this.basicQuery==null && other.getBasicQuery()==null) || 
             (this.basicQuery!=null &&
              this.basicQuery.equals(other.getBasicQuery()))) &&
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              this.filters.equals(other.getFilters()))) &&
            ((this.workunits==null && other.getWorkunits()==null) || 
             (this.workunits!=null &&
              java.util.Arrays.equals(this.workunits, other.getWorkunits())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getRoxieCluster() != null) {
            _hashCode += getRoxieCluster().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getECL() != null) {
            _hashCode += getECL().hashCode();
        }
        if (getJobname() != null) {
            _hashCode += getJobname().hashCode();
        }
        if (getLogicalFile() != null) {
            _hashCode += getLogicalFile().hashCode();
        }
        if (getLogicalFileSearchType() != null) {
            _hashCode += getLogicalFileSearchType().hashCode();
        }
        if (getCurrent() != null) {
            _hashCode += getCurrent().hashCode();
        }
        if (getNext() != null) {
            _hashCode += getNext().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getPrevPage() != null) {
            _hashCode += getPrevPage().hashCode();
        }
        if (getNextPage() != null) {
            _hashCode += getNextPage().hashCode();
        }
        if (getLastPage() != null) {
            _hashCode += getLastPage().hashCode();
        }
        if (getNumWUs() != null) {
            _hashCode += getNumWUs().hashCode();
        }
        if (getFirst() != null) {
            _hashCode += getFirst().hashCode();
        }
        if (getPageStartFrom() != null) {
            _hashCode += getPageStartFrom().hashCode();
        }
        if (getPageEndAt() != null) {
            _hashCode += getPageEndAt().hashCode();
        }
        if (getLastNDays() != null) {
            _hashCode += getLastNDays().hashCode();
        }
        if (getSortby() != null) {
            _hashCode += getSortby().hashCode();
        }
        if (getDescending() != null) {
            _hashCode += getDescending().hashCode();
        }
        if (getBasicQuery() != null) {
            _hashCode += getBasicQuery().hashCode();
        }
        if (getFilters() != null) {
            _hashCode += getFilters().hashCode();
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
        new org.apache.axis.description.TypeDesc(WUQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
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
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roxieCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RoxieCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("logicalFile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalFileSearchType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFileSearchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Current"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("next");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Next"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevPage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PrevPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextPage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NextPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LastPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numWUs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NumWUs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "First"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageStartFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageStartFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageEndAt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageEndAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastNDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LastNDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortby");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Sortby"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Descending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BasicQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workunits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Workunits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunit"));
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
