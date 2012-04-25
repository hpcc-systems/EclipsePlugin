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
 * WsTopology.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.wstopology;

public interface WsTopology extends javax.xml.rpc.Service {
	public java.lang.String getWsTopologyServiceSoapAddress();

	public org.hpccsystems.ws.wstopology.WsTopologyServiceSoap getWsTopologyServiceSoap() throws javax.xml.rpc.ServiceException;

	public org.hpccsystems.ws.wstopology.WsTopologyServiceSoap getWsTopologyServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
