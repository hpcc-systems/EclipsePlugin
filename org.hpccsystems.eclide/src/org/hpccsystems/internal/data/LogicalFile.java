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

import org.hpccsystems.ws.filespray.PhysicalFileStruct;
import org.hpccsystems.ws.wsdfu.DFUFileDetail;
import org.hpccsystems.ws.wsdfu.DFUInfoRequest;
import org.hpccsystems.ws.wsdfu.DFUInfoResponse;
import org.hpccsystems.ws.wsdfu.DFULogicalFile;
import org.hpccsystems.ws.wsdfu.WsDfuServiceSoap;
import org.hpccsystems.ws.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.wsworkunits.ECLSourceFile;

public class LogicalFile extends DataSingleton {
	private static Map<Integer, LogicalFile> LogicalFiles = new HashMap<Integer, LogicalFile>();
	public static synchronized LogicalFile get(Platform platform, String name) {
		LogicalFile logicalFile = new LogicalFile(platform, name);
		if (LogicalFiles.containsKey(logicalFile.hashCode())) {
			return LogicalFiles.get(logicalFile.hashCode());
		}
		else {
			LogicalFiles.put(logicalFile.hashCode(), logicalFile);
		}
		return logicalFile;
	}

	private Platform platform;
	private DFULogicalFile info;
	private DFUFileDetail info2;
	private ECLSourceFile info3;
	private PhysicalFileStruct info4;
	public enum Notification {
		LOGICALFILE
	}

	private LogicalFile(Platform platform, String name) {
		this.platform = platform;
		info = new DFULogicalFile();
		info.setName(name);
		info2 = new DFUFileDetail();
		info2.setName(name);
		info3 = new ECLSourceFile();
		info3.setName(name);
		info4 = new PhysicalFileStruct();
		info4.setName(name);
	}

	public String getName() {
		return info.getName();
	}

	public Workunit getWorkunit() {
		if (info2.getWuid() == null) {
			fullRefresh();
		}
		if (info2.getWuid() == null || !info2.getWuid().startsWith("W")) {
			return null;
		}
		return platform.getWorkunit(info2.getWuid());
	}

	public FileSprayWorkunit getFileSprayWorkunit() {
		if (info2.getWuid() == null) {
			fullRefresh();
		}
		if (info2.getWuid() == null || !info2.getWuid().startsWith("D")) {
			return null;
		}
		return platform.getFileSprayWorkunit(info2.getWuid());
	}

	public String getDir() {
		if (info2.getDir() == null) {
			fullRefresh();
		}
		return info2.getDir();
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
		WsDfuServiceSoap service = platform.getWsDfuService();
		if (service != null) {
			DFUInfoRequest request = new DFUInfoRequest();
			request.setName(info.getName());
			try {
				DFUInfoResponse respsone = service.DFUInfo(request);
				Update(respsone.getFileDetail());		
			} catch (ArrayOfEspException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyObservers(Notification.LOGICALFILE);
	}

	//  Updates  ---
	void Update(DFULogicalFile lf) {
		if (info.getName().equals(lf.getName())) {
			info = lf;
		}
	}

	void Update(DFUFileDetail fd) {
		if (fd != null && info2.getName().equals(fd.getName())) {
			info2 = fd;
		}
	}

	void Update(ECLSourceFile sf) {
		if (info3.getName().equals(sf.getName())) {
			info3 = sf;
		}
	}

	public void Update(PhysicalFileStruct fileStruct) {
		if (info4.getName().equals(fileStruct.getName())) {
			info4 = fileStruct;
		}
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( this == aThat ) {
			return true;
		}

		if ( !(aThat instanceof LogicalFile) ) {
			return false;
		}
		LogicalFile that = (LogicalFile)aThat;

		//now a proper field-by-field evaluation can be made
		return EqualsUtil.areEqual(this.platform, that.platform) &&
				EqualsUtil.areEqual(this.info.getName(), that.info.getName());
	}

	@Override
	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, platform);
		result = HashCodeUtil.hash(result, info.getName());
		return result;
	}
}
