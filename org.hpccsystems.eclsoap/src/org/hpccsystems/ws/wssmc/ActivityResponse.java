/**
 * ActivityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wssmc;

public class ActivityResponse  implements java.io.Serializable {
    private ArrayOfEspException exceptions;

    private java.lang.String build;

    private ThorCluster[] thorClusters;

    private RoxieCluster[] roxieClusters;

    private HThorCluster[] HThorClusters;

    private DFUJob[] DFUJobs;

    private ActiveWorkunit[] running;

    private java.lang.String bannerContent;

    private java.lang.String bannerColor;

    private java.lang.String bannerSize;

    private java.lang.String bannerScroll;

    private java.lang.String chatURL;

    private java.lang.Integer showBanner;

    private java.lang.Integer showChatURL;

    private java.lang.String sortBy;

    private java.lang.Boolean descending;

    private java.lang.Boolean superUser;

    private java.lang.String accessRight;

    private ServerJobQueue[] serverJobQueues;

    public ActivityResponse() {
    }

    public ActivityResponse(
           ArrayOfEspException exceptions,
           java.lang.String build,
           ThorCluster[] thorClusters,
           RoxieCluster[] roxieClusters,
           HThorCluster[] HThorClusters,
           DFUJob[] DFUJobs,
           ActiveWorkunit[] running,
           java.lang.String bannerContent,
           java.lang.String bannerColor,
           java.lang.String bannerSize,
           java.lang.String bannerScroll,
           java.lang.String chatURL,
           java.lang.Integer showBanner,
           java.lang.Integer showChatURL,
           java.lang.String sortBy,
           java.lang.Boolean descending,
           java.lang.Boolean superUser,
           java.lang.String accessRight,
           ServerJobQueue[] serverJobQueues) {
           this.exceptions = exceptions;
           this.build = build;
           this.thorClusters = thorClusters;
           this.roxieClusters = roxieClusters;
           this.HThorClusters = HThorClusters;
           this.DFUJobs = DFUJobs;
           this.running = running;
           this.bannerContent = bannerContent;
           this.bannerColor = bannerColor;
           this.bannerSize = bannerSize;
           this.bannerScroll = bannerScroll;
           this.chatURL = chatURL;
           this.showBanner = showBanner;
           this.showChatURL = showChatURL;
           this.sortBy = sortBy;
           this.descending = descending;
           this.superUser = superUser;
           this.accessRight = accessRight;
           this.serverJobQueues = serverJobQueues;
    }


    /**
     * Gets the exceptions value for this ActivityResponse.
     * 
     * @return exceptions
     */
    public ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this ActivityResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the build value for this ActivityResponse.
     * 
     * @return build
     */
    public java.lang.String getBuild() {
        return build;
    }


    /**
     * Sets the build value for this ActivityResponse.
     * 
     * @param build
     */
    public void setBuild(java.lang.String build) {
        this.build = build;
    }


    /**
     * Gets the thorClusters value for this ActivityResponse.
     * 
     * @return thorClusters
     */
    public ThorCluster[] getThorClusters() {
        return thorClusters;
    }


    /**
     * Sets the thorClusters value for this ActivityResponse.
     * 
     * @param thorClusters
     */
    public void setThorClusters(ThorCluster[] thorClusters) {
        this.thorClusters = thorClusters;
    }


    /**
     * Gets the roxieClusters value for this ActivityResponse.
     * 
     * @return roxieClusters
     */
    public RoxieCluster[] getRoxieClusters() {
        return roxieClusters;
    }


    /**
     * Sets the roxieClusters value for this ActivityResponse.
     * 
     * @param roxieClusters
     */
    public void setRoxieClusters(RoxieCluster[] roxieClusters) {
        this.roxieClusters = roxieClusters;
    }


    /**
     * Gets the HThorClusters value for this ActivityResponse.
     * 
     * @return HThorClusters
     */
    public HThorCluster[] getHThorClusters() {
        return HThorClusters;
    }


    /**
     * Sets the HThorClusters value for this ActivityResponse.
     * 
     * @param HThorClusters
     */
    public void setHThorClusters(HThorCluster[] HThorClusters) {
        this.HThorClusters = HThorClusters;
    }


    /**
     * Gets the DFUJobs value for this ActivityResponse.
     * 
     * @return DFUJobs
     */
    public DFUJob[] getDFUJobs() {
        return DFUJobs;
    }


    /**
     * Sets the DFUJobs value for this ActivityResponse.
     * 
     * @param DFUJobs
     */
    public void setDFUJobs(DFUJob[] DFUJobs) {
        this.DFUJobs = DFUJobs;
    }


    /**
     * Gets the running value for this ActivityResponse.
     * 
     * @return running
     */
    public ActiveWorkunit[] getRunning() {
        return running;
    }


    /**
     * Sets the running value for this ActivityResponse.
     * 
     * @param running
     */
    public void setRunning(ActiveWorkunit[] running) {
        this.running = running;
    }


    /**
     * Gets the bannerContent value for this ActivityResponse.
     * 
     * @return bannerContent
     */
    public java.lang.String getBannerContent() {
        return bannerContent;
    }


    /**
     * Sets the bannerContent value for this ActivityResponse.
     * 
     * @param bannerContent
     */
    public void setBannerContent(java.lang.String bannerContent) {
        this.bannerContent = bannerContent;
    }


    /**
     * Gets the bannerColor value for this ActivityResponse.
     * 
     * @return bannerColor
     */
    public java.lang.String getBannerColor() {
        return bannerColor;
    }


    /**
     * Sets the bannerColor value for this ActivityResponse.
     * 
     * @param bannerColor
     */
    public void setBannerColor(java.lang.String bannerColor) {
        this.bannerColor = bannerColor;
    }


    /**
     * Gets the bannerSize value for this ActivityResponse.
     * 
     * @return bannerSize
     */
    public java.lang.String getBannerSize() {
        return bannerSize;
    }


    /**
     * Sets the bannerSize value for this ActivityResponse.
     * 
     * @param bannerSize
     */
    public void setBannerSize(java.lang.String bannerSize) {
        this.bannerSize = bannerSize;
    }


    /**
     * Gets the bannerScroll value for this ActivityResponse.
     * 
     * @return bannerScroll
     */
    public java.lang.String getBannerScroll() {
        return bannerScroll;
    }


    /**
     * Sets the bannerScroll value for this ActivityResponse.
     * 
     * @param bannerScroll
     */
    public void setBannerScroll(java.lang.String bannerScroll) {
        this.bannerScroll = bannerScroll;
    }


    /**
     * Gets the chatURL value for this ActivityResponse.
     * 
     * @return chatURL
     */
    public java.lang.String getChatURL() {
        return chatURL;
    }


    /**
     * Sets the chatURL value for this ActivityResponse.
     * 
     * @param chatURL
     */
    public void setChatURL(java.lang.String chatURL) {
        this.chatURL = chatURL;
    }


    /**
     * Gets the showBanner value for this ActivityResponse.
     * 
     * @return showBanner
     */
    public java.lang.Integer getShowBanner() {
        return showBanner;
    }


    /**
     * Sets the showBanner value for this ActivityResponse.
     * 
     * @param showBanner
     */
    public void setShowBanner(java.lang.Integer showBanner) {
        this.showBanner = showBanner;
    }


    /**
     * Gets the showChatURL value for this ActivityResponse.
     * 
     * @return showChatURL
     */
    public java.lang.Integer getShowChatURL() {
        return showChatURL;
    }


    /**
     * Sets the showChatURL value for this ActivityResponse.
     * 
     * @param showChatURL
     */
    public void setShowChatURL(java.lang.Integer showChatURL) {
        this.showChatURL = showChatURL;
    }


    /**
     * Gets the sortBy value for this ActivityResponse.
     * 
     * @return sortBy
     */
    public java.lang.String getSortBy() {
        return sortBy;
    }


    /**
     * Sets the sortBy value for this ActivityResponse.
     * 
     * @param sortBy
     */
    public void setSortBy(java.lang.String sortBy) {
        this.sortBy = sortBy;
    }


    /**
     * Gets the descending value for this ActivityResponse.
     * 
     * @return descending
     */
    public java.lang.Boolean getDescending() {
        return descending;
    }


    /**
     * Sets the descending value for this ActivityResponse.
     * 
     * @param descending
     */
    public void setDescending(java.lang.Boolean descending) {
        this.descending = descending;
    }


    /**
     * Gets the superUser value for this ActivityResponse.
     * 
     * @return superUser
     */
    public java.lang.Boolean getSuperUser() {
        return superUser;
    }


    /**
     * Sets the superUser value for this ActivityResponse.
     * 
     * @param superUser
     */
    public void setSuperUser(java.lang.Boolean superUser) {
        this.superUser = superUser;
    }


    /**
     * Gets the accessRight value for this ActivityResponse.
     * 
     * @return accessRight
     */
    public java.lang.String getAccessRight() {
        return accessRight;
    }


    /**
     * Sets the accessRight value for this ActivityResponse.
     * 
     * @param accessRight
     */
    public void setAccessRight(java.lang.String accessRight) {
        this.accessRight = accessRight;
    }


    /**
     * Gets the serverJobQueues value for this ActivityResponse.
     * 
     * @return serverJobQueues
     */
    public ServerJobQueue[] getServerJobQueues() {
        return serverJobQueues;
    }


    /**
     * Sets the serverJobQueues value for this ActivityResponse.
     * 
     * @param serverJobQueues
     */
    public void setServerJobQueues(ServerJobQueue[] serverJobQueues) {
        this.serverJobQueues = serverJobQueues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActivityResponse)) return false;
        ActivityResponse other = (ActivityResponse) obj;
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
            ((this.build==null && other.getBuild()==null) || 
             (this.build!=null &&
              this.build.equals(other.getBuild()))) &&
            ((this.thorClusters==null && other.getThorClusters()==null) || 
             (this.thorClusters!=null &&
              java.util.Arrays.equals(this.thorClusters, other.getThorClusters()))) &&
            ((this.roxieClusters==null && other.getRoxieClusters()==null) || 
             (this.roxieClusters!=null &&
              java.util.Arrays.equals(this.roxieClusters, other.getRoxieClusters()))) &&
            ((this.HThorClusters==null && other.getHThorClusters()==null) || 
             (this.HThorClusters!=null &&
              java.util.Arrays.equals(this.HThorClusters, other.getHThorClusters()))) &&
            ((this.DFUJobs==null && other.getDFUJobs()==null) || 
             (this.DFUJobs!=null &&
              java.util.Arrays.equals(this.DFUJobs, other.getDFUJobs()))) &&
            ((this.running==null && other.getRunning()==null) || 
             (this.running!=null &&
              java.util.Arrays.equals(this.running, other.getRunning()))) &&
            ((this.bannerContent==null && other.getBannerContent()==null) || 
             (this.bannerContent!=null &&
              this.bannerContent.equals(other.getBannerContent()))) &&
            ((this.bannerColor==null && other.getBannerColor()==null) || 
             (this.bannerColor!=null &&
              this.bannerColor.equals(other.getBannerColor()))) &&
            ((this.bannerSize==null && other.getBannerSize()==null) || 
             (this.bannerSize!=null &&
              this.bannerSize.equals(other.getBannerSize()))) &&
            ((this.bannerScroll==null && other.getBannerScroll()==null) || 
             (this.bannerScroll!=null &&
              this.bannerScroll.equals(other.getBannerScroll()))) &&
            ((this.chatURL==null && other.getChatURL()==null) || 
             (this.chatURL!=null &&
              this.chatURL.equals(other.getChatURL()))) &&
            ((this.showBanner==null && other.getShowBanner()==null) || 
             (this.showBanner!=null &&
              this.showBanner.equals(other.getShowBanner()))) &&
            ((this.showChatURL==null && other.getShowChatURL()==null) || 
             (this.showChatURL!=null &&
              this.showChatURL.equals(other.getShowChatURL()))) &&
            ((this.sortBy==null && other.getSortBy()==null) || 
             (this.sortBy!=null &&
              this.sortBy.equals(other.getSortBy()))) &&
            ((this.descending==null && other.getDescending()==null) || 
             (this.descending!=null &&
              this.descending.equals(other.getDescending()))) &&
            ((this.superUser==null && other.getSuperUser()==null) || 
             (this.superUser!=null &&
              this.superUser.equals(other.getSuperUser()))) &&
            ((this.accessRight==null && other.getAccessRight()==null) || 
             (this.accessRight!=null &&
              this.accessRight.equals(other.getAccessRight()))) &&
            ((this.serverJobQueues==null && other.getServerJobQueues()==null) || 
             (this.serverJobQueues!=null &&
              java.util.Arrays.equals(this.serverJobQueues, other.getServerJobQueues())));
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
        if (getBuild() != null) {
            _hashCode += getBuild().hashCode();
        }
        if (getThorClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThorClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThorClusters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoxieClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoxieClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoxieClusters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHThorClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHThorClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHThorClusters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDFUJobs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDFUJobs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDFUJobs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRunning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRunning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRunning(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBannerContent() != null) {
            _hashCode += getBannerContent().hashCode();
        }
        if (getBannerColor() != null) {
            _hashCode += getBannerColor().hashCode();
        }
        if (getBannerSize() != null) {
            _hashCode += getBannerSize().hashCode();
        }
        if (getBannerScroll() != null) {
            _hashCode += getBannerScroll().hashCode();
        }
        if (getChatURL() != null) {
            _hashCode += getChatURL().hashCode();
        }
        if (getShowBanner() != null) {
            _hashCode += getShowBanner().hashCode();
        }
        if (getShowChatURL() != null) {
            _hashCode += getShowChatURL().hashCode();
        }
        if (getSortBy() != null) {
            _hashCode += getSortBy().hashCode();
        }
        if (getDescending() != null) {
            _hashCode += getDescending().hashCode();
        }
        if (getSuperUser() != null) {
            _hashCode += getSuperUser().hashCode();
        }
        if (getAccessRight() != null) {
            _hashCode += getAccessRight().hashCode();
        }
        if (getServerJobQueues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServerJobQueues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServerJobQueues(), i);
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
        new org.apache.axis.description.TypeDesc(ActivityResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">ActivityResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("build");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Build"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thorClusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorClusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorCluster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorCluster"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roxieClusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieClusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieCluster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieCluster"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HThorClusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HThorClusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HThorCluster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HThorCluster"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFUJobs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJobs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJob"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJob"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("running");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Running"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActiveWorkunit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActiveWorkunit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bannerContent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bannerColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bannerSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bannerScroll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerScroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ChatURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showBanner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ShowBanner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showChatURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ShowChatURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SortBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Descending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SuperUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessRight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "AccessRight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverJobQueues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueue"));
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
