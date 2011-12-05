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
package org.hpccsystems.internal.data;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.filespray.FileListRequest;
import org.hpccsystems.ws.filespray.FileListResponse;
import org.hpccsystems.ws.filespray.FileSprayServiceSoap;
import org.hpccsystems.ws.filespray.PhysicalFileStruct;
import org.hpccsystems.ws.wstopology.TpClusterInfoRequest;
import org.hpccsystems.ws.wstopology.TpClusterInfoResponse;
import org.hpccsystems.ws.wstopology.TpDropZone;
import org.hpccsystems.ws.wstopology.TpServiceQueryRequest;
import org.hpccsystems.ws.wstopology.TpServiceQueryResponse;
import org.hpccsystems.ws.wstopology.TpServices;
import org.hpccsystems.ws.wstopology.TpTargetCluster;
import org.hpccsystems.ws.wstopology.WsTopologyServiceSoap;
import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;

public class DropZone extends DataSingleton  {
	public static DataSingletonCollection All = new DataSingletonCollection();	
	public static DropZone get(Platform platform, String name) {
		if (name == null || name.isEmpty())
			return null;
		
		return (DropZone)All.get(new DropZone(platform, name));
	}

	private Platform platform;
	private TpDropZone info;
	
	DropZone(Platform platform, String name) {
		this.platform = platform;
		info = new TpDropZone();
		info.setName(name);
	}
	
	public String getName() {
		return info.getName();
	}

	public String getIP() {
		//  TODO - Check if more than one folder per drop zone  ---
		if (info.getTpMachines() != null && info.getTpMachines().length > 0) {
			return info.getTpMachines()[0].getNetaddress();
		}
		return "";
	}

	public String getOS() {
		//  TODO - Check if more than one folder per drop zone  ---
		if (info.getTpMachines() != null && info.getTpMachines().length > 0) {
			return info.getTpMachines()[0].getOS().toString();
		}
		return "";
	}

	public String getDirectory() {
		//  TODO - Check if more than one folder per drop zone  ---
		if (info.getTpMachines() != null && info.getTpMachines().length > 0) {
			return info.getTpMachines()[0].getDirectory();
		}
		return null;
	}

	
	//  Drop Zones  ---
//	public DropZone getFile(String name) {
//		return DropZone.get(this, name);
//	}
//
//	public DropZone getDropZone(TpDropZone dz) {
//		DropZone dropZone = getDropZone(dz.getName());
//		dropZone.update(dz);
//		return dropZone;
//	}
//
	public Object[] getFiles() {
		if (platform.isEnabled()) {
			//TODO CollectionDelta monitor = new CollectionDelta("getClusters", clusters);
			FileSprayServiceSoap service = platform.getFileSprayService();
			FileListRequest request = new FileListRequest();
			request.setNetaddr(getIP());
			request.setOS(getOS());
			request.setPath(getDirectory());
			try {
				FileListResponse response = service.fileList(request);
				updatePhysicalFileStruct(response.getFiles());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//TODO notifyObservers(monitor.calcChanges(clusters));
		}
		return null;//dropZones.toArray(new DropZone[0]);
	}

	private void updatePhysicalFileStruct(PhysicalFileStruct[] files) {
		if (files != null) {
			for(PhysicalFileStruct f : files) {
				//dropZones.add(getDropZone(dz));
			}
		}
	}
	
	@Override
	boolean isComplete() {
		return true;
	}

	@Override
	void fastRefresh() {
	}

	@Override
	void fullRefresh() {
	}
	
	void update(TpDropZone dz) {
		if (info.getName().equals(dz.getName())) {
			info = dz;
			setChanged();
		}
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( (Object)this == aThat ) 
			return true;

		if ( !(aThat instanceof DropZone) ) 
			return false;
		DropZone that = (DropZone)aThat;

		//now a proper field-by-field evaluation can be made
		return EqualsUtil.areEqual(this.platform, that.platform) &&
				EqualsUtil.areEqual(this.info.getName(), that.info.getName());
	}

	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, platform);
		result = HashCodeUtil.hash(result, info.getName());
		return result;
	}
}
