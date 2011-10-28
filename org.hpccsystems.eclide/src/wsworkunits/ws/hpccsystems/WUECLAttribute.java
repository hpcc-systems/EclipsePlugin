/**
 * WUECLAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wsworkunits.ws.hpccsystems;

public class WUECLAttribute  implements java.io.Serializable {
    private java.lang.String moduleName;

    private java.lang.String attributeName;

    private java.lang.Boolean isLocked;

    private java.lang.Boolean isCheckedOut;

    private java.lang.Boolean isSandbox;

    private java.lang.Boolean isOrphaned;

    public WUECLAttribute() {
    }

    public WUECLAttribute(
           java.lang.String moduleName,
           java.lang.String attributeName,
           java.lang.Boolean isLocked,
           java.lang.Boolean isCheckedOut,
           java.lang.Boolean isSandbox,
           java.lang.Boolean isOrphaned) {
           this.moduleName = moduleName;
           this.attributeName = attributeName;
           this.isLocked = isLocked;
           this.isCheckedOut = isCheckedOut;
           this.isSandbox = isSandbox;
           this.isOrphaned = isOrphaned;
    }


    /**
     * Gets the moduleName value for this WUECLAttribute.
     * 
     * @return moduleName
     */
    public java.lang.String getModuleName() {
        return moduleName;
    }


    /**
     * Sets the moduleName value for this WUECLAttribute.
     * 
     * @param moduleName
     */
    public void setModuleName(java.lang.String moduleName) {
        this.moduleName = moduleName;
    }


    /**
     * Gets the attributeName value for this WUECLAttribute.
     * 
     * @return attributeName
     */
    public java.lang.String getAttributeName() {
        return attributeName;
    }


    /**
     * Sets the attributeName value for this WUECLAttribute.
     * 
     * @param attributeName
     */
    public void setAttributeName(java.lang.String attributeName) {
        this.attributeName = attributeName;
    }


    /**
     * Gets the isLocked value for this WUECLAttribute.
     * 
     * @return isLocked
     */
    public java.lang.Boolean getIsLocked() {
        return isLocked;
    }


    /**
     * Sets the isLocked value for this WUECLAttribute.
     * 
     * @param isLocked
     */
    public void setIsLocked(java.lang.Boolean isLocked) {
        this.isLocked = isLocked;
    }


    /**
     * Gets the isCheckedOut value for this WUECLAttribute.
     * 
     * @return isCheckedOut
     */
    public java.lang.Boolean getIsCheckedOut() {
        return isCheckedOut;
    }


    /**
     * Sets the isCheckedOut value for this WUECLAttribute.
     * 
     * @param isCheckedOut
     */
    public void setIsCheckedOut(java.lang.Boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }


    /**
     * Gets the isSandbox value for this WUECLAttribute.
     * 
     * @return isSandbox
     */
    public java.lang.Boolean getIsSandbox() {
        return isSandbox;
    }


    /**
     * Sets the isSandbox value for this WUECLAttribute.
     * 
     * @param isSandbox
     */
    public void setIsSandbox(java.lang.Boolean isSandbox) {
        this.isSandbox = isSandbox;
    }


    /**
     * Gets the isOrphaned value for this WUECLAttribute.
     * 
     * @return isOrphaned
     */
    public java.lang.Boolean getIsOrphaned() {
        return isOrphaned;
    }


    /**
     * Sets the isOrphaned value for this WUECLAttribute.
     * 
     * @param isOrphaned
     */
    public void setIsOrphaned(java.lang.Boolean isOrphaned) {
        this.isOrphaned = isOrphaned;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUECLAttribute)) return false;
        WUECLAttribute other = (WUECLAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moduleName==null && other.getModuleName()==null) || 
             (this.moduleName!=null &&
              this.moduleName.equals(other.getModuleName()))) &&
            ((this.attributeName==null && other.getAttributeName()==null) || 
             (this.attributeName!=null &&
              this.attributeName.equals(other.getAttributeName()))) &&
            ((this.isLocked==null && other.getIsLocked()==null) || 
             (this.isLocked!=null &&
              this.isLocked.equals(other.getIsLocked()))) &&
            ((this.isCheckedOut==null && other.getIsCheckedOut()==null) || 
             (this.isCheckedOut!=null &&
              this.isCheckedOut.equals(other.getIsCheckedOut()))) &&
            ((this.isSandbox==null && other.getIsSandbox()==null) || 
             (this.isSandbox!=null &&
              this.isSandbox.equals(other.getIsSandbox()))) &&
            ((this.isOrphaned==null && other.getIsOrphaned()==null) || 
             (this.isOrphaned!=null &&
              this.isOrphaned.equals(other.getIsOrphaned())));
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
        if (getModuleName() != null) {
            _hashCode += getModuleName().hashCode();
        }
        if (getAttributeName() != null) {
            _hashCode += getAttributeName().hashCode();
        }
        if (getIsLocked() != null) {
            _hashCode += getIsLocked().hashCode();
        }
        if (getIsCheckedOut() != null) {
            _hashCode += getIsCheckedOut().hashCode();
        }
        if (getIsSandbox() != null) {
            _hashCode += getIsSandbox().hashCode();
        }
        if (getIsOrphaned() != null) {
            _hashCode += getIsOrphaned().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUECLAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUECLAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ModuleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AttributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCheckedOut");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsCheckedOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSandbox");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsSandbox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOrphaned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsOrphaned"));
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
