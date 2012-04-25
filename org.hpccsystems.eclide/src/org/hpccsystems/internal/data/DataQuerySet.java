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

import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.wsworkunits.QuerySet;

public class DataQuerySet extends DataSingleton {
	private static Map<Integer, DataQuerySet> QuerySets = new HashMap<Integer, DataQuerySet>();
	public static synchronized DataQuerySet get(Platform platform, String name) {
		DataQuerySet dataQuerySet = new DataQuerySet(platform, name);
		if (QuerySets.containsKey(dataQuerySet.hashCode())) {
			return QuerySets.get(dataQuerySet.hashCode());
		}
		else {
			QuerySets.put(dataQuerySet.hashCode(), dataQuerySet);
		}
		return dataQuerySet;
	}

	private Platform platform;
	private QuerySet info;
	public enum Notification {
		QUERYSET
	}

	private DataQuerySet(Platform platform, String name) {
		this.platform = platform;
		info = new QuerySet();
		info.setQuerySetName(name);
	}

	public String getName() {
		return info.getQuerySetName();
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
	}

	//  Updates  ---
	void Update(QuerySet qs) {
		if (info.getQuerySetName().equals(qs.getQuerySetName()))
			info = qs;
	}

	@Override 
	public boolean equals(Object aThat) {
		if ( this == aThat ) 
			return true;

		if ( !(aThat instanceof DataQuerySet) ) 
			return false;
		DataQuerySet that = (DataQuerySet)aThat;

		//now a proper field-by-field evaluation can be made
		return EqualsUtil.areEqual(this.platform, that.platform) &&
				EqualsUtil.areEqual(this.info.getQuerySetName(), that.info.getQuerySetName());
	}

	@Override
	public int hashCode() {
		int result = HashCodeUtil.SEED;
		result = HashCodeUtil.hash(result, platform);
		result = HashCodeUtil.hash(result, info.getQuerySetName());
		return result;
	}
}
