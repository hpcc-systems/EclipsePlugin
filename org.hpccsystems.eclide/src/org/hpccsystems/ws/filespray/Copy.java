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
 * Copy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.filespray;

public class Copy  implements java.io.Serializable {
    private java.lang.String sourceLogicalName;

    private java.lang.String destGroup;

    private java.lang.String destGroupRoxie;

    private java.lang.String destLogicalName;

    private java.lang.String sourceDali;

    private java.lang.String srcusername;

    private java.lang.String srcpassword;

    private java.lang.Boolean overwrite;

    private java.lang.Boolean replicate;

    private java.lang.Integer replicateOffset;

    private java.lang.Integer maxConnections;

    private java.lang.Integer throttle;

    private java.lang.Integer transferBufferSize;

    private java.lang.Boolean nosplit;

    private java.lang.Boolean norecover;

    private java.lang.Boolean compress;

    private java.lang.Boolean wrap;

    private java.lang.Boolean multicopy;

    private java.lang.String sourceDiffKeyName;

    private java.lang.String destDiffKeyName;

    private java.lang.Boolean superCopy;

    private java.lang.Boolean push;

    private java.lang.Boolean pull;

    private java.lang.Boolean ifnewer;

    private java.lang.String encrypt;

    private java.lang.String decrypt;

    public Copy() {
    }

    public Copy(
           java.lang.String sourceLogicalName,
           java.lang.String destGroup,
           java.lang.String destGroupRoxie,
           java.lang.String destLogicalName,
           java.lang.String sourceDali,
           java.lang.String srcusername,
           java.lang.String srcpassword,
           java.lang.Boolean overwrite,
           java.lang.Boolean replicate,
           java.lang.Integer replicateOffset,
           java.lang.Integer maxConnections,
           java.lang.Integer throttle,
           java.lang.Integer transferBufferSize,
           java.lang.Boolean nosplit,
           java.lang.Boolean norecover,
           java.lang.Boolean compress,
           java.lang.Boolean wrap,
           java.lang.Boolean multicopy,
           java.lang.String sourceDiffKeyName,
           java.lang.String destDiffKeyName,
           java.lang.Boolean superCopy,
           java.lang.Boolean push,
           java.lang.Boolean pull,
           java.lang.Boolean ifnewer,
           java.lang.String encrypt,
           java.lang.String decrypt) {
           this.sourceLogicalName = sourceLogicalName;
           this.destGroup = destGroup;
           this.destGroupRoxie = destGroupRoxie;
           this.destLogicalName = destLogicalName;
           this.sourceDali = sourceDali;
           this.srcusername = srcusername;
           this.srcpassword = srcpassword;
           this.overwrite = overwrite;
           this.replicate = replicate;
           this.replicateOffset = replicateOffset;
           this.maxConnections = maxConnections;
           this.throttle = throttle;
           this.transferBufferSize = transferBufferSize;
           this.nosplit = nosplit;
           this.norecover = norecover;
           this.compress = compress;
           this.wrap = wrap;
           this.multicopy = multicopy;
           this.sourceDiffKeyName = sourceDiffKeyName;
           this.destDiffKeyName = destDiffKeyName;
           this.superCopy = superCopy;
           this.push = push;
           this.pull = pull;
           this.ifnewer = ifnewer;
           this.encrypt = encrypt;
           this.decrypt = decrypt;
    }


    /**
     * Gets the sourceLogicalName value for this Copy.
     * 
     * @return sourceLogicalName
     */
    public java.lang.String getSourceLogicalName() {
        return sourceLogicalName;
    }


    /**
     * Sets the sourceLogicalName value for this Copy.
     * 
     * @param sourceLogicalName
     */
    public void setSourceLogicalName(java.lang.String sourceLogicalName) {
        this.sourceLogicalName = sourceLogicalName;
    }


    /**
     * Gets the destGroup value for this Copy.
     * 
     * @return destGroup
     */
    public java.lang.String getDestGroup() {
        return destGroup;
    }


    /**
     * Sets the destGroup value for this Copy.
     * 
     * @param destGroup
     */
    public void setDestGroup(java.lang.String destGroup) {
        this.destGroup = destGroup;
    }


