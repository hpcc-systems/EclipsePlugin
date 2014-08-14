/**
 * DFUJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wssmc;

public class DFUJob  implements java.io.Serializable {
    private java.lang.String timeStarted;

    private java.lang.Integer done;

    private java.lang.Integer total;

    private java.lang.String command;

    public DFUJob() {
    }

    public DFUJob(
           java.lang.String timeStarted,
           java.lang.Integer done,
           java.lang.Integer total,
           java.lang.String command) {
           this.timeStarted = timeStarted;
           this.done = done;
           this.total = total;
           this.command = command;
    }


    /**
     * Gets the timeStarted value for this DFUJob.
     * 
     * @return timeStarted
     */
    public java.lang.String getTimeStarted() {
        return timeStarted;
    }


    /**
     * Sets the timeStarted value for this DFUJob.
     * 
     * @param timeStarted
     */
    public void setTimeStarted(java.lang.String timeStarted) {
        this.timeStarted = timeStarted;
    }


    /**
     * Gets the done value for this DFUJob.
     * 
     * @return done
     */
    public java.lang.Integer getDone() {
        return done;
    }


    /**
     * Sets the done value for this DFUJob.
     * 
     * @param done
     */
    public void setDone(java.lang.Integer done) {
        this.done = done;
    }


    /**
     * Gets the total value for this DFUJob.
     * 
     * @return total
     */
    public java.lang.Integer getTotal() {
        return total;
    }


    /**
     * Sets the total value for this DFUJob.
     * 
     * @param total
     */
    public void setTotal(java.lang.Integer total) {
        this.total = total;
    }


    /**
     * Gets the command value for this DFUJob.
     * 
     * @return command
     */
    public java.lang.String getCommand() {
        return command;
    }


    /**
     * Sets the command value for this DFUJob.
     * 
     * @param command
     */
    public void setCommand(java.lang.String command) {
        this.command = command;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUJob)) return false;
        DFUJob other = (DFUJob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeStarted==null && other.getTimeStarted()==null) || 
             (this.timeStarted!=null &&
              this.timeStarted.equals(other.getTimeStarted()))) &&
            ((this.done==null && other.getDone()==null) || 
             (this.done!=null &&
              this.done.equals(other.getDone()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.command==null && other.getCommand()==null) || 
             (this.command!=null &&
              this.command.equals(other.getCommand())));
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
        if (getTimeStarted() != null) {
            _hashCode += getTimeStarted().hashCode();
        }
        if (getDone() != null) {
            _hashCode += getDone().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getCommand() != null) {
            _hashCode += getCommand().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TimeStarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("done");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Done"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("command");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Command"));
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
