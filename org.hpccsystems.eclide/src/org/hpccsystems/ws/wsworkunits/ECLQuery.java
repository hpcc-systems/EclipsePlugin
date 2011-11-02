/**
 * ECLQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wsworkunits;

public class ECLQuery  implements java.io.Serializable {
    private java.lang.String text;

    private java.lang.String cpp;

    private java.lang.String resTxt;

    private java.lang.String dll;

    private java.lang.String thorLog;

    public ECLQuery() {
    }

    public ECLQuery(
           java.lang.String text,
           java.lang.String cpp,
           java.lang.String resTxt,
           java.lang.String dll,
           java.lang.String thorLog) {
           this.text = text;
           this.cpp = cpp;
           this.resTxt = resTxt;
           this.dll = dll;
           this.thorLog = thorLog;
    }


    /**
     * Gets the text value for this ECLQuery.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this ECLQuery.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the cpp value for this ECLQuery.
     * 
     * @return cpp
     */
    public java.lang.String getCpp() {
        return cpp;
    }


    /**
     * Sets the cpp value for this ECLQuery.
     * 
     * @param cpp
     */
    public void setCpp(java.lang.String cpp) {
        this.cpp = cpp;
    }


    /**
     * Gets the resTxt value for this ECLQuery.
     * 
     * @return resTxt
     */
    public java.lang.String getResTxt() {
        return resTxt;
    }


    /**
     * Sets the resTxt value for this ECLQuery.
     * 
     * @param resTxt
     */
    public void setResTxt(java.lang.String resTxt) {
        this.resTxt = resTxt;
    }


    /**
     * Gets the dll value for this ECLQuery.
     * 
     * @return dll
     */
    public java.lang.String getDll() {
        return dll;
    }


    /**
     * Sets the dll value for this ECLQuery.
     * 
     * @param dll
     */
    public void setDll(java.lang.String dll) {
        this.dll = dll;
    }


    /**
     * Gets the thorLog value for this ECLQuery.
     * 
     * @return thorLog
     */
    public java.lang.String getThorLog() {
        return thorLog;
    }


    /**
     * Sets the thorLog value for this ECLQuery.
     * 
     * @param thorLog
     */
    public void setThorLog(java.lang.String thorLog) {
        this.thorLog = thorLog;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ECLQuery)) return false;
        ECLQuery other = (ECLQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.cpp==null && other.getCpp()==null) || 
             (this.cpp!=null &&
              this.cpp.equals(other.getCpp()))) &&
            ((this.resTxt==null && other.getResTxt()==null) || 
             (this.resTxt!=null &&
              this.resTxt.equals(other.getResTxt()))) &&
            ((this.dll==null && other.getDll()==null) || 
             (this.dll!=null &&
              this.dll.equals(other.getDll()))) &&
            ((this.thorLog==null && other.getThorLog()==null) || 
             (this.thorLog!=null &&
              this.thorLog.equals(other.getThorLog())));
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
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getCpp() != null) {
            _hashCode += getCpp().hashCode();
        }
        if (getResTxt() != null) {
            _hashCode += getResTxt().hashCode();
        }
        if (getDll() != null) {
            _hashCode += getDll().hashCode();
        }
        if (getThorLog() != null) {
            _hashCode += getThorLog().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ECLQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cpp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resTxt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResTxt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Dll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thorLog");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorLog"));
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