    /**
     * Gets the destGroupRoxie value for this Copy.
     * 
     * @return destGroupRoxie
     */
    public java.lang.String getDestGroupRoxie() {
        return destGroupRoxie;
    }


    /**
     * Sets the destGroupRoxie value for this Copy.
     * 
     * @param destGroupRoxie
     */
    public void setDestGroupRoxie(java.lang.String destGroupRoxie) {
        this.destGroupRoxie = destGroupRoxie;
    }


    /**
     * Gets the destLogicalName value for this Copy.
     * 
     * @return destLogicalName
     */
    public java.lang.String getDestLogicalName() {
        return destLogicalName;
    }


    /**
     * Sets the destLogicalName value for this Copy.
     * 
     * @param destLogicalName
     */
    public void setDestLogicalName(java.lang.String destLogicalName) {
        this.destLogicalName = destLogicalName;
    }


    /**
     * Gets the sourceDali value for this Copy.
     * 
     * @return sourceDali
     */
    public java.lang.String getSourceDali() {
        return sourceDali;
    }


    /**
     * Sets the sourceDali value for this Copy.
     * 
     * @param sourceDali
     */
    public void setSourceDali(java.lang.String sourceDali) {
        this.sourceDali = sourceDali;
    }


    /**
     * Gets the srcusername value for this Copy.
     * 
     * @return srcusername
     */
    public java.lang.String getSrcusername() {
        return srcusername;
    }


    /**
     * Sets the srcusername value for this Copy.
     * 
     * @param srcusername
     */
    public void setSrcusername(java.lang.String srcusername) {
        this.srcusername = srcusername;
    }


    /**
     * Gets the srcpassword value for this Copy.
     * 
     * @return srcpassword
     */
    public java.lang.String getSrcpassword() {
        return srcpassword;
    }


    /**
     * Sets the srcpassword value for this Copy.
     * 
     * @param srcpassword
     */
    public void setSrcpassword(java.lang.String srcpassword) {
        this.srcpassword = srcpassword;
    }


    /**
     * Gets the overwrite value for this Copy.
     * 
     * @return overwrite
     */
    public java.lang.Boolean getOverwrite() {
        return overwrite;
    }


    /**
     * Sets the overwrite value for this Copy.
     * 
     * @param overwrite
     */
    public void setOverwrite(java.lang.Boolean overwrite) {
        this.overwrite = overwrite;
    }


    /**
     * Gets the replicate value for this Copy.
     * 
     * @return replicate
     */
    public java.lang.Boolean getReplicate() {
        return replicate;
    }


    /**
     * Sets the replicate value for this Copy.
     * 
     * @param replicate
     */
    public void setReplicate(java.lang.Boolean replicate) {
        this.replicate = replicate;
    }


    /**
     * Gets the replicateOffset value for this Copy.
     * 
     * @return replicateOffset
     */
    public java.lang.Integer getReplicateOffset() {
        return replicateOffset;
    }


    /**
     * Sets the replicateOffset value for this Copy.
     * 
     * @param replicateOffset
     */
    public void setReplicateOffset(java.lang.Integer replicateOffset) {
        this.replicateOffset = replicateOffset;
    }


    /**
     * Gets the maxConnections value for this Copy.
     * 
     * @return maxConnections
     */
    public java.lang.Integer getMaxConnections() {
        return maxConnections;
    }


    /**
     * Sets the maxConnections value for this Copy.
     * 
     * @param maxConnections
     */
    public void setMaxConnections(java.lang.Integer maxConnections) {
        this.maxConnections = maxConnections;
    }


    /**
     * Gets the throttle value for this Copy.
     * 
     * @return throttle
     */
    public java.lang.Integer getThrottle() {
        return throttle;
    }


    /**
     * Sets the throttle value for this Copy.
     * 
     * @param throttle
     */
    public void setThrottle(java.lang.Integer throttle) {
        this.throttle = throttle;
    }


    /**
     * Gets the transferBufferSize value for this Copy.
     * 
     * @return transferBufferSize
     */
    public java.lang.Integer getTransferBufferSize() {
        return transferBufferSize;
    }


    /**
     * Sets the transferBufferSize value for this Copy.
     * 
     * @param transferBufferSize
     */
    public void setTransferBufferSize(java.lang.Integer transferBufferSize) {
        this.transferBufferSize = transferBufferSize;
    }


