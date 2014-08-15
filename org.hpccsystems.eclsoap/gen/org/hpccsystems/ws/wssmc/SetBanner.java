/**
 * SetBanner.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wssmc;

public class SetBanner  implements java.io.Serializable {
    private java.lang.String chatURL;

    private java.lang.String bannerContent;

    private java.lang.String bannerColor;

    private java.lang.String bannerSize;

    private java.lang.String bannerScroll;

    private java.lang.Integer bannerAction;

    private java.lang.Boolean enableChatURL;

    private java.lang.Boolean fromSubmitBtn;

    public SetBanner() {
    }

    public SetBanner(
           java.lang.String chatURL,
           java.lang.String bannerContent,
           java.lang.String bannerColor,
           java.lang.String bannerSize,
           java.lang.String bannerScroll,
           java.lang.Integer bannerAction,
           java.lang.Boolean enableChatURL,
           java.lang.Boolean fromSubmitBtn) {
           this.chatURL = chatURL;
           this.bannerContent = bannerContent;
           this.bannerColor = bannerColor;
           this.bannerSize = bannerSize;
           this.bannerScroll = bannerScroll;
           this.bannerAction = bannerAction;
           this.enableChatURL = enableChatURL;
           this.fromSubmitBtn = fromSubmitBtn;
    }


    /**
     * Gets the chatURL value for this SetBanner.
     * 
     * @return chatURL
     */
    public java.lang.String getChatURL() {
        return chatURL;
    }


    /**
     * Sets the chatURL value for this SetBanner.
     * 
     * @param chatURL
     */
    public void setChatURL(java.lang.String chatURL) {
        this.chatURL = chatURL;
    }


    /**
     * Gets the bannerContent value for this SetBanner.
     * 
     * @return bannerContent
     */
    public java.lang.String getBannerContent() {
        return bannerContent;
    }


    /**
     * Sets the bannerContent value for this SetBanner.
     * 
     * @param bannerContent
     */
    public void setBannerContent(java.lang.String bannerContent) {
        this.bannerContent = bannerContent;
    }


    /**
     * Gets the bannerColor value for this SetBanner.
     * 
     * @return bannerColor
     */
    public java.lang.String getBannerColor() {
        return bannerColor;
    }


    /**
     * Sets the bannerColor value for this SetBanner.
     * 
     * @param bannerColor
     */
    public void setBannerColor(java.lang.String bannerColor) {
        this.bannerColor = bannerColor;
    }


    /**
     * Gets the bannerSize value for this SetBanner.
     * 
     * @return bannerSize
     */
    public java.lang.String getBannerSize() {
        return bannerSize;
    }


    /**
     * Sets the bannerSize value for this SetBanner.
     * 
     * @param bannerSize
     */
    public void setBannerSize(java.lang.String bannerSize) {
        this.bannerSize = bannerSize;
    }


    /**
     * Gets the bannerScroll value for this SetBanner.
     * 
     * @return bannerScroll
     */
    public java.lang.String getBannerScroll() {
        return bannerScroll;
    }


    /**
     * Sets the bannerScroll value for this SetBanner.
     * 
     * @param bannerScroll
     */
    public void setBannerScroll(java.lang.String bannerScroll) {
        this.bannerScroll = bannerScroll;
    }


    /**
     * Gets the bannerAction value for this SetBanner.
     * 
     * @return bannerAction
     */
    public java.lang.Integer getBannerAction() {
        return bannerAction;
    }


    /**
     * Sets the bannerAction value for this SetBanner.
     * 
     * @param bannerAction
     */
    public void setBannerAction(java.lang.Integer bannerAction) {
        this.bannerAction = bannerAction;
    }


    /**
     * Gets the enableChatURL value for this SetBanner.
     * 
     * @return enableChatURL
     */
    public java.lang.Boolean getEnableChatURL() {
        return enableChatURL;
    }


    /**
     * Sets the enableChatURL value for this SetBanner.
     * 
     * @param enableChatURL
     */
    public void setEnableChatURL(java.lang.Boolean enableChatURL) {
        this.enableChatURL = enableChatURL;
    }


    /**
     * Gets the fromSubmitBtn value for this SetBanner.
     * 
     * @return fromSubmitBtn
     */
    public java.lang.Boolean getFromSubmitBtn() {
        return fromSubmitBtn;
    }


    /**
     * Sets the fromSubmitBtn value for this SetBanner.
     * 
     * @param fromSubmitBtn
     */
    public void setFromSubmitBtn(java.lang.Boolean fromSubmitBtn) {
        this.fromSubmitBtn = fromSubmitBtn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetBanner)) return false;
        SetBanner other = (SetBanner) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chatURL==null && other.getChatURL()==null) || 
             (this.chatURL!=null &&
              this.chatURL.equals(other.getChatURL()))) &&
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
            ((this.bannerAction==null && other.getBannerAction()==null) || 
             (this.bannerAction!=null &&
              this.bannerAction.equals(other.getBannerAction()))) &&
            ((this.enableChatURL==null && other.getEnableChatURL()==null) || 
             (this.enableChatURL!=null &&
              this.enableChatURL.equals(other.getEnableChatURL()))) &&
            ((this.fromSubmitBtn==null && other.getFromSubmitBtn()==null) || 
             (this.fromSubmitBtn!=null &&
              this.fromSubmitBtn.equals(other.getFromSubmitBtn())));
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
        if (getChatURL() != null) {
            _hashCode += getChatURL().hashCode();
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
        if (getBannerAction() != null) {
            _hashCode += getBannerAction().hashCode();
        }
        if (getEnableChatURL() != null) {
            _hashCode += getEnableChatURL().hashCode();
        }
        if (getFromSubmitBtn() != null) {
            _hashCode += getFromSubmitBtn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetBanner.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SetBanner"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ChatURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("bannerAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableChatURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "EnableChatURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromSubmitBtn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "FromSubmitBtn"));
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
