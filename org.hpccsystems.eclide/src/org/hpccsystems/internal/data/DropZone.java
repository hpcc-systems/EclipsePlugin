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
import java.util.Collection;
import java.util.HashSet;

import org.hpccsystems.ws.filespray.FileListRequest;
import org.hpccsystems.ws.filespray.FileListResponse;
import org.hpccsystems.ws.filespray.FileSprayServiceSoap;
import org.hpccsystems.ws.filespray.PhysicalFileStruct;
import org.hpccsystems.ws.wstopology.TpDropZone;
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
	private Collection<LogicalFile> files;
	
	DropZone(Platform platform, String name) {
		this.platform = platform;
		this.info = new TpDropZone();
		this.info.setName(name);
		this.files = new HashSet<LogicalFile>(); 		
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
	
	//  Files  ---
	synchronized LogicalFile getFile(String name) {
		return LogicalFile.get(platform, name);
	}

	LogicalFile getFile(PhysicalFileStruct fileStruct) {
		LogicalFile file = getFile(fileStruct.getName());
		file.Update(fileStruct);
		return file;
	}

	public LogicalFile[] getFiles() {
		fullRefresh();
		return files.toArray(new LogicalFile[0]);
	}

	@Override
	boolean isComplete() {
		return true;
	}

	@Override
	void fastRefresh() {
		fullRefresh();
	}

	@Override
	void fullRefresh() {
		FileSprayServiceSoap service = platform.getFileSprayService();
		if (service != null) {
			FileListRequest request = new FileListRequest();
			request.setNetaddr(getIP());
			request.setOS(getOS());
			request.setPath(getDirectory());
			try {
				FileListResponse response = service.fileList(request);
				update(response.getFiles());
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void update(TpDropZone dz) {
		if (info.getName().equals(dz.getName())) {
			info = dz;
			setChanged();
		}
	}

	synchronized boolean update(PhysicalFileStruct[] rawFileStructs) {
		if (rawFileStructs != null) {
			files.clear();
			for(PhysicalFileStruct file : rawFileStructs) {
				files.add(getFile(file));	//  Will mark changed if needed  ---
			}
		}
		return false;
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