    /**
     * Gets the nosplit value for this Copy.
     * 
     * @return nosplit
     */
    public java.lang.Boolean getNosplit() {
        return nosplit;
    }


    /**
     * Sets the nosplit value for this Copy.
     * 
     * @param nosplit
     */
    public void setNosplit(java.lang.Boolean nosplit) {
        this.nosplit = nosplit;
    }


    /**
     * Gets the norecover value for this Copy.
     * 
     * @return norecover
     */
    public java.lang.Boolean getNorecover() {
        return norecover;
    }


    /**
     * Sets the norecover value for this Copy.
     * 
     * @param norecover
     */
    public void setNorecover(java.lang.Boolean norecover) {
        this.norecover = norecover;
    }


    /**
     * Gets the compress value for this Copy.
     * 
     * @return compress
     */
    public java.lang.Boolean getCompress() {
        return compress;
    }


    /**
     * Sets the compress value for this Copy.
     * 
     * @param compress
     */
    public void setCompress(java.lang.Boolean compress) {
        this.compress = compress;
    }


    /**
     * Gets the wrap value for this Copy.
     * 
     * @return wrap
     */
    public java.lang.Boolean getWrap() {
        return wrap;
    }


    /**
     * Sets the wrap value for this Copy.
     * 
     * @param wrap
     */
    public void setWrap(java.lang.Boolean wrap) {
        this.wrap = wrap;
    }


    /**
     * Gets the multicopy value for this Copy.
     * 
     * @return multicopy
     */
    public java.lang.Boolean getMulticopy() {
        return multicopy;
    }


    /**
     * Sets the multicopy value for this Copy.
     * 
     * @param multicopy
     */
    public void setMulticopy(java.lang.Boolean multicopy) {
        this.multicopy = multicopy;
    }


    /**
     * Gets the sourceDiffKeyName value for this Copy.
     * 
     * @return sourceDiffKeyName
     */
    public java.lang.String getSourceDiffKeyName() {
        return sourceDiffKeyName;
    }


    /**
     * Sets the sourceDiffKeyName value for this Copy.
     * 
     * @param sourceDiffKeyName
     */
    public void setSourceDiffKeyName(java.lang.String sourceDiffKeyName) {
        this.sourceDiffKeyName = sourceDiffKeyName;
    }


    /**
     * Gets the destDiffKeyName value for this Copy.
     * 
     * @return destDiffKeyName
     */
    public java.lang.String getDestDiffKeyName() {
        return destDiffKeyName;
    }


    /**
     * Sets the destDiffKeyName value for this Copy.
     * 
     * @param destDiffKeyName
     */
    public void setDestDiffKeyName(java.lang.String destDiffKeyName) {
        this.destDiffKeyName = destDiffKeyName;
    }


    /**
     * Gets the superCopy value for this Copy.
     * 
     * @return superCopy
     */
    public java.lang.Boolean getSuperCopy() {
        return superCopy;
    }


    /**
     * Sets the superCopy value for this Copy.
     * 
     * @param superCopy
     */
    public void setSuperCopy(java.lang.Boolean superCopy) {
        this.superCopy = superCopy;
    }


    /**
     * Gets the push value for this Copy.
     * 
     * @return push
     */
    public java.lang.Boolean getPush() {
        return push;
    }


    /**
     * Sets the push value for this Copy.
     * 
     * @param push
     */
    public void setPush(java.lang.Boolean push) {
        this.push = push;
    }


    /**
     * Gets the pull value for this Copy.
     * 
     * @return pull
     */
    public java.lang.Boolean getPull() {
        return pull;
    }


    /**
     * Sets the pull value for this Copy.
     * 
     * @param pull
     */
    public void setPull(java.lang.Boolean pull) {
        this.pull = pull;
    }


    /**
     * Gets the ifnewer value for this Copy.
     * 
     * @return ifnewer
     */
    public java.lang.Boolean getIfnewer() {
        return ifnewer;
    }


    /**
     * Sets the ifnewer value for this Copy.
     * 
     * @param ifnewer
     */
    public void setIfnewer(java.lang.Boolean ifnewer) {
        this.ifnewer = ifnewer;
    }


