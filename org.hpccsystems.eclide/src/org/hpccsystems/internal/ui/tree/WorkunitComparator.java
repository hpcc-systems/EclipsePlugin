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
package org.hpccsystems.internal.ui.tree;

import java.util.Comparator;

public class WorkunitComparator implements Comparator<ItemView> {

	@Override
	public int compare(ItemView left, ItemView right) {
		String l = left.getText();
		String r = right.getText();

		//  Ignore "W" and "D" and maybe "L"  ---
		l = l.substring(1);
		r = r.substring(1);
		return r.compareTo(l);
	}
}