    /**
     * Gets the encrypt value for this Copy.
     * 
     * @return encrypt
     */
    public java.lang.String getEncrypt() {
        return encrypt;
    }


    /**
     * Sets the encrypt value for this Copy.
     * 
     * @param encrypt
     */
    public void setEncrypt(java.lang.String encrypt) {
        this.encrypt = encrypt;
    }


    /**
     * Gets the decrypt value for this Copy.
     * 
     * @return decrypt
     */
    public java.lang.String getDecrypt() {
        return decrypt;
    }


    /**
     * Sets the decrypt value for this Copy.
     * 
     * @param decrypt
     */
    public void setDecrypt(java.lang.String decrypt) {
        this.decrypt = decrypt;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Copy)) return false;
        Copy other = (Copy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sourceLogicalName==null && other.getSourceLogicalName()==null) || 
             (this.sourceLogicalName!=null &&
              this.sourceLogicalName.equals(other.getSourceLogicalName()))) &&
            ((this.destGroup==null && other.getDestGroup()==null) || 
             (this.destGroup!=null &&
              this.destGroup.equals(other.getDestGroup()))) &&
            ((this.destGroupRoxie==null && other.getDestGroupRoxie()==null) || 
             (this.destGroupRoxie!=null &&
              this.destGroupRoxie.equals(other.getDestGroupRoxie()))) &&
            ((this.destLogicalName==null && other.getDestLogicalName()==null) || 
             (this.destLogicalName!=null &&
              this.destLogicalName.equals(other.getDestLogicalName()))) &&
            ((this.sourceDali==null && other.getSourceDali()==null) || 
             (this.sourceDali!=null &&
              this.sourceDali.equals(other.getSourceDali()))) &&
            ((this.srcusername==null && other.getSrcusername()==null) || 
             (this.srcusername!=null &&
              this.srcusername.equals(other.getSrcusername()))) &&
            ((this.srcpassword==null && other.getSrcpassword()==null) || 
             (this.srcpassword!=null &&
              this.srcpassword.equals(other.getSrcpassword()))) &&
            ((this.overwrite==null && other.getOverwrite()==null) || 
             (this.overwrite!=null &&
              this.overwrite.equals(other.getOverwrite()))) &&
            ((this.replicate==null && other.getReplicate()==null) || 
             (this.replicate!=null &&
              this.replicate.equals(other.getReplicate()))) &&
            ((this.replicateOffset==null && other.getReplicateOffset()==null) || 
             (this.replicateOffset!=null &&
              this.replicateOffset.equals(other.getReplicateOffset()))) &&
            ((this.maxConnections==null && other.getMaxConnections()==null) || 
             (this.maxConnections!=null &&
              this.maxConnections.equals(other.getMaxConnections()))) &&
            ((this.throttle==null && other.getThrottle()==null) || 
             (this.throttle!=null &&
              this.throttle.equals(other.getThrottle()))) &&
            ((this.transferBufferSize==null && other.getTransferBufferSize()==null) || 
             (this.transferBufferSize!=null &&
              this.transferBufferSize.equals(other.getTransferBufferSize()))) &&
            ((this.nosplit==null && other.getNosplit()==null) || 
             (this.nosplit!=null &&
              this.nosplit.equals(other.getNosplit()))) &&
            ((this.norecover==null && other.getNorecover()==null) || 
             (this.norecover!=null &&
              this.norecover.equals(other.getNorecover()))) &&
            ((this.compress==null && other.getCompress()==null) || 
             (this.compress!=null &&
              this.compress.equals(other.getCompress()))) &&
            ((this.wrap==null && other.getWrap()==null) || 
             (this.wrap!=null &&
              this.wrap.equals(other.getWrap()))) &&
            ((this.multicopy==null && other.getMulticopy()==null) || 
             (this.multicopy!=null &&
              this.multicopy.equals(other.getMulticopy()))) &&
            ((this.sourceDiffKeyName==null && other.getSourceDiffKeyName()==null) || 
             (this.sourceDiffKeyName!=null &&
              this.sourceDiffKeyName.equals(other.getSourceDiffKeyName()))) &&
            ((this.destDiffKeyName==null && other.getDestDiffKeyName()==null) || 
             (this.destDiffKeyName!=null &&
              this.destDiffKeyName.equals(other.getDestDiffKeyName()))) &&
            ((this.superCopy==null && other.getSuperCopy()==null) || 
             (this.superCopy!=null &&
              this.superCopy.equals(other.getSuperCopy()))) &&
            ((this.push==null && other.getPush()==null) || 
             (this.push!=null &&
              this.push.equals(other.getPush()))) &&
            ((this.pull==null && other.getPull()==null) || 
             (this.pull!=null &&
              this.pull.equals(other.getPull()))) &&
            ((this.ifnewer==null && other.getIfnewer()==null) || 
             (this.ifnewer!=null &&
              this.ifnewer.equals(other.getIfnewer()))) &&
            ((this.encrypt==null && other.getEncrypt()==null) || 
             (this.encrypt!=null &&
              this.encrypt.equals(other.getEncrypt()))) &&
            ((this.decrypt==null && other.getDecrypt()==null) || 
             (this.decrypt!=null &&
              this.decrypt.equals(other.getDecrypt())));
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
        if (getSourceLogicalName() != null) {
            _hashCode += getSourceLogicalName().hashCode();
        }
        if (getDestGroup() != null) {
            _hashCode += getDestGroup().hashCode();
        }
        if (getDestGroupRoxie() != null) {
            _hashCode += getDestGroupRoxie().hashCode();
        }
        if (getDestLogicalName() != null) {
            _hashCode += getDestLogicalName().hashCode();
        }
        if (getSourceDali() != null) {
            _hashCode += getSourceDali().hashCode();
        }
        if (getSrcusername() != null) {
            _hashCode += getSrcusername().hashCode();
        }
        if (getSrcpassword() != null) {
            _hashCode += getSrcpassword().hashCode();
        }
        if (getOverwrite() != null) {
            _hashCode += getOverwrite().hashCode();
        }
        if (getReplicate() != null) {
            _hashCode += getReplicate().hashCode();
        }
        if (getReplicateOffset() != null) {
            _hashCode += getReplicateOffset().hashCode();
        }
        if (getMaxConnections() != null) {
            _hashCode += getMaxConnections().hashCode();
        }
        if (getThrottle() != null) {
            _hashCode += getThrottle().hashCode();
        }
        if (getTransferBufferSize() != null) {
            _hashCode += getTransferBufferSize().hashCode();
        }
        if (getNosplit() != null) {
            _hashCode += getNosplit().hashCode();
        }
        if (getNorecover() != null) {
            _hashCode += getNorecover().hashCode();
        }
        if (getCompress() != null) {
            _hashCode += getCompress().hashCode();
        }
        if (getWrap() != null) {
            _hashCode += getWrap().hashCode();
        }
        if (getMulticopy() != null) {
            _hashCode += getMulticopy().hashCode();
        }
        if (getSourceDiffKeyName() != null) {
            _hashCode += getSourceDiffKeyName().hashCode();
        }
        if (getDestDiffKeyName() != null) {
            _hashCode += getDestDiffKeyName().hashCode();
        }
        if (getSuperCopy() != null) {
            _hashCode += getSuperCopy().hashCode();
        }
        if (getPush() != null) {
            _hashCode += getPush().hashCode();
        }
        if (getPull() != null) {
            _hashCode += getPull().hashCode();
        }
        if (getIfnewer() != null) {
            _hashCode += getIfnewer().hashCode();
        }
        if (getEncrypt() != null) {
            _hashCode += getEncrypt().hashCode();
        }
        if (getDecrypt() != null) {
            _hashCode += getDecrypt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Copy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">Copy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceLogicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceLogicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destGroupRoxie");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destGroupRoxie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destLogicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destLogicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDali");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceDali"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcusername");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "srcusername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcpassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "srcpassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overwrite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "overwrite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "replicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicateOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ReplicateOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxConnections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "maxConnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throttle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "throttle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferBufferSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "transferBufferSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nosplit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "nosplit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("norecover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "norecover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "compress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wrap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Wrap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multicopy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Multicopy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDiffKeyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceDiffKeyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destDiffKeyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestDiffKeyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superCopy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "superCopy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("push");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "push"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pull");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "pull"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifnewer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ifnewer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encrypt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "encrypt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decrypt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "decrypt"));
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
